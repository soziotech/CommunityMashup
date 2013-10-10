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
package org.sociotech.communitymashup.SentryLogListener;

import net.kencochrane.raven.Raven;
import net.kencochrane.raven.RavenFactory;
import net.kencochrane.raven.event.Event.Level;
import net.kencochrane.raven.event.EventBuilder;

import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogReaderService;
import org.osgi.service.log.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sociotech.communitymashup.util.servicetracker.LogReaderTracker;
import org.sociotech.communitymashup.util.servicetracker.callback.LogReaderServiceTracked;

/**
 * Simple service that logs osgi log service messages using sentry (https://www.getsentry.com/)
 *
 * @author Peter Lachenmaier
 */
public class SentryLogListener implements LogListener, LogReaderServiceTracked
{
	
	/**
	 * VM Argument key to to define the minimum needed level of messages to log to sentry. Default will be error.
	 */
	private static final String LOG_LEVEL_CONFIG_KEY = "org.sociotech.communitymashup.configuration.log.sentry.level";
	
	/**
	 * The default minimum log level if not defined using {@link SentryLogListener#LOG_LEVEL_CONFIG_KEY}.
	 */
	private static final int DEFAULT_MINIMUM_LOG_LEVEL = LogService.LOG_ERROR;
	
	/**
	 * VM argument key for the sentry DSN (data source name).   
	 */
	private static final String SENTRY_DSN_CONFIG_KEY = "org.sociotech.communitymashup.configuration.log.sentry.dsn";
	
	/**
	 * SLF4J Logger to log messages of this sentry log listener.
	 */
	private static final Logger selfLogger = LoggerFactory.getLogger(SentryLogListener.class); 
	
	/**
	 * Reference to raven. 
	 */
	private Raven raven = null;
	
	/**
     * Local reference to the log reader service.
     */
    private LogReaderService logReaderService;
	
    /**
	 * Tracker of log reader services. 
	 */
	private LogReaderTracker logReaderTracker;

	/**
	 * The minimum log level.
	 */
	private int minimumLogLevel;

	/**
	 * Creates a new log reader tracker and register self as listener at found log readers.
	 * @param context Bundle context
	 */
	public SentryLogListener(BundleContext context) {
		// create new log reader tracker
		this.logReaderTracker = new LogReaderTracker(context, this);
		
		// open it
		this.logReaderTracker.open();
		
		// read minimum log level
		minimumLogLevel = getConfiguredMinimumLogLevelValue();
		
		String dsn = System.getProperty(SENTRY_DSN_CONFIG_KEY);
		
		if(dsn != null && !dsn.isEmpty())
		{
			raven = RavenFactory.ravenInstance(dsn);
		}
		else
		{
			selfLogger.warn("Sentry dsn not defined. Define it as system property using the key " + SENTRY_DSN_CONFIG_KEY);
		}
	}

	/* (non-Javadoc)
     * @see org.osgi.service.log.LogListener#logged(org.osgi.service.log.LogEntry)
     */
    public void logged(LogEntry logEntry)
    {
        if(logEntry == null || logEntry.getLevel() > minimumLogLevel)
        {
        	return;
        }
        
        logLogEntry(createLoggerName(logEntry), convertOSGILevelToSentryLevel(logEntry.getLevel()), logEntry.getMessage(), logEntry.getException());  
    }

    /**
     * Logs an Log entry by sending the message as event to sentry
     * 
     * @param loggerName The name of the logger
     * @param level Sentry log level
     * @param message The log message
     * @param exception The possible exception
     */
     private void logLogEntry(String loggerName, Level level, String message, Throwable exception)
    {
    	// TODO work with possible exceptions
    	if(raven == null) {
    		// raven not defined
    		return;
    	}
    	
    	EventBuilder eventBuilder = null;
    	try {
    		// build sentry event
    		eventBuilder = new EventBuilder()
    		.setMessage(message)
    		.setLevel(level)
    		.setLogger(loggerName);
    	}
    	catch(Exception e) {
    		selfLogger.error("Could not create sentry log event due to exception " + e.getMessage());
    		return;
    	}

    	try {
    		// send sentry event
    		raven.runBuilderHelpers(eventBuilder);
    		raven.sendEvent(eventBuilder.build());
    	}
    	catch(Exception e) {
    		selfLogger.error("Could not send sentry log event due to exception " + e.getMessage());
    		return;
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
	 * Creates a logger name for the log entry out of the bundle name.
	 * 
	 * @param logEntry Log entry to create the marker for.
	 * @return The created logger name
	 */
	protected static String createLoggerName(LogEntry logEntry) {

		String loggerName = null;

		if (logEntry.getBundle() != null && logEntry.getBundle().getSymbolicName() != null) {

			// create a logger name with the bundle symbolic name
			loggerName =  logEntry.getBundle().getSymbolicName();

		} else {
			loggerName = "No Bundle";
		}
		
		return loggerName;
	}	
	
	/**
	 * Converts the given OSGi log level to a sentry log level. {@link Level#INFO} as default.
	 * 
	 * @param osgiLogLevel The OSGi log level defined in {@link LogService}
	 * @return The corresponding sentry log level
	 */
	protected Level convertOSGILevelToSentryLevel(int osgiLogLevel) {
		switch (osgiLogLevel) {
    	case LogService.LOG_DEBUG:
    		return Level.DEBUG;
    	case LogService.LOG_ERROR:
    		return Level.ERROR;
    	case LogService.LOG_INFO:
    		return Level.INFO;
    	case LogService.LOG_WARNING:
    		return Level.WARNING;
		default:
    		return Level.INFO;
		}
	}
	
	/**
	 * Returns the configured minimum log level.
	 * 
	 * @return The configured minimum log level.
	 */
	private int getConfiguredMinimumLogLevelValue() {
		String stringLogLevel = System.getProperty(LOG_LEVEL_CONFIG_KEY);
		
		if(stringLogLevel == null)
		{
			return DEFAULT_MINIMUM_LOG_LEVEL;
		}
		
		// check cases
		if(stringLogLevel.equalsIgnoreCase("DEBUG"))
		{
			return LogService.LOG_DEBUG;
		}
		
		if(stringLogLevel.equalsIgnoreCase("INFO"))
		{
			return LogService.LOG_INFO;
		}
		
		if(stringLogLevel.equalsIgnoreCase("WARNING"))
		{
			return LogService.LOG_WARNING;
		}
		
		if(stringLogLevel.equalsIgnoreCase("ERROR"))
		{
			return LogService.LOG_ERROR;
		}
		
		// check if defined as int
		try {
			Integer intValue = new Integer(stringLogLevel);
			if(intValue.equals(LogService.LOG_DEBUG) || 
			   intValue.equals(LogService.LOG_INFO) ||
			   intValue.equals(LogService.LOG_WARNING) ||
			   intValue.equals(LogService.LOG_ERROR))
			{
				// return if valid
				return intValue;
			}
		} catch (Exception e) {
			selfLogger.warn("Could not parse configured log level " + stringLogLevel + " (" + e.getMessage() + ")");
		}
		
		// return default
		return DEFAULT_MINIMUM_LOG_LEVEL;
	}
}

