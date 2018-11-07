package org.sociotech.communitymashup.source.excelinformation;

import org.sociotech.communitymashup.source.facade.SourceServiceFacade;
import org.sociotech.communitymashup.source.instantiation.impl.SourceInstantiationFacadeImpl;

/**
 * Source specific instantiation service.
 * 
 * @author Peter Lachenmaier
 */
public class ExcelInformationSourceInstantiationService extends SourceInstantiationFacadeImpl {

	/* (non-Javadoc)
	 * @see de.unibw.cscm.communitymashup.sourceinstantiationfacade.facade.SourceInstantiationFacade#instantiate()
	 */
	@Override
	public SourceServiceFacade instantiate() {
		
		// create a new data source and return it
		return instantiated(new ExcelInformationSourceService());
	}
}
