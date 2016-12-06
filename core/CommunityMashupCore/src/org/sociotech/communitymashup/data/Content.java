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
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Content is an @link InformationObject Information Object@endlink textual describing published information authored and contributed by @link Person Persons@endlink. A Content supports an hierarchical structure of parent and child Content elements. Furthermore @link Attachment Attachments@endlink of type Document and Video are addable. A Content can be used e.g. for articles, books, descriptions, comments, products, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.Content#getContents <em>Contents</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Content#getContributors <em>Contributors</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Content#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Content#getDocuments <em>Documents</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Content#getParentContent <em>Parent Content</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Content#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Content#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Content#getVideos <em>Videos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends InformationObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Person#getAuthored <em>Authored</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Return the main author of this content.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Person)
	 * @see org.sociotech.communitymashup.data.DataPackage#getContent_Author()
	 * @see org.sociotech.communitymashup.data.Person#getAuthored
	 * @model opposite="authored"
	 * @generated
	 */
	Person getAuthor();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Content#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Person value);

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Document}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns all documents attached to this content.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getContent_Documents()
	 * @model
	 * @generated
	 */
	EList<Document> getDocuments();

	/**
	 * Returns the value of the '<em><b>Parent Content</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Content#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Content</em>' reference.
	 * @see #setParentContent(Content)
	 * @see org.sociotech.communitymashup.data.DataPackage#getContent_ParentContent()
	 * @see org.sociotech.communitymashup.data.Content#getContents
	 * @model opposite="contents"
	 * @generated
	 */
	Content getParentContent();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Content#getParentContent <em>Parent Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Content</em>' reference.
	 * @see #getParentContent()
	 * @generated
	 */
	void setParentContent(Content value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns the locale/language of this content.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #setLocale(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getContent_Locale()
	 * @model
	 * @generated
	 */
	String getLocale();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Content#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(String value);

	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Transformation}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Transformation#getTransformed <em>Transformed</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getContent_Transformations()
	 * @see org.sociotech.communitymashup.data.Transformation#getTransformed
	 * @model opposite="transformed"
	 * @generated
	 */
	EList<Transformation> getTransformations();

	/**
	 * Returns the value of the '<em><b>Videos</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Video}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Videos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videos</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getContent_Videos()
	 * @model
	 * @generated
	 */
	EList<Video> getVideos();

	/**
	 * <!-- begin-user-doc -->
	 * Returns all the organisations in which authors and contributors of this content participate.
	 * 
	 * @Return A list of organisations, null in error case.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Organisation> getOrganisations();

	/**
	 * <!-- begin-user-doc -->
	 * Returns all persons acting as an author or a contributer of this content. 
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new sub-content of this content with the given string as stringValue  and the name "Comment on <name of this content>". @return The new sub-content, null in error case.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Content comment(String comment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contributorRequired="true"
	 * @generated
	 */
	Person addContributor(Person contributor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a new a document from the file at the given url and attaches it to this content. @return The newly created document or null in error case
	 * <!-- end-model-doc -->
	 * @model required="true" fileUrlRequired="true"
	 * @generated
	 */
	Document attachDocument(String fileUrl);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments this information object and attaches the metatags, from the given comma separated list of metatags, to the new sub content.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Content commentWithMetaTagList(String comment, String metaTagList);

	/**
	 * An EObjectCondition to check whether an Object is of the type Content.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.ContentImpl.generateIsTypeCondition();

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
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Content}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Content#getParentContent <em>Parent Content</em>}'.
	 * <!-- begin-user-doc -->
	 * Return all sub contents of this content. Call {@link Content#getSubContents()} to get only the direct sub contents. 
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getContent_Contents()
	 * @see org.sociotech.communitymashup.data.Content#getParentContent
	 * @model opposite="parentContent"
	 * @generated
	 */
	EList<Content> getContents();

	/**
	 * Returns the value of the '<em><b>Contributors</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Person}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Person#getContributed <em>Contributed</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributors</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getContent_Contributors()
	 * @see org.sociotech.communitymashup.data.Person#getContributed
	 * @model opposite="contributed"
	 * @generated
	 */
	EList<Person> getContributors();

} // Content
