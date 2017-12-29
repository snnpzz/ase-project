/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.Task#getID <em>ID</em>}</li>
 *   <li>{@link pipeline.Task#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link pipeline.Task#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getTask()
 * @model abstract="true"
 *        annotation="gmf.node label='ID' figure='rounded'"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see pipeline.PipelinePackage#getTask_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link pipeline.Task#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link pipeline.DataFlow}.
	 * It is bidirectional and its opposite is '{@link pipeline.DataFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see pipeline.PipelinePackage#getTask_Incoming()
	 * @see pipeline.DataFlow#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<DataFlow> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link pipeline.DataFlow}.
	 * It is bidirectional and its opposite is '{@link pipeline.DataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see pipeline.PipelinePackage#getTask_Outgoing()
	 * @see pipeline.DataFlow#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<DataFlow> getOutgoing();

} // Task
