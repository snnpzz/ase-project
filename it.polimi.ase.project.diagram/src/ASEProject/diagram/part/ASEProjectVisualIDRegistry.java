/*
* 
*/
package ASEProject.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ASEProjectVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "it.polimi.ase.project.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ASEProject.diagram.edit.parts.PipelineEditPart.MODEL_ID.equals(view.getType())) {
				return ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(view.getType());
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
				ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
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
		if (ASEProject.ASEProjectPackage.eINSTANCE.getPipeline().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ASEProject.Pipeline) domainElement)) {
			return ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID;
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
		String containerModelID = ASEProject.diagram.part.ASEProjectVisualIDRegistry.getModelID(containerView);
		if (!ASEProject.diagram.edit.parts.PipelineEditPart.MODEL_ID.equals(containerModelID)
				&& !"ASEProject".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ASEProject.diagram.edit.parts.PipelineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			if (ASEProject.ASEProjectPackage.eINSTANCE.getCollectionTask().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID;
			}
			if (ASEProject.ASEProjectPackage.eINSTANCE.getIntegrationTask().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID;
			}
			if (ASEProject.ASEProjectPackage.eINSTANCE.getCleaningTask().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID;
			}
			if (ASEProject.ASEProjectPackage.eINSTANCE.getAnalyzesTask().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID;
			}
			if (ASEProject.ASEProjectPackage.eINSTANCE.getVisualizationTask().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID;
			}
			if (ASEProject.ASEProjectPackage.eINSTANCE.getExportingTask().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID;
			}
			break;
		case ASEProject.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
			if (ASEProject.ASEProjectPackage.eINSTANCE.getImport().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.ImportEditPart.VISUAL_ID;
			}
			break;
		case ASEProject.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
			if (ASEProject.ASEProjectPackage.eINSTANCE.getUserDefined().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID;
			}
			if (ASEProject.ASEProjectPackage.eINSTANCE.getPredefined().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.PredefinedEditPart.VISUAL_ID;
			}
			break;
		case ASEProject.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
			if (ASEProject.ASEProjectPackage.eINSTANCE.getDescriptive().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID;
			}
			if (ASEProject.ASEProjectPackage.eINSTANCE.getClassification().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.ClassificationEditPart.VISUAL_ID;
			}
			if (ASEProject.ASEProjectPackage.eINSTANCE.getPredictive().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.PredictiveEditPart.VISUAL_ID;
			}
			if (ASEProject.ASEProjectPackage.eINSTANCE.getClustering().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.ClusteringEditPart.VISUAL_ID;
			}
			break;
		case ASEProject.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
			if (ASEProject.ASEProjectPackage.eINSTANCE.getExport().isSuperTypeOf(domainElement.eClass())) {
				return ASEProject.diagram.edit.parts.ExportEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ASEProject.diagram.part.ASEProjectVisualIDRegistry.getModelID(containerView);
		if (!ASEProject.diagram.edit.parts.PipelineEditPart.MODEL_ID.equals(containerModelID)
				&& !"ASEProject".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ASEProject.diagram.edit.parts.PipelineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.CollectionTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.IntegrationTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.CleaningTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.AnalyzesTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.VisualizationTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.ExportingTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.ImportNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.UserDefinedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.PredefinedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.DescriptiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.ClassificationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.PredictiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.ClusteringNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.ExportNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.ImportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.PredefinedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.ClassificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.PredictiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASEProject.diagram.edit.parts.ClusteringEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASEProject.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
			if (ASEProject.diagram.edit.parts.ExportEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ASEProject.ASEProjectPackage.eINSTANCE.getDataflow().isSuperTypeOf(domainElement.eClass())) {
			return ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ASEProject.Pipeline element) {
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
		case ASEProject.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
		case ASEProject.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
		case ASEProject.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
		case ASEProject.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
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
		case ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			return false;
		case ASEProject.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
		case ASEProject.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
		case ASEProject.diagram.edit.parts.ImportEditPart.VISUAL_ID:
		case ASEProject.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
		case ASEProject.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
		case ASEProject.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
		case ASEProject.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
		case ASEProject.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
		case ASEProject.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
		case ASEProject.diagram.edit.parts.ExportEditPart.VISUAL_ID:
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
			return ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return ASEProject.diagram.part.ASEProjectVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ASEProject.diagram.part.ASEProjectVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return ASEProject.diagram.part.ASEProjectVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return ASEProject.diagram.part.ASEProjectVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return ASEProject.diagram.part.ASEProjectVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
