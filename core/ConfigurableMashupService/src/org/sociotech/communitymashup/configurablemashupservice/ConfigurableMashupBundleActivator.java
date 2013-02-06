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
package org.sociotech.communitymashup.configurablemashupservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.sociotech.communitymashup.configurablemashupservice.instantiation.MashupInstantiationService;
import org.sociotech.communitymashup.mashup.instantiation.facade.MashupInstantiationFacade;

/**
 * Activates the bundle and registers an mashup instantiation service.
 * 
 * @author Peter Lachenmaier
 *
 */
public class ConfigurableMashupBundleActivator implements BundleActivator {

	private static BundleContext context;

	private MashupInstantiationFacade instantiationService;

	private ServiceRegistration<MashupInstantiationFacade> instantiationServiceRegistration;
	
	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		ConfigurableMashupBundleActivator.context = bundleContext;
		
		// create instantiation service
		instantiationService = new MashupInstantiationService();
		
		// register instantiation service
		instantiationServiceRegistration = context.registerService(MashupInstantiationFacade.class, instantiationService, null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		ConfigurableMashupBundleActivator.context = null;
		
		// stop all instantiated mashup services
		instantiationService.stopAll();
		
		// unregister instantiation service
		instantiationServiceRegistration.unregister();
	}

}
