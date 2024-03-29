/**
 */
package pipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clustering Analysis Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.ClusteringAnalysisOperation#getType <em>Type</em>}</li>
 *   <li>{@link pipeline.ClusteringAnalysisOperation#getK <em>K</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getClusteringAnalysisOperation()
 * @model
 * @generated
 */
public interface ClusteringAnalysisOperation extends AnalysisOperation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pipeline.ClusteringOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pipeline.ClusteringOperation
	 * @see #setType(ClusteringOperation)
	 * @see pipeline.PipelinePackage#getClusteringAnalysisOperation_Type()
	 * @model
	 * @generated
	 */
	ClusteringOperation getType();

	/**
	 * Sets the value of the '{@link pipeline.ClusteringAnalysisOperation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pipeline.ClusteringOperation
	 * @see #getType()
	 * @generated
	 */
	void setType(ClusteringOperation value);

	/**
	 * Returns the value of the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K</em>' attribute.
	 * @see #setK(int)
	 * @see pipeline.PipelinePackage#getClusteringAnalysisOperation_K()
	 * @model
	 * @generated
	 */
	int getK();

	/**
	 * Sets the value of the '{@link pipeline.ClusteringAnalysisOperation#getK <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' attribute.
	 * @see #getK()
	 * @generated
	 */
	void setK(int value);

} // ClusteringAnalysisOperation
