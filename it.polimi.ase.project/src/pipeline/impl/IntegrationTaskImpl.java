/**
 */
package pipeline.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import pipeline.Attribute;
import pipeline.IntegrationOperation;
import pipeline.IntegrationTask;
import pipeline.PipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.IntegrationTaskImpl#getIntegrationOperations <em>Integration Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrationTaskImpl extends TaskImpl implements IntegrationTask {
	/**
	 * The cached value of the '{@link #getIntegrationOperations() <em>Integration Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrationOperation> integrationOperations;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.INTEGRATION_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrationOperation> getIntegrationOperations() {
		if (integrationOperations == null) {
			integrationOperations = new EObjectContainmentEList<IntegrationOperation>(IntegrationOperation.class, this, PipelinePackage.INTEGRATION_TASK__INTEGRATION_OPERATIONS);
		}
		return integrationOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.INTEGRATION_TASK__INTEGRATION_OPERATIONS:
				return ((InternalEList<?>)getIntegrationOperations()).basicRemove(otherEnd, msgs);
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
			case PipelinePackage.INTEGRATION_TASK__INTEGRATION_OPERATIONS:
				return getIntegrationOperations();
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
			case PipelinePackage.INTEGRATION_TASK__INTEGRATION_OPERATIONS:
				getIntegrationOperations().clear();
				getIntegrationOperations().addAll((Collection<? extends IntegrationOperation>)newValue);
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
			case PipelinePackage.INTEGRATION_TASK__INTEGRATION_OPERATIONS:
				getIntegrationOperations().clear();
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
			case PipelinePackage.INTEGRATION_TASK__INTEGRATION_OPERATIONS:
				return integrationOperations != null && !integrationOperations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntegrationTaskImpl
