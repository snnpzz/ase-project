/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link pipeline.Operation#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link pipeline.Operation#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link pipeline.Operation#getID <em>ID</em>}</li>
 *   <li>{@link pipeline.Operation#getInputAttributes <em>Input Attributes</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pipeline.InternalDataFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(InternalDataFlow)
	 * @see pipeline.PipelinePackage#getOperation_Incoming()
	 * @see pipeline.InternalDataFlow#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	InternalDataFlow getIncoming();

	/**
	 * Sets the value of the '{@link pipeline.Operation#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(InternalDataFlow value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pipeline.InternalDataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(InternalDataFlow)
	 * @see pipeline.PipelinePackage#getOperation_Outgoing()
	 * @see pipeline.InternalDataFlow#getSource
	 * @model opposite="source"
	 * @generated
	 */
	InternalDataFlow getOutgoing();

	/**
	 * Sets the value of the '{@link pipeline.Operation#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(InternalDataFlow value);

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
	 * @see pipeline.PipelinePackage#getOperation_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link pipeline.Operation#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Input Attributes</b></em>' reference list.
	 * The list contents are of type {@link pipeline.SimpleAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Attributes</em>' reference list.
	 * @see pipeline.PipelinePackage#getOperation_InputAttributes()
	 * @model required="true"
	 * @generated
	 */
	EList<SimpleAttribute> getInputAttributes();

} // Operation
