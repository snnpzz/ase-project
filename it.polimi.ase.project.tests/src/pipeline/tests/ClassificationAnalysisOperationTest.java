/**
 */
package pipeline.tests;

import junit.textui.TestRunner;

import pipeline.ClassificationAnalysisOperation;
import pipeline.PipelineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Classification Analysis Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassificationAnalysisOperationTest extends AnalysisOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassificationAnalysisOperationTest.class);
	}

	/**
	 * Constructs a new Classification Analysis Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationAnalysisOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Classification Analysis Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClassificationAnalysisOperation getFixture() {
		return (ClassificationAnalysisOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipelineFactory.eINSTANCE.createClassificationAnalysisOperation());
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

} //ClassificationAnalysisOperationTest
