/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.AnalysisOperation#getOutputAttribute <em>Output Attribute</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getAnalysisOperation()
 * @model abstract="true"
 * @generated
 */
public interface AnalysisOperation extends Operation {

	/**
	 * Returns the value of the '<em><b>Output Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Attribute</em>' reference.
	 * @see #setOutputAttribute(SimpleAttribute)
	 * @see pipeline.PipelinePackage#getAnalysisOperation_OutputAttribute()
	 * @model
	 * @generated
	 */
	SimpleAttribute getOutputAttribute();

	/**
	 * Sets the value of the '{@link pipeline.AnalysisOperation#getOutputAttribute <em>Output Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Attribute</em>' reference.
	 * @see #getOutputAttribute()
	 * @generated
	 */
	void setOutputAttribute(SimpleAttribute value);
} // AnalysisOperation
