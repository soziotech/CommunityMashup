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
package org.sociotech.communitymashup.security.factory.servicetracker;

import org.eclipse.emf.ecore.EClass;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.sociotech.communitymashup.application.ApplicationPackage;
import org.sociotech.communitymashup.security.factory.impl.SecurityFactoryImpl;
import org.sociotech.communitymashup.security.instantiation.facade.SecurityServiceInstantiationFacade;

/**
 * This class tracks security instantiation services and sets it for the use with the
 * security factory provided to the constructor.
 * 
 * @author Peter Lachenmaier
 *
 */
public class SecurityInstantiationServiceTracker extends ServiceTracker<SecurityServiceInstantiationFacade, SecurityServiceInstantiationFacade> {

	/**
	 * The interface factory that needs the instantiation service.
	 */
	private SecurityFactoryImpl securityFactory;

	/**
	 * Creates security instantiation service tracker.
	 * 
	 * @param context The context of the bundle.
	 * @param securityFactory A concrete instance of a security factory
	 */
	public SecurityInstantiationServiceTracker(BundleContext context, SecurityFactoryImpl securityFactory) {
		super(context, SecurityServiceInstantiationFacade.class.getName(), null);
		this.securityFactory = securityFactory;
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#addingService(org.osgi.framework.ServiceReference)
	 */
	@Override
	public SecurityServiceInstantiationFacade addingService(ServiceReference<SecurityServiceInstantiationFacade> reference) {

		SecurityServiceInstantiationFacade service = context.getService(reference);

		if(service != null)
		{
			// get the instantiatable class to the right instantiation service
			EClass instatiatableClass = service.getInstantiatableSecurityClass();
			
			if(instatiatableClass == ApplicationPackage.eINSTANCE.getApplicationKeyConfig())
			{
				// set the instantiation service
				this.securityFactory.addApplicationKeyInstantiationService(service);
			}
			else if(instatiatableClass == ApplicationPackage.eINSTANCE.getOAuthConfig())
			{
				// set the instantiation service
				this.securityFactory.addOAuthInstantiationService(service);
			}
		}
		
		return service;
	}		

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#removedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void removedService(ServiceReference<SecurityServiceInstantiationFacade> reference, SecurityServiceInstantiationFacade service) {

		this.securityFactory.removeInstantiationService(service);
		
		super.removedService(reference, service);
	}
}
