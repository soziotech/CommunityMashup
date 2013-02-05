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
package org.sociotech.communitymashup.source.yammer.trasformation;

import java.util.Date;
import java.util.List;

import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.ThumbRanking;
import org.sociotech.communitymashup.source.yammer.YammerSourceService;
import org.sociotech.communitymashup.source.yammer.apiwrapper.YammerAPIWrapper;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerLike;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerLiker;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerMessage;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerMessageResult;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerThread;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerTopic;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerUser;
import org.sociotech.communitymashup.source.yammer.meta.YammerTags;
import org.sociotech.communitymashup.source.yammer.properties.YammerProperties;

/**
 * Transforms results from the Yammer api wrapper into CommunityMashup objects.
 * 
 * @author Peter Lachenmaier
 *
 */
public class YammerTransformation {

	/**
	 * Reference to the yammer source service, used e. g. for logging 
	 */
	private YammerSourceService sourceService = null;
	
	/**
	 * Factory for creating new CommunityMashup objects
	 */
	private DataFactory factory = DataFactory.eINSTANCE;
	
	/**
	 * Reference to the yammer api to possible get additional information 
	 */
	private YammerAPIWrapper yammerApi = null;
	
	/**
	 * Creates a new yammer transformation.
	 * 
	 * @param yammerSource Source service used for logging and data adding
	 * @param yammerApi Reference to the yammer api to possible get additional information
	 */
	public YammerTransformation(YammerSourceService yammerSource, YammerAPIWrapper yammerApi) {
		sourceService = yammerSource;
		this.yammerApi = yammerApi;
	}

	/**
	 * Transforms and add the given list of users using {@link #transformAndAddUser(YammerUser)} for
	 * every user in the list.
	 * 
	 * @param users List of users
	 */
	public void transformAndAddUsers(List<YammerUser> users) {
		
		if(users == null || users.isEmpty())
		{
			// nothing to do
			return;
		}
		
		for(YammerUser user : users)
		{
			// add every single user
			this.transformAndAddUser(user);
		}
	}

	/**
	 * Transforms the given yammer user into a CommunityMashup person, adds and returns it.
	 * First looks up if the person already exists depending on the yammer user id.
	 * 
	 * @param user User to be transformed into a person.
	 * 
	 * @return Transformed or existing user as person, null in error case.
	 */
	public Person transformAndAddUser(YammerUser user) {
		
		if(user == null)
		{
			return null;
		}
		
		// lookup person with the same source id
		Person person = sourceService.getPersonWithSourceIdent(user.getId());
		
		if(person != null)
		{
			// TODO maybe update attributes
			return person;
		}
		// create new person
		person = factory.createPerson();
		
		// set a few attributes
		person.setName(user.getFull_name());
		
		
		// get and set first and lastname to make the attributes explicit
		person.setFirstname(person.getFirstname());
		person.setLastname(person.getLastname());
		
		// add it
		person = (Person) sourceService.add(person, user.getId());
		
		if(person != null)
		{
			// now we have a new person 
			
			// add meta tags
			person.metaTag(YammerTags.YAMMER);
			
			// add profile image
			
			String imageUrl = user.getMugshot_url();
			if(imageUrl != null && !imageUrl.isEmpty())
			{
				Image image = person.attachImage(imageUrl);
				
				// add it to mark it as added by this source
				sourceService.add(image);
			}
			
			// add the job title as tag
			person.tag(user.getJob_title());
			
			Organisation department = transformAndAddDepartment(user.getDepartment());
			if(department != null)
			{
				// person is a participant of the department
				department.addParticipant(person);
			}
			// TODO add further attributes
		}
		
		return person;
	}

