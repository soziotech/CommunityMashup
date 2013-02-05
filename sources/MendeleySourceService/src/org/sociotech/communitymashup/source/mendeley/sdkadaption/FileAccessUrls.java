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
package org.sociotech.communitymashup.source.mendeley.sdkadaption;

public class FileAccessUrls {
	
	// TODO: remove with_redirect after complete transition of api to new version
	public static String GET_FILE_URL_URL = "http://api.mendeley.com/oapi/library/documents/{document_id}/file/{file_hash}/{group_id}/?with_redirect=true/";
	//public static String GET_FILE_URL_URL = "http://api.mendeley.com/oapi/library/documents/{document_id}/file/{file_hash}/{group_id}/";
}
