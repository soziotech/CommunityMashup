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
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Extension is an abstract superclass for extending the core data elements by additional information like Attachment, Ranking, Connectionsand @link MetaInformation Meta Information@endlink instances.
 * <!-- end-model-doc -->
 *
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getExtension()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel extendedListAccessors='true'"
 * @generated
 */
public interface Extension extends Item {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * <!-- begin-user-doc -->
	 * Searches for the Tag with the given name using {@link DataSet#getMetaTag(String)}. If the Tag doesn't exist in the data
	 * set it will be created. The extension will then be added to the tagged objects of the new or existing Tag. A new 
	 * Tag will automatically be added to the same data set as this information object. This method will only work, if this extension
	 * is already contained in a data set.
	 * 
	 * @return The found or the newly created tag. Null in error case.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MetaTag tag(String name);

	/**
	 * An EObjectCondition to check whether an Object is of the type Extension.
	 * 
	 * @generated
	 */
public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.ExtensionImpl.generateIsTypeCondition();

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

} // Extension
