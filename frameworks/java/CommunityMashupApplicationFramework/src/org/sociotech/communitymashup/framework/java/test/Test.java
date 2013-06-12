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

import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.framework.java.MashupConnector;
import org.sociotech.communitymashup.framework.java.exceptions.MashupConnectionException;

public class Test {
	public static void main(String[] args) {
		MashupConnector connector = new MashupConnector("http://localhost:8080/mashup", 5);
		DataSet testSet = null;
		try {
			testSet = connector.getDataSet();
		} catch (MashupConnectionException e) {
			e.printStackTrace();
			System.exit(0);
		}
		// create data set observer
		@SuppressWarnings("unused")
		TestObserver testObserver = new TestObserver(testSet);
	}
}
