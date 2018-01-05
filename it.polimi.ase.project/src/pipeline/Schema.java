/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.Schema#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link pipeline.Schema#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getSchema()
 * @model annotation="gmf.node label='name' label.placement='none' figure='rounded'"
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getSchema_Attributes()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Attribute> getAttributes();

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
	 * @see pipeline.PipelinePackage#getSchema_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link pipeline.Schema#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // Schema