	/**
	 * Transforms and adds the department.
	 * 
	 * @param department Department as String
	 * @return The department transformed to an organisation
	 */
	private Organisation transformAndAddDepartment(String department) {
		if(department == null || department.isEmpty())
		{
			// can not be transformed
			return null;
		}
		
		// use hash of the department name as local identifier
		Organisation departmentOrg = sourceService.getOrganisationWithSourceIdent("" + department.hashCode());
		
		if(departmentOrg == null)
		{
			// create new organisation
			departmentOrg = factory.createOrganisation();
			departmentOrg.setName(department);
			departmentOrg = (Organisation) sourceService.add(departmentOrg, "" + department.hashCode());
			departmentOrg.metaTag(YammerTags.YAMMER);
			departmentOrg.metaTag(YammerTags.YAMMER_DEPARTMENT);
		}
		
		return departmentOrg;
	}

	/**
	 * @param messageResult
	 */
	public void transformAndAddMessageResult(YammerMessageResult messageResult) {
		transformAndAddMessageResult(messageResult, true);
	}

	public void transformAndAddMessageResult(YammerMessageResult messageResult, boolean loadAuthors) {
		if(messageResult == null)
		{
			return;
		}
		
		// first transform referenced users to be available as authors
		transformAndAddUsers(messageResult.getReferencedUsers());
		
		List<YammerMessage> messages = messageResult.getMessages();
		
		if(messages == null)
		{
			return;
		}
		
		for(YammerMessage message : messages)
		{
			// transform every single message
			transformAndAddMessage(message, loadAuthors);
		}
		
		for(YammerMessage message : messages)
		{
			// transform every single message
			createMessageHirarchy(message);
		}
		
		// also adds the topics which are referenced in the threads
		// needs to be done after adding messages to have the linked messages available
		transformAndAddThreads(messageResult);	
	}

	private void transformAndAddThreads(YammerMessageResult messageResult) {
		if(messageResult == null || messageResult.getReferencedThreads() == null)
		{
			// nothing to do
			return;
		}
		
		List<YammerThread> threads = messageResult.getReferencedThreads();
		
		for(YammerThread thread : threads)
		{
			// find the main content of the thread
			String mainMessageId = thread.getThread_starter_id();
			Content mainContent = sourceService.getContentWithSourceIdent(mainMessageId);
			
			if(mainContent == null)
			{
				// TODO load main message via api
				yammerApi.getMessage(mainMessageId);
			}	
			
			if(mainContent == null)
			{
				// cannot attach tags without a content
				continue;
			}
			
			
			List<YammerTopic> topics = thread.getTopics();
			for(YammerTopic topic : topics)
			{
				// topics in threads only have the id
				String topicId = topic.getId();
				YammerTopic fullTopic = messageResult.getTopicForId(topicId);
				if(fullTopic != null)
				{
					// transform to tag
					mainContent.tag(fullTopic.getName());
				}
			}
		}
	}

	private void createMessageHirarchy(YammerMessage message) {
		if(message == null || message.getReplied_to_id() == null)
		{
			return;
		}
		
		Content parent = sourceService.getContentWithSourceIdent(message.getReplied_to_id());
		if(parent == null)
		{
			return;
		}
		
		Content content = sourceService.getContentWithSourceIdent(message.getId());
		if(content != null)
		{
			content.setParentContent(parent);
		}
	}

	public Content transformAndAddMessage(YammerMessage message) {
		return transformAndAddMessage(message, true);
	}

