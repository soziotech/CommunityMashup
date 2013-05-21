/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.readability.meta;

/**
 * This class contains string constants for tags used by the readability source service.
 * 
 * @author Peter Lachenmaier
 */
public class ReadabilityTags {
	
	/**
	 * Meta tag that will be attached to every created element.
	 */
	public static String READABILITY_METATAG = "readability";

	/**
	 * Meta tag that will be attached to every author.
	 */
	public static String AUTHOR_METATAG = "readability_author";

	/**
	 * Meta tag that will be attached to every excerpt content.
	 */
	public static String EXCERPT_METATAG = "readability_excerpt";

	/**
	 * Meta tag that will be attached to every full content.
	 */
	public static String CONTENT_METATAG = "readability_content";

	/**
	 * Meta tag that will be attached to every lead image.
	 */
	public static String LEAD_IMAGE_METATAG = "readability_lead_image";

	/**
	 * Meta tag that will be attached to every connection from person to created content.
	 */
	public static String PC_CONNECTION_METATAG = "readability_person_content_con";

	/**
	 * Meta tag that will be attached to every connection from organisation to created content.
	 */
	public static String OC_CONNECTION_METATAG = "readability_org_content_con";

	/**
	 * Meta tag that will be attached to every connection from content to created content.
	 */
	public static String CC_CONNECTION_METATAG = "readability_content_content_con";

}
