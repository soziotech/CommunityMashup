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
package org.sociotech.communitymashup.source.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.source.instantiation.facade.SourceInstantiationFacade;

/**
 * Abstract source service activator that simple implementation registers an
 * source instantiation service at start up and unregisters it at stop.
 * 
 * @author Peter Lachenmaier
 * 
 */
public abstract class SourceBundleActivator implements BundleActivator {

	private static BundleContext context;
	protected SourceInstantiationFacade sourceInstantiationService;
	// private ServiceTracker logServiceTracker;
	private ServiceRegistration<SourceInstantiationFacade> sourceInstantiationServiceRegistration;

	/**
	 * Returns the context of the bundle of this activator.
	 * 
	 * @return The context of the bundle of this activator.
	 */
	public static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext arg0) throws Exception {
		// logging stop action
		this.log("Unregistering source instantiation service: "
				+ sourceInstantiationService, LogService.LOG_INFO);

		// reset context
		context = null;

		// unregister service
		sourceInstantiationServiceRegistration.unregister();

		// close log service tracker
		// logServiceTracker.close();
	}

	private void log(String message, int level) {
		// TODO replace
		System.out.println(message);
	}

	/**
	 * Registers the given source instantiation service.
	 * 
	 * @param bundleContext
	 *            Bundle context
	 * @param sourceInstantiationService
	 *            A source instantiation service
	 */
	public void start(BundleContext bundleContext,
			SourceInstantiationFacade sourceInstantiationService) {

		context = bundleContext;

		// keep link to source instantiation service
		this.sourceInstantiationService = sourceInstantiationService;
		
		// set context to source instantiation service
		this.sourceInstantiationService.setContext(context);

		// create log service tracker
		// LogTrackerCustomizer logTrackerCustomizer = new
		// LogTrackerCustomizer(context, sourceInstantiationService);
		// logServiceTracker = new ServiceTracker(context,
		// org.osgi.service.log.LogService.class.getName(),
		// logTrackerCustomizer);
		// logServiceTracker.open();

		// register it
		sourceInstantiationServiceRegistration = context.registerService(
				SourceInstantiationFacade.class,
				sourceInstantiationService, null);
	}
}
