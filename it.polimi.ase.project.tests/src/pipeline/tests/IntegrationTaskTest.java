/**
 */
package pipeline.tests;

import junit.textui.TestRunner;

import pipeline.IntegrationTask;
import pipeline.PipelineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integration Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrationTaskTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegrationTaskTest.class);
	}

	/**
	 * Constructs a new Integration Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integration Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegrationTask getFixture() {
		return (IntegrationTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipelineFactory.eINSTANCE.createIntegrationTask());
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

} //IntegrationTaskTest
