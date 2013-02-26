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
package org.sociotech.communitymashup.configurablemashupservice.impl;

import org.osgi.service.log.LogService;

/**
 * Thread to delay the caching of the data set
 * 
 * @author Peter Lachenmaier
 */
public class DataSetCacheThread extends Thread {

	private boolean active = false;
	private ConfigurableMashupService mashupService;
	private long cacheInterval = -1;
	
	public DataSetCacheThread(ConfigurableMashupService mashupService) {
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
		while(active)
		{
			// wait the backup interval
			try {
				Thread.sleep(cacheInterval);
			} catch (InterruptedException e) {
				// an exception will be raise when interupting the thread while it sleeps (in this case active is false)
				if(active)
				{
					mashupService.log("Could not sleep in thread, this causes to much cache requests.", LogService.LOG_ERROR);
				}
			}
			
			// cache the data set
			mashupService.cacheDataSet();
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#start()
	 */
	@Override
	public synchronized void start() {
		this.active = true;
		if(!this.isAlive() || this.isInterrupted())
		{
			super.start();
		}
	}

	/**
	 * Returns the cache interval in ms.
	 * 
	 * @return The cache interval in ms
	 */
	public long getCacheInterval() {
		return cacheInterval;
	}

	/**
	 * Set the cache interval.
	 * 
	 * @param cacheInterval Cache interval in ms.
	 */
	public void setCacheInterval(long cacheInterval) {
		this.cacheInterval = cacheInterval;
	}
}
