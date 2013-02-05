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
package org.sociotech.communitymashup.source.qrcode;

import org.osgi.framework.BundleContext;
import org.sociotech.communitymashup.source.impl.SourceBundleActivator;

/**
 * Source dependent activator implementation.
 * 
 * @author Peter Lachenmaier
 */
public class QRCodeBundleActivator extends SourceBundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		
		super.start(bundleContext, new QRCodeSourceInstantiationService());
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceBundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext arg0) throws Exception {

		super.stop(arg0);
	}
	
}
