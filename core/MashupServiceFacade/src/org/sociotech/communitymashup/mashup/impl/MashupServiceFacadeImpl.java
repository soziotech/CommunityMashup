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
package org.sociotech.communitymashup.mashup.impl;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Mashup;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.mashup.facade.MashupServiceFacade;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;


/**
 * This class is the facade of the concrete mashup service implementation. This is the entry point to use
 * a mashup service.
 * 
 * @author Peter Lachenmaier
 *
 */
public abstract class MashupServiceFacadeImpl extends SourceServiceFacadeImpl implements MashupServiceFacade {
	
	/**
	 * Represents the configuration of the Mashup
	 */
	protected Mashup mashup;

	/**
	 * Keeps a reference to the registration created by {@link #register()}.
	 */
	private ServiceRegistration<MashupServiceFacade> mashupRegistration;

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.mashup.MashupServiceFacade#loadConfiguration(org.sociotech.communitymashup.application.Mashup)
	 */
	@Override
	public Mashup loadConfiguration(Mashup configuration) {

		mashup = configuration;

		return mashup;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.mashup.MashupServiceFacade#loadConfigurationFromURL(java.net.URL)
	 */
	public Mashup loadConfigurationFromURL(URL configurationURL)
	{

		URI configurationURI;
		try
		{
			configurationURI = URI.createURI((configurationURL.toURI().toString()));
		}
		catch (URISyntaxException e1) {
			this.mashup = null;
			return null;
		}

		// create resource set and resource 
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",  new XMLResourceFactoryImpl());

		Resource resource = resourceSet.createResource(configurationURI);

		// register package in local resource registry
		String nsURI = DataPackage.eINSTANCE.getNsURI();
		resourceSet.getPackageRegistry().put(nsURI, DataPackage.eINSTANCE);

		// load resource 
		try 
		{
			resource.load(null);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}

		TreeIterator<EObject> dataIterator = resource.getAllContents();

		// Can only be loaded if the file is an xml containing exactly one mashup
		if(dataIterator.hasNext())
		{
			EObject workingObject = dataIterator.next();

			if(workingObject instanceof Mashup)
			{
				loadConfiguration((Mashup) workingObject);
				log("Loaded mashup configuration from " + configurationURI.path(), LogService.LOG_DEBUG);
			}
		}
		else
		{
			log("No mashup configuration found in file: " + configurationURI.path(), LogService.LOG_ERROR);
		}

		while(dataIterator.hasNext())
		{
			EObject workingObject = dataIterator.next();
			log("Got Object (" + workingObject.toString() + ") in file " + configurationURI.path(), LogService.LOG_DEBUG);
		}

		return mashup;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.mashup.facade.MashupServiceFacade#register()
	 */
	@Override
	public void register()
	{
		BundleContext context = MashupServiceFacadeBundleActivator.getContext();

		if(context == null)
		{
			log("Could not register mashup service due to missing bundle context", LogService.LOG_ERROR);
			return;
		}

		// first unregister if previously registered
		this.unregister();

		// and register it
		mashupRegistration = context.registerService(MashupServiceFacade.class, this, null);
		
		log("Registered mashup service: " + mashup.getName(), LogService.LOG_INFO);
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.mashup.facade.MashupServiceFacade#unregister()
	 */
	@Override
	public void unregister()
	{
		if(mashupRegistration != null)
		{
			// uregister if set
			mashupRegistration.unregister();
		}
	}


}
