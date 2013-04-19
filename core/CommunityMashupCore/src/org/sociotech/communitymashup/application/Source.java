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
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.Source#getPersistency <em>Persistency</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Source#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Source#getBundleId <em>Bundle Id</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Source#getState <em>State</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Source#getActiveState <em>Active State</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Source#getLogLevel <em>Log Level</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Source#getMashup <em>Mashup</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Source#getRemoveDataOnStop <em>Remove Data On Stop</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Source#getUpdateRound <em>Update Round</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.application.ApplicationPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends ConfigurableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Persistency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistency</em>' containment reference.
	 * @see #setPersistency(Persistency)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getSource_Persistency()
	 * @model containment="true"
	 * @generated
	 */
	Persistency getPersistency();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Source#getPersistency <em>Persistency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistency</em>' containment reference.
	 * @see #getPersistency()
	 * @generated
	 */
	void setPersistency(Persistency value);

	/**
	 * Returns the value of the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' reference.
	 * @see #setDataSet(DataSet)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getSource_DataSet()
	 * @model
	 * @generated
	 */
	DataSet getDataSet();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Source#getDataSet <em>Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set</em>' reference.
	 * @see #getDataSet()
	 * @generated
	 */
	void setDataSet(DataSet value);

	/**
	 * Returns the value of the '<em><b>Bundle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Id</em>' attribute.
	 * @see #setBundleId(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getSource_BundleId()
	 * @model
	 * @generated
	 */
	String getBundleId();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Source#getBundleId <em>Bundle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Id</em>' attribute.
	 * @see #getBundleId()
	 * @generated
	 */
	void setBundleId(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link org.sociotech.communitymashup.application.SourceState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.sociotech.communitymashup.application.SourceState
	 * @see #setState(SourceState)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getSource_State()
	 * @model default="0"
	 * @generated
	 */
	SourceState getState();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Source#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.sociotech.communitymashup.application.SourceState
	 * @see #getState()
	 * @generated
	 */
	void setState(SourceState value);

	/**
	 * Returns the value of the '<em><b>Active State</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * The literals are from the enumeration {@link org.sociotech.communitymashup.application.SourceActiveStates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active State</em>' attribute.
	 * @see org.sociotech.communitymashup.application.SourceActiveStates
	 * @see #setActiveState(SourceActiveStates)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getSource_ActiveState()
	 * @model default="7"
	 * @generated
	 */
	SourceActiveStates getActiveState();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Source#getActiveState <em>Active State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active State</em>' attribute.
	 * @see org.sociotech.communitymashup.application.SourceActiveStates
	 * @see #getActiveState()
	 * @generated
	 */
	void setActiveState(SourceActiveStates value);

	/**
	 * Returns the value of the '<em><b>Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Level</em>' attribute.
	 * @see #setLogLevel(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getSource_LogLevel()
	 * @model
	 * @generated
	 */
	String getLogLevel();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Source#getLogLevel <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Level</em>' attribute.
	 * @see #getLogLevel()
	 * @generated
	 */
	void setLogLevel(String value);

	/**
	 * Returns the value of the '<em><b>Mashup</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.application.Mashup#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mashup</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mashup</em>' container reference.
	 * @see #setMashup(Mashup)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getSource_Mashup()
	 * @see org.sociotech.communitymashup.application.Mashup#getSources
	 * @model opposite="sources" transient="false"
	 * @generated
	 */
	Mashup getMashup();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Source#getMashup <em>Mashup</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mashup</em>' container reference.
	 * @see #getMashup()
	 * @generated
	 */
	void setMashup(Mashup value);

	/**
	 * Returns the value of the '<em><b>Remove Data On Stop</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Data On Stop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Data On Stop</em>' attribute.
	 * @see #setRemoveDataOnStop(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getSource_RemoveDataOnStop()
	 * @model default="false"
	 * @generated
	 */
	Boolean getRemoveDataOnStop();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Source#getRemoveDataOnStop <em>Remove Data On Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Data On Stop</em>' attribute.
	 * @see #getRemoveDataOnStop()
	 * @generated
	 */
	void setRemoveDataOnStop(Boolean value);

	/**
	 * Returns the value of the '<em><b>Update Round</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Round</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Round</em>' attribute.
	 * @see #setUpdateRound(Integer)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getSource_UpdateRound()
	 * @model default="1"
	 * @generated
	 */
	Integer getUpdateRound();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Source#getUpdateRound <em>Update Round</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Round</em>' attribute.
	 * @see #getUpdateRound()
	 * @generated
	 */
	void setUpdateRound(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Integer getLogLevelIntValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void pause();

	/**
	 * An EObjectCondition to check whether an Object is of the type Source.
	 * 
	 * @generated
	 */
public EObjectCondition isTypeCondition = org.sociotech.communitymashup.application.impl.SourceImpl.generateIsTypeCondition();

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

} // Source
