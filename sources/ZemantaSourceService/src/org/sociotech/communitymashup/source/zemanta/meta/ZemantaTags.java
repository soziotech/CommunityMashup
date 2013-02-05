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
package org.sociotech.communitymashup.source.zemanta.meta;

/**
 * This class contains string constants for tags used by the zemanta source service.
 * 
 * @author Peter Lachenmaier
 */
public class ZemantaTags {
	
	/**
	 * Meta tag that will be attached to every zemanta element
	 */
	public static String ZEMANTA_ELEMENT_METATAG = "zemanta_element";
	
	/**
	 * Meta tag that will be attached to every content object that is enriched using zemanta
	 */
	public static String ZEMANTA_ENRICHED_METATAG = "zemanta_enriched";
	
	/**
	 * Meta tag that will be attached to every image added by zemanta
	 */
	public static String ZEMANTA_IMAGE_METATAG = "zemanta_image";
	
	
}
