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

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.Token;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;
import org.sociotech.communitymashup.application.Property;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.application.SourceState;
import org.sociotech.communitymashup.source.authorization.AuthorizationCallbackRegistrator;
import org.sociotech.communitymashup.source.authorization.OAuth20AuthorizationServlet;
import org.sociotech.communitymashup.source.mendeley.MendeleySourceBundleActivator;
import org.sociotech.communitymashup.source.mendeley.oauth20.MendeleyOAuth20AccessToken;
import org.sociotech.communitymashup.source.mendeley.oauth20.MendeleyOAuth20Api;
import org.sociotech.communitymashup.source.mendeley.properties.MendeleyProperties;
import org.sociotech.communitymashup.util.servicetracker.HttpServiceTracker;

/**
 * Mendeley OAuth 2.0 specific authorization servlet.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyOAuth20AuthorizationServlet extends OAuth20AuthorizationServlet {

	/**
	 * Serial version uid
	 */
	private static final long serialVersionUID = 4866014571031347693L;
	
	private AuthorizationCallbackRegistrator callbackRegistrator;

	private HttpServiceTracker httpServiceTracker;

	private OAuthService oAuthService;

	public MendeleyOAuth20AuthorizationServlet(Source sourceConfiguration) {
		// set authentication url to null and set the field later
		super(sourceConfiguration, null);
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.authorization.OAuth20AuthorizationServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		// get property values from configuration
		String clientID 		= sourceConfiguration.getPropertyValue(MendeleyProperties.CLIENT_ID_PROPERTY);
		String clientSecret 	= sourceConfiguration.getPropertyValue(MendeleyProperties.CLIENT_SECRET_PROPERTY);
		String redirectUri		= sourceConfiguration.getPropertyValueElseDefault(MendeleyProperties.REDIRECT_URI_PROPERTY, MendeleyProperties.REDIRECT_URI_DEFAULT);

		oAuthService = new ServiceBuilder().provider(MendeleyOAuth20Api.class)
										.apiKey(clientID)
										.apiSecret(clientSecret)
										.callback(redirectUri)
										.debug()
										.build();

		// set the authorization url
		this.externalAuthorizationUrl = oAuthService.getAuthorizationUrl(null);

		
		// TODO maybe move to super class
		
		 // create callback registrator
		callbackRegistrator = new AuthorizationCallbackRegistrator(new MendeleyOAuth20CallbackServlet(this), "/auth/mendeley");
		
		// enable it with a http service tracker
		httpServiceTracker = new HttpServiceTracker(MendeleySourceBundleActivator.getContext(), callbackRegistrator);
		httpServiceTracker.open();
		
	
		super.doGet(req, resp);
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.authorization.OAuth20AuthorizationServlet#finishAuthorizationWithCode(java.lang.String)
	 */
	@Override
	public boolean finishAuthorizationWithCode(String callbackCode) {
		// finish authorization
		Token accessToken = oAuthService.getAccessToken(null, new Verifier(callbackCode));
		
		if(accessToken == null || accessToken.getToken() == null || accessToken.getToken().isEmpty()) {
			// Got no access token
			return false;
		}
		
		//System.out.println("Access Token: " + accessToken.getToken());
		
		// keep source state
		SourceState sourceState = sourceConfiguration.getState();
		// stop source for changes
		sourceConfiguration.setState(SourceState.STOPED);
		
		// get refresh token and expiration from raw result
		MendeleyOAuth20AccessToken mendeleyToken = new MendeleyOAuth20AccessToken(accessToken.getRawResponse());
		
		// store access token and make it unchangeable
		sourceConfiguration.addProperty(MendeleyProperties.ACCESS_TOKEN_PROPERTY, accessToken.getToken());
		Property accessTokenProperty = sourceConfiguration.getProperty(MendeleyProperties.ACCESS_TOKEN_PROPERTY);
		accessTokenProperty.setChangeable(false);
		
		// store access token expiration date and make it unchangeable
		sourceConfiguration.addProperty(MendeleyProperties.ACCESS_TOKEN_EXPIRATION_PROPERTY, "" + mendeleyToken.getExpiration().getTime());
		Property accessTokenExpirationProperty = sourceConfiguration.getProperty(MendeleyProperties.ACCESS_TOKEN_EXPIRATION_PROPERTY);
		accessTokenExpirationProperty.setChangeable(false);

		// store refresh token and make it unchangeable
		sourceConfiguration.addProperty(MendeleyProperties.REFRESH_TOKEN_PROPERTY, mendeleyToken.getRefreshToken());
		Property refreshTokenProperty = sourceConfiguration.getProperty(MendeleyProperties.REFRESH_TOKEN_PROPERTY);
		refreshTokenProperty.setChangeable(false);
				
		// reactivate source
		sourceConfiguration.setState(sourceState);
		
		// TODO unregister and cleanup
		
		return true;
	}
	
}
