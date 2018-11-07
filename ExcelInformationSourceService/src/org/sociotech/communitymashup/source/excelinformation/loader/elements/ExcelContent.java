package org.sociotech.communitymashup.source.excelinformation.loader.elements;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ExcelContent extends ExcelInformationObject {
	private String documentUrl;
	private Date startDate;
	private Date endDate;

	public String getDocumentUrl() {
		return documentUrl;
	}

	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}
	
	public Date getStartdate() {
		return startDate;
	}
	public void setStartdate(String start) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
		   startDate = formatter.parse(start);
		} catch (Exception e) { 
			formatter = new SimpleDateFormat("yyyy-MM-dd");
			try {
				startDate = formatter.parse(start);
			} catch (Exception e2) {
				// TBD: error message
			}
		}
	}
	
	public Date getEnddate() {
		return endDate;
	}
	public void setEnddate(String end) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
		   endDate = formatter.parse(end);
		} catch (Exception e) { 
			formatter = new SimpleDateFormat("yyyy-MM-dd");
			try {
				endDate = formatter.parse(end);
			} catch (Exception e2) {
				// TBD: error message
			}
		}
	}
	
}
