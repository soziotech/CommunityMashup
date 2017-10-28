/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.framework.java.updater;

import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.framework.java.MashupConnector;

/**
 * Thread that cyclic calls {@link MashupConnector#update()}. 
 * 
 * @author Peter Lachenmaier
 */
public class UpdateThread extends Thread {

	private boolean active = false;
	private MashupConnector mashupConnector;
	private long updateInterval = -1;
	private long secondsToUpdate = updateInterval;
	
	/**
	 * Time to sleep between decreasing the counter. (one second)
	 */
	private static final long SLEEP_INTERVAL = 1000;
	
	public UpdateThread(MashupConnector mashupConnector) {
		this.mashupConnector = mashupConnector;
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
				Thread.sleep(SLEEP_INTERVAL);
				// waited one second
				secondsToUpdate--;
			} catch (InterruptedException e) {
				// an exception will be raise when interupting the thread while it sleeps (in this case active is false)
				if(active)
				{
					mashupConnector.log("Could not sleep in thread, this causes to much update.", LogService.LOG_ERROR);
				}
			}
			
			if(secondsToUpdate > 0) {
				// still some time to wait
				continue;
			}
			
			// call update method of mashup service
			try {
				mashupConnector.update();
				secondsToUpdate = updateInterval;
			} catch (Exception e) {
				mashupConnector.log("Exception occurred while updating: " + e.getMessage(), LogService.LOG_WARNING);
				e.printStackTrace();
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
	 * Returns the update interval in s.
	 * 
	 * @return The update interval in s.
	 */
	public long getUpdateInterval() {
		return updateInterval;
	}

	/**
	 * Set the update interval. Must be at least 1 s.
	 * 
	 * @param updateInterval Update interval in s.
	 */
	public void setUpdateInterval(long updateInterval) {
		
		// interrupt if interval is to low (< 1 second)
		if(updateInterval < 1 && !this.isInterrupted())
		{
			// important to interrupt super to keep active state
			super.interrupt();
		}
		
		// keep update interval
		this.updateInterval = updateInterval;
		this.secondsToUpdate = updateInterval;
		
		// restart if valid interval is set and thread should be active
		this.start();
	}
}
