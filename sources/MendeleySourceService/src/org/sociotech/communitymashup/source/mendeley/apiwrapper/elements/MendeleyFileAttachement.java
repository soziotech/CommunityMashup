/*******************************************************************************
 * Copyright (c) 2014 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.mendeley.apiwrapper.elements;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MendeleyFileAttachement extends MendeleyEntity {
	
	/**
	 *  The serial version uid
	 */
	private static final long serialVersionUID = -1921729909084574012L;

	private String file_hash;
	private String file_size;
	private String file_extension;
	private String date_added;

	public String getFile_hash() {
		return file_hash;
	}
	public void setFile_hash(String file_hash) {
		this.file_hash = file_hash;
	}
	public String getFile_size() {
		return file_size;
	}
	public void setFile_size(String file_size) {
		this.file_size = file_size;
	}
	public String getFile_extension() {
		return file_extension;
	}
	public void setFile_extension(String file_extension) {
		this.file_extension = file_extension;
	}
	public String getDate_added() {
		return date_added;
	}
	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}
	
	public Date getAddedDate()	{
		if(date_added == null)
		{
			return null;
		}
		
		// Sample: 2011-03-30 08:22:23
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = null;
		try {
			date = format.parse(date_added);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return date;
	}
}
