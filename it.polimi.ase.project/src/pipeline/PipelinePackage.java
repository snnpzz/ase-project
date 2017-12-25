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
	 * The feature id for the '<em><b>Dataflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__DATAFLOWS = 0;

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
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

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
	 * The meta object id for the '{@link pipeline.impl.DataflowImpl <em>Dataflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.DataflowImpl
	 * @see pipeline.impl.PipelinePackageImpl#getDataflow()
	 * @generated
	 */
	int DATAFLOW = 2;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW__SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW__SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Dataflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_FEATURE_COUNT = 4;

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
	 * The meta object id for the '{@link pipeline.impl.InternalDFImpl <em>Internal DF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.InternalDFImpl
	 * @see pipeline.impl.PipelinePackageImpl#getInternalDF()
	 * @generated
	 */
	int INTERNAL_DF = 4;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DF__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DF__SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DF__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DF__TARGET = 3;

	/**
	 * The number of structural features of the '<em>Internal DF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DF_FEATURE_COUNT = 4;

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
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TASK__NAME = TASK__NAME;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TASK__NAME = TASK__NAME;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_TASK__NAME = TASK__NAME;

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
	 * The meta object id for the '{@link pipeline.impl.AnalyzesTaskImpl <em>Analyzes Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.AnalyzesTaskImpl
	 * @see pipeline.impl.PipelinePackageImpl#getAnalyzesTask()
	 * @generated
	 */
	int ANALYZES_TASK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZES_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZES_TASK__IS_REQUIRED = TASK__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZES_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZES_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Analyzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZES_TASK__ANALYZES = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analyzes Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZES_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_TASK__NAME = TASK__NAME;

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
	 * The meta object id for the '{@link pipeline.impl.ExportingTaskImpl <em>Exporting Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.ExportingTaskImpl
	 * @see pipeline.impl.PipelinePackageImpl#getExportingTask()
	 * @generated
	 */
	int EXPORTING_TASK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTING_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTING_TASK__IS_REQUIRED = TASK__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTING_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTING_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Exports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTING_TASK__EXPORTS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exporting Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTING_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__USES = 1;

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
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__USES = 1;

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
	 * The meta object id for the '{@link pipeline.impl.AnalysisOpImpl <em>Analysis Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pipeline.impl.AnalysisOpImpl
	 * @see pipeline.impl.PipelinePackageImpl#getAnalysisOp()
	 * @generated
	 */
	int ANALYSIS_OP = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OP__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OP__INCOMING = OPERATION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OP__OUTGOING = OPERATION__OUTGOING;

	/**
	 * The number of structural features of the '<em>Analysis Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OP_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

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
	int DESCRIPTIVE__NAME = ANALYSIS_OP__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__INCOMING = ANALYSIS_OP__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__OUTGOING = ANALYSIS_OP__OUTGOING;

	/**
	 * The number of structural features of the '<em>Descriptive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_FEATURE_COUNT = ANALYSIS_OP_FEATURE_COUNT + 0;

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
	int CLASSIFICATION__NAME = ANALYSIS_OP__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__INCOMING = ANALYSIS_OP__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__OUTGOING = ANALYSIS_OP__OUTGOING;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FEATURE_COUNT = ANALYSIS_OP_FEATURE_COUNT + 0;

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
	int PREDICTIVE__NAME = ANALYSIS_OP__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE__INCOMING = ANALYSIS_OP__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE__OUTGOING = ANALYSIS_OP__OUTGOING;

	/**
	 * The number of structural features of the '<em>Predictive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_FEATURE_COUNT = ANALYSIS_OP_FEATURE_COUNT + 0;

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
	int CLUSTERING__NAME = ANALYSIS_OP__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__INCOMING = ANALYSIS_OP__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__OUTGOING = ANALYSIS_OP__OUTGOING;

	/**
	 * The number of structural features of the '<em>Clustering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FEATURE_COUNT = ANALYSIS_OP_FEATURE_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link pipeline.Pipeline#getDataflows <em>Dataflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataflows</em>'.
	 * @see pipeline.Pipeline#getDataflows()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Dataflows();

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
	 * Returns the meta object for class '{@link pipeline.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see pipeline.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pipeline.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

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
	 * Returns the meta object for class '{@link pipeline.Dataflow <em>Dataflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataflow</em>'.
	 * @see pipeline.Dataflow
	 * @generated
	 */
	EClass getDataflow();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.Dataflow#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see pipeline.Dataflow#getFormat()
	 * @see #getDataflow()
	 * @generated
	 */
	EAttribute getDataflow_Format();

	/**
	 * Returns the meta object for the containment reference '{@link pipeline.Dataflow#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see pipeline.Dataflow#getSchema()
	 * @see #getDataflow()
	 * @generated
	 */
	EReference getDataflow_Schema();

	/**
	 * Returns the meta object for the reference '{@link pipeline.Dataflow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see pipeline.Dataflow#getTarget()
	 * @see #getDataflow()
	 * @generated
	 */
	EReference getDataflow_Target();

	/**
	 * Returns the meta object for the reference '{@link pipeline.Dataflow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see pipeline.Dataflow#getSource()
	 * @see #getDataflow()
	 * @generated
	 */
	EReference getDataflow_Source();

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
	 * Returns the meta object for class '{@link pipeline.InternalDF <em>Internal DF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal DF</em>'.
	 * @see pipeline.InternalDF
	 * @generated
	 */
	EClass getInternalDF();

	/**
	 * Returns the meta object for the attribute '{@link pipeline.InternalDF#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see pipeline.InternalDF#getFormat()
	 * @see #getInternalDF()
	 * @generated
	 */
	EAttribute getInternalDF_Format();

	/**
	 * Returns the meta object for the containment reference '{@link pipeline.InternalDF#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see pipeline.InternalDF#getSchema()
	 * @see #getInternalDF()
	 * @generated
	 */
	EReference getInternalDF_Schema();

	/**
	 * Returns the meta object for the reference '{@link pipeline.InternalDF#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see pipeline.InternalDF#getSource()
	 * @see #getInternalDF()
	 * @generated
	 */
	EReference getInternalDF_Source();

	/**
	 * Returns the meta object for the reference '{@link pipeline.InternalDF#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see pipeline.InternalDF#getTarget()
	 * @see #getInternalDF()
	 * @generated
	 */
	EReference getInternalDF_Target();

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
	 * Returns the meta object for class '{@link pipeline.AnalyzesTask <em>Analyzes Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analyzes Task</em>'.
	 * @see pipeline.AnalyzesTask
	 * @generated
	 */
	EClass getAnalyzesTask();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.AnalyzesTask#getAnalyzes <em>Analyzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analyzes</em>'.
	 * @see pipeline.AnalyzesTask#getAnalyzes()
	 * @see #getAnalyzesTask()
	 * @generated
	 */
	EReference getAnalyzesTask_Analyzes();

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
	 * Returns the meta object for class '{@link pipeline.ExportingTask <em>Exporting Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exporting Task</em>'.
	 * @see pipeline.ExportingTask
	 * @generated
	 */
	EClass getExportingTask();

	/**
	 * Returns the meta object for the containment reference list '{@link pipeline.ExportingTask#getExports <em>Exports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exports</em>'.
	 * @see pipeline.ExportingTask#getExports()
	 * @see #getExportingTask()
	 * @generated
	 */
	EReference getExportingTask_Exports();

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
	 * Returns the meta object for the reference '{@link pipeline.Import#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see pipeline.Import#getUses()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Uses();

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
	 * Returns the meta object for the reference '{@link pipeline.Export#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see pipeline.Export#getUses()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Uses();

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
	 * Returns the meta object for class '{@link pipeline.AnalysisOp <em>Analysis Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Op</em>'.
	 * @see pipeline.AnalysisOp
	 * @generated
	 */
	EClass getAnalysisOp();

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
		 * The meta object literal for the '<em><b>Dataflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__DATAFLOWS = eINSTANCE.getPipeline_Dataflows();

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
		 * The meta object literal for the '{@link pipeline.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.TaskImpl
		 * @see pipeline.impl.PipelinePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

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
		 * The meta object literal for the '{@link pipeline.impl.DataflowImpl <em>Dataflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.DataflowImpl
		 * @see pipeline.impl.PipelinePackageImpl#getDataflow()
		 * @generated
		 */
		EClass DATAFLOW = eINSTANCE.getDataflow();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFLOW__FORMAT = eINSTANCE.getDataflow_Format();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAFLOW__SCHEMA = eINSTANCE.getDataflow_Schema();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAFLOW__TARGET = eINSTANCE.getDataflow_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAFLOW__SOURCE = eINSTANCE.getDataflow_Source();

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
		 * The meta object literal for the '{@link pipeline.impl.InternalDFImpl <em>Internal DF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.InternalDFImpl
		 * @see pipeline.impl.PipelinePackageImpl#getInternalDF()
		 * @generated
		 */
		EClass INTERNAL_DF = eINSTANCE.getInternalDF();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_DF__FORMAT = eINSTANCE.getInternalDF_Format();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_DF__SCHEMA = eINSTANCE.getInternalDF_Schema();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_DF__SOURCE = eINSTANCE.getInternalDF_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_DF__TARGET = eINSTANCE.getInternalDF_Target();

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
		 * The meta object literal for the '{@link pipeline.impl.AnalyzesTaskImpl <em>Analyzes Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.AnalyzesTaskImpl
		 * @see pipeline.impl.PipelinePackageImpl#getAnalyzesTask()
		 * @generated
		 */
		EClass ANALYZES_TASK = eINSTANCE.getAnalyzesTask();

		/**
		 * The meta object literal for the '<em><b>Analyzes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYZES_TASK__ANALYZES = eINSTANCE.getAnalyzesTask_Analyzes();

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
		 * The meta object literal for the '{@link pipeline.impl.ExportingTaskImpl <em>Exporting Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.ExportingTaskImpl
		 * @see pipeline.impl.PipelinePackageImpl#getExportingTask()
		 * @generated
		 */
		EClass EXPORTING_TASK = eINSTANCE.getExportingTask();

		/**
		 * The meta object literal for the '<em><b>Exports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORTING_TASK__EXPORTS = eINSTANCE.getExportingTask_Exports();

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
		 * The meta object literal for the '<em><b>Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__USES = eINSTANCE.getImport_Uses();

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
		 * The meta object literal for the '<em><b>Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORT__USES = eINSTANCE.getExport_Uses();

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
		 * The meta object literal for the '{@link pipeline.impl.AnalysisOpImpl <em>Analysis Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pipeline.impl.AnalysisOpImpl
		 * @see pipeline.impl.PipelinePackageImpl#getAnalysisOp()
		 * @generated
		 */
		EClass ANALYSIS_OP = eINSTANCE.getAnalysisOp();

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
