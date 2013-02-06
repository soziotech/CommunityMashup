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
package org.sociotech.communitymashup.mashup.factory.impl;

import org.osgi.service.log.LogService;

/**
 * Thread to cyclicly backup configuration
 * 
 * @author Peter Lachenmaier
 */
public class ConfigurationBackupThread extends Thread {

	private boolean active = false;
	private MashupFactoryImpl mashupFactory;
	private long backupInterval = -1;
	
	public ConfigurationBackupThread(MashupFactoryImpl mashupFactory) {
		this.mashupFactory = mashupFactory;
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
				mashupFactory.log("Could not sleep in thread, this causes to much backups.", LogService.LOG_ERROR);
			}
			
			// backup the configuration
			mashupFactory.backupConfiguration();
			
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#start()
	 */
	@Override
	public synchronized void start() {
		this.active = true;
		super.start();
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
