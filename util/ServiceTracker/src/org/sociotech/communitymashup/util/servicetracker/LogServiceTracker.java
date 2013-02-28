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
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;
import org.sociotech.communitymashup.util.servicetracker.callback.LogServiceTracked;


/**
 * This class tracks log services and calls back.
 * 
 * @author Peter Lachenmaier
 */
public class LogServiceTracker extends ServiceTracker<LogService, LogService> {

	/**
	 * Reference to the callback object.
	 */
	private LogServiceTracked callback = null;
	
	
	/**
	 * Service Tracker for log services. It calls back to the given callback when log
	 * services appear or disappear.
	 * 
	 * @param context Bundle context
	 * @param callback Callback
	 */
	public LogServiceTracker(BundleContext context, LogServiceTracked callback) {
		super(context, LogService.class.getName(), null);
		
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
	public LogService addingService(ServiceReference<LogService> reference) {

		LogService logService = context.getService(reference);
		
		// callback with log service
		callback.gotLogService(logService);

		return logService;
	}		


	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#removedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void removedService(ServiceReference<LogService> reference, LogService logService) {

		// callback with removed log service
		callback.lostLogService(logService);

		super.removedService(reference, logService);
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
