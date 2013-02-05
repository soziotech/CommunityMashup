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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.mendeley.oapi.schema.Group.MembershipType;
import com.mendeley.oapi.schema.User;
import com.mendeley.oapi.services.MendeleyException;
import com.mendeley.oapi.services.constant.MendeleyApiUrls;
import com.mendeley.oapi.services.constant.MendeleyApiUrls.MendeleyApiUrlBuilder;
import com.mendeley.oapi.services.constant.ParameterNames;
import com.mendeley.oapi.services.impl.PrivateGroupServiceImpl;
import com.mendeley.oapi.services.oauth.MendeleyAccessToken;
import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;

public class AdaptedPrivateGroupServiceImpl extends PrivateGroupServiceImpl {

	public AdaptedPrivateGroupServiceImpl(MendeleyApiConsumer apiConsumer,
			MendeleyAccessToken accessToken) {
		super(apiConsumer, accessToken);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.impl.PrivateGroupServiceImpl#getGroupPeople(java.lang.String)
	 */
	@Override
	public Map<MembershipType, List<User>> getGroupPeople(String groupId) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.PrivateGroupApiUrls.GET_GROUP_PEOPLE_URL);
        String                apiUrl  = builder.withField(ParameterNames.ID, groupId).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl)).getAsJsonObject();
        Map<MembershipType, List<User>> groupPeople = new HashMap<MembershipType, List<User>>();
        for (MembershipType type : MembershipType.values()) {
        	if (json.get(type.value()) != null) {
        		if(type == MembershipType.OWNER)
        		{
        			// there is only one owner
        			// put him in an array
        			JsonArray jsonArray = new JsonArray();
        			jsonArray.add(json.get(type.value()));
        			
        			try{
        				groupPeople.put(type, unmarshall(new TypeToken<List<User>>(){}, jsonArray));
        			}
        			catch (Exception e) {
						// do nothing, leave owner away
        				continue;
					}
        		}
        		else
        		{
        			groupPeople.put(type, unmarshall(new TypeToken<List<User>>(){}, json.get(type.value())));
        		}
        	}
        	
        }
		return groupPeople;
	}
	
	public List<GroupDocument> getGroupDocuments(String groupId) {
		
		// add page and documents per page parameter
		String baseUrl = MendeleyApiUrls.PrivateGroupApiUrls.GET_GROUP_DETAILS_URL + "?items=100000";
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(baseUrl);
        String                apiUrl  = builder.withField(ParameterNames.ID, groupId).buildUrl();
        JsonObject json = unmarshall(callApiGet(apiUrl)).getAsJsonObject();
        
        // new list for all documents
        List<GroupDocument> documents = new LinkedList<GroupDocument>();
        
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
        	GroupDocument doc = null;
        	try {
        		doc = getGroupDocumentDetails(groupId, documentId);
        	}
        	catch (Exception e) {
				// do nothing
        		System.out.println("Error while geting group document details: " + e.getMessage());
        		doc = null;
			}
        	if(doc != null)
        	{
        		documents.add(doc);
        	}
        }
        
		return documents;
	}

	public GroupDocument getGroupDocumentDetails(String groupId, String documentId) {
		String baseUrl = MendeleyApiUrls.PrivateGroupApiUrls.GET_GROUP_DETAILS_URL + "{document_id}/";
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(baseUrl);
        String                apiUrl  = builder.withField(ParameterNames.ID, groupId)
        									   .withField("document_id", documentId).buildUrl();
        JsonElement json = unmarshall(callApiGet(apiUrl));
        
        GroupDocument unmarshalled = null;
        try {
        	unmarshalled = unmarshall(GroupDocument.class, json);
        	try {
        		// quick fix to get the abstract
            	JsonObject jsonObject = json.getAsJsonObject();
            	unmarshalled.setAbstract(jsonObject.get("abstract").getAsString());
        	}
        	catch (Exception e) {
				// nothing to do
			}
        	System.out.println("Unmarshalled " + json);
        }
        catch (Exception e) {
			System.out.println(e.getMessage() + " Could not unmarshall " + json);
		}
        
        return unmarshalled;
	}
	
	public String getFileUrl(FileAttachement file, String groupId, String documentId)
	{
		String baseUrl = FileAccessUrls.GET_FILE_URL_URL;
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(baseUrl);
        String                apiUrl  = builder.withField("group_id", groupId)
        									   .withField("document_id", documentId)
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
