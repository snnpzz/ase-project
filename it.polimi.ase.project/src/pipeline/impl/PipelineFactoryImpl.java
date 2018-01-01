/**
 */
package pipeline.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pipeline.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PipelineFactoryImpl extends EFactoryImpl implements PipelineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PipelineFactory init() {
		try {
			PipelineFactory thePipelineFactory = (PipelineFactory)EPackage.Registry.INSTANCE.getEFactory(PipelinePackage.eNS_URI);
			if (thePipelineFactory != null) {
				return thePipelineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PipelineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PipelinePackage.PIPELINE: return createPipeline();
			case PipelinePackage.DATA_FLOW: return createDataFlow();
			case PipelinePackage.INTERNAL_DATA_FLOW: return createInternalDataFlow();
			case PipelinePackage.SCHEMA: return createSchema();
			case PipelinePackage.COLLECTION_TASK: return createCollectionTask();
			case PipelinePackage.INTEGRATION_TASK: return createIntegrationTask();
			case PipelinePackage.CLEANING_TASK: return createCleaningTask();
			case PipelinePackage.ANALYSIS_TASK: return createAnalysisTask();
			case PipelinePackage.VISUALIZATION_TASK: return createVisualizationTask();
			case PipelinePackage.EXPORT_TASK: return createExportTask();
			case PipelinePackage.IMPORT: return createImport();
			case PipelinePackage.EXPORT: return createExport();
			case PipelinePackage.USER_DEFINED_CLEANING_OPERATION: return createUserDefinedCleaningOperation();
			case PipelinePackage.SOURCE: return createSource();
			case PipelinePackage.FILE: return createFile();
			case PipelinePackage.DESCRIPTIVE: return createDescriptive();
			case PipelinePackage.CLASSIFICATION: return createClassification();
			case PipelinePackage.PREDICTIVE: return createPredictive();
			case PipelinePackage.CLUSTERING: return createClustering();
			case PipelinePackage.PREDEFINED_CLEANING_OPERATION: return createPredefinedCleaningOperation();
			case PipelinePackage.SIMPLE_ATTRIBUTE: return createSimpleAttribute();
			case PipelinePackage.COMPLEX_ATTRIBUTE: return createComplexAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PipelinePackage.FORMAT:
				return createFormatFromString(eDataType, initialValue);
			case PipelinePackage.SIZE:
				return createSizeFromString(eDataType, initialValue);
			case PipelinePackage.PREDEFINED_OPERATION:
				return createPredefinedOperationFromString(eDataType, initialValue);
			case PipelinePackage.CLUSTERING_OPERATION:
				return createClusteringOperationFromString(eDataType, initialValue);
			case PipelinePackage.CLASSIFICATION_OPERATION:
				return createClassificationOperationFromString(eDataType, initialValue);
			case PipelinePackage.PREDICTIVE_OPERATION:
				return createPredictiveOperationFromString(eDataType, initialValue);
			case PipelinePackage.DESCRIPTIVE_OPERATION:
				return createDescriptiveOperationFromString(eDataType, initialValue);
			case PipelinePackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case PipelinePackage.CHART_TYPE:
				return createChartTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PipelinePackage.FORMAT:
				return convertFormatToString(eDataType, instanceValue);
			case PipelinePackage.SIZE:
				return convertSizeToString(eDataType, instanceValue);
			case PipelinePackage.PREDEFINED_OPERATION:
				return convertPredefinedOperationToString(eDataType, instanceValue);
			case PipelinePackage.CLUSTERING_OPERATION:
				return convertClusteringOperationToString(eDataType, instanceValue);
			case PipelinePackage.CLASSIFICATION_OPERATION:
				return convertClassificationOperationToString(eDataType, instanceValue);
			case PipelinePackage.PREDICTIVE_OPERATION:
				return convertPredictiveOperationToString(eDataType, instanceValue);
			case PipelinePackage.DESCRIPTIVE_OPERATION:
				return convertDescriptiveOperationToString(eDataType, instanceValue);
			case PipelinePackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case PipelinePackage.CHART_TYPE:
				return convertChartTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDataFlow createInternalDataFlow() {
		InternalDataFlowImpl internalDataFlow = new InternalDataFlowImpl();
		return internalDataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTask createCollectionTask() {
		CollectionTaskImpl collectionTask = new CollectionTaskImpl();
		return collectionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationTask createIntegrationTask() {
		IntegrationTaskImpl integrationTask = new IntegrationTaskImpl();
		return integrationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CleaningTask createCleaningTask() {
		CleaningTaskImpl cleaningTask = new CleaningTaskImpl();
		return cleaningTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisTask createAnalysisTask() {
		AnalysisTaskImpl analysisTask = new AnalysisTaskImpl();
		return analysisTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationTask createVisualizationTask() {
		VisualizationTaskImpl visualizationTask = new VisualizationTaskImpl();
		return visualizationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportTask createExportTask() {
		ExportTaskImpl exportTask = new ExportTaskImpl();
		return exportTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Export createExport() {
		ExportImpl export = new ExportImpl();
		return export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedCleaningOperation createUserDefinedCleaningOperation() {
		UserDefinedCleaningOperationImpl userDefinedCleaningOperation = new UserDefinedCleaningOperationImpl();
		return userDefinedCleaningOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descriptive createDescriptive() {
		DescriptiveImpl descriptive = new DescriptiveImpl();
		return descriptive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification createClassification() {
		ClassificationImpl classification = new ClassificationImpl();
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predictive createPredictive() {
		PredictiveImpl predictive = new PredictiveImpl();
		return predictive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clustering createClustering() {
		ClusteringImpl clustering = new ClusteringImpl();
		return clustering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedCleaningOperation createPredefinedCleaningOperation() {
		PredefinedCleaningOperationImpl predefinedCleaningOperation = new PredefinedCleaningOperationImpl();
		return predefinedCleaningOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAttribute createSimpleAttribute() {
		SimpleAttributeImpl simpleAttribute = new SimpleAttributeImpl();
		return simpleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexAttribute createComplexAttribute() {
		ComplexAttributeImpl complexAttribute = new ComplexAttributeImpl();
		return complexAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Format createFormatFromString(EDataType eDataType, String initialValue) {
		Format result = Format.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSizeFromString(EDataType eDataType, String initialValue) {
		Size result = Size.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedOperation createPredefinedOperationFromString(EDataType eDataType, String initialValue) {
		PredefinedOperation result = PredefinedOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPredefinedOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusteringOperation createClusteringOperationFromString(EDataType eDataType, String initialValue) {
		ClusteringOperation result = ClusteringOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClusteringOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationOperation createClassificationOperationFromString(EDataType eDataType, String initialValue) {
		ClassificationOperation result = ClassificationOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassificationOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictiveOperation createPredictiveOperationFromString(EDataType eDataType, String initialValue) {
		PredictiveOperation result = PredictiveOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPredictiveOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptiveOperation createDescriptiveOperationFromString(EDataType eDataType, String initialValue) {
		DescriptiveOperation result = DescriptiveOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptiveOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartType createChartTypeFromString(EDataType eDataType, String initialValue) {
		ChartType result = ChartType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChartTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelinePackage getPipelinePackage() {
		return (PipelinePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PipelinePackage getPackage() {
		return PipelinePackage.eINSTANCE;
	}

} //PipelineFactoryImpl
