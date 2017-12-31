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

import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.SchemaEditPart;
import pipeline.diagram.edit.parts.SourceEditPart;
import pipeline.diagram.providers.PipelineElementTypes;
import pipeline.diagram.providers.PipelineModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineModelingAssistantProviderOfImportEditPart extends PipelineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ImportEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ImportEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.ImportReadsFrom_4007);
		types.add(PipelineElementTypes.ImportImpUses_4013);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ImportEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ImportEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof SourceEditPart) {
			types.add(PipelineElementTypes.ImportReadsFrom_4007);
		}
		if (targetEditPart instanceof SchemaEditPart) {
			types.add(PipelineElementTypes.ImportImpUses_4013);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ImportEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ImportEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.ImportReadsFrom_4007) {
			types.add(PipelineElementTypes.Source_2044);
		} else if (relationshipType == PipelineElementTypes.ImportImpUses_4013) {
			types.add(PipelineElementTypes.Schema_2043);
		}
		return types;
	}

}
