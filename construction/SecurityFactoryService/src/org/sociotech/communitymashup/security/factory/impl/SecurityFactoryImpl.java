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
package org.sociotech.communitymashup.security.factory.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.ApplicationKeyConfig;
import org.sociotech.communitymashup.application.OAuthConfig;
import org.sociotech.communitymashup.application.Security;
import org.sociotech.communitymashup.security.facade.SecurityServiceFacade;
import org.sociotech.communitymashup.security.factory.facade.SecurityFactoryServiceFacade;
import org.sociotech.communitymashup.security.factory.facade.callback.AsynchronousSecurityInstantiationCallback;
import org.sociotech.communitymashup.security.instantiation.facade.SecurityServiceInstantiationFacade;

/**
 * @author Peter Lachenmaier
 *
 * The security factory produces security services. It looks for security instantiation services and uses these
 * services to create instances based on a given configuration.
 */
public class SecurityFactoryImpl implements SecurityFactoryServiceFacade {

	// TODO handle instantiation services in map with class as key
	/**
	 * Local reference to an oauth security instantiation service. This one will be used to produce oauth security services.
	 * Make sure to maintain the reference by using {@link #addOAuthInstantiationService(OAuthSecurityServiceInstantiationFacade)}
	 * and {@link #removeOAuthInstantiationService(OAuthSecurityServiceInstantiationFacade)}
	 */
	private SecurityServiceInstantiationFacade oauthInstantiationService = null;

	/**
	 * Local reference to an application key security instantiation service. This one will be used to produce application key security services.
	 * Make sure to maintain the reference by using {@link #addInterfaceInstantiationService(InterfaceInstantiationServiceFacade)}
	 * and {@link #removeInterfaceInstantiationService(InterfaceInstantiationServiceFacade)}
	 */
	private SecurityServiceInstantiationFacade applicationKeyInstantiationService = null;

	/**
	 * This list contains configurations for security services are currently not instantiated due to missing instantiation service.
	 */
	private List<Security> openSecurtiyServices;
	
	/** 
	 * This map contains the callbacks that need to be called after the instantiation of security services.
	 */
	private Map<Security, AsynchronousSecurityInstantiationCallback> callbacks;
	
	/**
	 * This map contains the key objects that will be given back in the callback.
	 */
	private Map<Security, Object> callbackKeyObjects;
	
	/**
	 * Constructs a new interface factory.
	 */
	public SecurityFactoryImpl()
	{
		// create empty list and maps
		openSecurtiyServices = new LinkedList<Security>();
		callbacks = new HashMap<Security, AsynchronousSecurityInstantiationCallback>();
		callbackKeyObjects = new HashMap<Security, Object>();
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.security.factory.facade.SecurityFactoryServiceFacade#produce(org.sociotech.communitymashup.application.Security)
	 */
	@Override
	public SecurityServiceFacade produce(Security configuration) {
		if(configuration instanceof OAuthConfig && oauthInstantiationService != null)
		{			
			// produce it
			return oauthInstantiationService.instantiate(configuration);	
		}
		else if(configuration instanceof ApplicationKeyConfig && applicationKeyInstantiationService != null)
		{
			// produce it
			return applicationKeyInstantiationService.instantiate(configuration);
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.security.factory.facade.SecurityFactoryServiceFacade#produceAsynchronous(org.sociotech.communitymashup.application.Security, org.sociotech.communitymashup.security.factory.facade.callback.AsynchronousSecurityInstantiationCallback, java.lang.Object)
	 */
	@Override
	public void produceAsynchronous(Security configuration,	AsynchronousSecurityInstantiationCallback callback, Object key) {
		if(configuration == null)
		{
			// nothing can be done
			return;
		}
		
		SecurityServiceFacade newSecurity = produce(configuration);
			
		if(newSecurity != null)
		{
			// do callback
			if(callback != null)
			{
				callback.securityServiceInstantiated(newSecurity, key);
			}
			
			// remove from list and maps if it is on them
			if(openSecurtiyServices.contains(configuration))
			{
				openSecurtiyServices.remove(configuration);
			}
			if(callbacks.containsKey(configuration))
			{
				callbacks.remove(configuration);
			}
			if(callbackKeyObjects.containsKey(configuration))
			{
				callbackKeyObjects.remove(configuration);
			}
		}
		else
		{
			// keep it for later production
			openSecurtiyServices.add(configuration);
			callbacks.put(configuration, callback);
			callbackKeyObjects.put(configuration, key);
		}
		
	}
	
	private void log(String message, int level) {
		// TODO replace
		System.out.println(message);
	}


	public void addOAuthInstantiationService(SecurityServiceInstantiationFacade service) {
		if(oauthInstantiationService != null)
		{
			// remove previously used
			removeInstantiationService(oauthInstantiationService);
		}
		
		// set service
		oauthInstantiationService = service;
	}

	/**
	 * Removes the local references to the given instantiation service.
	 * 
	 * @param service References to this instantiation service will be removed 
	 */
	public void removeInstantiationService(SecurityServiceInstantiationFacade service) {
		if(oauthInstantiationService == service)
		{
			log("OAuth security instantiation service gots removed.", LogService.LOG_DEBUG);
			oauthInstantiationService = null;
		}
		else if(applicationKeyInstantiationService == service)
		{
			log("Application Key security instantiation service gots removed.", LogService.LOG_DEBUG);
			applicationKeyInstantiationService = null;
		}
		
		tryToProduceAllOpen();
	}


	/**
	 * Sets a local reference to the given instantiation service. This service will be used for the instantiation.
	 * 
	 * @param service Instantiation service
	 */
	public void addApplicationKeyInstantiationService(SecurityServiceInstantiationFacade service) {
		if(applicationKeyInstantiationService != null)
		{
			// remove previously used
			removeInstantiationService(applicationKeyInstantiationService);
		}
		
		// set service
		applicationKeyInstantiationService = service;
		
		tryToProduceAllOpen();
	}

	
	/**
	 * Starts the production process for all open security services. 
	 */
	private void tryToProduceAllOpen() {
		// create tmp list to avoid concurrent modification
		List<Security> tmpList = new LinkedList<Security>(openSecurtiyServices);
		
		// clear list, configurations will be added again if they cannot be produced
		openSecurtiyServices.clear();
		
		for(Security securityConfiguration : tmpList)
		{
			produceAsynchronous(securityConfiguration,
								callbacks.remove(securityConfiguration), 
								callbackKeyObjects.remove(securityConfiguration));
		}
	}
}
