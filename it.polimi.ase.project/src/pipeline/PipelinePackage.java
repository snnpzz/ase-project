/**
 */
package pipeline;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pipeline.PipelineFactory
 * @model kind="package"
 * @generated
 */
public interface PipelinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pipeline";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.project.ase.polimi.it/pipeline";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pipeline";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PipelinePackage eINSTANCE = pipeline.impl.PipelinePackageImpl.init();

	/**
	 * The meta object id for the '{@link pipeline.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.PipelineImpl
	 * @see pipeline.impl.PipelinePackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Data Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__DATA_FLOWS = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TASKS = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ID = 2;

	/**
	 * The feature id for the '<em><b>Internal Data Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__INTERNAL_DATA_FLOWS = 3;

	/**
	 * The feature id for the '<em><b>Input Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__INPUT_SOURCES = 4;

	/**
	 * The feature id for the '<em><b>Output Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__OUTPUT_FILES = 5;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__OPERATIONS = 6;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SCHEMAS = 7;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link pipeline.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.TaskImpl
	 * @see pipeline.impl.PipelinePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 0;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING = 3;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link pipeline.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.DataFlowImpl
	 * @see pipeline.impl.PipelinePackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 2;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>DFschema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__DFSCHEMA = 3;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link pipeline.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.OperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INCOMING = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUTGOING = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pipeline.impl.InternalDataFlowImpl <em>Internal Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.InternalDataFlowImpl
	 * @see pipeline.impl.PipelinePackageImpl#getInternalDataFlow()
	 * @generated
	 */
	int INTERNAL_DATA_FLOW = 4;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Int DFschema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW__INT_DFSCHEMA = 3;

	/**
	 * The number of structural features of the '<em>Internal Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link pipeline.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.SchemaImpl
	 * @see pipeline.impl.PipelinePackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pipeline.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.AttributeImpl
	 * @see pipeline.impl.PipelinePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NEXT = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PREVIOUS = 4;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link pipeline.impl.CollectionTaskImpl <em>Collection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.CollectionTaskImpl
	 * @see pipeline.impl.PipelinePackageImpl#getCollectionTask()
	 * @generated
	 */
	int COLLECTION_TASK = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TASK__IS_REQUIRED = TASK__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TASK__IMPORTS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.IntegrationTaskImpl <em>Integration Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.IntegrationTaskImpl
	 * @see pipeline.impl.PipelinePackageImpl#getIntegrationTask()
	 * @generated
	 */
	int INTEGRATION_TASK = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TASK__IS_REQUIRED = TASK__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The number of structural features of the '<em>Integration Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipeline.impl.CleaningTaskImpl <em>Cleaning Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.CleaningTaskImpl
	 * @see pipeline.impl.PipelinePackageImpl#getCleaningTask()
	 * @generated
	 */
	int CLEANING_TASK = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_TASK__IS_REQUIRED = TASK__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_TASK__OPERATIONS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cleaning Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.AnalysisTaskImpl <em>Analysis Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.AnalysisTaskImpl
	 * @see pipeline.impl.PipelinePackageImpl#getAnalysisTask()
	 * @generated
	 */
	int ANALYSIS_TASK = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TASK__IS_REQUIRED = TASK__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Analyzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TASK__ANALYZES = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analysis Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.VisualizationTaskImpl <em>Visualization Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.VisualizationTaskImpl
	 * @see pipeline.impl.PipelinePackageImpl#getVisualizationTask()
	 * @generated
	 */
	int VISUALIZATION_TASK = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_TASK__IS_REQUIRED = TASK__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The number of structural features of the '<em>Visualization Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipeline.impl.ExportTaskImpl <em>Export Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.ExportTaskImpl
	 * @see pipeline.impl.PipelinePackageImpl#getExportTask()
	 * @generated
	 */
	int EXPORT_TASK = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TASK__IS_REQUIRED = TASK__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TASK__EXPORTS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Export Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.ImportImpl
	 * @see pipeline.impl.PipelinePackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 13;

	/**
	 * The feature id for the '<em><b>Reads From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__READS_FROM = 0;

	/**
	 * The feature id for the '<em><b>Imp Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMP_USES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pipeline.impl.ExportImpl <em>Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.ExportImpl
	 * @see pipeline.impl.PipelinePackageImpl#getExport()
	 * @generated
	 */
	int EXPORT = 14;

	/**
	 * The feature id for the '<em><b>Generates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__GENERATES = 0;

	/**
	 * The feature id for the '<em><b>Exp Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__EXP_USES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pipeline.impl.CleaningOperationImpl <em>Cleaning Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.CleaningOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getCleaningOperation()
	 * @generated
	 */
	int CLEANING_OPERATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_OPERATION__INCOMING = OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_OPERATION__OUTGOING = OPERATION__OUTGOING;

	/**
	 * The number of structural features of the '<em>Cleaning Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipeline.impl.UserDefinedImpl <em>User Defined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.UserDefinedImpl
	 * @see pipeline.impl.PipelinePackageImpl#getUserDefined()
	 * @generated
	 */
	int USER_DEFINED = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__NAME = CLEANING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__INCOMING = CLEANING_OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__OUTGOING = CLEANING_OPERATION__OUTGOING;

	/**
	 * The number of structural features of the '<em>User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_FEATURE_COUNT = CLEANING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipeline.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.SourceImpl
	 * @see pipeline.impl.PipelinePackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 16;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__LINKED_TO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PATH = 2;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pipeline.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.FileImpl
	 * @see pipeline.impl.PipelinePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Comes From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__COMES_FROM = 2;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pipeline.impl.AnalysisOperationImpl <em>Analysis Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.AnalysisOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getAnalysisOperation()
	 * @generated
	 */
	int ANALYSIS_OPERATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION__INCOMING = OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION__OUTGOING = OPERATION__OUTGOING;

	/**
	 * The number of structural features of the '<em>Analysis Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipeline.impl.DescriptiveImpl <em>Descriptive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.DescriptiveImpl
	 * @see pipeline.impl.PipelinePackageImpl#getDescriptive()
	 * @generated
	 */
	int DESCRIPTIVE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__NAME = ANALYSIS_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__INCOMING = ANALYSIS_OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__OUTGOING = ANALYSIS_OPERATION__OUTGOING;

	/**
	 * The number of structural features of the '<em>Descriptive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_FEATURE_COUNT = ANALYSIS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipeline.impl.ClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.ClassificationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__NAME = ANALYSIS_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__INCOMING = ANALYSIS_OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__OUTGOING = ANALYSIS_OPERATION__OUTGOING;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FEATURE_COUNT = ANALYSIS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipeline.impl.PredictiveImpl <em>Predictive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.PredictiveImpl
	 * @see pipeline.impl.PipelinePackageImpl#getPredictive()
	 * @generated
	 */
	int PREDICTIVE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE__NAME = ANALYSIS_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE__INCOMING = ANALYSIS_OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE__OUTGOING = ANALYSIS_OPERATION__OUTGOING;

	/**
	 * The number of structural features of the '<em>Predictive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_FEATURE_COUNT = ANALYSIS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipeline.impl.ClusteringImpl <em>Clustering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.ClusteringImpl
	 * @see pipeline.impl.PipelinePackageImpl#getClustering()
	 * @generated
	 */
	int CLUSTERING = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__NAME = ANALYSIS_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__INCOMING = ANALYSIS_OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__OUTGOING = ANALYSIS_OPERATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__K = ANALYSIS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clustering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FEATURE_COUNT = ANALYSIS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.PredefinedImpl <em>Predefined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.PredefinedImpl
	 * @see pipeline.impl.PipelinePackageImpl#getPredefined()
	 * @generated
	 */
	int PREDEFINED = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED__NAME = CLEANING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED__INCOMING = CLEANING_OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED__OUTGOING = CLEANING_OPERATION__OUTGOING;

	/**
	 * The number of structural features of the '<em>Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_FEATURE_COUNT = CLEANING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipeline.Format <em>Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.Format
	 * @see pipeline.impl.PipelinePackageImpl#getFormat()
	 * @generated
	 */
	int FORMAT = 25;


	/**
	 * Returns the meta object for class '{@link pipeline.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see pipeline.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.Pipeline#getDataFlows <em>Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Flows</em>'.
	 * @see pipeline.Pipeline#getDataFlows()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_DataFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.Pipeline#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see pipeline.Pipeline#getTasks()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Pipeline#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see pipeline.Pipeline#getID()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.Pipeline#getInternalDataFlows <em>Internal Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Data Flows</em>'.
	 * @see pipeline.Pipeline#getInternalDataFlows()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_InternalDataFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.Pipeline#getInputSources <em>Input Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Sources</em>'.
	 * @see pipeline.Pipeline#getInputSources()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_InputSources();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.Pipeline#getOutputFiles <em>Output Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Files</em>'.
	 * @see pipeline.Pipeline#getOutputFiles()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_OutputFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.Pipeline#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see pipeline.Pipeline#getOperations()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.Pipeline#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see pipeline.Pipeline#getSchemas()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Schemas();

	/**
	 * Returns the meta object for class '{@link pipeline.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see pipeline.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Task#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see pipeline.Task#getID()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ID();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Task#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see pipeline.Task#isIsRequired()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_IsRequired();

	/**
	 * Returns the meta object for the reference list '{@link pipeline.Task#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see pipeline.Task#getIncoming()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link pipeline.Task#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see pipeline.Task#getOutgoing()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outgoing();

	/**
	 * Returns the meta object for class '{@link pipeline.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see pipeline.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.DataFlow#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see pipeline.DataFlow#getFormat()
	 * @see #getDataFlow()
	 * @generated
	 */
	EAttribute getDataFlow_Format();

	/**
	 * Returns the meta object for the reference '{@link pipeline.DataFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see pipeline.DataFlow#getTarget()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Target();

	/**
	 * Returns the meta object for the reference '{@link pipeline.DataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see pipeline.DataFlow#getSource()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link pipeline.DataFlow#getDFschema <em>DFschema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DFschema</em>'.
	 * @see pipeline.DataFlow#getDFschema()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_DFschema();

	/**
	 * Returns the meta object for class '{@link pipeline.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see pipeline.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipeline.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the reference '{@link pipeline.Operation#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see pipeline.Operation#getIncoming()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Incoming();

	/**
	 * Returns the meta object for the reference '{@link pipeline.Operation#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see pipeline.Operation#getOutgoing()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Outgoing();

	/**
	 * Returns the meta object for class '{@link pipeline.InternalDataFlow <em>Internal Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Data Flow</em>'.
	 * @see pipeline.InternalDataFlow
	 * @generated
	 */
	EClass getInternalDataFlow();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.InternalDataFlow#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see pipeline.InternalDataFlow#getFormat()
	 * @see #getInternalDataFlow()
	 * @generated
	 */
	EAttribute getInternalDataFlow_Format();

	/**
	 * Returns the meta object for the reference '{@link pipeline.InternalDataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see pipeline.InternalDataFlow#getSource()
	 * @see #getInternalDataFlow()
	 * @generated
	 */
	EReference getInternalDataFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link pipeline.InternalDataFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see pipeline.InternalDataFlow#getTarget()
	 * @see #getInternalDataFlow()
	 * @generated
	 */
	EReference getInternalDataFlow_Target();

	/**
	 * Returns the meta object for the reference '{@link pipeline.InternalDataFlow#getIntDFschema <em>Int DFschema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Int DFschema</em>'.
	 * @see pipeline.InternalDataFlow#getIntDFschema()
	 * @see #getInternalDataFlow()
	 * @generated
	 */
	EReference getInternalDataFlow_IntDFschema();

	/**
	 * Returns the meta object for class '{@link pipeline.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see pipeline.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.Schema#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see pipeline.Schema#getAttributes()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipeline.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for class '{@link pipeline.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see pipeline.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipeline.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipeline.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the reference '{@link pipeline.Attribute#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see pipeline.Attribute#getNext()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Next();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.Attribute#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see pipeline.Attribute#getAttributes()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Attributes();

	/**
	 * Returns the meta object for the reference '{@link pipeline.Attribute#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see pipeline.Attribute#getPrevious()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Previous();

	/**
	 * Returns the meta object for class '{@link pipeline.CollectionTask <em>Collection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Task</em>'.
	 * @see pipeline.CollectionTask
	 * @generated
	 */
	EClass getCollectionTask();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.CollectionTask#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see pipeline.CollectionTask#getImports()
	 * @see #getCollectionTask()
	 * @generated
	 */
	EReference getCollectionTask_Imports();

	/**
	 * Returns the meta object for class '{@link pipeline.IntegrationTask <em>Integration Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration Task</em>'.
	 * @see pipeline.IntegrationTask
	 * @generated
	 */
	EClass getIntegrationTask();

	/**
	 * Returns the meta object for class '{@link pipeline.CleaningTask <em>Cleaning Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cleaning Task</em>'.
	 * @see pipeline.CleaningTask
	 * @generated
	 */
	EClass getCleaningTask();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.CleaningTask#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see pipeline.CleaningTask#getOperations()
	 * @see #getCleaningTask()
	 * @generated
	 */
	EReference getCleaningTask_Operations();

	/**
	 * Returns the meta object for class '{@link pipeline.AnalysisTask <em>Analysis Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Task</em>'.
	 * @see pipeline.AnalysisTask
	 * @generated
	 */
	EClass getAnalysisTask();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.AnalysisTask#getAnalyzes <em>Analyzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analyzes</em>'.
	 * @see pipeline.AnalysisTask#getAnalyzes()
	 * @see #getAnalysisTask()
	 * @generated
	 */
	EReference getAnalysisTask_Analyzes();

	/**
	 * Returns the meta object for class '{@link pipeline.VisualizationTask <em>Visualization Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization Task</em>'.
	 * @see pipeline.VisualizationTask
	 * @generated
	 */
	EClass getVisualizationTask();

	/**
	 * Returns the meta object for class '{@link pipeline.ExportTask <em>Export Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Task</em>'.
	 * @see pipeline.ExportTask
	 * @generated
	 */
	EClass getExportTask();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.ExportTask#getExports <em>Exports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exports</em>'.
	 * @see pipeline.ExportTask#getExports()
	 * @see #getExportTask()
	 * @generated
	 */
	EReference getExportTask_Exports();

	/**
	 * Returns the meta object for class '{@link pipeline.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see pipeline.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the reference '{@link pipeline.Import#getReadsFrom <em>Reads From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reads From</em>'.
	 * @see pipeline.Import#getReadsFrom()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ReadsFrom();

	/**
	 * Returns the meta object for the reference '{@link pipeline.Import#getImpUses <em>Imp Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imp Uses</em>'.
	 * @see pipeline.Import#getImpUses()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ImpUses();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Import#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipeline.Import#getName()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Name();

	/**
	 * Returns the meta object for class '{@link pipeline.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export</em>'.
	 * @see pipeline.Export
	 * @generated
	 */
	EClass getExport();

	/**
	 * Returns the meta object for the reference '{@link pipeline.Export#getGenerates <em>Generates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generates</em>'.
	 * @see pipeline.Export#getGenerates()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Generates();

	/**
	 * Returns the meta object for the reference '{@link pipeline.Export#getExpUses <em>Exp Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exp Uses</em>'.
	 * @see pipeline.Export#getExpUses()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_ExpUses();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Export#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipeline.Export#getName()
	 * @see #getExport()
	 * @generated
	 */
	EAttribute getExport_Name();

	/**
	 * Returns the meta object for class '{@link pipeline.UserDefined <em>User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined</em>'.
	 * @see pipeline.UserDefined
	 * @generated
	 */
	EClass getUserDefined();

	/**
	 * Returns the meta object for class '{@link pipeline.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see pipeline.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the reference '{@link pipeline.Source#getLinkedTo <em>Linked To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked To</em>'.
	 * @see pipeline.Source#getLinkedTo()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_LinkedTo();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Source#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipeline.Source#getName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Name();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Source#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see pipeline.Source#getPath()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Path();

	/**
	 * Returns the meta object for class '{@link pipeline.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see pipeline.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipeline.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.File#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see pipeline.File#getPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Path();

	/**
	 * Returns the meta object for the reference '{@link pipeline.File#getComesFrom <em>Comes From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comes From</em>'.
	 * @see pipeline.File#getComesFrom()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_ComesFrom();

	/**
	 * Returns the meta object for class '{@link pipeline.CleaningOperation <em>Cleaning Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cleaning Operation</em>'.
	 * @see pipeline.CleaningOperation
	 * @generated
	 */
	EClass getCleaningOperation();

	/**
	 * Returns the meta object for class '{@link pipeline.AnalysisOperation <em>Analysis Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Operation</em>'.
	 * @see pipeline.AnalysisOperation
	 * @generated
	 */
	EClass getAnalysisOperation();

	/**
	 * Returns the meta object for class '{@link pipeline.Descriptive <em>Descriptive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptive</em>'.
	 * @see pipeline.Descriptive
	 * @generated
	 */
	EClass getDescriptive();

	/**
	 * Returns the meta object for class '{@link pipeline.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see pipeline.Classification
	 * @generated
	 */
	EClass getClassification();

	/**
	 * Returns the meta object for class '{@link pipeline.Predictive <em>Predictive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predictive</em>'.
	 * @see pipeline.Predictive
	 * @generated
	 */
	EClass getPredictive();

	/**
	 * Returns the meta object for class '{@link pipeline.Clustering <em>Clustering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clustering</em>'.
	 * @see pipeline.Clustering
	 * @generated
	 */
	EClass getClustering();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Clustering#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see pipeline.Clustering#getK()
	 * @see #getClustering()
	 * @generated
	 */
	EAttribute getClustering_K();

	/**
	 * Returns the meta object for class '{@link pipeline.Predefined <em>Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined</em>'.
	 * @see pipeline.Predefined
	 * @generated
	 */
	EClass getPredefined();

	/**
	 * Returns the meta object for enum '{@link pipeline.Format <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format</em>'.
	 * @see pipeline.Format
	 * @generated
	 */
	EEnum getFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PipelineFactory getPipelineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pipeline.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.PipelineImpl
		 * @see pipeline.impl.PipelinePackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Data Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__DATA_FLOWS = eINSTANCE.getPipeline_DataFlows();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TASKS = eINSTANCE.getPipeline_Tasks();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__ID = eINSTANCE.getPipeline_ID();

		/**
		 * The meta object literal for the '<em><b>Internal Data Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__INTERNAL_DATA_FLOWS = eINSTANCE.getPipeline_InternalDataFlows();

		/**
		 * The meta object literal for the '<em><b>Input Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__INPUT_SOURCES = eINSTANCE.getPipeline_InputSources();

		/**
		 * The meta object literal for the '<em><b>Output Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__OUTPUT_FILES = eINSTANCE.getPipeline_OutputFiles();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__OPERATIONS = eINSTANCE.getPipeline_Operations();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__SCHEMAS = eINSTANCE.getPipeline_Schemas();

		/**
		 * The meta object literal for the '{@link pipeline.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.TaskImpl
		 * @see pipeline.impl.PipelinePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_ID();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IS_REQUIRED = eINSTANCE.getTask_IsRequired();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INCOMING = eINSTANCE.getTask_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTGOING = eINSTANCE.getTask_Outgoing();

		/**
		 * The meta object literal for the '{@link pipeline.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.DataFlowImpl
		 * @see pipeline.impl.PipelinePackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW__FORMAT = eINSTANCE.getDataFlow_Format();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__TARGET = eINSTANCE.getDataFlow_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__SOURCE = eINSTANCE.getDataFlow_Source();

		/**
		 * The meta object literal for the '<em><b>DFschema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__DFSCHEMA = eINSTANCE.getDataFlow_DFschema();

		/**
		 * The meta object literal for the '{@link pipeline.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.OperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INCOMING = eINSTANCE.getOperation_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OUTGOING = eINSTANCE.getOperation_Outgoing();

		/**
		 * The meta object literal for the '{@link pipeline.impl.InternalDataFlowImpl <em>Internal Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.InternalDataFlowImpl
		 * @see pipeline.impl.PipelinePackageImpl#getInternalDataFlow()
		 * @generated
		 */
		EClass INTERNAL_DATA_FLOW = eINSTANCE.getInternalDataFlow();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DATA_FLOW__FORMAT = eINSTANCE.getInternalDataFlow_Format();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_DATA_FLOW__SOURCE = eINSTANCE.getInternalDataFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_DATA_FLOW__TARGET = eINSTANCE.getInternalDataFlow_Target();

		/**
		 * The meta object literal for the '<em><b>Int DFschema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_DATA_FLOW__INT_DFSCHEMA = eINSTANCE.getInternalDataFlow_IntDFschema();

		/**
		 * The meta object literal for the '{@link pipeline.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.SchemaImpl
		 * @see pipeline.impl.PipelinePackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ATTRIBUTES = eINSTANCE.getSchema_Attributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '{@link pipeline.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.AttributeImpl
		 * @see pipeline.impl.PipelinePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__NEXT = eINSTANCE.getAttribute_Next();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTES = eINSTANCE.getAttribute_Attributes();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__PREVIOUS = eINSTANCE.getAttribute_Previous();

		/**
		 * The meta object literal for the '{@link pipeline.impl.CollectionTaskImpl <em>Collection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.CollectionTaskImpl
		 * @see pipeline.impl.PipelinePackageImpl#getCollectionTask()
		 * @generated
		 */
		EClass COLLECTION_TASK = eINSTANCE.getCollectionTask();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TASK__IMPORTS = eINSTANCE.getCollectionTask_Imports();

		/**
		 * The meta object literal for the '{@link pipeline.impl.IntegrationTaskImpl <em>Integration Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.IntegrationTaskImpl
		 * @see pipeline.impl.PipelinePackageImpl#getIntegrationTask()
		 * @generated
		 */
		EClass INTEGRATION_TASK = eINSTANCE.getIntegrationTask();

		/**
		 * The meta object literal for the '{@link pipeline.impl.CleaningTaskImpl <em>Cleaning Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.CleaningTaskImpl
		 * @see pipeline.impl.PipelinePackageImpl#getCleaningTask()
		 * @generated
		 */
		EClass CLEANING_TASK = eINSTANCE.getCleaningTask();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEANING_TASK__OPERATIONS = eINSTANCE.getCleaningTask_Operations();

		/**
		 * The meta object literal for the '{@link pipeline.impl.AnalysisTaskImpl <em>Analysis Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.AnalysisTaskImpl
		 * @see pipeline.impl.PipelinePackageImpl#getAnalysisTask()
		 * @generated
		 */
		EClass ANALYSIS_TASK = eINSTANCE.getAnalysisTask();

		/**
		 * The meta object literal for the '<em><b>Analyzes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_TASK__ANALYZES = eINSTANCE.getAnalysisTask_Analyzes();

		/**
		 * The meta object literal for the '{@link pipeline.impl.VisualizationTaskImpl <em>Visualization Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.VisualizationTaskImpl
		 * @see pipeline.impl.PipelinePackageImpl#getVisualizationTask()
		 * @generated
		 */
		EClass VISUALIZATION_TASK = eINSTANCE.getVisualizationTask();

		/**
		 * The meta object literal for the '{@link pipeline.impl.ExportTaskImpl <em>Export Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.ExportTaskImpl
		 * @see pipeline.impl.PipelinePackageImpl#getExportTask()
		 * @generated
		 */
		EClass EXPORT_TASK = eINSTANCE.getExportTask();

		/**
		 * The meta object literal for the '<em><b>Exports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORT_TASK__EXPORTS = eINSTANCE.getExportTask_Exports();

		/**
		 * The meta object literal for the '{@link pipeline.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.ImportImpl
		 * @see pipeline.impl.PipelinePackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Reads From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__READS_FROM = eINSTANCE.getImport_ReadsFrom();

		/**
		 * The meta object literal for the '<em><b>Imp Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__IMP_USES = eINSTANCE.getImport_ImpUses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

		/**
		 * The meta object literal for the '{@link pipeline.impl.ExportImpl <em>Export</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.ExportImpl
		 * @see pipeline.impl.PipelinePackageImpl#getExport()
		 * @generated
		 */
		EClass EXPORT = eINSTANCE.getExport();

		/**
		 * The meta object literal for the '<em><b>Generates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORT__GENERATES = eINSTANCE.getExport_Generates();

		/**
		 * The meta object literal for the '<em><b>Exp Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORT__EXP_USES = eINSTANCE.getExport_ExpUses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT__NAME = eINSTANCE.getExport_Name();

		/**
		 * The meta object literal for the '{@link pipeline.impl.UserDefinedImpl <em>User Defined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.UserDefinedImpl
		 * @see pipeline.impl.PipelinePackageImpl#getUserDefined()
		 * @generated
		 */
		EClass USER_DEFINED = eINSTANCE.getUserDefined();

		/**
		 * The meta object literal for the '{@link pipeline.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.SourceImpl
		 * @see pipeline.impl.PipelinePackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Linked To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__LINKED_TO = eINSTANCE.getSource_LinkedTo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__NAME = eINSTANCE.getSource_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__PATH = eINSTANCE.getSource_Path();

		/**
		 * The meta object literal for the '{@link pipeline.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.FileImpl
		 * @see pipeline.impl.PipelinePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PATH = eINSTANCE.getFile_Path();

		/**
		 * The meta object literal for the '<em><b>Comes From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__COMES_FROM = eINSTANCE.getFile_ComesFrom();

		/**
		 * The meta object literal for the '{@link pipeline.impl.CleaningOperationImpl <em>Cleaning Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.CleaningOperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getCleaningOperation()
		 * @generated
		 */
		EClass CLEANING_OPERATION = eINSTANCE.getCleaningOperation();

		/**
		 * The meta object literal for the '{@link pipeline.impl.AnalysisOperationImpl <em>Analysis Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.AnalysisOperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getAnalysisOperation()
		 * @generated
		 */
		EClass ANALYSIS_OPERATION = eINSTANCE.getAnalysisOperation();

		/**
		 * The meta object literal for the '{@link pipeline.impl.DescriptiveImpl <em>Descriptive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.DescriptiveImpl
		 * @see pipeline.impl.PipelinePackageImpl#getDescriptive()
		 * @generated
		 */
		EClass DESCRIPTIVE = eINSTANCE.getDescriptive();

		/**
		 * The meta object literal for the '{@link pipeline.impl.ClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.ClassificationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getClassification()
		 * @generated
		 */
		EClass CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '{@link pipeline.impl.PredictiveImpl <em>Predictive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.PredictiveImpl
		 * @see pipeline.impl.PipelinePackageImpl#getPredictive()
		 * @generated
		 */
		EClass PREDICTIVE = eINSTANCE.getPredictive();

		/**
		 * The meta object literal for the '{@link pipeline.impl.ClusteringImpl <em>Clustering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.ClusteringImpl
		 * @see pipeline.impl.PipelinePackageImpl#getClustering()
		 * @generated
		 */
		EClass CLUSTERING = eINSTANCE.getClustering();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTERING__K = eINSTANCE.getClustering_K();

		/**
		 * The meta object literal for the '{@link pipeline.impl.PredefinedImpl <em>Predefined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.PredefinedImpl
		 * @see pipeline.impl.PipelinePackageImpl#getPredefined()
		 * @generated
		 */
		EClass PREDEFINED = eINSTANCE.getPredefined();

		/**
		 * The meta object literal for the '{@link pipeline.Format <em>Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.Format
		 * @see pipeline.impl.PipelinePackageImpl#getFormat()
		 * @generated
		 */
		EEnum FORMAT = eINSTANCE.getFormat();

	}

} //PipelinePackage
