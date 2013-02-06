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
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.application.util.ApplicationAdapterFactory;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;

/**
 * Factory to create observers for changes on a source configuration.
 * 
 * @author Peter Lachenmaier
 */
public class ConfigurationChangeObserver extends ApplicationAdapterFactory{

	private SourceServiceFacadeImpl source;

	/**
	 * Observes the source configuration and notifies the sourceService.
	 * 
	 * @param sourceService Source service to notify
	 * @param configuration Source configuration to observe
	 */
	public ConfigurationChangeObserver(SourceServiceFacadeImpl sourceService, Source configuration) {
		
		this.source = sourceService;
		
		if (sourceService != null && configuration != null) {
			// get notifications if a new object is created or one is deleted
			Adapter createDeleteAdapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {
					// the configuration changed method on changes
					source.configurationChanged(notification);
					super.notifyChanged(notification);
				}
			};
			configuration.eAdapters().add(createDeleteAdapter);

			// get notifications of all item changes
			EContentAdapter adapter = new EContentAdapter() {
				public void notifyChanged(Notification notification) {
					// the configuration changed method on changes
					source.configurationChanged(notification);
					super.notifyChanged(notification);

				}
			};
			configuration.eAdapters().add(adapter);
		}
	}
}
