/*
 * 
 */
package pipeline.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.providers.PipelineElementTypes;
import pipeline.diagram.providers.PipelineModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineModelingAssistantProviderOfFileEditPart extends PipelineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((FileEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(FileEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PipelineElementTypes.ExportOperationWrite_4013);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((FileEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(FileEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PipelineElementTypes.ExportOperationWrite_4013) {
			types.add(PipelineElementTypes.ExportOperation_3014);
		}
		return types;
	}

}
