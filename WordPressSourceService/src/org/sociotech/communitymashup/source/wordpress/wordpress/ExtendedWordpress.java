package org.sociotech.communitymashup.source.wordpress.wordpress;

import java.net.MalformedURLException;

import net.bican.wordpress.User;
import net.bican.wordpress.Wordpress;
import redstone.xmlrpc.XmlRpcFault;

public class ExtendedWordpress extends Wordpress {

	public ExtendedWordpress(String username, String password, String xmlRpcUrl)
			throws MalformedURLException {
		super(username, password, xmlRpcUrl);
		
		// create own blogger bridge due to no access to private attribute
//		this.blogger = (BloggerBridge) XmlRpcProxy.createProxy(xmlRpcUrl, "blogger",
//		        new Class[] { BloggerBridge.class }, true);
	}
	
	public User getUser(int user_id) throws XmlRpcFault
	{
		User user = null;
		// user = this.getUserInfo();
		
		return user;
	}

}
