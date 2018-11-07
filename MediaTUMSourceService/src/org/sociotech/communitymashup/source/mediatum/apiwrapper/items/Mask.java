package org.sociotech.communitymashup.source.mediatum.apiwrapper.items;

import java.util.Iterator;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlValue;


@XmlAccessorType(XmlAccessType.FIELD)
public class Mask {

	@XmlAttribute
	protected String name;
	
	@XmlValue
	protected String content;
	
	
	public String toString() {
		String tmps = "("+name+","+content+"):";
		return tmps;
	}
	
}