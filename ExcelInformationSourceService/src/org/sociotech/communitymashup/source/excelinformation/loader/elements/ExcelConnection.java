package org.sociotech.communitymashup.source.excelinformation.loader.elements;

import java.util.LinkedList;
import java.util.List;

public class ExcelConnection extends ExcelEntry {
	private String id;
	private String fromid;
	private String toid;
	private String metatags;
	private String abstr;
	private String xmlString;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFromid() {
		return fromid;
	}
	public void setFromid(String id) {
		this.fromid = id;
	}
	public String getToid() {
		return toid;
	}
	public void setToid(String id) {
		this.toid = id;
	}
	public String getMetatags() {
		return metatags;
	}
	public void setMetatags(String metatags) {
		this.metatags = metatags;
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
	
	// extended getters
	
	public List<String > getMetaTagsAsList() {
		List<String> result = new LinkedList<String>();
		if(metatags == null || metatags.isEmpty()) {
			return result;
		}
		String[] splitted = metatags.split(",");
		for(String tag : splitted) {
			result.add(tag.trim());
		}
		return result;
	}
	
}
