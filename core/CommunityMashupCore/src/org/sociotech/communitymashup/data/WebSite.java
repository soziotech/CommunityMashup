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

// pseudoimports
// Imports required by REST methods:
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
 * A representation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A WebSite is a @link MetaInformation Meta Information@endlink Extension for referencing a specific web site. Depending on the domain meta model this could for example be a personal/corporate web site or for managing web site favorites.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.WebSite#getAdress <em>Adress</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.WebSite#getTitle <em>Title</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.WebSite#getShortenedUrl <em>Shortened Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getWebSite()
 * @model
 * @generated
 */
public interface WebSite extends MetaInformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress</em>' attribute.
	 * @see #setAdress(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getWebSite_Adress()
	 * @model
	 * @generated
	 */
	String getAdress();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.WebSite#getAdress <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' attribute.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getWebSite_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.WebSite#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);



	/**
	 * Returns the value of the '<em><b>Shortened Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shortened Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortened Url</em>' attribute.
	 * @see #setShortenedUrl(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getWebSite_ShortenedUrl()
	 * @model
	 * @generated
	 */
	String getShortenedUrl();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.WebSite#getShortenedUrl <em>Shortened Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shortened Url</em>' attribute.
	 * @see #getShortenedUrl()
	 * @generated
	 */
	void setShortenedUrl(String value);



	/**
	 * An EObjectCondition to check whether an Object is of the type WebSite.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.WebSiteImpl.generateIsTypeCondition();

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
} // WebSite
