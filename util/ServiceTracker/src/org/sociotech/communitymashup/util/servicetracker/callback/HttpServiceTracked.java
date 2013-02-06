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
package org.sociotech.communitymashup.util.servicetracker.callback;

import org.osgi.service.http.HttpService;

/**
 * Callback interface for the http service tracker. Must be implemented to receive callbacks.
 * 
 * @author Peter Lachenmaier
 */
public interface HttpServiceTracked {

	/**
	 * Will be called if a http service is found.
	 * 
	 * @param httpService The found http service.
	 */
	void gotHttpService(HttpService httpService);

	/**
	 * Will be called when a http service gets removed.
	 * 
	 * @param httpService The removed http service.
	 */
	void lostHttpService(HttpService httpService);

}
