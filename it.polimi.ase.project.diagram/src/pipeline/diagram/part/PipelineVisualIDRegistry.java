/*
* 
*/
package pipeline.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import pipeline.Pipeline;
import pipeline.PipelinePackage;
import pipeline.diagram.edit.parts.AnalysisTaskAnalysisTaskAnalyzesCompartmentEditPart;
import pipeline.diagram.edit.parts.AnalysisTaskEditPart;
import pipeline.diagram.edit.parts.AnalysisTaskIDEditPart;
import pipeline.diagram.edit.parts.Attribute2EditPart;
import pipeline.diagram.edit.parts.AttributeAttributeAttributesCompartment2EditPart;
import pipeline.diagram.edit.parts.AttributeAttributeAttributesCompartmentEditPart;
import pipeline.diagram.edit.parts.AttributeEditPart;
import pipeline.diagram.edit.parts.AttributeName2EditPart;
import pipeline.diagram.edit.parts.AttributeNameEditPart;
import pipeline.diagram.edit.parts.Classification2EditPart;
import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.ClassificationName2EditPart;
import pipeline.diagram.edit.parts.ClassificationNameEditPart;
import pipeline.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.CleaningTaskIDEditPart;
import pipeline.diagram.edit.parts.Clustering2EditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.ClusteringName2EditPart;
import pipeline.diagram.edit.parts.ClusteringNameEditPart;
import pipeline.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.CollectionTaskIDEditPart;
import pipeline.diagram.edit.parts.DataFlowEditPart;
import pipeline.diagram.edit.parts.DataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.Descriptive2EditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.DescriptiveName2EditPart;
import pipeline.diagram.edit.parts.DescriptiveNameEditPart;
import pipeline.diagram.edit.parts.ExportEditPart;
import pipeline.diagram.edit.parts.ExportExpUsesEditPart;
import pipeline.diagram.edit.parts.ExportGeneratesEditPart;
import pipeline.diagram.edit.parts.ExportNameEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.ExportTaskExportTaskExportsCompartmentEditPart;
import pipeline.diagram.edit.parts.ExportTaskIDEditPart;
import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.edit.parts.FileNameEditPart;
import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.ImportImpUsesEditPart;
import pipeline.diagram.edit.parts.ImportNameEditPart;
import pipeline.diagram.edit.parts.ImportReadsFromEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskIDEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowIntDFschemaEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
import pipeline.diagram.edit.parts.Predefined2EditPart;
import pipeline.diagram.edit.parts.PredefinedEditPart;
import pipeline.diagram.edit.parts.PredefinedName2EditPart;
import pipeline.diagram.edit.parts.PredefinedNameEditPart;
import pipeline.diagram.edit.parts.Predictive2EditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.PredictiveName2EditPart;
import pipeline.diagram.edit.parts.PredictiveNameEditPart;
import pipeline.diagram.edit.parts.SchemaEditPart;
import pipeline.diagram.edit.parts.SchemaSchemaAttributesCompartmentEditPart;
import pipeline.diagram.edit.parts.SourceEditPart;
import pipeline.diagram.edit.parts.SourceNameEditPart;
import pipeline.diagram.edit.parts.UserDefined2EditPart;
import pipeline.diagram.edit.parts.UserDefinedEditPart;
import pipeline.diagram.edit.parts.UserDefinedName2EditPart;
import pipeline.diagram.edit.parts.UserDefinedNameEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskIDEditPart;
import pipeline.diagram.edit.parts.WrappingLabel2EditPart;
import pipeline.diagram.edit.parts.WrappingLabel3EditPart;
import pipeline.diagram.edit.parts.WrappingLabel4EditPart;
import pipeline.diagram.edit.parts.WrappingLabel5EditPart;
import pipeline.diagram.edit.parts.WrappingLabel6EditPart;
import pipeline.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PipelineVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "it.polimi.ase.project.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PipelineEditPart.MODEL_ID.equals(view.getType())) {
				return PipelineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return pipeline.diagram.part.PipelineVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				PipelineDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PipelinePackage.eINSTANCE.getPipeline().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Pipeline) domainElement)) {
			return PipelineEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = pipeline.diagram.part.PipelineVisualIDRegistry.getModelID(containerView);
		if (!PipelineEditPart.MODEL_ID.equals(containerModelID) && !"pipeline".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (PipelineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = pipeline.diagram.part.PipelineVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PipelineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PipelineEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getUserDefined().isSuperTypeOf(domainElement.eClass())) {
				return UserDefinedEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getDescriptive().isSuperTypeOf(domainElement.eClass())) {
				return DescriptiveEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getClassification().isSuperTypeOf(domainElement.eClass())) {
				return ClassificationEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getPredictive().isSuperTypeOf(domainElement.eClass())) {
				return PredictiveEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getClustering().isSuperTypeOf(domainElement.eClass())) {
				return ClusteringEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getPredefined().isSuperTypeOf(domainElement.eClass())) {
				return PredefinedEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getCollectionTask().isSuperTypeOf(domainElement.eClass())) {
				return CollectionTaskEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getIntegrationTask().isSuperTypeOf(domainElement.eClass())) {
				return IntegrationTaskEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getCleaningTask().isSuperTypeOf(domainElement.eClass())) {
				return CleaningTaskEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getAnalysisTask().isSuperTypeOf(domainElement.eClass())) {
				return AnalysisTaskEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getVisualizationTask().isSuperTypeOf(domainElement.eClass())) {
				return VisualizationTaskEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getExportTask().isSuperTypeOf(domainElement.eClass())) {
				return ExportTaskEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getSource().isSuperTypeOf(domainElement.eClass())) {
				return SourceEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getFile().isSuperTypeOf(domainElement.eClass())) {
				return FileEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getSchema().isSuperTypeOf(domainElement.eClass())) {
				return SchemaEditPart.VISUAL_ID;
			}
			break;
		case CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getImport().isSuperTypeOf(domainElement.eClass())) {
				return ImportEditPart.VISUAL_ID;
			}
			break;
		case CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getUserDefined().isSuperTypeOf(domainElement.eClass())) {
				return UserDefined2EditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getPredefined().isSuperTypeOf(domainElement.eClass())) {
				return Predefined2EditPart.VISUAL_ID;
			}
			break;
		case AnalysisTaskAnalysisTaskAnalyzesCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getDescriptive().isSuperTypeOf(domainElement.eClass())) {
				return Descriptive2EditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getClassification().isSuperTypeOf(domainElement.eClass())) {
				return Classification2EditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getPredictive().isSuperTypeOf(domainElement.eClass())) {
				return Predictive2EditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getClustering().isSuperTypeOf(domainElement.eClass())) {
				return Clustering2EditPart.VISUAL_ID;
			}
			break;
		case ExportTaskExportTaskExportsCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getExport().isSuperTypeOf(domainElement.eClass())) {
				return ExportEditPart.VISUAL_ID;
			}
			break;
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			break;
		case AttributeAttributeAttributesCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return Attribute2EditPart.VISUAL_ID;
			}
			break;
		case AttributeAttributeAttributesCompartment2EditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return Attribute2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = pipeline.diagram.part.PipelineVisualIDRegistry.getModelID(containerView);
		if (!PipelineEditPart.MODEL_ID.equals(containerModelID) && !"pipeline".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (PipelineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = pipeline.diagram.part.PipelineVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PipelineEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PipelineEditPart.VISUAL_ID:
			if (UserDefinedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DescriptiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PredictiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClusteringEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PredefinedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IntegrationTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CleaningTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnalysisTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (VisualizationTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExportTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SchemaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserDefinedEditPart.VISUAL_ID:
			if (UserDefinedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DescriptiveEditPart.VISUAL_ID:
			if (DescriptiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassificationEditPart.VISUAL_ID:
			if (ClassificationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PredictiveEditPart.VISUAL_ID:
			if (PredictiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClusteringEditPart.VISUAL_ID:
			if (ClusteringNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PredefinedEditPart.VISUAL_ID:
			if (PredefinedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollectionTaskEditPart.VISUAL_ID:
			if (CollectionTaskIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IntegrationTaskEditPart.VISUAL_ID:
			if (IntegrationTaskIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CleaningTaskEditPart.VISUAL_ID:
			if (CleaningTaskIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnalysisTaskEditPart.VISUAL_ID:
			if (AnalysisTaskIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnalysisTaskAnalysisTaskAnalyzesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VisualizationTaskEditPart.VISUAL_ID:
			if (VisualizationTaskIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExportTaskEditPart.VISUAL_ID:
			if (ExportTaskIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExportTaskExportTaskExportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SourceEditPart.VISUAL_ID:
			if (SourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FileEditPart.VISUAL_ID:
			if (FileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SchemaEditPart.VISUAL_ID:
			if (SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImportEditPart.VISUAL_ID:
			if (ImportNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserDefined2EditPart.VISUAL_ID:
			if (UserDefinedName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Predefined2EditPart.VISUAL_ID:
			if (PredefinedName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Descriptive2EditPart.VISUAL_ID:
			if (DescriptiveName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Classification2EditPart.VISUAL_ID:
			if (ClassificationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Predictive2EditPart.VISUAL_ID:
			if (PredictiveName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Clustering2EditPart.VISUAL_ID:
			if (ClusteringName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExportEditPart.VISUAL_ID:
			if (ExportNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeEditPart.VISUAL_ID:
			if (AttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeAttributeAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Attribute2EditPart.VISUAL_ID:
			if (AttributeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeAttributeAttributesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
			if (ImportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
			if (UserDefined2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Predefined2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnalysisTaskAnalysisTaskAnalyzesCompartmentEditPart.VISUAL_ID:
			if (Descriptive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Classification2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Predictive2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Clustering2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExportTaskExportTaskExportsCompartmentEditPart.VISUAL_ID:
			if (ExportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeAttributeAttributesCompartmentEditPart.VISUAL_ID:
			if (Attribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeAttributeAttributesCompartment2EditPart.VISUAL_ID:
			if (Attribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataFlowSchemaEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InternalDataFlowIntDFschemaEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImportReadsFromEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImportImpUsesEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExportGeneratesEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExportExpUsesEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PipelinePackage.eINSTANCE.getDataFlow().isSuperTypeOf(domainElement.eClass())) {
			return DataFlowEditPart.VISUAL_ID;
		}
		if (PipelinePackage.eINSTANCE.getInternalDataFlow().isSuperTypeOf(domainElement.eClass())) {
			return InternalDataFlowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Pipeline element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
		case CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
		case AnalysisTaskAnalysisTaskAnalyzesCompartmentEditPart.VISUAL_ID:
		case ExportTaskExportTaskExportsCompartmentEditPart.VISUAL_ID:
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
		case AttributeAttributeAttributesCompartmentEditPart.VISUAL_ID:
		case AttributeAttributeAttributesCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case PipelineEditPart.VISUAL_ID:
			return false;
		case IntegrationTaskEditPart.VISUAL_ID:
		case VisualizationTaskEditPart.VISUAL_ID:
		case UserDefinedEditPart.VISUAL_ID:
		case DescriptiveEditPart.VISUAL_ID:
		case ClassificationEditPart.VISUAL_ID:
		case PredictiveEditPart.VISUAL_ID:
		case ClusteringEditPart.VISUAL_ID:
		case PredefinedEditPart.VISUAL_ID:
		case SourceEditPart.VISUAL_ID:
		case FileEditPart.VISUAL_ID:
		case ImportEditPart.VISUAL_ID:
		case UserDefined2EditPart.VISUAL_ID:
		case Predefined2EditPart.VISUAL_ID:
		case Descriptive2EditPart.VISUAL_ID:
		case Classification2EditPart.VISUAL_ID:
		case Predictive2EditPart.VISUAL_ID:
		case Clustering2EditPart.VISUAL_ID:
		case ExportEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return pipeline.diagram.part.PipelineVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return pipeline.diagram.part.PipelineVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return pipeline.diagram.part.PipelineVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return pipeline.diagram.part.PipelineVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return pipeline.diagram.part.PipelineVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return pipeline.diagram.part.PipelineVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
