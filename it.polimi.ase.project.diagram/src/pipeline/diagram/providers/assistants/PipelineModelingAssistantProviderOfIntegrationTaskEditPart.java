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
import pipeline.diagram.edit.parts.ComplexAttribute2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.SimpleAttribute2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskEditPart;
import pipeline.diagram.providers.PipelineElementTypes;
import pipeline.diagram.providers.PipelineModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineModelingAssistantProviderOfIntegrationTaskEditPart extends PipelineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((IntegrationTaskEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(IntegrationTaskEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.DataFlow_4001);
		types.add(PipelineElementTypes.IntegrationTaskAttributes_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((IntegrationTaskEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(IntegrationTaskEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CollectionTaskEditPart) {
			types.add(PipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof IntegrationTaskEditPart) {
			types.add(PipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof CleaningTaskEditPart) {
			types.add(PipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof AnalysisTaskEditPart) {
			types.add(PipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof VisualizationTaskEditPart) {
			types.add(PipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof ExportTaskEditPart) {
			types.add(PipelineElementTypes.DataFlow_4001);
		}
		if (targetEditPart instanceof SimpleAttributeEditPart) {
			types.add(PipelineElementTypes.IntegrationTaskAttributes_4005);
		}
		if (targetEditPart instanceof ComplexAttributeEditPart) {
			types.add(PipelineElementTypes.IntegrationTaskAttributes_4005);
		}
		if (targetEditPart instanceof SimpleAttribute2EditPart) {
			types.add(PipelineElementTypes.IntegrationTaskAttributes_4005);
		}
		if (targetEditPart instanceof ComplexAttribute2EditPart) {
			types.add(PipelineElementTypes.IntegrationTaskAttributes_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((IntegrationTaskEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(IntegrationTaskEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.DataFlow_4001) {
			types.add(PipelineElementTypes.CollectionTask_2001);
			types.add(PipelineElementTypes.IntegrationTask_2002);
			types.add(PipelineElementTypes.CleaningTask_2003);
			types.add(PipelineElementTypes.AnalysisTask_2004);
			types.add(PipelineElementTypes.VisualizationTask_2005);
			types.add(PipelineElementTypes.ExportTask_2006);
		} else if (relationshipType == PipelineElementTypes.IntegrationTaskAttributes_4005) {
			types.add(PipelineElementTypes.SimpleAttribute_3009);
			types.add(PipelineElementTypes.ComplexAttribute_3010);
			types.add(PipelineElementTypes.SimpleAttribute_3011);
			types.add(PipelineElementTypes.ComplexAttribute_3012);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((IntegrationTaskEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(IntegrationTaskEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PipelineElementTypes.DataFlow_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((IntegrationTaskEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(IntegrationTaskEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.DataFlow_4001) {
			types.add(PipelineElementTypes.CollectionTask_2001);
			types.add(PipelineElementTypes.IntegrationTask_2002);
			types.add(PipelineElementTypes.CleaningTask_2003);
			types.add(PipelineElementTypes.AnalysisTask_2004);
			types.add(PipelineElementTypes.VisualizationTask_2005);
			types.add(PipelineElementTypes.ExportTask_2006);
		}
		return types;
	}

}
