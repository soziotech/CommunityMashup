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
package org.sociotech.communitymashup.configuration.observer.source;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.application.util.ApplicationAdapterFactory;

/**
 * Observer for changes to source configurations.
 * 
 * @author Peter Lachenmaier
 */
public class SourceChangeObserver extends ApplicationAdapterFactory {
	
	/**
	 * The observer of the source
	 */
	private SourceChangedInterface observerToNotify;
	
	/**
	 * The source to observe. 
	 */
	private Source sourceToObserve;

	/**
	 * Reference to the change adapter.
	 */
	private EContentAdapter changeAdapter;

	/**
	 * Creates a new observer that observes changes on the given source and notifies the given objectToNotify.
	 * 
	 * @param source Source to observe.
	 * @param objectToNotify Object to notify on changes
	 */
	public SourceChangeObserver(Source source, SourceChangedInterface objectToNotify) {
		
		this.observerToNotify = objectToNotify;
		this.sourceToObserve = source;
		
		if (source != null && objectToNotify != null) {
			
			changeAdapter = new EContentAdapter() {
				public void notifyChanged(Notification notification) {
					// the configuration changed method on changes
					observerToNotify.sourceConfigurationChanged(notification);
					super.notifyChanged(notification);

				}
			};
			// add adapter
			source.eAdapters().add(changeAdapter);
		}
	}
	
	/**
	 * Disconnects this observer from the source.
	 */
	public void disconnect()
	{
		if(sourceToObserve == null)
		{
			return;
		}
		
		// remove adapters for the mashup
		sourceToObserve.eAdapters().remove(changeAdapter);
	}
}
