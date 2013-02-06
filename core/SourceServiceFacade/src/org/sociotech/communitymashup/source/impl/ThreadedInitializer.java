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
package org.sociotech.communitymashup.source.impl;

import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.source.facade.AsynchronousSourceInitialization;


public class ThreadedInitializer extends Thread{

	private SourceServiceFacadeImpl sourceService;
	private Source configuration;
	private AsynchronousSourceInitialization initializer;
	
	public ThreadedInitializer(SourceServiceFacadeImpl sourceService, Source configuration, AsynchronousSourceInitialization initializer) {
		this.configuration = configuration;
		this.sourceService = sourceService;
		this.initializer = initializer;
	}
	
	@Override
	public void run() {
		
		sourceService.log("Threaded initialization started", LogService.LOG_DEBUG);
		
		sourceService.initialize(configuration);
		
		if(initializer != null)
		{
			// call back the starting initializer
			initializer.sourceInitializationFinished(sourceService);
		}
	}
}
