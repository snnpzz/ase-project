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
			public Adapter caseDataflow(Dataflow object) {
				return createDataflowAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseInternalDF(InternalDF object) {
				return createInternalDFAdapter();
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
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseExport(Export object) {
				return createExportAdapter();
			}
			@Override
			public Adapter caseUserDefined(UserDefined object) {
				return createUserDefinedAdapter();
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
			public Adapter caseCleaningOperation(CleaningOperation object) {
				return createCleaningOperationAdapter();
			}
			@Override
			public Adapter caseAnalysisOp(AnalysisOp object) {
				return createAnalysisOpAdapter();
			}
			@Override
			public Adapter caseDescriptive(Descriptive object) {
				return createDescriptiveAdapter();
			}
			@Override
			public Adapter caseClassification(Classification object) {
				return createClassificationAdapter();
			}
			@Override
			public Adapter casePredictive(Predictive object) {
				return createPredictiveAdapter();
			}
			@Override
			public Adapter caseClustering(Clustering object) {
				return createClusteringAdapter();
			}
			@Override
			public Adapter casePredefined(Predefined object) {
				return createPredefinedAdapter();
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
	 * Creates a new adapter for an object of class '{@link pipeline.Dataflow <em>Dataflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Dataflow
	 * @generated
	 */
	public Adapter createDataflowAdapter() {
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
	 * Creates a new adapter for an object of class '{@link pipeline.InternalDF <em>Internal DF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.InternalDF
	 * @generated
	 */
	public Adapter createInternalDFAdapter() {
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
	 * Creates a new adapter for an object of class '{@link pipeline.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Export
	 * @generated
	 */
	public Adapter createExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.UserDefined <em>User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.UserDefined
	 * @generated
	 */
	public Adapter createUserDefinedAdapter() {
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
	 * Creates a new adapter for an object of class '{@link pipeline.AnalysisOp <em>Analysis Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.AnalysisOp
	 * @generated
	 */
	public Adapter createAnalysisOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Descriptive <em>Descriptive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Descriptive
	 * @generated
	 */
	public Adapter createDescriptiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Classification
	 * @generated
	 */
	public Adapter createClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Predictive <em>Predictive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Predictive
	 * @generated
	 */
	public Adapter createPredictiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Clustering <em>Clustering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Clustering
	 * @generated
	 */
	public Adapter createClusteringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pipeline.Predefined <em>Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pipeline.Predefined
	 * @generated
	 */
	public Adapter createPredefinedAdapter() {
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
