/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.mendeley.sdkadaption;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.LinkedList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mendeley.oapi.services.MendeleyException;
import com.mendeley.oapi.services.constant.MendeleyApiUrls;
import com.mendeley.oapi.services.constant.MendeleyApiUrls.MendeleyApiUrlBuilder;
import com.mendeley.oapi.services.constant.ParameterNames;
import com.mendeley.oapi.services.impl.DocumentServiceImpl;
import com.mendeley.oapi.services.oauth.MendeleyAccessToken;
import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;

public class AdaptedDocumentServiceImpl extends DocumentServiceImpl {

	public AdaptedDocumentServiceImpl(MendeleyApiConsumer apiConsumer,
			MendeleyAccessToken accessToken) {
		super(apiConsumer, accessToken);
	}
	
	public List<AuthoredDocument> getAuthoredDocuments() {
		
		// add page and documents per page parameter
		// TODO check if items work
		String baseUrl = MendeleyApiUrls.DocumentApiUrls.GET_AUTHORED_PUBLICATIONS_URL + "?items=100000";
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(baseUrl);
        String                apiUrl  = builder.buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl)).getAsJsonObject();
        // TODO possibly paging
        // new list for all documents
        List<AuthoredDocument> documents = new LinkedList<AuthoredDocument>();
        
        JsonElement ids = json.get("document_ids");
        if(ids == null || !ids.isJsonArray())
        {
        	return documents;
        }
        
        JsonArray idArray = ids.getAsJsonArray();
        // get document details for every document
        for(int i = 0; i < idArray.size(); i++)
        {
        	String documentId = idArray.get(i).getAsString();
        	AuthoredDocument doc = null;
        	try {
        		doc = getAuthoredDocumentDetails(documentId);
        	}
        	catch (Exception e) {
				// do nothing
        		//System.out.println("Error while geting group document details: " + e.getMessage());
        		doc = null;
			}
        	if(doc != null)
        	{
        		documents.add(doc);
        	}
        }
        
		return documents;
	}

	public AuthoredDocument getAuthoredDocumentDetails(String documentId) {
		String baseUrl = MendeleyApiUrls.DocumentApiUrls.GET_DOCUMENT_DETAILS_URL;
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(baseUrl);
        String                apiUrl  = builder.withField(ParameterNames.ID, documentId).buildUrl();
        JsonElement json = unmarshall(callApiGet(apiUrl));
        
        AuthoredDocument unmarshalled = null;
        try {
        	unmarshalled = unmarshall(AuthoredDocument.class, json);
        	try {
        		// quick fix to get the abstract
            	JsonObject jsonObject = json.getAsJsonObject();
            	unmarshalled.setAbstract(jsonObject.get("abstract").getAsString());
        	}
        	catch (Exception e) {
				// nothing to do
			}
        	//System.out.println("Unmarshalled " + json);
        }
        catch (Exception e) {
			//System.out.println(e.getMessage() + " Could not unmarshall " + json);
		}
        
        return unmarshalled;
	}
	
	public String getFileUrl(FileAttachement file, String documentId)
	{
		String baseUrl = FileAccessUrls.GET_AUTHORED_FILE_URL_URL;
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(baseUrl);
        String                apiUrl  = builder.withField("document_id", documentId)
        									   .withField("file_hash", file.getFile_hash()).buildUrl();
        
        String result = callGetForRedirectUrl(apiUrl);
        
        return result;
	}

	protected String callGetForRedirectUrl(String apiUrl) {
		DefaultHttpClient httpclient = new DefaultHttpClient();
		httpclient.getParams().setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, false);
		
		try {
			HttpGet httpget = new HttpGet(apiUrl);
			if (!requestParameters.isEmpty()) {
				HttpParams params = httpget.getParams();
				for (String name : requestParameters.keySet()) {
					params.setParameter(name, requestParameters.get(name));
				}
			}

			for (String headerName : requestHeaders.keySet()) {
				httpget.addHeader(headerName, requestHeaders.get(headerName));
			}

			signRequest(httpget);
		
			HttpResponse response = httpclient.execute(httpget);

			if (!((response.getStatusLine().getStatusCode() == HttpURLConnection.HTTP_MOVED_TEMP) ||
				  (response.getStatusLine().getStatusCode() == HttpURLConnection.HTTP_MOVED_PERM) ||
				  (response.getStatusLine().getStatusCode() == HttpURLConnection.HTTP_SEE_OTHER))) {
				return null;
			}
			
			// redirect location is in location header
			Header[] locationHeader = response.getHeaders("location");
			
			if(locationHeader.length >= 1)
			{
				return locationHeader[0].getValue();
			}
		} catch (IOException e) {
			throw new MendeleyException(e);
		} finally {
			// When HttpClient instance is no longer needed,
			// shut down the connection manager to ensure
			// immediate deallocation of all system resources
			// httpclient.getConnectionManager().shutdown();
		}
		
		return null;
	}
}
