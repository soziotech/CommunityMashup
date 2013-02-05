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
package org.sociotech.communitymashup.source.mendeley.authorization;

import org.sociotech.communitymashup.application.Property;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.source.authorization.OAuthAuthorizationServlet;
import org.sociotech.communitymashup.source.mendeley.properties.MendeleyProperties;

import com.mendeley.oapi.services.oauth.MendeleyAccessToken;
import com.mendeley.oapi.services.oauth.MendeleyOAuthService;
import com.mendeley.oapi.services.oauth.MendeleyOAuthServiceFactory;
import com.mendeley.oapi.services.oauth.MendeleyRequestToken;

/**
 * Mendeley specific authorization servlet.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyAuthorizationServlet extends OAuthAuthorizationServlet {

	/**
	 * Serial version uid
	 */
	private static final long serialVersionUID = -7540109398241192133L;
	
	/**
	 * The request token used to create the authentication url. 
	 */
	private MendeleyRequestToken requestToken;

	/**
	 * The mendeley service for oAuth
	 */
	private MendeleyOAuthService oauthService;

	public MendeleyAuthorizationServlet(Source sourceConfiguration) {
		// set authentication url to null and set the field later
		super(sourceConfiguration, null);
		
		// get property values from configuration
		String consumerKey 		= sourceConfiguration.getPropertyValue(MendeleyProperties.CONSUMER_KEY_PROPERTY);
		String consumerSecret 	= sourceConfiguration.getPropertyValue(MendeleyProperties.CONSUMER_SECRET_PROPERTY);
				
		oauthService = MendeleyOAuthServiceFactory.getInstance().createMendeleyOAuthService(consumerKey, consumerSecret);
		
		requestToken = oauthService.getOAuthRequestToken();
		
		// set authentication url
        externalAuthorizationUrl = requestToken.getAuthorizationUrl();		
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.authentication.OAuthAuthenticationServlet#finishAuthentication(java.lang.String)
	 */
	@Override
	protected boolean finishAuthorization(String pin) {
		
		if(oauthService == null)
		{
			return false;
		}
		
		MendeleyAccessToken accessToken = null;
		
		// retrieve access token with request token from previous step
		try {
			accessToken = oauthService.getOAuthAccessToken(requestToken, pin);		
		} catch (Exception e) {
			return false;
		}

		if(accessToken == null)
		{
			// not successfull
			return false;
		}
		
		// store access token and secret and make them unchangeable
		sourceConfiguration.addProperty(MendeleyProperties.ACCESS_TOKEN_PROPERTY, accessToken.getToken());
		Property accessTokenProperty = sourceConfiguration.getProperty(MendeleyProperties.ACCESS_TOKEN_PROPERTY);
		accessTokenProperty.setChangeable(false);
		
		sourceConfiguration.addProperty(MendeleyProperties.ACCESS_TOKEN_SECRET_PROPERTY, accessToken.getTokenSecret());
		Property accessTokenSecretProperty = sourceConfiguration.getProperty(MendeleyProperties.ACCESS_TOKEN_SECRET_PROPERTY);
		accessTokenSecretProperty.setChangeable(false);
		
		return true;
	}
}
