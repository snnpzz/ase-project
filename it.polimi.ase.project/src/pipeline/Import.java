/**
 */
package pipeline;

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
 *   <li>{@link pipeline.Import#getRead <em>Read</em>}</li>
 *   <li>{@link pipeline.Import#getImpUses <em>Imp Uses</em>}</li>
 *   <li>{@link pipeline.Import#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getImport()
 * @model annotation="gmf.node label='name' label.text='Import' figure='ellipse'"
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Read</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pipeline.Source#getLinkedTo <em>Linked To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read</em>' reference.
	 * @see #setRead(Source)
	 * @see pipeline.PipelinePackage#getImport_Read()
	 * @see pipeline.Source#getLinkedTo
	 * @model opposite="linkedTo" required="true"
	 *        annotation="gmf.link width='2' target.decoration='square' style='dash'"
	 * @generated
	 */
	Source getRead();

	/**
	 * Sets the value of the '{@link pipeline.Import#getRead <em>Read</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read</em>' reference.
	 * @see #getRead()
	 * @generated
	 */
	void setRead(Source value);

	/**
	 * Returns the value of the '<em><b>Imp Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imp Uses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imp Uses</em>' reference.
	 * @see #setImpUses(Schema)
	 * @see pipeline.PipelinePackage#getImport_ImpUses()
	 * @model required="true"
	 *        annotation="gmf.link width='1' target.decoration='arrow'"
	 * @generated
	 */
	Schema getImpUses();

	/**
	 * Sets the value of the '{@link pipeline.Import#getImpUses <em>Imp Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imp Uses</em>' reference.
	 * @see #getImpUses()
	 * @generated
	 */
	void setImpUses(Schema value);

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
	 * @see pipeline.PipelinePackage#getImport_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pipeline.Import#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Import
