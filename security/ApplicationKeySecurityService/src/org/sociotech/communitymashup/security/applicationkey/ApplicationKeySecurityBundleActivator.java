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
package org.sociotech.communitymashup.security.applicationkey;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.sociotech.communitymashup.security.applicationkey.intantiation.impl.ApplicationKeySecurityInstantiationImpl;
import org.sociotech.communitymashup.security.instantiation.facade.SecurityServiceInstantiationFacade;

/**
 * Activation for the application key security service.
 * 
 * @author Peter Lachenamier
 */
public class ApplicationKeySecurityBundleActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	private ApplicationKeySecurityInstantiationImpl instantiationService;
	private ServiceRegistration<SecurityServiceInstantiationFacade> instantiationServiceRegistration;

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		ApplicationKeySecurityBundleActivator.context = bundleContext;
		
		// create and register instantiation service
		instantiationService = new ApplicationKeySecurityInstantiationImpl();
		
		instantiationServiceRegistration = context.registerService(SecurityServiceInstantiationFacade.class, instantiationService, null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		
		// unregister the instantiation service
		if(instantiationServiceRegistration != null)
		{
			instantiationServiceRegistration.unregister();
		}
		
		ApplicationKeySecurityBundleActivator.context = null;
	}

}
