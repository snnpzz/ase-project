/**
 */
package pipeline.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pipeline.PipelinePackage;
import pipeline.PredictiveAnalysisOperation;
import pipeline.PredictiveOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predictive Analysis Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.PredictiveAnalysisOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link pipeline.impl.PredictiveAnalysisOperationImpl#getPredictedValue <em>Predicted Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredictiveAnalysisOperationImpl extends AnalysisOperationImpl implements PredictiveAnalysisOperation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final PredictiveOperation NAME_EDEFAULT = PredictiveOperation.SIMPLE_REGRESSION;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected PredictiveOperation name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredictedValue() <em>Predicted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDICTED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredictedValue() <em>Predicted Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictedValue()
	 * @generated
	 * @ordered
	 */
	protected String predictedValue = PREDICTED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredictiveAnalysisOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.PREDICTIVE_ANALYSIS_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictiveOperation getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(PredictiveOperation newName) {
		PredictiveOperation oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PREDICTIVE_ANALYSIS_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPredictedValue() {
		return predictedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredictedValue(String newPredictedValue) {
		String oldPredictedValue = predictedValue;
		predictedValue = newPredictedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PREDICTIVE_ANALYSIS_OPERATION__PREDICTED_VALUE, oldPredictedValue, predictedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.PREDICTIVE_ANALYSIS_OPERATION__NAME:
				return getName();
			case PipelinePackage.PREDICTIVE_ANALYSIS_OPERATION__PREDICTED_VALUE:
				return getPredictedValue();
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
			case PipelinePackage.PREDICTIVE_ANALYSIS_OPERATION__NAME:
				setName((PredictiveOperation)newValue);
				return;
			case PipelinePackage.PREDICTIVE_ANALYSIS_OPERATION__PREDICTED_VALUE:
				setPredictedValue((String)newValue);
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
			case PipelinePackage.PREDICTIVE_ANALYSIS_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PipelinePackage.PREDICTIVE_ANALYSIS_OPERATION__PREDICTED_VALUE:
				setPredictedValue(PREDICTED_VALUE_EDEFAULT);
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
			case PipelinePackage.PREDICTIVE_ANALYSIS_OPERATION__NAME:
				return name != NAME_EDEFAULT;
			case PipelinePackage.PREDICTIVE_ANALYSIS_OPERATION__PREDICTED_VALUE:
				return PREDICTED_VALUE_EDEFAULT == null ? predictedValue != null : !PREDICTED_VALUE_EDEFAULT.equals(predictedValue);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", predictedValue: ");
		result.append(predictedValue);
		result.append(')');
		return result.toString();
	}

} //PredictiveAnalysisOperationImpl
