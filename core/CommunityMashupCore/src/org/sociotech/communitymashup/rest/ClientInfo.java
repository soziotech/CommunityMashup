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
package org.sociotech.communitymashup.rest;

import java.util.Date;

/**
 * A Class containing some information for a client of the REST-Interface.
 * 
 * @author Jan Philipp Fiedler (Jan.Fiedler@unibw.de).
 *
 */
public class ClientInfo {
	
	private String id;
	private String key;
	private Date expiration = null;
	private boolean expires = false;
	private boolean directAccess = false;
	
	/**
	 * The default constructor.
	 * 
	 * @param id The ClientID of the client.
	 * @param key The ClientKey of the client.
	 */
	public ClientInfo(String id, String key) {
		this.id = id;
		this.key = key;
		this.expires = false;
		this.directAccess = false;
	}
	
	/**
	 * An extended constructor.
	 * 
	 * @param id The ClientID of the client.
	 * @param key The ClientKey of the client.
	 * @param directAccess Whether the client can use signed URLS without a nonce.
	 */
	public ClientInfo(String id, String key, boolean directAccess) {
		this.id = id;
		this.key = key;
		this.expires = false;
		this.directAccess = directAccess;
	}
	
	/**
	 * An extended constructor.
	 * 
	 * @param id The ClientID of the client.
	 * @param key The ClientKey of the client.
	 * @param expiration The expiration date of the clients access rights.
	 */
	public ClientInfo(String id, String key, Date expiration) {
		this.id = id;
		this.key = key;
		this.expires = true;
		this.expiration = expiration;
		this.directAccess = false;
	}
	
	/**
	 * An extended constructor.
	 * 
	 * @param id The ClientID of the client.
	 * @param key The ClientKey of the client.
	 * @param expiration The expiration date of the clients access rights.
	 * @param directAccess Whether the client can use signed URLS without a nonce.
	 */
	public ClientInfo(String id, String key, Date expiration, boolean directAccess) {
		this.id = id;
		this.key = key;
		this.expires = true;
		this.expiration = expiration;
		this.directAccess = directAccess;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
		this.expires = true;
	}

	public boolean hasDirectAccess() {
		return directAccess;
	}

	public void setDirectAccess(boolean directAccess) {
		this.directAccess = directAccess;
	}

	public String getId() {
		return id;
	}

	public boolean canExpire() {
		return expires;
	}
	
	
}
