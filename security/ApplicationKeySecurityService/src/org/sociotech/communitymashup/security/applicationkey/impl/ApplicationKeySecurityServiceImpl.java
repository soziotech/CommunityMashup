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
package org.sociotech.communitymashup.security.applicationkey.impl;

import javax.servlet.http.HttpServletRequest;

import org.sociotech.communitymashup.application.ApplicationKeyConfig;
import org.sociotech.communitymashup.security.applicationkey.facade.ApplicationKeySecurityServiceFacade;

/**
 * Implementation of the basic application key security service.
 * 
 * @author Peter Lachenmaier
 */
public class ApplicationKeySecurityServiceImpl implements
		ApplicationKeySecurityServiceFacade {

	/**
	 * Name of the application key attribute. 
	 */
	public static final String APPLICATION_KEY_ATTRIBUTE_NAME = "appKey";

	private static final String MIDDLE_PARAMETER_REGEX = "&" + APPLICATION_KEY_ATTRIBUTE_NAME +"=\\w*&";

	private static final String FIRST_PARAMETER_REGEX = "(\\?)" + APPLICATION_KEY_ATTRIBUTE_NAME +"=\\w*&";

	private static final String LAST_PARAMETER_REGEX = "((\\?)|(&))" + APPLICATION_KEY_ATTRIBUTE_NAME +"=\\w*$";
	
	/**
	 * Local reference to the configuration
	 */
	private ApplicationKeyConfig configuration;

	/**
	 * Creates a new application key security instance from the given configuration.
	 * 
	 * @param configuration Configuration of the application key security
	 */
	public ApplicationKeySecurityServiceImpl(ApplicationKeyConfig configuration) {
		this.configuration = configuration;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.security.facade.SecurityServiceFacade#isRequestAlowed(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public boolean isRequestAlowed(HttpServletRequest request) {
		
		if(request == null)
		{
			return false;
		}
		
		String setAppKey = null;
		
		Object appKeyAttribute = request.getParameter(APPLICATION_KEY_ATTRIBUTE_NAME);
		
		if(appKeyAttribute instanceof String)
		{
			setAppKey = (String) appKeyAttribute;
			// remove it when it was set correctly
			// TODO find a solution to remove parameter from request, to not need a new method call
		}
		
		// check if app key is in configuration
		if(configuration.hasApplicationKey(setAppKey))
		{
			return true;
		}
		
		return false;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.security.facade.SecurityServiceFacade#cleanUpRequestURL(java.lang.String)
	 */
	@Override
	public String cleanUpRequestURL(String requestURL) {
		if(requestURL == null)
		{
			return null;
		}

		// remove the application key parameter
		
		// parameter can be on three different positions
		
		// last parameter
		String result = requestURL.replaceAll(LAST_PARAMETER_REGEX, "");
		
		// first parameter with following parameters
		result = result.replaceAll(FIRST_PARAMETER_REGEX, "?");
		
		// parameter in the middle with following parameters
		result = result.replaceAll(MIDDLE_PARAMETER_REGEX, "&");
				
		return result;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.security.facade.SecurityServiceFacade#filterRequestResults(javax.servlet.http.HttpServletRequest, java.lang.Object)
	 */
	@Override
	public Object filterRequestResults(HttpServletRequest request, Object result) {
		// no filtering, simply return the input
		return result;
	}
}
