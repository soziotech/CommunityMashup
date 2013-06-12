/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.framework.java.test;

import org.eclipse.emf.common.notify.Notification;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.observer.dataset.DataSetChangeObserver;
import org.sociotech.communitymashup.data.observer.dataset.DataSetChangedInterface;

public class TestObserver implements DataSetChangedInterface {

	public TestObserver(DataSet dataSet) {

		// create data set observer
		@SuppressWarnings("unused")
		DataSetChangeObserver dataSetObserver = new DataSetChangeObserver(dataSet, this);
		
		int waitCounter = 1;
		// stay alive
		while (true) {
			try {
				Thread.sleep(5000);
				System.out.println("Wait-count: " + waitCounter++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	@Override
	public void dataSetChanged(Notification notification) {
		System.out.println("Got: " + notification);
	}

}
