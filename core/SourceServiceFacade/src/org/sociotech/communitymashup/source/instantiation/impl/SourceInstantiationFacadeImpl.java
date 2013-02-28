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
/**
 * 
 */
package org.sociotech.communitymashup.source.instantiation.impl;

import org.osgi.framework.BundleContext;
import org.sociotech.communitymashup.source.facade.SourceServiceFacade;
import org.sociotech.communitymashup.source.instantiation.facade.SourceInstantiationFacade;

/**
 * Base implementation of the Source Instantiation Service.
 * 
 * @author Peter Lachenmaier
 * 
 */
public abstract class SourceInstantiationFacadeImpl implements
		SourceInstantiationFacade {

	/**
	 * Local reference to the bundle context
	 */
	private BundleContext context;

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.instantiation.facade.SourceInstantiationFacade#setContext(org.osgi.framework.BundleContext)
	 */
	@Override
	public void setContext(BundleContext context) {
		// keep context
		this.context = context;
	}

	/**
	 * Call this to show that a new source service was instantiated.
	 * 
	 * @param newSourceService
	 *            The newly instantiated source service.
	 * @return The source service give as parameter.
	 */
	protected SourceServiceFacade instantiated(
			SourceServiceFacade newSourceService) {
		// TODO maybe register source service
		
		// set context
		newSourceService.setContext(context);
		
		return newSourceService;
	}
}
