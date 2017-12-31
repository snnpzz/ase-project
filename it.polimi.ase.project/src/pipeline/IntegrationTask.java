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
 *   <li>{@link pipeline.IntegrationTask#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getIntegrationTask()
 * @model
 * @generated
 */
public interface IntegrationTask extends Task {

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link pipeline.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see pipeline.PipelinePackage#getIntegrationTask_Attributes()
	 * @model required="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();
} // IntegrationTask
