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

import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Attachment is a superclass of Binary, Document, Image, Transformation or Video. An Attachment is an Extension to an @link InformationObject Information Object@endlink extending the capabilities of the core meta model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.Attachment#getFileUrl <em>File Url</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Attachment#getCachedFileUrl <em>Cached File Url</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Attachment#getCachedOnly <em>Cached Only</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Attachment#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Attachment#getFileIdentifier <em>File Identifier</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Attachment#getCachedFileName <em>Cached File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getAttachment()
 * @model abstract="true"
 * @generated
 */
public interface Attachment extends Extension {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Url</em>' attribute.
	 * @see #setFileUrl(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getAttachment_FileUrl()
	 * @model
	 * @generated
	 */
	String getFileUrl();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Attachment#getFileUrl <em>File Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Url</em>' attribute.
	 * @see #getFileUrl()
	 * @generated
	 */
	void setFileUrl(String value);

	/**
	 * Returns the value of the '<em><b>Cached File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached File Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached File Url</em>' attribute.
	 * @see org.sociotech.communitymashup.data.DataPackage#getAttachment_CachedFileUrl()
	 * @model unique="false" changeable="false" volatile="true"
	 * @generated
	 */
	String getCachedFileUrl();

	/**
	 * Returns the value of the '<em><b>Cached Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached Only</em>' attribute.
	 * @see #setCachedOnly(Boolean)
	 * @see org.sociotech.communitymashup.data.DataPackage#getAttachment_CachedOnly()
	 * @model default="false"
	 * @generated
	 */
	Boolean getCachedOnly();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Attachment#getCachedOnly <em>Cached Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached Only</em>' attribute.
	 * @see #getCachedOnly()
	 * @generated
	 */
	void setCachedOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extension</em>' attribute.
	 * @see #setFileExtension(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getAttachment_FileExtension()
	 * @model
	 * @generated
	 */
	String getFileExtension();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Attachment#getFileExtension <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension</em>' attribute.
	 * @see #getFileExtension()
	 * @generated
	 */
	void setFileExtension(String value);

	/**
	 * Returns the value of the '<em><b>File Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier for the file. Can be used as hint for caching if a file gets a new url every time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Identifier</em>' attribute.
	 * @see #setFileIdentifier(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getAttachment_FileIdentifier()
	 * @model
	 * @generated
	 */
	String getFileIdentifier();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Attachment#getFileIdentifier <em>File Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Identifier</em>' attribute.
	 * @see #getFileIdentifier()
	 * @generated
	 */
	void setFileIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Cached File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached File Name</em>' attribute.
	 * @see #setCachedFileName(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getAttachment_CachedFileName()
	 * @model unique="false"
	 * @generated
	 */
	String getCachedFileName();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Attachment#getCachedFileName <em>Cached File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached File Name</em>' attribute.
	 * @see #getCachedFileName()
	 * @generated
	 */
	void setCachedFileName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the original file url.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getOriginalFileUrl();

	/**
	 * An EObjectCondition to check whether an Object is of the type Attachment.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.AttachmentImpl.generateIsTypeCondition();

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
} // Attachment
