/**
 */
package pipeline;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Chart Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pipeline.PipelinePackage#getChartType()
 * @model
 * @generated
 */
public enum ChartType implements Enumerator {
	/**
	 * The '<em><b>Column</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLUMN_VALUE
	 * @generated
	 * @ordered
	 */
	COLUMN(0, "Column", "Column"),

	/**
	 * The '<em><b>Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_VALUE
	 * @generated
	 * @ordered
	 */
	LINE(0, "Line", "Line"),

	/**
	 * The '<em><b>Pie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE_VALUE
	 * @generated
	 * @ordered
	 */
	PIE(0, "Pie", "Pie"),

	/**
	 * The '<em><b>Bar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_VALUE
	 * @generated
	 * @ordered
	 */
	BAR(0, "Bar", "Bar"),

	/**
	 * The '<em><b>Area</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREA_VALUE
	 * @generated
	 * @ordered
	 */
	AREA(0, "Area", "Area"),

	/**
	 * The '<em><b>Scatter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCATTER_VALUE
	 * @generated
	 * @ordered
	 */
	SCATTER(0, "Scatter", "Scatter"),

	/**
	 * The '<em><b>Surface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURFACE_VALUE
	 * @generated
	 * @ordered
	 */
	SURFACE(0, "Surface", "Surface"),

	/**
	 * The '<em><b>Radar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADAR_VALUE
	 * @generated
	 * @ordered
	 */
	RADAR(0, "Radar", "Radar"),

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
	 * The '<em><b>Box Plot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOX_PLOT_VALUE
	 * @generated
	 * @ordered
	 */
	BOX_PLOT(0, "BoxPlot", "BoxPlot");

	/**
	 * The '<em><b>Column</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Column</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLUMN
	 * @model name="Column"
	 * @generated
	 * @ordered
	 */
	public static final int COLUMN_VALUE = 0;

	/**
	 * The '<em><b>Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE
	 * @model name="Line"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_VALUE = 0;

	/**
	 * The '<em><b>Pie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pie</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIE
	 * @model name="Pie"
	 * @generated
	 * @ordered
	 */
	public static final int PIE_VALUE = 0;

	/**
	 * The '<em><b>Bar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAR
	 * @model name="Bar"
	 * @generated
	 * @ordered
	 */
	public static final int BAR_VALUE = 0;

	/**
	 * The '<em><b>Area</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Area</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AREA
	 * @model name="Area"
	 * @generated
	 * @ordered
	 */
	public static final int AREA_VALUE = 0;

	/**
	 * The '<em><b>Scatter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scatter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCATTER
	 * @model name="Scatter"
	 * @generated
	 * @ordered
	 */
	public static final int SCATTER_VALUE = 0;

	/**
	 * The '<em><b>Surface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Surface</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURFACE
	 * @model name="Surface"
	 * @generated
	 * @ordered
	 */
	public static final int SURFACE_VALUE = 0;

	/**
	 * The '<em><b>Radar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADAR
	 * @model name="Radar"
	 * @generated
	 * @ordered
	 */
	public static final int RADAR_VALUE = 0;

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
	 * The '<em><b>Box Plot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Box Plot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOX_PLOT
	 * @model name="BoxPlot"
	 * @generated
	 * @ordered
	 */
	public static final int BOX_PLOT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Chart Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChartType[] VALUES_ARRAY =
		new ChartType[] {
			COLUMN,
			LINE,
			PIE,
			BAR,
			AREA,
			SCATTER,
			SURFACE,
			RADAR,
			HISTOGRAM,
			BOX_PLOT,
		};

	/**
	 * A public read-only list of all the '<em><b>Chart Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChartType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Chart Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChartType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChartType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Chart Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChartType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChartType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Chart Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChartType get(int value) {
		switch (value) {
			case COLUMN_VALUE: return COLUMN;
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
	private ChartType(int value, String name, String literal) {
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
	
} //ChartType
