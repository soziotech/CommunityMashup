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
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Category is a textual Classification element for grouping @link InformationObject Information Object@endlink instances by their defining features and concepts. Compared to @link Tag Tags@endlink, @link Category Categories@endlink are often predefined values of the domain specific meta model. A Category support an hierarchical structure of parent and child Category elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.Category#getCategorized <em>Categorized</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Category#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Category#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Category#getMainCategorized <em>Main Categorized</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getCategory()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel plural='Categories'"
 * @generated
 */
public interface Category extends Classification {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Categorized</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.InformationObject}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.InformationObject#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorized</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorized</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getCategory_Categorized()
	 * @see org.sociotech.communitymashup.data.InformationObject#getCategories
	 * @model opposite="categories"
	 * @generated
	 */
	EList<InformationObject> getCategorized();

	/**
	 * Returns the value of the '<em><b>Parent Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Category#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * Categories can be hierarchical. This methods return the parent category. Main categories don't have an parent, in this case null will be returned. 
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Category</em>' reference.
	 * @see #setParentCategory(Category)
	 * @see org.sociotech.communitymashup.data.DataPackage#getCategory_ParentCategory()
	 * @see org.sociotech.communitymashup.data.Category#getCategories
	 * @model opposite="categories"
	 * @generated
	 */
	Category getParentCategory();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Category#getParentCategory <em>Parent Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Category</em>' reference.
	 * @see #getParentCategory()
	 * @generated
	 */
	void setParentCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Category}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Category#getParentCategory <em>Parent Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getCategory_Categories()
	 * @see org.sociotech.communitymashup.data.Category#getParentCategory
	 * @model opposite="parentCategory"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Main Categorized</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.InformationObject}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.InformationObject#getMainCategory <em>Main Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Categorized</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Categorized</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getCategory_MainCategorized()
	 * @see org.sociotech.communitymashup.data.InformationObject#getMainCategory
	 * @model opposite="mainCategory"
	 * @generated
	 */
	EList<InformationObject> getMainCategorized();

	/**
	 * An EObjectCondition to check whether an Object is of the type Category.
	 * 
	 * @generated
	 */
public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.CategoryImpl.generateIsTypeCondition();

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
} // Category
