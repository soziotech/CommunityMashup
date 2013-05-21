/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.readability.apiwrapper;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.sociotech.communitymashup.source.readability.apiwrapper.items.ReadabilityResult;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * Wrapper for the readability api.
 * 
 * @author Peter Lachenmaier
 */
public class ReadabilityAPIWrapper {

	/** The parser. */
	private final JsonParser parser = new JsonParser();

	/**
	 * The parameter to provide the url of the website to parse
	 */
	private final static String URL_PARAMETER = "url";

	/**
	 * The parameter to provide the readabillity api key
	 */
	private final static String TOKEN_PARAMETER = "token";

	/**
	 * Url of the participants api
	 */
	private final String baseUrl;

	/**
	 * Api Key
	 */
	private final String key;

	/**
	 * Returns the used base url.
	 * 
	 * @return The used base url.
	 */
	public String getBaseUrl() {
		return baseUrl;
	}

	/**
	 * Returns the used api key.
	 * 
	 * @return The used api key.
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Intitialises a new api wrapper with the given base url and the api key.
	 * 
	 * @param baseUrl
	 *            Url of the api
	 * @param apiKey
	 *            Secret to access the api
	 */
	public ReadabilityAPIWrapper(String baseUrl, String apiKey) {
		this.baseUrl = baseUrl;
		this.key = apiKey;
	}

	/**
	 * Calls the readablity parser api for the given url and returns the result.
	 * 
	 * @param url
	 *            Url of the website to be parsed by readablity
	 * @return The parsed result or null in error case.
	 */
	public ReadabilityResult getReadablityVersionOf(String url) {
		if (url == null) {
			return null;
		}

		String requestUrl;

		try {
			requestUrl = baseUrl + "?" + URL_PARAMETER + "="
					+ URLEncoder.encode(url, "UTF-8") + "&" + TOKEN_PARAMETER
					+ "=" + key;
		} catch (UnsupportedEncodingException e) {
			return null;
		}

		// process request
		String result = doGet(requestUrl);

		if (result == null) {
			return null;
		}

		// parse result
		JsonElement json = parser.parse(result);

		// unmarshall the json
		ReadabilityResult resultObject = unmarshall(ReadabilityResult.class,
				json);

		return resultObject;
	}

	/**
	 * Does a get request at the given url and returns the result as string.
	 * 
	 * @param url
	 *            Url to get
	 * @return The result as string null in error case.
	 */
	private String doGet(String url) {
		// System.out.println("calling: " + url);

		String result = null;

		HttpClient httpClient = new DefaultHttpClient();

		HttpGet get = new HttpGet(url);

		ResponseHandler<String> responseHandler = new BasicResponseHandler();

		try {
			result = httpClient.execute(get, responseHandler);
		} catch (Exception e) {
			// do nothing
		} finally {
			// client is no longer needed
			httpClient.getConnectionManager().shutdown();
		}

		// System.out.println("got: " + result);

		return result;
	}

	@SuppressWarnings("unused")
	private String doPost(String url, Map<String, String> parameterMap) {
		String result = null;

		HttpClient httpClient = new DefaultHttpClient();

		HttpPost post = new HttpPost(url);

		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);

		// add all post parameter
		for (String key : parameterMap.keySet()) {
			nameValuePairs.add(new BasicNameValuePair(key, parameterMap
					.get(key)));
		}

		ResponseHandler<String> responseHandler = new BasicResponseHandler();

		try {
			post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			result = httpClient.execute(post, responseHandler);
		} catch (Exception e) {
			// do nothing
		} finally {
			// client is no longer needed
			httpClient.getConnectionManager().shutdown();
		}

		return result;
	}

	/**
	 * Unmarshalls given json content of the given type.
	 * 
	 * @param type
	 *            The result Type
	 * @param json
	 *            Json to be unmarshalled
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
	 * @param type
	 *            The result Type
	 * @param json
	 *            Json to be unmarshalled
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

		builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);

		return builder;
	}
}
