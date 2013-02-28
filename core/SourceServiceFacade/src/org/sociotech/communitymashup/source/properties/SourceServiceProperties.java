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
package org.sociotech.communitymashup.source.properties;

/**
 * This class contains string constants for properties used by the qr code source service.
 * 
 * @author Peter Lachenmaier
 */
public class SourceServiceProperties {

 /**
	 * This Property determines if html is stripped from content objects or not
	 */
	public static final String REMOVE_HTML_PROPERTY = "removeHtml";
	public static final String REMOVE_HTML_DEFAULT = "false";
	
	/**
	 * This Property determines if non html & is stripped from content objects or not
	 */
	public static final String REMOVE_NON_HTML_AND_PROPERTY = "removeNonHtmlAnd";
	public static final String REMOVE_NON_HTML_AND_DEFAULT = "false";
	
	/**
	 * This Property determines if invalid xml characters are removed from content objects or not
	 */
	public static final String REMOVE_INVALID_XML_CHARACTER_PROPERTY = "removeInvalidXMLCharacters";
	public static final String REMOVE_INVALID_XML_CHARACTER_DEFAULT = "false";
	
	/**
	 * Key for property that allows tagging of all information object of this source service.
	 */
	public static final String TAG_ALL_INFORMATIONOBJECTS_PROPERTY = "tagInformationObjectsWith";
	
	/**
	 * Key for property that allows categorization of all information object of this source service.
	 */
	public static final String CATEGORIZE_ALL_INFORMATIONOBJECTS_PROPERTY = "categorizeInformationObjectsWith";
	
	/**
	 * Key for property that allows meta tagging of all items of this source service.
	 */
	public static final String META_TAG_ALL_IITEMS_PROPERTY = "metaTagItemsWith";
	
	/**
	 * Key for property to an url where the authentication for this source service can be created. 
	 */
	public static final String AUTHORIZATION_URL = "authorizationUrl";
}
