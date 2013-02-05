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

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Helper class for establishing connection and parsing response XML
 * 
 *  @author Matej Usaj
 */
public class Request {
	

	
  /**
   * Enumeration of request types (methods) available
   * (<a target="_blank" href="http://developer.zemanta.com/docs/suggest/"> 
   * more information</a>)
   * 
   * <p>The form of the data sent to the server depends of this type.
   * @author Mateja Verlic
   *
   */
  protected static enum RequestType {
	  /** Default request type */
	  SUGGEST("zemanta.suggest"),
	  MARKUP("zemanta.suggest_markup"),
	  PREFERENCES("zemanta.preferences");
	  
	  private String method;
	  
	  private RequestType(String method) {
		  this.method = method;
	  }
	  
	  /**
	   * Returns literal string representing type of request to be used in web query (e.g.&nbsp;"zemanta.suggest"). 
	   */
	  @Override
	  public String toString() {
		  return this.method;
	  }
  }
  
  

  

  /**
   * Encodes parameters and builds a query string from these parameters.
   * 
   * <p>Parameters are url encoded
   * @param parameters Collection of (key, value) parameter pairs
   * @return String representing url encoded web query
   * @throws Exception No parameters were defined.
   */
  private static String buildWebQuery(Map<String, String> parameters) throws IllegalArgumentException   {
	  
	  if(parameters.size() < 1)
		  throw new IllegalArgumentException ("No parameters for web query defined.");
	  
	  StringBuilder sb = new StringBuilder();
	  try {
		  for (Map.Entry<String, String> entry : parameters.entrySet()) {
			  String key = URLEncoder.encode(entry.getKey(), "UTF-8");
			  String value = URLEncoder.encode(entry.getValue(), "UTF-8");
			  sb.append(key).append("=").append(value).append("&");
	      }
	  }
	  catch (UnsupportedEncodingException e) {
		  e.printStackTrace();
	  }
  	  
	  //remove trailing &
	  return sb.toString().substring(0, sb.length() - 1);
  
}
  
  /**
   * Checks whether required parameters are included and adds default method and format if not present.
   * 
   * <p>If no method or format are defined, default values are used.
   * <p>Default method: <code>RequestType.SUGGEST</code>
   * <br/>Default format: <code>RequestFormat.FORMAT_XML</code>
   * @param parameters List of parameters for the web query.
   * @return <code>Map</code> of required parameter pairs.
   * @throws <code>Exception</code> in case there are no API key or text defined in parameters.
   */
  private static Map<String, String> checkRequiredParameters(Map<String, String> parameters) throws IllegalArgumentException  {
	  // check if required parameters are valid
	  if(parameters == null)
		  throw new IllegalArgumentException("No parameters to build query from");
	  if(!parameters.containsKey("api_key"))
		  throw new IllegalArgumentException ("No API key in parameters.");
	  if(!parameters.containsKey("text"))
		  throw new IllegalArgumentException ("No text to analyse.");
	  
	  if(!parameters.containsKey("method")) {
		  //use default method
		  parameters.put("method", "zemanta.suggest");
	  }
	  
	  if(!parameters.containsKey("format")) {
		//use default format
		  parameters.put("format", "xml");
	  }
	  
	  return parameters;
	  
  }
  
  
  /**
   * Posts the request to the server and waits for reply
   * @param u Url of the server to send the request to (gateway to the service).
   * @param parameters Collection of parameters in the form of (key, value)
   * @return XML Document
   * @throws IOException 
   * @throws IllegalArgumentException
   * @throws UnsupportedEncodingException
   * @throws SAXException
   * @throws ParserConfigurationException 
   * @throws Exception
   */
  protected static Document request(String u, Map <String, String> parameters) 
		  throws IOException, IllegalArgumentException, SAXException, ParserConfigurationException  {
		
	  parameters = checkRequiredParameters(parameters);
	  
	  if(u.equals(""))
		  throw new MalformedURLException("No URL for request");
	  
	  URL url = new URL(u);
	  HttpURLConnection con = (HttpURLConnection)url.openConnection();
	  con.setDoOutput(true);
	  
	  //url encode parameters
	  String query = buildWebQuery(parameters);
	    
	  con.addRequestProperty("Content-Length", Integer.toString(query.length()));
	  
	  //Send the request
	  DataOutputStream dos = new DataOutputStream(con.getOutputStream());
	  dos.write(query.toString().getBytes());
	  dos.close();
	    
	  //Parse the response
	  DataInputStream is = new DataInputStream(con.getInputStream());   
	  Document d = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
	  
	  //clean up
	  is.close();
	  con.disconnect();

	    
	  return d;
	  
  }
		  

