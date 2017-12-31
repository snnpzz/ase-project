/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cleaning Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.CleaningTask#getCleaningOperations <em>Cleaning Operations</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getCleaningTask()
 * @model
 * @generated
 */
public interface CleaningTask extends Task {
	/**
	 * Returns the value of the '<em><b>Cleaning Operations</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.CleaningOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cleaning Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleaning Operations</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getCleaningTask_CleaningOperations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CleaningOperation> getCleaningOperations();

} // CleaningTask
