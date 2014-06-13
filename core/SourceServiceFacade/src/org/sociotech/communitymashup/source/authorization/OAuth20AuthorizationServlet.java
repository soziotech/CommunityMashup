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
package org.sociotech.communitymashup.source.authorization;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sociotech.communitymashup.application.Source;

/**
 * Base implementation to authorize sources for accessing external oauth based services.
 * 
 * @author Peter Lachenmaier
 */
public abstract class OAuth20AuthorizationServlet extends SourceAuthorizationServlet {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1866027798087024144L;

	/**
	 * Local reference to the source configuration.
	 */
	protected Source sourceConfiguration;

	/**
	 * The Url to perform the authorization at
	 */
	protected String externalAuthorizationUrl;

	/**
	 * Indicates if the authorization was performed earlier, so every authorization servlet can only be used once. 
	 */
	private boolean alreadyAuthorized = false;
	
	/**
	 * Creates the oauth authorization servlet based on the given source configuration and the
	 * authorization url.
	 * 
	 * @param sourceConfiguration Configuration of the source service.
	 * @param authorizationUrl External url where the authorization can be performed by a user.
	 */
	public OAuth20AuthorizationServlet(Source sourceConfiguration, String authorizationUrl) {
		this.sourceConfiguration = sourceConfiguration;
		this.externalAuthorizationUrl = authorizationUrl;
		//this.thisServletUrl = sourceConfiguration.getPropertyValue(SourceServiceProperties.AUTHORIZATION_URL);
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\">");
		writer.println("<html>");
		writer.println("<head><title>Authorization</title>");
		writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"/style/OAuthAuthorizationStyle.css\">");
		
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<div id=\"authorization_container\">");
		
		if(alreadyAuthorized ) {
			// authorized before
			writer.println("	<div class=\"notification already_authorized\"id=\"already_authorized_notification\">The authorization was already successful before.</div>");
			writer.println("</div>");
			writer.println("</body>");
			writer.println("</html>");
				
			writer.close();	
			
			return;	
		}
		
		writer.println("	<h1 id=\"authorization_headline\">Authorize the CommunityMashup</h1>");
		writer.println("    <ul id=\"autorization_steps\">");
		writer.println("	    <li><div id=\"auth_message\">Please visit<br /><a href=\"" + externalAuthorizationUrl + "\" >" + externalAuthorizationUrl + "</a><br />and authorize the CommunityMashup to use your data.</div></li>");
		writer.println("    </ul>");
		writer.println("</div>");
		writer.println("</body>");
		writer.println("</html>");
			
		writer.close();		
	}

	/**
	 * Will be called with the callback code to finish the authorization.
	 * 
	 * @param callbackCode Callback for finish
	 * @return True if the authorization was finished sucessfully.
	 */
	public abstract boolean finishAuthorizationWithCode(String callbackCode);
}
