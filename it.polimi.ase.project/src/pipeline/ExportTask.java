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
 *   <li>{@link pipeline.ExportTask#getExportOperations <em>Export Operations</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getExportTask()
 * @model
 * @generated
 */
public interface ExportTask extends Task {
	/**
	 * Returns the value of the '<em><b>Export Operations</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.ExportOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Operations</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getExportTask_ExportOperations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExportOperation> getExportOperations();

} // ExportTask
