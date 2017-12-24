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

import pipeline.PipelinePackage;
import pipeline.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart;
import pipeline.diagram.edit.parts.AnalyzesTaskEditPart;
import pipeline.diagram.edit.parts.AnalyzesTaskNameEditPart;
import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.ClassificationNameEditPart;
import pipeline.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.CleaningTaskNameEditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.ClusteringNameEditPart;
import pipeline.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.CollectionTaskNameEditPart;
import pipeline.diagram.edit.parts.DataflowEditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.DescriptiveNameEditPart;
import pipeline.diagram.edit.parts.ExportEditPart;
import pipeline.diagram.edit.parts.ExportNameEditPart;
import pipeline.diagram.edit.parts.ExportingTaskEditPart;
import pipeline.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart;
import pipeline.diagram.edit.parts.ExportingTaskNameEditPart;
import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.ImportNameEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskNameEditPart;
import pipeline.diagram.edit.parts.PLEditPart;
import pipeline.diagram.edit.parts.PredefinedEditPart;
import pipeline.diagram.edit.parts.PredefinedNameEditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.PredictiveNameEditPart;
import pipeline.diagram.edit.parts.UserDefinedEditPart;
import pipeline.diagram.edit.parts.UserDefinedNameEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskNameEditPart;

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
			if (PLEditPart.MODEL_ID.equals(view.getType())) {
				return PLEditPart.VISUAL_ID;
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
		if (PipelinePackage.eINSTANCE.getPL().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((pipeline.PL) domainElement)) {
			return PLEditPart.VISUAL_ID;
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
		if (!PLEditPart.MODEL_ID.equals(containerModelID) && !"pipeline".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (PLEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = pipeline.diagram.part.PipelineVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PLEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PLEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getCollectionTask().isSuperTypeOf(domainElement.eClass())) {
				return CollectionTaskEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getIntegrationTask().isSuperTypeOf(domainElement.eClass())) {
				return IntegrationTaskEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getCleaningTask().isSuperTypeOf(domainElement.eClass())) {
				return CleaningTaskEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getAnalyzesTask().isSuperTypeOf(domainElement.eClass())) {
				return AnalyzesTaskEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getVisualizationTask().isSuperTypeOf(domainElement.eClass())) {
				return VisualizationTaskEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getExportingTask().isSuperTypeOf(domainElement.eClass())) {
				return ExportingTaskEditPart.VISUAL_ID;
			}
			break;
		case CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getImport().isSuperTypeOf(domainElement.eClass())) {
				return ImportEditPart.VISUAL_ID;
			}
			break;
		case CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getUserDefined().isSuperTypeOf(domainElement.eClass())) {
				return UserDefinedEditPart.VISUAL_ID;
			}
			if (PipelinePackage.eINSTANCE.getPredefined().isSuperTypeOf(domainElement.eClass())) {
				return PredefinedEditPart.VISUAL_ID;
			}
			break;
		case AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
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
		case ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
			if (PipelinePackage.eINSTANCE.getExport().isSuperTypeOf(domainElement.eClass())) {
				return ExportEditPart.VISUAL_ID;
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
		if (!PLEditPart.MODEL_ID.equals(containerModelID) && !"pipeline".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (PLEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = pipeline.diagram.part.PipelineVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PLEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PLEditPart.VISUAL_ID:
			if (CollectionTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IntegrationTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CleaningTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnalyzesTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (VisualizationTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExportingTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollectionTaskEditPart.VISUAL_ID:
			if (CollectionTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IntegrationTaskEditPart.VISUAL_ID:
			if (IntegrationTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CleaningTaskEditPart.VISUAL_ID:
			if (CleaningTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnalyzesTaskEditPart.VISUAL_ID:
			if (AnalyzesTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case VisualizationTaskEditPart.VISUAL_ID:
			if (VisualizationTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExportingTaskEditPart.VISUAL_ID:
			if (ExportingTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ImportEditPart.VISUAL_ID:
			if (ImportNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserDefinedEditPart.VISUAL_ID:
			if (UserDefinedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PredefinedEditPart.VISUAL_ID:
			if (PredefinedNameEditPart.VISUAL_ID == nodeVisualID) {
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
		case CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
			if (ImportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
			if (UserDefinedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PredefinedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
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
		case ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
			if (ExportEditPart.VISUAL_ID == nodeVisualID) {
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
		if (PipelinePackage.eINSTANCE.getDataflow().isSuperTypeOf(domainElement.eClass())) {
			return DataflowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(pipeline.PL element) {
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
		case AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
		case ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
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
		case PLEditPart.VISUAL_ID:
			return false;
		case IntegrationTaskEditPart.VISUAL_ID:
		case VisualizationTaskEditPart.VISUAL_ID:
		case ImportEditPart.VISUAL_ID:
		case UserDefinedEditPart.VISUAL_ID:
		case PredefinedEditPart.VISUAL_ID:
		case DescriptiveEditPart.VISUAL_ID:
		case ClassificationEditPart.VISUAL_ID:
		case PredictiveEditPart.VISUAL_ID:
		case ClusteringEditPart.VISUAL_ID:
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
