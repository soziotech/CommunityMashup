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
package org.sociotech.communitymashup.application;

import java.util.LinkedList;

import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.Interface#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Interface#getUrlSuffix <em>Url Suffix</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Interface#getMashup <em>Mashup</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.application.ApplicationPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends ConfigurableElement {


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";
	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.application.Security#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(Security)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getInterface_Security()
	 * @see org.sociotech.communitymashup.application.Security#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	Security getSecurity();


	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Interface#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Security value);


	/**
	 * Returns the value of the '<em><b>Url Suffix</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Suffix</em>' attribute.
	 * @see #setUrlSuffix(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getInterface_UrlSuffix()
	 * @model default=""
	 * @generated
	 */
	String getUrlSuffix();


	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Interface#getUrlSuffix <em>Url Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Suffix</em>' attribute.
	 * @see #getUrlSuffix()
	 * @generated
	 */
	void setUrlSuffix(String value);


	/**
	 * Returns the value of the '<em><b>Mashup</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.application.Mashup#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mashup</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mashup</em>' container reference.
	 * @see #setMashup(Mashup)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getInterface_Mashup()
	 * @see org.sociotech.communitymashup.application.Mashup#getInterfaces
	 * @model opposite="interfaces" transient="false"
	 * @generated
	 */
	Mashup getMashup();


	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Interface#getMashup <em>Mashup</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mashup</em>' container reference.
	 * @see #getMashup()
	 * @generated
	 */
	void setMashup(Mashup value);


	/**
	 * An EObjectCondition to check whether an Object is of the type Interface.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.application.impl.InterfaceImpl.generateIsTypeCondition();


	/**
	 * This method can be used to recursively and generically call the Getter, Setters and Operations of the generated classes.
	 * 
	 * @param input The commands to be processed.
	 * @param requestType The HTTP-Request method.
	 * 
	 * @return The result of the Getter/Operation or null.
	 * 
	 * @generated
	 */
	public Object process(LinkedList<RestCommand> input, RequestType requestType) throws ArgNotFoundException, WrongArgException, WrongArgCountException, UnknownOperationException;
} // Interface
