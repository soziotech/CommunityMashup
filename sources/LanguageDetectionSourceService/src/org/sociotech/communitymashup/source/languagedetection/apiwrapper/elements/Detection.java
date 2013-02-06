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
 * Wrapper for serialized language detection result.
 * 
 * @author Peter Lachenmaier
 */
public class Detection implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2837422399096264899L;

	/* Sample
 	{
        "isReliable":false,
        "confidence":0.45171339563862928,
        "language":"es"
     }
	 */
	
	/** Whether it is reliable or not (0.75 confident) */
	private boolean isReliable;
	
	/** The confidence. */
	private float confidence;
	
	/** The language string. */
	private String language;

	/**
	 * @return the isReliable
	 */
	public boolean isReliable() {
		return isReliable;
	}

	/**
	 * @param isReliable the isReliable to set
	 */
	public void setReliable(boolean isReliable) {
		this.isReliable = isReliable;
	}

	/**
	 * @return the confidence
	 */
	public float getConfidence() {
		return confidence;
	}

	/**
	 * @param confidence the confidence to set
	 */
	public void setConfidence(float confidence) {
		this.confidence = confidence;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
