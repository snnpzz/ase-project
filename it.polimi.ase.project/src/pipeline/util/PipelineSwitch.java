/**
 */
package pipeline.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pipeline.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pipeline.PipelinePackage
 * @generated
 */
public class PipelineSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PipelinePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineSwitch() {
		if (modelPackage == null) {
			modelPackage = PipelinePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PipelinePackage.PIPELINE: {
				Pipeline pipeline = (Pipeline)theEObject;
				T result = casePipeline(pipeline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.DATA_FLOW: {
				DataFlow dataFlow = (DataFlow)theEObject;
				T result = caseDataFlow(dataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.INTERNAL_DATA_FLOW: {
				InternalDataFlow internalDataFlow = (InternalDataFlow)theEObject;
				T result = caseInternalDataFlow(internalDataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.COLLECTION_TASK: {
				CollectionTask collectionTask = (CollectionTask)theEObject;
				T result = caseCollectionTask(collectionTask);
				if (result == null) result = caseTask(collectionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.INTEGRATION_TASK: {
				IntegrationTask integrationTask = (IntegrationTask)theEObject;
				T result = caseIntegrationTask(integrationTask);
				if (result == null) result = caseTask(integrationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.CLEANING_TASK: {
				CleaningTask cleaningTask = (CleaningTask)theEObject;
				T result = caseCleaningTask(cleaningTask);
				if (result == null) result = caseTask(cleaningTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.ANALYSIS_TASK: {
				AnalysisTask analysisTask = (AnalysisTask)theEObject;
				T result = caseAnalysisTask(analysisTask);
				if (result == null) result = caseTask(analysisTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.VISUALIZATION_TASK: {
				VisualizationTask visualizationTask = (VisualizationTask)theEObject;
				T result = caseVisualizationTask(visualizationTask);
				if (result == null) result = caseTask(visualizationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.EXPORT_TASK: {
				ExportTask exportTask = (ExportTask)theEObject;
				T result = caseExportTask(exportTask);
				if (result == null) result = caseTask(exportTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.IMPORT_OPERATION: {
				ImportOperation importOperation = (ImportOperation)theEObject;
				T result = caseImportOperation(importOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.EXPORT_OPERATION: {
				ExportOperation exportOperation = (ExportOperation)theEObject;
				T result = caseExportOperation(exportOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.USER_DEFINED_CLEANING_OPERATION: {
				UserDefinedCleaningOperation userDefinedCleaningOperation = (UserDefinedCleaningOperation)theEObject;
				T result = caseUserDefinedCleaningOperation(userDefinedCleaningOperation);
				if (result == null) result = caseCleaningOperation(userDefinedCleaningOperation);
				if (result == null) result = caseOperation(userDefinedCleaningOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.SOURCE: {
				Source source = (Source)theEObject;
				T result = caseSource(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.CHART: {
				Chart chart = (Chart)theEObject;
				T result = caseChart(chart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.CLEANING_OPERATION: {
				CleaningOperation cleaningOperation = (CleaningOperation)theEObject;
				T result = caseCleaningOperation(cleaningOperation);
				if (result == null) result = caseOperation(cleaningOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.ANALYSIS_OPERATION: {
				AnalysisOperation analysisOperation = (AnalysisOperation)theEObject;
				T result = caseAnalysisOperation(analysisOperation);
				if (result == null) result = caseOperation(analysisOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.DESCRIPTIVE_ANALYSIS_OPERATION: {
				DescriptiveAnalysisOperation descriptiveAnalysisOperation = (DescriptiveAnalysisOperation)theEObject;
				T result = caseDescriptiveAnalysisOperation(descriptiveAnalysisOperation);
				if (result == null) result = caseAnalysisOperation(descriptiveAnalysisOperation);
				if (result == null) result = caseOperation(descriptiveAnalysisOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.CLASSIFICATION_ANALYSIS_OPERATION: {
				ClassificationAnalysisOperation classificationAnalysisOperation = (ClassificationAnalysisOperation)theEObject;
				T result = caseClassificationAnalysisOperation(classificationAnalysisOperation);
				if (result == null) result = caseAnalysisOperation(classificationAnalysisOperation);
				if (result == null) result = caseOperation(classificationAnalysisOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.PREDICTIVE_ANALYSIS_OPERATION: {
				PredictiveAnalysisOperation predictiveAnalysisOperation = (PredictiveAnalysisOperation)theEObject;
				T result = casePredictiveAnalysisOperation(predictiveAnalysisOperation);
				if (result == null) result = caseAnalysisOperation(predictiveAnalysisOperation);
				if (result == null) result = caseOperation(predictiveAnalysisOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.CLUSTERING_ANALYSIS_OPERATION: {
				ClusteringAnalysisOperation clusteringAnalysisOperation = (ClusteringAnalysisOperation)theEObject;
				T result = caseClusteringAnalysisOperation(clusteringAnalysisOperation);
				if (result == null) result = caseAnalysisOperation(clusteringAnalysisOperation);
				if (result == null) result = caseOperation(clusteringAnalysisOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.PREDEFINED_CLEANING_OPERATION: {
				PredefinedCleaningOperation predefinedCleaningOperation = (PredefinedCleaningOperation)theEObject;
				T result = casePredefinedCleaningOperation(predefinedCleaningOperation);
				if (result == null) result = caseCleaningOperation(predefinedCleaningOperation);
				if (result == null) result = caseOperation(predefinedCleaningOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.SIMPLE_ATTRIBUTE: {
				SimpleAttribute simpleAttribute = (SimpleAttribute)theEObject;
				T result = caseSimpleAttribute(simpleAttribute);
				if (result == null) result = caseAttribute(simpleAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.COMPLEX_ATTRIBUTE: {
				ComplexAttribute complexAttribute = (ComplexAttribute)theEObject;
				T result = caseComplexAttribute(complexAttribute);
				if (result == null) result = caseAttribute(complexAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PipelinePackage.VISUALIZATION_OPERATION: {
				VisualizationOperation visualizationOperation = (VisualizationOperation)theEObject;
				T result = caseVisualizationOperation(visualizationOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipeline(Pipeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalDataFlow(InternalDataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionTask(CollectionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integration Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integration Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegrationTask(IntegrationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cleaning Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cleaning Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCleaningTask(CleaningTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisTask(AnalysisTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualization Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualization Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualizationTask(VisualizationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportTask(ExportTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportOperation(ImportOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportOperation(ExportOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Cleaning Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Cleaning Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedCleaningOperation(UserDefinedCleaningOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChart(Chart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cleaning Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cleaning Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCleaningOperation(CleaningOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisOperation(AnalysisOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptive Analysis Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptive Analysis Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptiveAnalysisOperation(DescriptiveAnalysisOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classification Analysis Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classification Analysis Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassificationAnalysisOperation(ClassificationAnalysisOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predictive Analysis Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predictive Analysis Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredictiveAnalysisOperation(PredictiveAnalysisOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clustering Analysis Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clustering Analysis Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClusteringAnalysisOperation(ClusteringAnalysisOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predefined Cleaning Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predefined Cleaning Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredefinedCleaningOperation(PredefinedCleaningOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleAttribute(SimpleAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexAttribute(ComplexAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualization Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualization Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualizationOperation(VisualizationOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PipelineSwitch
