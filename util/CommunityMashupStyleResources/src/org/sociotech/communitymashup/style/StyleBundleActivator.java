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
package org.sociotech.communitymashup.style;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.sociotech.communitymashup.style.registrator.StyleRegistrator;
import org.sociotech.communitymashup.util.servicetracker.HttpServiceTracker;

public class StyleBundleActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/**
	 * Reference to the http service tracker.
	 */
	private HttpServiceTracker httpServiceTracker;

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		StyleBundleActivator.context = bundleContext;
		
		// create style registrator
		StyleRegistrator registrator = new StyleRegistrator();
		// create http service tracker and set registrator as callback
		httpServiceTracker = new HttpServiceTracker(bundleContext, registrator);
		// open the tracker
		httpServiceTracker.open();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		StyleBundleActivator.context = null;
		
		// stop http service tracker
		if(httpServiceTracker != null)
		{
			httpServiceTracker.close();
		}
	}

}
