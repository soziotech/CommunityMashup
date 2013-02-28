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
package org.sociotech.communitymashup.security.factory;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.security.factory.facade.SecurityFactoryServiceFacade;
import org.sociotech.communitymashup.security.factory.impl.SecurityFactoryImpl;
import org.sociotech.communitymashup.security.factory.servicetracker.SecurityInstantiationServiceTracker;

/**
 * Activator of the security factory.
 * 
 * @author Peter Lachenmaier
 */
public class SecurityFactoryBundleActivator implements BundleActivator {

	private static BundleContext context;

	/**
	 * Returns the bundle context.
	 * @return The bundle context.
	 */
	public static BundleContext getContext() {
		return context;
	}

	private ServiceRegistration<SecurityFactoryServiceFacade> registeredSecurityFactory;
	private SecurityInstantiationServiceTracker securityInstantiationServiceTracker;
	private SecurityFactoryImpl securityFactory;

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		SecurityFactoryBundleActivator.context = bundleContext;
		
		securityFactory = new SecurityFactoryImpl();
		registeredSecurityFactory = context.registerService(SecurityFactoryServiceFacade.class, securityFactory, null);
		
		securityFactory.log("Registered security factory service.", LogService.LOG_INFO);
		
		// register security instantiation service tracker
		securityInstantiationServiceTracker = new SecurityInstantiationServiceTracker(bundleContext, securityFactory);
		securityInstantiationServiceTracker.open();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		
		// close service tracker
		if(securityInstantiationServiceTracker != null)
		{
			securityInstantiationServiceTracker.close();
		}
		
		// stop factory
		securityFactory.stop();
		
		// unregister factory
		registeredSecurityFactory.unregister();
		
		SecurityFactoryBundleActivator.context = null;
	}
}
