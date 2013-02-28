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
package org.sociotech.communitymashup.util.servicetracker.callback;

import org.osgi.service.log.LogReaderService;

/**
 * Callback interface for the log reader service tracker. Must be implemented to receive callbacks.
 * 
 * @author Peter Lachenmaier
 */
public interface LogReaderServiceTracked {

	/**
	 * Will be called if a log reader service is found.
	 * 
	 * @param logReaderService The found log reader service.
	 */
	void gotLogReaderService(LogReaderService logReaderService);

	/**
	 * Will be called when a log reader service gets removed.
	 * 
	 * @param logReaderService The removed log reader service.
	 */
	void lostLogReaderService(LogReaderService logReaderService);

}
