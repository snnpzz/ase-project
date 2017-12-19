/*
 * 
 */
package ASE_Project.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ASE_ProjectEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(view)) {

			case ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.PipelineEditPart(view);

			case ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.CollectionTaskEditPart(view);

			case ASE_Project.diagram.edit.parts.CollectionTaskNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.CollectionTaskNameEditPart(view);

			case ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.IntegrationTaskEditPart(view);

			case ASE_Project.diagram.edit.parts.IntegrationTaskNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.IntegrationTaskNameEditPart(view);

			case ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.CleaningTaskEditPart(view);

			case ASE_Project.diagram.edit.parts.CleaningTaskNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.CleaningTaskNameEditPart(view);

			case ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart(view);

			case ASE_Project.diagram.edit.parts.AnalyzesTaskNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.AnalyzesTaskNameEditPart(view);

			case ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.VisualizationTaskEditPart(view);

			case ASE_Project.diagram.edit.parts.VisualizationTaskNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.VisualizationTaskNameEditPart(view);

			case ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.ExportingTaskEditPart(view);

			case ASE_Project.diagram.edit.parts.ExportingTaskNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.ExportingTaskNameEditPart(view);

			case ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.ImportEditPart(view);

			case ASE_Project.diagram.edit.parts.ImportNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.ImportNameEditPart(view);

			case ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.UserDefinedEditPart(view);

			case ASE_Project.diagram.edit.parts.UserDefinedNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.UserDefinedNameEditPart(view);

			case ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.PredefinedEditPart(view);

			case ASE_Project.diagram.edit.parts.PredefinedNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.PredefinedNameEditPart(view);

			case ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.DescriptiveEditPart(view);

			case ASE_Project.diagram.edit.parts.DescriptiveNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.DescriptiveNameEditPart(view);

			case ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.ClassificationEditPart(view);

			case ASE_Project.diagram.edit.parts.ClassificationNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.ClassificationNameEditPart(view);

			case ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.PredictiveEditPart(view);

			case ASE_Project.diagram.edit.parts.PredictiveNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.PredictiveNameEditPart(view);

			case ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.ClusteringEditPart(view);

			case ASE_Project.diagram.edit.parts.ClusteringNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.ClusteringNameEditPart(view);

			case ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.ExportEditPart(view);

			case ASE_Project.diagram.edit.parts.ExportNameEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.ExportNameEditPart(view);

			case ASE_Project.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart(view);

			case ASE_Project.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart(view);

			case ASE_Project.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart(view);

			case ASE_Project.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart(view);

			case ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
				return new ASE_Project.diagram.edit.parts.DataflowEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
