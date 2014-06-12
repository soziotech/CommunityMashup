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
package org.sociotech.communitymashup.source.authorization;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.osgi.service.http.HttpService;
import org.sociotech.communitymashup.application.Property;
import org.sociotech.communitymashup.application.PropertyTypes;
import org.sociotech.communitymashup.util.servicetracker.callback.HttpServiceTracked;

/**
 * Registers an authorization servlet.
 * 
 * @author Peter Lachenmaier
 *
 */
public class OAuthAuthorizationRegistrator implements HttpServiceTracked {

	public final static String AUTHORIZATION_URL_PREFIX = "auth";
	/**
	 * Reference to the used http service.
	 */
	private HttpService usedHttpService = null;
	
	/**
	 * Random to create nonces
	 */
	private static Random random = new Random();
	
	/**
	 * Set of all used nonces to create unique authorization urls.
	 */
	private static Set<Integer> usedNonces = new HashSet<Integer>();
	
	/**
	 * Nonce used for this authorization. 
	 */
	private Integer authorizationNonce = null;
	
	/**
	 * Reference to the authorization Servlet 
	 */
	private SourceAuthorizationServlet authorizationServlet;
	
	/**
	 * Reference to the authorization Servlet
	 */
	private Property authorizationUrlProperty;
	
	/**
	 * Registers the given authorization servlet at a new unique url soon as a http service appears.
	 * 
	 * @param authorizationServlet Authorization servlet to register.
	 */
	public OAuthAuthorizationRegistrator(SourceAuthorizationServlet authorizationServlet) {
		this(authorizationServlet, null);
	}
	
	/**
	 * Registers the given authorization servlet at a new unique url soon as a http service appears and writes the
	 * url in the given property.
	 *
	 * @param authorizationServlet Authorization servlet to register.
	 * @param authorizationUrlProperty Property to write in the authorization url
	 */
	public OAuthAuthorizationRegistrator(SourceAuthorizationServlet authorizationServlet, Property authorizationUrlProperty) {
		this.authorizationServlet = authorizationServlet;
		this.authorizationUrlProperty = authorizationUrlProperty;
	}
	
	/**
	 * Returns the url where the authorization servlet can be reached. Null if not yet registered. 
	 * 
	 * @return The url where the authorization servlet can be reached. Null if not yet registered.
	 */
	public String getAuthorizationUrl()
	{
		if(authorizationNonce == null)
		{
			return null;
		}
		else
		{
			return "/" + AUTHORIZATION_URL_PREFIX + "/" + authorizationNonce;
		}
	}
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.util.servicetracker.callback.HttpServiceTracked#gotHttpService(org.osgi.service.http.HttpService)
	 */
	@Override
	public void gotHttpService(HttpService httpService) {
		
		if(authorizationServlet == null)
		{
			// nothing to do
			return;
		}
		
		// create nonce
		do
		{
			authorizationNonce = random.nextInt(900000) + 100000;
		}
		while(usedNonces.contains(authorizationNonce));
		
		// add it to used nonces
		usedNonces.add(authorizationNonce);
		
		String authorizationUrl = this.getAuthorizationUrl();
		
		// register authorization servlet
		try {
			httpService.registerServlet(authorizationUrl, authorizationServlet, null, null);
		} catch (Exception e) {
			// something happened -> reset authorization
			authorizationNonce = null;
			return;
		}
		
		// set authorization url in porperty
		if(authorizationUrlProperty != null)
		{
			authorizationUrlProperty.setValue(authorizationUrl);
			// set as authorization type
			authorizationUrlProperty.setPropertyType(PropertyTypes.AUTHORIZATION);
			// set as required
			authorizationUrlProperty.setRequired(true);
			// set not changeable, should be automatically removed after authorization
			authorizationUrlProperty.setChangeable(false);
		}
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.util.servicetracker.callback.HttpServiceTracked#lostHttpService(org.osgi.service.http.HttpService)
	 */
	@Override
	public void lostHttpService(HttpService httpService) {
		if(httpService != usedHttpService)
		{
			// nothing to do
			return;
		}
		
		unregisterAll();
	}
	
	/**
	 * Unregisters everything that was registered before.
	 */
	public void unregisterAll() {
		
		// TODO implement
	}
}
