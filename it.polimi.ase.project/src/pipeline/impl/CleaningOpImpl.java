/**
 */
package pipeline.impl;

import org.eclipse.emf.ecore.EClass;

import pipeline.CleaningOp;
import pipeline.PipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cleaning Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CleaningOpImpl extends OperationImpl implements CleaningOp {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CleaningOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.CLEANING_OP;
	}

} //CleaningOpImpl
