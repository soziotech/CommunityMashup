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
package org.sociotech.communitymashup.source.yammer.apiwrapper;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerMessage;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerMessageResult;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerTag;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerThread;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerTopic;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerUser;
import org.sociotech.communitymashup.source.yammer.constant.YammerAPIUrls;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class YammerAPIWrapper {
	
	 /** The parser. */
    private final JsonParser parser = new JsonParser();
   
	/**
	 * Scribe service to access the yammer api. Handles Authentication.
	 */
	private OAuthService yammerService = null;
	
	/**
	 * Token for accessing the yammer api.
	 */
	private Token accessToken = null;
	
	/**
	 * Number of messages that will be returned by yammer for a message request 
	 */
	private static final int MESSAGES_PER_REQUEST = 20;
	
	/**
	 * Number of messages that will be returned by yammer for a message request 
	 */
	private static final int USERS_PER_REQUEST = 50;
	
	/**
	 * Number of seconds to wait between api calls
	 */
	private int waitTime = 0;
	
	/**
	 * Returns the time that will be waited between api calls if one methods needs more than one api call.
	 * 
	 * @return The waiting time in seconds
	 */
	public  int getWaitTime() {
		return waitTime;
	}

	private long getWaitTimeInMillis() {
		return 1000 * waitTime;
	}
	
	/**
	 * Set the time that will be waited between api calls if one methods needs more than one api call.
	 * 
	 * @param waitTime The waiting time in seconds
	 */
	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}

	private void waitForNextAllowedCall() {
		try {
			Thread.sleep(getWaitTimeInMillis());
		} catch (InterruptedException e) {
			// do nothing
			e.printStackTrace();
		}
		
	}
	
	public YammerAPIWrapper(OAuthService yammerService, Token accessToken) {
		this.yammerService = yammerService;
		this.accessToken = accessToken;
	}

	/**
	 * @return
	 */
	public List<YammerUser> getUsers()
	{
		return getUsers(Integer.MAX_VALUE, 1);
	}

	/**
	 * @param count
	 * @return
	 */
	public List<YammerUser> getUsers(int count)
	{
		return getUsers(count, 1);
	}

	/**
	 * @param count
	 * @param page TODO
	 * @return
	 */
	public List<YammerUser> getUsers(int count, int page)
	{
		String requestUrl = YammerAPIUrls.GET_USERS;
		
		if(page > 1)
		{
			requestUrl += "?page=" + page;
		}
		
		String result = doGet(requestUrl);
		
		if(result == null)
		{
			return null;
		}
		
		JsonElement json = parser.parse(result);
		
		List<YammerUser> users = unmarshallList(YammerUser.class, json);
		
		int numberOfUsers = users.size();
		
		if(numberOfUsers < USERS_PER_REQUEST)
		{
			// no more users available
			return users;
		}
		
		// make a recursive call at the next page
		List<YammerUser> nextUsers = getUsers(count - numberOfUsers, page + 1);
		if(nextUsers != null)
		{
			// combine the lists
			users.addAll(nextUsers);
		}
		
		return users;
	}
	
	public YammerUser getUser(String id)
	{
		if(id == null)
		{
			return null;
		}
		
		String url = String.format(YammerAPIUrls.GET_USER_WITH_ID +"?followed_by=true&is_profile=true", id);
		
		
		String result = doGet(url);
		
		if(result == null)
		{
			return null;
		}
		
		JsonElement json = parser.parse(result);
		
		return unmarshall(YammerUser.class, json);
	}
	
	public YammerMessageResult getNewestMessages(int count)
	{
		String requestUrl = YammerAPIUrls.GET_MESSAGES;
		
		if(count < MESSAGES_PER_REQUEST)
		{
			requestUrl +="?limit=" + count;
		}
		
		String result = doGet(requestUrl);
		
		if(result == null)
		{
			return null;
		}
		
		YammerMessageResult firstResult = createMessageResult(result);
		
		int numberOfMessages = firstResult.getNumberOfMessages();
		if(numberOfMessages < MESSAGES_PER_REQUEST)
		{
			// stop if no more messages available
			return firstResult;
		}
		
		int nextCount = count - numberOfMessages;
		
		// recursive call
		YammerMessageResult secondResult = getMessagesOlderThan(firstResult.getOldestMessageId(), nextCount);
		
		// combine results
		firstResult.addMessageResult(secondResult);
				
		return firstResult; 
	}
	
	public YammerMessageResult getNewestMessages()
	{
		return getNewestMessages(MESSAGES_PER_REQUEST);
	}
	
	public YammerMessageResult getNewestLikedMessages(int count)
	{
		String requestUrl = YammerAPIUrls.GET_LIKED_MESSAGES;
		
		if(count < MESSAGES_PER_REQUEST)
		{
			requestUrl +="?limit=" + count;
		}
		
		String result = doGet(requestUrl);
		
		if(result == null)
		{
			return null;
		}
		
		YammerMessageResult firstResult = createMessageResult(result);
		
		int numberOfMessages = firstResult.getNumberOfMessages();
		if(numberOfMessages < MESSAGES_PER_REQUEST)
		{
			// stop if no more messages available
			return firstResult;
		}
		
		int nextCount = count - numberOfMessages;
		
		// recursive call
		YammerMessageResult secondResult = getMessagesOlderThan(firstResult.getOldestMessageId(), nextCount);
		
		// combine results
		firstResult.addMessageResult(secondResult);
				
		return firstResult; 
	}
	
	public YammerMessageResult getNewestLikedMessages()
	{
		return getNewestLikedMessages(MESSAGES_PER_REQUEST);
	}
	
	/**
	 * Gets all messages that are newer than the one with the given message id.
	 * 
	 * @param newestMessageId The id of the newest existing message
	 * @param count The number of messages that should be fetched
	 * @return The message contained in a {@link YammerMessageResult}
	 */
	public YammerMessageResult getMessagesNewerThan(String newestMessageId, int count) {
		String result = doGet(YammerAPIUrls.GET_MESSAGES + "?newer_than=" + newestMessageId + "&limit=" + count);
		
		if(result == null)
		{
			return null;
		}
		
		YammerMessageResult firstResult = createMessageResult(result);
		
		int numberOfMessages = firstResult.getNumberOfMessages();
		if(numberOfMessages < MESSAGES_PER_REQUEST)
		{
			// stop if no more messages available
			return firstResult;
		}
		
		int nextCount = count - numberOfMessages;
		
		// wait before doing the next call
		this.waitForNextAllowedCall();
		
		// recursive call
		YammerMessageResult secondResult = getMessagesNewerThan(firstResult.getNewestMessageId(), nextCount);
		
		// combine results
		firstResult.addMessageResult(secondResult);
		
		return firstResult;
	}

	

	public YammerMessageResult postMessage(String body, String repliedToId)
	{
		return this.postMessage(body, repliedToId, null, false);
	}
	
	public YammerMessageResult postMessage(String body, String repliedToId, String groupId)
	{
		return this.postMessage(body, repliedToId, groupId, false);
	}
	
	public YammerMessageResult postMessage(String body, String repliedToId, boolean broadcast)
	{
		return this.postMessage(body, repliedToId, null, broadcast);
	}
	
	public YammerMessageResult postMessage(String body, String repliedToId, String groupId, boolean broadcast)
	{
		if(body == null || body.isEmpty())
		{
			return null;
		}
		
		// user id is a url parameter
		String url = YammerAPIUrls.POST_MESSAGES;
		
		Map<String, String> parameterMap = new HashMap<String, String>();
		
		parameterMap.put("body", body);
		
		if(repliedToId != null)
		{
			parameterMap.put("replied_to_id", repliedToId);
		}
		
		if(groupId != null)
		{
			parameterMap.put("group_id", groupId);
		}
		
		parameterMap.put("broadcast", "" + broadcast);
		
		// send post
		String result = this.doPost(url, parameterMap);
		
		// create message result and return
		return createMessageResult(result);
	}
	
	/**
	 * Does a like on the message with the given id user the account provider.
	 * 
	 * @param messageId Id of the message to be liked.
	 */
	public void postLike(String messageId)
	{
		this.postLike(messageId, "current");
	}
	
	public void postLike(String messageId, String userId)
	{
		if(messageId == null || userId == null)
		{
			return;
		}
		
		// user id is a url parameter
		String url = String.format(YammerAPIUrls.POST_LIKE_WITH_USERID, userId);
		
		Map<String, String> parameterMap = new HashMap<String, String>();
		
		// message id is a post parmeter
		parameterMap.put("message_id", messageId);
		
		this.doPost(url, parameterMap);
	}
	
	/**
	 * Returns the next messages by count that are older than the message
	 * specified by the given messageId.

	 * @param messageId Id of the message that the new messages should be older than
	 * @return Yammer messages encapsulated in a {@link YammerMessageResult}
	 */
	public YammerMessageResult getMessagesOlderThan(String messageId)
	{
		return getMessagesOlderThan(messageId, MESSAGES_PER_REQUEST);
	}

	/**
	 * Returns the number of messages specified by count that are older than the message
	 * specified by the given messageId.
	 * 
	 * @param messageId Id of the message that the new messages should be older than
	 * @param count Number of messages that should be returned
	 * @return Yammer messages encapsulated in a {@link YammerMessageResult}
	 */
	public YammerMessageResult getMessagesOlderThan(String messageId, int count)
	{
		if(count <= 0)
		{
			return null;
		}
		
		String result = doGet(YammerAPIUrls.GET_MESSAGES + "?older_than=" + messageId + "&limit=" + count);
		
		if(result == null)
		{
			return null;
		}
		
		YammerMessageResult firstResult = createMessageResult(result);
		
		int numberOfMessages = firstResult.getNumberOfMessages();
		if(numberOfMessages < MESSAGES_PER_REQUEST)
		{
			// stop if no more messages available
			return firstResult;
		}
		
		int nextCount = count - numberOfMessages;
		
		// wait before doing the next call
		this.waitForNextAllowedCall();
				
		// recursive call
		YammerMessageResult secondResult = getMessagesOlderThan(firstResult.getOldestMessageId(), nextCount);
		
		// combine results
		firstResult.addMessageResult(secondResult);
		
		return firstResult;
	}

	/**
	 * Parses a message result from the yammer api and returns it as MessageResult container.
	 * 
	 * @param result Yammer message request result as {@link YammerMessageResult}
	 * @return The YammerMessageResult or null in error case
	 */
	private YammerMessageResult createMessageResult(String result) {
		
		if(result == null || result.isEmpty())
		{
			return null;
		}
		
		JsonElement json = parser.parse(result);
		
		YammerMessageResult messageResult = unmarshall(YammerMessageResult.class, json);
		
		JsonArray referenceArray = null;
		
		try{
			JsonElement references = json.getAsJsonObject().get("references");
			referenceArray = references.getAsJsonArray();
		}
		catch (Exception e) {
			// stop parsing references
			return messageResult;
		}
		
		for(int i = 0; i < referenceArray.size(); i++)
		{
			try {
				JsonObject currentObject = referenceArray.get(i).getAsJsonObject();
			
				String type = currentObject.get("type").getAsString();
				if(type.equalsIgnoreCase("user"))
				{
					YammerUser user = unmarshall(YammerUser.class, currentObject);
					messageResult.getReferencedUsers().add(user);
				}
				else if(type.equalsIgnoreCase("topic"))
				{
					YammerTopic topic = unmarshall(YammerTopic.class, currentObject);
					messageResult.getReferencedTopics().add(topic);
				}
				else if(type.equalsIgnoreCase("thread"))
				{
					YammerThread thread = unmarshall(YammerThread.class, currentObject);
					messageResult.getReferencedThreads().add(thread);
				}
				else if(type.equalsIgnoreCase("tag"))
				{
					YammerTag tag = unmarshall(YammerTag.class, currentObject);
					messageResult.getReferencedTags().add(tag);
				}
			}
			catch (Exception e) {
				// simply do nothing only a reference gets missed
				System.out.println("Exception while parsing references " + e.getMessage());
			}
		}
		
		return messageResult;
	}
	
	private String doGet(String url)
	{
		// create a request to fetch all users
		OAuthRequest request = new OAuthRequest(Verb.GET, url);
		
		//sign the request
		yammerService.signRequest(accessToken, request);
		
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
		
		//sign the request
		yammerService.signRequest(accessToken, request);
		
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
	 * Returns messages newer than the message with the given id.
	 * 
	 * @param newestMessageId Id of the message that the requested messages should be newer
	 * @return Message newer than the one with the given id
	 */
	public YammerMessageResult getMessagesNewerThan(String newestMessageId) {
		// return all newer messages
		return getMessagesNewerThan(newestMessageId, Integer.MAX_VALUE);
		
	}

	/**
	 * 
	 * @param mainMessageId
	 */
	public YammerMessage getMessage(String mainMessageId) {
		// TODO Auto-generated method stub
		return null;
	}
}
