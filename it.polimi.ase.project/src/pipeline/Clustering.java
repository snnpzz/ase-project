/**
 */
package pipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clustering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.Clustering#getK <em>K</em>}</li>
 *   <li>{@link pipeline.Clustering#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getClustering()
 * @model
 * @generated
 */
public interface Clustering extends AnalysisOperation {
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
	 * @see pipeline.PipelinePackage#getClustering_K()
	 * @model
	 * @generated
	 */
	int getK();

	/**
	 * Sets the value of the '{@link pipeline.Clustering#getK <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' attribute.
	 * @see #getK()
	 * @generated
	 */
	void setK(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link pipeline.ClusteringOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see pipeline.ClusteringOperation
	 * @see #setName(ClusteringOperation)
	 * @see pipeline.PipelinePackage#getClustering_Name()
	 * @model
	 * @generated
	 */
	ClusteringOperation getName();

	/**
	 * Sets the value of the '{@link pipeline.Clustering#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see pipeline.ClusteringOperation
	 * @see #getName()
	 * @generated
	 */
	void setName(ClusteringOperation value);

} // Clustering
