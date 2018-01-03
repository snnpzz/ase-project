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
 *   <li>{@link pipeline.impl.VisualizationOperationImpl#getCharts <em>Charts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationOperationImpl extends EObjectImpl implements VisualizationOperation {
	/**
	 * The cached value of the '{@link #getCharts() <em>Charts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharts()
	 * @generated
	 * @ordered
	 */
	protected Chart charts;

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
	public Chart getCharts() {
		if (charts != null && charts.eIsProxy()) {
			InternalEObject oldCharts = (InternalEObject)charts;
			charts = (Chart)eResolveProxy(oldCharts);
			if (charts != oldCharts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelinePackage.VISUALIZATION_OPERATION__CHARTS, oldCharts, charts));
			}
		}
		return charts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart basicGetCharts() {
		return charts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharts(Chart newCharts) {
		Chart oldCharts = charts;
		charts = newCharts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.VISUALIZATION_OPERATION__CHARTS, oldCharts, charts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.VISUALIZATION_OPERATION__CHARTS:
				if (resolve) return getCharts();
				return basicGetCharts();
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
			case PipelinePackage.VISUALIZATION_OPERATION__CHARTS:
				setCharts((Chart)newValue);
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
			case PipelinePackage.VISUALIZATION_OPERATION__CHARTS:
				setCharts((Chart)null);
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
			case PipelinePackage.VISUALIZATION_OPERATION__CHARTS:
				return charts != null;
		}
		return super.eIsSet(featureID);
	}

} //VisualizationOperationImpl
