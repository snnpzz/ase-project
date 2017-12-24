/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.CollectionTask#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getCollectionTask()
 * @model
 * @generated
 */
public interface CollectionTask extends Task {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getCollectionTask_Imports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Import> getImports();

} // CollectionTask
