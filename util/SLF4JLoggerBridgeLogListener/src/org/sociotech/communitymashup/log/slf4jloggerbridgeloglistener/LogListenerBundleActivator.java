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

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Activates a new slf4j logger bridge log listener.
 * 
 * @author Peter Lachenmaier
 */
public class LogListenerBundleActivator implements BundleActivator  
{
	private SLF4JLoggerBridgeLogListener consoleLog = null;
	
	public void start(BundleContext context) throws Exception
	{
		// create new console log listener
		this.consoleLog = new SLF4JLoggerBridgeLogListener(context);
	}

	public void stop(BundleContext context) throws Exception
	{
		// stop console log listener
		this.consoleLog.stop();
	}

}

