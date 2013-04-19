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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mashup Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.MashupContainer#getMashups <em>Mashups</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupContainer#getAllMashupAdmins <em>All Mashup Admins</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupContainer#getBackupConfiguration <em>Backup Configuration</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupContainer#getBackupIntervall <em>Backup Intervall</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupContainer#getDefaultMashups <em>Default Mashups</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupContainer#getSourceConfigurations <em>Source Configurations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupContainer#getInterfaceConfigurations <em>Interface Configurations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupContainer#getImmediateSave <em>Immediate Save</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupContainer#getCreateAccountsAtLoginTry <em>Create Accounts At Login Try</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupContainer()
 * @model
 * @generated
 */
public interface MashupContainer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";


	/**
	 * Returns the value of the '<em><b>Mashups</b></em>' containment reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.application.Mashup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mashups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mashups</em>' containment reference list.
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupContainer_Mashups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mashup> getMashups();



	/**
	 * Returns the value of the '<em><b>All Mashup Admins</b></em>' containment reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.application.MashupAdmin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Mashup Admins</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Mashup Admins</em>' containment reference list.
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupContainer_AllMashupAdmins()
	 * @model containment="true"
	 * @generated
	 */
	EList<MashupAdmin> getAllMashupAdmins();



	/**
	 * Returns the value of the '<em><b>Backup Configuration</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backup Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup Configuration</em>' attribute.
	 * @see #setBackupConfiguration(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupContainer_BackupConfiguration()
	 * @model default="false"
	 * @generated
	 */
	Boolean getBackupConfiguration();



	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.MashupContainer#getBackupConfiguration <em>Backup Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backup Configuration</em>' attribute.
	 * @see #getBackupConfiguration()
	 * @generated
	 */
	void setBackupConfiguration(Boolean value);



	/**
	 * Returns the value of the '<em><b>Backup Intervall</b></em>' attribute.
	 * The default value is <code>"600"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backup Intervall</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup Intervall</em>' attribute.
	 * @see #setBackupIntervall(Integer)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupContainer_BackupIntervall()
	 * @model default="600"
	 * @generated
	 */
	Integer getBackupIntervall();



	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.MashupContainer#getBackupIntervall <em>Backup Intervall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backup Intervall</em>' attribute.
	 * @see #getBackupIntervall()
	 * @generated
	 */
	void setBackupIntervall(Integer value);



	/**
	 * Returns the value of the '<em><b>Default Mashups</b></em>' containment reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.application.Mashup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Mashups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Mashups</em>' containment reference list.
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupContainer_DefaultMashups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mashup> getDefaultMashups();



	/**
	 * Returns the value of the '<em><b>Source Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.application.Mashup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Configurations</em>' containment reference list.
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupContainer_SourceConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mashup> getSourceConfigurations();



	/**
	 * Returns the value of the '<em><b>Interface Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.application.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Configurations</em>' containment reference list.
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupContainer_InterfaceConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterfaceConfigurations();



	/**
	 * Returns the value of the '<em><b>Immediate Save</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immediate Save</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immediate Save</em>' attribute.
	 * @see #setImmediateSave(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupContainer_ImmediateSave()
	 * @model default="false"
	 * @generated
	 */
	Boolean getImmediateSave();



	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.MashupContainer#getImmediateSave <em>Immediate Save</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immediate Save</em>' attribute.
	 * @see #getImmediateSave()
	 * @generated
	 */
	void setImmediateSave(Boolean value);



	/**
	 * Returns the value of the '<em><b>Create Accounts At Login Try</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Accounts At Login Try</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Accounts At Login Try</em>' attribute.
	 * @see #setCreateAccountsAtLoginTry(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupContainer_CreateAccountsAtLoginTry()
	 * @model default="false"
	 * @generated
	 */
	Boolean getCreateAccountsAtLoginTry();



	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.MashupContainer#getCreateAccountsAtLoginTry <em>Create Accounts At Login Try</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Accounts At Login Try</em>' attribute.
	 * @see #getCreateAccountsAtLoginTry()
	 * @generated
	 */
	void setCreateAccountsAtLoginTry(Boolean value);



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<MashupAdmin> getConfigurationAdmins();



	/**
	 * An EObjectCondition to check whether an Object is of the type MashupContainer.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.application.impl.MashupContainerImpl.generateIsTypeCondition();


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
} // MashupContainer
