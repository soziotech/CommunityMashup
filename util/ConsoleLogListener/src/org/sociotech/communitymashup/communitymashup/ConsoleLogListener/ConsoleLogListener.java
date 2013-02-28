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
package org.sociotech.communitymashup.communitymashup.ConsoleLogListener;

import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogReaderService;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.util.servicetracker.LogReaderTracker;
import org.sociotech.communitymashup.util.servicetracker.callback.LogReaderServiceTracked;

/**
 * @author Peter Lachenmaier
 *
 * Simple service that outputs log messages to the console.
 */
public class ConsoleLogListener implements LogListener, LogReaderServiceTracked
{
    /**
     * Local reference to the log reader service.
     */
    private LogReaderService logReaderService;
	
    /**
	 * Tracker of log reader services. 
	 */
	private LogReaderTracker logReaderTracker;

	/**
	 * Creates a new log reader tracker and register self as listener at found log readers.
	 * @param context Bundle context
	 */
	public ConsoleLogListener(BundleContext context) {
		// create new log reader tracker
		this.logReaderTracker = new LogReaderTracker(context, this);
		
		// open it
		this.logReaderTracker.open();
	}

	/* (non-Javadoc)
     * @see org.osgi.service.log.LogListener#logged(org.osgi.service.log.LogEntry)
     */
    public void logged(LogEntry log)
    {
        if (log.getMessage() != null)
        {
        	String logLevelName = "";
        	
        	switch (log.getLevel()) {
	        	case LogService.LOG_DEBUG:
					logLevelName = "DEBUG";
					break;
	        	case LogService.LOG_ERROR:
					logLevelName = "ERROR";
					break;
	        	case LogService.LOG_INFO:
					logLevelName = "INFO";
					break;
	        	case LogService.LOG_WARNING:
					logLevelName = "WARN";
					break;
				default:
					logLevelName = "UNKNOWN";
					break;
			}
        	
        	String message = logLevelName + ":\t[" + log.getBundle().getSymbolicName() + "] " + log.getMessage();
        	
        	if(log.getLevel() == LogService.LOG_ERROR)
        	{
        		// output to error console
        		System.err.println(message);
        	}
        	else
        	{
	            // just output to console
	        	System.out.println(message);
        	}
        }
    }

	/**
	 * Stops the console log listener.
	 */
	public void stop() {
		if(this.logReaderService != null)
		{
			// remove self as listener
			this.logReaderService.removeLogListener(this);
		}
		
		// close log reader service tracker
		this.logReaderTracker.close();
	}

	/**
	 * Keeps the given log reader service for local usage.
	 * 
	 * @param logReaderService
	 */
	@Override
	public void gotLogReaderService(LogReaderService logReaderService) {
		this.logReaderService = logReaderService;
		// add self as listener
		logReaderService.addLogListener(this);
	}

	/**
	 * Removes the local reference to the log reader service.
	 * 
	 * @param logReaderService The removed log reader service.
	 */
	@Override
	public void lostLogReaderService(LogReaderService logReaderService) {
		// remove self from listeners
		if(logReaderService == this.logReaderService)
		{
			this.logReaderService.removeLogListener(this);
			this.logReaderService = null;
		}
	}
}

