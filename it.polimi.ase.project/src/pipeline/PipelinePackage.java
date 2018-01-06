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
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SOURCES = 4;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__FILES = 5;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SCHEMAS = 6;

	/**
	 * The feature id for the '<em><b>Charts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__CHARTS = 7;

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
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__ID = 3;

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
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INCOMING = 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUTGOING = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID = 2;

	/**
	 * The feature id for the '<em><b>Input Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INPUT_ATTRIBUTES = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW__TARGET = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW__ID = 2;

	/**
	 * The number of structural features of the '<em>Internal Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DATA_FLOW_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ID = 1;

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
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PREVIOUS = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Import Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TASK__IMPORT_OPERATIONS = TASK_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Integration Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TASK__INTEGRATION_OPERATIONS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integration Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Cleaning Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_TASK__CLEANING_OPERATIONS = TASK_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Analysis Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_TASK__ANALYSIS_OPERATIONS = TASK_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Visualization Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_TASK__VISUALIZATION_OPERATIONS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visualization Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Export Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TASK__EXPORT_OPERATIONS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Export Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.ImportOperationImpl <em>Import Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.ImportOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getImportOperation()
	 * @generated
	 */
	int IMPORT_OPERATION = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Read</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION__READ = 1;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION__USE = 2;

	/**
	 * The number of structural features of the '<em>Import Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pipeline.impl.ExportOperationImpl <em>Export Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.ExportOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getExportOperation()
	 * @generated
	 */
	int EXPORT_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_OPERATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Write</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_OPERATION__WRITE = 1;

	/**
	 * The number of structural features of the '<em>Export Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pipeline.impl.CleaningOperationImpl <em>Cleaning Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.CleaningOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getCleaningOperation()
	 * @generated
	 */
	int CLEANING_OPERATION = 19;

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
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_OPERATION__ID = OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Input Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_OPERATION__INPUT_ATTRIBUTES = OPERATION__INPUT_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Cleaning Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pipeline.impl.UserDefinedCleaningOperationImpl <em>User Defined Cleaning Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.UserDefinedCleaningOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getUserDefinedCleaningOperation()
	 * @generated
	 */
	int USER_DEFINED_CLEANING_OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CLEANING_OPERATION__INCOMING = CLEANING_OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CLEANING_OPERATION__OUTGOING = CLEANING_OPERATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CLEANING_OPERATION__ID = CLEANING_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Input Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CLEANING_OPERATION__INPUT_ATTRIBUTES = CLEANING_OPERATION__INPUT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CLEANING_OPERATION__TYPE = CLEANING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Defined Cleaning Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_CLEANING_OPERATION_FEATURE_COUNT = CLEANING_OPERATION_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SERVER_NAME = 2;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PORT_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__USER_NAME = 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PASSWORD = 5;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__FORMAT = 6;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 7;

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
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = 2;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pipeline.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.ChartImpl
	 * @see pipeline.impl.PipelinePackageImpl#getChart()
	 * @generated
	 */
	int CHART = 18;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Axes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__AXES = 3;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link pipeline.impl.AnalysisOperationImpl <em>Analysis Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.AnalysisOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getAnalysisOperation()
	 * @generated
	 */
	int ANALYSIS_OPERATION = 20;

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
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION__ID = OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Input Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION__INPUT_ATTRIBUTES = OPERATION__INPUT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Output Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analysis Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.DescriptiveAnalysisOperationImpl <em>Descriptive Analysis Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.DescriptiveAnalysisOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getDescriptiveAnalysisOperation()
	 * @generated
	 */
	int DESCRIPTIVE_ANALYSIS_OPERATION = 21;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ANALYSIS_OPERATION__INCOMING = ANALYSIS_OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ANALYSIS_OPERATION__OUTGOING = ANALYSIS_OPERATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ANALYSIS_OPERATION__ID = ANALYSIS_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Input Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ANALYSIS_OPERATION__INPUT_ATTRIBUTES = ANALYSIS_OPERATION__INPUT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Output Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES = ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ANALYSIS_OPERATION__TYPE = ANALYSIS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Descriptive Analysis Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_ANALYSIS_OPERATION_FEATURE_COUNT = ANALYSIS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.ClassificationAnalysisOperationImpl <em>Classification Analysis Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.ClassificationAnalysisOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getClassificationAnalysisOperation()
	 * @generated
	 */
	int CLASSIFICATION_ANALYSIS_OPERATION = 22;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ANALYSIS_OPERATION__INCOMING = ANALYSIS_OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ANALYSIS_OPERATION__OUTGOING = ANALYSIS_OPERATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ANALYSIS_OPERATION__ID = ANALYSIS_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Input Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ANALYSIS_OPERATION__INPUT_ATTRIBUTES = ANALYSIS_OPERATION__INPUT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Output Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES = ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ANALYSIS_OPERATION__TYPE = ANALYSIS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classification Analysis Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_ANALYSIS_OPERATION_FEATURE_COUNT = ANALYSIS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.PredictiveAnalysisOperationImpl <em>Predictive Analysis Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.PredictiveAnalysisOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getPredictiveAnalysisOperation()
	 * @generated
	 */
	int PREDICTIVE_ANALYSIS_OPERATION = 23;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_ANALYSIS_OPERATION__INCOMING = ANALYSIS_OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_ANALYSIS_OPERATION__OUTGOING = ANALYSIS_OPERATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_ANALYSIS_OPERATION__ID = ANALYSIS_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Input Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_ANALYSIS_OPERATION__INPUT_ATTRIBUTES = ANALYSIS_OPERATION__INPUT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Output Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES = ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_ANALYSIS_OPERATION__TYPE = ANALYSIS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predictive Analysis Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_ANALYSIS_OPERATION_FEATURE_COUNT = ANALYSIS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.ClusteringAnalysisOperationImpl <em>Clustering Analysis Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.ClusteringAnalysisOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getClusteringAnalysisOperation()
	 * @generated
	 */
	int CLUSTERING_ANALYSIS_OPERATION = 24;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ANALYSIS_OPERATION__INCOMING = ANALYSIS_OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ANALYSIS_OPERATION__OUTGOING = ANALYSIS_OPERATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ANALYSIS_OPERATION__ID = ANALYSIS_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Input Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ANALYSIS_OPERATION__INPUT_ATTRIBUTES = ANALYSIS_OPERATION__INPUT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Output Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES = ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ANALYSIS_OPERATION__TYPE = ANALYSIS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ANALYSIS_OPERATION__K = ANALYSIS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clustering Analysis Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_ANALYSIS_OPERATION_FEATURE_COUNT = ANALYSIS_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pipeline.impl.PredefinedCleaningOperationImpl <em>Predefined Cleaning Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.PredefinedCleaningOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getPredefinedCleaningOperation()
	 * @generated
	 */
	int PREDEFINED_CLEANING_OPERATION = 25;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_CLEANING_OPERATION__INCOMING = CLEANING_OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_CLEANING_OPERATION__OUTGOING = CLEANING_OPERATION__OUTGOING;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_CLEANING_OPERATION__ID = CLEANING_OPERATION__ID;

	/**
	 * The feature id for the '<em><b>Input Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_CLEANING_OPERATION__INPUT_ATTRIBUTES = CLEANING_OPERATION__INPUT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_CLEANING_OPERATION__TYPE = CLEANING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predefined Cleaning Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_CLEANING_OPERATION_FEATURE_COUNT = CLEANING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.SimpleAttributeImpl
	 * @see pipeline.impl.PipelinePackageImpl#getSimpleAttribute()
	 * @generated
	 */
	int SIMPLE_ATTRIBUTE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__NEXT = ATTRIBUTE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__PREVIOUS = ATTRIBUTE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.ComplexAttributeImpl <em>Complex Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.ComplexAttributeImpl
	 * @see pipeline.impl.PipelinePackageImpl#getComplexAttribute()
	 * @generated
	 */
	int COMPLEX_ATTRIBUTE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ATTRIBUTE__NEXT = ATTRIBUTE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ATTRIBUTE__PREVIOUS = ATTRIBUTE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ATTRIBUTE__ATTRIBUTES = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pipeline.impl.VisualizationOperationImpl <em>Visualization Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.VisualizationOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getVisualizationOperation()
	 * @generated
	 */
	int VISUALIZATION_OPERATION = 28;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_OPERATION__CHART = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_OPERATION__ID = 1;

	/**
	 * The number of structural features of the '<em>Visualization Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pipeline.impl.IntegrationOperationImpl <em>Integration Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.IntegrationOperationImpl
	 * @see pipeline.impl.PipelinePackageImpl#getIntegrationOperation()
	 * @generated
	 */
	int INTEGRATION_OPERATION = 29;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_OPERATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_OPERATION__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Integration Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pipeline.PredefinedOperation <em>Predefined Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.PredefinedOperation
	 * @see pipeline.impl.PipelinePackageImpl#getPredefinedOperation()
	 * @generated
	 */
	int PREDEFINED_OPERATION = 30;

	/**
	 * The meta object id for the '{@link pipeline.ClusteringOperation <em>Clustering Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.ClusteringOperation
	 * @see pipeline.impl.PipelinePackageImpl#getClusteringOperation()
	 * @generated
	 */
	int CLUSTERING_OPERATION = 31;

	/**
	 * The meta object id for the '{@link pipeline.ClassificationOperation <em>Classification Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.ClassificationOperation
	 * @see pipeline.impl.PipelinePackageImpl#getClassificationOperation()
	 * @generated
	 */
	int CLASSIFICATION_OPERATION = 32;

	/**
	 * The meta object id for the '{@link pipeline.PredictiveOperation <em>Predictive Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.PredictiveOperation
	 * @see pipeline.impl.PipelinePackageImpl#getPredictiveOperation()
	 * @generated
	 */
	int PREDICTIVE_OPERATION = 33;

	/**
	 * The meta object id for the '{@link pipeline.DescriptiveOperation <em>Descriptive Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.DescriptiveOperation
	 * @see pipeline.impl.PipelinePackageImpl#getDescriptiveOperation()
	 * @generated
	 */
	int DESCRIPTIVE_OPERATION = 34;

	/**
	 * The meta object id for the '{@link pipeline.ChartType <em>Chart Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.ChartType
	 * @see pipeline.impl.PipelinePackageImpl#getChartType()
	 * @generated
	 */
	int CHART_TYPE = 35;

	/**
	 * The meta object id for the '{@link pipeline.Format <em>Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.Format
	 * @see pipeline.impl.PipelinePackageImpl#getFormat()
	 * @generated
	 */
	int FORMAT = 36;

	/**
	 * The meta object id for the '{@link pipeline.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.Size
	 * @see pipeline.impl.PipelinePackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 37;

	/**
	 * The meta object id for the '{@link pipeline.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.Type
	 * @see pipeline.impl.PipelinePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 38;


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
	 * Returns the meta object for the containment reference list '{@link pipeline.Pipeline#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see pipeline.Pipeline#getSources()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.Pipeline#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see pipeline.Pipeline#getFiles()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Files();

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
	 * Returns the meta object for the containment reference list '{@link pipeline.Pipeline#getCharts <em>Charts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Charts</em>'.
	 * @see pipeline.Pipeline#getCharts()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Charts();

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
	 * Returns the meta object for the reference '{@link pipeline.DataFlow#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see pipeline.DataFlow#getSchema()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Schema();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.DataFlow#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see pipeline.DataFlow#getID()
	 * @see #getDataFlow()
	 * @generated
	 */
	EAttribute getDataFlow_ID();

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
	 * Returns the meta object for the attribute '{@link pipeline.Operation#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see pipeline.Operation#getID()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ID();

	/**
	 * Returns the meta object for the reference list '{@link pipeline.Operation#getInputAttributes <em>Input Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Attributes</em>'.
	 * @see pipeline.Operation#getInputAttributes()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_InputAttributes();

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
	 * Returns the meta object for the attribute '{@link pipeline.InternalDataFlow#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see pipeline.InternalDataFlow#getID()
	 * @see #getInternalDataFlow()
	 * @generated
	 */
	EAttribute getInternalDataFlow_ID();

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
	 * Returns the meta object for the attribute '{@link pipeline.Schema#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see pipeline.Schema#getID()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ID();

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
	 * Returns the meta object for the containment reference list '{@link pipeline.CollectionTask#getImportOperations <em>Import Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import Operations</em>'.
	 * @see pipeline.CollectionTask#getImportOperations()
	 * @see #getCollectionTask()
	 * @generated
	 */
	EReference getCollectionTask_ImportOperations();

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
	 * Returns the meta object for the containment reference list '{@link pipeline.IntegrationTask#getIntegrationOperations <em>Integration Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integration Operations</em>'.
	 * @see pipeline.IntegrationTask#getIntegrationOperations()
	 * @see #getIntegrationTask()
	 * @generated
	 */
	EReference getIntegrationTask_IntegrationOperations();

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
	 * Returns the meta object for the containment reference list '{@link pipeline.CleaningTask#getCleaningOperations <em>Cleaning Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cleaning Operations</em>'.
	 * @see pipeline.CleaningTask#getCleaningOperations()
	 * @see #getCleaningTask()
	 * @generated
	 */
	EReference getCleaningTask_CleaningOperations();

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
	 * Returns the meta object for the containment reference list '{@link pipeline.AnalysisTask#getAnalysisOperations <em>Analysis Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analysis Operations</em>'.
	 * @see pipeline.AnalysisTask#getAnalysisOperations()
	 * @see #getAnalysisTask()
	 * @generated
	 */
	EReference getAnalysisTask_AnalysisOperations();

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
	 * Returns the meta object for the containment reference list '{@link pipeline.VisualizationTask#getVisualizationOperations <em>Visualization Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visualization Operations</em>'.
	 * @see pipeline.VisualizationTask#getVisualizationOperations()
	 * @see #getVisualizationTask()
	 * @generated
	 */
	EReference getVisualizationTask_VisualizationOperations();

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
	 * Returns the meta object for the containment reference list '{@link pipeline.ExportTask#getExportOperations <em>Export Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Export Operations</em>'.
	 * @see pipeline.ExportTask#getExportOperations()
	 * @see #getExportTask()
	 * @generated
	 */
	EReference getExportTask_ExportOperations();

	/**
	 * Returns the meta object for class '{@link pipeline.ImportOperation <em>Import Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Operation</em>'.
	 * @see pipeline.ImportOperation
	 * @generated
	 */
	EClass getImportOperation();

	/**
	 * Returns the meta object for the reference '{@link pipeline.ImportOperation#getRead <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Read</em>'.
	 * @see pipeline.ImportOperation#getRead()
	 * @see #getImportOperation()
	 * @generated
	 */
	EReference getImportOperation_Read();

	/**
	 * Returns the meta object for the reference '{@link pipeline.ImportOperation#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see pipeline.ImportOperation#getUse()
	 * @see #getImportOperation()
	 * @generated
	 */
	EReference getImportOperation_Use();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.ImportOperation#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see pipeline.ImportOperation#getID()
	 * @see #getImportOperation()
	 * @generated
	 */
	EAttribute getImportOperation_ID();

	/**
	 * Returns the meta object for class '{@link pipeline.ExportOperation <em>Export Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Operation</em>'.
	 * @see pipeline.ExportOperation
	 * @generated
	 */
	EClass getExportOperation();

	/**
	 * Returns the meta object for the reference '{@link pipeline.ExportOperation#getWrite <em>Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Write</em>'.
	 * @see pipeline.ExportOperation#getWrite()
	 * @see #getExportOperation()
	 * @generated
	 */
	EReference getExportOperation_Write();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.ExportOperation#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see pipeline.ExportOperation#getID()
	 * @see #getExportOperation()
	 * @generated
	 */
	EAttribute getExportOperation_ID();

	/**
	 * Returns the meta object for class '{@link pipeline.UserDefinedCleaningOperation <em>User Defined Cleaning Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined Cleaning Operation</em>'.
	 * @see pipeline.UserDefinedCleaningOperation
	 * @generated
	 */
	EClass getUserDefinedCleaningOperation();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.UserDefinedCleaningOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipeline.UserDefinedCleaningOperation#getType()
	 * @see #getUserDefinedCleaningOperation()
	 * @generated
	 */
	EAttribute getUserDefinedCleaningOperation_Type();

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
	 * Returns the meta object for the attribute '{@link pipeline.Source#getServerName <em>Server Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Name</em>'.
	 * @see pipeline.Source#getServerName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_ServerName();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Source#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see pipeline.Source#getPortNumber()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_PortNumber();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Source#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see pipeline.Source#getUserName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_UserName();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Source#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see pipeline.Source#getPassword()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Password();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Source#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see pipeline.Source#getFormat()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Format();

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
	 * Returns the meta object for the attribute '{@link pipeline.File#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see pipeline.File#getFormat()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Format();

	/**
	 * Returns the meta object for class '{@link pipeline.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see pipeline.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Chart#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see pipeline.Chart#getSize()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Size();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Chart#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see pipeline.Chart#getTitle()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Title();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Chart#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipeline.Chart#getType()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Type();

	/**
	 * Returns the meta object for the reference list '{@link pipeline.Chart#getAxes <em>Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Axes</em>'.
	 * @see pipeline.Chart#getAxes()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Axes();

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
	 * Returns the meta object for the reference list '{@link pipeline.AnalysisOperation#getOutputAttributes <em>Output Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Attributes</em>'.
	 * @see pipeline.AnalysisOperation#getOutputAttributes()
	 * @see #getAnalysisOperation()
	 * @generated
	 */
	EReference getAnalysisOperation_OutputAttributes();

	/**
	 * Returns the meta object for class '{@link pipeline.DescriptiveAnalysisOperation <em>Descriptive Analysis Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptive Analysis Operation</em>'.
	 * @see pipeline.DescriptiveAnalysisOperation
	 * @generated
	 */
	EClass getDescriptiveAnalysisOperation();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.DescriptiveAnalysisOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipeline.DescriptiveAnalysisOperation#getType()
	 * @see #getDescriptiveAnalysisOperation()
	 * @generated
	 */
	EAttribute getDescriptiveAnalysisOperation_Type();

	/**
	 * Returns the meta object for class '{@link pipeline.ClassificationAnalysisOperation <em>Classification Analysis Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Analysis Operation</em>'.
	 * @see pipeline.ClassificationAnalysisOperation
	 * @generated
	 */
	EClass getClassificationAnalysisOperation();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.ClassificationAnalysisOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipeline.ClassificationAnalysisOperation#getType()
	 * @see #getClassificationAnalysisOperation()
	 * @generated
	 */
	EAttribute getClassificationAnalysisOperation_Type();

	/**
	 * Returns the meta object for class '{@link pipeline.PredictiveAnalysisOperation <em>Predictive Analysis Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predictive Analysis Operation</em>'.
	 * @see pipeline.PredictiveAnalysisOperation
	 * @generated
	 */
	EClass getPredictiveAnalysisOperation();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.PredictiveAnalysisOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipeline.PredictiveAnalysisOperation#getType()
	 * @see #getPredictiveAnalysisOperation()
	 * @generated
	 */
	EAttribute getPredictiveAnalysisOperation_Type();

	/**
	 * Returns the meta object for class '{@link pipeline.ClusteringAnalysisOperation <em>Clustering Analysis Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clustering Analysis Operation</em>'.
	 * @see pipeline.ClusteringAnalysisOperation
	 * @generated
	 */
	EClass getClusteringAnalysisOperation();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.ClusteringAnalysisOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipeline.ClusteringAnalysisOperation#getType()
	 * @see #getClusteringAnalysisOperation()
	 * @generated
	 */
	EAttribute getClusteringAnalysisOperation_Type();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.ClusteringAnalysisOperation#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see pipeline.ClusteringAnalysisOperation#getK()
	 * @see #getClusteringAnalysisOperation()
	 * @generated
	 */
	EAttribute getClusteringAnalysisOperation_K();

	/**
	 * Returns the meta object for class '{@link pipeline.PredefinedCleaningOperation <em>Predefined Cleaning Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined Cleaning Operation</em>'.
	 * @see pipeline.PredefinedCleaningOperation
	 * @generated
	 */
	EClass getPredefinedCleaningOperation();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.PredefinedCleaningOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipeline.PredefinedCleaningOperation#getType()
	 * @see #getPredefinedCleaningOperation()
	 * @generated
	 */
	EAttribute getPredefinedCleaningOperation_Type();

	/**
	 * Returns the meta object for class '{@link pipeline.SimpleAttribute <em>Simple Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Attribute</em>'.
	 * @see pipeline.SimpleAttribute
	 * @generated
	 */
	EClass getSimpleAttribute();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.SimpleAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pipeline.SimpleAttribute#getType()
	 * @see #getSimpleAttribute()
	 * @generated
	 */
	EAttribute getSimpleAttribute_Type();

	/**
	 * Returns the meta object for class '{@link pipeline.ComplexAttribute <em>Complex Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Attribute</em>'.
	 * @see pipeline.ComplexAttribute
	 * @generated
	 */
	EClass getComplexAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.ComplexAttribute#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see pipeline.ComplexAttribute#getAttributes()
	 * @see #getComplexAttribute()
	 * @generated
	 */
	EReference getComplexAttribute_Attributes();

	/**
	 * Returns the meta object for class '{@link pipeline.VisualizationOperation <em>Visualization Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization Operation</em>'.
	 * @see pipeline.VisualizationOperation
	 * @generated
	 */
	EClass getVisualizationOperation();

	/**
	 * Returns the meta object for the reference '{@link pipeline.VisualizationOperation#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chart</em>'.
	 * @see pipeline.VisualizationOperation#getChart()
	 * @see #getVisualizationOperation()
	 * @generated
	 */
	EReference getVisualizationOperation_Chart();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.VisualizationOperation#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see pipeline.VisualizationOperation#getID()
	 * @see #getVisualizationOperation()
	 * @generated
	 */
	EAttribute getVisualizationOperation_ID();

	/**
	 * Returns the meta object for class '{@link pipeline.IntegrationOperation <em>Integration Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration Operation</em>'.
	 * @see pipeline.IntegrationOperation
	 * @generated
	 */
	EClass getIntegrationOperation();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.IntegrationOperation#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see pipeline.IntegrationOperation#getID()
	 * @see #getIntegrationOperation()
	 * @generated
	 */
	EAttribute getIntegrationOperation_ID();

	/**
	 * Returns the meta object for the reference list '{@link pipeline.IntegrationOperation#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see pipeline.IntegrationOperation#getAttributes()
	 * @see #getIntegrationOperation()
	 * @generated
	 */
	EReference getIntegrationOperation_Attributes();

	/**
	 * Returns the meta object for enum '{@link pipeline.PredefinedOperation <em>Predefined Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Predefined Operation</em>'.
	 * @see pipeline.PredefinedOperation
	 * @generated
	 */
	EEnum getPredefinedOperation();

	/**
	 * Returns the meta object for enum '{@link pipeline.ClusteringOperation <em>Clustering Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clustering Operation</em>'.
	 * @see pipeline.ClusteringOperation
	 * @generated
	 */
	EEnum getClusteringOperation();

	/**
	 * Returns the meta object for enum '{@link pipeline.ClassificationOperation <em>Classification Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classification Operation</em>'.
	 * @see pipeline.ClassificationOperation
	 * @generated
	 */
	EEnum getClassificationOperation();

	/**
	 * Returns the meta object for enum '{@link pipeline.PredictiveOperation <em>Predictive Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Predictive Operation</em>'.
	 * @see pipeline.PredictiveOperation
	 * @generated
	 */
	EEnum getPredictiveOperation();

	/**
	 * Returns the meta object for enum '{@link pipeline.DescriptiveOperation <em>Descriptive Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Descriptive Operation</em>'.
	 * @see pipeline.DescriptiveOperation
	 * @generated
	 */
	EEnum getDescriptiveOperation();

	/**
	 * Returns the meta object for enum '{@link pipeline.ChartType <em>Chart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Chart Type</em>'.
	 * @see pipeline.ChartType
	 * @generated
	 */
	EEnum getChartType();

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
	 * Returns the meta object for enum '{@link pipeline.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size</em>'.
	 * @see pipeline.Size
	 * @generated
	 */
	EEnum getSize();

	/**
	 * Returns the meta object for enum '{@link pipeline.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see pipeline.Type
	 * @generated
	 */
	EEnum getType();

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
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__SOURCES = eINSTANCE.getPipeline_Sources();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__FILES = eINSTANCE.getPipeline_Files();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__SCHEMAS = eINSTANCE.getPipeline_Schemas();

		/**
		 * The meta object literal for the '<em><b>Charts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__CHARTS = eINSTANCE.getPipeline_Charts();

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
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__SCHEMA = eINSTANCE.getDataFlow_Schema();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW__ID = eINSTANCE.getDataFlow_ID();

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
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ID = eINSTANCE.getOperation_ID();

		/**
		 * The meta object literal for the '<em><b>Input Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INPUT_ATTRIBUTES = eINSTANCE.getOperation_InputAttributes();

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
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DATA_FLOW__ID = eINSTANCE.getInternalDataFlow_ID();

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
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__ID = eINSTANCE.getSchema_ID();

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
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__NEXT = eINSTANCE.getAttribute_Next();

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
		 * The meta object literal for the '<em><b>Import Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TASK__IMPORT_OPERATIONS = eINSTANCE.getCollectionTask_ImportOperations();

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
		 * The meta object literal for the '<em><b>Integration Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_TASK__INTEGRATION_OPERATIONS = eINSTANCE.getIntegrationTask_IntegrationOperations();

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
		 * The meta object literal for the '<em><b>Cleaning Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEANING_TASK__CLEANING_OPERATIONS = eINSTANCE.getCleaningTask_CleaningOperations();

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
		 * The meta object literal for the '<em><b>Analysis Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_TASK__ANALYSIS_OPERATIONS = eINSTANCE.getAnalysisTask_AnalysisOperations();

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
		 * The meta object literal for the '<em><b>Visualization Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION_TASK__VISUALIZATION_OPERATIONS = eINSTANCE.getVisualizationTask_VisualizationOperations();

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
		 * The meta object literal for the '<em><b>Export Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORT_TASK__EXPORT_OPERATIONS = eINSTANCE.getExportTask_ExportOperations();

		/**
		 * The meta object literal for the '{@link pipeline.impl.ImportOperationImpl <em>Import Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.ImportOperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getImportOperation()
		 * @generated
		 */
		EClass IMPORT_OPERATION = eINSTANCE.getImportOperation();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_OPERATION__READ = eINSTANCE.getImportOperation_Read();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_OPERATION__USE = eINSTANCE.getImportOperation_Use();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_OPERATION__ID = eINSTANCE.getImportOperation_ID();

		/**
		 * The meta object literal for the '{@link pipeline.impl.ExportOperationImpl <em>Export Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.ExportOperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getExportOperation()
		 * @generated
		 */
		EClass EXPORT_OPERATION = eINSTANCE.getExportOperation();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORT_OPERATION__WRITE = eINSTANCE.getExportOperation_Write();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORT_OPERATION__ID = eINSTANCE.getExportOperation_ID();

		/**
		 * The meta object literal for the '{@link pipeline.impl.UserDefinedCleaningOperationImpl <em>User Defined Cleaning Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.UserDefinedCleaningOperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getUserDefinedCleaningOperation()
		 * @generated
		 */
		EClass USER_DEFINED_CLEANING_OPERATION = eINSTANCE.getUserDefinedCleaningOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DEFINED_CLEANING_OPERATION__TYPE = eINSTANCE.getUserDefinedCleaningOperation_Type();

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
		 * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__SERVER_NAME = eINSTANCE.getSource_ServerName();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__PORT_NUMBER = eINSTANCE.getSource_PortNumber();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__USER_NAME = eINSTANCE.getSource_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__PASSWORD = eINSTANCE.getSource_Password();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__FORMAT = eINSTANCE.getSource_Format();

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
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FORMAT = eINSTANCE.getFile_Format();

		/**
		 * The meta object literal for the '{@link pipeline.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.ChartImpl
		 * @see pipeline.impl.PipelinePackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__SIZE = eINSTANCE.getChart_Size();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__TITLE = eINSTANCE.getChart_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__TYPE = eINSTANCE.getChart_Type();

		/**
		 * The meta object literal for the '<em><b>Axes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__AXES = eINSTANCE.getChart_Axes();

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
		 * The meta object literal for the '<em><b>Output Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_OPERATION__OUTPUT_ATTRIBUTES = eINSTANCE.getAnalysisOperation_OutputAttributes();

		/**
		 * The meta object literal for the '{@link pipeline.impl.DescriptiveAnalysisOperationImpl <em>Descriptive Analysis Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.DescriptiveAnalysisOperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getDescriptiveAnalysisOperation()
		 * @generated
		 */
		EClass DESCRIPTIVE_ANALYSIS_OPERATION = eINSTANCE.getDescriptiveAnalysisOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTIVE_ANALYSIS_OPERATION__TYPE = eINSTANCE.getDescriptiveAnalysisOperation_Type();

		/**
		 * The meta object literal for the '{@link pipeline.impl.ClassificationAnalysisOperationImpl <em>Classification Analysis Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.ClassificationAnalysisOperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getClassificationAnalysisOperation()
		 * @generated
		 */
		EClass CLASSIFICATION_ANALYSIS_OPERATION = eINSTANCE.getClassificationAnalysisOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION_ANALYSIS_OPERATION__TYPE = eINSTANCE.getClassificationAnalysisOperation_Type();

		/**
		 * The meta object literal for the '{@link pipeline.impl.PredictiveAnalysisOperationImpl <em>Predictive Analysis Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.PredictiveAnalysisOperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getPredictiveAnalysisOperation()
		 * @generated
		 */
		EClass PREDICTIVE_ANALYSIS_OPERATION = eINSTANCE.getPredictiveAnalysisOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICTIVE_ANALYSIS_OPERATION__TYPE = eINSTANCE.getPredictiveAnalysisOperation_Type();

		/**
		 * The meta object literal for the '{@link pipeline.impl.ClusteringAnalysisOperationImpl <em>Clustering Analysis Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.ClusteringAnalysisOperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getClusteringAnalysisOperation()
		 * @generated
		 */
		EClass CLUSTERING_ANALYSIS_OPERATION = eINSTANCE.getClusteringAnalysisOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTERING_ANALYSIS_OPERATION__TYPE = eINSTANCE.getClusteringAnalysisOperation_Type();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTERING_ANALYSIS_OPERATION__K = eINSTANCE.getClusteringAnalysisOperation_K();

		/**
		 * The meta object literal for the '{@link pipeline.impl.PredefinedCleaningOperationImpl <em>Predefined Cleaning Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.PredefinedCleaningOperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getPredefinedCleaningOperation()
		 * @generated
		 */
		EClass PREDEFINED_CLEANING_OPERATION = eINSTANCE.getPredefinedCleaningOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDEFINED_CLEANING_OPERATION__TYPE = eINSTANCE.getPredefinedCleaningOperation_Type();

		/**
		 * The meta object literal for the '{@link pipeline.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.SimpleAttributeImpl
		 * @see pipeline.impl.PipelinePackageImpl#getSimpleAttribute()
		 * @generated
		 */
		EClass SIMPLE_ATTRIBUTE = eINSTANCE.getSimpleAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ATTRIBUTE__TYPE = eINSTANCE.getSimpleAttribute_Type();

		/**
		 * The meta object literal for the '{@link pipeline.impl.ComplexAttributeImpl <em>Complex Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.ComplexAttributeImpl
		 * @see pipeline.impl.PipelinePackageImpl#getComplexAttribute()
		 * @generated
		 */
		EClass COMPLEX_ATTRIBUTE = eINSTANCE.getComplexAttribute();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_ATTRIBUTE__ATTRIBUTES = eINSTANCE.getComplexAttribute_Attributes();

		/**
		 * The meta object literal for the '{@link pipeline.impl.VisualizationOperationImpl <em>Visualization Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.VisualizationOperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getVisualizationOperation()
		 * @generated
		 */
		EClass VISUALIZATION_OPERATION = eINSTANCE.getVisualizationOperation();

		/**
		 * The meta object literal for the '<em><b>Chart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION_OPERATION__CHART = eINSTANCE.getVisualizationOperation_Chart();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION_OPERATION__ID = eINSTANCE.getVisualizationOperation_ID();

		/**
		 * The meta object literal for the '{@link pipeline.impl.IntegrationOperationImpl <em>Integration Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.IntegrationOperationImpl
		 * @see pipeline.impl.PipelinePackageImpl#getIntegrationOperation()
		 * @generated
		 */
		EClass INTEGRATION_OPERATION = eINSTANCE.getIntegrationOperation();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRATION_OPERATION__ID = eINSTANCE.getIntegrationOperation_ID();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_OPERATION__ATTRIBUTES = eINSTANCE.getIntegrationOperation_Attributes();

		/**
		 * The meta object literal for the '{@link pipeline.PredefinedOperation <em>Predefined Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.PredefinedOperation
		 * @see pipeline.impl.PipelinePackageImpl#getPredefinedOperation()
		 * @generated
		 */
		EEnum PREDEFINED_OPERATION = eINSTANCE.getPredefinedOperation();

		/**
		 * The meta object literal for the '{@link pipeline.ClusteringOperation <em>Clustering Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.ClusteringOperation
		 * @see pipeline.impl.PipelinePackageImpl#getClusteringOperation()
		 * @generated
		 */
		EEnum CLUSTERING_OPERATION = eINSTANCE.getClusteringOperation();

		/**
		 * The meta object literal for the '{@link pipeline.ClassificationOperation <em>Classification Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.ClassificationOperation
		 * @see pipeline.impl.PipelinePackageImpl#getClassificationOperation()
		 * @generated
		 */
		EEnum CLASSIFICATION_OPERATION = eINSTANCE.getClassificationOperation();

		/**
		 * The meta object literal for the '{@link pipeline.PredictiveOperation <em>Predictive Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.PredictiveOperation
		 * @see pipeline.impl.PipelinePackageImpl#getPredictiveOperation()
		 * @generated
		 */
		EEnum PREDICTIVE_OPERATION = eINSTANCE.getPredictiveOperation();

		/**
		 * The meta object literal for the '{@link pipeline.DescriptiveOperation <em>Descriptive Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.DescriptiveOperation
		 * @see pipeline.impl.PipelinePackageImpl#getDescriptiveOperation()
		 * @generated
		 */
		EEnum DESCRIPTIVE_OPERATION = eINSTANCE.getDescriptiveOperation();

		/**
		 * The meta object literal for the '{@link pipeline.ChartType <em>Chart Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.ChartType
		 * @see pipeline.impl.PipelinePackageImpl#getChartType()
		 * @generated
		 */
		EEnum CHART_TYPE = eINSTANCE.getChartType();

		/**
		 * The meta object literal for the '{@link pipeline.Format <em>Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.Format
		 * @see pipeline.impl.PipelinePackageImpl#getFormat()
		 * @generated
		 */
		EEnum FORMAT = eINSTANCE.getFormat();

		/**
		 * The meta object literal for the '{@link pipeline.Size <em>Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.Size
		 * @see pipeline.impl.PipelinePackageImpl#getSize()
		 * @generated
		 */
		EEnum SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link pipeline.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.Type
		 * @see pipeline.impl.PipelinePackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //PipelinePackage
