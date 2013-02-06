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
package org.sociotech.communitymashup.mashup.factory.facade;

import java.util.Map;

import org.sociotech.communitymashup.application.Mashup;
import org.sociotech.communitymashup.application.MashupContainer;
import org.sociotech.communitymashup.mashup.facade.MashupServiceFacade;

/**
 * The facade of a mashup factory servie. Use services providing this interface to create mashup services.
 * A mashup factory service maintains one single {@link MashupContainer}. 
 * 
 * @author Peter Lachenmaier
 * 
 */
public interface MashupFactoryFacade {
	
	/**
	 * Produces a mashup based on the given configuration. The configuration will be added to the maintained mashup
	 * container. If there is already a mashup with same ident, it will be tried to update the configuration. If it is
	 * not possible, the old one will be stoped and a new one will be created.
	 * 
	 * @param mashupConfiguration Configuration of the mashup to be created.
	 * @return The produced mashup service or null .
	 */
	public MashupServiceFacade produceMashup(Mashup mashupConfiguration);
	
	/**
	 * Produces mashup services for all mashup configurations included in the given mashup container using {@link MashupFactoryFacade#produceMashup(Mashup)}}.
	 * If there are existing mashup services that are not contained in the given mashup container, they will be stoped.
	 *  
	 * @param mashupConfigurations A Mashup container with the configurations of all needed mashups
	 * @return A Map of produced mashup services. Null if they can not directly produced.
	 */
	public Map<Mashup, MashupServiceFacade> produceMashups(MashupContainer mashupConfigurations);
	
	/**
	 * Returns the mashup container maintained by this mashup factory.
	 * 
	 * @return The mashup container maintained by this mashup factory.
	 */
	public MashupContainer getMashupContainer();
}
