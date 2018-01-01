/**
 */
package pipeline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.VisualizationTask#getSize <em>Size</em>}</li>
 *   <li>{@link pipeline.VisualizationTask#getChartType <em>Chart Type</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getVisualizationTask()
 * @model
 * @generated
 */
public interface VisualizationTask extends Task {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link pipeline.Size}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see pipeline.Size
	 * @see #setSize(Size)
	 * @see pipeline.PipelinePackage#getVisualizationTask_Size()
	 * @model
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link pipeline.VisualizationTask#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see pipeline.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Returns the value of the '<em><b>Chart Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pipeline.ChartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart Type</em>' attribute.
	 * @see pipeline.ChartType
	 * @see #setChartType(ChartType)
	 * @see pipeline.PipelinePackage#getVisualizationTask_ChartType()
	 * @model
	 * @generated
	 */
	ChartType getChartType();

	/**
	 * Sets the value of the '{@link pipeline.VisualizationTask#getChartType <em>Chart Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart Type</em>' attribute.
	 * @see pipeline.ChartType
	 * @see #getChartType()
	 * @generated
	 */
	void setChartType(ChartType value);

} // VisualizationTask
