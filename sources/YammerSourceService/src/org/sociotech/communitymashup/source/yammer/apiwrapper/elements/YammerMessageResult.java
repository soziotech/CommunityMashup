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
package org.sociotech.communitymashup.source.yammer.apiwrapper.elements;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Peter Lachenmaier
 */
public class YammerMessageResult extends YammerEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3321077383141079656L;

	/**
	 * The id of the newest message in this result.
	 * Will be calculated internally when adding new messages 
	 */
	private String newestMessageId = null;
	
	/**
	 * The id of the oldest message in this result.
	 * Will be calculated internally when adding new messages 
	 */
	private String oldestMessageId = null;
	
	/** The messages. */
	private List<YammerMessage> messages = new LinkedList<YammerMessage>();
	
	// TODO is this user dependent
	/** The meta information. */
	private YammerMessageMeta meta;
	
	/** The meta information. */
	private List<YammerUser> referencedUsers = new LinkedList<YammerUser>();
	
	/** The new tags -> topics. */
	private List<YammerTopic> referencedTopics = new LinkedList<YammerTopic>();

	/** The old tags. */
	private List<YammerTag> referencedTags = new LinkedList<YammerTag>();

	/** The threads. */
	private List<YammerThread> referencedThreads = new LinkedList<YammerThread>();

	/**
	 * @return the messages
	 */
	public List<YammerMessage> getMessages() {
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(List<YammerMessage> messages) {
		this.messages = messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void addMessages(List<YammerMessage> messages) {
		// add all messages to internal messages
		this.messages.addAll(messages);
	}
	 
	private void updateOldestAndNewestMessageId(List<YammerMessage> messages) {
		
		
		// do this hack to keep string values and null elements
		int maxId = -1;
		int minId = Integer.MAX_VALUE;
		
		if(oldestMessageId != null)
		{
			minId = Integer.parseInt(oldestMessageId);
		}
		if(newestMessageId != null)
		{
			maxId = Integer.parseInt(newestMessageId);
		}
		
		// find min and max
		for(YammerMessage message : messages)
		{
			int tmpId = message.getIntId();
			if(tmpId > maxId)
			{
				maxId = tmpId;
			}
			if(tmpId < minId)
			{
				minId = tmpId;						
			}
		}
		
		this.setNewestMessageId("" + maxId);
		this.setOldestMessageId("" + minId);
		
	}

	/**
	 * @return the meta
	 */
	public YammerMessageMeta getMeta() {
		return meta;
	}

	/**
	 * @param meta the meta to set
	 */
	public void setMeta(YammerMessageMeta meta) {
		this.meta = meta;
	}

	/**
	 * @return the referencedUsers
	 */
	public List<YammerUser> getReferencedUsers() {
		return referencedUsers;
	}

	/**
	 * @param referencedUsers the referencedUsers to set
	 */
	public void setReferencedUsers(List<YammerUser> referencedUsers) {
		this.referencedUsers = referencedUsers;
	}

	/**
	 * @return the referencedTopics
	 */
	public List<YammerTopic> getReferencedTopics() {
		return referencedTopics;
	}

	/**
	 * @return the referencedTags
	 */
	public List<YammerTag> getReferencedTags() {
		return referencedTags;
	}

	/**
	 * @param referencedTags the referencedTags to set
	 */
	public void setReferencedTags(List<YammerTag> referencedTags) {
		this.referencedTags = referencedTags;
	}

	/**
	 * @param referencedTopics the referencedTags to set
	 */
	public void setReferencedTopics(List<YammerTopic> referencedTopics) {
		this.referencedTopics = referencedTopics;
	}

	/**
	 * @return the referencedThreads
	 */
	public List<YammerThread> getReferencedThreads() {
		return referencedThreads;
	}

	/**
	 * @param referencedThreads the referencedThreads to set
	 */
	public void setReferencedThreads(List<YammerThread> referencedThreads) {
		this.referencedThreads = referencedThreads;
	}

	/**
	 * @return the newestMessageId
	 */
	public String getNewestMessageId() {
		updateOldestAndNewestMessageId(this.messages);
		return newestMessageId;
	}

	/**
	 * @param newestMessageId the newestMessageId to set
	 */
	public void setNewestMessageId(String newestMessageId) {
		this.newestMessageId = newestMessageId;
	}

	/**
	 * @return the oldestMessageId
	 */
	public String getOldestMessageId() {
		updateOldestAndNewestMessageId(this.messages);
		return oldestMessageId;
	}

	/**
	 * @param oldestMessageId the oldestMessageId to set
	 */
	public void setOldestMessageId(String oldestMessageId) {
		this.oldestMessageId = oldestMessageId;
	}
	
	/**
	 * Returns the number of messages contained in this message result.
	 * 
	 * @return The number of messages contained in this message result.
	 */
	public int getNumberOfMessages() {
		return this.messages.size();
	}
	
	/**
	 * Adds all elements contained in the additional result to this result
	 * 
	 * @param additionalResult an additional message result from another call
	 */
	public void addMessageResult(YammerMessageResult additionalResult)
	{
		if(additionalResult == null)
		{
			return;
		}
		
		List<YammerMessage> additionalMessages = additionalResult.getMessages();
		if(additionalMessages != null)
		{
			this.messages.addAll(additionalMessages);
		}
		
		List<YammerUser> additionalUsers = additionalResult.getReferencedUsers();
		if(additionalUsers != null)
		{
			this.referencedUsers.addAll(additionalUsers);
		}
		
		List<YammerTopic> additionalTopics = additionalResult.getReferencedTopics();
		if(additionalTopics != null)
		{
			this.referencedTopics.addAll(additionalTopics);
		}
		
		List<YammerThread> additionalThreads = additionalResult.getReferencedThreads();
		if(additionalThreads != null)
		{
			this.referencedThreads.addAll(referencedThreads);
		}
		
		// TODO handle meta
	}
	
	/**
	 * Finds the topic for the given id in the referenced topics and returns it.
	 * 
	 * @param topicId Topic id
	 * @return The topic for the given id or null in error case.
	 */
	public YammerTopic getTopicForId(String topicId)
	{
		if(topicId == null)
		{
			return null;
		}
		
		// dumb search should not be that much objects
		for(YammerTopic topic : referencedTopics)
		{
			if(topic.getId().equalsIgnoreCase(topicId))
			{
				return topic;
			}
		}
		
		// no result
		return null;
	}
	
	/**
	 * Returns wether the result contains messages or not.
	 * 
	 * @return True if the result contains messages, false otherwise.
	 */
	public boolean hasMessages()
	{
		return messages != null && !messages.isEmpty(); 
	}
}
