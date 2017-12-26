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

import pipeline.AnalysisOperation;
import pipeline.AnalysisTask;
import pipeline.PipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.AnalysisTaskImpl#getAnalyzes <em>Analyzes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisTaskImpl extends TaskImpl implements AnalysisTask {
	/**
	 * The cached value of the '{@link #getAnalyzes() <em>Analyzes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyzes()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisOperation> analyzes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.ANALYSIS_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisOperation> getAnalyzes() {
		if (analyzes == null) {
			analyzes = new EObjectContainmentEList<AnalysisOperation>(AnalysisOperation.class, this, PipelinePackage.ANALYSIS_TASK__ANALYZES);
		}
		return analyzes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.ANALYSIS_TASK__ANALYZES:
				return ((InternalEList<?>)getAnalyzes()).basicRemove(otherEnd, msgs);
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
			case PipelinePackage.ANALYSIS_TASK__ANALYZES:
				return getAnalyzes();
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
			case PipelinePackage.ANALYSIS_TASK__ANALYZES:
				getAnalyzes().clear();
				getAnalyzes().addAll((Collection<? extends AnalysisOperation>)newValue);
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
			case PipelinePackage.ANALYSIS_TASK__ANALYZES:
				getAnalyzes().clear();
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
			case PipelinePackage.ANALYSIS_TASK__ANALYZES:
				return analyzes != null && !analyzes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnalysisTaskImpl
