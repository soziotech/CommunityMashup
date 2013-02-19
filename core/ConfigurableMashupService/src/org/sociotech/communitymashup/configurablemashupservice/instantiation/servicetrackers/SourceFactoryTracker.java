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
package org.sociotech.communitymashup.configurablemashupservice.instantiation.servicetrackers;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;
import org.sociotech.communitymashup.configurablemashupservice.impl.ConfigurableMashupService;
import org.sociotech.communitymashup.source.factory.facade.SourceFactoryServiceFacade;


/**
 * This ServiceTracker tracks source factory services and sets it for the use in the mashup instantiation service.
 * 
 * @author Peter Lachenmaier
 *
 */
public class SourceFactoryTracker extends ServiceTracker<SourceFactoryServiceFacade, SourceFactoryServiceFacade> {

	/**
	 * Reference to configurable mashup service. This mashup service will be called if a new source
	 * factory apears using 
	 */
	private ConfigurableMashupService mashupService;

	/**
	 * Creates a new source factory tracker that notifies 
	 * @param context The Bundle context
	 * @param instantiationService
	 */
	public SourceFactoryTracker(BundleContext context, ConfigurableMashupService mashupService) {
		super(context, SourceFactoryServiceFacade.class.getName(), null);
		// keep reference to mashup service
		this.mashupService = mashupService;
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#addingService(org.osgi.framework.ServiceReference)
	 */
	@Override
	public SourceFactoryServiceFacade addingService(ServiceReference<SourceFactoryServiceFacade> serviceReference) {
		SourceFactoryServiceFacade service = context.getService(serviceReference);

		log("Found new source factory service.", LogService.LOG_DEBUG);

		// keep reference to source factory service in mashup service
		SourceFactoryServiceFacade sourceFactoryService = (SourceFactoryServiceFacade)service;
		mashupService.setSourceFactory(sourceFactoryService);
	
		return service;
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#removedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void removedService(ServiceReference<SourceFactoryServiceFacade> reference, SourceFactoryServiceFacade service) {
		if(service instanceof SourceFactoryServiceFacade)
		{
			log("Source factory service was removed.", LogService.LOG_DEBUG);

			// unset the source factory in the mashup service
			mashupService.unsetSourceFactory();
		}

	}

	private void log(String message, int level)
	{
		// use mashup service for logging
		mashupService.log(message, level);
	}
}
