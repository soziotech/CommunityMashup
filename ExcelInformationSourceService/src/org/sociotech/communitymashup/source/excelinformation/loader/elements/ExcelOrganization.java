package org.sociotech.communitymashup.source.excelinformation.loader.elements;


public class ExcelOrganization extends ExcelInformationObject {
	
	public String getParentOrg() {
		return getOrg();
	}
	public void setParentOrg(String org) {
		setOrg(org);
	}
	
}
