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
package org.sociotech.communitymashup.source.gravatar.adapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.Email;
import org.sociotech.communitymashup.source.gravatar.GravatarSourceService;

/**
 * Reacts on newly added email addresses and enriches their information objects with gravatar images
 * using {@link GravatarSourceService#enrichInformationObjectsOfEmail(Email)}
 * 
 * @author Peter Lachenmaier
 */
public class NewEmailAdapter extends AdapterImpl {
	private GravatarSourceService gravatarSource;
	
	public NewEmailAdapter(GravatarSourceService gravatarSource) {
		this.gravatarSource = gravatarSource;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		if(notification != null && (notification.getNewValue() instanceof Email) && notification.getEventType() == Notification.ADD)
		{
			Email email = (Email) notification.getNewValue();
			gravatarSource.log("Enriching new Email " + email.getAdress(), LogService.LOG_INFO);
			
			// enrich the information objects this email belongs to
			gravatarSource.enrichInformationObjectsOfEmail(email);
		}
	}

}
