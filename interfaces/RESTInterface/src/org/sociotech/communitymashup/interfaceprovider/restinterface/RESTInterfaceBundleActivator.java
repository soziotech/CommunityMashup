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
package org.sociotech.communitymashup.interfaceprovider.restinterface;

import org.osgi.framework.BundleContext;
import org.sociotech.communitymashup.interfaceprovider.impl.InterfaceServiceActivator;
import org.sociotech.communitymashup.interfaceprovider.restinterface.instantiation.impl.RESTInterfaceInstantiationService;

/**
 * Activates the rest interface bundle and creates and registers a new instantiation service for rest interfaces.
 * 
 * @author Peter Lachenmaier
 */
public class RESTInterfaceBundleActivator extends InterfaceServiceActivator 
{
	/**
	 * Keeps a reference to the rest interface instantiation service
	 */
	private RESTInterfaceInstantiationService instantiationService = null;

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {

		// create new rest interface instantiation service
		instantiationService =  new RESTInterfaceInstantiationService(bundleContext);

		// use super constructor for registration and everything else
		super.start(bundleContext, instantiationService);
	}
}
