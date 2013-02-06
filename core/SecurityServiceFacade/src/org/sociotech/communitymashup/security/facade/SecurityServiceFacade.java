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
package org.sociotech.communitymashup.security.facade;

import javax.servlet.http.HttpServletRequest;

/**
 * (Java) Interface that must be provided by every CommunityMashup security service.
 *  
 * @author Peter Lachenmaier
 */
public interface SecurityServiceFacade {
	/**
	 * Checks if the given request is valid and allowed.
	 * 
	 * @param request Http Request
	 * @return True if valid and allowed, false otherwise.
	 */
	public boolean isRequestAlowed(HttpServletRequest request);
	
	/**
	 * Removes all security parameters from the given request url.
	 * 
	 * @param requestURL Request url to remove security parameters from
	 * @return The request url without security parameters.
	 */
	public String cleanUpRequestURL(String requestURL);
	
	/**
	 * Filters out all objects from the result that are not allowed to access.
	 * 
	 * @param request Request
	 * @param result Unfiltered result. Can be a single item or a list of items
	 * @return The filtered result or null if the given result is a single object that can not be accessed.
	 */
	public Object filterRequestResults(HttpServletRequest request, Object result);
}
