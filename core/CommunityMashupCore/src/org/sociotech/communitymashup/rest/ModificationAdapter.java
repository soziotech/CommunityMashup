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
package org.sociotech.communitymashup.rest;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Item;


/**
 * A ContentAdapter which updates the DataSets and its items' lastModified attribute.
 * 
 * @author Jan Philipp Fiedler (Jan.Fiedler@unibw.de)
 *
 */
public class ModificationAdapter extends EContentAdapter {
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		notification.getFeature();
		if (notification.getEventType() < 8) {
			Object notifier = notification.getNotifier();
			if (notifier instanceof Item) {
				Item item = (Item) notifier;
				boolean backup = item.eDeliver();
				item.eSetDeliver(false);
				item.setLastModified(new Date());
				item.eSetDeliver(backup);
//				System.out.println("modified Item: " + notification.getEventType());
			}
			if (notifier instanceof DataSet) {
				DataSet ds = (DataSet) notifier;
				boolean backup = ds.eDeliver();
				ds.eSetDeliver(false);
				ds.setLastModified(new Date());
				ds.eSetDeliver(backup);
//				System.out.println("modified DataSet: " + notification.getEventType());
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof ModificationAdapter;
	}
}
