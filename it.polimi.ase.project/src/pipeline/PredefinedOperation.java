/**
 */
package pipeline;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Predefined Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pipeline.PipelinePackage#getPredefinedOperation()
 * @model
 * @generated
 */
public enum PredefinedOperation implements Enumerator {
	/**
	 * The '<em><b>Remove Nulls</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_NULLS_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_NULLS(0, "removeNulls", "removeNulls"),

	/**
	 * The '<em><b>Remove Negative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_NEGATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_NEGATIVE(1, "removeNegative", "removeNegative"),

	/**
	 * The '<em><b>Round</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_VALUE
	 * @generated
	 * @ordered
	 */
	ROUND(2, "round", "round"), /**
	 * The '<em><b>Remove Column</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_COLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_COLUMN(3, "removeColumn", "removeColumn"), /**
	 * The '<em><b>Remove Duplicates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_DUPLICATES_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_DUPLICATES(4, "removeDuplicates", "removeDuplicates");

	/**
	 * The '<em><b>Remove Nulls</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remove Nulls</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_NULLS
	 * @model name="removeNulls"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_NULLS_VALUE = 0;

	/**
	 * The '<em><b>Remove Negative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remove Negative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_NEGATIVE
	 * @model name="removeNegative"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_NEGATIVE_VALUE = 1;

	/**
	 * The '<em><b>Round</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Round</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROUND
	 * @model name="round"
	 * @generated
	 * @ordered
	 */
	public static final int ROUND_VALUE = 2;

	/**
	 * The '<em><b>Remove Column</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remove Column</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_COLUMN
	 * @model name="removeColumn"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_COLUMN_VALUE = 3;

	/**
	 * The '<em><b>Remove Duplicates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remove Duplicates</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_DUPLICATES
	 * @model name="removeDuplicates"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_DUPLICATES_VALUE = 4;

	/**
	 * An array of all the '<em><b>Predefined Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PredefinedOperation[] VALUES_ARRAY =
		new PredefinedOperation[] {
			REMOVE_NULLS,
			REMOVE_NEGATIVE,
			ROUND,
			REMOVE_COLUMN,
			REMOVE_DUPLICATES,
		};

	/**
	 * A public read-only list of all the '<em><b>Predefined Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PredefinedOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Predefined Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PredefinedOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PredefinedOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predefined Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PredefinedOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PredefinedOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predefined Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PredefinedOperation get(int value) {
		switch (value) {
			case REMOVE_NULLS_VALUE: return REMOVE_NULLS;
			case REMOVE_NEGATIVE_VALUE: return REMOVE_NEGATIVE;
			case ROUND_VALUE: return ROUND;
			case REMOVE_COLUMN_VALUE: return REMOVE_COLUMN;
			case REMOVE_DUPLICATES_VALUE: return REMOVE_DUPLICATES;
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
	private PredefinedOperation(int value, String name, String literal) {
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
	
} //PredefinedOperation
