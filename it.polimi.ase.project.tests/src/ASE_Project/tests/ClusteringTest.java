/**
 */
package ASE_Project.tests;

import ASE_Project.ASE_ProjectFactory;
import ASE_Project.Clustering;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clustering</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClusteringTest extends AnalysisOpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClusteringTest.class);
	}

	/**
	 * Constructs a new Clustering test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusteringTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clustering test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Clustering getFixture() {
		return (Clustering)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ASE_ProjectFactory.eINSTANCE.createClustering());
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

} //ClusteringTest
