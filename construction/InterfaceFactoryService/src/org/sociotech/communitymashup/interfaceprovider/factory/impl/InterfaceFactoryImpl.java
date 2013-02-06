package org.sociotech.communitymashup.interfaceprovider.factory.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.ApplicationPackage;
import org.sociotech.communitymashup.application.FEEDInterface;
import org.sociotech.communitymashup.application.Interface;
import org.sociotech.communitymashup.application.RESTInterface;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.interfaceprovider.facade.InterfaceServiceFacade;
import org.sociotech.communitymashup.interfaceprovider.factory.facade.InterfaceFactoryFacade;
import org.sociotech.communitymashup.interfaceprovider.instantiation.facade.InterfaceInstantiationServiceFacade;

/**
 * @author Peter Lachenmaier
 *
 * The interface factory produces interfaces. It looks for a interface Instantiation Service and uses this
 * Service to create instances based on a given configuration.
 */
public class InterfaceFactoryImpl implements InterfaceFactoryFacade {

	// TODO create map to support future interfaces
	/**
	 * Local reference to an feed interface instantiation service. This one will be used to produce interfaces.
	 * Make sure to maintain the reference by using {@link #addInterfaceInstantiationService(InterfaceInstantiationServiceFacade)}
	 * and {@link #removeInterfaceInstantiationService(InterfaceInstantiationServiceFacade)}
	 */
	private InterfaceInstantiationServiceFacade feedInstantiationService = null;

	/**
	 * Local reference to an rest interface instantiation service. This one will be used to produce interfaces.
	 * Make sure to maintain the reference by using {@link #addInterfaceInstantiationService(InterfaceInstantiationServiceFacade)}
	 * and {@link #removeInterfaceInstantiationService(InterfaceInstantiationServiceFacade)}
	 */
	private InterfaceInstantiationServiceFacade restInstantiationService = null;

	/**
	 * This map contains interfaces and their data sets that are currently not instantiated due to missing instantiation service.
	 */
	private Map<Interface, DataSet> openInterfaces;

	/**
	 * Constructs a new interface factory.
	 */
	public InterfaceFactoryImpl()
	{
		// create empty list
		openInterfaces = new HashMap<Interface, DataSet>();
	}

	/**
	 * Sets a reference to a mashup instantiation service which will be used for the creation of mashups.
	 * 
	 * @param interfaceInstantiationService 
	 */
	public void addInterfaceInstantiationService(InterfaceInstantiationServiceFacade interfaceInstantiationService)
	{
		if(interfaceInstantiationService == null)
		{
			return;
		}
		
		// get the interface the service is capable to instantiate
		EClass instantiatableClass = interfaceInstantiationService.getInstantiatableInterfaceClass();
		
		if(instantiatableClass == ApplicationPackage.eINSTANCE.getFEEDInterface())
		{
			// remove previously used one
			removeInterfaceInstantiationService(feedInstantiationService);
			feedInstantiationService = interfaceInstantiationService;

			log("Got feed interface instantiation service.", LogService.LOG_DEBUG);
		}

		if(instantiatableClass == ApplicationPackage.eINSTANCE.getRESTInterface())
		{
			// remove previously used one
			removeInterfaceInstantiationService(restInstantiationService);
			restInstantiationService = interfaceInstantiationService;

			log("Got rest interface instantiation service.", LogService.LOG_DEBUG);
		}

		if(openInterfaces.isEmpty())
		{
			// nothing to do
			return;
		}

		// There are interfaces waiting for production

		// temporary keep all open interfaces
		Map<Interface, DataSet> tmpMap = new HashMap<Interface, DataSet>(openInterfaces);

		// clear the list
		openInterfaces.clear();

		for(Interface configuration : tmpMap.keySet())
		{
			// produce every single interface
			// will be re-added to openInterfaces list if it can not be produced
			produceInterface(configuration, tmpMap.get(configuration));
		}
	}

	/**
	 * Removes the local references to the given interface instantiation service.
	 * 
	 * @param instantiationService References to this instantiation service will be removed 
	 */
	public void removeInterfaceInstantiationService(InterfaceInstantiationServiceFacade instantiationService)
	{
		if(instantiationService == null)
		{
			// nothing to do
			return;
		}
		
		if(feedInstantiationService == instantiationService)
		{
			// add cleanup code here
			feedInstantiationService = null;
			log("Lost feed interface instantiation service", LogService.LOG_DEBUG);
		}

		if(restInstantiationService == instantiationService)
		{
			// add cleanup code here
			restInstantiationService = null;
			log("Lost rest interface instantiation service", LogService.LOG_DEBUG);
		}
	}


	private void log(String message, int level) {
		// TODO replace
		System.out.println(message);
	}


	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.interfaceprovider.factory.facade.InterfaceFactoryFacade#produceInterface(org.sociotech.communitymashup.application.Interface, org.sociotech.communitymashup.data.DataSet)
	 */
	@Override
	public InterfaceServiceFacade produceInterface(Interface interfaceConfiguration, DataSet dataSet)
	{
		if(interfaceConfiguration == null)
		{
			// illegal configuration
			return null;
		}

		if(interfaceConfiguration instanceof FEEDInterface)
		{
			return produceFeedInterface((FEEDInterface) interfaceConfiguration, dataSet);
		}

		if(interfaceConfiguration instanceof RESTInterface)
		{
			return produceRESTInterface((RESTInterface) interfaceConfiguration, dataSet);
		}

		log("No implementation for producing interface " + interfaceConfiguration, LogService.LOG_ERROR);

		return null;
	}


	private InterfaceServiceFacade produceRESTInterface(RESTInterface interfaceConfiguration, DataSet dataSet)
	{
		if(restInstantiationService == null)
		{
			// no instantiation service available, so keep configuration for later creation
			openInterfaces.put(interfaceConfiguration, dataSet);

			log("Keeping interface " + interfaceConfiguration + " for later production.", LogService.LOG_DEBUG);

			return null;
		}

		InterfaceServiceFacade newInterfaceService = restInstantiationService.instantiate(interfaceConfiguration, dataSet);

		log("Produced rest interface.", LogService.LOG_DEBUG);

		// remove it from open interfaces
		openInterfaces.remove(interfaceConfiguration);
				
		// and return it
		return newInterfaceService;
	}


	private InterfaceServiceFacade produceFeedInterface(FEEDInterface interfaceConfiguration, DataSet dataSet)
	{
		if(feedInstantiationService == null)
		{
			// no instantiation service available, so keep configuration for later creation
			openInterfaces.put(interfaceConfiguration, dataSet);

			log("Keeping interface " + interfaceConfiguration + " for later production.", LogService.LOG_DEBUG);

			return null;
		}

		InterfaceServiceFacade newInterfaceService = feedInstantiationService.instantiate(interfaceConfiguration, dataSet);

		// remove it from open interfaces
		openInterfaces.remove(interfaceConfiguration);
		
		log("Produced feed interface.", LogService.LOG_DEBUG);

		// and return it
		return newInterfaceService;
	}
}
