/**
 */
package pipeline.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pipeline.Chart;
import pipeline.PipelinePackage;
import pipeline.VisualizationOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.VisualizationOperationImpl#getChart <em>Chart</em>}</li>
 *   <li>{@link pipeline.impl.VisualizationOperationImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationOperationImpl extends EObjectImpl implements VisualizationOperation {
	/**
	 * The cached value of the '{@link #getChart() <em>Chart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChart()
	 * @generated
	 * @ordered
	 */
	protected Chart chart;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.VISUALIZATION_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart getChart() {
		if (chart != null && chart.eIsProxy()) {
			InternalEObject oldChart = (InternalEObject)chart;
			chart = (Chart)eResolveProxy(oldChart);
			if (chart != oldChart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelinePackage.VISUALIZATION_OPERATION__CHART, oldChart, chart));
			}
		}
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart basicGetChart() {
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChart(Chart newChart) {
		Chart oldChart = chart;
		chart = newChart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.VISUALIZATION_OPERATION__CHART, oldChart, chart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.VISUALIZATION_OPERATION__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.VISUALIZATION_OPERATION__CHART:
				if (resolve) return getChart();
				return basicGetChart();
			case PipelinePackage.VISUALIZATION_OPERATION__ID:
				return getID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PipelinePackage.VISUALIZATION_OPERATION__CHART:
				setChart((Chart)newValue);
				return;
			case PipelinePackage.VISUALIZATION_OPERATION__ID:
				setID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PipelinePackage.VISUALIZATION_OPERATION__CHART:
				setChart((Chart)null);
				return;
			case PipelinePackage.VISUALIZATION_OPERATION__ID:
				setID(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PipelinePackage.VISUALIZATION_OPERATION__CHART:
				return chart != null;
			case PipelinePackage.VISUALIZATION_OPERATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //VisualizationOperationImpl
