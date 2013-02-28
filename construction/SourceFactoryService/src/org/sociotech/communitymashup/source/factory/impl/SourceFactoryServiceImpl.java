/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.factory.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.source.facade.SourceServiceFacade;
import org.sociotech.communitymashup.source.factory.SourceFactoryActivator;
import org.sociotech.communitymashup.source.factory.facade.SourceFactoryServiceFacade;
import org.sociotech.communitymashup.source.factory.facade.callback.AsynchronousSourceInstantiationCallback;
import org.sociotech.communitymashup.source.instantiation.facade.SourceInstantiationFacade;
import org.sociotech.communitymashup.util.servicetracker.LogServiceTracker;
import org.sociotech.communitymashup.util.servicetracker.callback.LogServiceTracked;


/**
 * Implementation of the source factory service.
 * 
 * @author Peter Lachenmaier
 */
public class SourceFactoryServiceImpl implements SourceFactoryServiceFacade, LogServiceTracked {

	/**
	 * Map with source instantiation services, key is the bundle id of the source instantiation service 
	 */
	private Map<String, SourceInstantiationFacade> sourceInstantiationServices;

	/**
	 * Keeps the bundle ids of all sources which need to be instantiated when their instantiation service appears 
	 */
	private Map<String, List<Object>> sourcesWaitingForInstantiation;

	/**
	 * Keeps the objects which need to be called back after instantiation
	 */
	private Map<Object, AsynchronousSourceInstantiationCallback> afterInstantiationCallbacks;

