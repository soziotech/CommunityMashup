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
package org.sociotech.communitymashup.security.instantiation.facade;

import org.eclipse.emf.ecore.EClass;
import org.sociotech.communitymashup.application.Security;
import org.sociotech.communitymashup.security.facade.SecurityServiceFacade;

/**
 * Interface for the instantiation of an application key security service.
 * 
 * @author Peter Lachenmaier
 */
public interface SecurityServiceInstantiationFacade {
	
	/**
	 * Instantiates a new security service based on the given configuration.
	 * 
	 * @param configuration Configuration of the to be instantiated security service
	 * @return The newly instantiated security service.
	 */
	public SecurityServiceFacade instantiate(Security configuration);
	
	/**
     * Returns the configuration eclass this instantiation service is capable of creating services for.
     *  
     * @return The configuration eclass this instantiation service is capable of creating services for.
     */
    public EClass getInstantiatableSecurityClass();
   
}
