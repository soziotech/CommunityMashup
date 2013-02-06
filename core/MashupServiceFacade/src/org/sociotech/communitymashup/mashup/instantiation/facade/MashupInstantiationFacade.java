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
package org.sociotech.communitymashup.mashup.instantiation.facade;

import org.sociotech.communitymashup.application.Mashup;
import org.sociotech.communitymashup.mashup.facade.MashupServiceFacade;

/**
 * Mashup services providing this interface can be instantiated by the mashup factory.
 * The Service must be able to instantiate a concrete mashup service.
 * 
 * @author Peter Lachenmaier
 *
 */
public interface MashupInstantiationFacade {

	/**
	 * Creates a new and empty mashup service.
	 * 
	 * @return The newly created mashup service.
	 */
	public MashupServiceFacade instantiate();

	/**
	 * Creates a new mashup service using {@link MashupInstantiationFacade#instantiate()} and
	 * loads the given configuration using {@link MashupServiceFacade#loadConfiguration(Mashup)}.
	 * 
	 * @param configuration Mashup configuration
	 * @return The newly created mashup service
	 */
	public MashupServiceFacade instantiate(Mashup configuration);

	/**
	 * Stops all instantiated mashup services
	 */
	public void stopAll();

}
