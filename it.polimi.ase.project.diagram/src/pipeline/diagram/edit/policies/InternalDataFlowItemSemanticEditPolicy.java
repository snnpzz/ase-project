/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

import pipeline.diagram.edit.commands.InternalDataFlowSchemaCreateCommand;
import pipeline.diagram.edit.commands.InternalDataFlowSchemaReorientCommand;
import pipeline.diagram.edit.parts.InternalDataFlowSchemaEditPart;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class InternalDataFlowItemSemanticEditPolicy extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InternalDataFlowItemSemanticEditPolicy() {
		super(PipelineElementTypes.InternalDataFlow_4006);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (PipelineElementTypes.InternalDataFlowSchema_4024 == req.getElementType()) {
			return getGEFWrapper(new InternalDataFlowSchemaCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (PipelineElementTypes.InternalDataFlowSchema_4024 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case InternalDataFlowSchemaEditPart.VISUAL_ID:
			return getGEFWrapper(new InternalDataFlowSchemaReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
