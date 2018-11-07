package org.sociotech.communitymashup.source.mediatum.apiwrapper.items;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;


@XmlAccessorType(XmlAccessType.FIELD)
public class Node {
	
	// list of attribute elements
	private List<Attribute> data;
	
	// hash map of attribute elements
	private Map<String,String> dataMap = new HashMap<String,String>();
	
	// list of mask elements
	private List<Mask> maskdata;
	
	// updateTime
	long updateTime = 0L;
	
	@XmlAttribute
	protected String name;
	
	@XmlAttribute
	protected String id;
	
	@XmlAttribute
	protected String type;

	@XmlElement(name="attribute")
	public List<Attribute> getAttribute() {
		return data;
	}
	public void setAttribute(List<Attribute> data) {
		this.data = data;
		for (Attribute attribute: data) {
			dataMap.put(attribute.name, attribute.content);
		}
	}
	
	public String getAttribute(String name) {
		if (this.dataMap.size() == 0)
			this.setAttribute(this.data);
		return dataMap.get(name);
	}
	
	@XmlElement(name="mask")
	public List<Mask> getMask() {
		return maskdata;
	}
	public void setMask(List<Mask> maskdata) {
		this.maskdata = maskdata;
	}
	
	
	public String getId() {
		return id;
	}
	
	public String getDefaultMask() {
		if (maskdata == null) return "";
		String result = maskdata.get(0).content;
		for (Mask mask : maskdata) {
			if (mask.name.equals("default")) {
				result = mask.content;
			}
		}
		return result;
	}
	
	public long getUpdateTime() {
		if (updateTime > 0L) {
			return updateTime;
		}
		long tmpl = 0L;
		try {
			String tmps = getAttribute("updatetime");
			if (tmps != null) {
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); // 2015-01-01T00:00:00
				Date date = format.parse(tmps);
				tmpl = date.getTime();
			}
		} catch (Exception e) { }
		updateTime = tmpl;
		return tmpl;
	}
	
	public String toString() {
		String tmps = "Node("+name+","+id+","+type+"):";
		Iterator<Attribute> iterator = data.iterator();
		while (iterator.hasNext()) {
			tmps += ((Attribute)iterator.next()).toString();
		}
		return tmps;
	}
	
	
}