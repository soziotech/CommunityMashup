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
package org.sociotech.communitymashup.source.Adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.util.DataAdapterFactory;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;

/**
 * Class to observe data creation, deletion and changes to call
 * {@link SourceServiceFacadeImpl#cache()} when something changed.
 * 
 * @author Peter Lachenmaier
 * 
 */
public class CachingObserver extends DataAdapterFactory {

	private SourceServiceFacadeImpl sourceService = null;

	/**
	 * Creates a new observer for the given dataSet. Calls cache() on the given
	 * source.
	 * 
	 * @param dataSet
	 *            Data set to observe
	 * @param source
	 *            source to call cache() on
	 */
	public CachingObserver(DataSet dataSet, SourceServiceFacadeImpl source) {

		if (dataSet != null && source != null) {
			// get notifications if a new object is created or one is deleted
			Adapter createDeleteAdapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {
					// call cache on new or deleted objects
					sourceService.cache();
				}
			};
			dataSet.eAdapters().add(createDeleteAdapter);

			// get notifications of all item changes
			EContentAdapter adapter = new EContentAdapter() {
				public void notifyChanged(Notification notification) {
					// call cache when an object is changed
					sourceService.cache();
					super.notifyChanged(notification);

				}
			};
			dataSet.eAdapters().add(adapter);
		}

		// nothing to observe if dataSet undefined
	}
}
