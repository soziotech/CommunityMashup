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
package org.sociotech.communitymashup.source.qrcode.adapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.WebSite;
import org.sociotech.communitymashup.source.qrcode.QRCodeSourceService;

/**
 * Reacts on newly added websites and enriches their information objects with qr markers
 * using {@link QRCodeSourceService#enrichInformationObjectsOfWebSite(WebSite)}
 * 
 * @author Peter Lachenmaier
 */
public class NewWebSiteAdapter extends AdapterImpl {
	private QRCodeSourceService qrSource;
	
	public NewWebSiteAdapter(QRCodeSourceService qrSource) {
		this.qrSource = qrSource;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		if(notification != null && (notification.getNewValue() instanceof WebSite) && notification.getEventType() == Notification.ADD)
		{
			WebSite webSite = (WebSite) notification.getNewValue();
			qrSource.log("Enriching new WebSite " + webSite.getAdress(), LogService.LOG_INFO);
			
			// enrich the information objects this website belongs to
			qrSource.enrichInformationObjectsOfWebSite(webSite);
		}
	}

}
