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
package org.sociotech.communitymashup.source.mendeley.properties;

/**
 * This class contains string constants for properties used by mendeley source service.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyProperties {

	/**
     * The consumer secret in combination with the consumer key is used by mendeley to identify
     * the CommunityMashup as consuming application.
     */
	public static final String CONSUMER_KEY_PROPERTY 			= "consumerKey";
	public static final String CONSUMER_KEY_DEFAULT 			= "";
	public static final String CONSUMER_SECRET_PROPERTY 		= "consumerSecret";
	public static final String CONSUMER_SECRET_DEFAULT	 		= "";

	/**
     * The access secret in combination with the access token is used by mendeley to identify
     * and authorize the mendeley user.
     */
	public static final String ACCESS_TOKEN_PROPERTY 			= "accessToken";
	public static final String ACCESS_TOKEN_DEFAULT 			= "";
	public static final String ACCESS_TOKEN_SECRET_PROPERTY 	= "accessTokenSecret";
	public static final String ACCESS_TOKEN_SECRET_DEFAULT	 	= "";
	
	/**
	 * If this property is set to true, a command line authentication will be started if no access with the provided
	 * tokens is possible or they are missing. Should not be used in combination with {@link MendeleyProperties#ALLOW_UI_AUTHENTICATION}.
	 */
	public static final String ALLOW_COMMAND_LINE_AUTHENTICATION = "commandLineAuthentication";
	
	/**
	 * If this property is set to true, a authentication servlet will be registered if no access with the provided
	 * tokens is possible or they are missing. Should not be used in combination with {@link MendeleyProperties#ALLOW_COMMAND_LINE_AUTHENTICATION}.
	 */
	public static final String ALLOW_UI_AUTHENTICATION = "uiAuthentication";
	
	/**
	 * If this property is set to true all contacts of the account owner will be added.
	 */
	public static final String ADD_CONTACTS_PROPERTY			= "addContacts";
	
	/**
	 * If this property is set to true all private groups of the account owner will be added.
	 */
	public static final String ADD_PRIVATE_GROUPS_PROPERTY 		= "addPrivateGroups";
	
	/**
	 * This property can be used to restrict the included private groups to a defined set. A comma separated list of group names is expected. 
	 */
	public static final String RESTRICT_PRIVATE_GROUPS_PROPERTY = "restrictPrivateGroupsTo";
	
	/**
	 * If this property is set to true all documents contained in a mendeley group will be added. 
	 */
	public static final String ADD_GROUP_DOCUMENTS_PROPERTY 	= "addGroupDocuments";
	
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
	 * If this property is set to true files will be attached to documents if available.
	 */
	public static final String ATTACH_FILES_PROPERTY 	= "attachFiles";
	public static final String ATTACH_FILES_DEFAULT 	= "false";
}
