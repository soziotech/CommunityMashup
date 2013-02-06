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
package org.sociotech.communitymashup.mashup.facade;

import java.net.URL;

import org.sociotech.communitymashup.application.Mashup;
import org.sociotech.communitymashup.data.DataSet;


/**
 * This is the interface every special Mashup Implementation has to implement to be integrated into the CommunityMashup Environment.
 * 
 * @author Peter Lachenmaier
 *
 */
public interface MashupServiceFacade {

    // TODO: check dependency to source's getDataSet
    public DataSet getDataSet();

    /**
     * Loads an mashup configuration from an XML file (Application model) at the given URL
     * using {@link MashupServiceFacade#loadConfiguration(Mashup)}
     * 
     * @param configurationURL URL of the configuration XML file
     * @return The loaded Mashup(-Configuration) or null in error case.
     */
    public Mashup loadConfigurationFromURL(URL configurationURL);

    /**
     * Loads the given configuration. Instantiates all needed sources
     * 
     * @param configuration Mashup configuration
     * @return The loaded configuration or null in error case.
     */
    public Mashup loadConfiguration(Mashup configuration);
    
    /**
     * Registers the mashup service at the service registry.
     */
    public void register();
    
    /**
     * Unregisters the mashup service if it was previously registered with {@link #register()}.
     */
    public void unregister();
}
