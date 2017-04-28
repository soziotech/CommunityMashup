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
/**
 * 
 */
package org.sociotech.communitymashup.source.feed.properties;

/**
 * This class contains string constants for properties used by the feed source service.
 * 
 * @author Peter Lachenmaier
 */
public class FeedProperties {

	/**
	 * This property is used to set the url of the external feed. 
	 */
	public static final String FEED_URL_PROPERTY = "feedUrl";
	public static final String FEED_URL_DEFAULT = "http://www.kooperationssysteme.de/feed/";
	
	/**
	 * This Property determines if the first category in every feed entry should be set as
	 * CommunityMashup category. All other categories will be set as tags.
	 */
	public static final String SET_FIRST_CATEGORY_PROPERTY = "setFirstCategory";
	public static final String SET_FIRST_CATEGORY_DEFAULT = "false";
	
	/**
	 * This Property determines if the first category in every feed entry should be set as
	 * CommunityMashup tag. All other categories will be set as tags.
	 */
	public static final String SET_FIRST_CATEGORY_AS_TAG_PROPERTY = "setFirstCategoryAsTag";
	public static final String SET_FIRST_CATEGORY_AS_TAG_DEFAULT  = "false";
	
	/**
	 * If set to true a deep cleanup of the xml input before parsing is done. Use this only
	 * when you experience problems with certain invalid feeds.
	 */
	public static final String DEEP_CLEANUP_PROPERTY = "deepXMLCleanUp";
	public static final String DEEP_CLEANUP_DEFAULT = "false";
	
	/**
	 * If set to true HTML tags are removed before setting the description.
	 */
	public static final String REMOVE_HTML_PROPERTY = "removeHTML";
	public static final String REMOVE_HTML_DEFAULT = "true";
	
	/**
	 * This Property determines if only the first or all images of an entry will be attached.
	 */
	public static final String ADD_ONLY_FIRST_IMAGE_PROPERTY = "addOnlyFirstImage";
	public static final String ADD_ONLY_FIRST_IMAGE_DEFAULT = "true";
	
	/**
	 * This Property determines if to follow the link in the post to obtain images.
	 */
	public static final String FOLLOW_LINK_TO_IMAGES_PROPERTY = "followLinkToImages";
	public static final String FOLLOW_LINK_TO_IMAGES_DEFAULT = "true";	
	
	/**
	 * If specified, all entries older than the given number of days will be skipped
	 */
	public static final String SKIP_OLDER_THAN_DAYS_PROPERTY = "skipOlderThanDays";
	
	/**
	 * If specified, add a maximum of X entries
	 */
	public static final String MAX_ENTRIES_PROPERTY = "maxEntries";
	
	/**
	 * Parse posts for given keywords and add given tag if found
	 * Format: Tag1:Keyword1,Keyword2;Tag2:Keyword3,Keyword4,Keyword5
	 */
	public static final String TAG_KEYWORDS_PROPERTY = "tagKeywords";
	public static final String TAG_KEYWORDS_DEFAULT = "";
	
	
	/**
	 * If specified, add this tag to all feed entries - otherwise add FeedTags.FEED_ENTRY_METATAG
	 */
	public static final String FEED_ENTRY_METATAG_PROPERTY = "entryMetaTag";
	public static final String FEED_ENTRY_METATAG_DEFAULT = "";
}
