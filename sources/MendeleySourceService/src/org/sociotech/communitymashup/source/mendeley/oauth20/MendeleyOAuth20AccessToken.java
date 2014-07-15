/*******************************************************************************
 * Copyright (c) 2014 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.mendeley.oauth20;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Representation of the mendeley oauth 2.0 token
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyOAuth20AccessToken {
	String accessToken;
	String refreshToken;
	Date expiration;
	
	private static final Pattern accessTokenPattern = Pattern.compile("\"access_token\":\\s*\"(\\S*?)\"");
	private static final Pattern accessTokenExpirationPattern = Pattern.compile("\"expires_in\":\\s*(\\d*?),");
	private static final Pattern refreshTokenPattern = Pattern.compile("\"refresh_token\":\\s*\"(\\S*?)\"");

	public MendeleyOAuth20AccessToken(String accessToken, String refreshToken) {
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
	}
	
	/**
	 * Parses the raw result from mendeley and creates the token.
	 * 
	 * @param rawResult Result to parse.
	 */
	public MendeleyOAuth20AccessToken(String rawResult) {
		this(extract(rawResult, accessTokenPattern), extract(rawResult, refreshTokenPattern));
		this.expireIn(new Integer(extract(rawResult, accessTokenExpirationPattern )));
	}
	
	/**
	 * Extracts a value following the given pattern from the given raw string.
	 * 
	 * @param raw String to extract the value from
	 * @param pattern Pattern describing the value
	 * @return The extracted value or null if was not found
	 */
	private static String extract(String raw, Pattern pattern) {
		Matcher matcher = pattern.matcher(raw);
		if(matcher.find())
		{
			return matcher.group(1);
		}
		else
		{
			return null;
		}
	}

	/**
	 * Let the token expire in given amount of seconds.
	 * 
	 * @param seconds Time span in seconds until the token should expire.
	 */
	public void expireIn(int seconds) {
		expiration = new Date();
		// add seconds to current time
		expiration.setTime(expiration.getTime() + seconds * 1000);
	}

	/**
	 * Let the token expire at the given time.
	 * 
	 * @param timeInMillis Time in millis.
	 */
	public void expireAt(long timeInMillis) {
		expiration = new Date(timeInMillis);
	}
	
	/**
	 * Whether this token is expired or not. Will be calculated
	 * depending on the set expiration date.
	 * 
	 * @return Whether this token is expired or not
	 */
	public boolean isExpired() {
		if(expiration == null) {
			return true;
		}
		
		return expiration.before(new Date());
	}
	
	/**
	 * Returns the access token value.
	 * 
	 * @return The access token value.
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * Sets the access token value.
	 * 
	 * @param accessToken Access token.
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * Returns the refresh token value.
	 * 
	 * @return The refresh token value.
	 */
	public String getRefreshToken() {
		return refreshToken;
	}

	/**
	 * Sets the refresh token value.
	 * 
	 * @param refreshToken The refresh token value.
	 */
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	/**
	 * Returns the expiration date of this token.
	 * 
	 * @return The date of expiration.
	 */
	public Date getExpiration() {
		return expiration;
	}

	/**
	 * Sets the expiration date to the given date.
	 * 
	 * @param expiration Expiration date.
	 */
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	/**
	 * Returns true if this token is already expired or expires in the next two minutes.
	 * 
	 * @return True if this token expires soon.
	 */
	public boolean expiresSoon() {
		// true if it expires in the next two minutes
		Date soon = new Date();
		soon.setTime(soon.getTime() + 120 * 1000);
		
		return soon.after(expiration);
	}	
}
