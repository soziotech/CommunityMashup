/**
 * 
 */
package org.sociotech.communitymashup.source.wordpress;

import org.sociotech.communitymashup.source.facade.SourceServiceFacade;
import org.sociotech.communitymashup.source.instantiation.impl.SourceInstantiationFacadeImpl;

/**
 * Instantiation Service for wordpress source services.
 * 
 * @author Peter Lachenmaier
 */
public class WordPressSourceInstantiationService extends SourceInstantiationFacadeImpl {

    /* (non-Javadoc)
     * @see org.sociotech.communitymashup.source.instantiation.facade.SourceInstantiationFacade#instantiate()
     */
    @Override
    public SourceServiceFacade instantiate() {
	return instantiated(new WordPressSourceServiceImpl());
    }

}
