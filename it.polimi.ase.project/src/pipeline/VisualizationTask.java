/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.VisualizationTask#getVisualizationOperations <em>Visualization Operations</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getVisualizationTask()
 * @model
 * @generated
 */
public interface VisualizationTask extends Task {
	/**
	 * Returns the value of the '<em><b>Visualization Operations</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.VisualizationOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visualization Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization Operations</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getVisualizationTask_VisualizationOperations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VisualizationOperation> getVisualizationOperations();

} // VisualizationTask
