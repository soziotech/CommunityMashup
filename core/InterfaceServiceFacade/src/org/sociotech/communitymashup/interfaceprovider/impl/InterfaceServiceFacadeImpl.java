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
package org.sociotech.communitymashup.interfaceprovider.impl;

import org.eclipse.emf.common.notify.Notification;
import org.sociotech.communitymashup.application.ApplicationPackage;
import org.sociotech.communitymashup.application.Interface;
import org.sociotech.communitymashup.interfaceprovider.facade.InterfaceServiceFacade;

/**
 * Basic implementation of interface service facade.
 * 
 * @author Peter Lachenmaier
 */
public abstract class InterfaceServiceFacadeImpl implements InterfaceServiceFacade
{

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.interfaceprovider.facade.InterfaceServiceFacade#handleChange(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public boolean handleChange(Notification notification) {
		if(notification == null)
		{
			return false;
		}
		// TODO check if this notification really belongs to this interface
		return this.handle(notification);
	}

	/**
	 * This method should be overwritten in concrete interface implementations with call to super.handle();
	 * 
	 * @param notification Notification indicating a change to the interface configuration
	 * @return True if the change is handled, false otherwise.
	 */
	protected boolean handle(Notification notification) {
		int featureID = notification.getFeatureID(Interface.class);
		if(featureID == ApplicationPackage.INTERFACE__CHANGEABLE ||
		   featureID == ApplicationPackage.INTERFACE__HIDDEN ||
		   featureID == ApplicationPackage.INTERFACE__DESCRIPTION ||
		   featureID == ApplicationPackage.INTERFACE__NAME ||
		   featureID == ApplicationPackage.INTERFACE__CONFIGURATION_IMAGE ||
		   featureID == ApplicationPackage.INTERFACE__IDENT)
		{
			// basic attributes that only influence the gui don't need to be handled
			return true;
		}
				   
		return false;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.interfaceprovider.facade.InterfaceServiceFacade#stopInterfaceService()
	 */
	@Override
	public void stopInterfaceService() {
		this.stop();
	}
	
	/**
	 * Stops the interface service. This method should be overwritten in concrete implementation with call to super.stop();
	 */
	protected void stop()
	{
		// TODO maintain interface state
	}

}
