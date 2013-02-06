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
package org.sociotech.communitymashup.source.facade;

/**
 * Defines the interface that need to be implemented to enable
 * thread based initialization.
 * 
 * @author Peter Lachenmaier
 *
 */
public interface AsynchronousSourceInitialization {
	
	/**
	 * Will be called after the asynchronous initialization process finished.
	 * Do not do work in this method, thread will be stoped.
	 * 
	 * @param sourceService The initialized source service.
	 */
	public void sourceInitializationFinished(SourceServiceFacade sourceService);
}
