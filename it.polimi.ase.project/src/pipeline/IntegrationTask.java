/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.IntegrationTask#getIntegrationOperations <em>Integration Operations</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getIntegrationTask()
 * @model
 * @generated
 */
public interface IntegrationTask extends Task {
	/**
	 * Returns the value of the '<em><b>Integration Operations</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.IntegrationOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integration Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration Operations</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getIntegrationTask_IntegrationOperations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IntegrationOperation> getIntegrationOperations();

} // IntegrationTask
