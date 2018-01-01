/**
 */
package pipeline;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Descriptive Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pipeline.PipelinePackage#getDescriptiveOperation()
 * @model
 * @generated
 */
public enum DescriptiveOperation implements Enumerator {
	/**
	 * The '<em><b>Histogram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTOGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	HISTOGRAM(0, "Histogram", "Histogram"),

	/**
	 * The '<em><b>Boxplot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOXPLOT_VALUE
	 * @generated
	 * @ordered
	 */
	BOXPLOT(1, "Boxplot", "Boxplot"),

	/**
	 * The '<em><b>Pie Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	PIE_CHART(2, "PieChart", "PieChart");

	/**
	 * The '<em><b>Histogram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Histogram</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HISTOGRAM
	 * @model name="Histogram"
	 * @generated
	 * @ordered
	 */
	public static final int HISTOGRAM_VALUE = 0;

	/**
	 * The '<em><b>Boxplot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boxplot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOXPLOT
	 * @model name="Boxplot"
	 * @generated
	 * @ordered
	 */
	public static final int BOXPLOT_VALUE = 1;

	/**
	 * The '<em><b>Pie Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pie Chart</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIE_CHART
	 * @model name="PieChart"
	 * @generated
	 * @ordered
	 */
	public static final int PIE_CHART_VALUE = 2;

	/**
	 * An array of all the '<em><b>Descriptive Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DescriptiveOperation[] VALUES_ARRAY =
		new DescriptiveOperation[] {
			HISTOGRAM,
			BOXPLOT,
			PIE_CHART,
		};

	/**
	 * A public read-only list of all the '<em><b>Descriptive Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DescriptiveOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Descriptive Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DescriptiveOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DescriptiveOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Descriptive Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DescriptiveOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DescriptiveOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Descriptive Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DescriptiveOperation get(int value) {
		switch (value) {
			case HISTOGRAM_VALUE: return HISTOGRAM;
			case BOXPLOT_VALUE: return BOXPLOT;
			case PIE_CHART_VALUE: return PIE_CHART;
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
	private DescriptiveOperation(int value, String name, String literal) {
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
	
} //DescriptiveOperation
