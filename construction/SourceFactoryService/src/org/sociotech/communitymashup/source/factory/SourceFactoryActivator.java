/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.factory;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;
import org.sociotech.communitymashup.source.factory.facade.SourceFactoryServiceFacade;
import org.sociotech.communitymashup.source.factory.impl.SourceFactoryServiceImpl;
import org.sociotech.communitymashup.source.factory.impl.SourceInstantiationServiceTracker;
import org.sociotech.communitymashup.source.instantiation.facade.SourceInstantiationFacade;


/**
 * Activates the source factory bundle.
 * 
 * @author Peter Lachenmaier
 */
public class SourceFactoryActivator implements BundleActivator {

	private static BundleContext context;

	private ServiceTracker instantiationServiceTracker;
	private ServiceRegistration sourceFactoryServiceRegistration;

	private SourceFactoryServiceImpl sourceFactory;

	/**
	 * Returns the bundle context
	 * 
	 * @return The bundle context
	 */
	public static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {

		SourceFactoryActivator.context = bundleContext;

		sourceFactory = new SourceFactoryServiceImpl();
		sourceFactoryServiceRegistration = bundleContext.registerService(SourceFactoryServiceFacade.class.getName(), sourceFactory, null);
		
		// create a tracker to collect source instantiation services
		SourceInstantiationServiceTracker sourceInstantiationServiceTracker = new SourceInstantiationServiceTracker(context, sourceFactory);
		instantiationServiceTracker = new ServiceTracker(context, SourceInstantiationFacade.class.getName(), sourceInstantiationServiceTracker);
		instantiationServiceTracker.open();

		// TODO check if instantiation services get lost if they are started before
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {

		// close instantiation service tracker
		instantiationServiceTracker.close();

		// stop source factory
		sourceFactory.stop();
		
		// unregister source factory service
		sourceFactoryServiceRegistration.unregister();

		SourceFactoryActivator.context = null;
	}
}
