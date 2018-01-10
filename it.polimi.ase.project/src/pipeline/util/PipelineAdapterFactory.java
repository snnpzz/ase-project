/**
 */
package pipeline.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pipeline.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pipeline.PipelinePackage
 * @generated
 */
public class PipelineAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PipelinePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PipelinePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineSwitch<Adapter> modelSwitch =
		new PipelineSwitch<Adapter>() {
			@Override
			public Adapter casePipeline(Pipeline object) {
				return createPipelineAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseDataFlow(DataFlow object) {
				return createDataFlowAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseInternalDataFlow(InternalDataFlow object) {
				return createInternalDataFlowAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseCollectionTask(CollectionTask object) {
				return createCollectionTaskAdapter();
			}
			@Override
			public Adapter caseIntegrationTask(IntegrationTask object) {
				return createIntegrationTaskAdapter();
			}
			@Override
			public Adapter caseCleaningTask(CleaningTask object) {
				return createCleaningTaskAdapter();
			}
			@Override
			public Adapter caseAnalysisTask(AnalysisTask object) {
				return createAnalysisTaskAdapter();
			}
			@Override
			public Adapter caseVisualizationTask(VisualizationTask object) {
				return createVisualizationTaskAdapter();
			}
			@Override
			public Adapter caseExportTask(ExportTask object) {
				return createExportTaskAdapter();
			}
			@Override
			public Adapter caseImportOperation(ImportOperation object) {
				return createImportOperationAdapter();
			}
			@Override
			public Adapter caseIntegrationOperation(IntegrationOperation object) {
				return createIntegrationOperationAdapter();
			}
			@Override
			public Adapter caseCleaningOperation(CleaningOperation object) {
				return createCleaningOperationAdapter();
			}
			@Override
			public Adapter casePredefinedCleaningOperation(PredefinedCleaningOperation object) {
				return createPredefinedCleaningOperationAdapter();
			}
			@Override
			public Adapter caseUserDefinedCleaningOperation(UserDefinedCleaningOperation object) {
				return createUserDefinedCleaningOperationAdapter();
			}
			@Override
			public Adapter caseAnalysisOperation(AnalysisOperation object) {
				return createAnalysisOperationAdapter();
			}
			@Override
			public Adapter caseClassificationAnalysisOperation(ClassificationAnalysisOperation object) {
				return createClassificationAnalysisOperationAdapter();
			}
			@Override
			public Adapter caseClusteringAnalysisOperation(ClusteringAnalysisOperation object) {
				return createClusteringAnalysisOperationAdapter();
			}
			@Override
			public Adapter caseDescriptiveAnalysisOperation(DescriptiveAnalysisOperation object) {
				return createDescriptiveAnalysisOperationAdapter();
			}
			@Override
			public Adapter casePredictiveAnalysisOperation(PredictiveAnalysisOperation object) {
				return createPredictiveAnalysisOperationAdapter();
			}
			@Override
			public Adapter caseVisualizationOperation(VisualizationOperation object) {
				return createVisualizationOperationAdapter();
			}
			@Override
			public Adapter caseExportOperation(ExportOperation object) {
				return createExportOperationAdapter();
			}
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseChart(Chart object) {
				return createChartAdapter();
			}
			@Override
			public Adapter caseSimpleAttribute(SimpleAttribute object) {
				return createSimpleAttributeAdapter();
			}
			@Override
			public Adapter caseComplexAttribute(ComplexAttribute object) {
				return createComplexAttributeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Pipeline
	 * @generated
	 */
	public Adapter createPipelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.InternalDataFlow <em>Internal Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.InternalDataFlow
	 * @generated
	 */
	public Adapter createInternalDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.CollectionTask <em>Collection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.CollectionTask
	 * @generated
	 */
	public Adapter createCollectionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.IntegrationTask <em>Integration Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.IntegrationTask
	 * @generated
	 */
	public Adapter createIntegrationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.CleaningTask <em>Cleaning Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.CleaningTask
	 * @generated
	 */
	public Adapter createCleaningTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.AnalysisTask <em>Analysis Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.AnalysisTask
	 * @generated
	 */
	public Adapter createAnalysisTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.VisualizationTask <em>Visualization Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.VisualizationTask
	 * @generated
	 */
	public Adapter createVisualizationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.ExportTask <em>Export Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.ExportTask
	 * @generated
	 */
	public Adapter createExportTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.ImportOperation <em>Import Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.ImportOperation
	 * @generated
	 */
	public Adapter createImportOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.ExportOperation <em>Export Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.ExportOperation
	 * @generated
	 */
	public Adapter createExportOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.UserDefinedCleaningOperation <em>User Defined Cleaning Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.UserDefinedCleaningOperation
	 * @generated
	 */
	public Adapter createUserDefinedCleaningOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Chart
	 * @generated
	 */
	public Adapter createChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.CleaningOperation <em>Cleaning Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.CleaningOperation
	 * @generated
	 */
	public Adapter createCleaningOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.AnalysisOperation <em>Analysis Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.AnalysisOperation
	 * @generated
	 */
	public Adapter createAnalysisOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.DescriptiveAnalysisOperation <em>Descriptive Analysis Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.DescriptiveAnalysisOperation
	 * @generated
	 */
	public Adapter createDescriptiveAnalysisOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.ClassificationAnalysisOperation <em>Classification Analysis Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.ClassificationAnalysisOperation
	 * @generated
	 */
	public Adapter createClassificationAnalysisOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.PredictiveAnalysisOperation <em>Predictive Analysis Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.PredictiveAnalysisOperation
	 * @generated
	 */
	public Adapter createPredictiveAnalysisOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.ClusteringAnalysisOperation <em>Clustering Analysis Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.ClusteringAnalysisOperation
	 * @generated
	 */
	public Adapter createClusteringAnalysisOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.PredefinedCleaningOperation <em>Predefined Cleaning Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.PredefinedCleaningOperation
	 * @generated
	 */
	public Adapter createPredefinedCleaningOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.SimpleAttribute <em>Simple Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.SimpleAttribute
	 * @generated
	 */
	public Adapter createSimpleAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.ComplexAttribute <em>Complex Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.ComplexAttribute
	 * @generated
	 */
	public Adapter createComplexAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.VisualizationOperation <em>Visualization Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.VisualizationOperation
	 * @generated
	 */
	public Adapter createVisualizationOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.IntegrationOperation <em>Integration Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.IntegrationOperation
	 * @generated
	 */
	public Adapter createIntegrationOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PipelineAdapterFactory
