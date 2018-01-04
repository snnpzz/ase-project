/**
 */
package pipeline;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pipeline.PipelinePackage
 * @generated
 */
public interface PipelineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PipelineFactory eINSTANCE = pipeline.impl.PipelineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipeline</em>'.
	 * @generated
	 */
	Pipeline createPipeline();

	/**
	 * Returns a new object of class '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * Returns a new object of class '<em>Internal Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Data Flow</em>'.
	 * @generated
	 */
	InternalDataFlow createInternalDataFlow();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	Schema createSchema();

	/**
	 * Returns a new object of class '<em>Collection Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Task</em>'.
	 * @generated
	 */
	CollectionTask createCollectionTask();

	/**
	 * Returns a new object of class '<em>Integration Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integration Task</em>'.
	 * @generated
	 */
	IntegrationTask createIntegrationTask();

	/**
	 * Returns a new object of class '<em>Cleaning Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cleaning Task</em>'.
	 * @generated
	 */
	CleaningTask createCleaningTask();

	/**
	 * Returns a new object of class '<em>Analysis Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Task</em>'.
	 * @generated
	 */
	AnalysisTask createAnalysisTask();

	/**
	 * Returns a new object of class '<em>Visualization Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualization Task</em>'.
	 * @generated
	 */
	VisualizationTask createVisualizationTask();

	/**
	 * Returns a new object of class '<em>Export Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export Task</em>'.
	 * @generated
	 */
	ExportTask createExportTask();

	/**
	 * Returns a new object of class '<em>Import Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Operation</em>'.
	 * @generated
	 */
	ImportOperation createImportOperation();

	/**
	 * Returns a new object of class '<em>Export Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export Operation</em>'.
	 * @generated
	 */
	ExportOperation createExportOperation();

	/**
	 * Returns a new object of class '<em>User Defined Cleaning Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Defined Cleaning Operation</em>'.
	 * @generated
	 */
	UserDefinedCleaningOperation createUserDefinedCleaningOperation();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	Source createSource();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chart</em>'.
	 * @generated
	 */
	Chart createChart();

	/**
	 * Returns a new object of class '<em>Descriptive Analysis Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptive Analysis Operation</em>'.
	 * @generated
	 */
	DescriptiveAnalysisOperation createDescriptiveAnalysisOperation();

	/**
	 * Returns a new object of class '<em>Classification Analysis Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classification Analysis Operation</em>'.
	 * @generated
	 */
	ClassificationAnalysisOperation createClassificationAnalysisOperation();

	/**
	 * Returns a new object of class '<em>Predictive Analysis Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predictive Analysis Operation</em>'.
	 * @generated
	 */
	PredictiveAnalysisOperation createPredictiveAnalysisOperation();

	/**
	 * Returns a new object of class '<em>Clustering Analysis Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clustering Analysis Operation</em>'.
	 * @generated
	 */
	ClusteringAnalysisOperation createClusteringAnalysisOperation();

	/**
	 * Returns a new object of class '<em>Predefined Cleaning Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predefined Cleaning Operation</em>'.
	 * @generated
	 */
	PredefinedCleaningOperation createPredefinedCleaningOperation();

	/**
	 * Returns a new object of class '<em>Simple Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Attribute</em>'.
	 * @generated
	 */
	SimpleAttribute createSimpleAttribute();

	/**
	 * Returns a new object of class '<em>Complex Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Attribute</em>'.
	 * @generated
	 */
	ComplexAttribute createComplexAttribute();

	/**
	 * Returns a new object of class '<em>Visualization Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualization Operation</em>'.
	 * @generated
	 */
	VisualizationOperation createVisualizationOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PipelinePackage getPipelinePackage();

} //PipelineFactory
