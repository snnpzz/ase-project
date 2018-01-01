/**
 */
package pipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predefined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.Predefined#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getPredefined()
 * @model
 * @generated
 */
public interface Predefined extends CleaningOperation {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link pipeline.PredefinedOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see pipeline.PredefinedOperation
	 * @see #setName(PredefinedOperation)
	 * @see pipeline.PipelinePackage#getPredefined_Name()
	 * @model default=""
	 * @generated
	 */
	PredefinedOperation getName();

	/**
	 * Sets the value of the '{@link pipeline.Predefined#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see pipeline.PredefinedOperation
	 * @see #getName()
	 * @generated
	 */
	void setName(PredefinedOperation value);
} // Predefined
