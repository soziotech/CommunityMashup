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
package org.sociotech.communitymashup.interfaceprovider.restinterface.instantiation.facade;

import org.sociotech.communitymashup.application.RESTInterface;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.interfaceprovider.instantiation.facade.InterfaceInstantiationServiceFacade;
import org.sociotech.communitymashup.interfaceprovider.restinterface.RESTInterfaceService;

/**
 * The interface for an feed interface instantiation service.
 * 
 * @author Peter Lachenmaier
 */
public interface RESTInterfaceInstantiationFacade extends InterfaceInstantiationServiceFacade{
	
	/**
	 * Creates a new rest interface service. Waits for an http server to register the 
	 * needed servlet serving the data and documentation.
	 * 
	 * @param configuration Configuration of the rest interface service.
	 * @param dataSet Data set that contains the data that should be provided by the rest interface.
	 * @return The new rest interface service or null in error case.
	 */
	public RESTInterfaceService instantiate(RESTInterface configuration, DataSet dataSet);
}
