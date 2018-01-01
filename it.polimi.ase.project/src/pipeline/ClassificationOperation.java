/**
 */
package pipeline;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Classification Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pipeline.PipelinePackage#getClassificationOperation()
 * @model
 * @generated
 */
public enum ClassificationOperation implements Enumerator {
	/**
	 * The '<em><b>Logistic Regression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGISTIC_REGRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	LOGISTIC_REGRESSION(0, "LogisticRegression", "LogisticRegression"),

	/**
	 * The '<em><b>LDA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LDA_VALUE
	 * @generated
	 * @ordered
	 */
	LDA(1, "LDA", "LDA"),

	/**
	 * The '<em><b>QDA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QDA_VALUE
	 * @generated
	 * @ordered
	 */
	QDA(2, "QDA", "QDA"),

	/**
	 * The '<em><b>KNN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNN_VALUE
	 * @generated
	 * @ordered
	 */
	KNN(3, "KNN", "KNN"),

	/**
	 * The '<em><b>SVM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVM_VALUE
	 * @generated
	 * @ordered
	 */
	SVM(4, "SVM", "SVM");

	/**
	 * The '<em><b>Logistic Regression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Logistic Regression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGISTIC_REGRESSION
	 * @model name="LogisticRegression"
	 * @generated
	 * @ordered
	 */
	public static final int LOGISTIC_REGRESSION_VALUE = 0;

	/**
	 * The '<em><b>LDA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LDA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LDA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LDA_VALUE = 1;

	/**
	 * The '<em><b>QDA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QDA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QDA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QDA_VALUE = 2;

	/**
	 * The '<em><b>KNN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KNN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KNN_VALUE = 3;

	/**
	 * The '<em><b>SVM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SVM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SVM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SVM_VALUE = 4;

	/**
	 * An array of all the '<em><b>Classification Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClassificationOperation[] VALUES_ARRAY =
		new ClassificationOperation[] {
			LOGISTIC_REGRESSION,
			LDA,
			QDA,
			KNN,
			SVM,
		};

	/**
	 * A public read-only list of all the '<em><b>Classification Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClassificationOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Classification Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassificationOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassificationOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classification Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassificationOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassificationOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classification Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassificationOperation get(int value) {
		switch (value) {
			case LOGISTIC_REGRESSION_VALUE: return LOGISTIC_REGRESSION;
			case LDA_VALUE: return LDA;
			case QDA_VALUE: return QDA;
			case KNN_VALUE: return KNN;
			case SVM_VALUE: return SVM;
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
	private ClassificationOperation(int value, String name, String literal) {
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
	
} //ClassificationOperation
