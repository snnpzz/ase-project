/**
 */
package pipeline.tests;

import junit.textui.TestRunner;

import pipeline.PipelineFactory;
import pipeline.UserDefinedCleaningOperation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Defined Cleaning Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserDefinedCleaningOperationTest extends CleaningOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserDefinedCleaningOperationTest.class);
	}

	/**
	 * Constructs a new User Defined Cleaning Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedCleaningOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User Defined Cleaning Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UserDefinedCleaningOperation getFixture() {
		return (UserDefinedCleaningOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipelineFactory.eINSTANCE.createUserDefinedCleaningOperation());
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

} //UserDefinedCleaningOperationTest
