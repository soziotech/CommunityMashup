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
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.sociotech.communitymashup.application.MashupContainer;
import org.sociotech.communitymashup.application.util.ApplicationAdapterFactory;

/**
 * Observer for changes to mashup container configurations.
 * 
 * @author Peter Lachenmaier
 */
public class ContainerChangeObserver extends ApplicationAdapterFactory {
	
	/**
	 * The observer of the mashup container.
	 */
	private ContainerChangedInterface observerToNotify;
	
	/**
	 * The mashup container to observe. 
	 */
	private MashupContainer mashupContainerToObserve;

	/**
	 * Reference to the change adapter.
	 */
	private EContentAdapter changeAdapter;

	/**
	 * Creates a new observer that observes changes on the given mashup container and notifies the given objectToNotify.
	 * 
	 * @param mashupContainer Container to observe.
	 * @param objectToNotify Object to notify on changes
	 */
	public ContainerChangeObserver(MashupContainer mashupContainer, ContainerChangedInterface objectToNotify) {
		
		this.observerToNotify = objectToNotify;
		this.mashupContainerToObserve = mashupContainer;
		
		if (mashupContainer != null && objectToNotify != null) {
			
			changeAdapter = new EContentAdapter() {
				public void notifyChanged(Notification notification) {
					// the configuration changed method on changes
					observerToNotify.configurationChanged(notification);
					super.notifyChanged(notification);

				}
			};
			// add adapter
			mashupContainer.eAdapters().add(changeAdapter);
		}
	}
	
	/**
	 * Disconnects this observer from the mashup container.
	 */
	public void disconnect()
	{
		if(mashupContainerToObserve == null)
		{
			return;
		}
		
		// remove adapters for the mashup container
		mashupContainerToObserve.eAdapters().remove(changeAdapter);
	}
}
