/**
 */
package pipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.ExportOperation#getWrite <em>Write</em>}</li>
 *   <li>{@link pipeline.ExportOperation#getExpUses <em>Exp Uses</em>}</li>
 *   <li>{@link pipeline.ExportOperation#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getExportOperation()
 * @model annotation="gmf.node label='ID' label.text='Export' figure='ellipse'"
 * @generated
 */
public interface ExportOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Write</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pipeline.File#getComesFrom <em>Comes From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write</em>' reference.
	 * @see #setWrite(File)
	 * @see pipeline.PipelinePackage#getExportOperation_Write()
	 * @see pipeline.File#getComesFrom
	 * @model opposite="comesFrom" required="true"
	 *        annotation="gmf.link width='2' target.decoration='filledsquare' style='dash'"
	 * @generated
	 */
	File getWrite();

	/**
	 * Sets the value of the '{@link pipeline.ExportOperation#getWrite <em>Write</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write</em>' reference.
	 * @see #getWrite()
	 * @generated
	 */
	void setWrite(File value);

	/**
	 * Returns the value of the '<em><b>Exp Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp Uses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp Uses</em>' reference.
	 * @see #setExpUses(Schema)
	 * @see pipeline.PipelinePackage#getExportOperation_ExpUses()
	 * @model required="true"
	 *        annotation="gmf.link width='1' target.decoration='arrow'"
	 * @generated
	 */
	Schema getExpUses();

	/**
	 * Sets the value of the '{@link pipeline.ExportOperation#getExpUses <em>Exp Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Uses</em>' reference.
	 * @see #getExpUses()
	 * @generated
	 */
	void setExpUses(Schema value);

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
	 * @see pipeline.PipelinePackage#getExportOperation_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link pipeline.ExportOperation#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // ExportOperation
