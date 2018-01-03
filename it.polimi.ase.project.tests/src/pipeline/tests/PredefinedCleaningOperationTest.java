/**
 */
package pipeline.tests;

import junit.textui.TestRunner;

import pipeline.PipelineFactory;
import pipeline.PredefinedCleaningOperation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Predefined Cleaning Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PredefinedCleaningOperationTest extends CleaningOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PredefinedCleaningOperationTest.class);
	}

	/**
	 * Constructs a new Predefined Cleaning Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedCleaningOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Predefined Cleaning Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PredefinedCleaningOperation getFixture() {
		return (PredefinedCleaningOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipelineFactory.eINSTANCE.createPredefinedCleaningOperation());
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

} //PredefinedCleaningOperationTest
