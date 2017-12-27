/**
 */
package pipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.InternalDataFlow#getFormat <em>Format</em>}</li>
 *   <li>{@link pipeline.InternalDataFlow#getSchema <em>Schema</em>}</li>
 *   <li>{@link pipeline.InternalDataFlow#getSource <em>Source</em>}</li>
 *   <li>{@link pipeline.InternalDataFlow#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getInternalDataFlow()
 * @model annotation="gmf.link source='source' target='target' width='2' target.decoration='arrow' style='dash'"
 * @generated
 */
public interface InternalDataFlow extends EObject {
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
	 * @see pipeline.PipelinePackage#getInternalDataFlow_Format()
	 * @model
	 * @generated
	 */
	Format getFormat();

	/**
	 * Sets the value of the '{@link pipeline.InternalDataFlow#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see pipeline.Format
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
	 * @see pipeline.PipelinePackage#getInternalDataFlow_Schema()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link pipeline.InternalDataFlow#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pipeline.Operation#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Operation)
	 * @see pipeline.PipelinePackage#getInternalDataFlow_Source()
	 * @see pipeline.Operation#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	Operation getSource();

	/**
	 * Sets the value of the '{@link pipeline.InternalDataFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Operation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pipeline.Operation#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Operation)
	 * @see pipeline.PipelinePackage#getInternalDataFlow_Target()
	 * @see pipeline.Operation#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Operation getTarget();

	/**
	 * Sets the value of the '{@link pipeline.InternalDataFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Operation value);

} // InternalDataFlow