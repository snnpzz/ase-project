/**
 */
package pipeline.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pipeline.ExportOperation;
import pipeline.PipelineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Export Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExportOperationTest extends TestCase {

	/**
	 * The fixture for this Export Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportOperation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExportOperationTest.class);
	}

	/**
	 * Constructs a new Export Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportOperationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Export Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExportOperation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Export Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportOperation getFixture() {
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
		setFixture(PipelineFactory.eINSTANCE.createExportOperation());
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

} //ExportOperationTest
