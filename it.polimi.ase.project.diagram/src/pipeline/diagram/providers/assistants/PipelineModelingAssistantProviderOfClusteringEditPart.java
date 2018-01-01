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

import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.PredefinedCleaningOperationEditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.UserDefinedCleaningOperationEditPart;
import pipeline.diagram.providers.PipelineElementTypes;
import pipeline.diagram.providers.PipelineModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineModelingAssistantProviderOfClusteringEditPart extends PipelineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ClusteringEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ClusteringEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PipelineElementTypes.InternalDataFlow_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ClusteringEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ClusteringEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof UserDefinedCleaningOperationEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4006);
		}
		if (targetEditPart instanceof PredefinedCleaningOperationEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4006);
		}
		if (targetEditPart instanceof DescriptiveEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4006);
		}
		if (targetEditPart instanceof ClassificationEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4006);
		}
		if (targetEditPart instanceof PredictiveEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4006);
		}
		if (targetEditPart instanceof ClusteringEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ClusteringEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ClusteringEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.InternalDataFlow_4006) {
			types.add(PipelineElementTypes.UserDefinedCleaningOperation_3050);
			types.add(PipelineElementTypes.PredefinedCleaningOperation_3051);
			types.add(PipelineElementTypes.Descriptive_3042);
			types.add(PipelineElementTypes.Classification_3043);
			types.add(PipelineElementTypes.Predictive_3044);
			types.add(PipelineElementTypes.Clustering_3045);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ClusteringEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ClusteringEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PipelineElementTypes.InternalDataFlow_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ClusteringEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ClusteringEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.InternalDataFlow_4006) {
			types.add(PipelineElementTypes.UserDefinedCleaningOperation_3050);
			types.add(PipelineElementTypes.PredefinedCleaningOperation_3051);
			types.add(PipelineElementTypes.Descriptive_3042);
			types.add(PipelineElementTypes.Classification_3043);
			types.add(PipelineElementTypes.Predictive_3044);
			types.add(PipelineElementTypes.Clustering_3045);
		}
		return types;
	}

}
