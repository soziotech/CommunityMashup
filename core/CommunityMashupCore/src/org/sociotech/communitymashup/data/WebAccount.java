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
package org.sociotech.communitymashup.data;

import org.sociotech.communitymashup.rest.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

import java.util.Map;
import java.util.List;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.ocl.conditions.BooleanOCLCondition;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.ocl.ParserException;
import org.eclipse.emf.ecore.EClassifier;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A WebAccount is a @link MetaInformation Meta Information@endlink Extension for generically specifying web-based service accounts. This could be a Social Networking Service account, e.g. Facebook, Twitter, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.WebAccount#getUsername <em>Username</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.WebAccount#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getWebAccount()
 * @model
 * @generated
 */
public interface WebAccount extends MetaInformation {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getWebAccount_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.WebAccount#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getWebAccount_Service()
	 * @model
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.WebAccount#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

	/**
	 * An EObjectCondition to check whether an Object is of the type WebAccount.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.WebAccountImpl.generateIsTypeCondition();
	
	/**
	 * This method can be used to recursively and generically call the Getter, Setters and Operations of the generated classes.
	 * 
	 * @param input The commands to be processed.
	 * @param requestType The HTTP-Method of the request.
	 * 
	 * @return The result of the Getter/Operation or null.
	 * 
	 * @generated
	 */
	public Object process(LinkedList<RestCommand> input, RequestType requestType) throws ArgNotFoundException, WrongArgException, WrongArgCountException, UnknownOperationException;
	
	/**
	 * The service name for twitter accounts
	 */
	public String SERVICE_TWITTER = "twitter";

	/**
	 * The service name for mendeley accounts
	 */
	public String SERVICE_MENDELEY = "mendeley";

	/**
	 * The service name for facebook accounts
	 */
	public String SERVICE_FACEBOOK = "facebook";

	/**
	 * The service name for flickr accounts
	 */
	public String SERVICE_FLICKR = "flickr";

	/**
	 * The service name for google accounts
	 */
	public String SERVICE_GOOGLE = "google";
	
	/**
	 * The service name for skype accounts
	 */
	public String SERVICE_SKYPE = "skype";
	
} // WebAccount
