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
/**
 * 
 */
package org.sociotech.communitymashup.source.yammer;

import org.sociotech.communitymashup.source.facade.SourceServiceFacade;
import org.sociotech.communitymashup.source.instantiation.impl.SourceInstantiationFacadeImpl;

/**
 * @author Peter Lachenmaier
 *
 * Instantiation service for yammer sources.
 */
public class YammerSourceInstantiationService extends SourceInstantiationFacadeImpl {

	/* (non-Javadoc)
	 * @see de.unibw.cscm.communitymashup.sourceinstantiationfacade.facade.SourceInstantiationFacade#instantiate()
	 */
	@Override
	public SourceServiceFacade instantiate() {
		// create a new yammer source service and return it
		return instantiated(new YammerSourceService());
	}
}
