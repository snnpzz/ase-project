/**
 */
package ASEProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exporting Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASEProject.ExportingTask#getExports <em>Exports</em>}</li>
 * </ul>
 *
 * @see ASEProject.ASEProjectPackage#getExportingTask()
 * @model
 * @generated
 */
public interface ExportingTask extends Task {
	/**
	 * Returns the value of the '<em><b>Exports</b></em>' containment reference list.
	 * The list contents are of type {@link ASEProject.Export}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exports</em>' containment reference list.
	 * @see ASEProject.ASEProjectPackage#getExportingTask_Exports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Export> getExports();

} // ExportingTask
