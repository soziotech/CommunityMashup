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
 * A representation of the model object '<em><b>Mashup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.Mashup#getMappingRules <em>Mapping Rules</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Mashup#getSources <em>Sources</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Mashup#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Mashup#getMashupAdmins <em>Mashup Admins</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Mashup#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Mashup#getCacheAttachments <em>Cache Attachments</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Mashup#getCacheDataSet <em>Cache Data Set</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Mashup#getBackupDataSet <em>Backup Data Set</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Mashup#getBackupIntervall <em>Backup Intervall</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Mashup#getCacheDelay <em>Cache Delay</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Mashup#getSourceIdentCounter <em>Source Ident Counter</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.Mashup#getKeepDeletedItemsList <em>Keep Deleted Items List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup()
 * @model
 * @generated
 */
public interface Mashup extends Source {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";



	/**
	 * Returns the value of the '<em><b>Mapping Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.application.MappingRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Rules</em>' containment reference list.
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup_MappingRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingRule> getMappingRules();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.application.Source}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.application.Source#getMashup <em>Mashup</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup_Sources()
	 * @see org.sociotech.communitymashup.application.Source#getMashup
	 * @model opposite="mashup" containment="true"
	 * @generated
	 */
	EList<Source> getSources();



	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.application.Interface}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.application.Interface#getMashup <em>Mashup</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup_Interfaces()
	 * @see org.sociotech.communitymashup.application.Interface#getMashup
	 * @model opposite="mashup" containment="true"
	 * @generated
	 */
	EList<Interface> getInterfaces();



	/**
	 * Returns the value of the '<em><b>Mashup Admins</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.application.MashupAdmin}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.application.MashupAdmin#getConfigurableMashups <em>Configurable Mashups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mashup Admins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mashup Admins</em>' reference list.
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup_MashupAdmins()
	 * @see org.sociotech.communitymashup.application.MashupAdmin#getConfigurableMashups
	 * @model opposite="configurableMashups"
	 * @generated
	 */
	EList<MashupAdmin> getMashupAdmins();



	/**
	 * Returns the value of the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Directory</em>' attribute.
	 * @see #setWorkingDirectory(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup_WorkingDirectory()
	 * @model
	 * @generated
	 */
	String getWorkingDirectory();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Mashup#getWorkingDirectory <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Directory</em>' attribute.
	 * @see #getWorkingDirectory()
	 * @generated
	 */
	void setWorkingDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Cache Attachments</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Attachments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Attachments</em>' attribute.
	 * @see #setCacheAttachments(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup_CacheAttachments()
	 * @model default="true"
	 * @generated
	 */
	Boolean getCacheAttachments();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Mashup#getCacheAttachments <em>Cache Attachments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Attachments</em>' attribute.
	 * @see #getCacheAttachments()
	 * @generated
	 */
	void setCacheAttachments(Boolean value);

	/**
	 * Returns the value of the '<em><b>Cache Data Set</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Data Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Data Set</em>' attribute.
	 * @see #setCacheDataSet(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup_CacheDataSet()
	 * @model default="false"
	 * @generated
	 */
	Boolean getCacheDataSet();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Mashup#getCacheDataSet <em>Cache Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Data Set</em>' attribute.
	 * @see #getCacheDataSet()
	 * @generated
	 */
	void setCacheDataSet(Boolean value);

	/**
	 * Returns the value of the '<em><b>Backup Data Set</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backup Data Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup Data Set</em>' attribute.
	 * @see #setBackupDataSet(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup_BackupDataSet()
	 * @model default="false"
	 * @generated
	 */
	Boolean getBackupDataSet();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Mashup#getBackupDataSet <em>Backup Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backup Data Set</em>' attribute.
	 * @see #getBackupDataSet()
	 * @generated
	 */
	void setBackupDataSet(Boolean value);

	/**
	 * Returns the value of the '<em><b>Backup Intervall</b></em>' attribute.
	 * The default value is <code>"3600"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backup Intervall</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup Intervall</em>' attribute.
	 * @see #setBackupIntervall(Integer)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup_BackupIntervall()
	 * @model default="3600"
	 * @generated
	 */
	Integer getBackupIntervall();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Mashup#getBackupIntervall <em>Backup Intervall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backup Intervall</em>' attribute.
	 * @see #getBackupIntervall()
	 * @generated
	 */
	void setBackupIntervall(Integer value);



	/**
	 * Returns the value of the '<em><b>Cache Delay</b></em>' attribute.
	 * The default value is <code>"300"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Delay</em>' attribute.
	 * @see #setCacheDelay(Integer)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup_CacheDelay()
	 * @model default="300"
	 * @generated
	 */
	Integer getCacheDelay();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Mashup#getCacheDelay <em>Cache Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Delay</em>' attribute.
	 * @see #getCacheDelay()
	 * @generated
	 */
	void setCacheDelay(Integer value);



	/**
	 * Returns the value of the '<em><b>Source Ident Counter</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ident Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ident Counter</em>' attribute.
	 * @see #setSourceIdentCounter(Integer)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup_SourceIdentCounter()
	 * @model default="1"
	 * @generated
	 */
	Integer getSourceIdentCounter();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Mashup#getSourceIdentCounter <em>Source Ident Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ident Counter</em>' attribute.
	 * @see #getSourceIdentCounter()
	 * @generated
	 */
	void setSourceIdentCounter(Integer value);

	/**
	 * Returns the value of the '<em><b>Keep Deleted Items List</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Deleted Items List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Deleted Items List</em>' attribute.
	 * @see #setKeepDeletedItemsList(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashup_KeepDeletedItemsList()
	 * @model default="false"
	 * @generated
	 */
	Boolean getKeepDeletedItemsList();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.Mashup#getKeepDeletedItemsList <em>Keep Deleted Items List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Deleted Items List</em>' attribute.
	 * @see #getKeepDeletedItemsList()
	 * @generated
	 */
	void setKeepDeletedItemsList(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Integer getNewSourceIdent();



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Source getSourceWithIdent(String ident);



	/**
	 * An EObjectCondition to check whether an Object is of the type Mashup.
	 * 
	 * @generated
	 */
public EObjectCondition isTypeCondition = org.sociotech.communitymashup.application.impl.MashupImpl.generateIsTypeCondition();



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
} // Mashup
