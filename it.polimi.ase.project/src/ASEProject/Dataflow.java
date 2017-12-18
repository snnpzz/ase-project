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
 *   <li>{@link ASEProject.Dataflow#getPrevious <em>Previous</em>}</li>
 *   <li>{@link ASEProject.Dataflow#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see ASEProject.ASEProjectPackage#getDataflow()
 * @model annotation="gmf.link source='previous' target='incoming' width='2'"
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
	 * Returns the value of the '<em><b>Previous</b></em>' reference list.
	 * The list contents are of type {@link ASEProject.Task}.
	 * It is bidirectional and its opposite is '{@link ASEProject.Task#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference list.
	 * @see ASEProject.ASEProjectPackage#getDataflow_Previous()
	 * @see ASEProject.Task#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	EList<Task> getPrevious();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ASEProject.Task#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(Task)
	 * @see ASEProject.ASEProjectPackage#getDataflow_Incoming()
	 * @see ASEProject.Task#getNext
	 * @model opposite="next"
	 * @generated
	 */
	Task getIncoming();

	/**
	 * Sets the value of the '{@link ASEProject.Dataflow#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(Task value);

} // Dataflow
