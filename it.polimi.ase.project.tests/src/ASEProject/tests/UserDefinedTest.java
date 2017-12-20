/**
 */
package ASEProject.tests;

import ASEProject.ASEProjectFactory;
import ASEProject.UserDefined;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Defined</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserDefinedTest extends CleaningOpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserDefinedTest.class);
	}

	/**
	 * Constructs a new User Defined test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User Defined test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UserDefined getFixture() {
		return (UserDefined)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ASEProjectFactory.eINSTANCE.createUserDefined());
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

} //UserDefinedTest
