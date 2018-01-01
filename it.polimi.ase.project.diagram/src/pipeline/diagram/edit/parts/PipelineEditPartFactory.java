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

			case CollectionTaskIDEditPart.VISUAL_ID:
				return new CollectionTaskIDEditPart(view);

			case IntegrationTaskEditPart.VISUAL_ID:
				return new IntegrationTaskEditPart(view);

			case IntegrationTaskIDEditPart.VISUAL_ID:
				return new IntegrationTaskIDEditPart(view);

			case CleaningTaskEditPart.VISUAL_ID:
				return new CleaningTaskEditPart(view);

			case CleaningTaskIDEditPart.VISUAL_ID:
				return new CleaningTaskIDEditPart(view);

			case AnalysisTaskEditPart.VISUAL_ID:
				return new AnalysisTaskEditPart(view);

			case AnalysisTaskIDEditPart.VISUAL_ID:
				return new AnalysisTaskIDEditPart(view);

			case VisualizationTaskEditPart.VISUAL_ID:
				return new VisualizationTaskEditPart(view);

			case VisualizationTaskIDEditPart.VISUAL_ID:
				return new VisualizationTaskIDEditPart(view);

			case ExportTaskEditPart.VISUAL_ID:
				return new ExportTaskEditPart(view);

			case ExportTaskIDEditPart.VISUAL_ID:
				return new ExportTaskIDEditPart(view);

			case SourceEditPart.VISUAL_ID:
				return new SourceEditPart(view);

			case SourceNameEditPart.VISUAL_ID:
				return new SourceNameEditPart(view);

			case FileEditPart.VISUAL_ID:
				return new FileEditPart(view);

			case FileNameEditPart.VISUAL_ID:
				return new FileNameEditPart(view);

			case SchemaEditPart.VISUAL_ID:
				return new SchemaEditPart(view);

			case ImportEditPart.VISUAL_ID:
				return new ImportEditPart(view);

			case ImportNameEditPart.VISUAL_ID:
				return new ImportNameEditPart(view);

			case UserDefinedCleaningOperationEditPart.VISUAL_ID:
				return new UserDefinedCleaningOperationEditPart(view);

			case UserDefinedCleaningOperationNameEditPart.VISUAL_ID:
				return new UserDefinedCleaningOperationNameEditPart(view);

			case PredefinedCleaningOperationEditPart.VISUAL_ID:
				return new PredefinedCleaningOperationEditPart(view);

			case PredefinedCleaningOperationNameEditPart.VISUAL_ID:
				return new PredefinedCleaningOperationNameEditPart(view);

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

			case SimpleAttributeEditPart.VISUAL_ID:
				return new SimpleAttributeEditPart(view);

			case SimpleAttributeNameEditPart.VISUAL_ID:
				return new SimpleAttributeNameEditPart(view);

			case ComplexAttributeEditPart.VISUAL_ID:
				return new ComplexAttributeEditPart(view);

			case ComplexAttributeNameEditPart.VISUAL_ID:
				return new ComplexAttributeNameEditPart(view);

			case SimpleAttribute2EditPart.VISUAL_ID:
				return new SimpleAttribute2EditPart(view);

			case SimpleAttributeName2EditPart.VISUAL_ID:
				return new SimpleAttributeName2EditPart(view);

			case ComplexAttribute2EditPart.VISUAL_ID:
				return new ComplexAttribute2EditPart(view);

			case ComplexAttributeName2EditPart.VISUAL_ID:
				return new ComplexAttributeName2EditPart(view);

			case CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
				return new CollectionTaskCollectionTaskImportsCompartmentEditPart(view);

			case CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart.VISUAL_ID:
				return new CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart(view);

			case AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart.VISUAL_ID:
				return new AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart(view);

			case ExportTaskExportTaskExportsCompartmentEditPart.VISUAL_ID:
				return new ExportTaskExportTaskExportsCompartmentEditPart(view);

			case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
				return new SchemaSchemaAttributesCompartmentEditPart(view);

			case ComplexAttributeComplexAttributeAttributesCompartmentEditPart.VISUAL_ID:
				return new ComplexAttributeComplexAttributeAttributesCompartmentEditPart(view);

			case ComplexAttributeComplexAttributeAttributesCompartment2EditPart.VISUAL_ID:
				return new ComplexAttributeComplexAttributeAttributesCompartment2EditPart(view);

			case DataFlowEditPart.VISUAL_ID:
				return new DataFlowEditPart(view);

			case InternalDataFlowEditPart.VISUAL_ID:
				return new InternalDataFlowEditPart(view);

			case DataFlowSchemaEditPart.VISUAL_ID:
				return new DataFlowSchemaEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case InternalDataFlowSchemaEditPart.VISUAL_ID:
				return new InternalDataFlowSchemaEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ImportReadEditPart.VISUAL_ID:
				return new ImportReadEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case ImportImpUsesEditPart.VISUAL_ID:
				return new ImportImpUsesEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case ExportWriteEditPart.VISUAL_ID:
				return new ExportWriteEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case ExportExpUsesEditPart.VISUAL_ID:
				return new ExportExpUsesEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

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
