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

			case UserDefinedEditPart.VISUAL_ID:
				return new UserDefinedEditPart(view);

			case UserDefinedNameEditPart.VISUAL_ID:
				return new UserDefinedNameEditPart(view);

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

			case PredefinedEditPart.VISUAL_ID:
				return new PredefinedEditPart(view);

			case PredefinedNameEditPart.VISUAL_ID:
				return new PredefinedNameEditPart(view);

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

			case UserDefined2EditPart.VISUAL_ID:
				return new UserDefined2EditPart(view);

			case UserDefinedName2EditPart.VISUAL_ID:
				return new UserDefinedName2EditPart(view);

			case Predefined2EditPart.VISUAL_ID:
				return new Predefined2EditPart(view);

			case PredefinedName2EditPart.VISUAL_ID:
				return new PredefinedName2EditPart(view);

			case Descriptive2EditPart.VISUAL_ID:
				return new Descriptive2EditPart(view);

			case DescriptiveName2EditPart.VISUAL_ID:
				return new DescriptiveName2EditPart(view);

			case Classification2EditPart.VISUAL_ID:
				return new Classification2EditPart(view);

			case ClassificationName2EditPart.VISUAL_ID:
				return new ClassificationName2EditPart(view);

			case Predictive2EditPart.VISUAL_ID:
				return new Predictive2EditPart(view);

			case PredictiveName2EditPart.VISUAL_ID:
				return new PredictiveName2EditPart(view);

			case Clustering2EditPart.VISUAL_ID:
				return new Clustering2EditPart(view);

			case ClusteringName2EditPart.VISUAL_ID:
				return new ClusteringName2EditPart(view);

			case ExportEditPart.VISUAL_ID:
				return new ExportEditPart(view);

			case ExportNameEditPart.VISUAL_ID:
				return new ExportNameEditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case AttributeNameEditPart.VISUAL_ID:
				return new AttributeNameEditPart(view);

			case Attribute2EditPart.VISUAL_ID:
				return new Attribute2EditPart(view);

			case AttributeName2EditPart.VISUAL_ID:
				return new AttributeName2EditPart(view);

			case CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
				return new CollectionTaskCollectionTaskImportsCompartmentEditPart(view);

			case CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
				return new CleaningTaskCleaningTaskOperationsCompartmentEditPart(view);

			case AnalysisTaskAnalysisTaskAnalyzesCompartmentEditPart.VISUAL_ID:
				return new AnalysisTaskAnalysisTaskAnalyzesCompartmentEditPart(view);

			case ExportTaskExportTaskExportsCompartmentEditPart.VISUAL_ID:
				return new ExportTaskExportTaskExportsCompartmentEditPart(view);

			case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
				return new SchemaSchemaAttributesCompartmentEditPart(view);

			case AttributeAttributeAttributesCompartmentEditPart.VISUAL_ID:
				return new AttributeAttributeAttributesCompartmentEditPart(view);

			case AttributeAttributeAttributesCompartment2EditPart.VISUAL_ID:
				return new AttributeAttributeAttributesCompartment2EditPart(view);

			case DataFlowEditPart.VISUAL_ID:
				return new DataFlowEditPart(view);

			case InternalDataFlowEditPart.VISUAL_ID:
				return new InternalDataFlowEditPart(view);

			case DataFlowDFschemaEditPart.VISUAL_ID:
				return new DataFlowDFschemaEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case InternalDataFlowIntDFschemaEditPart.VISUAL_ID:
				return new InternalDataFlowIntDFschemaEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ImportReadsFromEditPart.VISUAL_ID:
				return new ImportReadsFromEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case ImportImpUsesEditPart.VISUAL_ID:
				return new ImportImpUsesEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case ExportGeneratesEditPart.VISUAL_ID:
				return new ExportGeneratesEditPart(view);

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
