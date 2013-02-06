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
package org.sociotech.communitymashup.style.registrator;

import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.sociotech.communitymashup.util.servicetracker.callback.HttpServiceTracked;

/**
 * Class to register and unregister CommunityMashup wide style resources.
 * 
 * @author Peter Lachenmaier
 */
public class StyleRegistrator implements HttpServiceTracked {

	/**
	 * Local reference to the used http service.
	 */
	HttpService usedHttpService = null;
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.util.servicetracker.callback.HttpServiceTracked#gotHttpService(org.osgi.service.http.HttpService)
	 */
	@Override
	public void gotHttpService(HttpService httpService) {
		
		// register style files
		try {
			httpService.registerResources("/style", "/resources/style", null);
		} catch (NamespaceException e) {
			e.printStackTrace();
			// nothing to do
			return;
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
		
		// unregister styles
		httpService.unregister("/style");
	}

}
