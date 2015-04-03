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
	
	public static final String MENDELEY_BASE_URL = "https://api.mendeley.com/";
	public static final String TOKEN_URL 		= "https://api.mendeley.com/oauth/token";

	// user specific methods: http://dev.mendeley.com/methods
	
	/**
	 * Profile of the authenticated user
	 */
	public static final String GET_AUTHENTICATED_USER_PROFILE 		= MENDELEY_BASE_URL + "profiles/me";

	/**
	 * Profile of a user depending on profile id
	 * 
	 * 1: profile_id
	 */
	public static final String GET_USER_PROFILE 		= MENDELEY_BASE_URL + "profiles/%s";

	/**
	 * Documents authored by the authenticated user
	 */
	public static final String GET_USER_AUTHORED 		= MENDELEY_BASE_URL + "documents?authored=true&view=all&limit=500";
	
	/**
	 * 1: document_id
	 */
	public static final String GET_DOCUMENT_DETAILS		= MENDELEY_BASE_URL + "documents/%s?view=all&limit=500";
	
	// TBD: noch nicht auf neue API angepasst
	/**
	 * 1: document_id
	 * 2: file_hash
	 * 3: group_id 
	 */
	public static String GET_GROUP_FILE_URL				= MENDELEY_BASE_URL + "library/documents/%s/file/%s/%s";
	
	// TBD: noch nicht auf neue API angepasst
	/**
	 * 1: document_id
	 * 2: file_hash
	 */
	public static String GET_AUTHORED_FILE_URL 			= MENDELEY_BASE_URL + "library/documents/%s/file/%s";
	
	// groups
	
	/**
	 * The groups of the authenticated user.
	 */
	public static String GET_USERS_GROUPS 				= MENDELEY_BASE_URL + "groups";
	
	/**
	 * The members of one group.
	 * 
	 * 1: group_id
	 */
	public static String GET_GROUP_PEOPLE				= MENDELEY_BASE_URL + "groups/%s/members";
	
	/**
	 * The documents of one group. Maximum of 500 documents.
	 * 
	 * 1: group_id
	 */
	public static String GET_GROUP_DOCUMENTS			= MENDELEY_BASE_URL + "documents?group_id=%s&view=all&limit=500";
	
	/**
	 * The details of one group.
	 * 
	 * 1: group_id
	 */
	public static String GET_GROUP_DETAILS 				= MENDELEY_BASE_URL + "groups/%s";

}
