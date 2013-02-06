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
package org.sociotech.communitymashup.security.factorytracker;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.sociotech.communitymashup.security.factory.facade.SecurityFactoryServiceFacade;

/**
 * This class tracks security factory services and sets it for the use with the
 * {@link NewSecurityFactoryCallback}.
 *  
 * @author Peter Lachenmaier
 */
public class SecurityFactoryServiceTracker extends ServiceTracker<SecurityFactoryServiceFacade, SecurityFactoryServiceFacade> {

	/**
	 * The callback for the tracker events.
	 */
	private NewSecurityFactoryCallback callback;

	/**
	 * Creates a new security factory service tracker.
	 * 
	 * @param context The context of the bundle.
	 * @param callback Object that should be called when security factories appear or disappear.
	 */
	public SecurityFactoryServiceTracker(BundleContext context, NewSecurityFactoryCallback callback) {
		super(context, SecurityFactoryServiceFacade.class.getName(), null);
		this.callback = callback;
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#addingService(org.osgi.framework.ServiceReference)
	 */
	@Override
	public SecurityFactoryServiceFacade addingService(ServiceReference<SecurityFactoryServiceFacade> reference) {

		SecurityFactoryServiceFacade service = context.getService(reference);

		// set the instantiation service
		this.callback.newSecurityFactory(service);
		
		return service;
	}		

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#removedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void removedService(ServiceReference<SecurityFactoryServiceFacade> reference, SecurityFactoryServiceFacade service) {

		this.callback.removedSecurityFactory(service);
		
		super.removedService(reference, service);
	}
}
