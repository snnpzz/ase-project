/**
 */
package ASEProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASEProject.Operation#getName <em>Name</em>}</li>
 *   <li>{@link ASEProject.Operation#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ASEProject.Operation#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see ASEProject.ASEProjectPackage#getOperation()
 * @model abstract="true"
 *        annotation="gmf.node label='name' figure='ellipse'"
 * @generated
 */
public interface Operation extends EObject {
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
	 * @see ASEProject.ASEProjectPackage#getOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ASEProject.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ASEProject.InternalDF#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(InternalDF)
	 * @see ASEProject.ASEProjectPackage#getOperation_Incoming()
	 * @see ASEProject.InternalDF#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	InternalDF getIncoming();

	/**
	 * Sets the value of the '{@link ASEProject.Operation#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(InternalDF value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ASEProject.InternalDF#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(InternalDF)
	 * @see ASEProject.ASEProjectPackage#getOperation_Outgoing()
	 * @see ASEProject.InternalDF#getSource
	 * @model opposite="source"
	 * @generated
	 */
	InternalDF getOutgoing();

	/**
	 * Sets the value of the '{@link ASEProject.Operation#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(InternalDF value);

} // Operation
