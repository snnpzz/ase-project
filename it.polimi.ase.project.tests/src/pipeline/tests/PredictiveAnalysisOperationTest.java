/**
 */
package pipeline.tests;

import junit.textui.TestRunner;

import pipeline.PipelineFactory;
import pipeline.PredictiveAnalysisOperation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Predictive Analysis Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PredictiveAnalysisOperationTest extends AnalysisOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PredictiveAnalysisOperationTest.class);
	}

	/**
	 * Constructs a new Predictive Analysis Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictiveAnalysisOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Predictive Analysis Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PredictiveAnalysisOperation getFixture() {
		return (PredictiveAnalysisOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipelineFactory.eINSTANCE.createPredictiveAnalysisOperation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PredictiveAnalysisOperationTest
