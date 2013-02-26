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
package org.sociotech.communitymashup.data.observer.dataset;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.sociotech.communitymashup.application.util.ApplicationAdapterFactory;
import org.sociotech.communitymashup.data.DataSet;

/**
 * Observer for changes to mashup container configurations.
 * 
 * @author Peter Lachenmaier
 */
public class DataSetChangeObserver extends ApplicationAdapterFactory {
	
	/**
	 * The observer of the data set.
	 */
	private DataSetChangedInterface observerToNotify;
	
	/**
	 * The data set to observe. 
	 */
	private DataSet dataSetToObserve;

	/**
	 * Reference to the change adapter.
	 */
	private EContentAdapter changeAdapter;

	/**
	 * Creates a new observer that observes changes on the given data set and notifies the given objectToNotify.
	 * 
	 * @param dataSet Data set to observe.
	 * @param objectToNotify Object to notify on changes
	 */
	public DataSetChangeObserver(DataSet dataSet, DataSetChangedInterface objectToNotify) {
		
		this.observerToNotify = objectToNotify;
		this.dataSetToObserve = dataSet;
		
		if (dataSet != null && objectToNotify != null) {
			
			changeAdapter = new EContentAdapter() {
				public void notifyChanged(Notification notification) {
					// the configuration changed method on changes
					observerToNotify.dataSetChanged(notification);
					super.notifyChanged(notification);

				}
			};
			// add adapter
			dataSet.eAdapters().add(changeAdapter);
		}
	}
	
	/**
	 * Disconnects this observer from the mashup.
	 */
	public void disconnect()
	{
		if(dataSetToObserve == null)
		{
			return;
		}
		
		// remove adapters for the data set
		dataSetToObserve.eAdapters().remove(changeAdapter);
	}
}
