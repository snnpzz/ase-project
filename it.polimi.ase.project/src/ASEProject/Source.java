/**
 */
package ASEProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ASEProject.Source#getLinkedTo <em>Linked To</em>}</li>
 *   <li>{@link ASEProject.Source#getName <em>Name</em>}</li>
 *   <li>{@link ASEProject.Source#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see ASEProject.ASEProjectPackage#getSource()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Source extends EObject {
	/**
	 * Returns the value of the '<em><b>Linked To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ASEProject.Import#getReadsFrom <em>Reads From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked To</em>' reference.
	 * @see #setLinkedTo(Import)
	 * @see ASEProject.ASEProjectPackage#getSource_LinkedTo()
	 * @see ASEProject.Import#getReadsFrom
	 * @model opposite="readsFrom" required="true"
	 * @generated
	 */
	Import getLinkedTo();

	/**
	 * Sets the value of the '{@link ASEProject.Source#getLinkedTo <em>Linked To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked To</em>' reference.
	 * @see #getLinkedTo()
	 * @generated
	 */
	void setLinkedTo(Import value);

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
	 * @see ASEProject.ASEProjectPackage#getSource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ASEProject.Source#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see ASEProject.ASEProjectPackage#getSource_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link ASEProject.Source#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // Source
