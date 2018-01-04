/**
 */
package pipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predefined Cleaning Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.PredefinedCleaningOperation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getPredefinedCleaningOperation()
 * @model
 * @generated
 */
public interface PredefinedCleaningOperation extends CleaningOperation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link pipeline.PredefinedOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pipeline.PredefinedOperation
	 * @see #setType(PredefinedOperation)
	 * @see pipeline.PipelinePackage#getPredefinedCleaningOperation_Type()
	 * @model default=""
	 * @generated
	 */
	PredefinedOperation getType();

	/**
	 * Sets the value of the '{@link pipeline.PredefinedCleaningOperation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pipeline.PredefinedOperation
	 * @see #getType()
	 * @generated
	 */
	void setType(PredefinedOperation value);

} // PredefinedCleaningOperation
