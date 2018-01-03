/**
 */
package pipeline.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pipeline.PipelineFactory;
import pipeline.VisualizationOperation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Visualization Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationOperationTest extends TestCase {

	/**
	 * The fixture for this Visualization Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationOperation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VisualizationOperationTest.class);
	}

	/**
	 * Constructs a new Visualization Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationOperationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Visualization Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VisualizationOperation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Visualization Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationOperation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipelineFactory.eINSTANCE.createVisualizationOperation());
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

} //VisualizationOperationTest
