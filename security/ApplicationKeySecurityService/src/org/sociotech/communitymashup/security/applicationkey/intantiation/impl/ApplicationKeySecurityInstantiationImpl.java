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
package org.sociotech.communitymashup.security.applicationkey.intantiation.impl;

import org.eclipse.emf.ecore.EClass;
import org.sociotech.communitymashup.application.ApplicationKeyConfig;
import org.sociotech.communitymashup.application.ApplicationPackage;
import org.sociotech.communitymashup.application.Security;
import org.sociotech.communitymashup.security.applicationkey.impl.ApplicationKeySecurityServiceImpl;
import org.sociotech.communitymashup.security.applicationkey.intantiation.facade.ApplicationKeySecurityInstantiationFacade;
import org.sociotech.communitymashup.security.facade.SecurityServiceFacade;
import org.sociotech.communitymashup.security.instantiation.facade.impl.SecurityServiceInstantiationFacacadeImpl;

/**
 * Implementation of the instantiation service for application key security services.
 * 
 * @author Peter Lachenmaier
 */
public class ApplicationKeySecurityInstantiationImpl extends SecurityServiceInstantiationFacacadeImpl implements ApplicationKeySecurityInstantiationFacade {

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.security.applicationkey.intantiation.facade.ApplicationKeySecurityInstantiationFacade#instantiate(org.sociotech.communitymashup.application.ApplicationKeyConfig)
	 */
	@Override
	public SecurityServiceFacade instantiate(Security configuration) {
		
		if(configuration instanceof ApplicationKeyConfig)
		{
			// create new instance and return
			return new ApplicationKeySecurityServiceImpl((ApplicationKeyConfig) configuration);
		}
		
		// could not instantiate others
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.security.instantiation.facade.SecurityServiceInstantiationFacade#getInstantiatableSecurityClass()
	 */
	@Override
	public EClass getInstantiatableSecurityClass() {
		// can instantiatiat application key security services
		return ApplicationPackage.eINSTANCE.getApplicationKeyConfig();
	}
}
