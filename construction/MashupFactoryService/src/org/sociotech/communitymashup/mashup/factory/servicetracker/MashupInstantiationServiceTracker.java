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
package org.sociotech.communitymashup.mashup.factory.servicetracker;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.sociotech.communitymashup.mashup.factory.impl.MashupFactoryImpl;
import org.sociotech.communitymashup.mashup.instantiation.facade.MashupInstantiationFacade;

/**
 * This class tracks mashup instantiation services and sets it for the use with the
 * mashup factory provided to the constructor.
 * 
 * @author Peter Lachenmaier
 *
 */
public class MashupInstantiationServiceTracker extends ServiceTracker {

		/**
		 * The mashup factory that needs the instantiation service.
		 */
		private MashupFactoryImpl mashupFactory;

		/**
		 * A default constructor.
		 * 
		 * @param context The context of the bundle.
		 * @param mashupFactory A concrete instance of a mashup factory
		 */
		public MashupInstantiationServiceTracker(BundleContext context, MashupFactoryImpl mashupFactory) {
			super(context, MashupInstantiationFacade.class.getName(), null);
			this.mashupFactory = mashupFactory;
		}

		/* (non-Javadoc)
		 * @see org.osgi.util.tracker.ServiceTracker#addingService(org.osgi.framework.ServiceReference)
		 */
		@Override
		public Object addingService(ServiceReference reference) {
			
			Object service = context.getService(reference);
			
			if(service instanceof MashupInstantiationFacade)
			{
				// there should only be a mashup instantiation service but be nice in case of misconfiguration
				
				// set the instantiation service
				this.mashupFactory.setMashupInstantiationService((MashupInstantiationFacade) service);
			}
			
			return service;
		}		
		
		/* (non-Javadoc)
		 * @see org.osgi.util.tracker.ServiceTracker#removedService(org.osgi.framework.ServiceReference, java.lang.Object)
		 */
		@Override
		public void removedService(ServiceReference reference, Object service) {
			
			if(service instanceof MashupInstantiationFacade)
			{
				// there should only be a mashup instantiation service but be nice in case of misconfiguration
				this.mashupFactory.unsetInstantiationService();
			}
			
			super.removedService(reference, service);
		}
	}
