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

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indoor Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An IndoorLocation is a @link MetaInformation Meta Information@endlink Extension for specifying a building or a location inside of a building.
 * It can be created hierarchical by the parent relation and mapped to a @link Location @endlink. The value is specified by the stringValue.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.IndoorLocation#getLocation <em>Location</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.IndoorLocation#getParentIndoorLocation <em>Parent Indoor Location</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.IndoorLocation#getIndoorLocations <em>Indoor Locations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.IndoorLocation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getIndoorLocation()
 * @model
 * @generated
 */
public interface IndoorLocation extends MetaInformation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Location#getIndoorLocations <em>Indoor Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see org.sociotech.communitymashup.data.DataPackage#getIndoorLocation_Location()
	 * @see org.sociotech.communitymashup.data.Location#getIndoorLocations
	 * @model opposite="indoorLocations"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.IndoorLocation#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Parent Indoor Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.IndoorLocation#getIndoorLocations <em>Indoor Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Indoor Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Indoor Location</em>' reference.
	 * @see #setParentIndoorLocation(IndoorLocation)
	 * @see org.sociotech.communitymashup.data.DataPackage#getIndoorLocation_ParentIndoorLocation()
	 * @see org.sociotech.communitymashup.data.IndoorLocation#getIndoorLocations
	 * @model opposite="indoorLocations"
	 * @generated
	 */
	IndoorLocation getParentIndoorLocation();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.IndoorLocation#getParentIndoorLocation <em>Parent Indoor Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Indoor Location</em>' reference.
	 * @see #getParentIndoorLocation()
	 * @generated
	 */
	void setParentIndoorLocation(IndoorLocation value);

	/**
	 * Returns the value of the '<em><b>Indoor Locations</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.IndoorLocation}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.IndoorLocation#getParentIndoorLocation <em>Parent Indoor Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indoor Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indoor Locations</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getIndoorLocation_IndoorLocations()
	 * @see org.sociotech.communitymashup.data.IndoorLocation#getParentIndoorLocation
	 * @model opposite="parentIndoorLocation"
	 * @generated
	 */
	EList<IndoorLocation> getIndoorLocations();



	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getIndoorLocation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.IndoorLocation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);



	/**
	 * An EObjectCondition to check whether an Object is of the type IndoorLocation.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.IndoorLocationImpl.generateIsTypeCondition();

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
} // IndoorLocation
