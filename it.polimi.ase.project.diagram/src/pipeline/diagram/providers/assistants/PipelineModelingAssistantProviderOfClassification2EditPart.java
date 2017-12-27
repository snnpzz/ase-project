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

import pipeline.diagram.edit.parts.Classification2EditPart;
import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.Clustering2EditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.Descriptive2EditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.Predefined2EditPart;
import pipeline.diagram.edit.parts.PredefinedEditPart;
import pipeline.diagram.edit.parts.Predictive2EditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.UserDefined2EditPart;
import pipeline.diagram.edit.parts.UserDefinedEditPart;
import pipeline.diagram.providers.PipelineElementTypes;
import pipeline.diagram.providers.PipelineModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineModelingAssistantProviderOfClassification2EditPart extends PipelineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Classification2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Classification2EditPart source) {
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
		return doGetRelTypesOnSourceAndTarget((Classification2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Classification2EditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof UserDefinedEditPart) {
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
		if (targetEditPart instanceof PredefinedEditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4006);
		}
		if (targetEditPart instanceof UserDefined2EditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4006);
		}
		if (targetEditPart instanceof Predefined2EditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4006);
		}
		if (targetEditPart instanceof Descriptive2EditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4006);
		}
		if (targetEditPart instanceof Classification2EditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4006);
		}
		if (targetEditPart instanceof Predictive2EditPart) {
			types.add(PipelineElementTypes.InternalDataFlow_4006);
		}
		if (targetEditPart instanceof Clustering2EditPart) {
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
		return doGetTypesForTarget((Classification2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Classification2EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.InternalDataFlow_4006) {
			types.add(PipelineElementTypes.UserDefined_2033);
			types.add(PipelineElementTypes.Descriptive_2034);
			types.add(PipelineElementTypes.Classification_2035);
			types.add(PipelineElementTypes.Predictive_2036);
			types.add(PipelineElementTypes.Clustering_2037);
			types.add(PipelineElementTypes.Predefined_2038);
			types.add(PipelineElementTypes.UserDefined_3026);
			types.add(PipelineElementTypes.Predefined_3027);
			types.add(PipelineElementTypes.Descriptive_3033);
			types.add(PipelineElementTypes.Classification_3034);
			types.add(PipelineElementTypes.Predictive_3035);
			types.add(PipelineElementTypes.Clustering_3036);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Classification2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(Classification2EditPart target) {
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
		return doGetTypesForSource((Classification2EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(Classification2EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.InternalDataFlow_4006) {
			types.add(PipelineElementTypes.UserDefined_2033);
			types.add(PipelineElementTypes.Descriptive_2034);
			types.add(PipelineElementTypes.Classification_2035);
			types.add(PipelineElementTypes.Predictive_2036);
			types.add(PipelineElementTypes.Clustering_2037);
			types.add(PipelineElementTypes.Predefined_2038);
			types.add(PipelineElementTypes.UserDefined_3026);
			types.add(PipelineElementTypes.Predefined_3027);
			types.add(PipelineElementTypes.Descriptive_3033);
			types.add(PipelineElementTypes.Classification_3034);
			types.add(PipelineElementTypes.Predictive_3035);
			types.add(PipelineElementTypes.Clustering_3036);
		}
		return types;
	}

}
