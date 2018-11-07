package org.sociotech.communitymashup.source.excelinformation;

import org.osgi.framework.BundleContext;
import org.sociotech.communitymashup.source.impl.SourceBundleActivator;

/**
 * Source secific bundle activator.
 * 
 * @author Peter Lachenmaier
 */
public class ExcelInformationSourceBundleActivator extends SourceBundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		
		super.start(bundleContext, new ExcelInformationSourceInstantiationService());
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		
		super.stop(bundleContext);
	}

}
