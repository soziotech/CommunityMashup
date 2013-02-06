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
package org.sociotech.communitymashup.interfaceprovider.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.sociotech.communitymashup.interfaceprovider.instantiation.facade.InterfaceInstantiationServiceFacade;

/**
 * Abstract super class for all interface service activators.
 * 
 * @author Peter Lachenmaier
 */
public abstract class InterfaceServiceActivator implements BundleActivator {

	private static BundleContext context;

	/**
	 * Reference to the instantiation service got at {@link #start(BundleContext, InterfaceInstantiationServiceFacade)}
	 */
	private InterfaceInstantiationServiceFacade instantiationService = null;

	/**
	 * Reference to the registration of the interface instantiation service.
	 */
	private ServiceRegistration<?> interfaceInstantiationServiceRegistration = null;

	/**
	 * Returns the bundle context.
	 * 
	 * @return The bundle context.
	 */
	protected static BundleContext getContext() {
		return context;
	}

	/**
	 * Starts the bundle and registers the given interface instantiation service.
	 * 
	 * @param bundleContext Context of the bundle
	 * @param instantiationService Instantiation service for interfaces
	 */
	public void start(BundleContext bundleContext, InterfaceInstantiationServiceFacade instantiationService) {
		InterfaceServiceActivator.context = bundleContext;

		this.instantiationService = instantiationService;

		// register it
		interfaceInstantiationServiceRegistration  = context.registerService(InterfaceInstantiationServiceFacade.class.getName(), instantiationService, null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		InterfaceServiceActivator.context = null;

		// unregister interface instantiation service
		if(interfaceInstantiationServiceRegistration != null)
		{
			interfaceInstantiationServiceRegistration.unregister();
		}

		if(instantiationService != null)
		{
			// stop all instantiated interfaces
			instantiationService.stopAll();
		}
	}

}
