/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.languagedetection.apiwrapper;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.sociotech.communitymashup.source.languagedetection.apiwrapper.elements.Data;
import org.sociotech.communitymashup.source.languagedetection.apiwrapper.elements.Detection;
import org.sociotech.communitymashup.source.languagedetection.apiwrapper.elements.DetectionResult;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class DetectLanguageAPIWrapper {
	
	 /** The parser. */
    private final JsonParser parser = new JsonParser();
   
	/**
	 * Local reference to the api key. 
	 */
	private String apiKey = null;
	
	/**
	 * URL of the detectlanguage.com api
	 */
	private static final String API_SERVICE_URL = "http://ws.detectlanguage.com/0.2/detect";
	private static final String API_QUERRY_ATTRIBUTE = "q";
	private static final String API_KEY_ATTRIBUTE = "key";
	
	
	/**
	 * Constructs a new api wrapper for the given api key.
	 * @param apiKey
	 */
	public DetectLanguageAPIWrapper(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * @param text
	 * @return
	 */
	public String detectMostConfidentLanguageString(String text)
	{
		Detection detection = detectMostConfidentLanguage(text);
		
		if(detection == null)
		{
			return null;
		}
		
		return detection.getLanguage();
	}

	/**
	 * @param text
	 * @return
	 */
	public Detection detectMostConfidentLanguage(String text)
	{
		Data data = detectLanguage(text);
		
		if(data == null)
		{
			return null;
		}
		
		float highestConfidence = 0.0f;
		Detection result = null;
		
		// find best
		for(Detection detection : data.getDetections())
		{
			if(detection.getConfidence() > highestConfidence)
			{
				highestConfidence = detection.getConfidence();
				result = detection;
			}
		}
		
		return result;
	}
	
	/**
	 * @param text
	 * @return
	 */
	public Data detectLanguage(String text)
	{
		if(text == null || text.isEmpty())
		{
			return null;
		}
		
		String result = null;
		
//		// call service
//		try {
//			result = doGet(API_SERVICE_URL + "?" + API_QUERRY_ATTRIBUTE + "=" + URLEncoder.encode(text, "UTF-8") + "&" + API_KEY_ATTRIBUTE + "=" + apiKey);
//		} catch (UnsupportedEncodingException e) {
//			// malformed text
//			return null;
//		}
		
		Map<String, String> parameterMap = new HashMap<String, String>();
		
		try {
			parameterMap.put(API_QUERRY_ATTRIBUTE, URLEncoder.encode(text, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// malformed text
			return null;
		}
		parameterMap.put(API_KEY_ATTRIBUTE, apiKey);
		
		// send post
		result = doPost(API_SERVICE_URL, parameterMap);
		
		if(result == null)
		{
			return null;
		}
		
		// parse result
		JsonElement json = parser.parse(result);
		
		// unmarshall the json
		DetectionResult resultObject = unmarshall(DetectionResult.class, json);
		
		return resultObject.getData();
	}

	private String doPost(String url, Map<String, String> parameterMap)
	{
		String result = null;

		HttpClient httpClient = new DefaultHttpClient();

		HttpPost post = new HttpPost(url);

		
		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
		
		// add all post parameter
		for(String key : parameterMap.keySet())
		{
			nameValuePairs.add(new BasicNameValuePair(key, parameterMap.get(key)));
		}
		
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		
		try 
		{
			post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			result = httpClient.execute(post, responseHandler);
		}
		catch(Exception e)
		{
			// do nothing
		}
		finally
		{
			// client is no longer needed
			httpClient.getConnectionManager().shutdown();
		}
		
		return result;
	}
	
	/**
	 * Unmarshalls given json content of the given type.
	 * 
	 * @param type The result Type
	 * @param json Json to be unmarshalled
	 * 
	 * @return Unmarshalled json content as object of the given type
	 */
	protected <T> T unmarshall(Class<T> type, JsonElement json) {
		Gson gson = getGsonBuilder().create();
		return gson.fromJson(json, type);
	}
	
	/**
	 * Unmarshalls given json content as a list of the given type.
	 *  
	 * @param type The result Type
	 * @param json Json to be unmarshalled
	 * 
	 * @return Unmarshalled json content as list of objects of the given type
	 */
	protected <T> List<T> unmarshallList(Class<T> type, JsonElement json) {
		List<T> retValue = new LinkedList<T>();
		if (json.isJsonArray()) {
			for (JsonElement element : json.getAsJsonArray()) {
				retValue.add(unmarshall(type, element));
			}
		}
		return retValue;
	}
	
	/**
	 * Gets the gson builder.
	 * 
	 * @return the gson builder
	 */
	protected GsonBuilder getGsonBuilder() {
		GsonBuilder builder = new GsonBuilder();
		
		//builder.setDateFormat(ApplicationConstants.DATE_FORMAT);
		builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);

		return builder;
	}
}
