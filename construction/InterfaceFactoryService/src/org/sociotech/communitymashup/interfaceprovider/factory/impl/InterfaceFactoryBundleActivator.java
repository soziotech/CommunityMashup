package org.sociotech.communitymashup.interfaceprovider.factory.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.sociotech.communitymashup.interfaceprovider.factory.facade.InterfaceFactoryFacade;
import org.sociotech.communitymashup.interfaceprovider.factory.servicetracker.InterfaceInstantiationServiceTracker;

/**
 * The activator of the interface factory bundle.
 *
 * @author Peter Lachenmaier
 */
public class InterfaceFactoryBundleActivator implements BundleActivator {

	private static BundleContext context;

	private ServiceRegistration<InterfaceFactoryFacade> registeredInterfaceFactory;

	private InterfaceInstantiationServiceTracker instantiationServiceTracker;

	private InterfaceFactoryImpl interfaceFactory;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		context = bundleContext;

		interfaceFactory = new InterfaceFactoryImpl();
		registeredInterfaceFactory = context.registerService(InterfaceFactoryFacade.class, interfaceFactory, null);
		
		// register instantiation service tracker
		instantiationServiceTracker = new InterfaceInstantiationServiceTracker(bundleContext, interfaceFactory);
		instantiationServiceTracker.open();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		context = null;

		if(instantiationServiceTracker != null)
		{
			// close instantiation service tracker
			instantiationServiceTracker.close();
		}

		// stop interface factory
		interfaceFactory.stop();
		
		// unregister interface factory service
		registeredInterfaceFactory.unregister();
	}


}
