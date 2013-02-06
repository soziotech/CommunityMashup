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
package org.sociotech.communitymashup.configurablemashupservice.update;

import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.configurablemashupservice.ConfigurableMashupService;
import org.sociotech.communitymashup.mashup.impl.MashupServiceFacadeImpl;
import org.sociotech.communitymashup.mashup.properties.MashupProperties;

/**
 * Thread that cyclic calls {@link MashupServiceFacadeImpl#update()}. Time intervall must be set in the configuration
 * by {@link MashupProperties#UPDATE_CYCLE_TIME_PROPERTY}.
 * 
 * @author Peter Lachenmaier
 */
public class UpdateThread extends Thread {

	/**
	 * Local reference to mashup service 
	 */
	ConfigurableMashupService mashupService = null;
	
	/**
	 * Field to maintain the active state of the thread.
	 */
	private boolean active = true;
	
	/**
	 * Factor to multiply property.
	 */
	private final long timeFactor = 1000;
	private long timeStep = 60000;
	private long refreshRate = 60;
	
	/**
	 * Creates new worker thread for mashup service.
	 * 
	 * @param mashupService Mashup service to do work.
	 */
	public UpdateThread(ConfigurableMashupService mashupService) {
		this.mashupService = mashupService;
	}
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		if(mashupService == null)
		{
			return;
		}
		
		Source configuration = mashupService.getConfiguration();
		String updateCycleTime = configuration.getPropertyValue(MashupProperties.UPDATE_CYCLE_TIME_PROPERTY);
		
		if(updateCycleTime == null || updateCycleTime.isEmpty())
		{
			mashupService.log("No update cycle specified in configuration, no updates will be performed", LogService.LOG_INFO);
			return;
		}
		
		mashupService.log("Starting update thread.", LogService.LOG_INFO);
		while (active)
		{
			// update properties			
			updateProperties();
			
			try {
				Thread.sleep(timeStep);
			} catch (Exception e) {
				mashupService.log("Update thread interrupted: " + e.getMessage(), LogService.LOG_WARNING);
			}

			mashupService.log("Updating Data Set", LogService.LOG_DEBUG);
			
			// call update method of mashup service
			try {
				mashupService.update();
			} catch (Exception e) {
				mashupService.log("Exception occurred while updating: " + e.getMessage(), LogService.LOG_WARNING);
				//e.printStackTrace();
			}
			
			mashupService.log("Finished updade round, sleeping ...", LogService.LOG_DEBUG);
		}
		mashupService.log("Update thread stopped", LogService.LOG_INFO);
	}
	
	/**
	 * Load all necessary properties from the configuration.
	 */
	private void updateProperties() {
		
		Source configuration = mashupService.getConfiguration();
		String updateCycleTime = configuration.getPropertyValue(MashupProperties.UPDATE_CYCLE_TIME_PROPERTY);
		
		if(updateCycleTime == null || updateCycleTime == "")
		{
			return;
		}
		
		refreshRate = Long.parseLong(updateCycleTime);
		
		if(refreshRate <= 0)
		{
			this.stopThread();
		}
		
		// calculate time step
		long newTimeStep = timeFactor * refreshRate;
		if(timeStep != newTimeStep) {
			timeStep = newTimeStep;
			mashupService.log("Update thread refresh rate has changed to " + newTimeStep, LogService.LOG_INFO);
		}
		
	}

	/**
	 * Stops the update thread
	 */
	public synchronized void stopThread()
	{
		mashupService.log("Stoping update thread.", LogService.LOG_INFO);
		active  = false;
	}
}
