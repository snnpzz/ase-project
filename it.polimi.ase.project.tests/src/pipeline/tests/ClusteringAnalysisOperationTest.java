/**
 */
package pipeline.tests;

import junit.textui.TestRunner;

import pipeline.ClusteringAnalysisOperation;
import pipeline.PipelineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clustering Analysis Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClusteringAnalysisOperationTest extends AnalysisOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClusteringAnalysisOperationTest.class);
	}

	/**
	 * Constructs a new Clustering Analysis Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusteringAnalysisOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clustering Analysis Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClusteringAnalysisOperation getFixture() {
		return (ClusteringAnalysisOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PipelineFactory.eINSTANCE.createClusteringAnalysisOperation());
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

} //ClusteringAnalysisOperationTest
