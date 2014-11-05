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
package org.sociotech.communitymashup.interfaceprovider.restinterface.properties;

/**
 * Constant definition for html property keys 
 * 
 * @author Peter Lachenmaier
 */
public class HTMLProperties {
	/**
	 * The property for the template path
	 */
	public static final String TEMPLATE_PATH_PROPERTY = "templatePath";
	/**
	 * The property for the template path
	 */
	public static final String STYLE_PATH_PROPERTY = "stylePath";
	/**
	 * The property for the usage of custom templates
	 */
	public static final String CUSTOM_TEMPLATES_PROPERTY = "useCustomTemplates";
	/**
	 * The property for the usage of custom templates
	 */
	public static final String DEFAULT_CUSTOM_TEMPLATE_PROPERTY = "defaultCustomTemplate";
	/**
	 * The property for default wrapping
	 */
	public static final String DEFAULT_WRAP_PROPERTY = "defaultWrap";
	public static final String DEFAULT_WRAP_PROPERTY_DEFAULT = "true";
	
	/**
	 * The result mime type when using html template interface
	 */
	public static final String TEMPLATE_MIME_TYPE_PROPERTY = "templateMimeType";
	public static final String TEMPLATE_MIME_TYPE_DEFAULT  = "text/html";
	
	/**
	 * Default string properties for output messages in html.
	 */
	public static final String STRING_NO_OBJECTS = "No Objects.";
	public static final String STRING_UNSUPPORTED = "Unsupported type.";
	
	/**
	 * Relative path for getting url related resources (see CommunityMashupStyleResources)
	 */
	public static final String HTML_RESOURCE_PATH = "/style/htmlrest/";
}
