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

import pipeline.CleaningOperation;
import pipeline.CleaningTask;
import pipeline.PipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cleaning Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.CleaningTaskImpl#getCleaningOperations <em>Cleaning Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CleaningTaskImpl extends TaskImpl implements CleaningTask {
	/**
	 * The cached value of the '{@link #getCleaningOperations() <em>Cleaning Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleaningOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<CleaningOperation> cleaningOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CleaningTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.CLEANING_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CleaningOperation> getCleaningOperations() {
		if (cleaningOperations == null) {
			cleaningOperations = new EObjectContainmentEList<CleaningOperation>(CleaningOperation.class, this, PipelinePackage.CLEANING_TASK__CLEANING_OPERATIONS);
		}
		return cleaningOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.CLEANING_TASK__CLEANING_OPERATIONS:
				return ((InternalEList<?>)getCleaningOperations()).basicRemove(otherEnd, msgs);
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
			case PipelinePackage.CLEANING_TASK__CLEANING_OPERATIONS:
				return getCleaningOperations();
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
			case PipelinePackage.CLEANING_TASK__CLEANING_OPERATIONS:
				getCleaningOperations().clear();
				getCleaningOperations().addAll((Collection<? extends CleaningOperation>)newValue);
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
			case PipelinePackage.CLEANING_TASK__CLEANING_OPERATIONS:
				getCleaningOperations().clear();
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
			case PipelinePackage.CLEANING_TASK__CLEANING_OPERATIONS:
				return cleaningOperations != null && !cleaningOperations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CleaningTaskImpl
