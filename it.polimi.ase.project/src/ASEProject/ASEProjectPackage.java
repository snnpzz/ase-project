/**
 */
package ASEProject;

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
 * @see ASEProject.ASEProjectFactory
 * @model kind="package"
 * @generated
 */
public interface ASEProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ASEProject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ase.polimi.it/project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ASEP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ASEProjectPackage eINSTANCE = ASEProject.impl.ASEProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link ASEProject.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.PipelineImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getPipeline()
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
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ASEProject.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.TaskImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getTask()
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
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NEXT = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
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
	 * The meta object id for the '{@link ASEProject.impl.DataflowImpl <em>Dataflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.DataflowImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getDataflow()
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
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW__PREVIOUS = 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW__INCOMING = 3;

	/**
	 * The number of structural features of the '<em>Dataflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFLOW_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ASEProject.impl.InternalDFImpl <em>Internal DF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.InternalDFImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getInternalDF()
	 * @generated
	 */
	int INTERNAL_DF = 3;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DF__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DF__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DF__SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DF__OUTGOING = 3;

	/**
	 * The number of structural features of the '<em>Internal DF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_DF_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ASEProject.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.SchemaImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 4;

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
	 * The meta object id for the '{@link ASEProject.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.AttributeImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

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
	 * The meta object id for the '{@link ASEProject.impl.CollectionTaskImpl <em>Collection Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.CollectionTaskImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getCollectionTask()
	 * @generated
	 */
	int COLLECTION_TASK = 6;

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
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TASK__NEXT = TASK__NEXT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
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
	 * The meta object id for the '{@link ASEProject.impl.IntegrationTaskImpl <em>Integration Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.IntegrationTaskImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getIntegrationTask()
	 * @generated
	 */
	int INTEGRATION_TASK = 7;

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
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_TASK__NEXT = TASK__NEXT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
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
	 * The meta object id for the '{@link ASEProject.impl.CleaningTaskImpl <em>Cleaning Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.CleaningTaskImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getCleaningTask()
	 * @generated
	 */
	int CLEANING_TASK = 8;

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
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_TASK__NEXT = TASK__NEXT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
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
	 * The meta object id for the '{@link ASEProject.impl.AnalyzesTaskImpl <em>Analyzes Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.AnalyzesTaskImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getAnalyzesTask()
	 * @generated
	 */
	int ANALYZES_TASK = 9;

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
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZES_TASK__NEXT = TASK__NEXT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
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
	 * The meta object id for the '{@link ASEProject.impl.VisualizationTaskImpl <em>Visualization Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.VisualizationTaskImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getVisualizationTask()
	 * @generated
	 */
	int VISUALIZATION_TASK = 10;

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
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_TASK__NEXT = TASK__NEXT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
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
	 * The meta object id for the '{@link ASEProject.impl.ExportingTaskImpl <em>Exporting Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.ExportingTaskImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getExportingTask()
	 * @generated
	 */
	int EXPORTING_TASK = 11;

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
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTING_TASK__NEXT = TASK__NEXT;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
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
	 * The meta object id for the '{@link ASEProject.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.ImportImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 12;

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
	 * The meta object id for the '{@link ASEProject.impl.ExportImpl <em>Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.ExportImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getExport()
	 * @generated
	 */
	int EXPORT = 13;

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
	 * The meta object id for the '{@link ASEProject.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.OperationImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PREVIOUS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INCOMING = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ASEProject.impl.CleaningOpImpl <em>Cleaning Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.CleaningOpImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getCleaningOp()
	 * @generated
	 */
	int CLEANING_OP = 18;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_OP__PREVIOUS = OPERATION__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_OP__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_OP__INCOMING = OPERATION__INCOMING;

	/**
	 * The number of structural features of the '<em>Cleaning Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEANING_OP_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASEProject.impl.UserDefinedImpl <em>User Defined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.UserDefinedImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getUserDefined()
	 * @generated
	 */
	int USER_DEFINED = 15;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__PREVIOUS = CLEANING_OP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__NAME = CLEANING_OP__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED__INCOMING = CLEANING_OP__INCOMING;

	/**
	 * The number of structural features of the '<em>User Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_FEATURE_COUNT = CLEANING_OP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASEProject.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.SourceImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getSource()
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
	 * The meta object id for the '{@link ASEProject.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.FileImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getFile()
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
	 * The meta object id for the '{@link ASEProject.impl.AnalysisOpImpl <em>Analysis Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.AnalysisOpImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getAnalysisOp()
	 * @generated
	 */
	int ANALYSIS_OP = 19;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OP__PREVIOUS = OPERATION__PREVIOUS;

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
	 * The number of structural features of the '<em>Analysis Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OP_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASEProject.impl.DescriptiveImpl <em>Descriptive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.DescriptiveImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getDescriptive()
	 * @generated
	 */
	int DESCRIPTIVE = 20;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__PREVIOUS = ANALYSIS_OP__PREVIOUS;

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
	 * The number of structural features of the '<em>Descriptive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_FEATURE_COUNT = ANALYSIS_OP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASEProject.impl.ClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.ClassificationImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 21;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__PREVIOUS = ANALYSIS_OP__PREVIOUS;

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
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FEATURE_COUNT = ANALYSIS_OP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASEProject.impl.PredictiveImpl <em>Predictive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.PredictiveImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getPredictive()
	 * @generated
	 */
	int PREDICTIVE = 22;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE__PREVIOUS = ANALYSIS_OP__PREVIOUS;

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
	 * The number of structural features of the '<em>Predictive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_FEATURE_COUNT = ANALYSIS_OP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASEProject.impl.ClusteringImpl <em>Clustering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.ClusteringImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getClustering()
	 * @generated
	 */
	int CLUSTERING = 23;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__PREVIOUS = ANALYSIS_OP__PREVIOUS;

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
	 * The number of structural features of the '<em>Clustering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FEATURE_COUNT = ANALYSIS_OP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASEProject.impl.PredefinedImpl <em>Predefined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.impl.PredefinedImpl
	 * @see ASEProject.impl.ASEProjectPackageImpl#getPredefined()
	 * @generated
	 */
	int PREDEFINED = 24;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED__PREVIOUS = CLEANING_OP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED__NAME = CLEANING_OP__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED__INCOMING = CLEANING_OP__INCOMING;

	/**
	 * The number of structural features of the '<em>Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_FEATURE_COUNT = CLEANING_OP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ASEProject.Format <em>Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASEProject.Format
	 * @see ASEProject.impl.ASEProjectPackageImpl#getFormat()
	 * @generated
	 */
	int FORMAT = 25;


	/**
	 * Returns the meta object for class '{@link ASEProject.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see ASEProject.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link ASEProject.Pipeline#getDataflows <em>Dataflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataflows</em>'.
	 * @see ASEProject.Pipeline#getDataflows()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Dataflows();

	/**
	 * Returns the meta object for the containment reference list '{@link ASEProject.Pipeline#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see ASEProject.Pipeline#getTasks()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Tasks();

	/**
	 * Returns the meta object for class '{@link ASEProject.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see ASEProject.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASEProject.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.Task#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see ASEProject.Task#isIsRequired()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_IsRequired();

	/**
	 * Returns the meta object for the reference list '{@link ASEProject.Task#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see ASEProject.Task#getNext()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Next();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.Task#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see ASEProject.Task#getOutgoing()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outgoing();

	/**
	 * Returns the meta object for class '{@link ASEProject.Dataflow <em>Dataflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataflow</em>'.
	 * @see ASEProject.Dataflow
	 * @generated
	 */
	EClass getDataflow();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.Dataflow#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see ASEProject.Dataflow#getFormat()
	 * @see #getDataflow()
	 * @generated
	 */
	EAttribute getDataflow_Format();

	/**
	 * Returns the meta object for the containment reference '{@link ASEProject.Dataflow#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see ASEProject.Dataflow#getSchema()
	 * @see #getDataflow()
	 * @generated
	 */
	EReference getDataflow_Schema();

	/**
	 * Returns the meta object for the reference list '{@link ASEProject.Dataflow#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous</em>'.
	 * @see ASEProject.Dataflow#getPrevious()
	 * @see #getDataflow()
	 * @generated
	 */
	EReference getDataflow_Previous();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.Dataflow#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see ASEProject.Dataflow#getIncoming()
	 * @see #getDataflow()
	 * @generated
	 */
	EReference getDataflow_Incoming();

	/**
	 * Returns the meta object for class '{@link ASEProject.InternalDF <em>Internal DF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal DF</em>'.
	 * @see ASEProject.InternalDF
	 * @generated
	 */
	EClass getInternalDF();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.InternalDF#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see ASEProject.InternalDF#getFormat()
	 * @see #getInternalDF()
	 * @generated
	 */
	EAttribute getInternalDF_Format();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.InternalDF#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see ASEProject.InternalDF#getNext()
	 * @see #getInternalDF()
	 * @generated
	 */
	EReference getInternalDF_Next();

	/**
	 * Returns the meta object for the containment reference '{@link ASEProject.InternalDF#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see ASEProject.InternalDF#getSchema()
	 * @see #getInternalDF()
	 * @generated
	 */
	EReference getInternalDF_Schema();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.InternalDF#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see ASEProject.InternalDF#getOutgoing()
	 * @see #getInternalDF()
	 * @generated
	 */
	EReference getInternalDF_Outgoing();

	/**
	 * Returns the meta object for class '{@link ASEProject.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see ASEProject.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link ASEProject.Schema#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ASEProject.Schema#getAttributes()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Attributes();

	/**
	 * Returns the meta object for class '{@link ASEProject.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see ASEProject.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASEProject.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ASEProject.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.Attribute#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see ASEProject.Attribute#getNext()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Next();

	/**
	 * Returns the meta object for the containment reference list '{@link ASEProject.Attribute#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ASEProject.Attribute#getAttributes()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Attributes();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.Attribute#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see ASEProject.Attribute#getPrevious()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Previous();

	/**
	 * Returns the meta object for class '{@link ASEProject.CollectionTask <em>Collection Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Task</em>'.
	 * @see ASEProject.CollectionTask
	 * @generated
	 */
	EClass getCollectionTask();

	/**
	 * Returns the meta object for the containment reference list '{@link ASEProject.CollectionTask#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see ASEProject.CollectionTask#getImports()
	 * @see #getCollectionTask()
	 * @generated
	 */
	EReference getCollectionTask_Imports();

	/**
	 * Returns the meta object for class '{@link ASEProject.IntegrationTask <em>Integration Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration Task</em>'.
	 * @see ASEProject.IntegrationTask
	 * @generated
	 */
	EClass getIntegrationTask();

	/**
	 * Returns the meta object for class '{@link ASEProject.CleaningTask <em>Cleaning Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cleaning Task</em>'.
	 * @see ASEProject.CleaningTask
	 * @generated
	 */
	EClass getCleaningTask();

	/**
	 * Returns the meta object for the containment reference list '{@link ASEProject.CleaningTask#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see ASEProject.CleaningTask#getOperations()
	 * @see #getCleaningTask()
	 * @generated
	 */
	EReference getCleaningTask_Operations();

	/**
	 * Returns the meta object for class '{@link ASEProject.AnalyzesTask <em>Analyzes Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analyzes Task</em>'.
	 * @see ASEProject.AnalyzesTask
	 * @generated
	 */
	EClass getAnalyzesTask();

	/**
	 * Returns the meta object for the containment reference list '{@link ASEProject.AnalyzesTask#getAnalyzes <em>Analyzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analyzes</em>'.
	 * @see ASEProject.AnalyzesTask#getAnalyzes()
	 * @see #getAnalyzesTask()
	 * @generated
	 */
	EReference getAnalyzesTask_Analyzes();

	/**
	 * Returns the meta object for class '{@link ASEProject.VisualizationTask <em>Visualization Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization Task</em>'.
	 * @see ASEProject.VisualizationTask
	 * @generated
	 */
	EClass getVisualizationTask();

	/**
	 * Returns the meta object for class '{@link ASEProject.ExportingTask <em>Exporting Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exporting Task</em>'.
	 * @see ASEProject.ExportingTask
	 * @generated
	 */
	EClass getExportingTask();

	/**
	 * Returns the meta object for the containment reference list '{@link ASEProject.ExportingTask#getExports <em>Exports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exports</em>'.
	 * @see ASEProject.ExportingTask#getExports()
	 * @see #getExportingTask()
	 * @generated
	 */
	EReference getExportingTask_Exports();

	/**
	 * Returns the meta object for class '{@link ASEProject.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see ASEProject.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.Import#getReadsFrom <em>Reads From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reads From</em>'.
	 * @see ASEProject.Import#getReadsFrom()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ReadsFrom();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.Import#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see ASEProject.Import#getUses()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Uses();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.Import#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASEProject.Import#getName()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Name();

	/**
	 * Returns the meta object for class '{@link ASEProject.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export</em>'.
	 * @see ASEProject.Export
	 * @generated
	 */
	EClass getExport();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.Export#getGenerates <em>Generates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generates</em>'.
	 * @see ASEProject.Export#getGenerates()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Generates();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.Export#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see ASEProject.Export#getUses()
	 * @see #getExport()
	 * @generated
	 */
	EReference getExport_Uses();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.Export#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASEProject.Export#getName()
	 * @see #getExport()
	 * @generated
	 */
	EAttribute getExport_Name();

	/**
	 * Returns the meta object for class '{@link ASEProject.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ASEProject.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.Operation#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see ASEProject.Operation#getPrevious()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Previous();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASEProject.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.Operation#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see ASEProject.Operation#getIncoming()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Incoming();

	/**
	 * Returns the meta object for class '{@link ASEProject.UserDefined <em>User Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Defined</em>'.
	 * @see ASEProject.UserDefined
	 * @generated
	 */
	EClass getUserDefined();

	/**
	 * Returns the meta object for class '{@link ASEProject.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see ASEProject.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.Source#getLinkedTo <em>Linked To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked To</em>'.
	 * @see ASEProject.Source#getLinkedTo()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_LinkedTo();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.Source#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASEProject.Source#getName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Name();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.Source#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ASEProject.Source#getPath()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Path();

	/**
	 * Returns the meta object for class '{@link ASEProject.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see ASEProject.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASEProject.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the meta object for the attribute '{@link ASEProject.File#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ASEProject.File#getPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Path();

	/**
	 * Returns the meta object for the reference '{@link ASEProject.File#getComesFrom <em>Comes From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comes From</em>'.
	 * @see ASEProject.File#getComesFrom()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_ComesFrom();

	/**
	 * Returns the meta object for class '{@link ASEProject.CleaningOp <em>Cleaning Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cleaning Op</em>'.
	 * @see ASEProject.CleaningOp
	 * @generated
	 */
	EClass getCleaningOp();

	/**
	 * Returns the meta object for class '{@link ASEProject.AnalysisOp <em>Analysis Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Op</em>'.
	 * @see ASEProject.AnalysisOp
	 * @generated
	 */
	EClass getAnalysisOp();

	/**
	 * Returns the meta object for class '{@link ASEProject.Descriptive <em>Descriptive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptive</em>'.
	 * @see ASEProject.Descriptive
	 * @generated
	 */
	EClass getDescriptive();

	/**
	 * Returns the meta object for class '{@link ASEProject.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see ASEProject.Classification
	 * @generated
	 */
	EClass getClassification();

	/**
	 * Returns the meta object for class '{@link ASEProject.Predictive <em>Predictive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predictive</em>'.
	 * @see ASEProject.Predictive
	 * @generated
	 */
	EClass getPredictive();

	/**
	 * Returns the meta object for class '{@link ASEProject.Clustering <em>Clustering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clustering</em>'.
	 * @see ASEProject.Clustering
	 * @generated
	 */
	EClass getClustering();

	/**
	 * Returns the meta object for class '{@link ASEProject.Predefined <em>Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined</em>'.
	 * @see ASEProject.Predefined
	 * @generated
	 */
	EClass getPredefined();

	/**
	 * Returns the meta object for enum '{@link ASEProject.Format <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format</em>'.
	 * @see ASEProject.Format
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
	ASEProjectFactory getASEProjectFactory();

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
		 * The meta object literal for the '{@link ASEProject.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.PipelineImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getPipeline()
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
		 * The meta object literal for the '{@link ASEProject.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.TaskImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getTask()
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
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__NEXT = eINSTANCE.getTask_Next();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTGOING = eINSTANCE.getTask_Outgoing();

		/**
		 * The meta object literal for the '{@link ASEProject.impl.DataflowImpl <em>Dataflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.DataflowImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getDataflow()
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
		 * The meta object literal for the '<em><b>Previous</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAFLOW__PREVIOUS = eINSTANCE.getDataflow_Previous();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAFLOW__INCOMING = eINSTANCE.getDataflow_Incoming();

		/**
		 * The meta object literal for the '{@link ASEProject.impl.InternalDFImpl <em>Internal DF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.InternalDFImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getInternalDF()
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
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_DF__NEXT = eINSTANCE.getInternalDF_Next();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_DF__SCHEMA = eINSTANCE.getInternalDF_Schema();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_DF__OUTGOING = eINSTANCE.getInternalDF_Outgoing();

		/**
		 * The meta object literal for the '{@link ASEProject.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.SchemaImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getSchema()
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
		 * The meta object literal for the '{@link ASEProject.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.AttributeImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getAttribute()
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
		 * The meta object literal for the '{@link ASEProject.impl.CollectionTaskImpl <em>Collection Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.CollectionTaskImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getCollectionTask()
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
		 * The meta object literal for the '{@link ASEProject.impl.IntegrationTaskImpl <em>Integration Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.IntegrationTaskImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getIntegrationTask()
		 * @generated
		 */
		EClass INTEGRATION_TASK = eINSTANCE.getIntegrationTask();

		/**
		 * The meta object literal for the '{@link ASEProject.impl.CleaningTaskImpl <em>Cleaning Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.CleaningTaskImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getCleaningTask()
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
		 * The meta object literal for the '{@link ASEProject.impl.AnalyzesTaskImpl <em>Analyzes Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.AnalyzesTaskImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getAnalyzesTask()
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
		 * The meta object literal for the '{@link ASEProject.impl.VisualizationTaskImpl <em>Visualization Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.VisualizationTaskImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getVisualizationTask()
		 * @generated
		 */
		EClass VISUALIZATION_TASK = eINSTANCE.getVisualizationTask();

		/**
		 * The meta object literal for the '{@link ASEProject.impl.ExportingTaskImpl <em>Exporting Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.ExportingTaskImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getExportingTask()
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
		 * The meta object literal for the '{@link ASEProject.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.ImportImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getImport()
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
		 * The meta object literal for the '{@link ASEProject.impl.ExportImpl <em>Export</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.ExportImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getExport()
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
		 * The meta object literal for the '{@link ASEProject.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.OperationImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PREVIOUS = eINSTANCE.getOperation_Previous();

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
		 * The meta object literal for the '{@link ASEProject.impl.UserDefinedImpl <em>User Defined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.UserDefinedImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getUserDefined()
		 * @generated
		 */
		EClass USER_DEFINED = eINSTANCE.getUserDefined();

		/**
		 * The meta object literal for the '{@link ASEProject.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.SourceImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getSource()
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
		 * The meta object literal for the '{@link ASEProject.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.FileImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getFile()
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
		 * The meta object literal for the '{@link ASEProject.impl.CleaningOpImpl <em>Cleaning Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.CleaningOpImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getCleaningOp()
		 * @generated
		 */
		EClass CLEANING_OP = eINSTANCE.getCleaningOp();

		/**
		 * The meta object literal for the '{@link ASEProject.impl.AnalysisOpImpl <em>Analysis Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.AnalysisOpImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getAnalysisOp()
		 * @generated
		 */
		EClass ANALYSIS_OP = eINSTANCE.getAnalysisOp();

		/**
		 * The meta object literal for the '{@link ASEProject.impl.DescriptiveImpl <em>Descriptive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.DescriptiveImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getDescriptive()
		 * @generated
		 */
		EClass DESCRIPTIVE = eINSTANCE.getDescriptive();

		/**
		 * The meta object literal for the '{@link ASEProject.impl.ClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.ClassificationImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getClassification()
		 * @generated
		 */
		EClass CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '{@link ASEProject.impl.PredictiveImpl <em>Predictive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.PredictiveImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getPredictive()
		 * @generated
		 */
		EClass PREDICTIVE = eINSTANCE.getPredictive();

		/**
		 * The meta object literal for the '{@link ASEProject.impl.ClusteringImpl <em>Clustering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.ClusteringImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getClustering()
		 * @generated
		 */
		EClass CLUSTERING = eINSTANCE.getClustering();

		/**
		 * The meta object literal for the '{@link ASEProject.impl.PredefinedImpl <em>Predefined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.impl.PredefinedImpl
		 * @see ASEProject.impl.ASEProjectPackageImpl#getPredefined()
		 * @generated
		 */
		EClass PREDEFINED = eINSTANCE.getPredefined();

		/**
		 * The meta object literal for the '{@link ASEProject.Format <em>Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASEProject.Format
		 * @see ASEProject.impl.ASEProjectPackageImpl#getFormat()
		 * @generated
		 */
		EEnum FORMAT = eINSTANCE.getFormat();

	}

} //ASEProjectPackage
