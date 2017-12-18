/**
 */
package ASEProject;

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
 *   <li>{@link ASEProject.Task#getName <em>Name</em>}</li>
 *   <li>{@link ASEProject.Task#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link ASEProject.Task#getNext <em>Next</em>}</li>
 *   <li>{@link ASEProject.Task#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see ASEProject.ASEProjectPackage#getTask()
 * @model abstract="true"
 *        annotation="gmf.node label='name' figure='rounded'"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ASEProject.ASEProjectPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ASEProject.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see #setIsRequired(boolean)
	 * @see ASEProject.ASEProjectPackage#getTask_IsRequired()
	 * @model
	 * @generated
	 */
	boolean isIsRequired();

	/**
	 * Sets the value of the '{@link ASEProject.Task#isIsRequired <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required</em>' attribute.
	 * @see #isIsRequired()
	 * @generated
	 */
	void setIsRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link ASEProject.Dataflow}.
	 * It is bidirectional and its opposite is '{@link ASEProject.Dataflow#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see ASEProject.ASEProjectPackage#getTask_Next()
	 * @see ASEProject.Dataflow#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	EList<Dataflow> getNext();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ASEProject.Dataflow#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(Dataflow)
	 * @see ASEProject.ASEProjectPackage#getTask_Outgoing()
	 * @see ASEProject.Dataflow#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	Dataflow getOutgoing();

	/**
	 * Sets the value of the '{@link ASEProject.Task#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(Dataflow value);

} // Task
