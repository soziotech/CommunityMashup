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
package org.sociotech.communitymashup.interfaceprovider.instantiation.facade;

import org.eclipse.emf.ecore.EClass;
import org.sociotech.communitymashup.application.Interface;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.interfaceprovider.facade.InterfaceServiceFacade;

/**
 * This interface must be implemented by every interface instantiation service.
 * 
 * @author Peter Lachenmaier
 */
public interface InterfaceInstantiationServiceFacade
{
    /**
     * Instantiates a new interface with the given configuration. The created interface
     * provides access to the given data set.
     * 
     * @param configuration Configuration of the interface.
     * @param dataSet Data set that will be accessible by the created interface.
     * @return The instantiated interface service, or null in error case.
     */
    public InterfaceServiceFacade instantiate(Interface configuration, DataSet dataSet);
   
    /**
     * Creates an default configuration for the interface and uses {@link #instantiate(Interface, DataSet)}
     * to instantiate the interface with it.
     * 
     * @param dataSet Data set that will be accessible by the created interface.
     * @return The instantiated interface service, or null in error case.
     */
    public InterfaceServiceFacade instantiate(DataSet dataSet);
    
    /**
     * Returns the configuration eclass this instantiation service is capable of creating services for.
     *  
     * @return The configuration eclass this instantiation service is capable of creating services for.
     */
    public EClass getInstantiatableInterfaceClass();
    /**
     * Stops all instantiated interfaces.
     */
    public void stopAll();
}
