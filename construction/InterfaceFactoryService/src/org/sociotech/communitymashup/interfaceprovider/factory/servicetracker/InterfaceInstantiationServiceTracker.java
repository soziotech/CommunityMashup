package org.sociotech.communitymashup.interfaceprovider.factory.servicetracker;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.sociotech.communitymashup.interfaceprovider.factory.impl.InterfaceFactoryImpl;
import org.sociotech.communitymashup.interfaceprovider.instantiation.facade.InterfaceInstantiationServiceFacade;

/**
 * This class tracks interface instantiation services and sets it for the use with the
 * interface factory provided to the constructor.
 * 
 * @author Peter Lachenmaier
 *
 */
public class InterfaceInstantiationServiceTracker extends ServiceTracker<InterfaceInstantiationServiceFacade, InterfaceInstantiationServiceFacade> {

	/**
	 * The interface factory that needs the instantiation service.
	 */
	private InterfaceFactoryImpl interfaceFactory;

	/**
	 * Creates a new interface instantiation service tracker.
	 * 
	 * @param context The context of the bundle.
	 * @param interfaceFactory A concrete instance of a interface factory
	 */
	public InterfaceInstantiationServiceTracker(BundleContext context, InterfaceFactoryImpl interfaceFactory) {
		super(context, InterfaceInstantiationServiceFacade.class.getName(), null);
		this.interfaceFactory = interfaceFactory;
	}

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#addingService(org.osgi.framework.ServiceReference)
	 */
	@Override
	public InterfaceInstantiationServiceFacade addingService(ServiceReference<InterfaceInstantiationServiceFacade> reference) {

		InterfaceInstantiationServiceFacade service = context.getService(reference);

		// set the instantiation service
		this.interfaceFactory.addInterfaceInstantiationService(service);
		
		return service;
	}		

	/* (non-Javadoc)
	 * @see org.osgi.util.tracker.ServiceTracker#removedService(org.osgi.framework.ServiceReference, java.lang.Object)
	 */
	@Override
	public void removedService(ServiceReference<InterfaceInstantiationServiceFacade> reference, InterfaceInstantiationServiceFacade service) {

		this.interfaceFactory.removeInterfaceInstantiationService(service);
		
		super.removedService(reference, service);
	}
}