/*
 * 
 */
package ASEProject.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ASEProjectModelingAssistantProviderOfCollectionTaskEditPart
		extends ASEProject.diagram.providers.ASEProjectModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ASEProject.diagram.edit.parts.CollectionTaskEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ASEProject.diagram.edit.parts.CollectionTaskEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ASEProject.diagram.edit.parts.CollectionTaskEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ASEProject.diagram.edit.parts.CollectionTaskEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ASEProject.diagram.edit.parts.CollectionTaskEditPart) {
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002);
		}
		if (targetEditPart instanceof ASEProject.diagram.edit.parts.IntegrationTaskEditPart) {
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002);
		}
		if (targetEditPart instanceof ASEProject.diagram.edit.parts.CleaningTaskEditPart) {
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002);
		}
		if (targetEditPart instanceof ASEProject.diagram.edit.parts.AnalyzesTaskEditPart) {
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002);
		}
		if (targetEditPart instanceof ASEProject.diagram.edit.parts.VisualizationTaskEditPart) {
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002);
		}
		if (targetEditPart instanceof ASEProject.diagram.edit.parts.ExportingTaskEditPart) {
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ASEProject.diagram.edit.parts.CollectionTaskEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ASEProject.diagram.edit.parts.CollectionTaskEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002) {
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.CollectionTask_2007);
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.IntegrationTask_2008);
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.CleaningTask_2009);
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.AnalyzesTask_2010);
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.VisualizationTask_2011);
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.ExportingTask_2012);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ASEProject.diagram.edit.parts.CollectionTaskEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ASEProject.diagram.edit.parts.CollectionTaskEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ASEProject.diagram.edit.parts.CollectionTaskEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ASEProject.diagram.edit.parts.CollectionTaskEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002) {
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.CollectionTask_2007);
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.IntegrationTask_2008);
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.CleaningTask_2009);
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.AnalyzesTask_2010);
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.VisualizationTask_2011);
			types.add(ASEProject.diagram.providers.ASEProjectElementTypes.ExportingTask_2012);
		}
		return types;
	}

}
