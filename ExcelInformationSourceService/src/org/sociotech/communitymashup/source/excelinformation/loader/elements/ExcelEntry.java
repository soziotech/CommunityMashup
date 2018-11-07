package org.sociotech.communitymashup.source.excelinformation.loader.elements;

/**
 * Abstract super class of all table entries.
 * 
 * @author Peter Lachenmaier
 */
public abstract class ExcelEntry {
	private String id;
	private String identifier;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String id) {
		this.identifier = id;
	}
}
