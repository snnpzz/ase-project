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
	LINE(1, "Line", "Line"),

	/**
	 * The '<em><b>Pie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE_VALUE
	 * @generated
	 * @ordered
	 */
	PIE(2, "Pie", "Pie"),

	/**
	 * The '<em><b>Doughnut</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUGHNUT_VALUE
	 * @generated
	 * @ordered
	 */
	DOUGHNUT(3, "Doughnut", "Doughnut"),

	/**
	 * The '<em><b>Bar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_VALUE
	 * @generated
	 * @ordered
	 */
	BAR(4, "Bar", "Bar"),

	/**
	 * The '<em><b>Area</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREA_VALUE
	 * @generated
	 * @ordered
	 */
	AREA(5, "Area", "Area"),

	/**
	 * The '<em><b>Scatter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCATTER_VALUE
	 * @generated
	 * @ordered
	 */
	SCATTER(6, "Scatter", "Scatter"),

	/**
	 * The '<em><b>Bubble</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUBBLE_VALUE
	 * @generated
	 * @ordered
	 */
	BUBBLE(7, "Bubble", "Bubble"),

	/**
	 * The '<em><b>Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAP_VALUE
	 * @generated
	 * @ordered
	 */
	MAP(8, "Map", "Map"),

	/**
	 * The '<em><b>Stock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOCK_VALUE
	 * @generated
	 * @ordered
	 */
	STOCK(9, "Stock", "Stock"),

	/**
	 * The '<em><b>Surface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURFACE_VALUE
	 * @generated
	 * @ordered
	 */
	SURFACE(10, "Surface", "Surface"),

	/**
	 * The '<em><b>Radar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADAR_VALUE
	 * @generated
	 * @ordered
	 */
	RADAR(11, "Radar", "Radar"),

	/**
	 * The '<em><b>Treemap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREEMAP_VALUE
	 * @generated
	 * @ordered
	 */
	TREEMAP(12, "Treemap", "Treemap"),

	/**
	 * The '<em><b>Sunburst</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUNBURST_VALUE
	 * @generated
	 * @ordered
	 */
	SUNBURST(13, "Sunburst", "Sunburst"),

	/**
	 * The '<em><b>Histogram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTOGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	HISTOGRAM(14, "Histogram", "Histogram"),

	/**
	 * The '<em><b>Box And Whisker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOX_AND_WHISKER_VALUE
	 * @generated
	 * @ordered
	 */
	BOX_AND_WHISKER(15, "BoxAndWhisker", "BoxAndWhisker"),

	/**
	 * The '<em><b>Waterfall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATERFALL_VALUE
	 * @generated
	 * @ordered
	 */
	WATERFALL(16, "Waterfall", "Waterfall"),

	/**
	 * The '<em><b>Funnel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNNEL_VALUE
	 * @generated
	 * @ordered
	 */
	FUNNEL(17, "Funnel", "Funnel"),

	/**
	 * The '<em><b>Combo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBO_VALUE
	 * @generated
	 * @ordered
	 */
	COMBO(18, "Combo", "Combo");

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
	public static final int LINE_VALUE = 1;

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
	public static final int PIE_VALUE = 2;

	/**
	 * The '<em><b>Doughnut</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Doughnut</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUGHNUT
	 * @model name="Doughnut"
	 * @generated
	 * @ordered
	 */
	public static final int DOUGHNUT_VALUE = 3;

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
	public static final int BAR_VALUE = 4;

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
	public static final int AREA_VALUE = 5;

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
	public static final int SCATTER_VALUE = 6;

	/**
	 * The '<em><b>Bubble</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bubble</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUBBLE
	 * @model name="Bubble"
	 * @generated
	 * @ordered
	 */
	public static final int BUBBLE_VALUE = 7;

	/**
	 * The '<em><b>Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Map</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAP
	 * @model name="Map"
	 * @generated
	 * @ordered
	 */
	public static final int MAP_VALUE = 8;

	/**
	 * The '<em><b>Stock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stock</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOCK
	 * @model name="Stock"
	 * @generated
	 * @ordered
	 */
	public static final int STOCK_VALUE = 9;

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
	public static final int SURFACE_VALUE = 10;

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
	public static final int RADAR_VALUE = 11;

	/**
	 * The '<em><b>Treemap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Treemap</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREEMAP
	 * @model name="Treemap"
	 * @generated
	 * @ordered
	 */
	public static final int TREEMAP_VALUE = 12;

	/**
	 * The '<em><b>Sunburst</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sunburst</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUNBURST
	 * @model name="Sunburst"
	 * @generated
	 * @ordered
	 */
	public static final int SUNBURST_VALUE = 13;

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
	public static final int HISTOGRAM_VALUE = 14;

	/**
	 * The '<em><b>Box And Whisker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Box And Whisker</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOX_AND_WHISKER
	 * @model name="BoxAndWhisker"
	 * @generated
	 * @ordered
	 */
	public static final int BOX_AND_WHISKER_VALUE = 15;

	/**
	 * The '<em><b>Waterfall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Waterfall</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WATERFALL
	 * @model name="Waterfall"
	 * @generated
	 * @ordered
	 */
	public static final int WATERFALL_VALUE = 16;

	/**
	 * The '<em><b>Funnel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Funnel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNNEL
	 * @model name="Funnel"
	 * @generated
	 * @ordered
	 */
	public static final int FUNNEL_VALUE = 17;

	/**
	 * The '<em><b>Combo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Combo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMBO
	 * @model name="Combo"
	 * @generated
	 * @ordered
	 */
	public static final int COMBO_VALUE = 18;

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
			DOUGHNUT,
			BAR,
			AREA,
			SCATTER,
			BUBBLE,
			MAP,
			STOCK,
			SURFACE,
			RADAR,
			TREEMAP,
			SUNBURST,
			HISTOGRAM,
			BOX_AND_WHISKER,
			WATERFALL,
			FUNNEL,
			COMBO,
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
			case LINE_VALUE: return LINE;
			case PIE_VALUE: return PIE;
			case DOUGHNUT_VALUE: return DOUGHNUT;
			case BAR_VALUE: return BAR;
			case AREA_VALUE: return AREA;
			case SCATTER_VALUE: return SCATTER;
			case BUBBLE_VALUE: return BUBBLE;
			case MAP_VALUE: return MAP;
			case STOCK_VALUE: return STOCK;
			case SURFACE_VALUE: return SURFACE;
			case RADAR_VALUE: return RADAR;
			case TREEMAP_VALUE: return TREEMAP;
			case SUNBURST_VALUE: return SUNBURST;
			case HISTOGRAM_VALUE: return HISTOGRAM;
			case BOX_AND_WHISKER_VALUE: return BOX_AND_WHISKER;
			case WATERFALL_VALUE: return WATERFALL;
			case FUNNEL_VALUE: return FUNNEL;
			case COMBO_VALUE: return COMBO;
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
