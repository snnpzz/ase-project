/**
 */
package pipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Analysis Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.ClassificationAnalysisOperation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getClassificationAnalysisOperation()
 * @model
 * @generated
 */
public interface ClassificationAnalysisOperation extends AnalysisOperation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link pipeline.ClassificationOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see pipeline.ClassificationOperation
	 * @see #setName(ClassificationOperation)
	 * @see pipeline.PipelinePackage#getClassificationAnalysisOperation_Name()
	 * @model
	 * @generated
	 */
	ClassificationOperation getName();

	/**
	 * Sets the value of the '{@link pipeline.ClassificationAnalysisOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see pipeline.ClassificationOperation
	 * @see #getName()
	 * @generated
	 */
	void setName(ClassificationOperation value);

} // ClassificationAnalysisOperation
