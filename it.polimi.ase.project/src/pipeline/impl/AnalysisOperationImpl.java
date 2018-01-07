/**
 */
package pipeline.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import pipeline.AnalysisOperation;
import pipeline.PipelinePackage;
import pipeline.SimpleAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.AnalysisOperationImpl#getOutputAttribute <em>Output Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnalysisOperationImpl extends OperationImpl implements AnalysisOperation {
	/**
	 * The cached value of the '{@link #getOutputAttribute() <em>Output Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputAttribute()
	 * @generated
	 * @ordered
	 */
	protected SimpleAttribute outputAttribute;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.ANALYSIS_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAttribute getOutputAttribute() {
		if (outputAttribute != null && outputAttribute.eIsProxy()) {
			InternalEObject oldOutputAttribute = (InternalEObject)outputAttribute;
			outputAttribute = (SimpleAttribute)eResolveProxy(oldOutputAttribute);
			if (outputAttribute != oldOutputAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelinePackage.ANALYSIS_OPERATION__OUTPUT_ATTRIBUTE, oldOutputAttribute, outputAttribute));
			}
		}
		return outputAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAttribute basicGetOutputAttribute() {
		return outputAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputAttribute(SimpleAttribute newOutputAttribute) {
		SimpleAttribute oldOutputAttribute = outputAttribute;
		outputAttribute = newOutputAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.ANALYSIS_OPERATION__OUTPUT_ATTRIBUTE, oldOutputAttribute, outputAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.ANALYSIS_OPERATION__OUTPUT_ATTRIBUTE:
				if (resolve) return getOutputAttribute();
				return basicGetOutputAttribute();
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
			case PipelinePackage.ANALYSIS_OPERATION__OUTPUT_ATTRIBUTE:
				setOutputAttribute((SimpleAttribute)newValue);
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
			case PipelinePackage.ANALYSIS_OPERATION__OUTPUT_ATTRIBUTE:
				setOutputAttribute((SimpleAttribute)null);
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
			case PipelinePackage.ANALYSIS_OPERATION__OUTPUT_ATTRIBUTE:
				return outputAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalysisOperationImpl
