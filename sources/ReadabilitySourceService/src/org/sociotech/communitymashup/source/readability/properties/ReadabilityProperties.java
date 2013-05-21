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
package org.sociotech.communitymashup.source.readability.properties;

/**
 * This class contains string constants for properties used by the
 * ReadabilitySourceService service.
 * 
 * @author Peter Lachenmaier
 */
public class ReadabilityProperties {

	/**
	 * The url of the participants service.
	 */
	public static final String API_URL_PROPERTY = "apiUrl";
	public static final String API_URL_PROPERTY_DEFAULT = "https://www.readability.com/api/content/v1/parser";

	/**
	 * API Key
	 */
	public static final String API_KEY_PROPERTY = "apiKey";
	
	/**
	 * Whether to add excerpt or not as content
	 */
	public static final String ADD_EXCERPT_PROPERTY = "addExcerpt";
	public static final String ADD_EXCERPT_DEFAULT = "false";

	/**
	 * Whether to add readable website content or not
	 */
	public static final String ADD_CONTENT_PROPERTY = "addContent";
	public static final String ADD_CONTENT_DEFAULT = "true";
	
	/**
	 * Whether to create and add the parsed author. Author parsing of Readability is
	 * not realy reliable.
	 */
	public static final String ADD_AUTHOR_PROPERTY = "addAuthor";
	public static final String ADD_AUTHOR_DEFAULT = "true";
	
	/**
	 * Whether to enrich content websites or not
	 */
	public static final String ENRICH_CONTENT_WEBSITE_PROPERTY = "enrichContent";
	public static final String ENRICH_CONTENT_WEBSITE_DEFAULT = "true";
	
	/**
	 * Whether to enrich person websites or not
	 */
	public static final String ENRICH_PERSON_WEBSITE_PROPERTY = "enrichPerson";
	public static final String ENRICH_PERSON_WEBSITE_DEFAULT = "true";
	
	/**
	 * Whether to enrich organization websites or not
	 */
	public static final String ENRICH_ORGANISATION_WEBSITE_PROPERTY = "enrichOrganisation";
	public static final String ENRICH_ORGANISATION_WEBSITE_DEFAULT = "true";
	
	/**
	 * Specific meta tag that is needed for a website to be processed.
	 */
	public static final String PROCESS_ONLY_WITH_METATAG_PROPERTY = "neededMetaTag";
	
}
