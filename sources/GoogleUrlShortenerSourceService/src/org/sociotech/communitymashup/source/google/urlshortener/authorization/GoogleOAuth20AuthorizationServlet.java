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
package org.sociotech.communitymashup.source.google.urlshortener.authorization;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sociotech.communitymashup.application.Property;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.application.SourceState;
import org.sociotech.communitymashup.source.authorization.AuthorizationCallbackRegistrator;
import org.sociotech.communitymashup.source.authorization.OAuth20AuthorizationServlet;
import org.sociotech.communitymashup.source.google.urlshortener.GoogleUrlShortenerSourceBundleActivator;
import org.sociotech.communitymashup.source.google.urlshortener.properties.GoogleUrlShortenerProperties;
import org.sociotech.communitymashup.util.servicetracker.HttpServiceTracker;

import com.google.api.client.extensions.appengine.http.UrlFetchTransport;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeRequestUrl;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeTokenRequest;
import com.google.api.client.googleapis.auth.oauth2.GoogleTokenResponse;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.urlshortener.UrlshortenerScopes;

/**
 * Google OAuth 2.0 specific authorization servlet.
 * 
 * @author Peter Lachenmaier
 */
public class GoogleOAuth20AuthorizationServlet extends OAuth20AuthorizationServlet {

	/**
	 * Serial version uid
	 */
	private static final long serialVersionUID = 4866014571031347693L;
	
	private AuthorizationCallbackRegistrator callbackRegistrator;

	private HttpServiceTracker httpServiceTracker;

	private GoogleAuthorizationCodeFlow authorizationFlow;

	// TODO make more generic to be used by other google specific source services.
	
	/**
	 * Creates a new google url shortener specific authorization servlet.
	 * 
	 * @param sourceConfiguration Configuration of the belonging source service.
	 */
	public GoogleOAuth20AuthorizationServlet(Source sourceConfiguration) {
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
		String clientID 		= sourceConfiguration.getPropertyValue(GoogleUrlShortenerProperties.CLIENT_ID_PROPERTY);
		String clientSecret 	= sourceConfiguration.getPropertyValue(GoogleUrlShortenerProperties.CLIENT_SECRET_PROPERTY);
		String redirectUri		= sourceConfiguration.getPropertyValueElseDefault(GoogleUrlShortenerProperties.REDIRECT_URI_PROPERTY, GoogleUrlShortenerProperties.REDIRECT_URI_DEFAULT);

		Set<String> scope = new HashSet<String>();
		scope.add(UrlshortenerScopes.URLSHORTENER);

		authorizationFlow = new GoogleAuthorizationCodeFlow.Builder(
				new UrlFetchTransport(), new JacksonFactory(), clientID, clientSecret, scope).build();

		GoogleAuthorizationCodeRequestUrl authUrl = authorizationFlow.newAuthorizationUrl();
		authUrl.setRedirectUri(redirectUri);
		
		// set the authorization url
		this.externalAuthorizationUrl = authUrl.toURL().toExternalForm();
		
		// TODO maybe move to super class
		
		 // create callback registrator
		callbackRegistrator = new AuthorizationCallbackRegistrator(new GoogleOAuth20CallbackServlet(this), "/auth/google");
		
		// enable it with a http service tracker
		httpServiceTracker = new HttpServiceTracker(GoogleUrlShortenerSourceBundleActivator.getContext(), callbackRegistrator);
		httpServiceTracker.open();
	
		super.doGet(req, resp);
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.authorization.OAuth20AuthorizationServlet#finishAuthorizationWithCode(java.lang.String)
	 */
	@Override
	public boolean finishAuthorizationWithCode(String callbackCode) {
		GoogleTokenResponse googleToken;
		// finish authorization
		try {
			// get property values from configuration
			String clientID 		= sourceConfiguration.getPropertyValue(GoogleUrlShortenerProperties.CLIENT_ID_PROPERTY);
			String clientSecret 	= sourceConfiguration.getPropertyValue(GoogleUrlShortenerProperties.CLIENT_SECRET_PROPERTY);
			String redirectUri		= sourceConfiguration.getPropertyValueElseDefault(GoogleUrlShortenerProperties.REDIRECT_URI_PROPERTY, GoogleUrlShortenerProperties.REDIRECT_URI_DEFAULT);

			GoogleAuthorizationCodeTokenRequest tokenRequest = new GoogleAuthorizationCodeTokenRequest(new NetHttpTransport(), new JacksonFactory(), clientID, clientSecret, callbackCode, redirectUri); 
			// execute request
			googleToken = tokenRequest.execute();
		} catch (IOException e) {
			// not successful
			return false;
		}
		
		if(googleToken == null || googleToken.getAccessToken() == null || googleToken.getAccessToken().isEmpty()) {
			// Got no access token
			return false;
		}
		
		// calc expiration time
		Long expirationTime = System.currentTimeMillis() + 1000 * googleToken.getExpiresInSeconds();
		
		//System.out.println("Access Token: " + googleToken.getAccessToken());
		
		// keep source state
		SourceState sourceState = sourceConfiguration.getState();
		// stop source for changes
		sourceConfiguration.setState(SourceState.STOPED);
		
		// store access token and make it unchangeable
		sourceConfiguration.addProperty(GoogleUrlShortenerProperties.ACCESS_TOKEN_PROPERTY, googleToken.getAccessToken());
		Property accessTokenProperty = sourceConfiguration.getProperty(GoogleUrlShortenerProperties.ACCESS_TOKEN_PROPERTY);
		accessTokenProperty.setChangeable(false);
		
		// store access token expiration date and make it unchangeable
		
		sourceConfiguration.addProperty(GoogleUrlShortenerProperties.ACCESS_TOKEN_EXPIRATION_PROPERTY, "" + expirationTime);
		Property accessTokenExpirationProperty = sourceConfiguration.getProperty(GoogleUrlShortenerProperties.ACCESS_TOKEN_EXPIRATION_PROPERTY);
		accessTokenExpirationProperty.setChangeable(false);

		// store refresh token and make it unchangeable
		sourceConfiguration.addProperty(GoogleUrlShortenerProperties.REFRESH_TOKEN_PROPERTY, googleToken.getRefreshToken());
		Property refreshTokenProperty = sourceConfiguration.getProperty(GoogleUrlShortenerProperties.REFRESH_TOKEN_PROPERTY);
		refreshTokenProperty.setChangeable(false);
				
		// reactivate source
		sourceConfiguration.setState(sourceState);
		
		// TODO unregister and cleanup
		
		return true;
	}
	
}
