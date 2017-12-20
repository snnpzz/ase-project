/**
 */
package ASEProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASEProject.Dataflow#getFormat <em>Format</em>}</li>
 *   <li>{@link ASEProject.Dataflow#getSchema <em>Schema</em>}</li>
 *   <li>{@link ASEProject.Dataflow#getTarget <em>Target</em>}</li>
 *   <li>{@link ASEProject.Dataflow#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see ASEProject.ASEProjectPackage#getDataflow()
 * @model annotation="gmf.link source='source' target='target' width='2' target.decoration='arrow'"
 * @generated
 */
public interface Dataflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link ASEProject.Format}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see ASEProject.Format
	 * @see #setFormat(Format)
	 * @see ASEProject.ASEProjectPackage#getDataflow_Format()
	 * @model
	 * @generated
	 */
	Format getFormat();

	/**
	 * Sets the value of the '{@link ASEProject.Dataflow#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see ASEProject.Format
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(Format value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(Schema)
	 * @see ASEProject.ASEProjectPackage#getDataflow_Schema()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link ASEProject.Dataflow#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ASEProject.Task#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Task)
	 * @see ASEProject.ASEProjectPackage#getDataflow_Target()
	 * @see ASEProject.Task#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Task getTarget();

	/**
	 * Sets the value of the '{@link ASEProject.Dataflow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Task value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ASEProject.Task#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Task)
	 * @see ASEProject.ASEProjectPackage#getDataflow_Source()
	 * @see ASEProject.Task#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	Task getSource();

	/**
	 * Sets the value of the '{@link ASEProject.Dataflow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Task value);

} // Dataflow
