/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.AnalysisTask#getAnalysisOperations <em>Analysis Operations</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getAnalysisTask()
 * @model
 * @generated
 */
public interface AnalysisTask extends Task {
	/**
	 * Returns the value of the '<em><b>Analysis Operations</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.AnalysisOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Operations</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getAnalysisTask_AnalysisOperations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AnalysisOperation> getAnalysisOperations();

} // AnalysisTask
