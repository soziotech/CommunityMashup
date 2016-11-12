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
 * A representation of the model object '<em><b>Thumb Ranking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A @link ThumbRanking Thumb Ranking@endlink is used for rating a given @link InformationObject Information Object@endlink. Thumbs Ups are represented by an stringValue of +1 Thumbs Down by a stringValue of -1. Other values allowing weighted thumb rankings. The total amount is given by the sum of @link ThumbRanking Thumb Rankings@endlink for an @link InformationObject Information Object@endlink.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.ThumbRanking#getRankedInformationObject <em>Ranked Information Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getThumbRanking()
 * @model
 * @generated
 */
public interface ThumbRanking extends Ranking {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * String value of ThumbRankings representing a thumb up
	 */
	public static String THUMBS_UP_VALUE = "1";
	
	/**
	 * String value of ThumbRankings representing a thumb down
	 */
	public static String THUMBS_DOWN_VALUE = "-1";
	
	/**
	 * Returns the value of the '<em><b>Ranked Information Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.InformationObject#getThumbRankings <em>Thumb Rankings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranked Information Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranked Information Object</em>' reference.
	 * @see #setRankedInformationObject(InformationObject)
	 * @see org.sociotech.communitymashup.data.DataPackage#getThumbRanking_RankedInformationObject()
	 * @see org.sociotech.communitymashup.data.InformationObject#getThumbRankings
	 * @model opposite="thumbRankings"
	 * @generated
	 */
	InformationObject getRankedInformationObject();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.ThumbRanking#getRankedInformationObject <em>Ranked Information Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranked Information Object</em>' reference.
	 * @see #getRankedInformationObject()
	 * @generated
	 */
	void setRankedInformationObject(InformationObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns if this @link Thumb Ranking ThumbRanking @endlink is a thumb up.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Boolean isThumbUp();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns if this @link Thumb Ranking ThumbRanking @endlink is a thumb up.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Boolean isThumbDown();

	/**
	 * An EObjectCondition to check whether an Object is of the type ThumbRanking.
	 * 
	 * @generated
	 */
public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.ThumbRankingImpl.generateIsTypeCondition();

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
} // ThumbRanking
