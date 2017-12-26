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

import pipeline.diagram.edit.parts.AnalysisTaskEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskEditPart;
import pipeline.diagram.providers.PipelineElementTypes;
import pipeline.diagram.providers.PipelineModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineModelingAssistantProviderOfAnalysisTaskEditPart extends PipelineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((AnalysisTaskEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(AnalysisTaskEditPart source) {
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
		return doGetRelTypesOnSourceAndTarget((AnalysisTaskEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(AnalysisTaskEditPart source,
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
		if (targetEditPart instanceof AnalysisTaskEditPart) {
			types.add(PipelineElementTypes.Dataflow_4004);
		}
		if (targetEditPart instanceof VisualizationTaskEditPart) {
			types.add(PipelineElementTypes.Dataflow_4004);
		}
		if (targetEditPart instanceof ExportTaskEditPart) {
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
		return doGetTypesForTarget((AnalysisTaskEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(AnalysisTaskEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.Dataflow_4004) {
			types.add(PipelineElementTypes.CollectionTask_2025);
			types.add(PipelineElementTypes.IntegrationTask_2026);
			types.add(PipelineElementTypes.CleaningTask_2027);
			types.add(PipelineElementTypes.AnalysisTask_2031);
			types.add(PipelineElementTypes.VisualizationTask_2029);
			types.add(PipelineElementTypes.ExportTask_2032);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((AnalysisTaskEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(AnalysisTaskEditPart target) {
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
		return doGetTypesForSource((AnalysisTaskEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(AnalysisTaskEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.Dataflow_4004) {
			types.add(PipelineElementTypes.CollectionTask_2025);
			types.add(PipelineElementTypes.IntegrationTask_2026);
			types.add(PipelineElementTypes.CleaningTask_2027);
			types.add(PipelineElementTypes.AnalysisTask_2031);
			types.add(PipelineElementTypes.VisualizationTask_2029);
			types.add(PipelineElementTypes.ExportTask_2032);
		}
		return types;
	}

}
