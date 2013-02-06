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
package org.sociotech.communitymashup.configurablemashupservice.instantiation;

import java.util.LinkedList;
import java.util.List;

import org.sociotech.communitymashup.application.Mashup;
import org.sociotech.communitymashup.configurablemashupservice.ConfigurableMashupService;
import org.sociotech.communitymashup.mashup.facade.MashupServiceFacade;
import org.sociotech.communitymashup.mashup.instantiation.facade.MashupInstantiationFacade;

/**
 * This is a concrete implementation of the mashup instantiation facade. This instantiation service
 * creates a {@link ConfigurableMashupService}.
 *  
 * @author Peter Lachenmaier
 */
public class MashupInstantiationService implements MashupInstantiationFacade{

	/**
	 * List of all instantiated mashup services.
	 */
	List<ConfigurableMashupService> instantiatedMashupServices = null;

	/**
	 * Constructs an instantiation service for configurable mashups.
	 */
	public MashupInstantiationService()
	{
		instantiatedMashupServices = new LinkedList<ConfigurableMashupService>();
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.mashup.instantiation.facade.MashupInstantiationFacade#instantiate()
	 */
	@Override
	public MashupServiceFacade instantiate() {

		// create a new one
		ConfigurableMashupService mashupService = new ConfigurableMashupService();

		// keep a reference
		instantiatedMashupServices.add(mashupService);

		// TODO maybe register it and track it

		// and return it
		return mashupService;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.mashup.instantiation.facade.MashupInstantiationFacade#instantiate(org.sociotech.communitymashup.application.Mashup)
	 */
	@Override
	public MashupServiceFacade instantiate(Mashup configuration) {

		if(configuration == null)
		{
			return null;
		}

		// create a new instance
		MashupServiceFacade mashupService = instantiate();

		// and load configuration
		mashupService.loadConfiguration(configuration);

		// and return it
		return mashupService;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.mashup.instantiation.facade.MashupInstantiationFacade#stopAll()
	 */
	@Override
	public void stopAll()
	{
		// stop all instantiated mashup services
		for(ConfigurableMashupService service : instantiatedMashupServices)
		{
			service.stop();
		}
	}

}
