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
package org.sociotech.communitymashup.source.google.urlshortener.properties;

/**
 * This class contains string constants for properties used by the qr code source service.
 * 
 * @author Peter Lachenmaier
 */
public class GoogleUrlShortenerProperties {

	/**
     * The client secret in combination with the client key is used by google to identify
     * the CommunityMashup as consuming application.
     */
	public static final String CLIENT_ID_PROPERTY 			= "clientID";
	public static final String CLIENT_SECRET_PROPERTY 		= "clientSecret";
	public static final String REDIRECT_URI_PROPERTY		= "redirectUrl";
	public static final String REDIRECT_URI_DEFAULT			= "http://localhost:8080/auth/google";
	
	/**
     * The access access token is used by google to identify
     * and authorize the google user.
     */
	public static final String ACCESS_TOKEN_PROPERTY 			= "accessToken";
	public static final String ACCESS_TOKEN_DEFAULT 			= "";
	
	/**
     * The access refresh token is used by google to refresh the access token.
     */
	public static final String REFRESH_TOKEN_PROPERTY 			= "refreshToken";
	public static final String REFRESH_TOKEN_DEFAULT 			= "";

	/**
     * The expiration date of the access token in millis.
     */
	public static final String ACCESS_TOKEN_EXPIRATION_PROPERTY		= "accessTokenExpiration";
	public static final String ACCESS_TOKEN_EXPIRATION_DEFAULT		= "0";
		
	/**
     * The name of the registered application
     */
	public static final String APPLICATION_NAME_PROPERTY 			= "applicationName";
	public static final String APPLICATION_NAME_DEFAULT 			= "CommunityMashup URL Shortener ";
	
	/**
     * Whether to retrieve history and reuse already shortened urls.
     */
	public static final String USE_HISTORY_PROPERTY 				= "useHistory";
	public static final String USE_HISTORY_DEFAULT 			= "true";
	
	/**
	 * If this property is set to true, a authentication servlet will be registered if no access with the provided
	 * tokens is possible or they are missing.
	 */
	public static final String ALLOW_UI_AUTHENTICATION = "uiAuthentication";
	
    /**
	 * Specific meta tag that is needed for a web site object to be processed.
	 */
	public static final String PROCESS_WEBSITE_ONLY_WITH_METATAG_PROPERTY = "neededWebSiteMetaTag";
}
