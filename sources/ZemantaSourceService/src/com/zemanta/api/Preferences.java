/*
 * Copyright (C) 2008 Zemanta ltd.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.zemanta.api;

import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * Class representing preferences request
 * 
 * @author Matej Usaj
 */
public class Preferences extends Request {
	/** 
	 * URL of Zemanta suggestion engine 
	 * @deprecated URL is obtained from Zemanta instance.*/
	//private static final String URL = "http://api.zemanta.com/services/rest/0.0/";
  
	/** Status of the request */
	public String status;
	  
	/** The URL where the preferences can be updated */
	public String configUrl;
	  
	/** The user's amazon affiliate id */
	public String amazonId;
	  
	/** HTML code style */
	public String doctype;
	  
	/** Image position */
	public String imagePosition;
	  
	/** The chosen Zemanta signature icon */
	public String pixie;
	  
	/** The stage of the user (testing) */
	public String stage;
  
  /**
   * Constructor that automatically fetches and parses preferences from
   * suggestion engine.
   * 
   * @param inst Zemanta class instance containing all data to make the
   *    preferences request.
   */
  private Preferences(Zemanta inst) {
    try {
    	
    	
    	
  	
      //Document doc = request(RequestType.PREFERENCES, inst.getGateway(), inst.getApiKey(), null);
      
    	HashMap<String, String> parameters = new HashMap<String, String>();
    	parameters.put("method", "zemanta.preferences");
    	parameters.put("api_key", inst.getApiKey());
      
    	Document doc = request(inst.getGateway(), parameters);
    	
   
		 Element root = doc.getDocumentElement();
		  
		 status = getElementText(root, "status");
		 configUrl = getElementText(root, "config_url");
		 amazonId = getElementText(root, "amazon_id");
		 doctype = getElementText(root, "doctype");
		 imagePosition = getElementText(root, "image_position");
		 pixie = getElementText(root, "pixie");
		 stage = getElementText(root, "stage");
		  
		} catch (IOException e) {
			status = "fail";
		} catch (SAXException e) {
			status = "fail";
		} catch (ParserConfigurationException e) {
			status = "fail";
		} catch (Exception e) {
			status = "fail";
		}
  }
  
  /** 
   * Fetch API users preferences 
   * 
   * @param inst Zemanta class instance containing all data to make the
   *    preferences request.
   *    
   * @return The preferences
   */
  public static final Preferences getPreferences(Zemanta inst) {
    return new Preferences(inst);
  }
  
  @Override
  public String toString() {
    return new StringBuilder()
        .append("Preferences:\n")
        .append("  status=").append(status).append("\n")
        .append("  config_url=").append(configUrl).append("\n")
        .append("  amazon_id=").append(amazonId).append("\n")
        .append("  doctype=").append(doctype).append("\n")
        .append("  image_position=").append(imagePosition).append("\n")
        .append("  pixie=").append(pixie).append("\n")
        .append("  stage=").append(stage).toString();
  }
}
