package org.sociotech.communitymashup.source.factory.impl;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTrackerCustomizer;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;


/**
 * This Tracker can be used to observe the existence of log services and automatically adds the newest to
 * be used by source service given at the initialization.
 * 
 * @author Peter Lachenmaier
 *
 */
public class LogTrackerCustomizer implements ServiceTrackerCustomizer {

	private final BundleContext context;
	private SourceServiceFacadeImpl sourceService;
	
	private ServiceReference logServiceReference;

	public LogTrackerCustomizer(BundleContext context, SourceServiceFacadeImpl sourceService) {
		this.context = context;
		this.sourceService = sourceService;
		
		// retrieving log service if already started
		ServiceReference reference = context.getServiceReference(LogService.class.getName());
		if(reference != null)
		{
			sourceService.setLogService((LogService) context.getService(reference));
		}
	}
	
	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTrackerCustomizer#addingService(org.osgi.framework.ServiceReference)
	 */
	@Override
	public Object addingService(ServiceReference serviceReference) {
		
		Object service = context.getService(serviceReference);
		
		if(service instanceof LogService)
		{
			// set log service for source service
			sourceService.setLogService((LogService) service);
	
			// now logging works
			sourceService.log("Set log service for source service to " + service.toString(), LogService.LOG_DEBUG);
		}
	
		return null;
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTrackerCustomizer#removedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void removedService(ServiceReference serviceReference, Object arg1) {
		if(serviceReference == logServiceReference)
		{
			// used log service is removed so remove from source service
			sourceService.setLogService(null);
		}
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTrackerCustomizer#modifiedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void modifiedService(ServiceReference arg0, Object arg1) {
		// nothing to do
	}

}
