/**
 */
package ASE_Project.tests;

import ASE_Project.ASE_ProjectFactory;
import ASE_Project.ExportingTask;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exporting Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExportingTaskTest extends TaskTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExportingTaskTest.class);
	}

	/**
	 * Constructs a new Exporting Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportingTaskTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exporting Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExportingTask getFixture() {
		return (ExportingTask)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ASE_ProjectFactory.eINSTANCE.createExportingTask());
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

} //ExportingTaskTest
