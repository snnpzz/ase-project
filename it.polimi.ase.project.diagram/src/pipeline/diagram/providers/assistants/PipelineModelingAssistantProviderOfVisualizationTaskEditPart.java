/*
 * 
 */
package pipeline.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pipeline.diagram.edit.parts.AnalyzesTaskEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.ExportingTaskEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskEditPart;
import pipeline.diagram.providers.PipelineElementTypes;
import pipeline.diagram.providers.PipelineModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineModelingAssistantProviderOfVisualizationTaskEditPart extends PipelineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((VisualizationTaskEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(VisualizationTaskEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PipelineElementTypes.Dataflow_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((VisualizationTaskEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(VisualizationTaskEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CollectionTaskEditPart) {
			types.add(PipelineElementTypes.Dataflow_4004);
		}
		if (targetEditPart instanceof IntegrationTaskEditPart) {
			types.add(PipelineElementTypes.Dataflow_4004);
		}
		if (targetEditPart instanceof CleaningTaskEditPart) {
			types.add(PipelineElementTypes.Dataflow_4004);
		}
		if (targetEditPart instanceof AnalyzesTaskEditPart) {
			types.add(PipelineElementTypes.Dataflow_4004);
		}
		if (targetEditPart instanceof VisualizationTaskEditPart) {
			types.add(PipelineElementTypes.Dataflow_4004);
		}
		if (targetEditPart instanceof ExportingTaskEditPart) {
			types.add(PipelineElementTypes.Dataflow_4004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((VisualizationTaskEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(VisualizationTaskEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.Dataflow_4004) {
			types.add(PipelineElementTypes.CollectionTask_2025);
			types.add(PipelineElementTypes.IntegrationTask_2026);
			types.add(PipelineElementTypes.CleaningTask_2027);
			types.add(PipelineElementTypes.AnalyzesTask_2028);
			types.add(PipelineElementTypes.VisualizationTask_2029);
			types.add(PipelineElementTypes.ExportingTask_2030);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((VisualizationTaskEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(VisualizationTaskEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PipelineElementTypes.Dataflow_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((VisualizationTaskEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(VisualizationTaskEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.Dataflow_4004) {
			types.add(PipelineElementTypes.CollectionTask_2025);
			types.add(PipelineElementTypes.IntegrationTask_2026);
			types.add(PipelineElementTypes.CleaningTask_2027);
			types.add(PipelineElementTypes.AnalyzesTask_2028);
			types.add(PipelineElementTypes.VisualizationTask_2029);
			types.add(PipelineElementTypes.ExportingTask_2030);
		}
		return types;
	}

}
