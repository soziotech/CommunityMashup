package org.sociotech.communitymashup.source.mediatum;

import org.sociotech.communitymashup.source.facade.SourceServiceFacade;
import org.sociotech.communitymashup.source.instantiation.impl.SourceInstantiationFacadeImpl;

/**
 * Source instantiation of the MediaTUM source service. 
 * 
 */
public class MediaTUMSourceInstantiationService extends SourceInstantiationFacadeImpl {

    /* (non-Javadoc)
     * @see org.sociotech.communitymashup.sourceinstantiationfacade.facade.SourceInstantiationFacade#instantiate()
     */
    @Override
    public SourceServiceFacade instantiate() {
    	
    	// create a new feed source and return it
    	return instantiated(new MediaTUMSourceService());
    }

}
