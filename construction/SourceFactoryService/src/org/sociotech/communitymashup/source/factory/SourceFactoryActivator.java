package org.sociotech.communitymashup.source.factory;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;
import org.sociotech.communitymashup.source.factory.facade.SourceFactoryServiceFacade;
import org.sociotech.communitymashup.source.factory.impl.SourceFactoryServiceImpl;
import org.sociotech.communitymashup.source.factory.impl.SourceInstantiationServiceTracker;
import org.sociotech.communitymashup.source.instantiation.facade.SourceInstantiationFacade;


/**
 * Activates the source factory bundle.
 * 
 * @author Peter Lachenmaier
 */
public class SourceFactoryActivator implements BundleActivator {

    private static BundleContext context;

    private ServiceTracker logServiceTracker;
    private ServiceTracker instantiationServiceTracker;
    private ServiceRegistration sourceFactoryServiceRegistration;

    static BundleContext getContext() {
	return context;
    }

    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext bundleContext) throws Exception {

	SourceFactoryActivator.context = bundleContext;

	// create log service tracker
	//		LogTrackerCustomizer logTrackerCustomizer = new LogTrackerCustomizer(context, sourceService);
	//		logServiceTracker = new ServiceTracker(context, org.osgi.service.log.LogService.class.getName(), logTrackerCustomizer);
	//		logServiceTracker.open();
	//		
	// create and register source factory service
	SourceFactoryServiceImpl sourceFactory = new SourceFactoryServiceImpl();
	sourceFactoryServiceRegistration = bundleContext.registerService(SourceFactoryServiceFacade.class.getName(), sourceFactory, null);
	log("Registering source factory service", LogService.LOG_INFO);


	// create a tracker to collect source instantiation services
	SourceInstantiationServiceTracker sourceInstantiationServiceTracker = new SourceInstantiationServiceTracker(context, sourceFactory);
	instantiationServiceTracker = new ServiceTracker(context, SourceInstantiationFacade.class.getName(), sourceInstantiationServiceTracker);
	instantiationServiceTracker.open();

	// TODO check if instantiation services get lost if they are started before
    }

    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext bundleContext) throws Exception {
	// close log service tracker
	logServiceTracker.close();

	// close instantiation service tracker
	instantiationServiceTracker.close();

	// unregister source factory service
	sourceFactoryServiceRegistration.unregister();

	SourceFactoryActivator.context = null;
    }

    private void log(String message, int level) {
	System.out.println(message);
    }
}
