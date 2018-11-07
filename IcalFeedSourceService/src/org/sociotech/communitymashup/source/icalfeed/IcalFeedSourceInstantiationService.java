package org.sociotech.communitymashup.source.icalfeed;

import org.sociotech.communitymashup.source.facade.SourceServiceFacade;
import org.sociotech.communitymashup.source.icalfeed.IcalFeedSourceService;
import org.sociotech.communitymashup.source.instantiation.impl.SourceInstantiationFacadeImpl;

/**
 * Source instantiation service for ical feed sources. 
 * 
 * @author Michael Koch
 *
 */
public class IcalFeedSourceInstantiationService extends SourceInstantiationFacadeImpl {

    /* (non-Javadoc)
     * @see org.sociotech.communitymashup.sourceinstantiationfacade.facade.SourceInstantiationFacade#instantiate()
     */
    @Override
    public SourceServiceFacade instantiate() {
	// create a new feed source and return it
    	return instantiated(new IcalFeedSourceService());
    }

}