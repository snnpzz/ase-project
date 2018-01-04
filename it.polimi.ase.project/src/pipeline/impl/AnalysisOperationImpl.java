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
 *
 * @generated
 */
public abstract class AnalysisOperationImpl extends OperationImpl implements AnalysisOperation {
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

} //AnalysisOperationImpl
