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
/**
 * 
 */
package org.sociotech.communitymashup.security.factory.facade.callback;

import org.sociotech.communitymashup.security.facade.SecurityServiceFacade;
import org.sociotech.communitymashup.security.factory.facade.SecurityFactoryServiceFacade;


/**
 * @author Peter Lachenmaier
 *
 * Implement this interface if you are using {@link SecurityFactoryServiceFacade#produceAsynchronous(org.sociotech.communitymashup.application.Security, org.sociotech.communitymashup.security.factory.facade.AsynchronousSecurityInstantiationCallback, Object)}
 * to be called back when the security service is instantiated. 
 */
public interface AsynchronousSecurityInstantiationCallback {
	
	/**
	 * This method will be called when the security service instantiation process is finished.
	 * 
	 * @param securityService The created security service instance.
	 * @param key Key provided at asynchronous call ({@link SourceFactoryServiceFacade#produceAsynchronous(String, AsynchronousSourceInstantiationCallback, Object)})
	 */
	public void securityServiceInstantiated(SecurityServiceFacade securityService, Object key);
}
