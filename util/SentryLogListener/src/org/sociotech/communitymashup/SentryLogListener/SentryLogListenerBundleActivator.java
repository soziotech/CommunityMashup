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

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Activates a new logger to write log messages to sentry.
 * 
 * @author Peter Lachenmaier
 */
public class SentryLogListenerBundleActivator implements BundleActivator  
{
	private SentryLogListener sentryLog = null;
	
	public void start(BundleContext context) throws Exception
	{
		// create new sentry log listener
		this.sentryLog = new SentryLogListener(context);
	}

	public void stop(BundleContext context) throws Exception
	{
		// stop sentry log listener
		this.sentryLog.stop();
	}

}

