/**
 */
package pipeline;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Clustering Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pipeline.PipelinePackage#getClusteringOperation()
 * @model
 * @generated
 */
public enum ClusteringOperation implements Enumerator {
	/**
	 * The '<em><b>KMeans</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMEANS_VALUE
	 * @generated
	 * @ordered
	 */
	KMEANS(0, "kMeans", "kMeans"),

	/**
	 * The '<em><b>KMedoids</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMEDOIDS_VALUE
	 * @generated
	 * @ordered
	 */
	KMEDOIDS(1, "kMedoids", "kMedoids"),

	/**
	 * The '<em><b>Fuzzy CMeans</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUZZY_CMEANS_VALUE
	 * @generated
	 * @ordered
	 */
	FUZZY_CMEANS(2, "fuzzyCMeans", "fuzzyCMeans"),

	/**
	 * The '<em><b>QT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QT_VALUE
	 * @generated
	 * @ordered
	 */
	QT(3, "QT", "QT");

	/**
	 * The '<em><b>KMeans</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KMeans</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KMEANS
	 * @model name="kMeans"
	 * @generated
	 * @ordered
	 */
	public static final int KMEANS_VALUE = 0;

	/**
	 * The '<em><b>KMedoids</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KMedoids</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KMEDOIDS
	 * @model name="kMedoids"
	 * @generated
	 * @ordered
	 */
	public static final int KMEDOIDS_VALUE = 1;

	/**
	 * The '<em><b>Fuzzy CMeans</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fuzzy CMeans</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUZZY_CMEANS
	 * @model name="fuzzyCMeans"
	 * @generated
	 * @ordered
	 */
	public static final int FUZZY_CMEANS_VALUE = 2;

	/**
	 * The '<em><b>QT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Clustering Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClusteringOperation[] VALUES_ARRAY =
		new ClusteringOperation[] {
			KMEANS,
			KMEDOIDS,
			FUZZY_CMEANS,
			QT,
		};

	/**
	 * A public read-only list of all the '<em><b>Clustering Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClusteringOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Clustering Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClusteringOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClusteringOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Clustering Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClusteringOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClusteringOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Clustering Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClusteringOperation get(int value) {
		switch (value) {
			case KMEANS_VALUE: return KMEANS;
			case KMEDOIDS_VALUE: return KMEDOIDS;
			case FUZZY_CMEANS_VALUE: return FUZZY_CMEANS;
			case QT_VALUE: return QT;
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
	private ClusteringOperation(int value, String name, String literal) {
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
	
} //ClusteringOperation
