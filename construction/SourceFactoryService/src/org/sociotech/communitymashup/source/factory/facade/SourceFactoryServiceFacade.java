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
package org.sociotech.communitymashup.source.factory.facade;

import java.util.Set;

import org.sociotech.communitymashup.source.facade.SourceServiceFacade;
import org.sociotech.communitymashup.source.factory.facade.callback.AsynchronousSourceInstantiationCallback;


/**
 * @author Peter Lachenmaier
 * 
 * Interface of the source factory service. This service instantiates new services based
 * on the contained bundle.
 */
public interface SourceFactoryServiceFacade {
	
	/**
	 * Creates a new instance of the required source service. All source instantiation services need
	 * to be available. If you are not sure that this is true than use the asynchronous instantiation 
	 * {@link #produceAsynchronous(String, AsynchronousSourceInstantiationCallback, Object)}
	 * 
	 * @param bundleId Id of the bundle that contains the implementation of the required source service.
	 * @return The new instantiated source service or null in error case.
	 */
	public SourceServiceFacade produce(String bundleId);
	
	/**
	 * Use this method to trigger the source instantiation process asynchronously. The given call back will
	 * be called when the instantiation process finished. It will be waited until a suitable source instantiation
	 * service will be available and then {@link #produce(String)} well be used to create the source service.
	 * 
	 * @param bundleId Id of the bundle that contains the implementation of the required source service.
	 * @param callback Will be called when the source service finally gets instantiated.
	 * @param key This object will be hand over at call back. Must not be null to be called back.
	 */
	public void produceAsynchronous(String bundleId, AsynchronousSourceInstantiationCallback callback, Object key);
	
	/**
	 * Returns the bundle ids of all source services that can be produced.
	 * 
	 * @return A list of source bundle ids, null in error case.
	 */
	public Set<String> getAvailableSourceBundles();
}
