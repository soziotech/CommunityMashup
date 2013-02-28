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
package org.sociotech.communitymashup.mashup.factory;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.sociotech.communitymashup.mashup.factory.facade.MashupFactoryFacade;
import org.sociotech.communitymashup.mashup.factory.impl.MashupFactoryImpl;
import org.sociotech.communitymashup.mashup.factory.servicetracker.MashupInstantiationServiceTracker;

/**
 * Activates the mashup factory bundle that tracks all mashup instantiation services. It opens up
 * an front end for uploading mashup configurations.
 * 
 * @author Peter Lachenmaier
 *
 */
public class MashupFactoryBundleActivator implements BundleActivator {

	private static BundleContext context;

	private ServiceRegistration<MashupFactoryFacade> registeredMashupFactory;

	private MashupInstantiationServiceTracker instantiationServiceTracker;

	private MashupFactoryImpl mashupFactory = null;
	
	public static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		MashupFactoryBundleActivator.context = bundleContext;
		
		// Create and register mashup factory
		mashupFactory  = new MashupFactoryImpl();
		registeredMashupFactory = context.registerService(MashupFactoryFacade.class, mashupFactory, null);
		
		// register instantiation service tracker
		instantiationServiceTracker = new MashupInstantiationServiceTracker(bundleContext, mashupFactory);
		instantiationServiceTracker.open();		
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		MashupFactoryBundleActivator.context = null;
	
		if(instantiationServiceTracker != null)
		{
			// close instantiation service tracker
			instantiationServiceTracker.close();
		}
		
		// stop the mashup factory
		mashupFactory.stop();
		
		// unregister mashup factory service
		registeredMashupFactory.unregister();
	}

}
