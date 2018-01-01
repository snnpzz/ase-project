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
import pipeline.diagram.edit.parts.AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.AnalysisTaskEditPart;
import pipeline.diagram.edit.parts.AnalysisTaskIDEditPart;
import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.ClassificationNameEditPart;
import pipeline.diagram.edit.parts.CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.CleaningTaskIDEditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.ClusteringNameEditPart;
import pipeline.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.CollectionTaskIDEditPart;
import pipeline.diagram.edit.parts.ComplexAttribute2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeComplexAttributeAttributesCompartment2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeComplexAttributeAttributesCompartmentEditPart;
import pipeline.diagram.edit.parts.ComplexAttributeEditPart;
import pipeline.diagram.edit.parts.ComplexAttributeName2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeNameEditPart;
import pipeline.diagram.edit.parts.DataFlowEditPart;
import pipeline.diagram.edit.parts.DataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.DescriptiveNameEditPart;
import pipeline.diagram.edit.parts.ExportEditPart;
import pipeline.diagram.edit.parts.ExportExpUsesEditPart;
import pipeline.diagram.edit.parts.ExportNameEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.ExportTaskExportTaskExportsCompartmentEditPart;
import pipeline.diagram.edit.parts.ExportTaskIDEditPart;
import pipeline.diagram.edit.parts.ExportWriteEditPart;
import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.edit.parts.FileNameEditPart;
import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.ImportImpUsesEditPart;
import pipeline.diagram.edit.parts.ImportNameEditPart;
import pipeline.diagram.edit.parts.ImportReadEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskIDEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
import pipeline.diagram.edit.parts.PredefinedCleaningOperationEditPart;
import pipeline.diagram.edit.parts.PredefinedCleaningOperationNameEditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.PredictiveNameEditPart;
import pipeline.diagram.edit.parts.SchemaEditPart;
import pipeline.diagram.edit.parts.SchemaSchemaAttributesCompartmentEditPart;
import pipeline.diagram.edit.parts.SimpleAttribute2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeEditPart;
import pipeline.diagram.edit.parts.SimpleAttributeName2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeNameEditPart;
import pipeline.diagram.edit.parts.SourceEditPart;
import pipeline.diagram.edit.parts.SourceNameEditPart;
import pipeline.diagram.edit.parts.UserDefinedCleaningOperationEditPart;
import pipeline.diagram.edit.parts.UserDefinedCleaningOperationNameEditPart;
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
		case CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getUserDefinedCleaningOperation().isSuperTypeOf(domainElement.eClass())) {
				return UserDefinedCleaningOperationEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getPredefinedCleaningOperation().isSuperTypeOf(domainElement.eClass())) {
				return PredefinedCleaningOperationEditPart.VISUAL_ID;
			}
			break;
		case AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart.VISUAL_ID:
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
			break;
		case ExportTaskExportTaskExportsCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getExport().isSuperTypeOf(domainElement.eClass())) {
				return ExportEditPart.VISUAL_ID;
			}
			break;
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getSimpleAttribute().isSuperTypeOf(domainElement.eClass())) {
				return SimpleAttributeEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getComplexAttribute().isSuperTypeOf(domainElement.eClass())) {
				return ComplexAttributeEditPart.VISUAL_ID;
			}
			break;
		case ComplexAttributeComplexAttributeAttributesCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getSimpleAttribute().isSuperTypeOf(domainElement.eClass())) {
				return SimpleAttribute2EditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getComplexAttribute().isSuperTypeOf(domainElement.eClass())) {
				return ComplexAttribute2EditPart.VISUAL_ID;
			}
			break;
		case ComplexAttributeComplexAttributeAttributesCompartment2EditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getSimpleAttribute().isSuperTypeOf(domainElement.eClass())) {
				return SimpleAttribute2EditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getComplexAttribute().isSuperTypeOf(domainElement.eClass())) {
				return ComplexAttribute2EditPart.VISUAL_ID;
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
			if (CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnalysisTaskEditPart.VISUAL_ID:
			if (AnalysisTaskIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
		case UserDefinedCleaningOperationEditPart.VISUAL_ID:
			if (UserDefinedCleaningOperationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PredefinedCleaningOperationEditPart.VISUAL_ID:
			if (PredefinedCleaningOperationNameEditPart.VISUAL_ID == nodeVisualID) {
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
		case ExportEditPart.VISUAL_ID:
			if (ExportNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleAttributeEditPart.VISUAL_ID:
			if (SimpleAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexAttributeEditPart.VISUAL_ID:
			if (ComplexAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexAttributeComplexAttributeAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleAttribute2EditPart.VISUAL_ID:
			if (SimpleAttributeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexAttribute2EditPart.VISUAL_ID:
			if (ComplexAttributeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexAttributeComplexAttributeAttributesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
			if (ImportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart.VISUAL_ID:
			if (UserDefinedCleaningOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PredefinedCleaningOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart.VISUAL_ID:
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
			break;
		case ExportTaskExportTaskExportsCompartmentEditPart.VISUAL_ID:
			if (ExportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
			if (SimpleAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexAttributeComplexAttributeAttributesCompartmentEditPart.VISUAL_ID:
			if (SimpleAttribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexAttribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexAttributeComplexAttributeAttributesCompartment2EditPart.VISUAL_ID:
			if (SimpleAttribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexAttribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataFlowSchemaEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InternalDataFlowSchemaEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImportReadEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImportImpUsesEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExportWriteEditPart.VISUAL_ID:
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
		case CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart.VISUAL_ID:
		case AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart.VISUAL_ID:
		case ExportTaskExportTaskExportsCompartmentEditPart.VISUAL_ID:
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
		case ComplexAttributeComplexAttributeAttributesCompartmentEditPart.VISUAL_ID:
		case ComplexAttributeComplexAttributeAttributesCompartment2EditPart.VISUAL_ID:
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
		case SourceEditPart.VISUAL_ID:
		case FileEditPart.VISUAL_ID:
		case ImportEditPart.VISUAL_ID:
		case ExportEditPart.VISUAL_ID:
		case DescriptiveEditPart.VISUAL_ID:
		case ClassificationEditPart.VISUAL_ID:
		case PredictiveEditPart.VISUAL_ID:
		case ClusteringEditPart.VISUAL_ID:
		case SimpleAttributeEditPart.VISUAL_ID:
		case SimpleAttribute2EditPart.VISUAL_ID:
		case UserDefinedCleaningOperationEditPart.VISUAL_ID:
		case PredefinedCleaningOperationEditPart.VISUAL_ID:
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
