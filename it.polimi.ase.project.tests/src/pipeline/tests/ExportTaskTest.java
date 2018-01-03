/**
 */
package pipeline.tests;

import junit.textui.TestRunner;

import pipeline.ExportTask;
import pipeline.PipelineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Export Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExportTaskTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExportTaskTest.class);
	}

	/**
	 * Constructs a new Export Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Export Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExportTask getFixture() {
		return (ExportTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipelineFactory.eINSTANCE.createExportTask());
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

} //ExportTaskTest
