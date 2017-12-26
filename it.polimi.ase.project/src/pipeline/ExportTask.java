/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.ExportTask#getExports <em>Exports</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getExportTask()
 * @model
 * @generated
 */
public interface ExportTask extends Task {
	/**
	 * Returns the value of the '<em><b>Exports</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.Export}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exports</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getExportTask_Exports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Export> getExports();

} // ExportTask
