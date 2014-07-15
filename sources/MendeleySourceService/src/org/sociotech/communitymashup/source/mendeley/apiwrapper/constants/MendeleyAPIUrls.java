/*******************************************************************************
 * Copyright (c) 2014 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.mendeley.apiwrapper.constants;

/**
 * This class contains constants for all needed urls to communicate with the Mendeley API.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyAPIUrls {
	
	public static final String MENDELEY_BASE_URL = "https://api-oauth2.mendeley.com/oapi/";
	public static final String TOKEN_URL 		= "https://api-oauth2.mendeley.com/oauth/token";

	// user specific methods: http://apidocs.mendeley.com/home/user-specific-methods
	
	/**
	 * Profile of the authenticated user
	 */
	public static final String GET_USER_PROFILE 		= MENDELEY_BASE_URL + "profiles/info/me";

	/**
	 * Documents authored by the authenticated user
	 */
	public static final String GET_USER_AUTHORED 		= MENDELEY_BASE_URL + "library/documents/authored";
	
	/**
	 * 1: document_id
	 */
	public static final String GET_DOCUMENT_DETAILS		= MENDELEY_BASE_URL + "library/documents/%s";
	
	/**
	 * 1: document_id
	 * 2: file_hash
	 * 3: group_id 
	 */
	public static String GET_GROUP_FILE_URL				= MENDELEY_BASE_URL + "library/documents/%s/file/%s/%s";
	
	/**
	 * 1: document_id
	 * 2: file_hash
	 */
	public static String GET_AUTHORED_FILE_URL 			= MENDELEY_BASE_URL + "library/documents/%s/file/%s";
	
	// users library groups
	
	/**
	 * The groups of the authenticated user.
	 * 
	 * http://apidocs.mendeley.com/home/user-specific-methods/user-library-groups
	 */
	public static String GET_USERS_GROUPS 				= MENDELEY_BASE_URL + "library/groups";
	
	/**
	 * The members of the one users library group.
	 * 
	 * 1: group_id
	 */
	public static String GET_USERS_GROUPS_PEOPLE		= MENDELEY_BASE_URL + "library/groups/%s/people";
	
	/**
	 * The documents of one group. Maximum of 10000 documents.
	 * 
	 * 1: group_id
	 */
	public static String GET_GROUP_DOCUMENTS			= MENDELEY_BASE_URL + "library/groups/%s?page=0&items=10000";
	
	/**
	 * Details of one group document
	 * 
	 * 1: group_id
	 * 2: document_id
	 */
	public static String GET_GROUP_DOCUMENT_DETAILS		= MENDELEY_BASE_URL + "library/groups/%s/%s";
	
	// public groups
	
	/**
	 * The documents with details of one public group. Maximum of 10000 documents.
	 * 
	 * 1: public_group_id
	 */
	public static String GET_PUBLIC_GROUP_DOCUMENTS_WITH_DETAILS = MENDELEY_BASE_URL + "documents/groups/%s/docs/?details=true&items=10000";
	
	/**
	 * The details of one public group.
	 * 
	 * 1: public_group_id
	 */
	public static String GET_PUBLIC_GROUP_DETAILS 				= MENDELEY_BASE_URL + "documents/groups/%s";
	
	/**
	 * The members of the public group.
	 * 
	 * 1: group_id
	 */
	public static String GET_PUBLIC_GROUP_PEOPLE				= MENDELEY_BASE_URL + "documents/groups/%s/people";

}
