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
import org.sociotech.communitymashup.configurablemashupservice.impl.ConfigurableMashupService;
import org.sociotech.communitymashup.mashup.impl.MashupServiceFacadeImpl;

/**
 * Thread that cyclic calls {@link MashupServiceFacadeImpl#update()}. 
 * 
 * @author Peter Lachenmaier
 */
public class UpdateThread extends Thread {

	private boolean active = false;
	private ConfigurableMashupService mashupService;
	private long updateInterval = -1;
	
	public UpdateThread(ConfigurableMashupService mashupService) {
		this.mashupService = mashupService;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#interrupt()
	 */
	@Override
	public void interrupt() {
		this.active = false;
		super.interrupt();
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		while(active && this.updateInterval > 0)
		{
			// wait the update interval
			try {
				Thread.sleep(updateInterval);
			} catch (InterruptedException e) {
				// an exception will be raise when interupting the thread while it sleeps (in this case active is false)
				if(active)
				{
					mashupService.log("Could not sleep in thread, this causes to much backups.", LogService.LOG_ERROR);
				}
			}
			
			// call update method of mashup service
			try {
				mashupService.update();
			} catch (Exception e) {
				mashupService.log("Exception occurred while updating: " + e.getMessage(), LogService.LOG_WARNING);
				//e.printStackTrace();
			}
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#start()
	 */
	@Override
	public synchronized void start() {
		this.active = true;
		if((!this.isAlive() || this.isInterrupted()) && this.updateInterval > 0)
		{
			super.start();
		}
	}

	/**
	 * Returns the update interval in ms.
	 * 
	 * @return The update interval in ms
	 */
	public long getUpdateInterval() {
		return updateInterval;
	}

	/**
	 * Set the update interval. Must be at least 1000 ms.
	 * 
	 * @param updateInterval Update interval in ms.
	 */
	public void setUpdateInterval(long updateInterval) {
		
		// interrupt if interval is to low (< 1 second)
		if(updateInterval <= 999 && !this.isInterrupted())
		{
			// important to interrupt super to keep active state
			super.interrupt();
		}
		
		// keep update interval
		this.updateInterval = updateInterval;
		
		// restart if valid interval is set and thread should be active
		this.start();
	}
}
