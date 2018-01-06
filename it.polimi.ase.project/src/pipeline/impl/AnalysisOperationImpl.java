/**
 */
package pipeline.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link pipeline.impl.AnalysisOperationImpl#getOutputAttributes <em>Output Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnalysisOperationImpl extends OperationImpl implements AnalysisOperation {
	/**
	 * The cached value of the '{@link #getOutputAttributes() <em>Output Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleAttribute> outputAttributes;

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
	public EList<SimpleAttribute> getOutputAttributes() {
		if (outputAttributes == null) {
			outputAttributes = new EObjectResolvingEList<SimpleAttribute>(SimpleAttribute.class, this, PipelinePackage.ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES);
		}
		return outputAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES:
				return getOutputAttributes();
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
			case PipelinePackage.ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES:
				getOutputAttributes().clear();
				getOutputAttributes().addAll((Collection<? extends SimpleAttribute>)newValue);
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
			case PipelinePackage.ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES:
				getOutputAttributes().clear();
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
			case PipelinePackage.ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES:
				return outputAttributes != null && !outputAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnalysisOperationImpl
