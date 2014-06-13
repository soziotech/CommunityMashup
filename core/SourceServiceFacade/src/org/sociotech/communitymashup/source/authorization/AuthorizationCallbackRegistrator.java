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

import org.osgi.service.http.HttpService;
import org.sociotech.communitymashup.util.servicetracker.callback.HttpServiceTracked;

/**
 * Registers an authorization servlet.
 * 
 * @author Peter Lachenmaier
 *
 */
public class AuthorizationCallbackRegistrator implements HttpServiceTracked {
	
	/**
	 * Reference to the used http service.
	 */
	private HttpService usedHttpService = null;
	
	/**
	 * Reference to the authorization callback servlet 
	 */
	private AuthorizationCallbackServlet authorizationCallbackServlet;

	/**
	 * The url suffix to register the callback servlet.
	 */
	private String callbackUrlSuffix;
	
	/**
	 * Registers the given authorization servlet at a new unique url soon as a http service appears. If there is something registered
	 * at the given url, it will be replaced.
	 * 
	 * @param authorizationCallbackServlet Callback servlet to register
	 * @param callbackUrlSuffix Suffix of the (server) url to register the servlet at
	 */
	public AuthorizationCallbackRegistrator(AuthorizationCallbackServlet authorizationCallbackServlet, String callbackUrlSuffix) {
		this.authorizationCallbackServlet = authorizationCallbackServlet;
		this.callbackUrlSuffix = callbackUrlSuffix;
	}
	
	
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.util.servicetracker.callback.HttpServiceTracked#gotHttpService(org.osgi.service.http.HttpService)
	 */
	@Override
	public void gotHttpService(HttpService httpService) {
		
		if(authorizationCallbackServlet == null)
		{
			// nothing to do
			return;
		}
		
		// first unregister possibly earlier registered callbacks (maybe canceled authorization)
		unregisterAll();
		
		// register authorization callback servlet
		try {
			httpService.registerServlet(callbackUrlSuffix, authorizationCallbackServlet, null, null);
		} catch (Exception e) {
			// something happened -> do nothing
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
		
		try {
			usedHttpService.unregister(callbackUrlSuffix);
		} catch (Exception e) {
			// do nothing
		}
	}
}
