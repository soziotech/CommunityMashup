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
package org.sociotech.communitymashup.interfaceprovider.restinterface.instantiation.impl;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.osgi.framework.BundleContext;
import org.sociotech.communitymashup.application.ApplicationPackage;
import org.sociotech.communitymashup.application.Interface;
import org.sociotech.communitymashup.application.RESTInterface;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.interfaceprovider.facade.InterfaceServiceFacade;
import org.sociotech.communitymashup.interfaceprovider.instantiation.impl.InterfaceInstantiationFacadeImpl;
import org.sociotech.communitymashup.interfaceprovider.restinterface.RESTInterfaceService;
import org.sociotech.communitymashup.interfaceprovider.restinterface.instantiation.facade.RESTInterfaceInstantiationFacade;

/**
 * An instantiation service for rest interfaces.
 * 
 * @author Peter Lachenmaier
 *
 */
public class RESTInterfaceInstantiationService extends InterfaceInstantiationFacadeImpl implements RESTInterfaceInstantiationFacade
{

	/**
	 * List that keeps references to all instantiated rest interfaces. This interfaces will be
	 * stopped when the rest interface instantiation service is stopped.
	 */
	private List<RESTInterfaceService> restInterfaceServices;

	/**
	 * Reference to the bundle context.
	 */
	private BundleContext bundleContext;

	/**
	 * Constructs a new rest interface instantiation service.
	 *  
	 * @param context The bundle context
	 */
	public RESTInterfaceInstantiationService(BundleContext context) {

		bundleContext = context;

		restInterfaceServices = new LinkedList<RESTInterfaceService>();
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.interfaceprovider.restinterface.instantiation.impl.RESTInterfaceInstantiationFacade#instantiate(org.sociotech.communitymashup.application.RESTInterface, org.sociotech.communitymashup.data.DataSet)
	 */
	@Override
	public RESTInterfaceService instantiate(RESTInterface configuration, DataSet dataSet)
	{
		// create new rest interface
		RESTInterfaceService restInterfaceService = new RESTInterfaceService(bundleContext, configuration, dataSet);

		return restInterfaceService;
	}

	/**
	 * Stops all instantiated rest interface services
	 */
	public void stopAll()
	{
		// stop all rest interface services
		for(RESTInterfaceService service : restInterfaceServices)
		{
			service.stop();
		}
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.interfaceprovider.instantiation.facade.InterfaceInstantiationServiceFacade#instantiate(org.sociotech.communitymashup.application.Interface, org.sociotech.communitymashup.data.DataSet)
	 */
	@Override
	public InterfaceServiceFacade instantiate(Interface configuration, DataSet dataSet)
	{
		if(!(configuration instanceof RESTInterface))
		{
			// could only instantiate rest interfaces
			return null;
		}

		// cast and instantiate
		return this.instantiate((RESTInterface) configuration, dataSet);
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.interfaceprovider.instantiation.facade.InterfaceInstantiationServiceFacade#instantiate(org.sociotech.communitymashup.data.DataSet)
	 */
	@Override
	public InterfaceServiceFacade instantiate(DataSet dataSet)
	{

		// create default configuration
		RESTInterface defaultConfiguration = ApplicationPackage.eINSTANCE.getApplicationFactory().createRESTInterface();

		// and instantiate with this default configuration
		return instantiate(defaultConfiguration, dataSet);
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.interfaceprovider.instantiation.facade.InterfaceInstantiationServiceFacade#getInstantiatableInterfaceClass()
	 */
	@Override
	public EClass getInstantiatableInterfaceClass() {
		return ApplicationPackage.eINSTANCE.getRESTInterface();
	}
}
