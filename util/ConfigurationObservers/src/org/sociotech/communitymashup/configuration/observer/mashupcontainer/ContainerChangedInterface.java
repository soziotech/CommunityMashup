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
package org.sociotech.communitymashup.configuration.observer.mashupcontainer;

import org.eclipse.emf.common.notify.Notification;

/**
 * Defining methods that will be called after the configuration changes
 * 
 * @author Peter Lachenmaier
 */
public interface ContainerChangedInterface {

	/**
	 * This method will be call if the observed mashup container gets changed
	 * 
	 * @param notification The EMF notification
	 */
	void configurationChanged(Notification notification);

}
