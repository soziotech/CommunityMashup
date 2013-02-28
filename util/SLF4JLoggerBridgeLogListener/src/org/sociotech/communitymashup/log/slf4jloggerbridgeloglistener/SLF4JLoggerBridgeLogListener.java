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
package org.sociotech.communitymashup.log.slf4jloggerbridgeloglistener;

import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogReaderService;
import org.osgi.service.log.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.sociotech.communitymashup.util.servicetracker.LogReaderTracker;
import org.sociotech.communitymashup.util.servicetracker.callback.LogReaderServiceTracked;

/**
 * @author Peter Lachenmaier
 *
 * Simple service that logs osgi log service messages using slf4j
 */
public class SLF4JLoggerBridgeLogListener implements LogListener, LogReaderServiceTracked
{
	
	/**
	 * SLF4J Logger to log messages as CommunityMashup 
	 */
	private static final Logger defaultLogger = LoggerFactory.getLogger("org.sociotech.communitymashup"); 
    
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
	public SLF4JLoggerBridgeLogListener(BundleContext context) {
		// create new log reader tracker
		this.logReaderTracker = new LogReaderTracker(context, this);
		
		// open it
		this.logReaderTracker.open();
	}

	/* (non-Javadoc)
     * @see org.osgi.service.log.LogListener#logged(org.osgi.service.log.LogEntry)
     */
    public void logged(LogEntry logEntry)
    {
        if(logEntry == null)
        {
        	return;
        }
        
        logLogEntry(getLoggerForLogEntry(logEntry), logEntry.getLevel(), createBundleMarker(logEntry), logEntry.getMessage(), logEntry.getException());  
    }

    /**
     * Logs an Log entry using the slf4j logger
     * 
     * @param level Log level
     * @param marker The Log entry marker
     * @param message The log message
     * @param exception The possible exception
     */
    private void logLogEntry(Logger logger, int level, Marker marker, String message, Throwable exception)
    {
    	switch (level) {
    	case LogService.LOG_DEBUG:
    		logger.debug(marker, message, exception);
    		break;
    	case LogService.LOG_ERROR:
    		logger.error(marker, message, exception);
			break;
    	case LogService.LOG_INFO:
    		logger.info(marker, message, exception);
    		break;
    	case LogService.LOG_WARNING:
    		logger.warn(marker, message, exception);
    		break;
		default:
			logger.info(marker, message, exception);
    		break;
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
	
	/**
	 * Creates a bundle marker for the log entry.
	 * 
	 * @param logEntry Log entry to create the marker for.
	 * @return The created marker
	 */
	protected static Marker createBundleMarker(LogEntry logEntry) {

		Marker marker;

		if (logEntry.getBundle() != null && logEntry.getBundle().getSymbolicName() != null) {

			// create a Marker with the bundle symbolic name
			marker =  MarkerFactory.getMarker(logEntry.getBundle().getSymbolicName());

		} else {

			marker = MarkerFactory.getMarker("No Bundle");

		}
		return marker;
	}	

	/**
	 * Returns the logger for an log entry.
	 * 
	 * @param logEntry Log entry.
	 * @return The logger for the given log entry
	 */
	protected Logger getLoggerForLogEntry(LogEntry logEntry)
	{
		Logger logger = null;
		
		try {
			// bundle specific logger
			logger = LoggerFactory.getLogger(logEntry.getBundle().getSymbolicName());
		} catch (Exception e) {
			// fallback
			logger = null;
		}	
			
		if(logger == null)
		{
			// fallback to default logger
			logger = defaultLogger;
		}
		
		return logger;
	}
}

