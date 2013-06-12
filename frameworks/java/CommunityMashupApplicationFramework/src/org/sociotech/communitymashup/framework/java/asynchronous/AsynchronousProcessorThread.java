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
package org.sociotech.communitymashup.framework.java.asynchronous;

import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.framework.java.MashupConnector;

public class AsynchronousProcessorThread extends Thread {
	private boolean active = false;
	private MashupConnector mashupConnector;
	
	/**
	 * Time to sleep between checks of processing list.
	 */
	private static final long SLEEP_INTERVAL = 1000;
	
	public AsynchronousProcessorThread(MashupConnector mashupConnector) {
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
		while(active)
		{
			// wait the update interval
			try {
				Thread.sleep(SLEEP_INTERVAL);
				// waited one second
			} catch (InterruptedException e) {
				// an exception will be raise when interupting the thread while it sleeps (in this case active is false)
				if(active)
				{
					mashupConnector.log("Could not sleep in thread, this causes to much traffic.", LogService.LOG_ERROR);
				}
			}
				
			// call update method of mashup service
			try {
				mashupConnector.processAsynchronous();
			} catch (Exception e) {
				mashupConnector.log("Exception occurred while updating: " + e.getMessage(), LogService.LOG_WARNING);
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
		if(!this.isAlive() || this.isInterrupted())
		{
			super.start();
		}
	}
}
