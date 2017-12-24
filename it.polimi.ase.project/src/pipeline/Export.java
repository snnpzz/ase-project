/**
 */
package pipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.Export#getGenerates <em>Generates</em>}</li>
 *   <li>{@link pipeline.Export#getUses <em>Uses</em>}</li>
 *   <li>{@link pipeline.Export#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getExport()
 * @model annotation="gmf.node label='name' label.text='Export' figure='ellipse'"
 * @generated
 */
public interface Export extends EObject {
	/**
	 * Returns the value of the '<em><b>Generates</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pipeline.File#getComesFrom <em>Comes From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generates</em>' reference.
	 * @see #setGenerates(File)
	 * @see pipeline.PipelinePackage#getExport_Generates()
	 * @see pipeline.File#getComesFrom
	 * @model opposite="comesFrom" required="true"
	 * @generated
	 */
	File getGenerates();

	/**
	 * Sets the value of the '{@link pipeline.Export#getGenerates <em>Generates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generates</em>' reference.
	 * @see #getGenerates()
	 * @generated
	 */
	void setGenerates(File value);

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
	 * @see pipeline.PipelinePackage#getExport_Uses()
	 * @model required="true"
	 * @generated
	 */
	Schema getUses();

	/**
	 * Sets the value of the '{@link pipeline.Export#getUses <em>Uses</em>}' reference.
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
	 * @see pipeline.PipelinePackage#getExport_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pipeline.Export#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Export
