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
 *   <li>{@link pipeline.ClassificationAnalysisOperation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getClassificationAnalysisOperation()
 * @model
 * @generated
 */
public interface ClassificationAnalysisOperation extends AnalysisOperation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pipeline.ClassificationOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pipeline.ClassificationOperation
	 * @see #setType(ClassificationOperation)
	 * @see pipeline.PipelinePackage#getClassificationAnalysisOperation_Type()
	 * @model
	 * @generated
	 */
	ClassificationOperation getType();

	/**
	 * Sets the value of the '{@link pipeline.ClassificationAnalysisOperation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pipeline.ClassificationOperation
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassificationOperation value);

} // ClassificationAnalysisOperation
