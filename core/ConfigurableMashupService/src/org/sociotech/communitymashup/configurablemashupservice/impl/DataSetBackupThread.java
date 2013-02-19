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
 * Thread to cyclicly backup the data set
 * 
 * @author Peter Lachenmaier
 */
public class DataSetBackupThread extends Thread {

	private boolean active = false;
	private ConfigurableMashupService mashupService;
	private long backupInterval = -1;
	
	public DataSetBackupThread(ConfigurableMashupService mashupService) {
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
				Thread.sleep(backupInterval);
			} catch (InterruptedException e) {
				// an exception will be raise when interupting the thread while it sleeps (in this case active is false)
				if(active)
				{
					mashupService.log("Could not sleep in thread, this causes to much backups.", LogService.LOG_ERROR);
				}
			}
			
			// backup the data set
			mashupService.backupDataSet();
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
	 * Returns the backup interval in ms.
	 * 
	 * @return The backup interval in ms
	 */
	public long getBackupInterval() {
		return backupInterval;
	}

	/**
	 * Set the backup interval.
	 * 
	 * @param backupInterval Backup interval in ms.
	 */
	public void setBackupInterval(long backupInterval) {
		this.backupInterval = backupInterval;
	}
	
	
}
