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
import pipeline.ChartType;
import pipeline.Classification;
import pipeline.ClassificationAnalysisOperation;
import pipeline.ClassificationOperation;
import pipeline.CleaningOperation;
import pipeline.CleaningTask;
import pipeline.Clustering;
import pipeline.ClusteringAnalysisOperation;
import pipeline.ClusteringOperation;
import pipeline.CollectionTask;
import pipeline.ComplexAttribute;
import pipeline.DataFlow;
import pipeline.Descriptive;
import pipeline.DescriptiveAnalysisOperation;
import pipeline.DescriptiveOperation;
import pipeline.Export;
import pipeline.ExportTask;
import pipeline.File;
import pipeline.Format;
import pipeline.GraphType;
import pipeline.Import;
import pipeline.IntegrationTask;
import pipeline.InternalDataFlow;
import pipeline.Operation;
import pipeline.Pipeline;
import pipeline.PipelineFactory;
import pipeline.PipelinePackage;
import pipeline.Predefined;
import pipeline.PredefinedCleaningOperation;
import pipeline.PredefinedOperation;
import pipeline.Predictive;
import pipeline.PredictiveAnalysisOperation;
import pipeline.PredictiveOperation;
import pipeline.Schema;
import pipeline.SimpleAttribute;
import pipeline.Size;
import pipeline.Source;
import pipeline.Task;
import pipeline.Type;
import pipeline.UserDefined;
import pipeline.UserDefinedCleaningOperation;
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
	private EClass dataFlowEClass = null;

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
	private EClass internalDataFlowEClass = null;

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
	private EClass userDefinedCleaningOperationEClass = null;

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
	private EClass descriptiveAnalysisOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationAnalysisOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predictiveAnalysisOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusteringAnalysisOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedCleaningOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum predefinedOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clusteringOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classificationOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum predictiveOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum descriptiveOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chartTypeEEnum = null;

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
	public EReference getPipeline_DataFlows() {
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
	public EReference getPipeline_InternalDataFlows() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeline_Sources() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeline_Files() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeline_Schemas() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(6);
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
	public EReference getTask_Incoming() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Outgoing() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlow() {
		return dataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFlow_Format() {
		return (EAttribute)dataFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_Target() {
		return (EReference)dataFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_Source() {
		return (EReference)dataFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_Schema() {
		return (EReference)dataFlowEClass.getEStructuralFeatures().get(3);
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
	public EReference getOperation_Incoming() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Outgoing() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_ID() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalDataFlow() {
		return internalDataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalDataFlow_Format() {
		return (EAttribute)internalDataFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalDataFlow_Source() {
		return (EReference)internalDataFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalDataFlow_Target() {
		return (EReference)internalDataFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalDataFlow_InternalSchema() {
		return (EReference)internalDataFlowEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getSchema_Name() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(1);
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
	public EReference getAttribute_Next() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Previous() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
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
	public EReference getIntegrationTask_Attributes() {
		return (EReference)integrationTaskEClass.getEStructuralFeatures().get(0);
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
	public EReference getCleaningTask_CleaningOperations() {
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
	public EReference getAnalysisTask_AnalysisOperations() {
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
	public EAttribute getVisualizationTask_Size() {
		return (EAttribute)visualizationTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualizationTask_ChartType() {
		return (EAttribute)visualizationTaskEClass.getEStructuralFeatures().get(1);
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
	public EReference getImport_Read() {
		return (EReference)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_ImpUses() {
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
	public EReference getExport_Write() {
		return (EReference)exportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExport_ExpUses() {
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
	public EClass getUserDefinedCleaningOperation() {
		return userDefinedCleaningOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedCleaningOperation_Name() {
		return (EAttribute)userDefinedCleaningOperationEClass.getEStructuralFeatures().get(0);
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
	public EClass getDescriptiveAnalysisOperation() {
		return descriptiveAnalysisOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptiveAnalysisOperation_Name() {
		return (EAttribute)descriptiveAnalysisOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationAnalysisOperation() {
		return classificationAnalysisOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassificationAnalysisOperation_Name() {
		return (EAttribute)classificationAnalysisOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredictiveAnalysisOperation() {
		return predictiveAnalysisOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredictiveAnalysisOperation_Name() {
		return (EAttribute)predictiveAnalysisOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClusteringAnalysisOperation() {
		return clusteringAnalysisOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClusteringAnalysisOperation_K() {
		return (EAttribute)clusteringAnalysisOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClusteringAnalysisOperation_Name() {
		return (EAttribute)clusteringAnalysisOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredefinedCleaningOperation() {
		return predefinedCleaningOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredefinedCleaningOperation_Name() {
		return (EAttribute)predefinedCleaningOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAttribute() {
		return simpleAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAttribute_Type() {
		return (EAttribute)simpleAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexAttribute() {
		return complexAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexAttribute_Attributes() {
		return (EReference)complexAttributeEClass.getEStructuralFeatures().get(0);
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
	public EEnum getSize() {
		return sizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPredefinedOperation() {
		return predefinedOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClusteringOperation() {
		return clusteringOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassificationOperation() {
		return classificationOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPredictiveOperation() {
		return predictiveOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDescriptiveOperation() {
		return descriptiveOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChartType() {
		return chartTypeEEnum;
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
		createEReference(pipelineEClass, PIPELINE__DATA_FLOWS);
		createEReference(pipelineEClass, PIPELINE__TASKS);
		createEAttribute(pipelineEClass, PIPELINE__ID);
		createEReference(pipelineEClass, PIPELINE__INTERNAL_DATA_FLOWS);
		createEReference(pipelineEClass, PIPELINE__SOURCES);
		createEReference(pipelineEClass, PIPELINE__FILES);
		createEReference(pipelineEClass, PIPELINE__SCHEMAS);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__ID);
		createEReference(taskEClass, TASK__INCOMING);
		createEReference(taskEClass, TASK__OUTGOING);

		dataFlowEClass = createEClass(DATA_FLOW);
		createEAttribute(dataFlowEClass, DATA_FLOW__FORMAT);
		createEReference(dataFlowEClass, DATA_FLOW__TARGET);
		createEReference(dataFlowEClass, DATA_FLOW__SOURCE);
		createEReference(dataFlowEClass, DATA_FLOW__SCHEMA);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__INCOMING);
		createEReference(operationEClass, OPERATION__OUTGOING);
		createEAttribute(operationEClass, OPERATION__ID);

		internalDataFlowEClass = createEClass(INTERNAL_DATA_FLOW);
		createEAttribute(internalDataFlowEClass, INTERNAL_DATA_FLOW__FORMAT);
		createEReference(internalDataFlowEClass, INTERNAL_DATA_FLOW__SOURCE);
		createEReference(internalDataFlowEClass, INTERNAL_DATA_FLOW__TARGET);
		createEReference(internalDataFlowEClass, INTERNAL_DATA_FLOW__INTERNAL_SCHEMA);

		schemaEClass = createEClass(SCHEMA);
		createEReference(schemaEClass, SCHEMA__ATTRIBUTES);
		createEAttribute(schemaEClass, SCHEMA__NAME);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEReference(attributeEClass, ATTRIBUTE__NEXT);
		createEReference(attributeEClass, ATTRIBUTE__PREVIOUS);

		collectionTaskEClass = createEClass(COLLECTION_TASK);
		createEReference(collectionTaskEClass, COLLECTION_TASK__IMPORTS);

		integrationTaskEClass = createEClass(INTEGRATION_TASK);
		createEReference(integrationTaskEClass, INTEGRATION_TASK__ATTRIBUTES);

		cleaningTaskEClass = createEClass(CLEANING_TASK);
		createEReference(cleaningTaskEClass, CLEANING_TASK__CLEANING_OPERATIONS);

		analysisTaskEClass = createEClass(ANALYSIS_TASK);
		createEReference(analysisTaskEClass, ANALYSIS_TASK__ANALYSIS_OPERATIONS);

		visualizationTaskEClass = createEClass(VISUALIZATION_TASK);
		createEAttribute(visualizationTaskEClass, VISUALIZATION_TASK__SIZE);
		createEAttribute(visualizationTaskEClass, VISUALIZATION_TASK__CHART_TYPE);

		exportTaskEClass = createEClass(EXPORT_TASK);
		createEReference(exportTaskEClass, EXPORT_TASK__EXPORTS);

		importEClass = createEClass(IMPORT);
		createEReference(importEClass, IMPORT__READ);
		createEReference(importEClass, IMPORT__IMP_USES);
		createEAttribute(importEClass, IMPORT__NAME);

		exportEClass = createEClass(EXPORT);
		createEReference(exportEClass, EXPORT__WRITE);
		createEReference(exportEClass, EXPORT__EXP_USES);
		createEAttribute(exportEClass, EXPORT__NAME);

		userDefinedCleaningOperationEClass = createEClass(USER_DEFINED_CLEANING_OPERATION);
		createEAttribute(userDefinedCleaningOperationEClass, USER_DEFINED_CLEANING_OPERATION__NAME);

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

		descriptiveAnalysisOperationEClass = createEClass(DESCRIPTIVE_ANALYSIS_OPERATION);
		createEAttribute(descriptiveAnalysisOperationEClass, DESCRIPTIVE_ANALYSIS_OPERATION__NAME);

		classificationAnalysisOperationEClass = createEClass(CLASSIFICATION_ANALYSIS_OPERATION);
		createEAttribute(classificationAnalysisOperationEClass, CLASSIFICATION_ANALYSIS_OPERATION__NAME);

		predictiveAnalysisOperationEClass = createEClass(PREDICTIVE_ANALYSIS_OPERATION);
		createEAttribute(predictiveAnalysisOperationEClass, PREDICTIVE_ANALYSIS_OPERATION__NAME);

		clusteringAnalysisOperationEClass = createEClass(CLUSTERING_ANALYSIS_OPERATION);
		createEAttribute(clusteringAnalysisOperationEClass, CLUSTERING_ANALYSIS_OPERATION__K);
		createEAttribute(clusteringAnalysisOperationEClass, CLUSTERING_ANALYSIS_OPERATION__NAME);

		predefinedCleaningOperationEClass = createEClass(PREDEFINED_CLEANING_OPERATION);
		createEAttribute(predefinedCleaningOperationEClass, PREDEFINED_CLEANING_OPERATION__NAME);

		simpleAttributeEClass = createEClass(SIMPLE_ATTRIBUTE);
		createEAttribute(simpleAttributeEClass, SIMPLE_ATTRIBUTE__TYPE);

		complexAttributeEClass = createEClass(COMPLEX_ATTRIBUTE);
		createEReference(complexAttributeEClass, COMPLEX_ATTRIBUTE__ATTRIBUTES);

		// Create enums
		predefinedOperationEEnum = createEEnum(PREDEFINED_OPERATION);
		clusteringOperationEEnum = createEEnum(CLUSTERING_OPERATION);
		classificationOperationEEnum = createEEnum(CLASSIFICATION_OPERATION);
		predictiveOperationEEnum = createEEnum(PREDICTIVE_OPERATION);
		descriptiveOperationEEnum = createEEnum(DESCRIPTIVE_OPERATION);
		chartTypeEEnum = createEEnum(CHART_TYPE);
		formatEEnum = createEEnum(FORMAT);
		sizeEEnum = createEEnum(SIZE);
		typeEEnum = createEEnum(TYPE);
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
		userDefinedCleaningOperationEClass.getESuperTypes().add(this.getCleaningOperation());
		cleaningOperationEClass.getESuperTypes().add(this.getOperation());
		analysisOperationEClass.getESuperTypes().add(this.getOperation());
		descriptiveAnalysisOperationEClass.getESuperTypes().add(this.getAnalysisOperation());
		classificationAnalysisOperationEClass.getESuperTypes().add(this.getAnalysisOperation());
		predictiveAnalysisOperationEClass.getESuperTypes().add(this.getAnalysisOperation());
		clusteringAnalysisOperationEClass.getESuperTypes().add(this.getAnalysisOperation());
		predefinedCleaningOperationEClass.getESuperTypes().add(this.getCleaningOperation());
		simpleAttributeEClass.getESuperTypes().add(this.getAttribute());
		complexAttributeEClass.getESuperTypes().add(this.getAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipeline_DataFlows(), this.getDataFlow(), null, "dataFlows", null, 1, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Tasks(), this.getTask(), null, "tasks", null, 1, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipeline_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_InternalDataFlows(), this.getInternalDataFlow(), null, "internalDataFlows", null, 0, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Sources(), this.getSource(), null, "sources", null, 1, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Files(), this.getFile(), null, "files", null, 0, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Schemas(), this.getSchema(), null, "schemas", null, 1, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Incoming(), this.getDataFlow(), this.getDataFlow_Target(), "incoming", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Outgoing(), this.getDataFlow(), this.getDataFlow_Source(), "outgoing", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFlow_Format(), this.getFormat(), "format", null, 0, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlow_Target(), this.getTask(), this.getTask_Incoming(), "target", null, 0, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlow_Source(), this.getTask(), this.getTask_Outgoing(), "source", null, 0, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlow_Schema(), this.getSchema(), null, "schema", null, 1, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Incoming(), this.getInternalDataFlow(), this.getInternalDataFlow_Target(), "incoming", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Outgoing(), this.getInternalDataFlow(), this.getInternalDataFlow_Source(), "outgoing", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalDataFlowEClass, InternalDataFlow.class, "InternalDataFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalDataFlow_Format(), this.getFormat(), "format", null, 0, 1, InternalDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalDataFlow_Source(), this.getOperation(), this.getOperation_Outgoing(), "source", null, 0, 1, InternalDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalDataFlow_Target(), this.getOperation(), this.getOperation_Incoming(), "target", null, 0, 1, InternalDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalDataFlow_InternalSchema(), this.getSchema(), null, "internalSchema", null, 1, 1, InternalDataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchema_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Name(), ecorePackage.getEString(), "name", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Next(), this.getAttribute(), this.getAttribute_Previous(), "next", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Previous(), this.getAttribute(), this.getAttribute_Next(), "previous", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionTaskEClass, CollectionTask.class, "CollectionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionTask_Imports(), this.getImport(), null, "imports", null, 1, -1, CollectionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integrationTaskEClass, IntegrationTask.class, "IntegrationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegrationTask_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1, IntegrationTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cleaningTaskEClass, CleaningTask.class, "CleaningTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCleaningTask_CleaningOperations(), this.getCleaningOperation(), null, "cleaningOperations", null, 1, -1, CleaningTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisTaskEClass, AnalysisTask.class, "AnalysisTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisTask_AnalysisOperations(), this.getAnalysisOperation(), null, "analysisOperations", null, 1, -1, AnalysisTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualizationTaskEClass, VisualizationTask.class, "VisualizationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualizationTask_Size(), this.getSize(), "size", null, 0, 1, VisualizationTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisualizationTask_ChartType(), this.getChartType(), "chartType", null, 0, 1, VisualizationTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportTaskEClass, ExportTask.class, "ExportTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExportTask_Exports(), this.getExport(), null, "exports", null, 1, -1, ExportTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImport_Read(), this.getSource(), this.getSource_LinkedTo(), "read", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImport_ImpUses(), this.getSchema(), null, "impUses", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImport_Name(), ecorePackage.getEString(), "name", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportEClass, Export.class, "Export", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExport_Write(), this.getFile(), this.getFile_ComesFrom(), "write", null, 1, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExport_ExpUses(), this.getSchema(), null, "expUses", null, 1, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExport_Name(), ecorePackage.getEString(), "name", null, 0, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDefinedCleaningOperationEClass, UserDefinedCleaningOperation.class, "UserDefinedCleaningOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserDefinedCleaningOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserDefinedCleaningOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSource_LinkedTo(), this.getImport(), this.getImport_Read(), "linkedTo", null, 1, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Path(), ecorePackage.getEString(), "path", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Path(), ecorePackage.getEString(), "path", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFile_ComesFrom(), this.getExport(), this.getExport_Write(), "comesFrom", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cleaningOperationEClass, CleaningOperation.class, "CleaningOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analysisOperationEClass, AnalysisOperation.class, "AnalysisOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptiveAnalysisOperationEClass, DescriptiveAnalysisOperation.class, "DescriptiveAnalysisOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptiveAnalysisOperation_Name(), this.getDescriptiveOperation(), "name", null, 0, 1, DescriptiveAnalysisOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationAnalysisOperationEClass, ClassificationAnalysisOperation.class, "ClassificationAnalysisOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassificationAnalysisOperation_Name(), this.getClassificationOperation(), "name", null, 0, 1, ClassificationAnalysisOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predictiveAnalysisOperationEClass, PredictiveAnalysisOperation.class, "PredictiveAnalysisOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredictiveAnalysisOperation_Name(), this.getPredictiveOperation(), "name", null, 0, 1, PredictiveAnalysisOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusteringAnalysisOperationEClass, ClusteringAnalysisOperation.class, "ClusteringAnalysisOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClusteringAnalysisOperation_K(), ecorePackage.getEInt(), "k", null, 0, 1, ClusteringAnalysisOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClusteringAnalysisOperation_Name(), this.getClusteringOperation(), "name", null, 0, 1, ClusteringAnalysisOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predefinedCleaningOperationEClass, PredefinedCleaningOperation.class, "PredefinedCleaningOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredefinedCleaningOperation_Name(), this.getPredefinedOperation(), "name", "", 0, 1, PredefinedCleaningOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleAttributeEClass, SimpleAttribute.class, "SimpleAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleAttribute_Type(), this.getType(), "type", null, 0, 1, SimpleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexAttributeEClass, ComplexAttribute.class, "ComplexAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexAttribute_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1, ComplexAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(predefinedOperationEEnum, PredefinedOperation.class, "PredefinedOperation");
		addEEnumLiteral(predefinedOperationEEnum, PredefinedOperation.REMOVE_NULLS);
		addEEnumLiteral(predefinedOperationEEnum, PredefinedOperation.REMOVE_NEGATIVE);
		addEEnumLiteral(predefinedOperationEEnum, PredefinedOperation.ROUND);

		initEEnum(clusteringOperationEEnum, ClusteringOperation.class, "ClusteringOperation");
		addEEnumLiteral(clusteringOperationEEnum, ClusteringOperation.KMEANS);
		addEEnumLiteral(clusteringOperationEEnum, ClusteringOperation.KMEDOIDS);
		addEEnumLiteral(clusteringOperationEEnum, ClusteringOperation.FUZZY_CMEANS);
		addEEnumLiteral(clusteringOperationEEnum, ClusteringOperation.QT);

		initEEnum(classificationOperationEEnum, ClassificationOperation.class, "ClassificationOperation");
		addEEnumLiteral(classificationOperationEEnum, ClassificationOperation.LOGISTIC_REGRESSION);
		addEEnumLiteral(classificationOperationEEnum, ClassificationOperation.LDA);
		addEEnumLiteral(classificationOperationEEnum, ClassificationOperation.QDA);
		addEEnumLiteral(classificationOperationEEnum, ClassificationOperation.KNN);
		addEEnumLiteral(classificationOperationEEnum, ClassificationOperation.SVM);

		initEEnum(predictiveOperationEEnum, PredictiveOperation.class, "PredictiveOperation");
		addEEnumLiteral(predictiveOperationEEnum, PredictiveOperation.SIMPLE_REGRESSION);
		addEEnumLiteral(predictiveOperationEEnum, PredictiveOperation.MULTIPLE_LIN_REGR);
		addEEnumLiteral(predictiveOperationEEnum, PredictiveOperation.RANDOM_FORESTS);

		initEEnum(descriptiveOperationEEnum, DescriptiveOperation.class, "DescriptiveOperation");
		addEEnumLiteral(descriptiveOperationEEnum, DescriptiveOperation.HISTOGRAM);
		addEEnumLiteral(descriptiveOperationEEnum, DescriptiveOperation.BOXPLOT);
		addEEnumLiteral(descriptiveOperationEEnum, DescriptiveOperation.PIE_CHART);

		initEEnum(chartTypeEEnum, ChartType.class, "ChartType");
		addEEnumLiteral(chartTypeEEnum, ChartType.COLUMN);
		addEEnumLiteral(chartTypeEEnum, ChartType.LINE);
		addEEnumLiteral(chartTypeEEnum, ChartType.PIE);
		addEEnumLiteral(chartTypeEEnum, ChartType.DOUGHNUT);
		addEEnumLiteral(chartTypeEEnum, ChartType.BAR);
		addEEnumLiteral(chartTypeEEnum, ChartType.AREA);
		addEEnumLiteral(chartTypeEEnum, ChartType.SCATTER);
		addEEnumLiteral(chartTypeEEnum, ChartType.BUBBLE);
		addEEnumLiteral(chartTypeEEnum, ChartType.MAP);
		addEEnumLiteral(chartTypeEEnum, ChartType.STOCK);
		addEEnumLiteral(chartTypeEEnum, ChartType.SURFACE);
		addEEnumLiteral(chartTypeEEnum, ChartType.RADAR);
		addEEnumLiteral(chartTypeEEnum, ChartType.TREEMAP);
		addEEnumLiteral(chartTypeEEnum, ChartType.SUNBURST);
		addEEnumLiteral(chartTypeEEnum, ChartType.HISTOGRAM);
		addEEnumLiteral(chartTypeEEnum, ChartType.BOX_AND_WHISKER);
		addEEnumLiteral(chartTypeEEnum, ChartType.WATERFALL);
		addEEnumLiteral(chartTypeEEnum, ChartType.FUNNEL);
		addEEnumLiteral(chartTypeEEnum, ChartType.COMBO);

		initEEnum(formatEEnum, Format.class, "Format");
		addEEnumLiteral(formatEEnum, Format.CSV);
		addEEnumLiteral(formatEEnum, Format.JSON);
		addEEnumLiteral(formatEEnum, Format.TXT);
		addEEnumLiteral(formatEEnum, Format.XML);

		initEEnum(sizeEEnum, Size.class, "Size");
		addEEnumLiteral(sizeEEnum, Size.SMALL);
		addEEnumLiteral(sizeEEnum, Size.MEDIUM);
		addEEnumLiteral(sizeEEnum, Size.LARGE);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.MSTRING);
		addEEnumLiteral(typeEEnum, Type.MINTEGER);
		addEEnumLiteral(typeEEnum, Type.MDOUBLE);
		addEEnumLiteral(typeEEnum, Type.MBOOLEAN);
		addEEnumLiteral(typeEEnum, Type.MDATE);

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
		  (schemaEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.placement", "none",
			 "figure", "rounded"
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
		  (dataFlowEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "width", "2",
			 "target.decoration", "closedarrow"
		   });	
		addAnnotation
		  (getDataFlow_Schema(), 
		   source, 
		   new String[] {
			 "width", "1",
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (internalDataFlowEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "width", "2",
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getInternalDataFlow_InternalSchema(), 
		   source, 
		   new String[] {
			 "width", "1",
			 "target.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getImport_Read(), 
		   source, 
		   new String[] {
			 "width", "2",
			 "target.decoration", "square",
			 "style", "dash"
		   });	
		addAnnotation
		  (getImport_ImpUses(), 
		   source, 
		   new String[] {
			 "width", "1",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getExport_Write(), 
		   source, 
		   new String[] {
			 "width", "2",
			 "target.decoration", "square",
			 "style", "dash"
		   });	
		addAnnotation
		  (getExport_ExpUses(), 
		   source, 
		   new String[] {
			 "width", "1",
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
			 "layout", "list"
		   });	
		addAnnotation
		  (getCollectionTask_Imports(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCleaningTask_CleaningOperations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnalysisTask_AnalysisOperations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExportTask_Exports(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComplexAttribute_Attributes(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });
	}

} //PipelinePackageImpl
