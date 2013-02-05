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

import java.text.SimpleDateFormat;
import java.util.Date;

import com.mendeley.oapi.schema.SchemaEntity;

public class FileAttachement extends SchemaEntity {
	
	/**
	 *  The serial version uid
	 */
	private static final long serialVersionUID = -1921729909084574012L;

	/** The file hash. */
	private String file_hash;
	
	/** The file size. */
	private String file_size;

	/** The file extension. */
	private String file_extension;
	
	/** The date the file was added to mendeley. */
	private String date_added;

	/**
	 * @return the file_hash
	 */
	public String getFile_hash() {
		return file_hash;
	}

	/**
	 * @param file_hash the file_hash to set
	 */
	public void setFile_hash(String file_hash) {
		this.file_hash = file_hash;
	}

	/**
	 * @return the file_size
	 */
	public String getFile_size() {
		return file_size;
	}

	/**
	 * @param file_size the file_size to set
	 */
	public void setFile_size(String file_size) {
		this.file_size = file_size;
	}

	/**
	 * @return the file_extension
	 */
	public String getFile_extension() {
		return file_extension;
	}

	/**
	 * @param file_extension the file_extension to set
	 */
	public void setFile_extension(String file_extension) {
		this.file_extension = file_extension;
	}

	/**
	 * @return the date_added
	 */
	public String getDate_added() {
		return date_added;
	}

	/**
	 * @param date_added the date_added to set
	 */
	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}
	
	/**
	 * Returns the attribute date_added as Date object
	 * @return
	 */
	public Date getAddedDate()
	{
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
