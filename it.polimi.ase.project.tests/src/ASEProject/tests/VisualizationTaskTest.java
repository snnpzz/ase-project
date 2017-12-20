/**
 */
package ASEProject.tests;

import ASEProject.ASEProjectFactory;
import ASEProject.VisualizationTask;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Visualization Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationTaskTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VisualizationTaskTest.class);
	}

	/**
	 * Constructs a new Visualization Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Visualization Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VisualizationTask getFixture() {
		return (VisualizationTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ASEProjectFactory.eINSTANCE.createVisualizationTask());
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

} //VisualizationTaskTest