  /**
   * Posts the request to the server for formats other than XML (e.g.&nbsp; JSON) and waits for reply. 
   * 
   * <p>Other formats currently supported are JSON, WJSON, RDF/XML.
   * 
   * @param u Url of the server to send the request to (gateway to the service).
   * @param parameters Collection of parameters in form of (key, value)
   * @return <code>String</code> representing result in format requested (other than XML)
   * @throws IOException I/O errors obtaining results
   * @throws Exception Exceptions raised when building web query, if no parameters were defined.
   */
  protected static String requestString(String u, Map <String, String> parameters) 
		  throws IOException, IllegalArgumentException {
	  
	  String result = "";
	  
	  parameters = checkRequiredParameters(parameters);
	  
	  URL url = new URL(u);
	  HttpURLConnection con = (HttpURLConnection)url.openConnection();
	  con.setDoOutput(true);
	  
	  String query = buildWebQuery(parameters);
	    
	  con.addRequestProperty("Content-Length", Integer.toString(query.length()));
	
	  /* Send the request */
	  DataOutputStream dos = new DataOutputStream(con.getOutputStream());
	  dos.write(query.toString().getBytes());
	  dos.close();
	
	  /* Parse the response */
	  BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
	  
	  
	  StringBuilder sb = new StringBuilder();
	  String line;
  
	  while ((line = br.readLine()) != null) {
		  sb.append(line);
          sb.append("\n");
	  }
  
      br.close();
      con.disconnect();
  
      result = sb.toString();
	    
	  return result;
  }
  

  /**
   * Posts the request to the server and waits for reply.
   * @param type Type of the request. One of {@link RequestType} enum.
   * @param u Url of the server (gateway) to send the request to.
   * @param apiKey Api key of the current user.
   * @param text Text to be processed (Can be <code>null</code> if the request
   *    is of PREFERENCES type)
   * @return {@link Document} representing parsed xml response.
   * @throws IOException Problem on the data transfer layer.
   * @throws SAXException Xml parsing problem.
   * @throws ParserConfigurationException Xml parsing problem.
   * @deprecated Use other request method instead with map of parameters
   */
  @Deprecated
  protected static Document request(
      RequestType type,
      String u, 
      String apiKey, 
      String text)
  throws IOException, SAXException, ParserConfigurationException, Exception {
    
	//required parameters collection  
    HashMap<String, String> params = new HashMap<String, String>();
    params.put("method",type.toString());
    params.put("api_key", apiKey);
    params.put("format", "xml");
    params.put("text", text);
    
    return request(u,params);
	  
  }

  /**
   * Posts the request to the server and waits for reply.
   * 
   * @param type Type of the request. One of {@link RequestType} enum.
   * @param u Url of the server (gateway) to send the request to.
   * @param apiKey Api key of the current user.
   * @param text Text to be processed (Can be <code>null</code> if the request
   *    is of PREFERENCES type)
   * @param useFreebase Return freebase GUIDs for links.
   * @return {@link Document} representing parsed xml response.
   * @throws IOException Problem on the data transfer layer.
   * @throws SAXException Xml parsing problem.
   * @throws ParserConfigurationException Xml parsing problem.
   * 
   * @deprecated useFreebase is deprecated, use constructor without this parameter instead.
   */
  @Deprecated 
  protected static Document request(
      RequestType type,
      String u, 
      String apiKey, 
      String text,
      boolean useFreebase)
  throws IOException, SAXException, ParserConfigurationException {
    URL url = new URL(u);
    HttpURLConnection con = (HttpURLConnection)url.openConnection();
    con.setDoOutput(true);
    
    StringBuilder data = new StringBuilder();
    
    /* Build the request data */
    switch (type) {
    case PREFERENCES:
      data.append("method=zemanta.preferences&")
          .append("api_key=").append(apiKey).append("&")
          .append("format=xml");
      break;
    case SUGGEST:
      data.append("method=zemanta.suggest&")
          .append("api_key=").append(apiKey).append("&")
          .append("format=xml&")
          .append("text=").append(URLEncoder.encode(text, "UTF8"));
      break;
    case MARKUP:
      data.append("method=zemanta.suggest_markup&")
          .append("api_key=").append(apiKey).append("&")
          .append("format=xml&")
          .append("freebase=").append(useFreebase ? "1" : "0").append("&")
          .append("text=").append(URLEncoder.encode(text, "UTF8"));
      break;
    }
    
    con.addRequestProperty("Content-Length", Integer.toString(data.length()));
    
    /* Send the request */
    DataOutputStream dos = new DataOutputStream(con.getOutputStream());
    dos.write(data.toString().getBytes());
    dos.close();
    
    /* Parse the response */
    DataInputStream is = new DataInputStream(con.getInputStream());   
    
    Document d = DocumentBuilderFactory.newInstance()
          .newDocumentBuilder().parse(is);
    
    /* Close all streams */
    is.close();
    con.disconnect();

    
    return d;
  }
  
  /**
   * Gets text content of a specific XML tag or <code>null</code>
   * 
   * @param e Parent element in which the requested element should be
   * @param name Name of the requested tag
   * @return Text content of the tag. <code>null</code> if specified tag
   *    does not exist or it contains no text.
   */
  protected static String getElementText(Element e, String name) {
	  if(e!= null) {
		    NodeList nl = e.getElementsByTagName(name);
		    
		    if (nl.getLength() == 1) {
		      Element el = (Element)nl.item(0);
		      String text = el.getTextContent();
		      return text;
		    }
	  }
    return null;
  }
  
  
}
