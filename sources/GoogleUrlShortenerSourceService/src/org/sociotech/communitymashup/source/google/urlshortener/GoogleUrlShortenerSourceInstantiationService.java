/*******************************************************************************
 * Copyright (c) 2014 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
/**
 * 
 */
package org.sociotech.communitymashup.source.google.urlshortener;

import org.sociotech.communitymashup.source.facade.SourceServiceFacade;
import org.sociotech.communitymashup.source.instantiation.impl.SourceInstantiationFacadeImpl;

/**
 * Source dependent implementation of the source instantiation service.
 * 
 * @author Peter Lachenmaier
 */
public class GoogleUrlShortenerSourceInstantiationService extends
		SourceInstantiationFacadeImpl {

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.instantiation.facade.SourceInstantiationFacade#instantiate()
	 */
	@Override
	public SourceServiceFacade instantiate() {
		return instantiated(new GoogleUrlShortenerSourceService());
	}

}
