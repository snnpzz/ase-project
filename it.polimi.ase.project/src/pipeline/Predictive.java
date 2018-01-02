/**
 */
package pipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predictive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.Predictive#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getPredictive()
 * @model
 * @generated
 */
public interface Predictive extends AnalysisOperation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link pipeline.PredictiveOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see pipeline.PredictiveOperation
	 * @see #setName(PredictiveOperation)
	 * @see pipeline.PipelinePackage#getPredictive_Name()
	 * @model
	 * @generated
	 */
	PredictiveOperation getName();

	/**
	 * Sets the value of the '{@link pipeline.Predictive#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see pipeline.PredictiveOperation
	 * @see #getName()
	 * @generated
	 */
	void setName(PredictiveOperation value);

} // Predictive
