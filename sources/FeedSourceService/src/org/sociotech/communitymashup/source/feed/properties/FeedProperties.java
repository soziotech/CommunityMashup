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
	 * This Property determines if only the first or all images of an entry will be attached.
	 */
	public static final String ADD_ONLY_FIRST_IMAGE_PROPERTY = "addOnlyFirstImage";
	
	public static final String FEED_ENTRY_METATAG_PROPERTY = "entryMetaTag";
	public static final String FEED_ENTRY_METATAG_DEFAULT = "";
}
