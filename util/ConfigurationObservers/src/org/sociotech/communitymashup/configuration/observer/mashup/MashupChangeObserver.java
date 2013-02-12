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
package org.sociotech.communitymashup.configuration.observer.mashup;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.sociotech.communitymashup.application.Mashup;
import org.sociotech.communitymashup.application.util.ApplicationAdapterFactory;

/**
 * Observer for changes to mashup container configurations.
 * 
 * @author Peter Lachenmaier
 */
public class MashupChangeObserver extends ApplicationAdapterFactory {
	
	/**
	 * The observer of the mashup container.
	 */
	private MashupChangedInterface observerToNotify;
	
	/**
	 * The mashup to observe. 
	 */
	private Mashup mashupToObserve;

	/**
	 * Reference to the change adapter.
	 */
	private EContentAdapter changeAdapter;

	/**
	 * Creates a new observer that observes changes on the given mashup mashup and notifies the given objectToNotify.
	 * 
	 * @param mashup Mashup to observe.
	 * @param objectToNotify Object to notify on changes
	 */
	public MashupChangeObserver(Mashup mashup, MashupChangedInterface objectToNotify) {
		
		this.observerToNotify = objectToNotify;
		this.mashupToObserve = mashup;
		
		if (mashup != null && objectToNotify != null) {
			
			changeAdapter = new EContentAdapter() {
				public void notifyChanged(Notification notification) {
					// the configuration changed method on changes
					observerToNotify.mashupConfigurationChanged(notification);
					super.notifyChanged(notification);

				}
			};
			// add adapter
			mashup.eAdapters().add(changeAdapter);
		}
	}
	
	/**
	 * Disconnects this observer from the mashup.
	 */
	public void disconnect()
	{
		if(mashupToObserve == null)
		{
			return;
		}
		
		// remove adapters for the mashup
		mashupToObserve.eAdapters().remove(changeAdapter);
	}
}
