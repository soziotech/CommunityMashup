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

import java.util.HashMap;
import java.util.Map;


/**
 * The <code>Zemanta</code> class represents java implementation of 
 * <a href="http://www.zemanta.com">Zemanta ltd.</a> API. Zemanta is a 
 * suggestion engine that works on any given text. Read more in the link
 * given above or in <a href="http://developer.zemanta.com">developers</a>
 * pages.
 * 
 * @author Matej Usaj
 */
public class Zemanta {
  /** API host url */
  private static final String API_HOST = "api.zemanta.com";
  
  /** Gateway for API calls */
  private static final String GATEWAY = "/services/rest/0.0/";
  
  /** Currently used API key for API calls */
  private String apiKey;
  
  /** Currently used gateway for API calls */
  private String apiServiceURL;
  
  /** 
   * Main constructor that initializes all data required for API calls
   * 
   *  @param apiKey API key for server authentication. Developers can register
   *      for it at <a href="http://developer.zemanta.com">developers</a> page
   *      of Zemanta.
   */
  public Zemanta(String apiKey) {
    this.apiKey = apiKey;
    this.apiServiceURL = 
      new StringBuilder().append("http://").append(API_HOST).append(GATEWAY).toString();
  }
  
  // new constructor
  /**
   * Alternative constructor for initialization required for API calls
   * 
   * @param apiKey API key for Zemanta request
   * @param u Zemanta API Service URL (host + gateway) 
   */
  public Zemanta(String apiKey, String u) {
	    this.apiKey = apiKey;
	    this.apiServiceURL = u;
	  }
  
  /**
   * Query Zemanta service for suggestions or markup in format other than XML.
   * 
   * <p>Other supported formats: JSON, WJSON, RDF/XML 
   * @param parameters Collection of parameters in the form of(key, value)
   * @return String representation of results in format requested.
   */
  public String getRawData(Map<String, String> parameters) {
	  String result = "";
	  
	  try {
		  result = Request.requestString(this.getGateway(), parameters);
	  
	  } catch (Exception e) {
		  e.printStackTrace();
	  }
	  
	  return result;
  }

  /**
   * Query the Zemanta service for markup with default settings.
   * @param text The text that suggestion engine will parse.
   * 
   * @return {@link ZemantaResult} object, containing all suggestions found
   */
  public ZemantaResult suggestMarkup(String text) {
    
	  HashMap<String, String> parameters = new HashMap<String, String>();
	  parameters.put("method", "zemanta.suggest_markup");
	  parameters.put("text", text);
	  	  
	  return Suggest.getResults(this,parameters);
    		
  }

  /**
   * Query the Zemanta service for suggestions of markup.
   * 
   * @param text The text that suggestion engine will parse.
   * 
   * @return {@link ZemantaResult} object, containing found markup
   * @deprecated useFreebase is not supported anymore. Use other suggestMarkup method.
   */
  @Deprecated
  public ZemantaResult suggestMarkup(String text, boolean useFreebase) {
    return Suggest.getResultsMarkup(this, text, useFreebase);
  }

  
  
  /**
   * Query the Zemanta service for suggestions with default settings:
   * method 'suggest' and format 'xml'
   * 
   * @param text The text that suggestion engine will parse.
   * 
   * @return {@link ZemantaResult} object, containing all found suggestions
   */
  public ZemantaResult suggest(String text) {
	  
	  HashMap<String, String> parameters = new HashMap<String, String>();
	  parameters.put("method", "zemanta.suggest");
	  parameters.put("text", text);
	  
	  return Suggest.getResults(this, parameters);
  }

  /**
   * 
   * Query Zemanta service for suggestions.
   * 
   * @param text The text that suggestion engine will parse.
   * @param useFreebase Return freebase GUIDs for links.
   * 
   * @return {@link ZemantaResult} object, containing all found suggestions
   * @deprecated useFreebase is not supported anymore. Use other suggest method instead.
   */
  @Deprecated
  public ZemantaResult suggest(String text, boolean useFreebase) {
    return Suggest.getResults(this, text, useFreebase);
  }
  
  /**
   * Query the Zemanta service for suggestions with a set of parameters
   * New from November 2011
   * 
   * @param parameters Pairs of (key,value) parameters for query
   * @return {@link ZemantaResult} object, containing all suggestions found.
   */
  public ZemantaResult suggest(Map<String, String> parameters) {
	  return Suggest.getResults(this, parameters);	  
  }

  
  /**
   * Fetch API users preferences from suggestion engine
   * 
   * @return A {@link Preferences} object containing preferences data
   */
  public Preferences preferences() {
    return Preferences.getPreferences(this);
  }
  
  /**
   * Retrieve currently used API key.
   * 
   * @return The API key
   */
  public String getApiKey() {
    return apiKey;
  }
  
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }
  
  @Override
  public String toString() {
	  
	  if(!apiServiceURL.equals(""))
		  return apiServiceURL;
	  
	  return new StringBuilder()
        .append("ZemAPI - host: ").append(API_HOST).append(" ")
        .append("gateway: ").append(this.apiServiceURL).toString();
  }
  
  public String getGateway() {
	  return apiServiceURL;
  }
  
  
}
