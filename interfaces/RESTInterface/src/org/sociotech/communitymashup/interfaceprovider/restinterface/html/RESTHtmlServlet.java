/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 *     Christopher Rohde
 ******************************************************************************/
package org.sociotech.communitymashup.interfaceprovider.restinterface.html;

// TODO test and delete
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A servlet providing access to Javascript / Stylesheets for
 * HTML-based REST-Interfaces.
 * 
 * @author Christopher Rohde
 */
public class RESTHtmlServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7632786811289548734L;

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pathInfo = req.getPathInfo();
		
		if(pathInfo == null) {
			// resource not found
			resp.sendRedirect(resp.encodeRedirectURL("/index.html") );
			return;
		}
		
		// add path to resources 
		String filepath = "/html/files" + pathInfo.toLowerCase();
		
		// Open stream for resources
		InputStream inputStream = getClass().getResourceAsStream(filepath);
		if(inputStream == null)
		{
			// resource not found
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		
		// Show any image resources?
		if(pathInfo.contains("/img/") ) {
			
			// find out what kind of image MIME type we have to return  
			// Source: http://www.exampledepot.com/egs/javax.servlet/GetImage.html
			ServletContext sc = getServletContext();
			String mimeType = sc.getMimeType(filepath);
			if (mimeType == null) {
			        sc.log("Could not get MIME type of "+ filepath);
			        resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			        return;
			    }
			 
				// Create an output stream
				OutputStream out = resp.getOutputStream();

			    // Copy the contents of the file to the output stream
			    byte[] buf = new byte[1024];
			    int count = 0;
			    while ((count = inputStream.read(buf)) >= 0) {
			        out.write(buf, 0, count);
			    }
			    
			    // tidy up
			    out.close();
		}
		else if(pathInfo.endsWith(".js")) {
			resp.setContentType("text/javascript");
			
			// Create buffered input reader
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader br = new BufferedReader(inputStreamReader);
			
			// Return text
			PrintWriter out = resp.getWriter();
			
			String text;
			while( (text = br.readLine()) != null)
				out.println(text);
			
			// tidy up
			br.close();
		}	
		else if(pathInfo.endsWith(".css")) {
			resp.setContentType("text/css");
			
			// Create buffered input reader
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader br = new BufferedReader(inputStreamReader);
			
			// Return text
			PrintWriter out = resp.getWriter();
			
			String text;
			while( (text = br.readLine()) != null)
				out.println(text);
			
			// tidy up
			br.close();
		}	
		else {
			
			// resource exists but not supported, yet. 
			// Due to security reasons we also return "not found".
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
		
		// tidy up
	    inputStream.close();
	}

}
