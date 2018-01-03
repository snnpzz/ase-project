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
import pipeline.VisualizationOperation;
import pipeline.VisualizationTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.VisualizationTaskImpl#getVisualizationOperations <em>Visualization Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizationTaskImpl extends TaskImpl implements VisualizationTask {
	/**
	 * The cached value of the '{@link #getVisualizationOperations() <em>Visualization Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizationOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<VisualizationOperation> visualizationOperations;
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
	public EList<VisualizationOperation> getVisualizationOperations() {
		if (visualizationOperations == null) {
			visualizationOperations = new EObjectContainmentEList<VisualizationOperation>(VisualizationOperation.class, this, PipelinePackage.VISUALIZATION_TASK__VISUALIZATION_OPERATIONS);
		}
		return visualizationOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.VISUALIZATION_TASK__VISUALIZATION_OPERATIONS:
				return ((InternalEList<?>)getVisualizationOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.VISUALIZATION_TASK__VISUALIZATION_OPERATIONS:
				return getVisualizationOperations();
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
			case PipelinePackage.VISUALIZATION_TASK__VISUALIZATION_OPERATIONS:
				getVisualizationOperations().clear();
				getVisualizationOperations().addAll((Collection<? extends VisualizationOperation>)newValue);
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
			case PipelinePackage.VISUALIZATION_TASK__VISUALIZATION_OPERATIONS:
				getVisualizationOperations().clear();
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
			case PipelinePackage.VISUALIZATION_TASK__VISUALIZATION_OPERATIONS:
				return visualizationOperations != null && !visualizationOperations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VisualizationTaskImpl
