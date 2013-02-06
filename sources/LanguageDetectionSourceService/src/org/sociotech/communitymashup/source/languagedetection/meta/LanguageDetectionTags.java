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
package org.sociotech.communitymashup.source.languagedetection.meta;

/**
 * This class contains string constants for tags used by the language detection source service.
 * 
 * @author Peter Lachenmaier
 */
public class LanguageDetectionTags {
	
	/**
	 * Meta tag that will be attached to every content object for which language detection was successful.
	 */
	public static String LANGUAGE_DETECTED_METATAG = "language_detected";	
	
	/**
	 * Meta tag that will be attached to every content object for which language detection was unsuccessful.
	 */
	public static String LANGUAGE_UNDETECTED_METATAG = "language_undetected";	
	
}
