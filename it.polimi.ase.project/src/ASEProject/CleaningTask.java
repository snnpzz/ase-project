/**
 */
package ASEProject;

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
 *   <li>{@link ASEProject.CleaningTask#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see ASEProject.ASEProjectPackage#getCleaningTask()
 * @model
 * @generated
 */
public interface CleaningTask extends Task {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link ASEProject.CleaningOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see ASEProject.ASEProjectPackage#getCleaningTask_Operations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CleaningOp> getOperations();

} // CleaningTask
