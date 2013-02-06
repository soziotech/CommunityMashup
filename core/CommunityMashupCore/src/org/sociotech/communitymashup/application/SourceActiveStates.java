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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Source Active States</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.sociotech.communitymashup.application.ApplicationPackage#getSourceActiveStates()
 * @model
 * @generated
 */
public enum SourceActiveStates implements Enumerator {
	/**
	 * The '<em><b>Initializing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALIZING_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALIZING(0, "Initializing", "Initializing"),

	/**
	 * The '<em><b>Initialized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALIZED_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALIZED(1, "Initialized", "Initialized"),

	/**
	 * The '<em><b>Filling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILLING_VALUE
	 * @generated
	 * @ordered
	 */
	FILLING(2, "Filling", "Filling"),

	/**
	 * The '<em><b>Filled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILLED_VALUE
	 * @generated
	 * @ordered
	 */
	FILLED(3, "Filled", "Filled"),

	/**
	 * The '<em><b>Waiting For Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAITING_FOR_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	WAITING_FOR_UPDATE(4, "WaitingForUpdate", "WaitingForUpdate"),

	/**
	 * The '<em><b>Updating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATING_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATING(5, "Updating", "Updating"),

	/**
	 * The '<em><b>Enriching</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENRICHING_VALUE
	 * @generated
	 * @ordered
	 */
	ENRICHING(6, "Enriching", "Enriching"), /**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(7, "Unknown", "Unknown");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The '<em><b>Initializing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initializing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALIZING
	 * @model name="Initializing"
	 * @generated
	 * @ordered
	 */
	public static final int INITIALIZING_VALUE = 0;

	/**
	 * The '<em><b>Initialized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initialized</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALIZED
	 * @model name="Initialized"
	 * @generated
	 * @ordered
	 */
	public static final int INITIALIZED_VALUE = 1;

	/**
	 * The '<em><b>Filling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Filling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILLING
	 * @model name="Filling"
	 * @generated
	 * @ordered
	 */
	public static final int FILLING_VALUE = 2;

	/**
	 * The '<em><b>Filled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Filled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILLED
	 * @model name="Filled"
	 * @generated
	 * @ordered
	 */
	public static final int FILLED_VALUE = 3;

	/**
	 * The '<em><b>Waiting For Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Waiting For Update</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAITING_FOR_UPDATE
	 * @model name="WaitingForUpdate"
	 * @generated
	 * @ordered
	 */
	public static final int WAITING_FOR_UPDATE_VALUE = 4;

	/**
	 * The '<em><b>Updating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Updating</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATING
	 * @model name="Updating"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATING_VALUE = 5;

	/**
	 * The '<em><b>Enriching</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enriching</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENRICHING
	 * @model name="Enriching"
	 * @generated
	 * @ordered
	 */
	public static final int ENRICHING_VALUE = 6;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 7;

	/**
	 * An array of all the '<em><b>Source Active States</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SourceActiveStates[] VALUES_ARRAY =
		new SourceActiveStates[] {
			INITIALIZING,
			INITIALIZED,
			FILLING,
			FILLED,
			WAITING_FOR_UPDATE,
			UPDATING,
			ENRICHING,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Source Active States</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SourceActiveStates> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Source Active States</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceActiveStates get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceActiveStates result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Active States</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceActiveStates getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceActiveStates result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Active States</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceActiveStates get(int value) {
		switch (value) {
			case INITIALIZING_VALUE: return INITIALIZING;
			case INITIALIZED_VALUE: return INITIALIZED;
			case FILLING_VALUE: return FILLING;
			case FILLED_VALUE: return FILLED;
			case WAITING_FOR_UPDATE_VALUE: return WAITING_FOR_UPDATE;
			case UPDATING_VALUE: return UPDATING;
			case ENRICHING_VALUE: return ENRICHING;
			case UNKNOWN_VALUE: return UNKNOWN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SourceActiveStates(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SourceActiveStates
