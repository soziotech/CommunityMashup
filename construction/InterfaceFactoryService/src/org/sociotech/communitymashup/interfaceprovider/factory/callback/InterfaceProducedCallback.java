package org.sociotech.communitymashup.interfaceprovider.factory.callback;

import org.sociotech.communitymashup.application.Interface;
import org.sociotech.communitymashup.interfaceprovider.facade.InterfaceServiceFacade;
import org.sociotech.communitymashup.interfaceprovider.factory.facade.InterfaceFactoryFacade;

/**
 * If a callback is needed after an mashup interface is produced, this
 * interfaced must be implemented and the production must be started with
 * {@link InterfaceFactoryFacade#produceInterfaceAndCallback(org.sociotech.communitymashup.application.Interface, org.sociotech.communitymashup.data.DataSet, InterfaceProducedCallback)}
 * 
 * 
 * @author Peter Lachenmaier
 */
public interface InterfaceProducedCallback {

	/**
	 * Will be called after the interface with the given configuration is produced successfully.
	 * 
	 * @param configuration Interface configuration.
	 * @param interfaceService Interface service.
	 */
	public void interfaceProduced(Interface configuration, InterfaceServiceFacade interfaceService);
}
