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
/**
 * 
 */
package org.sociotech.communitymashup.source.factory.facade.callback;

import org.sociotech.communitymashup.source.facade.SourceServiceFacade;
import org.sociotech.communitymashup.source.factory.facade.SourceFactoryServiceFacade;


/**
 * @author Peter Lachenmaier
 *
 * Implement this interface if you are using {@link SourceFactoryServiceFacade#produceAsynchronous(String, AsynchronousSourceInstantiationCallback, Object)}
 * to be called back when the source service is instantiated. 
 */
public interface AsynchronousSourceInstantiationCallback {
	
	/**
	 * This method will be called when the source instantiation process is finished.
	 * 
	 * @param sourceService The created source service instance.
	 * @param key Key provided at asynchronous call ({@link SourceFactoryServiceFacade#produceAsynchronous(String, AsynchronousSourceInstantiationCallback, Object)})
	 */
	public void sourceInstantiated(SourceServiceFacade sourceService, Object key);
}
