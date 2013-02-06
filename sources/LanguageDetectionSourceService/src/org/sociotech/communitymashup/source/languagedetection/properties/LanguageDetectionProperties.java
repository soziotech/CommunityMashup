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
package org.sociotech.communitymashup.source.languagedetection.properties;

/**
 * This class contains string constants for properties used by the language detection source service.
 * 
 * @author Peter Lachenmaier
 */
public class LanguageDetectionProperties {

	/**
	 * This property is used to set the api key of the registration at detectlanguage.com.
	 */
	public static final String DETECTLANGUAGE_API_KEY_PROPERTY = "apiKey";
	public static final String DETECTLANGUAGE_API_KEY_DEFAULT = "";
	
	/**
	 * Determines if the locale attribute should be set.
	 */
	public static final String SET_LOCALE_ATTRIBUTE_PROPERTY = "setLocale";
	public static final String SET_LOCALE_ATTRIBUTE_DEFAULT = "true";
	
	/**
	 * Determines if the language should be added as meta tag.
	 */
	public static final String LANGUAGE_METATAG_PROPERTY = "languageMetaTag";
	public static final String LANGUAGE_METATAG_DEFAULT = "true";
	
	/**
	 * The minimum confidence needed for a language detection result to be accepted.
	 */
	public static final String MINIMUM_COFIDENCE_PROPERTY = "minimumConfidence";
	public static final String MINIMUM_COFIDENCE_DEFAULT = "0.75";
		
	/**
	 * Set a specific meta tag that is needed for a content to be processed.
	 */
	public static final String PROCESS_ONLY_CONTENT_WITH_METATAG_PROPERTY = "neededMetaTag";
	
}
