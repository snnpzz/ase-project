/*
* 
*/
package ASE_Project.diagram.part;

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
public class ASE_ProjectVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "it.polimi.ase.project.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ASE_Project.diagram.edit.parts.PipelineEditPart.MODEL_ID.equals(view.getType())) {
				return ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(view.getType());
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
				ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
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
		if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getPipeline().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ASE_Project.Pipeline) domainElement)) {
			return ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID;
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
		String containerModelID = ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getModelID(containerView);
		if (!ASE_Project.diagram.edit.parts.PipelineEditPart.MODEL_ID.equals(containerModelID)
				&& !"ASE_Project".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ASE_Project.diagram.edit.parts.PipelineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getCollectionTask().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID;
			}
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getIntegrationTask().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID;
			}
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getCleaningTask().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID;
			}
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getAnalyzesTask().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID;
			}
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getVisualizationTask().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID;
			}
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getExportingTask().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID;
			}
			break;
		case ASE_Project.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getImport().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID;
			}
			break;
		case ASE_Project.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getUserDefined().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID;
			}
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getPredefined().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID;
			}
			break;
		case ASE_Project.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getDescriptive().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID;
			}
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getClassification().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID;
			}
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getPredictive().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID;
			}
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getClustering().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID;
			}
			break;
		case ASE_Project.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
			if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getExport().isSuperTypeOf(domainElement.eClass())) {
				return ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getModelID(containerView);
		if (!ASE_Project.diagram.edit.parts.PipelineEditPart.MODEL_ID.equals(containerModelID)
				&& !"ASE_Project".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ASE_Project.diagram.edit.parts.PipelineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.CollectionTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.IntegrationTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.CleaningTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.AnalyzesTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.VisualizationTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.ExportingTaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.ImportNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.UserDefinedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.PredefinedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.DescriptiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.ClassificationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.PredictiveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.ClusteringNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.ExportNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ASE_Project.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
			if (ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ASE_Project.ASE_ProjectPackage.eINSTANCE.getDataflow().isSuperTypeOf(domainElement.eClass())) {
			return ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ASE_Project.Pipeline element) {
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
		case ASE_Project.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
		case ASE_Project.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
		case ASE_Project.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
		case ASE_Project.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
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
		case ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			return false;
		case ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
		case ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
		case ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID:
		case ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
		case ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
		case ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
		case ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
		case ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
		case ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
		case ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID:
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
			return ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
