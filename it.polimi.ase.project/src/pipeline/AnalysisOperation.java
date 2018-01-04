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
 *   <li>{@link pipeline.AnalysisOperation#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getAnalysisOperation()
 * @model abstract="true"
 * @generated
 */
public interface AnalysisOperation extends Operation {

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link pipeline.SimpleAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see pipeline.PipelinePackage#getAnalysisOperation_Attributes()
	 * @model required="true"
	 * @generated
	 */
	EList<SimpleAttribute> getAttributes();
} // AnalysisOperation
