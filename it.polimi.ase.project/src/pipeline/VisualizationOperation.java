/**
 */
package pipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.VisualizationOperation#getCharts <em>Charts</em>}</li>
 *   <li>{@link pipeline.VisualizationOperation#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getVisualizationOperation()
 * @model
 * @generated
 */
public interface VisualizationOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Charts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charts</em>' reference.
	 * @see #setCharts(Chart)
	 * @see pipeline.PipelinePackage#getVisualizationOperation_Charts()
	 * @model required="true"
	 * @generated
	 */
	Chart getCharts();

	/**
	 * Sets the value of the '{@link pipeline.VisualizationOperation#getCharts <em>Charts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charts</em>' reference.
	 * @see #getCharts()
	 * @generated
	 */
	void setCharts(Chart value);

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
	 * @see pipeline.PipelinePackage#getVisualizationOperation_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link pipeline.VisualizationOperation#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // VisualizationOperation
