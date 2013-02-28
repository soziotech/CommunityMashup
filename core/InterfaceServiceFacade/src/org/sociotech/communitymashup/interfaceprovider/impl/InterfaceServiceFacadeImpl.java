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
package org.sociotech.communitymashup.interfaceprovider.impl;

import org.eclipse.emf.common.notify.Notification;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.ApplicationPackage;
import org.sociotech.communitymashup.application.Interface;
import org.sociotech.communitymashup.interfaceprovider.facade.InterfaceServiceFacade;
import org.sociotech.communitymashup.util.servicetracker.LogServiceTracker;
import org.sociotech.communitymashup.util.servicetracker.callback.LogServiceTracked;

/**
 * Basic implementation of interface service facade.
 * 
 * @author Peter Lachenmaier
 */
public abstract class InterfaceServiceFacadeImpl implements InterfaceServiceFacade, LogServiceTracked
{

	public InterfaceServiceFacadeImpl() {
		// open log service tracker
		openLogServiceTracker();
	}
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.interfaceprovider.facade.InterfaceServiceFacade#handleChange(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public boolean handleChange(Notification notification) {
		if(notification == null)
		{
			return false;
		}
		// TODO check if this notification really belongs to this interface
		return this.handle(notification);
	}

	/**
	 * This method should be overwritten in concrete interface implementations with call to super.handle();
	 * 
	 * @param notification Notification indicating a change to the interface configuration
	 * @return True if the change is handled, false otherwise.
	 */
	protected boolean handle(Notification notification) {
		int featureID = notification.getFeatureID(Interface.class);
		if(featureID == ApplicationPackage.INTERFACE__CHANGEABLE ||
		   featureID == ApplicationPackage.INTERFACE__HIDDEN ||
		   featureID == ApplicationPackage.INTERFACE__DESCRIPTION ||
		   featureID == ApplicationPackage.INTERFACE__NAME ||
		   featureID == ApplicationPackage.INTERFACE__CONFIGURATION_IMAGE ||
		   featureID == ApplicationPackage.INTERFACE__IDENT)
		{
			// basic attributes that only influence the gui don't need to be handled
			return true;
		}
				   
		return false;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.interfaceprovider.facade.InterfaceServiceFacade#stopInterfaceService()
	 */
	@Override
	public void stopInterfaceService() {
		this.stop();
	}
	
	/**
	 * Stops the interface service. This method should be overwritten in concrete implementation with call to super.stop();
	 */
	protected void stop()
	{
		if(logServiceTracker != null)
		{
			logServiceTracker.close();
		}
	}

	/**
	 * Tracker for log services.
	 */
	private LogServiceTracker logServiceTracker = null;
	
	/**
	 * The used log service
	 */
	private LogService logService = null;

	/**
	 * Logs a message with the given log level using the OSGi log service.
	 * 
	 * @param message
	 *            Message to log
	 * @param logLevel
	 *            log level: {@link LogService#LOG_DEBUG},
	 *            {@link LogService#LOG_ERROR}, {@link LogService#LOG_INFO} or
	 *            {@link LogService#LOG_WARNING}
	 */
	public void log(String message, int logLevel) {
	
		if (logService != null)
		{
			logService.log(logLevel, message);
		} 
		else
		{
			System.out.println(message);
		}
	}	
	
	/**
	 * Opens a tracker to get noticed on appearing or disappearing log services
	 */
	private void openLogServiceTracker() {
		
		// create new service tracker and keep reference
		this.logServiceTracker  = new LogServiceTracker(InterfaceServiceActivator.getContext(), this);
		
		// open it
		this.logServiceTracker.open();		
	}
	
	/**
	 * Uses the given log service for logging.
	 * 
	 * @param logService Log service to use for logging.
	 */
	@Override
	public void gotLogService(LogService logService) {
		
		this.logService = logService;
		// log first message with new log service
		log("Set new log service.", LogService.LOG_DEBUG);
	}

	/**
	 * @param logService
	 */
	@Override
	public void lostLogService(LogService logService) {
		
		if(logService != null && logService == this.logService)
		{
			log("Lost log service.", LogService.LOG_WARNING);
			// set to null if it is the used log service
			this.logService = null;
		}
	}
}
