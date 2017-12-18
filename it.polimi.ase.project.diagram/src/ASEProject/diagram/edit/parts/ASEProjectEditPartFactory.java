/*
 * 
 */
package ASEProject.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ASEProjectEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(view)) {

			case ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.PipelineEditPart(view);

			case ASEProject.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.CollectionTaskEditPart(view);

			case ASEProject.diagram.edit.parts.CollectionTaskNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.CollectionTaskNameEditPart(view);

			case ASEProject.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.IntegrationTaskEditPart(view);

			case ASEProject.diagram.edit.parts.IntegrationTaskNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.IntegrationTaskNameEditPart(view);

			case ASEProject.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.CleaningTaskEditPart(view);

			case ASEProject.diagram.edit.parts.CleaningTaskNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.CleaningTaskNameEditPart(view);

			case ASEProject.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.AnalyzesTaskEditPart(view);

			case ASEProject.diagram.edit.parts.AnalyzesTaskNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.AnalyzesTaskNameEditPart(view);

			case ASEProject.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.VisualizationTaskEditPart(view);

			case ASEProject.diagram.edit.parts.VisualizationTaskNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.VisualizationTaskNameEditPart(view);

			case ASEProject.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.ExportingTaskEditPart(view);

			case ASEProject.diagram.edit.parts.ExportingTaskNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.ExportingTaskNameEditPart(view);

			case ASEProject.diagram.edit.parts.ImportEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.ImportEditPart(view);

			case ASEProject.diagram.edit.parts.ImportNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.ImportNameEditPart(view);

			case ASEProject.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.UserDefinedEditPart(view);

			case ASEProject.diagram.edit.parts.UserDefinedNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.UserDefinedNameEditPart(view);

			case ASEProject.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.PredefinedEditPart(view);

			case ASEProject.diagram.edit.parts.PredefinedNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.PredefinedNameEditPart(view);

			case ASEProject.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.DescriptiveEditPart(view);

			case ASEProject.diagram.edit.parts.DescriptiveNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.DescriptiveNameEditPart(view);

			case ASEProject.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.ClassificationEditPart(view);

			case ASEProject.diagram.edit.parts.ClassificationNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.ClassificationNameEditPart(view);

			case ASEProject.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.PredictiveEditPart(view);

			case ASEProject.diagram.edit.parts.PredictiveNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.PredictiveNameEditPart(view);

			case ASEProject.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.ClusteringEditPart(view);

			case ASEProject.diagram.edit.parts.ClusteringNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.ClusteringNameEditPart(view);

			case ASEProject.diagram.edit.parts.ExportEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.ExportEditPart(view);

			case ASEProject.diagram.edit.parts.ExportNameEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.ExportNameEditPart(view);

			case ASEProject.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart(view);

			case ASEProject.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart(view);

			case ASEProject.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart(view);

			case ASEProject.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart(view);

			case ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
				return new ASEProject.diagram.edit.parts.DataflowEditPart(view);

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
