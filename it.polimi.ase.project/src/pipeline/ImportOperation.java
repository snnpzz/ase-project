/**
 */
package pipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.ImportOperation#getID <em>ID</em>}</li>
 *   <li>{@link pipeline.ImportOperation#getRead <em>Read</em>}</li>
 *   <li>{@link pipeline.ImportOperation#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getImportOperation()
 * @model annotation="gmf.node label='ID' label.text='Import' figure='ellipse'"
 * @generated
 */
public interface ImportOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Read</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read</em>' reference.
	 * @see #setRead(Source)
	 * @see pipeline.PipelinePackage#getImportOperation_Read()
	 * @model required="true"
	 *        annotation="gmf.link width='2' target.decoration='square' style='dash'"
	 * @generated
	 */
	Source getRead();

	/**
	 * Sets the value of the '{@link pipeline.ImportOperation#getRead <em>Read</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read</em>' reference.
	 * @see #getRead()
	 * @generated
	 */
	void setRead(Source value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference.
	 * @see #setUse(Schema)
	 * @see pipeline.PipelinePackage#getImportOperation_Use()
	 * @model required="true"
	 *        annotation="gmf.link width='1' target.decoration='arrow'"
	 * @generated
	 */
	Schema getUse();

	/**
	 * Sets the value of the '{@link pipeline.ImportOperation#getUse <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Schema value);

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
	 * @see pipeline.PipelinePackage#getImportOperation_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link pipeline.ImportOperation#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // ImportOperation
