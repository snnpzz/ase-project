/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.IntegrationOperation#getID <em>ID</em>}</li>
 *   <li>{@link pipeline.IntegrationOperation#getInputAttributes <em>Input Attributes</em>}</li>
 *   <li>{@link pipeline.IntegrationOperation#getOutputAttribute <em>Output Attribute</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getIntegrationOperation()
 * @model
 * @generated
 */
public interface IntegrationOperation extends EObject {
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
	 * @see pipeline.PipelinePackage#getIntegrationOperation_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link pipeline.IntegrationOperation#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Input Attributes</b></em>' reference list.
	 * The list contents are of type {@link pipeline.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Attributes</em>' reference list.
	 * @see pipeline.PipelinePackage#getIntegrationOperation_InputAttributes()
	 * @model required="true"
	 * @generated
	 */
	EList<Attribute> getInputAttributes();

	/**
	 * Returns the value of the '<em><b>Output Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Attribute</em>' reference.
	 * @see #setOutputAttribute(Attribute)
	 * @see pipeline.PipelinePackage#getIntegrationOperation_OutputAttribute()
	 * @model
	 * @generated
	 */
	Attribute getOutputAttribute();

	/**
	 * Sets the value of the '{@link pipeline.IntegrationOperation#getOutputAttribute <em>Output Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Attribute</em>' reference.
	 * @see #getOutputAttribute()
	 * @generated
	 */
	void setOutputAttribute(Attribute value);

} // IntegrationOperation
