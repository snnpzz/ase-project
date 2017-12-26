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
			case PipelinePackage.DATAFLOW: return createDataflow();
			case PipelinePackage.INTERNAL_DF: return createInternalDF();
			case PipelinePackage.SCHEMA: return createSchema();
			case PipelinePackage.ATTRIBUTE: return createAttribute();
			case PipelinePackage.COLLECTION_TASK: return createCollectionTask();
			case PipelinePackage.INTEGRATION_TASK: return createIntegrationTask();
			case PipelinePackage.CLEANING_TASK: return createCleaningTask();
			case PipelinePackage.ANALYSIS_TASK: return createAnalysisTask();
			case PipelinePackage.VISUALIZATION_TASK: return createVisualizationTask();
			case PipelinePackage.EXPORT_TASK: return createExportTask();
			case PipelinePackage.IMPORT: return createImport();
			case PipelinePackage.EXPORT: return createExport();
			case PipelinePackage.USER_DEFINED: return createUserDefined();
			case PipelinePackage.SOURCE: return createSource();
			case PipelinePackage.FILE: return createFile();
			case PipelinePackage.DESCRIPTIVE: return createDescriptive();
			case PipelinePackage.CLASSIFICATION: return createClassification();
			case PipelinePackage.PREDICTIVE: return createPredictive();
			case PipelinePackage.CLUSTERING: return createClustering();
			case PipelinePackage.PREDEFINED: return createPredefined();
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
	public Dataflow createDataflow() {
		DataflowImpl dataflow = new DataflowImpl();
		return dataflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalDF createInternalDF() {
		InternalDFImpl internalDF = new InternalDFImpl();
		return internalDF;
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
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
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
	public UserDefined createUserDefined() {
		UserDefinedImpl userDefined = new UserDefinedImpl();
		return userDefined;
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
	public Predefined createPredefined() {
		PredefinedImpl predefined = new PredefinedImpl();
		return predefined;
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
