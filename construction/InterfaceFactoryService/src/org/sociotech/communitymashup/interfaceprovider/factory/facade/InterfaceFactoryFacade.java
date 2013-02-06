/**
 * 
 */
package org.sociotech.communitymashup.interfaceprovider.factory.facade;

import org.sociotech.communitymashup.application.Interface;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.interfaceprovider.facade.InterfaceServiceFacade;

/**
 * The facade of a interface factory service. Use services providing this interface to create interface services.
 * 
 * @author Peter Lachenmaier
 */
public interface InterfaceFactoryFacade {
	
	/**
	 * Produces an interface of the given configuration. Might be delayed until an valid interface instantiation service appears.
	 * 
	 * @param interfaceConfiguration The configuration of the interface that should be produced
	 * @param dataSet The data set, that should be provided by the produced interface.
	 * @return The produced interface service or null in error case.
	 */
	public InterfaceServiceFacade produceInterface(Interface interfaceConfiguration, DataSet dataSet);
}
