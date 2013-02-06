package org.sociotech.communitymashup.source.factory.impl;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;
import org.sociotech.communitymashup.source.instantiation.facade.SourceInstantiationFacade;


public class SourceInstantiationServiceTracker extends ServiceTracker {

	/**
	 * Source Factory that handles all instantiation services
	 */
	SourceFactoryServiceImpl sourceFactory = null;
	
	/**
	 * Creates a new source instantiation service tracker. The given source factory will be called when
	 * new instantiation services appear or disapear.
	 * 
	 * @param context Bundle context
	 * @param sourceFactory Source factory that will be called for appearing or disapearing services
	 */
	public SourceInstantiationServiceTracker(BundleContext context, SourceFactoryServiceImpl sourceFactory) {
		super(context, SourceInstantiationFacade.class.getName(), null);
		this.sourceFactory = sourceFactory;
	}
	
	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#addingService(org.osgi.framework.ServiceReference)
	 */
	@Override
	public Object addingService(ServiceReference serviceReference) {
		
		Object service = context.getService(serviceReference);
		
		if(service instanceof SourceInstantiationFacade)
		{
			String symbolicName = serviceReference.getBundle().getSymbolicName();
			log("Found new source instantiation service for " + symbolicName, LogService.LOG_DEBUG);
		
			// keep reference to instantiation services
			SourceInstantiationFacade instantiationService = (SourceInstantiationFacade)service;
			sourceFactory.registerSourceInstantiationService(symbolicName, instantiationService);
		}
		
		return service;
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#removedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void removedService(ServiceReference serviceReference, Object arg1) {
		Object service = context.getService(serviceReference);
		
		if(service instanceof SourceInstantiationFacade)
		{
			String symbolicName = serviceReference.getBundle().getSymbolicName();
			log("Lost source instantiation service for " + symbolicName, LogService.LOG_DEBUG);
		
			// remove reference to instantiation services
			sourceFactory.unregisterSourceInstantiationService(symbolicName);				
		}
	}

	private void log(String message, int level) {
		sourceFactory.log(message, level);
	}
}
