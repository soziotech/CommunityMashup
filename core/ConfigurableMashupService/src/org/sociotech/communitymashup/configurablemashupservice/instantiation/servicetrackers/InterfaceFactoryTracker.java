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
import org.sociotech.communitymashup.configurablemashupservice.ConfigurableMashupService;
import org.sociotech.communitymashup.interfaceprovider.factory.facade.InterfaceFactoryFacade;

/**
 * This ServiceTracker tracks source factory services and sets it for the use in the mashup instantiation service.
 * 
 * @author Peter Lachenmaier
 *
 */
public class InterfaceFactoryTracker extends ServiceTracker<InterfaceFactoryFacade, InterfaceFactoryFacade> {

	/**
	 * Reference to configurable mashup service. This mashup service will be called if a new interface
	 * factory apears using 
	 */
	private ConfigurableMashupService mashupService;

	/**
	 * Creates a new source factory tracker that notifies the given mashup service.
	 *  
	 * @param context The Bundle context
	 * @param mashupService Mashup service to call when a interface factory appears.
	 */
	public InterfaceFactoryTracker(BundleContext context, ConfigurableMashupService mashupService) {
		super(context, InterfaceFactoryFacade.class.getName(), null);
		// keep reference to mashup service
		this.mashupService = mashupService;
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#addingService(org.osgi.framework.ServiceReference)
	 */
	@Override
	public InterfaceFactoryFacade addingService(ServiceReference<InterfaceFactoryFacade> serviceReference) {
		InterfaceFactoryFacade service = context.getService(serviceReference);

		log("Found new interface factory service.", LogService.LOG_DEBUG);

		// keep reference to interface factory service in mashup service
		InterfaceFactoryFacade interfaceFactoryService = (InterfaceFactoryFacade) service;
		mashupService.setInterfaceFactory(interfaceFactoryService);
	
		return service;
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#removedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void removedService(ServiceReference<InterfaceFactoryFacade> reference, InterfaceFactoryFacade service) {
		log("Interface factory service was removed.", LogService.LOG_DEBUG);

		// unset the interface factory in the mashup service
		mashupService.unsetInterfaceFactory();
	}

	private void log(String message, int level)
	{
		// use mashup service for logging
		mashupService.log(message, level);
	}
}
