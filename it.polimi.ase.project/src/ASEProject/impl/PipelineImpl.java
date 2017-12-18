/**
 */
package ASEProject.impl;

import ASEProject.ASEProjectPackage;
import ASEProject.Dataflow;
import ASEProject.Pipeline;
import ASEProject.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ASEProject.impl.PipelineImpl#getDataflows <em>Dataflows</em>}</li>
 *   <li>{@link ASEProject.impl.PipelineImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends EObjectImpl implements Pipeline {
	/**
	 * The cached value of the '{@link #getDataflows() <em>Dataflows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataflows()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataflow> dataflows;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASEProjectPackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dataflow> getDataflows() {
		if (dataflows == null) {
			dataflows = new EObjectContainmentEList<Dataflow>(Dataflow.class, this, ASEProjectPackage.PIPELINE__DATAFLOWS);
		}
		return dataflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, ASEProjectPackage.PIPELINE__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASEProjectPackage.PIPELINE__DATAFLOWS:
				return ((InternalEList<?>)getDataflows()).basicRemove(otherEnd, msgs);
			case ASEProjectPackage.PIPELINE__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
			case ASEProjectPackage.PIPELINE__DATAFLOWS:
				return getDataflows();
			case ASEProjectPackage.PIPELINE__TASKS:
				return getTasks();
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
			case ASEProjectPackage.PIPELINE__DATAFLOWS:
				getDataflows().clear();
				getDataflows().addAll((Collection<? extends Dataflow>)newValue);
				return;
			case ASEProjectPackage.PIPELINE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
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
			case ASEProjectPackage.PIPELINE__DATAFLOWS:
				getDataflows().clear();
				return;
			case ASEProjectPackage.PIPELINE__TASKS:
				getTasks().clear();
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
			case ASEProjectPackage.PIPELINE__DATAFLOWS:
				return dataflows != null && !dataflows.isEmpty();
			case ASEProjectPackage.PIPELINE__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PipelineImpl
