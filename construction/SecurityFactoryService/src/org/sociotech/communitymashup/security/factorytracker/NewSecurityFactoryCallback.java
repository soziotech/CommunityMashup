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
package org.sociotech.communitymashup.security.factorytracker;

import org.sociotech.communitymashup.security.factory.facade.SecurityFactoryServiceFacade;

/**
 * Interface for callbacks made by the {@link SecurityFactoryServiceTracker}
 * 
 * @author Peter Lachenmaier
 */
public interface NewSecurityFactoryCallback {
	/**
	 * Will be called when a new security service factory is registered.
	 * 
	 * @param factory The newly registered factory.
	 */
	public void newSecurityFactory(SecurityFactoryServiceFacade factory);
	
	/**
	 * Will be called when a security service factory is removed.
	 * 
	 * @param factory The removed factory
	 */
	public void removedSecurityFactory(SecurityFactoryServiceFacade factory);
}
