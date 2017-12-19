/**
 */
package ASE_Project.tests;

import ASE_Project.ASE_ProjectFactory;
import ASE_Project.Predictive;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Predictive</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PredictiveTest extends AnalysisOpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PredictiveTest.class);
	}

	/**
	 * Constructs a new Predictive test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictiveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Predictive test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Predictive getFixture() {
		return (Predictive)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ASE_ProjectFactory.eINSTANCE.createPredictive());
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

} //PredictiveTest
