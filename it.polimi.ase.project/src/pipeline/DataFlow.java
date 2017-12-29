/**
 */
package pipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.DataFlow#getFormat <em>Format</em>}</li>
 *   <li>{@link pipeline.DataFlow#getTarget <em>Target</em>}</li>
 *   <li>{@link pipeline.DataFlow#getSource <em>Source</em>}</li>
 *   <li>{@link pipeline.DataFlow#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getDataFlow()
 * @model annotation="gmf.link source='source' target='target' width='2' target.decoration='closedarrow'"
 * @generated
 */
public interface DataFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link pipeline.Format}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see pipeline.Format
	 * @see #setFormat(Format)
	 * @see pipeline.PipelinePackage#getDataFlow_Format()
	 * @model
	 * @generated
	 */
	Format getFormat();

	/**
	 * Sets the value of the '{@link pipeline.DataFlow#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see pipeline.Format
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(Format value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pipeline.Task#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Task)
	 * @see pipeline.PipelinePackage#getDataFlow_Target()
	 * @see pipeline.Task#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Task getTarget();

	/**
	 * Sets the value of the '{@link pipeline.DataFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Task value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pipeline.Task#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Task)
	 * @see pipeline.PipelinePackage#getDataFlow_Source()
	 * @see pipeline.Task#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	Task getSource();

	/**
	 * Sets the value of the '{@link pipeline.DataFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Task value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' reference.
	 * @see #setSchema(Schema)
	 * @see pipeline.PipelinePackage#getDataFlow_Schema()
	 * @model required="true"
	 *        annotation="gmf.link width='1' target.decoration='arrow' style='dash'"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link pipeline.DataFlow#getSchema <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

} // DataFlow
