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
package org.sociotech.communitymashup.source.zemanta.properties;

/**
 * This class contains string constants for properties used by the zemanta source service.
 * 
 * @author Peter Lachenmaier
 */
public class ZemantaProperties {

	/**
	 * This property is used to set the api key of the registered app at zemanta.
	 * Default key registered for CommunityMashup.
	 */
	public static final String ZEMANTA_API_KEY_PROPERTY = "apiKey";
	public static final String ZEMANTA_API_KEY_DEFAULT = "";
	
	/**
	 * Determines if categories retrieved from zemanta are added to contents
	 */
	public static final String CATEGORIZE_CONTENT_PROPERTY = "categorizeContent";
	public static final String CATEGORIZE_CONTENT_DEFAULT = "true";
	
	/**
	 * Determines if tags retrieved from zemanta are added to contents
	 */
	public static final String TAG_CONTENT_PROPERTY = "tagContent";
	public static final String TAG_CONTENT_DEFAULT = "true";
	
	/**
	 * Determines if related images retrieved from zemanta are attached to contents 
	 */
	public static final String ATTACH_IMAGES_PROPERTY = "attachImages";
	public static final String ATTACH_IMAGES_DEFAULT = "false";
	
	/**
	 * Determines how much related images should be retrieved from zemanta.
	 */
	public static final String MAXIMUM_IMAGES_PROPERTY = "maxImages";
	public static final String MAXIMUM_IMAGES_DEFAULT = "1";
	
	/**
	 * The minimum confidence neeeded for a zemanta result to be accepted.
	 */
	public static final String MINIMUM_COFIDENCE_PROPERTY = "minimumConfidence";
	public static final String MINIMUM_COFIDENCE_DEFAULT = "0.0";
	
	/**
	 * Determines if only contents without an image will be extended with aditional images.
	 */
	public static final String PROCESS_ONLY_CONTENT_WITHOUT_IMAGE_PROPERTY = "addImagesOnlyWithoutImage";
	public static final String PROCESS_ONLY_CONTENT_WITHOUT_IMAGE_DEFAULT = "true";
	
	/**
	 * Set a specific meta tag that is needed for a content to be processed.
	 */
	public static final String PROCESS_ONLY_CONTENT_WITH_METATAG_PROPERTY = "neededMetaTag";
	
}
