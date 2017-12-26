/**
 */
package pipeline.tests;

import junit.textui.TestRunner;

import pipeline.AnalysisTask;
import pipeline.PipelineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Analysis Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisTaskTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnalysisTaskTest.class);
	}

	/**
	 * Constructs a new Analysis Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Analysis Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AnalysisTask getFixture() {
		return (AnalysisTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipelineFactory.eINSTANCE.createAnalysisTask());
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

} //AnalysisTaskTest
