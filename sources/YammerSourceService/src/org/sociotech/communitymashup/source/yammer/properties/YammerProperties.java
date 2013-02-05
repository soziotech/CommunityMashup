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
package org.sociotech.communitymashup.source.yammer.properties;

/**
 * This class contains string constants for properties used by yammer source service.
 * 
 * @author Peter Lachenmaier
 */
public class YammerProperties {

	/**
     * The consumer secret in combination with the consumer key is used by yammer to identify
     * the CommunityMashup as consuming application.
     */
	public static final String CONSUMER_KEY_PROPERTY 			= "consumerKey";
	public static final String CONSUMER_KEY_DEFAULT 			= "";
	public static final String CONSUMER_SECRET_PROPERTY 		= "consumerSecret";
	public static final String CONSUMER_SECRET_DEFAULT	 		= "";

	/**
     * The access secret in combination with the access token is used by yammer to identify
     * and authorize the yammer user.
     */
	public static final String ACCESS_TOKEN_PROPERTY 			= "accessToken";
	public static final String ACCESS_TOKEN_DEFAULT 			= "";
	public static final String ACCESS_TOKEN_SECRET_PROPERTY 	= "accessTokenSecret";
	public static final String ACCESS_TOKEN_SECRET_DEFAULT	 	= "";
	
	/**
	 * If this property is set to true, a command line authentication will be started if no access with the provided
	 * tokens is possible or they are missing.
	 */
	public static final String ALLOW_COMMAND_LINE_AUTHENTICATION = "commandLineAuthentication";
	
	/**
	 * The type of the message body. Can be plain, parsed or rich
	 */
	public static final String MESSAGE_BODDY_TYPE_PROPERTY 			= "messageBodyType";
	public static final String MESSAGE_BODDY_TYPE_PLAIN 			= "plain";
	public static final String MESSAGE_BODDY_TYPE_PARSED 			= "parsed";
	public static final String MESSAGE_BODDY_TYPE_RICH 				= "rich";
	public static final String MESSAGE_BODDY_TYPE_DEFAULT 			= MESSAGE_BODDY_TYPE_PLAIN;
	
	
	/**
	 * If this property is set to true than all available users will be loaded 
	 */
	public static final String LOAD_ALL_USERS_PROPERTY				= "loadAllUsers";
	public static final String LOAD_ALL_USERS_DEFAULT				= "false";
	
	/**
	 * Defines the number of messages that should be loaded initially 
	 */
	public static final String INITIAL_NUMBER_OF_MESSAGES_PROPETY	= "initialNumberOfMessages";
	public static final String INITIAL_NUMBER_OF_MESSAGES_DEFAULT	= "10";
	
	/**
	 * Keeps the newest loaded message id, dont set manually. 
	 */
	public static final String NEWEST_MESSAGE_ID_PROPERTY			= "newestMessageId";
	
	/**
	 * If set to true, then comments will be written back to yammer. 
	 */
	public static final String WRITE_BACK_COMMENTS_PROPERTY			= "writeBackComments";
	
	/**
	 * If set to true, then likes will be written back to yammer.  
	 */
	public static final String WRITE_BACK_LIKES_PROPERTY			= "writeBackLikes";
	
	/**
	 * If set to true, then the account owner will be used as user for likes and comments
	 * if not author is set.  
	 */
	public static final String WRITE_WITH_ACCOUNT_OWNER_PROPERTY	= "writeWithAccountOwner";
	
	/**
	 * Time to wait between api requests in seconds. Only used if an operation needs more than
	 * one api call.
	 */
	public static final String WAIT_BETWEEN_API_REQUESTS_PROPERTY	= "waitBetweenAPIRequests";
	public static final String WAIT_BETWEEN_API_REQUESTS_DEFAULT	= "0";
	
	/**
	 * If set to true, then it will be polled for new likes.
	 */
	public static final String LOAD_NEWEST_LIKES_PROPERTY 			= "loadNewestLikes";
	public static final String LOAD_NEWEST_LIKES_DEFAULT 			= "false";
	
	
}
