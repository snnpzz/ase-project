/**
 */
package ASE_Project.tests;

import ASE_Project.ASE_ProjectFactory;
import ASE_Project.AnalyzesTask;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Analyzes Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalyzesTaskTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnalyzesTaskTest.class);
	}

	/**
	 * Constructs a new Analyzes Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyzesTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Analyzes Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AnalyzesTask getFixture() {
		return (AnalyzesTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ASE_ProjectFactory.eINSTANCE.createAnalyzesTask());
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

} //AnalyzesTaskTest