	/**
	 * Constructs a source factory service.
	 */
	public SourceFactoryServiceImpl()
	{
		// create empty map for source instantiation service
		sourceInstantiationServices = new HashMap<String, SourceInstantiationFacade>();

		// create empty map for waiting sources
		sourcesWaitingForInstantiation = new HashMap<String, List<Object>>();

		// create empty map for callbacks
		afterInstantiationCallbacks = new HashMap<Object, AsynchronousSourceInstantiationCallback>();
		
		// open log service tracker
		openLogServiceTracker();
	}
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.factory.facade.SourceFactoryServiceFacade#instantiate(java.lang.String)
	 */
	@Override
	public SourceServiceFacade produce(String bundleId) {

		// check if instantiation service is available for this bundle
		if(bundleId != null && sourceInstantiationServices.containsKey(bundleId))
		{
			SourceInstantiationFacade instantiationService = sourceInstantiationServices.get(bundleId);
			log("Instantiating source service for bundle " + bundleId, LogService.LOG_DEBUG);
			return instantiationService.instantiate();
		}
		else
		{
			log("No instantiation service available for bundle " + bundleId, LogService.LOG_ERROR);
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.factory.facade.SourceFactoryServiceFacade#instantiateAsynchronous(java.lang.String, org.sociotech.communitymashup.source.factory.facade.callback.AsynchronousSourceInstantiationCallback, java.lang.Object)
	 */
	@Override
	public void produceAsynchronous(String bundleId, AsynchronousSourceInstantiationCallback callback, Object key) {
		if(bundleId == null)
		{
			log("Could not produce a source for a unset bundle id.", LogService.LOG_ERROR);
		}

		if(sourceInstantiationServices.containsKey(bundleId))
		{
			// directly produce
			produceAndCallback(bundleId, callback, key);
		}
		else
		{
			// keep for later production
			keepAndProduceLater(bundleId, callback, key);
		}
	}
	/**
	 * Keeps all parameters needed for the asynchronous production of a source service to produce it
	 * when the right instantiation service appears.
	 * 
	 * @param bundleId Id of the source bundle to produce a service of 
	 * @param callback Object that should be called back after the instantiation
	 * @param key Key object that will be included in the callback
	 */
	private void keepAndProduceLater(String bundleId,
			AsynchronousSourceInstantiationCallback callback, Object key)
	{
		if(bundleId == null)
		{
			return;
		}

		// get list if there are already sources waiting for this bundle id
		List<Object> listForBundle = sourcesWaitingForInstantiation.get(bundleId);

		if(listForBundle == null)
		{
			// create new and empty list
			listForBundle = new LinkedList<Object>();
			// and add it to the waiting map
			sourcesWaitingForInstantiation.put(bundleId, listForBundle);
		}

		// add the key object for the callback
		// info: also null objects can be added to the linked list
		// this is important to also produce if no callback is set
		listForBundle.add(key);

		if(callback != null && key != null)
		{
			// keep for callback
			afterInstantiationCallbacks.put(key, callback);
		}


	}
	/**
	 * Produces a source service for the given bundle id and calls back.
	 * 
	 * @param bundleId Id of the source bundle to produce a service of 
	 * @param callback Object that should be called back after the instantiation
	 * @param key Key object that will be included in the callback
	 */
	private void produceAndCallback(String bundleId,
			AsynchronousSourceInstantiationCallback callback, Object key)
	{
		if(bundleId == null)
		{
			return;
		}

		// produce the source service
		SourceServiceFacade newSourceService = produce(bundleId);

		if(newSourceService == null)
		{
			// could not be produced
			return;
		}

		if(callback == null)
		{
			return;
		}

		// now call back
		callback.sourceInstantiated(newSourceService, key);
	}
	/**
	 * Registers an source instantiation service for a given bundle to be used by the source service factory.
	 * 
	 * @param bundleId Id of the source bundle
	 * @param sourceInstantiationService Reference to the instantiation service
	 */
	public void registerSourceInstantiationService(String bundleId, SourceInstantiationFacade sourceInstantiationService)
	{
		// check parameters
		if(bundleId != null && !bundleId.isEmpty() && sourceInstantiationService != null)
		{
			log("Got source instantiation service for " + bundleId, LogService.LOG_DEBUG);
			sourceInstantiationServices.put(bundleId, sourceInstantiationService);

			// start production of waiting sources
			produceWaitingSources(bundleId);
		}
	}

	/**
	 * Produces all sources waiting for the given bundle id.
	 * 
	 * @param bundleId Bundle id for which source should be produced
	 */
	private void produceWaitingSources(String bundleId)
	{
		// get all source waiting for the given bundle id
		List<Object> waitingSourceKeys = sourcesWaitingForInstantiation.get(bundleId);

		if(waitingSourceKeys == null || waitingSourceKeys.isEmpty())
		{
			// nothing to do
			return;
		}

		// create temporary list
		LinkedList<Object> tmpList = new LinkedList<Object>(waitingSourceKeys);

		// clear waiting list
		waitingSourceKeys.clear();

		// produce all in the list
		for(Object key : tmpList)
		{
			produceAndCallback(bundleId, afterInstantiationCallbacks.get(key), key);
		}

	}

	/**
	 * Unregisters the instantiation service for a given bundle.
	 * 
	 * @param bundleId The id of the source service bundle.
	 */
	public void unregisterSourceInstantiationService(String bundleId)
	{
		// check if contained in map
		if(sourceInstantiationServices.containsKey(bundleId))
		{
			log("Lost source instantiation service for " + bundleId, LogService.LOG_DEBUG);
			sourceInstantiationServices.remove(bundleId);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.factory.facade.SourceFactoryServiceFacade#getAvailableSourceBundles()
	 */
	@Override
	public Set<String> getAvailableSourceBundles() {
		// simply return the keys for the source instantiation services
		return sourceInstantiationServices.keySet();
	}

	/**
	 * Tracker for log services.
	 */
	private LogServiceTracker logServiceTracker = null;

	/**
	 * The used log service
	 */
	private LogService logService = null;

	/**
	 * Logs a message with the given log level using the OSGi log service.
	 * 
	 * @param message
	 *            Message to log
	 * @param logLevel
	 *            log level: {@link LogService#LOG_DEBUG},
	 *            {@link LogService#LOG_ERROR}, {@link LogService#LOG_INFO} or
	 *            {@link LogService#LOG_WARNING}
	 */
	public void log(String message, int logLevel) {

		if (logService != null)
		{
			logService.log(logLevel, message);
		} 
		else
		{
			System.out.println(message);
		}
	}	

	/**
	 * Opens a tracker to get noticed on appearing or disappearing log services
	 */
	private void openLogServiceTracker() {

		// create new service tracker and keep reference
		this.logServiceTracker  = new LogServiceTracker(SourceFactoryActivator.getContext(), this);

		// open it
		this.logServiceTracker.open();		
	}

	/**
	 * Uses the given log service for logging.
	 * 
	 * @param logService Log service to use for logging.
	 */
	@Override
	public void gotLogService(LogService logService) {
		this.logService = logService;
		// log first message with new log service
		log("Set new log service.", LogService.LOG_DEBUG);
	}

	/**
	 * @param logService
	 */
	@Override
	public void lostLogService(LogService logService) {

		if(logService != null && logService == this.logService)
		{
			log("Lost log service.", LogService.LOG_WARNING);
			// set to null if it is the used log service
			this.logService = null;
		}
	}
	
	/**
	 * Stops the interface factory
	 */
	public void stop()
	{
		// stop log service tracker
		if(logServiceTracker != null)
		{
			logServiceTracker.close();
		}
	}
}
