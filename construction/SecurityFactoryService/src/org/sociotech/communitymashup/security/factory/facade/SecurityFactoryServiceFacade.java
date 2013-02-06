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
package org.sociotech.communitymashup.security.factory.facade;

import org.sociotech.communitymashup.application.Security;
import org.sociotech.communitymashup.security.facade.SecurityServiceFacade;
import org.sociotech.communitymashup.security.factory.facade.callback.AsynchronousSecurityInstantiationCallback;


/**
 * @author Peter Lachenmaier
 * 
 * Interface of the security factory service. This service instantiates new services based
 * on their configuration.
 */
public interface SecurityFactoryServiceFacade {
	
	/**
	 * Creates a new instance of the required security service. All security instantiation services need
	 * to be available. If you are not sure that this is true than use the asynchronous instantiation 
	 * {@link #produceAsynchronous(String, AsynchronousSecurityInstantiationCallback, Object)}
	 * 
	 * @param configuration Configuration of the security service.
	 * @return The new instantiated security service or null in error case.
	 */
	public SecurityServiceFacade produce(Security configuration);
	
	/**
	 * Use this method to trigger the security service instantiation process asynchronously. The given call back will
	 * be called when the instantiation process finished. It will be waited until a suitable security instantiation
	 * service will be available and then {@link #produce(Security)} well be used to create the security service.
	 * 
	 * @param configuration Configuration of the security service.
	 * @param callback Will be called when the security service finally is instantiated.
	 * @param key This object will be hand over at call back. Must not be null to be called back.
	 */
	public void produceAsynchronous(Security configuration, AsynchronousSecurityInstantiationCallback callback, Object key);
}
