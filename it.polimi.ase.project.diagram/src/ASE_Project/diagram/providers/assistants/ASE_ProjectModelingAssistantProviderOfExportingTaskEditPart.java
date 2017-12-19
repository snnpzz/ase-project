/*
 * 
 */
package ASE_Project.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ASE_ProjectModelingAssistantProviderOfExportingTaskEditPart
		extends ASE_Project.diagram.providers.ASE_ProjectModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ASE_Project.diagram.edit.parts.ExportingTaskEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ASE_Project.diagram.edit.parts.ExportingTaskEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ASE_Project.diagram.edit.parts.ExportingTaskEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ASE_Project.diagram.edit.parts.ExportingTaskEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ASE_Project.diagram.edit.parts.CollectionTaskEditPart) {
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001);
		}
		if (targetEditPart instanceof ASE_Project.diagram.edit.parts.IntegrationTaskEditPart) {
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001);
		}
		if (targetEditPart instanceof ASE_Project.diagram.edit.parts.CleaningTaskEditPart) {
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001);
		}
		if (targetEditPart instanceof ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart) {
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001);
		}
		if (targetEditPart instanceof ASE_Project.diagram.edit.parts.VisualizationTaskEditPart) {
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001);
		}
		if (targetEditPart instanceof ASE_Project.diagram.edit.parts.ExportingTaskEditPart) {
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ASE_Project.diagram.edit.parts.ExportingTaskEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ASE_Project.diagram.edit.parts.ExportingTaskEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001) {
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.CollectionTask_2001);
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.IntegrationTask_2002);
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.CleaningTask_2003);
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.AnalyzesTask_2004);
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.VisualizationTask_2005);
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.ExportingTask_2006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ASE_Project.diagram.edit.parts.ExportingTaskEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ASE_Project.diagram.edit.parts.ExportingTaskEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ASE_Project.diagram.edit.parts.ExportingTaskEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ASE_Project.diagram.edit.parts.ExportingTaskEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001) {
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.CollectionTask_2001);
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.IntegrationTask_2002);
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.CleaningTask_2003);
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.AnalyzesTask_2004);
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.VisualizationTask_2005);
			types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.ExportingTask_2006);
		}
		return types;
	}

}
