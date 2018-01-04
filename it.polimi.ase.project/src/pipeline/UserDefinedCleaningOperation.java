/**
 */
package pipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Defined Cleaning Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.UserDefinedCleaningOperation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getUserDefinedCleaningOperation()
 * @model
 * @generated
 */
public interface UserDefinedCleaningOperation extends CleaningOperation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see pipeline.PipelinePackage#getUserDefinedCleaningOperation_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link pipeline.UserDefinedCleaningOperation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // UserDefinedCleaningOperation
