/*
 * 
 */
package pipeline.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import pipeline.diagram.part.PipelineVisualIDRegistry;

/**
 * @generated
 */
public class PipelineEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (PipelineVisualIDRegistry.getVisualID(view)) {

			case PipelineEditPart.VISUAL_ID:
				return new PipelineEditPart(view);

			case CollectionTaskEditPart.VISUAL_ID:
				return new CollectionTaskEditPart(view);

			case CollectionTaskNameEditPart.VISUAL_ID:
				return new CollectionTaskNameEditPart(view);

			case IntegrationTaskEditPart.VISUAL_ID:
				return new IntegrationTaskEditPart(view);

			case IntegrationTaskNameEditPart.VISUAL_ID:
				return new IntegrationTaskNameEditPart(view);

			case CleaningTaskEditPart.VISUAL_ID:
				return new CleaningTaskEditPart(view);

			case CleaningTaskNameEditPart.VISUAL_ID:
				return new CleaningTaskNameEditPart(view);

			case AnalyzesTaskEditPart.VISUAL_ID:
				return new AnalyzesTaskEditPart(view);

			case AnalyzesTaskNameEditPart.VISUAL_ID:
				return new AnalyzesTaskNameEditPart(view);

			case VisualizationTaskEditPart.VISUAL_ID:
				return new VisualizationTaskEditPart(view);

			case VisualizationTaskNameEditPart.VISUAL_ID:
				return new VisualizationTaskNameEditPart(view);

			case ExportingTaskEditPart.VISUAL_ID:
				return new ExportingTaskEditPart(view);

			case ExportingTaskNameEditPart.VISUAL_ID:
				return new ExportingTaskNameEditPart(view);

			case ImportEditPart.VISUAL_ID:
				return new ImportEditPart(view);

			case ImportNameEditPart.VISUAL_ID:
				return new ImportNameEditPart(view);

			case UserDefinedEditPart.VISUAL_ID:
				return new UserDefinedEditPart(view);

			case UserDefinedNameEditPart.VISUAL_ID:
				return new UserDefinedNameEditPart(view);

			case PredefinedEditPart.VISUAL_ID:
				return new PredefinedEditPart(view);

			case PredefinedNameEditPart.VISUAL_ID:
				return new PredefinedNameEditPart(view);

			case DescriptiveEditPart.VISUAL_ID:
				return new DescriptiveEditPart(view);

			case DescriptiveNameEditPart.VISUAL_ID:
				return new DescriptiveNameEditPart(view);

			case ClassificationEditPart.VISUAL_ID:
				return new ClassificationEditPart(view);

			case ClassificationNameEditPart.VISUAL_ID:
				return new ClassificationNameEditPart(view);

			case PredictiveEditPart.VISUAL_ID:
				return new PredictiveEditPart(view);

			case PredictiveNameEditPart.VISUAL_ID:
				return new PredictiveNameEditPart(view);

			case ClusteringEditPart.VISUAL_ID:
				return new ClusteringEditPart(view);

			case ClusteringNameEditPart.VISUAL_ID:
				return new ClusteringNameEditPart(view);

			case ExportEditPart.VISUAL_ID:
				return new ExportEditPart(view);

			case ExportNameEditPart.VISUAL_ID:
				return new ExportNameEditPart(view);

			case CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
				return new CollectionTaskCollectionTaskImportsCompartmentEditPart(view);

			case CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
				return new CleaningTaskCleaningTaskOperationsCompartmentEditPart(view);

			case AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
				return new AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart(view);

			case ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
				return new ExportingTaskExportingTaskExportsCompartmentEditPart(view);

			case DataflowEditPart.VISUAL_ID:
				return new DataflowEditPart(view);

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
