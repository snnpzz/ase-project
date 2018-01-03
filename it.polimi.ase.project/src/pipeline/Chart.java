/**
 */
package pipeline;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pipeline.Chart#getSize <em>Size</em>}</li>
 *   <li>{@link pipeline.Chart#getTitle <em>Title</em>}</li>
 *   <li>{@link pipeline.Chart#getType <em>Type</em>}</li>
 *   <li>{@link pipeline.Chart#getAxes <em>Axes</em>}</li>
 * </ul>
 *
 * @see pipeline.PipelinePackage#getChart()
 * @model annotation="gmf.node label='title' figure='rounded'"
 * @generated
 */
public interface Chart extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see pipeline.PipelinePackage#getChart_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link pipeline.Chart#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pipeline.ChartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see pipeline.ChartType
	 * @see #setType(ChartType)
	 * @see pipeline.PipelinePackage#getChart_Type()
	 * @model
	 * @generated
	 */
	ChartType getType();

	/**
	 * Sets the value of the '{@link pipeline.Chart#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see pipeline.ChartType
	 * @see #getType()
	 * @generated
	 */
	void setType(ChartType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link pipeline.Size}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see pipeline.Size
	 * @see #setSize(Size)
	 * @see pipeline.PipelinePackage#getChart_Size()
	 * @model
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link pipeline.Chart#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see pipeline.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Returns the value of the '<em><b>Axes</b></em>' reference list.
	 * The list contents are of type {@link pipeline.SimpleAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axes</em>' reference list.
	 * @see pipeline.PipelinePackage#getChart_Axes()
	 * @model required="true"
	 *        annotation="gmf.link width='1' target.decoration='closedarrow'"
	 * @generated
	 */
	EList<SimpleAttribute> getAxes();

} // Chart
