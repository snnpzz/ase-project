/**
 */
package pipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predictive Analysis Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.PredictiveAnalysisOperation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getPredictiveAnalysisOperation()
 * @model
 * @generated
 */
public interface PredictiveAnalysisOperation extends AnalysisOperation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pipeline.PredictiveOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pipeline.PredictiveOperation
	 * @see #setType(PredictiveOperation)
	 * @see pipeline.PipelinePackage#getPredictiveAnalysisOperation_Type()
	 * @model
	 * @generated
	 */
	PredictiveOperation getType();

	/**
	 * Sets the value of the '{@link pipeline.PredictiveAnalysisOperation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pipeline.PredictiveOperation
	 * @see #getType()
	 * @generated
	 */
	void setType(PredictiveOperation value);

} // PredictiveAnalysisOperation
