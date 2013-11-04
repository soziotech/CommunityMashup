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
package org.sociotech.communitymashup.source.scaledimages;

import org.osgi.framework.BundleContext;
import org.sociotech.communitymashup.source.impl.SourceBundleActivator;

/**
 * Implementation of the SourceBundleActivator.
 */
public class ScaledImagesBundleActivator extends SourceBundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		
		super.start(bundleContext, new ScaledImagesSourceInstantiationService());
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceBundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		
		super.stop(context);
	}

}
