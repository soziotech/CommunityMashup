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
package org.sociotech.communitymashup.util.servicetracker;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;
import org.osgi.util.tracker.ServiceTracker;
import org.sociotech.communitymashup.util.servicetracker.callback.HttpServiceTracked;


/**
 * This class tracks http services and calls back.
 * 
 * @author Peter Lachenmaier
 */
public class HttpServiceTracker extends ServiceTracker<HttpService, HttpService> {

	/**
	 * Reference to the callback object.
	 */
	private HttpServiceTracked callback = null;
	
	
	/**
	 * Service Tracker for http services. It calls back to the given callback when http
	 * services appear or disappear.
	 * 
	 * @param context Bundle context
	 * @param callback Callback
	 */
	public HttpServiceTracker(BundleContext context, HttpServiceTracked callback) {
		super(context, HttpService.class.getName(), null);
		
		// keep reference for callback
		this.callback = callback;
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#open()
	 */
	@Override
	public void open() {
		super.open();
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#addingService(org.osgi.framework.ServiceReference)
	 */
	@Override
	public HttpService addingService(ServiceReference<HttpService> reference) {

		HttpService httpService = context.getService(reference);
		
		// callback with http service
		callback.gotHttpService(httpService);

		return httpService;
	}		


	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#removedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void removedService(ServiceReference<HttpService> reference, HttpService httpService) {

		// callback with removed http service
		callback.lostHttpService(httpService);

		super.removedService(reference, httpService);
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#close()
	 */
	@Override
	public void close() {

		// nothing to do

		super.close();
	}
}
