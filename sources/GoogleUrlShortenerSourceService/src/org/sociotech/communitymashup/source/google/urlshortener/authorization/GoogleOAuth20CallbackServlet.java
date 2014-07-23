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
package org.sociotech.communitymashup.source.google.urlshortener.authorization;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sociotech.communitymashup.source.authorization.AuthorizationCallbackServlet;
import org.sociotech.communitymashup.source.authorization.OAuth20AuthorizationServlet;

/**
 * A mendeley specific servlet for catching the oauth 2.0 callback.
 * 
 * @author Peter Lachenmaier
 */
public class GoogleOAuth20CallbackServlet extends
		AuthorizationCallbackServlet {

	/**
	 * Generated serial version uid
	 */
	private static final long serialVersionUID = 8762700783959137881L;
	
	/**
	 * Reference to the initiation authorization servlet that will be called to finish the authorization.
	 */
	private OAuth20AuthorizationServlet authorizationServlet;

	public GoogleOAuth20CallbackServlet(OAuth20AuthorizationServlet oAuth20AuthorizationServlet) {
		this.authorizationServlet = oAuth20AuthorizationServlet;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String callbackCode = req.getParameter("code");
		System.out.println("Code: " + callbackCode);
		
		// finish authentication
		boolean success = authorizationServlet.finishAuthorizationWithCode(callbackCode);
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\">");
		writer.println("<html>");
		writer.println("<head><title>Authorization</title>");
		writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"/style/OAuthAuthorizationStyle.css\">");
		
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<div id=\"authorization_container\">");
		
		if(success)
		{
			writer.println("	<div class=\"notification authorization successful\" id=\"successful_authorization\">The authorization was successful.</div>");
		}
		else {
			writer.println("	<div class=\"notification authorization successful\" id=\"successful_authorization\">The authorization failed. Try again later.</div>");
		}
		writer.println("	<div class=\"notification authorization\" id=\"close_authorization_notification\">You can now close this window.</div>");
		writer.println("</div>");
		writer.println("</body>");
		writer.println("</html>");
			
		writer.close();		
		
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Post callback: " + req);
		
		
	};
}
