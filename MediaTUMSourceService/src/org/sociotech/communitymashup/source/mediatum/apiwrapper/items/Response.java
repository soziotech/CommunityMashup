package org.sociotech.communitymashup.source.mediatum.apiwrapper.items;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


// This statement means that class "Response.java" is the root-element
@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class Response {

	@XmlElementWrapper(name="nodelist")
	@XmlElement(name="node")
	private List<Node> nodeList;
	public List getNodeList() {
		return nodeList;
	}
}
