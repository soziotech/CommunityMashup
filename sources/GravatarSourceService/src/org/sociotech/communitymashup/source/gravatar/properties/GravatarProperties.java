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
package org.sociotech.communitymashup.source.gravatar.properties;

/**
 * This class contains string constants for properties used by the gravatar source service.
 * 
 * @author Peter Lachenmaier
 */
public class GravatarProperties {

    /**
     * This property is used to set size of the image. Values from 1 to 512 are possible 
     */
    public static final String IMAGE_SIZE_PROPERTY = "imageSize";
    public static final String IMAGE_SIZE_DEFAULT =  "150";
    
    /**
     * This property is used to set the highest possible ranking of the image.
     * Values can be     
     * g:  suitable for display on all websites with any audience type.
     * pg: may contain rude gestures, provocatively dressed individuals, the lesser swear words, or mild violence.
     * r:  may contain such things as harsh profanity, intense violence, nudity, or hard drug use.
     * x:  may contain hardcore sexual imagery or extremely disturbing violence.
     */
    public static final String RATING_PROPERTY = "imageRating";
    public static final String RATING_DEFAULT  = "g";
    
    /**
     * This property is used to set the default image if no image is associated with an email address.
     * Values can be
     * 404: do not load any image if none is associated with the email hash, instead return an HTTP 404 (File Not Found) response
     * mm: (mystery-man) a simple, cartoon-style silhouetted outline of a person (does not vary by email hash)
     * identicon: a geometric pattern based on an email hash
     * monsterid: a generated 'monster' with different colors, faces, etc
     * wavatar: generated faces with differing features and backgrounds
     * retro: awesome generated, 8-bit arcade-style pixelated faces
	 * or an url to an own default image
     */
    public static final String DEFAULTIMAGE_PROPERTY = "defaultImage";
    public static final String DEFAULTIMAGE_DEFAULT =  "mm";
    
}
