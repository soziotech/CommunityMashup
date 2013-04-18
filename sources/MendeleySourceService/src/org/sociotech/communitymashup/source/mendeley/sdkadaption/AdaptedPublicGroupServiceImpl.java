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
package org.sociotech.communitymashup.source.mendeley.sdkadaption;

import com.mendeley.oapi.services.impl.PublicGroupServiceImpl;
import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;

public class AdaptedPublicGroupServiceImpl extends PublicGroupServiceImpl {

	public AdaptedPublicGroupServiceImpl(MendeleyApiConsumer apiConsumer) {
		super(apiConsumer);
	}
}
