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
     * The client secret in combination with the client key is used by mendeley to identify
     * the CommunityMashup as consuming application.
     */
	public static final String CLIENT_ID_PROPERTY 			= "clientID";
	public static final String CLIENT_ID_DEFAULT 			= "";
	public static final String CLIENT_SECRET_PROPERTY 		= "clientSecret";
	public static final String CLIENT_SECRET_DEFAULT	 	= "";
	public static final String REDIRECT_URI_PROPERTY		= "redirectUrl";
	public static final String REDIRECT_URI_DEFAULT			= "http://localhost:8080/auth/mendeley";
	
	/**
     * The access access token is used by mendeley to identify
     * and authorize the mendeley user.
     */
	public static final String ACCESS_TOKEN_PROPERTY 			= "accessToken";
	public static final String ACCESS_TOKEN_DEFAULT 			= "";
	
	/**
     * The access refresh token is used by mendeley to refresh the access token.
     */
	public static final String REFRESH_TOKEN_PROPERTY 			= "refreshToken";
	public static final String REFRESH_TOKEN_DEFAULT 			= "";

	/**
     * The expiration date of the access token in millis.
     */
	public static final String ACCESS_TOKEN_EXPIRATION_PROPERTY		= "accessTokenExpiration";
	public static final String ACCESS_TOKEN_EXPIRATION_DEFAULT		= "0";
		
	/**
	 * If this property is set to true, a authentication servlet will be registered if no access with the provided
	 * tokens is possible or they are missing. Should not be used in combination with {@link MendeleyProperties#ALLOW_COMMAND_LINE_AUTHENTICATION}.
	 */
	public static final String ALLOW_UI_AUTHENTICATION = "uiAuthentication";
	
	/**
	 * If this property is set to true all authored publication will be added
	 */
	public static final String ADD_AUTHORED_PUBLICATIONS_PROPERTY			= "addAuthoredPublications";
	public static final String ADD_AUTHORED_PUBLICATIONS_DEFAULT			= "false";
	
	/**
	 * If this property is set to true all private groups of the account owner will be added.
	 */
	public static final String ADD_PRIVATE_GROUPS_PROPERTY 		= "addPrivateGroups";
	
	/**
	 * If this property is set to true all public groups of the account owner will be added.
	 */
	public static final String ADD_PUBLIC_GROUPS_PROPERTY 		= "addPublicGroups";
	
	/**
	 * This property is used to specify the ids of the included public groups. Comma separated list. 
	 */
	public static final String PUBLIC_GROUP_IDS_PROPERTY = "publicGroupIds";
	
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
	 * If this property is set to true organisations for groups will be created. 
	 */
	public static final String CREATE_GROUP_ORGANISATIONS_PROPERTY 	= "createGroupOrganisations";
	public static final String CREATE_GROUP_ORGANISATIONS_DEFAULT 	= "true";
	
	/**
	 * If this property is set to true members of the groups will be created as persons. 
	 */
	public static final String CREATE_GROUP_MEMBERS_PROPERTY 	= "createGroupPersons";
	public static final String CREATE_GROUP_MEMBERS_DEFAULT 	= "true";
	
	/**
	 * If this property is set to true a person for the account owner will be created.
	 */
	public static final String CREATE_ACCOUNT_OWNER_PROPERTY 	= "createAccountOwner";
	public static final String CREATE_ACCOUNT_OWNER_DEFAULT 	= "true";
	
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
