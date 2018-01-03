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

import pipeline.diagram.edit.parts.ClassificationAnalysisOperationEditPart;
import pipeline.diagram.edit.parts.ClusteringAnalysisOperationEditPart;
import pipeline.diagram.edit.parts.DescriptiveAnalysisOperationEditPart;
import pipeline.diagram.edit.parts.PredefinedCleaningOperationEditPart;
import pipeline.diagram.edit.parts.PredictiveAnalysisOperationEditPart;
import pipeline.diagram.edit.parts.UserDefinedCleaningOperationEditPart;
import pipeline.diagram.providers.PipelineElementTypes;
import pipeline.diagram.providers.PipelineModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineModelingAssistantProviderOfPredictiveAnalysisOperationEditPart
		extends PipelineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((PredictiveAnalysisOperationEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(PredictiveAnalysisOperationEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PipelineElementTypes.InternalDataFlow_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((PredictiveAnalysisOperationEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(PredictiveAnalysisOperationEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof UserDefinedCleaningOperationEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4002);
		}
		if (targetEditPart instanceof PredefinedCleaningOperationEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4002);
		}
		if (targetEditPart instanceof DescriptiveAnalysisOperationEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4002);
		}
		if (targetEditPart instanceof ClassificationAnalysisOperationEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4002);
		}
		if (targetEditPart instanceof PredictiveAnalysisOperationEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4002);
		}
		if (targetEditPart instanceof ClusteringAnalysisOperationEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((PredictiveAnalysisOperationEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(PredictiveAnalysisOperationEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.InternalDataFlow_4002) {
			types.add(PipelineElementTypes.UserDefinedCleaningOperation_3002);
			types.add(PipelineElementTypes.PredefinedCleaningOperation_3003);
			types.add(PipelineElementTypes.DescriptiveAnalysisOperation_3004);
			types.add(PipelineElementTypes.ClassificationAnalysisOperation_3005);
			types.add(PipelineElementTypes.PredictiveAnalysisOperation_3006);
			types.add(PipelineElementTypes.ClusteringAnalysisOperation_3007);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((PredictiveAnalysisOperationEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(PredictiveAnalysisOperationEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PipelineElementTypes.InternalDataFlow_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((PredictiveAnalysisOperationEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(PredictiveAnalysisOperationEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.InternalDataFlow_4002) {
			types.add(PipelineElementTypes.UserDefinedCleaningOperation_3002);
			types.add(PipelineElementTypes.PredefinedCleaningOperation_3003);
			types.add(PipelineElementTypes.DescriptiveAnalysisOperation_3004);
			types.add(PipelineElementTypes.ClassificationAnalysisOperation_3005);
			types.add(PipelineElementTypes.PredictiveAnalysisOperation_3006);
			types.add(PipelineElementTypes.ClusteringAnalysisOperation_3007);
		}
		return types;
	}

}
