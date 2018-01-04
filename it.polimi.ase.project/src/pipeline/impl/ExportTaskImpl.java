/**
 */
package pipeline.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pipeline.ExportOperation;
import pipeline.ExportTask;
import pipeline.PipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.ExportTaskImpl#getExportOperations <em>Export Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportTaskImpl extends TaskImpl implements ExportTask {
	/**
	 * The cached value of the '{@link #getExportOperations() <em>Export Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExportOperation> exportOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.EXPORT_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExportOperation> getExportOperations() {
		if (exportOperations == null) {
			exportOperations = new EObjectContainmentEList<ExportOperation>(ExportOperation.class, this, PipelinePackage.EXPORT_TASK__EXPORT_OPERATIONS);
		}
		return exportOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.EXPORT_TASK__EXPORT_OPERATIONS:
				return ((InternalEList<?>)getExportOperations()).basicRemove(otherEnd, msgs);
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
			case PipelinePackage.EXPORT_TASK__EXPORT_OPERATIONS:
				return getExportOperations();
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
			case PipelinePackage.EXPORT_TASK__EXPORT_OPERATIONS:
				getExportOperations().clear();
				getExportOperations().addAll((Collection<? extends ExportOperation>)newValue);
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
			case PipelinePackage.EXPORT_TASK__EXPORT_OPERATIONS:
				getExportOperations().clear();
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
			case PipelinePackage.EXPORT_TASK__EXPORT_OPERATIONS:
				return exportOperations != null && !exportOperations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExportTaskImpl
