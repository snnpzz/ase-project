/**
 */
package pipeline.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pipeline.AnalysisOperation;
import pipeline.AnalysisTask;
import pipeline.Attribute;
import pipeline.Classification;
import pipeline.CleaningOperation;
import pipeline.CleaningTask;
import pipeline.Clustering;
import pipeline.CollectionTask;
import pipeline.Dataflow;
import pipeline.Descriptive;
import pipeline.Export;
import pipeline.ExportTask;
import pipeline.File;
import pipeline.Format;
import pipeline.Import;
import pipeline.IntegrationTask;
import pipeline.InternalDF;
import pipeline.Operation;
import pipeline.Pipeline;
import pipeline.PipelineFactory;
import pipeline.PipelinePackage;
import pipeline.Predefined;
import pipeline.Predictive;
import pipeline.Schema;
import pipeline.Source;
import pipeline.Task;
import pipeline.UserDefined;
import pipeline.VisualizationTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PipelinePackageImpl extends EPackageImpl implements PipelinePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalDFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integrationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cleaningTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cleaningOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predictiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusteringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pipeline.PipelinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PipelinePackageImpl() {
		super(eNS_URI, PipelineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PipelinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PipelinePackage init() {
		if (isInited) return (PipelinePackage)EPackage.Registry.INSTANCE.getEPackage(PipelinePackage.eNS_URI);

		// Obtain or create and register package
		PipelinePackageImpl thePipelinePackage = (PipelinePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PipelinePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PipelinePackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePipelinePackage.createPackageContents();

		// Initialize created meta-data
		thePipelinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePipelinePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PipelinePackage.eNS_URI, thePipelinePackage);
		return thePipelinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPipeline() {
		return pipelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeline_Dataflows() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeline_Tasks() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPipeline_ID() {
		return (EAttribute)pipelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_ID() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_IsRequired() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Incoming() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Outgoing() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataflow() {
		return dataflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataflow_Format() {
		return (EAttribute)dataflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataflow_Schema() {
		return (EReference)dataflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataflow_Target() {
		return (EReference)dataflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataflow_Source() {
		return (EReference)dataflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Incoming() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Outgoing() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalDF() {
		return internalDFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalDF_Format() {
		return (EAttribute)internalDFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalDF_Schema() {
		return (EReference)internalDFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalDF_Source() {
		return (EReference)internalDFEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalDF_Target() {
		return (EReference)internalDFEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Attributes() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Next() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Attributes() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Previous() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionTask() {
		return collectionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionTask_Imports() {
		return (EReference)collectionTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegrationTask() {
		return integrationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCleaningTask() {
		return cleaningTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCleaningTask_Operations() {
		return (EReference)cleaningTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisTask() {
		return analysisTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisTask_Analyzes() {
		return (EReference)analysisTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualizationTask() {
		return visualizationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportTask() {
		return exportTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExportTask_Exports() {
		return (EReference)exportTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_ReadsFrom() {
		return (EReference)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_Uses() {
		return (EReference)importEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Name() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExport() {
		return exportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExport_Generates() {
		return (EReference)exportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExport_Uses() {
		return (EReference)exportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExport_Name() {
		return (EAttribute)exportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefined() {
		return userDefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_LinkedTo() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Name() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Path() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Name() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Path() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_ComesFrom() {
		return (EReference)fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCleaningOperation() {
		return cleaningOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisOperation() {
		return analysisOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptive() {
		return descriptiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassification() {
		return classificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredictive() {
		return predictiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClustering() {
		return clusteringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredefined() {
		return predefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormat() {
		return formatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineFactory getPipelineFactory() {
		return (PipelineFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pipelineEClass = createEClass(PIPELINE);
		createEReference(pipelineEClass, PIPELINE__DATAFLOWS);
		createEReference(pipelineEClass, PIPELINE__TASKS);
		createEAttribute(pipelineEClass, PIPELINE__ID);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__ID);
		createEAttribute(taskEClass, TASK__IS_REQUIRED);
		createEReference(taskEClass, TASK__INCOMING);
		createEReference(taskEClass, TASK__OUTGOING);

		dataflowEClass = createEClass(DATAFLOW);
		createEAttribute(dataflowEClass, DATAFLOW__FORMAT);
		createEReference(dataflowEClass, DATAFLOW__SCHEMA);
		createEReference(dataflowEClass, DATAFLOW__TARGET);
		createEReference(dataflowEClass, DATAFLOW__SOURCE);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__NAME);
		createEReference(operationEClass, OPERATION__INCOMING);
		createEReference(operationEClass, OPERATION__OUTGOING);

		internalDFEClass = createEClass(INTERNAL_DF);
		createEAttribute(internalDFEClass, INTERNAL_DF__FORMAT);
		createEReference(internalDFEClass, INTERNAL_DF__SCHEMA);
		createEReference(internalDFEClass, INTERNAL_DF__SOURCE);
		createEReference(internalDFEClass, INTERNAL_DF__TARGET);

		schemaEClass = createEClass(SCHEMA);
		createEReference(schemaEClass, SCHEMA__ATTRIBUTES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
		createEReference(attributeEClass, ATTRIBUTE__NEXT);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTES);
		createEReference(attributeEClass, ATTRIBUTE__PREVIOUS);

		collectionTaskEClass = createEClass(COLLECTION_TASK);
		createEReference(collectionTaskEClass, COLLECTION_TASK__IMPORTS);

		integrationTaskEClass = createEClass(INTEGRATION_TASK);

		cleaningTaskEClass = createEClass(CLEANING_TASK);
		createEReference(cleaningTaskEClass, CLEANING_TASK__OPERATIONS);

		analysisTaskEClass = createEClass(ANALYSIS_TASK);
		createEReference(analysisTaskEClass, ANALYSIS_TASK__ANALYZES);

		visualizationTaskEClass = createEClass(VISUALIZATION_TASK);

		exportTaskEClass = createEClass(EXPORT_TASK);
		createEReference(exportTaskEClass, EXPORT_TASK__EXPORTS);

		importEClass = createEClass(IMPORT);
		createEReference(importEClass, IMPORT__READS_FROM);
		createEReference(importEClass, IMPORT__USES);
		createEAttribute(importEClass, IMPORT__NAME);

		exportEClass = createEClass(EXPORT);
		createEReference(exportEClass, EXPORT__GENERATES);
		createEReference(exportEClass, EXPORT__USES);
		createEAttribute(exportEClass, EXPORT__NAME);

		userDefinedEClass = createEClass(USER_DEFINED);

		sourceEClass = createEClass(SOURCE);
		createEReference(sourceEClass, SOURCE__LINKED_TO);
		createEAttribute(sourceEClass, SOURCE__NAME);
		createEAttribute(sourceEClass, SOURCE__PATH);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__NAME);
		createEAttribute(fileEClass, FILE__PATH);
		createEReference(fileEClass, FILE__COMES_FROM);

		cleaningOperationEClass = createEClass(CLEANING_OPERATION);

		analysisOperationEClass = createEClass(ANALYSIS_OPERATION);

		descriptiveEClass = createEClass(DESCRIPTIVE);

		classificationEClass = createEClass(CLASSIFICATION);

		predictiveEClass = createEClass(PREDICTIVE);

		clusteringEClass = createEClass(CLUSTERING);

		predefinedEClass = createEClass(PREDEFINED);

		// Create enums
		formatEEnum = createEEnum(FORMAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		collectionTaskEClass.getESuperTypes().add(this.getTask());
		integrationTaskEClass.getESuperTypes().add(this.getTask());
		cleaningTaskEClass.getESuperTypes().add(this.getTask());
		analysisTaskEClass.getESuperTypes().add(this.getTask());
		visualizationTaskEClass.getESuperTypes().add(this.getTask());
		exportTaskEClass.getESuperTypes().add(this.getTask());
		userDefinedEClass.getESuperTypes().add(this.getCleaningOperation());
		cleaningOperationEClass.getESuperTypes().add(this.getOperation());
		analysisOperationEClass.getESuperTypes().add(this.getOperation());
		descriptiveEClass.getESuperTypes().add(this.getAnalysisOperation());
		classificationEClass.getESuperTypes().add(this.getAnalysisOperation());
		predictiveEClass.getESuperTypes().add(this.getAnalysisOperation());
		clusteringEClass.getESuperTypes().add(this.getAnalysisOperation());
		predefinedEClass.getESuperTypes().add(this.getCleaningOperation());

		// Initialize classes and features; add operations and parameters
		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipeline_Dataflows(), this.getDataflow(), null, "dataflows", null, 1, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Tasks(), this.getTask(), null, "tasks", null, 1, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipeline_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_IsRequired(), ecorePackage.getEBoolean(), "isRequired", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Incoming(), this.getDataflow(), this.getDataflow_Target(), "incoming", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Outgoing(), this.getDataflow(), this.getDataflow_Source(), "outgoing", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataflowEClass, Dataflow.class, "Dataflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataflow_Format(), this.getFormat(), "format", null, 0, 1, Dataflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataflow_Schema(), this.getSchema(), null, "schema", null, 1, 1, Dataflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataflow_Target(), this.getTask(), this.getTask_Incoming(), "target", null, 0, 1, Dataflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataflow_Source(), this.getTask(), this.getTask_Outgoing(), "source", null, 0, 1, Dataflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Incoming(), this.getInternalDF(), this.getInternalDF_Target(), "incoming", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Outgoing(), this.getInternalDF(), this.getInternalDF_Source(), "outgoing", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalDFEClass, InternalDF.class, "InternalDF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalDF_Format(), this.getFormat(), "format", null, 0, 1, InternalDF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalDF_Schema(), this.getSchema(), null, "schema", null, 1, 1, InternalDF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalDF_Source(), this.getOperation(), this.getOperation_Outgoing(), "source", null, 0, 1, InternalDF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalDF_Target(), this.getOperation(), this.getOperation_Incoming(), "target", null, 0, 1, InternalDF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchema_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Next(), this.getAttribute(), this.getAttribute_Previous(), "next", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Previous(), this.getAttribute(), this.getAttribute_Next(), "previous", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionTaskEClass, CollectionTask.class, "CollectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionTask_Imports(), this.getImport(), null, "imports", null, 1, -1, CollectionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrationTaskEClass, IntegrationTask.class, "IntegrationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cleaningTaskEClass, CleaningTask.class, "CleaningTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCleaningTask_Operations(), this.getCleaningOperation(), null, "operations", null, 1, -1, CleaningTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisTaskEClass, AnalysisTask.class, "AnalysisTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisTask_Analyzes(), this.getAnalysisOperation(), null, "analyzes", null, 1, -1, AnalysisTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualizationTaskEClass, VisualizationTask.class, "VisualizationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exportTaskEClass, ExportTask.class, "ExportTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExportTask_Exports(), this.getExport(), null, "exports", null, 1, -1, ExportTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImport_ReadsFrom(), this.getSource(), this.getSource_LinkedTo(), "readsFrom", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImport_Uses(), this.getSchema(), null, "uses", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImport_Name(), ecorePackage.getEString(), "name", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportEClass, Export.class, "Export", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExport_Generates(), this.getFile(), this.getFile_ComesFrom(), "generates", null, 1, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExport_Uses(), this.getSchema(), null, "uses", null, 1, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExport_Name(), ecorePackage.getEString(), "name", null, 0, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDefinedEClass, UserDefined.class, "UserDefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSource_LinkedTo(), this.getImport(), this.getImport_ReadsFrom(), "linkedTo", null, 1, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Path(), ecorePackage.getEString(), "path", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Path(), ecorePackage.getEString(), "path", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFile_ComesFrom(), this.getExport(), this.getExport_Generates(), "comesFrom", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cleaningOperationEClass, CleaningOperation.class, "CleaningOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analysisOperationEClass, AnalysisOperation.class, "AnalysisOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptiveEClass, Descriptive.class, "Descriptive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classificationEClass, Classification.class, "Classification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predictiveEClass, Predictive.class, "Predictive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clusteringEClass, Clustering.class, "Clustering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predefinedEClass, Predefined.class, "Predefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(formatEEnum, Format.class, "Format");
		addEEnumLiteral(formatEEnum, Format.TXT);
		addEEnumLiteral(formatEEnum, Format.CSV);
		addEEnumLiteral(formatEEnum, Format.JSON);
		addEEnumLiteral(formatEEnum, Format.XML);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (pipelineEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "label", "ID",
			 "figure", "rounded"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "ellipse"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (importEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.text", "Import",
			 "figure", "ellipse"
		   });	
		addAnnotation
		  (exportEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.text", "Export",
			 "figure", "ellipse"
		   });	
		addAnnotation
		  (sourceEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (fileEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (descriptiveEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "ellipse"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (dataflowEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "width", "2",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (internalDFEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "width", "2",
			 "target.decoration", "arrow"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getSchema_Attributes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollectionTask_Imports(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCleaningTask_Operations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnalysisTask_Analyzes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExportTask_Exports(), 
		   source, 
		   new String[] {
		   });
	}

} //PipelinePackageImpl
