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
package org.sociotech.communitymashup.source.yammer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.osgi.service.log.LogService;
import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.YammerApi;
import org.scribe.model.Token;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.data.ThumbRanking;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.sociotech.communitymashup.source.yammer.adapter.NewCommentAdapter;
import org.sociotech.communitymashup.source.yammer.adapter.NewThumbAdapter;
import org.sociotech.communitymashup.source.yammer.apiwrapper.YammerAPIWrapper;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerMessageResult;
import org.sociotech.communitymashup.source.yammer.apiwrapper.elements.YammerUser;
import org.sociotech.communitymashup.source.yammer.properties.YammerProperties;
import org.sociotech.communitymashup.source.yammer.trasformation.YammerTransformation;

/**
 * This is the main class of the yammer source service.
 * 
 * @author Peter Lachenmaier
 */
public class YammerSourceService extends SourceServiceFacadeImpl {

	/**
	 * Java access to the yammer api
	 */
	private YammerAPIWrapper yammerAPI = null;
	
	private YammerTransformation transformation = null;
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#createDefaultConfiguration()
	 */
	@Override
	protected void createDefaultConfiguration() {
		
		// inherit default properties
		super.createDefaultConfiguration();
		
		// add own properties
		source.addProperty(YammerProperties.CONSUMER_KEY_PROPERTY,	 			YammerProperties.CONSUMER_KEY_DEFAULT);
		source.addProperty(YammerProperties.CONSUMER_SECRET_PROPERTY,	 		YammerProperties.CONSUMER_SECRET_DEFAULT);
		source.addProperty(YammerProperties.ACCESS_TOKEN_PROPERTY,	 			YammerProperties.ACCESS_TOKEN_DEFAULT);
		source.addProperty(YammerProperties.ACCESS_TOKEN_SECRET_PROPERTY, 		YammerProperties.ACCESS_TOKEN_SECRET_DEFAULT);
		source.addProperty(YammerProperties.MESSAGE_BODDY_TYPE_PROPERTY, 		YammerProperties.MESSAGE_BODDY_TYPE_DEFAULT);
		source.addProperty(YammerProperties.LOAD_ALL_USERS_PROPERTY, 			YammerProperties.LOAD_ALL_USERS_DEFAULT);
		source.addProperty(YammerProperties.INITIAL_NUMBER_OF_MESSAGES_PROPETY, YammerProperties.INITIAL_NUMBER_OF_MESSAGES_DEFAULT);
		source.addProperty(YammerProperties.WAIT_BETWEEN_API_REQUESTS_PROPERTY, YammerProperties.WAIT_BETWEEN_API_REQUESTS_DEFAULT);
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#initialize(org.sociotech.communitymashup.application.Source)
	 */
	@Override
	public boolean initialize(Source configuration) {
		
		boolean initialized = super.initialize(configuration);
		
		if(initialized)
		{
			initialized &= this.establishConnection();
			
			if(!initialized)
			{
				// try to start the command line authentication if no initialization is possible
				startCommandLineAuthentication();
			}
			else
			{
				// create transformation instance
				transformation = new YammerTransformation(this, yammerAPI);
			}
			
			this.setInitialized(initialized);
		}
		
		return this.isInitialized();
	}

	/**
	 * Starts a command line authentication with yammer to get the needed access token.
	 */
	private void startCommandLineAuthentication() {
		
		if(!source.isPropertyTrue(YammerProperties.ALLOW_COMMAND_LINE_AUTHENTICATION))
		{
			return;
		}
		
		// get property values from configuration
		String consumerKey 		= source.getPropertyValue(YammerProperties.CONSUMER_KEY_PROPERTY);
		String consumerSecret 	= source.getPropertyValue(YammerProperties.CONSUMER_SECRET_PROPERTY);
			
		// check properties
		if(consumerKey == null || consumerKey.isEmpty())
		{
			log("A valid consumer key is needed in the configuration specified by " + YammerProperties.CONSUMER_KEY_PROPERTY, LogService.LOG_WARNING);
			return;
		}
		else if(consumerSecret == null || consumerSecret.isEmpty())
		{
			log("A valid consumer secret is needed in the configuration specified by " + YammerProperties.CONSUMER_SECRET_PROPERTY, LogService.LOG_WARNING);
			return;
		}
		
		log("Starting command line authentication.", LogService.LOG_INFO);
		
		// create service instance
		OAuthService yammerService = new ServiceBuilder()
					        .provider(YammerApi.class)
					        .apiKey(consumerKey)
					        .apiSecret(consumerSecret)
					        .build();
		
		// create the request
		Token requestToken = yammerService.getRequestToken();
		
        System.out.println("Request token: " + requestToken.getToken());
        System.out.println("Token secret: " + requestToken.getSecret());
      
        String authUrl = yammerService.getAuthorizationUrl(requestToken);
		
        // wait for user confirming the request
        System.out.println("Now visit:\n" + authUrl
                + "\n... and grant this app authorization");
        System.out.println("Enter the PIN code and hit ENTER when you're done:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pin;
		try {
			pin = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		// verify it and get the access token
		Token accessToken = yammerService.getAccessToken(requestToken, new Verifier(pin));
		
		System.out.println("Access token: " + accessToken.getToken());
		System.out.println("Token secret: " + accessToken.getSecret());
	}

	/**
	 * Establishes a connection with yammer based on the user information given in the
	 * configuration.
	 * 
	 * @return True if it is possible to use the user information for the connection, false otherwise. 
	 */
	private boolean establishConnection() {
		
		// get property values from configuration
		String consumerKey 			= source.getPropertyValue(YammerProperties.CONSUMER_KEY_PROPERTY);
		String consumerSecret 		= source.getPropertyValue(YammerProperties.CONSUMER_SECRET_PROPERTY);
		String accessTokenValue		= source.getPropertyValue(YammerProperties.ACCESS_TOKEN_PROPERTY);
		String accessTokenSecret	= source.getPropertyValue(YammerProperties.ACCESS_TOKEN_SECRET_PROPERTY);
		
		// check properties
		if(consumerKey == null || consumerKey.isEmpty())
		{
			log("A valid consumer key is needed in the configuration specified by " + YammerProperties.CONSUMER_KEY_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		else if(consumerSecret == null || consumerSecret.isEmpty())
		{
			log("A valid consumer secret is needed in the configuration specified by " + YammerProperties.CONSUMER_SECRET_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		else if(accessTokenValue == null || accessTokenValue.isEmpty())
		{
			log("A valid access token is needed in the configuration specified by " + YammerProperties.ACCESS_TOKEN_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		else if(accessTokenSecret == null || accessTokenSecret.isEmpty())
		{
			log("A valid token secret is needed in the configuration specified by " + YammerProperties.ACCESS_TOKEN_SECRET_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		
		// create service instance
		OAuthService yammerService = new ServiceBuilder()
		        .provider(YammerApi.class)
		        .apiKey(consumerKey)
		        .apiSecret(consumerSecret)
		        .build();

		// create an access token based on the configuration values
		Token accessToken = new Token(accessTokenValue, accessTokenSecret);
		
		// create the yammer api wrapper instance for data access
		yammerAPI = new YammerAPIWrapper(yammerService, accessToken);
		
		if(yammerAPI == null)
		{
			return false;
		}
		
		String waitingTime = source.getPropertyValue(YammerProperties.WAIT_BETWEEN_API_REQUESTS_PROPERTY);
		if(waitingTime == null)
		{
			waitingTime = YammerProperties.WAIT_BETWEEN_API_REQUESTS_DEFAULT;
		}
		yammerAPI.setWaitTime(Integer.parseInt(waitingTime));
		
		return true;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#fillDataSet(org.sociotech.communitymashup.data.DataSet)
	 */
	@Override
	public void fillDataSet(DataSet dataSet) {
		
		super.fillDataSet(dataSet);
		
		// check data set
		if (source.getDataSet() == null)
		{
			// nothing to do
			return;
		}
		
		// get all users
		if(source.isPropertyTrue(YammerProperties.LOAD_ALL_USERS_PROPERTY))
		{
			List<YammerUser> users = yammerAPI.getUsers();
			
			// transform and add users
			transformation.transformAndAddUsers(users);
		}
		
		String initialNumberOfMessages = source.getPropertyValue(YammerProperties.INITIAL_NUMBER_OF_MESSAGES_PROPETY);
		if(initialNumberOfMessages == null)
		{
			initialNumberOfMessages = YammerProperties.INITIAL_NUMBER_OF_MESSAGES_DEFAULT;
		}
		
		int loadNumber = Integer.parseInt(initialNumberOfMessages);
		
		// load the newest messages
		YammerMessageResult messageResult = yammerAPI.getNewestMessages(loadNumber);
		
		String newestMessageId = messageResult.getNewestMessageId();
		
		// load newest liked messages
		if(source.isPropertyTrueElseDefault(YammerProperties.LOAD_NEWEST_LIKES_PROPERTY, YammerProperties.LOAD_NEWEST_LIKES_DEFAULT))
		{
			YammerMessageResult likeResult = yammerAPI.getNewestLikedMessages(loadNumber);
			transformation.transformAndAddMessageResult(likeResult, true);
		}
		
		// keep the newest message id for updates
		source.addProperty(YammerProperties.NEWEST_MESSAGE_ID_PROPERTY, newestMessageId);
		
		transformation.transformAndAddMessageResult(messageResult, true);
		
		// add write back adapters if configured
		
		// write back comments
		if(source.isPropertyTrue(YammerProperties.WRITE_BACK_COMMENTS_PROPERTY))
		{
			dataSet.eAdapters().add(new NewCommentAdapter(this));
		}
		
		// write back likes
		if(source.isPropertyTrue(YammerProperties.WRITE_BACK_LIKES_PROPERTY))
		{
			dataSet.eAdapters().add(new NewThumbAdapter(this));
		}
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#updateDataSet()
	 */
	@Override
	public void updateDataSet() {
		super.updateDataSet();
		
		String newestMessageId = source.getPropertyValue(YammerProperties.NEWEST_MESSAGE_ID_PROPERTY);
		
		if(newestMessageId == null)
		{
			log("No newest message id available, can not perform an update.", LogService.LOG_WARNING);
		}
		
		// load messages since last update
		YammerMessageResult messageResult = yammerAPI.getMessagesNewerThan(newestMessageId);
		
		if(messageResult == null)
		{
			return;
		}
		
		if(messageResult.hasMessages())
		{
			newestMessageId = messageResult.getNewestMessageId();
			// keep the newest message id for following updates
			source.addProperty(YammerProperties.NEWEST_MESSAGE_ID_PROPERTY, newestMessageId);
					
			transformation.transformAndAddMessageResult(messageResult, true);
		}
		
		if(source.isPropertyTrueElseDefault(YammerProperties.LOAD_NEWEST_LIKES_PROPERTY, YammerProperties.LOAD_NEWEST_LIKES_DEFAULT))
		{
			YammerMessageResult likeResult = yammerAPI.getNewestLikedMessages();
			transformation.transformAndAddMessageResult(likeResult, true);
		}
	}

	public void writeComment(Content commentContent) {
		// additional check on property
		if(!source.isPropertyTrue(YammerProperties.WRITE_BACK_COMMENTS_PROPERTY))
		{
			return;
		}
		
		// TODO move some checks to adapter
		
		Content parentContent = commentContent.getParentContent();
		
		if(parentContent == null)
		{
			// no parent -> no comment on yammer object
			return;
		}
		
		if(!isItemOfThisSource(parentContent))
		{
			// no reply on yammer content
			return;
		}
		
		String repliedToId = this.getLocalId(parentContent);
		
		YammerMessageResult response = yammerAPI.postMessage(commentContent.getStringValue(), repliedToId);
	
		if(response != null)
		{
			// Adding was successful so delete the original content object
			this.deleteItem(commentContent);
			
			// transform and add the result
			transformation.transformAndAddMessageResult(response);	
		}
		
		
	}

	/**
	 * Writes thumb ups as likes back to yammer. Only Thumbs ups on contents are supported.
	 * 
	 * @param newThumbRanking Thumb ranking that should be wrote back as yammer like.
	 */
	public void writeThumbRanking(ThumbRanking newThumbRanking) {
		// additional check on property
		if(!source.isPropertyTrue(YammerProperties.WRITE_BACK_LIKES_PROPERTY))
		{
			return;
		}
		
		// do a few checks
		if(newThumbRanking == null)
		{
			return;
		}
		
		if(newThumbRanking.isThumbDown())
		{
			// could only write likes/thumbs up
			return;
		}
		
		InformationObject rankedObject = newThumbRanking.getRankedInformationObject();
		
		if(rankedObject == null || !(rankedObject instanceof Content))
		{
			// could only rank contents
			return;
		}
		
		if(!this.isItemOfThisSource(rankedObject))
		{
			// could only rank own items
			return;
		}
		
		Content rankedContent = (Content) rankedObject;
		
		log("Thumb up on " + rankedContent.getName(), LogService.LOG_DEBUG);
		
		// get the id of the liked message
		String yammerMessageId = this.getLocalId(rankedContent);
		
		// and post the like
		yammerAPI.postLike(yammerMessageId);
	}
}
