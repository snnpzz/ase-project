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
	 * The '<em><b>Hierarchical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIERARCHICAL_VALUE
	 * @generated
	 * @ordered
	 */
	HIERARCHICAL(1, "Hierarchical", "Hierarchical");

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
	 * The '<em><b>Hierarchical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hierarchical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIERARCHICAL
	 * @model name="Hierarchical"
	 * @generated
	 * @ordered
	 */
	public static final int HIERARCHICAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Clustering Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClusteringOperation[] VALUES_ARRAY =
		new ClusteringOperation[] {
			KMEANS,
			HIERARCHICAL,
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
			case HIERARCHICAL_VALUE: return HIERARCHICAL;
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
