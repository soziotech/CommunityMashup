/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 *     Jan Philipp Fiedler
 ******************************************************************************/
package org.sociotech.communitymashup.interfaceprovider.restinterface;

import org.osgi.framework.BundleContext;
import org.sociotech.communitymashup.application.RESTInterface;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.interfaceprovider.impl.InterfaceServiceFacadeImpl;
import org.sociotech.communitymashup.interfaceprovider.restinterface.servicetracker.ResourceRegistrator;

/**
 * This is the main class of an rest interface service. This one will be instantiated
 * numerous times.
 * 
 * @author Peter Lachenmaier
 */
public class RESTInterfaceService extends InterfaceServiceFacadeImpl
{
	private ResourceRegistrator resourceRegistrator = null;

	/**
	 * Constructs a new feed interface service with the given configuration serving
	 * data from the given data set.
	 * 
	 * @param context Bundle context
	 * @param configuration Configuration of this rest interface service.
	 * @param dataSet Data set containing the data served by this rest interface.
	 */
	public RESTInterfaceService(BundleContext context, RESTInterface configuration, DataSet dataSet) {

		// register resource registrator to make rest servlets available when http service starts
		resourceRegistrator = new ResourceRegistrator(context, dataSet, configuration, this);
		resourceRegistrator.open();
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.interfaceprovider.impl.InterfaceServiceFacadeImpl#stop()
	 */
	@Override
	protected void stop()
	{
		// call super stop to maintain state
		super.stop();
		
		if(resourceRegistrator != null)
		{
			// close resource registrator
			resourceRegistrator.close();
		}
	}

	/**
	 * Logs the given message with at the given log level.
	 * 
	 * @param message Message to log
	 * @param logLevel Level of the message
	 */
	public void log(String message, int logLevel) {
		//TODO: Use logging service
		System.out.println(message);
	}
}

