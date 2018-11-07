package org.sociotech.communitymashup.source.excelinformation.loader.elements;


public class ExcelPerson extends ExcelInformationObject {
	private String firstname;
	private String lastname;
	private String twitterAccount;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getTwitterAccount() {
		return twitterAccount;
	}
	public void setTwitterAccount(String twitterAccount) {
		this.twitterAccount = twitterAccount;
	}
}
