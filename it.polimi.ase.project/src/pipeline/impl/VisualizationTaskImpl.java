/**
 */
package pipeline.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pipeline.Chart;
import pipeline.ChartType;
import pipeline.PipelinePackage;
import pipeline.Size;
import pipeline.VisualizationTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.VisualizationTaskImpl#getCharts <em>Charts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationTaskImpl extends TaskImpl implements VisualizationTask {
	/**
	 * The cached value of the '{@link #getCharts() <em>Charts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharts()
	 * @generated
	 * @ordered
	 */
	protected EList<Chart> charts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.VISUALIZATION_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chart> getCharts() {
		if (charts == null) {
			charts = new EObjectResolvingEList<Chart>(Chart.class, this, PipelinePackage.VISUALIZATION_TASK__CHARTS);
		}
		return charts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.VISUALIZATION_TASK__CHARTS:
				return getCharts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PipelinePackage.VISUALIZATION_TASK__CHARTS:
				getCharts().clear();
				getCharts().addAll((Collection<? extends Chart>)newValue);
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
			case PipelinePackage.VISUALIZATION_TASK__CHARTS:
				getCharts().clear();
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
			case PipelinePackage.VISUALIZATION_TASK__CHARTS:
				return charts != null && !charts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VisualizationTaskImpl
