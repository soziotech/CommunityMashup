/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.languagedetection.apiwrapper.elements;

import java.io.Serializable;

/**
 * Wrapper for all results from detectlanguage.com
 * 
 * @author Peter Lachenmaier
 */
public class DetectionResult implements Serializable {
	
	/**
	 * The serial version id
	 */
	private static final long serialVersionUID = 2533092848506736810L;
	
	/* Sample
	{
	   "data":{
	      "detections":[
	         {
	            "isReliable":false,
	            "confidence":0.45171339563862928,
	            "language":"es"
	         },
	         {
	            "isReliable":false,
	            "confidence":0.083565459610027856,
	            "language":"pt"
	         }
	      ]
	   }
	}
	 */
	
	/** The data. */
	private Data data;

	/**
	 * @return the data
	 */
	public Data getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Data data) {
		this.data = data;
	}
	
}
