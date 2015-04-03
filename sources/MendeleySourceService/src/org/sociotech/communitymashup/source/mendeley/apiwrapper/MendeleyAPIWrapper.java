/*******************************************************************************
 * Copyright (c) 2014 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.mendeley.apiwrapper;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.scribe.model.OAuthConstants;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Verb;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.constants.MendeleyAPIUrls;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyDocumentDetails;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyFileAttachement;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyGroupMember;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyProfile;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyUsersGroup;
import org.sociotech.communitymashup.source.mendeley.oauth20.MendeleyOAuth20AccessToken;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MendeleyAPIWrapper {
	
	 /** The parser. */
    private final JsonParser parser = new JsonParser();
   	
	/**
	 * Token for accessing the mendeley api.
	 */
	private String accessToken = null;
		
	/**
	 * Creates the api wrapper that uses the given access token for authorization. You can
	 * update the access token by calling {@link MendeleyAPIWrapper#getRefreshedAccessToken(String, String, String)}
	 * 
	 * @param accessToken Access token for authorization
	 */
	public MendeleyAPIWrapper(String accessToken) {
		this.accessToken = accessToken;
	}
	
	
	/**
	 * Executing a (authorized) get request to the given url. 
	 * 
	 * @param url Url without authorization parameters
	 * @return The plain result, null in error case
	 */
	private String doGet(String url)
	{
		// create a request to fetch all users
		OAuthRequest request = new OAuthRequest(Verb.GET, url);
		
		// add authorization
		authorizeRequest(request);
		
		System.out.println("Doing get request: " + url);
		Response response = request.send();
		System.out.println("Got response: " + response.getBody());
		
		// check on bad request
		if(response.getCode() == 400)
		{
			return null;
		}
		
		return response.getBody();
	}
	
	/**
	 * Executing a (authorized) post request to the given url. 
	 * 
	 * @param url Url without authorization parameters
	 * @return The plain result, null in error case
	 */
	@SuppressWarnings("unused")
	private String doPost(String url, Map<String, String> parameterMap)
	{
		// create a request to fetch all users
		OAuthRequest request = new OAuthRequest(Verb.POST, url);
		
		if(parameterMap != null)
		{
			for(String key : parameterMap.keySet())
			{
				// add every parameter pair
				request.addBodyParameter(key, parameterMap.get(key));
			}
		}
		
		// add authorization
	    authorizeRequest(request);
				
		System.out.println("Doing post request: " + url);
		Response response = request.send();
		System.out.println("Got response: " + response.getBody());
		
		// check on bad request
		if(response.getCode() == 400)
		{
			return null;
		}
		
		return response.getBody();
	}
	
	/**
	 * Authorizes the given request by adding the necessary access token
	 * 
	 * @param request Request to authorize
	 */
	private void authorizeRequest(OAuthRequest request) {
		request.addQuerystringParameter("access_token", accessToken);
	}
	
	/**
	 * Unmarshalls given json content of the given type.
	 * 
	 * @param type The result Type
	 * @param json Json to be unmarshalled
	 * 
	 * @return Unmarshalled json content as object of the given type
	 */
	protected <T> T unmarshall(Class<T> type, JsonElement json) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(json, type);
	}
	
	/**
	 * Unmarshalls given json content as a list of the given type.
	 *  
	 * @param type The result Type
	 * @param json Json to be unmarshalled
	 * 
	 * @return Unmarshalled json content as list of objects of the given type
	 */
	protected <T> List<T> unmarshallList(Class<T> type, JsonElement json) {
		List<T> retValue = new LinkedList<T>();
		if (json.isJsonArray()) {
			for (JsonElement element : json.getAsJsonArray()) {
				retValue.add(unmarshall(type, element));
			}
		}
		return retValue;
	}
	
	/**
	 * Gets the gson builder.
	 * 
	 * @return the gson builder
	 */
	protected GsonBuilder getGsonBuilder() {
		GsonBuilder builder = new GsonBuilder();
		
		//builder.setDateFormat(ApplicationConstants.DATE_FORMAT);
		builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);

		return builder;
	}

	/**
	 * Returns the profile of the authenticated user
	 * 
	 * @return The profile of the authenticated user
	 */
	public MendeleyProfile getUserProfile() {
		return unmarshallAndReturn(MendeleyProfile.class, doGet(MendeleyAPIUrls.GET_AUTHENTICATED_USER_PROFILE));
	}
	
	/**
	 * Returns the profile of the user with the given profile id.
	
	 * @param profileId Profile id of the requested user.
	 * 
	 * @return The profile of the user
	 */
	public MendeleyProfile getUserProfile(String profileId) {
		return unmarshallAndReturn(MendeleyProfile.class, doGet(String.format(MendeleyAPIUrls.GET_USER_PROFILE, profileId)));
	}
	
	/**
	 * Returns all publications authored by the authenticated user.
	 * 
	 * @return All publications authored by the authenticated user.
	 */
	public List<MendeleyDocumentDetails> getAuthoredPublications() {
		
		 return unmarshallAndReturnList(MendeleyDocumentDetails.class, doGet(MendeleyAPIUrls.GET_USER_AUTHORED));
		 
//		 // get all ids		 
//		 JsonObject json = parser.parse(doGet(url)).getAsJsonObject();
//	      
//		 // new list for all documents
//	      List<MendeleyDocumentDetails> documents = new LinkedList<MendeleyDocumentDetails>();
//	        
//	      JsonElement ids = json.get("document_ids");
//	      if(ids == null || !ids.isJsonArray())
//	      {
//	    	  return documents;
//	      }
//
//	      JsonArray idArray = ids.getAsJsonArray();
//	        
//	      // get document details for every document
//	      for(int i = 0; i < idArray.size(); i++)
//	      {
//	    	  String documentId = idArray.get(i).getAsString();
//	    	  MendeleyDocumentDetails doc = null;
//	    	  try {
//	    		  doc = getAuthoredDocumentDetails(documentId);
//	    	  }
//	    	  catch (Exception e) {
//	    		  // do nothing
//	    		  //e.printStackTrace();
//	    		  //System.out.println("Error while geting group document details: " + e.getMessage());
//	    		  continue;
//	    	  }
//	    	  
//	    	  // add document to list
//	    	  documents.add(doc);
//	      }
//
//	      // return all document details
//	      return documents;
	}

	/**
	 * Retrieves the list of groups in the personal library of the authenticated user.
	 * 
	 * @return List of mendeley groups or null in error case
	 */
	public List<MendeleyUsersGroup> getUsersGroups() {
		return unmarshallAndReturnList(MendeleyUsersGroup.class, doGet(MendeleyAPIUrls.GET_USERS_GROUPS));
	}
	
	/**
	 * Retrieves the members of the group identified by the given id.
	 * 
	 * @param groupId Id of the group
	 * 
	 * @return The group members.
	 */
	public List<MendeleyGroupMember> getUsersGroupMembers(String groupId) {
		return unmarshallAndReturnList(MendeleyGroupMember.class, doGet(String.format(MendeleyAPIUrls.GET_GROUP_PEOPLE, groupId)));
	}
	
	/**
	 * Returns the detailed document for the given document id.
	 * 
	 * @param documentId Id of the document to request details.
	 * @return The detailed document.
	 */
	private MendeleyDocumentDetails getAuthoredDocumentDetails(String documentId) {
		return unmarshallAndReturn(MendeleyDocumentDetails.class, doGet(String.format(MendeleyAPIUrls.GET_DOCUMENT_DETAILS, documentId)));
	}

	/**
	 * Returns the documents of the group with the given id. Currently limited to 500 documents.
	 * 
	 * @param groupId Id of the group
	 * @return The documents of the group
	 */
	public List<MendeleyDocumentDetails> getGroupDocuments(String groupId) {
		return unmarshallAndReturnList(MendeleyDocumentDetails.class, doGet(String.format(MendeleyAPIUrls.GET_GROUP_DOCUMENTS, groupId)));
	}
	
	/**
	 * Returns the details for a public group.
	 * 
	 * @param groupId Id of the public group
	 * @return Public group details.
	 */
	public MendeleyUsersGroup getPublicGroupDetails(String groupId) {
		return unmarshallAndReturn(MendeleyUsersGroup.class, doGet(String.format(MendeleyAPIUrls.GET_GROUP_DETAILS, groupId)));
	}
	
	/**
	 * Parses the given raw value and unmarshalls it to the given type.
	 *  
	 * @param type Type of the expected result
	 * @param raw Raw value
	 * @return The unmarshalled result or null in error case
	 */
	private <T> T unmarshallAndReturn(Class<T> type, String raw) {
		if(raw == null) {
			return null;
		}
				
		return unmarshall(type, parser.parse(raw));
	}
	
	/**
	 * Parses the given raw value and unmarshalls it to a list of the given type.
	 *  
	 * @param type Type of the expected result
	 * @param raw Raw value
	 * @return The unmarshalled result or null in error case
	 */
	private <T> List<T> unmarshallAndReturnList(Class<T> type, String raw) {
		if(raw == null) {
			return null;
		}		
		return unmarshallList(type, parser.parse(raw));
	}
	
	/**
	 * Returns the temporary file download url for the given file attachment.
	 *  
	 * @param file Mendeley file attachment
	 * @param documentId Id of corresponding mendeley document
	 * 
	 * @return The temporary file download url.
	 */
	public String getFileUrl(MendeleyFileAttachement file, String documentId) {
		String  apiUrl  = String.format(MendeleyAPIUrls.GET_AUTHORED_FILE_URL, documentId, file.getFile_hash()); 

		// add authentication and return
		return  apiUrl + "?access_token=" + accessToken;
	}

	/**
	 * Returns the temporary file download url for the given group document file attachment.
	 *  
	 * @param file Mendeley file attachment
	 * @param documentId Id of corresponding mendeley document
	 * @param groupId Id of corresponding mendeley group
	 * 
	 * @return The temporary file download url.
	 */
	public String getGroupFileUrl(MendeleyFileAttachement file, String documentId, String groupId) {
		String  apiUrl  = String.format(MendeleyAPIUrls.GET_GROUP_FILE_URL, documentId, file.getFile_hash(), groupId); 

		// add authentication and return
		return  apiUrl + "?access_token=" + accessToken;
	}
	
	/**
	 * Asks for a access token refresh. This mehtod returns the new access token and keeps it internally for
	 * the next requests.
	 * 
	 * @param refreshToken Refresh token needed for refresh
	 * @param clientID The client id
	 * @param clientSecret The client secret
	 * 
	 * @return The new access Token or null if it can not be obtained.
	 */
	public MendeleyOAuth20AccessToken getRefreshedAccessToken(String refreshToken, String clientID, String clientSecret) {
				
		OAuthRequest request = new OAuthRequest(Verb.POST, MendeleyAPIUrls.TOKEN_URL);
		
		request.addBodyParameter("grant_type", "refresh_token");
		request.addBodyParameter("refresh_token", refreshToken);
		
		request.addBodyParameter(OAuthConstants.CLIENT_ID, clientID);
		request.addBodyParameter(OAuthConstants.CLIENT_SECRET, clientSecret);
		
		// send the request
		Response response = request.send();
		
		// check return code
		if(response == null || response.getCode() != 200) {
			return null;
		}
		
		// parses the token from the response
		MendeleyOAuth20AccessToken newToken = new MendeleyOAuth20AccessToken(response.getBody());
		
		// keep access token for internal usage
		accessToken = newToken.getAccessToken();
		
		// return refreshed token
		return newToken;
	}
}
