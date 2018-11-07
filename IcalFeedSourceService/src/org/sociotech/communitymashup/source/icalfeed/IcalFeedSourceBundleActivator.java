package org.sociotech.communitymashup.source.icalfeed;

import org.osgi.framework.BundleContext;
import org.sociotech.communitymashup.source.impl.SourceBundleActivator;

public class IcalFeedSourceBundleActivator extends SourceBundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		
		super.start(bundleContext, new IcalFeedSourceInstantiationService());
	
		// TODO Implement here
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceBundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext arg0) throws Exception {
		
		// TODO Clean Up Here
		
		super.stop(arg0);
	}
	
}
