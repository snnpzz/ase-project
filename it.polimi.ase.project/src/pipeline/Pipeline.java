/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.Pipeline#getDataFlows <em>Data Flows</em>}</li>
 *   <li>{@link pipeline.Pipeline#getTasks <em>Tasks</em>}</li>
 *   <li>{@link pipeline.Pipeline#getID <em>ID</em>}</li>
 *   <li>{@link pipeline.Pipeline#getInternalDataFlows <em>Internal Data Flows</em>}</li>
 *   <li>{@link pipeline.Pipeline#getSources <em>Sources</em>}</li>
 *   <li>{@link pipeline.Pipeline#getFiles <em>Files</em>}</li>
 *   <li>{@link pipeline.Pipeline#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Flows</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Flows</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getPipeline_DataFlows()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataFlow> getDataFlows();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getPipeline_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTasks();

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
	 * @see pipeline.PipelinePackage#getPipeline_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link pipeline.Pipeline#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Internal Data Flows</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.InternalDataFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Data Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Data Flows</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getPipeline_InternalDataFlows()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalDataFlow> getInternalDataFlows();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.Source}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getPipeline_Sources()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Source> getSources();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getPipeline_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link pipeline.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see pipeline.PipelinePackage#getPipeline_Operations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Pipeline
