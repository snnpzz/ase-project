/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.PL#getDataflows <em>Dataflows</em>}</li>
 *   <li>{@link pipeline.PL#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getPL()
 * @model
 * @generated
 */
public interface PL extends EObject {
	/**
	 * Returns the value of the '<em><b>Dataflows</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.Dataflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataflows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataflows</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getPL_Dataflows()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Dataflow> getDataflows();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getPL_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // PL
