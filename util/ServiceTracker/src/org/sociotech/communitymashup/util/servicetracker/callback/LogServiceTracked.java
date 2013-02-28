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

import org.osgi.service.log.LogService;

/**
 * Callback interface for the log service tracker. Must be implemented to receive callbacks.
 * 
 * @author Peter Lachenmaier
 */
public interface LogServiceTracked {

	/**
	 * Will be called if a log service is found.
	 * 
	 * @param logService The found log service.
	 */
	void gotLogService(LogService logService);

	/**
	 * Will be called when a log service gets removed.
	 * 
	 * @param logService The removed log service.
	 */
	void lostLogService(LogService logService);

}
