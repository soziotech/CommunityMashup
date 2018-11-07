/*******************************************************************************
 * Copyright (c) 2015 Michael Koch - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Koch - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.mediatum.properties;

/**
 * This class contains string constants for properties used by mediatum source service.
 * 
 * @author Michael Koch
 */
public class MediaTUMProperties {

	public static final String API_URL_PROPERTY		= "baseUrl";
	public static final String API_URL_PROPERTY_DEFAULT = "";

	public static final String API_CACHE_FILE_PREFIX_PROPERTY	= "apiCacheFilePrefix";
	

	/**
	 * If this property is set to true persons for document authors will be created. 
	 */
	public static final String CREATE_AUTHOR_PERSONS_PROPERTY 	= "createAuthorPersons";
	public static final String CREATE_AUTHOR_PERSONS_DEFAULT 	= "true";
	
	/**
	 * If this property is set to true persons for document editors will be created. 
	 */
	public static final String CREATE_EDITOR_PERSONS_PROPERTY 	= "createEditorPersons";
	public static final String CREATE_EDITOR_PERSONS_DEFAULT 	= "true";
	
	/**
	 * If this property is set only objects with year => minYear will be imported. 
	 */
	public static final String MIN_YEAR_PROPERTY 	= "minYear";
	public static final String MIN_YEAR_DEFAULT 	= "";
	
	/**
	 * If this property is set to true organizations will be added as organization objects.
	 */
	public static final String ADD_INSTITUTE_AS_TAG_PROPERTY 	= "addInstituteAsTag";
	public static final String ADD_INSTITUTE_AS_TAG_DEFAULT 	= "false";
	
	/**
	 * If this property is set to true organizations will be added as organization objects.
	 */
	public static final String ADD_ORGANIZATIONS_PROPERTY 	= "addOrganizations";
	public static final String ADD_ORGANIZATIONS_DEFAULT 	= "false";
	
	/**
	 * If this property is set to true files will be attached to documents if available.
	 */
	public static final String ATTACH_FILES_PROPERTY 	= "attachFiles";
	public static final String ATTACH_FILES_DEFAULT 	= "false";
}
