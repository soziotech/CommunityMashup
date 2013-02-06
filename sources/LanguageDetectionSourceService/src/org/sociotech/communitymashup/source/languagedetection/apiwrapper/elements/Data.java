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
 * Wrapper for all data from detectlanguage.com
 * 
 * @author Peter Lachenmaier
 */
public class Data implements Serializable {
	
	/**
	 * The serial version id
	 */
	private static final long serialVersionUID = -1088058300775161229L;
	
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
	
	/** The detections. */
	private Detection[] detections;

	/**
	 * @return the detections
	 */
	public Detection[] getDetections() {
		return detections;
	}

	/**
	 * @param detections the detections to set
	 */
	public void setDetections(Detection[] detections) {
		this.detections = detections;
	}
	
}
