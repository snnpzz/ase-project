/**
 */
package ASEProject.tests;

import ASEProject.ASEProjectFactory;
import ASEProject.Predefined;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Predefined</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PredefinedTest extends CleaningOpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PredefinedTest.class);
	}

	/**
	 * Constructs a new Predefined test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Predefined test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Predefined getFixture() {
		return (Predefined)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ASEProjectFactory.eINSTANCE.createPredefined());
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

} //PredefinedTest