	public Content transformAndAddMessage(YammerMessage message, boolean loadAuthor) {
		if(message == null)
		{
			return null;
		}
		
		Content content = (Content) sourceService.getContentWithSourceIdent(message.getId());
		
		if(content != null)
		{
			// already created before
			// only update likes
			// tranform and add likes
			transformAndAddMessageLikes(message, content, loadAuthor);
			
			return content;
		}
		
		// create a new content
		content = factory.createContent();
		
		// body, set plain as fallback
		String bodyValue = message.getBody().getPlain();
		
		String desiredMessageType = sourceService.getConfiguration().getPropertyValue(YammerProperties.MESSAGE_BODDY_TYPE_PROPERTY);
		if(desiredMessageType == null)
		{
			desiredMessageType = YammerProperties.MESSAGE_BODDY_TYPE_DEFAULT;
		}
		
		if(desiredMessageType.equals(YammerProperties.MESSAGE_BODDY_TYPE_PLAIN) && message.getBody().getPlain() != null)
		{
			bodyValue = message.getBody().getPlain();
		}
		else if(desiredMessageType.equals(YammerProperties.MESSAGE_BODDY_TYPE_PARSED) && message.getBody().getParsed() != null)
		{
			bodyValue = message.getBody().getParsed();
		}
		else if(desiredMessageType.equals(YammerProperties.MESSAGE_BODDY_TYPE_RICH) && message.getBody().getRich() != null)
		{
			bodyValue = message.getBody().getRich();
		}
			  
		// set it in the content
		content.setStringValue(bodyValue);
		
		// create a name for the message out of its body
		content.setName(createMessageTitle(bodyValue));
		
		// add the content
		content = (Content) sourceService.add(content, message.getId());
		
		
		if(content == null)
		{
			sourceService.log("Could not create content for yammer message: " + message.getId(), LogService.LOG_WARNING);
			return null;
		}
		
		Date created = message.getCreatedDate();
		if(created != null)
		{
			content.setCreated(created);
		}
		
		// add possible hash tags
		sourceService.parseAndAddHashTags(content);
		
		// add yammer meta tag
		content.metaTag(YammerTags.YAMMER);
		
		// add the message type as meta tag
		content.metaTag(message.getMessage_type());
		
		// tranform and add likes
		transformAndAddMessageLikes(message, content, loadAuthor);
		
		// set author
		if(message.getSender_type().equalsIgnoreCase("user"))
		{	
			Person author = sourceService.getPersonWithSourceIdent(message.getSender_id());
		
			if(author == null && loadAuthor && yammerApi != null)
			{
				sourceService.log("Loading user for yammer user id " + message.getSender_id() + " as author.", LogService.LOG_INFO);
				YammerUser authorUser = yammerApi.getUser(message.getSender_id());
				author = transformAndAddUser(authorUser);
			}
			
			if(author != null)
			{
				content.setAuthor(author);
			}
		}
		
		
		return content;
		
	}

	/**
	 * @param message
	 * @param messageContent
	 * @param loadAuthor
	 */
	private void transformAndAddMessageLikes(YammerMessage message, Content messageContent, boolean loadAuthor) {
		YammerLike like = message.getLiked_by();
		if(like != null)
		{
			List<YammerLiker> yammerLikers = like.getNames();
			for(YammerLiker liker : yammerLikers)
			{
				// create unique like id
				String likeId = "like_" + liker.getUser_id() + "_" + message.getId();
				likeId = "" + likeId.hashCode();
				
				// create a thumb up for every like
				ThumbRanking thumbUp = (ThumbRanking) sourceService.getItemWithSourceIdent(likeId);
				
				if(thumbUp != null)
				{
					// already added before
					continue;
				}
				
				sourceService.log("New like from " + liker.getFull_name() + " at " + message.getId(), LogService.LOG_DEBUG );
				
				thumbUp = factory.createThumbRanking();
				
				// add and identify like
				thumbUp = (ThumbRanking) sourceService.add(thumbUp, likeId);
				
				if(thumbUp == null)
				{
					// could not create
					continue;
				}
				
				// like the content
				messageContent.getThumbRankings().add(thumbUp);
				
				Person likePerson = sourceService.getPersonWithSourceIdent(liker.getUser_id());
				if(likePerson == null && loadAuthor && yammerApi != null)
				{
					// load up liker if not previously contained
					YammerUser likeUser = yammerApi.getUser(liker.getUser_id());
					likePerson = transformAndAddUser(likeUser);
				}
				
				if(likePerson != null)
				{
					thumbUp.setRanker(likePerson);
				}
			}
		}
	}

	private String createMessageTitle(String text) {
		if(text == null)
		{
			return null;
		}
		
		// TODO maybe parse headings
		
		int titleLength = 4; // number of words
		
		String[] words = text.split(" ");
		if(words.length < titleLength)
		{
			return text;
		}
		
		String title = "";
		for(int i = 0; i < titleLength; i++)
		{
			title += words[i] + " ";
		}
		
		title += "...";
		
		return title;
	}


	
}
