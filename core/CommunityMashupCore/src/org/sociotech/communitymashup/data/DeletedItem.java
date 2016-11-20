package org.sociotech.communitymashup.data;

import java.util.Date;
import java.util.LinkedList;

import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;
// pseudoimports
// Imports required by REST methods:

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deleted Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DeletedItem is representation for an deleted Item, having the same ident.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.DeletedItem#getDeleted <em>Deleted</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.DeletedItem#getIdentOfDeleted <em>Ident Of Deleted</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getDeletedItem()
 * @model
 * @generated
 */
public interface DeletedItem extends Item {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the deletion was performed.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deleted</em>' attribute.
	 * @see #setDeleted(Date)
	 * @see org.sociotech.communitymashup.data.DataPackage#getDeletedItem_Deleted()
	 * @model
	 * @generated
	 */
	Date getDeleted();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.DeletedItem#getDeleted <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted</em>' attribute.
	 * @see #getDeleted()
	 * @generated
	 */
	void setDeleted(Date value);



	/**
	 * Returns the value of the '<em><b>Ident Of Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ident Of Deleted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident Of Deleted</em>' attribute.
	 * @see #setIdentOfDeleted(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getDeletedItem_IdentOfDeleted()
	 * @model
	 * @generated
	 */
	String getIdentOfDeleted();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.DeletedItem#getIdentOfDeleted <em>Ident Of Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident Of Deleted</em>' attribute.
	 * @see #getIdentOfDeleted()
	 * @generated
	 */
	void setIdentOfDeleted(String value);



	/**
	 * An EObjectCondition to check whether an Object is of the type DeletedItem.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.DeletedItemImpl.generateIsTypeCondition();


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
} // DeletedItem
