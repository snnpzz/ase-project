/**
 */
package pipeline;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Predictive Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pipeline.PipelinePackage#getPredictiveOperation()
 * @model
 * @generated
 */
public enum PredictiveOperation implements Enumerator {
	/**
	 * The '<em><b>Simple Regression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_REGRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_REGRESSION(0, "SimpleRegression", "SimpleRegression"),

	/**
	 * The '<em><b>Multiple Lin Regr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_LIN_REGR_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_LIN_REGR(1, "MultipleLinRegr", "MultipleLinRegr"),

	/**
	 * The '<em><b>Random Forests</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_FORESTS_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM_FORESTS(2, "RandomForests", "RandomForests");

	/**
	 * The '<em><b>Simple Regression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simple Regression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_REGRESSION
	 * @model name="SimpleRegression"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_REGRESSION_VALUE = 0;

	/**
	 * The '<em><b>Multiple Lin Regr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Lin Regr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_LIN_REGR
	 * @model name="MultipleLinRegr"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_LIN_REGR_VALUE = 1;

	/**
	 * The '<em><b>Random Forests</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Random Forests</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANDOM_FORESTS
	 * @model name="RandomForests"
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_FORESTS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Predictive Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PredictiveOperation[] VALUES_ARRAY =
		new PredictiveOperation[] {
			SIMPLE_REGRESSION,
			MULTIPLE_LIN_REGR,
			RANDOM_FORESTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Predictive Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PredictiveOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Predictive Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PredictiveOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PredictiveOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predictive Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PredictiveOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PredictiveOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predictive Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PredictiveOperation get(int value) {
		switch (value) {
			case SIMPLE_REGRESSION_VALUE: return SIMPLE_REGRESSION;
			case MULTIPLE_LIN_REGR_VALUE: return MULTIPLE_LIN_REGR;
			case RANDOM_FORESTS_VALUE: return RANDOM_FORESTS;
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
	private PredictiveOperation(int value, String name, String literal) {
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
	
} //PredictiveOperation
