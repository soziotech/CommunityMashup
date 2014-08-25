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
package org.sociotech.communitymashup.source.twitter.properties;

/**
 * Constants representing property keys.
 * 
 * @author Peter Lachenmaier
 */
public class TwitterProperties {

	/**
	 * represents the consumer key of the Mashup needed for accessing the API
	 */
	public static final String CONSUMER_KEY_PROPERTY = "consumerKey";
	public static final String CONSUMER_KEY_DEFAULT  = "";
	
	/**
	 * represents the consumer secret
	 */
	public static final String CONSUMER_SECRET_PROPERTY = "consumerSecret";
	public static final String CONSUMER_SECRET_DEFAULT 	= "";

	/**
	 * If this property is set to true, a command line authentication will be started if no access with the provided
	 * tokens is possible or they are missing.
	 */
	public static final String ALLOW_COMMAND_LINE_AUTHENTICATION = "commandLineAuthentication";
	
	/**
	 * Represents the access token secret
	 */
	public static final String ACCESS_TOKEN_SECRET_PROPERTY ="accessTokenSecret";
	
	/**
	 * Represents the access token needed for user specific requests
	 */
	public static final String ACCESS_TOKEN_PROPERTY = "accessToken";
	
	/**
	 * If set to true, the status (last tweet) for every person will be loaded 
	 */
	public static final String ADD_STATUS_OF_PEOPLE_PROPERTY = "addPeopleStatus";
	
	/**
	 * If set to true, people mentioned in tweets will be loaded 
	 */
	public static final String ADD_MENTIONED_PEOPLE_PROPERTY = "addMentionedPeople";
	
	/**
	 * If set to true, urls contained in tweets will be added as websites
	 */
	public static final String ADD_URL_ENTITIES_PROPERTY = "addURLEntities";
	
	/**
	 * Key for the load home timeline property.
	 */
	public static final String LOAD_HOME_TIMELINE_PROPERTY = "loadHomeTimeline";
	
	/**
	 * Key for the load user timeline property.
	 */
	public static final String LOAD_USER_TIMELINE_PROPERTY = "loadUserTimeline";
	
	/**
	 * Number of tweets that should be loaded initially. Maximum is 200.
	 */
	public static final String NUMBER_OF_USER_TIMELINE_TWEETS_PROPERTY = "numberOfUserTimelineTweets";
	public static final String NUMBER_OF_USER_TIMELINE_TWEETS_DEFAULT = "20";
	
	/**
	 * Number of tweets that should be loaded at search. Maximum is 100.
	 */
	public static final String NUMBER_OF_SEARCH_TWEETS_PROPERTY = "numberOfSearchTweets";
	public static final String NUMBER_OF_SEARCH_TWEETS_DEFAULT = "20";
	
	/**
	 * Geolocation latitude to search for tweets.
	 */
	public static final String SEARCH_GEO_LATITUDE_PROPERTY = "searchLatitude";
	
	/**
	 * Geolocation longitude to search for tweets.
	 */
	public static final String SEARCH_GEO_LONGITUDE_PROPERTY = "searchLongitude";
	
	/**
	 * Radius around the geolocation to search for tweets.
	 */
	public static final String SEARCH_GEO_RADIUS_PROPERTY = "searchRadius";
	public static final String SEARCH_GEO_RADIUS_DEFAULT = "100";
	
	/**
	 * Unit of the search radius.
	 */
	public static final String SEARCH_GEO_RADIUS_UNIT_PROPERTY = "searchRadiusUnit";
	public static final String SEARCH_GEO_RADIUS_UNIT_DEFAULT = "km";
	
	
	/**
	 * Key for the load following property.
	 */
	public static final String LOAD_FOLLOWING_PROPERTY = "loadFollowing";
	
	/**
	 * Key for the load followers secret property.
	 */
	public static final String LOAD_FOLLOWERS_PROPERTY = "loadFollowers";
	
	/**
	 * Key for the interconnect following property.
	 */
	public static final String INTERCONNECT_FOLLOWING_PROPERTY = "interconnectFollowing";
	
	/**
	 * Enrich Persons.
	 */
	public static final String ENRICH_PERSONS_PROPERTY = "enrichPersons";
	public static final String ENRICH_PERSONS_DEFAULT  = "false";
	
	/**
	 * Key for the interconnect followers property.
	 */
	public static final String INTERCONNECT_FOLLOWERS_PROPERTY = "interconnectFollowers";
	
	/**
	 * Key for the search property.
	 */
	public static final String SEARCH_PROPERTY = "search";
	
	/**
	 * Key for the search since id property.
	 */
	public static final String SEARCH_SINCE_ID_PROPERTY = "searchSinceId";
	
	/**
	 * Whether a higher res profile image should be loaded for every twitter user. Results to an extra api call for every user.
	 */
	public static final String LOAD_HIGHER_RES_PROFILE_IMAGE_PROPERTY = "loadHighResProfileImage";
	public static final String LOAD_HIGHER_RES_PROFILE_IMAGE_DEFAULT  = "false";
	
	/**
	 * Whether the profile of the account owner should be loaded or not
	 */
	public static final String LOAD_ACCOUNTOWNER_PROFILE_PROPERTY = "loadAccountOwner";
	public static final String LOAD_ACCOUNTOWNER_PROFILE_DEFAULT  = "true";
	
	/**
	 * Whether to load photos from media entities as content attachments
	 */
	public static final String LOAD_PHOTOS_PROPERTY = "loadPhotos";
	public static final String LOAD_PHOTOS_DEFAULT  = "false";
	
	/**
	 * Whether to keep only tweets with photos
	 */
	public static final String LOAD_PHOTO_TWEETS_ONLY_PROPERTY = "loadPhotoTweetsOnly";
	public static final String LOAD_PHOTO_TWEETS_ONLY_DEFAULT  = "false";
	
	/**
	 * If specified, all tweets older than the given number of days will be skipped at loading. No deletion of old tweets.
	 */
	public static final String SKIP_OLDER_THAN_DAYS_PROPERTY = "skipOlderThanDays";
	
	/**
	 * Key for the load direct messages property.
	 */
	// currently not supported due to restrictions of public applications
	//private static final String LOAD_DIRECT_MESSAGES_PROPERTY = "loadReceivedDirectMessages";

	/**
	 * Key for the load sent direct messages property.
	 */
	// currently not supported due to restrictions of public applications
	//private static final String LOAD_SENT_DIRECT_MESSAGES_PROPERTY = "loadSentDirectMessages";

}
