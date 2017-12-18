/**
 */
package ASEProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASEProject.Import#getReadsFrom <em>Reads From</em>}</li>
 *   <li>{@link ASEProject.Import#getUses <em>Uses</em>}</li>
 *   <li>{@link ASEProject.Import#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ASEProject.ASEProjectPackage#getImport()
 * @model annotation="gmf.node label='name' label.text='Import' figure='ellipse'"
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Reads From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ASEProject.Source#getLinkedTo <em>Linked To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reads From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reads From</em>' reference.
	 * @see #setReadsFrom(Source)
	 * @see ASEProject.ASEProjectPackage#getImport_ReadsFrom()
	 * @see ASEProject.Source#getLinkedTo
	 * @model opposite="linkedTo" required="true"
	 * @generated
	 */
	Source getReadsFrom();

	/**
	 * Sets the value of the '{@link ASEProject.Import#getReadsFrom <em>Reads From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reads From</em>' reference.
	 * @see #getReadsFrom()
	 * @generated
	 */
	void setReadsFrom(Source value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference.
	 * @see #setUses(Schema)
	 * @see ASEProject.ASEProjectPackage#getImport_Uses()
	 * @model required="true"
	 * @generated
	 */
	Schema getUses();

	/**
	 * Sets the value of the '{@link ASEProject.Import#getUses <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(Schema value);

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
	 * @see ASEProject.ASEProjectPackage#getImport_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ASEProject.Import#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Import
