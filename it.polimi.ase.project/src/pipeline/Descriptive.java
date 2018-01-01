/**
 */
package pipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.Descriptive#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getDescriptive()
 * @model
 * @generated
 */
public interface Descriptive extends AnalysisOperation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link pipeline.DescriptiveOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see pipeline.DescriptiveOperation
	 * @see #setName(DescriptiveOperation)
	 * @see pipeline.PipelinePackage#getDescriptive_Name()
	 * @model
	 * @generated
	 */
	DescriptiveOperation getName();

	/**
	 * Sets the value of the '{@link pipeline.Descriptive#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see pipeline.DescriptiveOperation
	 * @see #getName()
	 * @generated
	 */
	void setName(DescriptiveOperation value);

} // Descriptive
