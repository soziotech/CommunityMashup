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
import org.osgi.service.log.LogReaderService;
import org.osgi.util.tracker.ServiceTracker;
import org.sociotech.communitymashup.util.servicetracker.callback.LogReaderServiceTracked;


/**
 * This class tracks log reader services and calls back.
 * 
 * @author Peter Lachenmaier
 */
public class LogReaderTracker extends ServiceTracker<LogReaderService, LogReaderService> {

	/**
	 * Reference to the callback object.
	 */
	private LogReaderServiceTracked callback = null;
	
	
	/**
	 * Service Tracker for log reader services. It calls back to the given callback when log
	 * reader services appear or disappear.
	 * 
	 * @param context Bundle context
	 * @param callback Callback
	 */
	public LogReaderTracker(BundleContext context, LogReaderServiceTracked callback) {
		super(context, LogReaderService.class.getName(), null);
		
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
	public LogReaderService addingService(ServiceReference<LogReaderService> reference) {

		LogReaderService logReaderService = context.getService(reference);
		
		// callback with log reader service
		callback.gotLogReaderService(logReaderService);

		return logReaderService;
	}		


	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#removedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void removedService(ServiceReference<LogReaderService> reference, LogReaderService logService) {

		// callback with removed log service
		callback.lostLogReaderService(logService);

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
