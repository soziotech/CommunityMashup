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
package org.sociotech.communitymashup.interfaceprovider.facade;

import org.eclipse.emf.common.notify.Notification;

/**
 * (Java) Interface that must be provided by every CommunityMashup interface service.
 *  
 * @author Peter Lachenmaier
 */
public interface InterfaceServiceFacade
{

	/**
	 * Stops this interface service
	 */
	public void stopInterfaceService();

	/**
	 * If the change defined by the given notification can be handled automatically, it will be handled
	 * and confirmed by returning true. If it can not be handled or an error occurs, false will be returned. 
	 * 
	 * @param notification Notification indicating the change.
	 * @return True if the change is successfully handled, false otherwise.
	 */
	public boolean handleChange(Notification notification);
    
}
