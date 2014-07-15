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

import org.scribe.builder.api.DefaultApi20;
import org.scribe.extractors.AccessTokenExtractor;
import org.scribe.extractors.JsonTokenExtractor;
import org.scribe.model.OAuthConfig;
import org.scribe.model.OAuthConstants;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuth20ServiceImpl;
import org.scribe.oauth.OAuthService;
import org.scribe.utils.OAuthEncoder;


/**
 * A scribe based connector for mendeleys oauth 2.0 api.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyOAuth20Api extends DefaultApi20 {

	private static final String AUTHORIZE_URL = "https://api-oauth2.mendeley.com/oauth/authorize?client_id=%s&redirect_uri=%s&response_type=code&scope=all";
	 
	/* (non-Javadoc)
	 * @see org.scribe.builder.api.DefaultApi20#getAccessTokenExtractor()
	 */
	@Override
    public AccessTokenExtractor getAccessTokenExtractor() {
		return new JsonTokenExtractor();
    }
	
	/* (non-Javadoc)
	 * @see org.scribe.builder.api.DefaultApi20#getAccessTokenEndpoint()
	 */
	@Override
	public String getAccessTokenEndpoint() {
		return "https://api-oauth2.mendeley.com/oauth/token";
	}

	/* (non-Javadoc)
	 * @see org.scribe.builder.api.DefaultApi20#getAuthorizationUrl(org.scribe.model.OAuthConfig)
	 */
	@Override
	public String getAuthorizationUrl(OAuthConfig config) {
		return String.format(AUTHORIZE_URL, config.getApiKey(), OAuthEncoder.encode(config.getCallback()));
	}
	
	/* (non-Javadoc)
	 * @see org.scribe.builder.api.DefaultApi20#createService(org.scribe.model.OAuthConfig)
	 */
	@Override
	public OAuthService createService(OAuthConfig config) {
		return new MendeleyOAuth20Service(this, config);
	}

	
	/* (non-Javadoc)
	 * @see org.scribe.builder.api.DefaultApi20#getAccessTokenVerb()
	 */
	@Override
	public Verb getAccessTokenVerb() {
		return Verb.POST;
	}


	private class MendeleyOAuth20Service extends OAuth20ServiceImpl {

		private static final String GRANT_TYPE_AUTHORIZATION_CODE = "authorization_code";
		private static final String GRANT_TYPE = "grant_type";
		private DefaultApi20 api;
		private OAuthConfig config;

		public MendeleyOAuth20Service(DefaultApi20 api, OAuthConfig config) {
			super(api, config);
			this.api = api;
			this.config = config;
		}

		@Override
		public Token getAccessToken(Token requestToken, Verifier verifier) {
			OAuthRequest request = new OAuthRequest(api.getAccessTokenVerb(), api.getAccessTokenEndpoint());
			
			// must be post at mendeley
			switch (api.getAccessTokenVerb()) {
			case POST:
				request.addBodyParameter(OAuthConstants.CLIENT_ID, config.getApiKey());
				request.addBodyParameter(OAuthConstants.CLIENT_SECRET, config.getApiSecret());
				request.addBodyParameter(OAuthConstants.CODE, verifier.getValue());
				request.addBodyParameter(OAuthConstants.REDIRECT_URI, config.getCallback());
				request.addBodyParameter(GRANT_TYPE, GRANT_TYPE_AUTHORIZATION_CODE);
				break;
			case GET:
			default:
			}
			Response response = request.send();
			return api.getAccessTokenExtractor().extract(response.getBody());
		}
	}

}
