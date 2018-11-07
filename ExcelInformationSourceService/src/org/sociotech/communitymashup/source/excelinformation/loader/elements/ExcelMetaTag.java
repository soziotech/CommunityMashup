package org.sociotech.communitymashup.source.excelinformation.loader.elements;

import java.util.LinkedList;
import java.util.List;

public class ExcelMetaTag extends ExcelEntry {
	private String id;
	private String name;
	private String abstr;
	private String xmlString;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbstract() {
		return abstr;
	}
	public void setAbstract(String abstr) {
		this.abstr = abstr;
	}
	public String getDescription() {
		return abstr;
	}
	public void setDescription(String abstr) {
		this.abstr = abstr;
	}
	public String getXmlString() {
		return xmlString;
	}
	public void setXmlString(String xmlString) {
		this.xmlString = xmlString;
	}
	
}
