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

import pipeline.CollectionTask;
import pipeline.Import;
import pipeline.ImportOperation;
import pipeline.PipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.CollectionTaskImpl#getImportOperations <em>Import Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionTaskImpl extends TaskImpl implements CollectionTask {
	/**
	 * The cached value of the '{@link #getImportOperations() <em>Import Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportOperation> importOperations;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.COLLECTION_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportOperation> getImportOperations() {
		if (importOperations == null) {
			importOperations = new EObjectContainmentEList<ImportOperation>(ImportOperation.class, this, PipelinePackage.COLLECTION_TASK__IMPORT_OPERATIONS);
		}
		return importOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.COLLECTION_TASK__IMPORT_OPERATIONS:
				return ((InternalEList<?>)getImportOperations()).basicRemove(otherEnd, msgs);
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
			case PipelinePackage.COLLECTION_TASK__IMPORT_OPERATIONS:
				return getImportOperations();
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
			case PipelinePackage.COLLECTION_TASK__IMPORT_OPERATIONS:
				getImportOperations().clear();
				getImportOperations().addAll((Collection<? extends ImportOperation>)newValue);
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
			case PipelinePackage.COLLECTION_TASK__IMPORT_OPERATIONS:
				getImportOperations().clear();
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
			case PipelinePackage.COLLECTION_TASK__IMPORT_OPERATIONS:
				return importOperations != null && !importOperations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollectionTaskImpl
