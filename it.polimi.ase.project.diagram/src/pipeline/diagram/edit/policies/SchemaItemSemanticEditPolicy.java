/*
* 
*/
package pipeline.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import pipeline.diagram.edit.commands.DataFlowSchemaCreateCommand;
import pipeline.diagram.edit.commands.DataFlowSchemaReorientCommand;
import pipeline.diagram.edit.commands.ExportOperationUseCreateCommand;
import pipeline.diagram.edit.commands.ExportOperationUseReorientCommand;
import pipeline.diagram.edit.commands.ImportOperationUseCreateCommand;
import pipeline.diagram.edit.commands.ImportOperationUseReorientCommand;
import pipeline.diagram.edit.commands.InternalDataFlowSchemaCreateCommand;
import pipeline.diagram.edit.commands.InternalDataFlowSchemaReorientCommand;
import pipeline.diagram.edit.parts.ChartAxesEditPart;
import pipeline.diagram.edit.parts.ComplexAttributeEditPart;
import pipeline.diagram.edit.parts.DataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.ExportOperationUseEditPart;
import pipeline.diagram.edit.parts.ImportOperationUseEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.SchemaSchemaAttributesCompartmentEditPart;
import pipeline.diagram.edit.parts.SimpleAttributeEditPart;
import pipeline.diagram.part.PipelineVisualIDRegistry;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class SchemaItemSemanticEditPolicy extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SchemaItemSemanticEditPolicy() {
		super(PipelineElementTypes.Schema_2009);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (PipelineVisualIDRegistry.getVisualID(incomingLink) == DataFlowSchemaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (PipelineVisualIDRegistry.getVisualID(incomingLink) == InternalDataFlowSchemaEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (PipelineVisualIDRegistry.getVisualID(incomingLink) == ImportOperationUseEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (PipelineVisualIDRegistry.getVisualID(incomingLink) == ExportOperationUseEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (PipelineVisualIDRegistry.getVisualID(node)) {
			case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (PipelineVisualIDRegistry.getVisualID(cnode)) {
					case SimpleAttributeEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (PipelineVisualIDRegistry.getVisualID(incomingLink) == ChartAxesEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(), null,
										incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case ComplexAttributeEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (PipelineElementTypes.DataFlowSchema_4003 == req.getElementType()) {
			return null;
		}
		if (PipelineElementTypes.InternalDataFlowSchema_4004 == req.getElementType()) {
			return null;
		}
		if (PipelineElementTypes.ImportOperationUse_4007 == req.getElementType()) {
			return null;
		}
		if (PipelineElementTypes.ExportOperationUse_4008 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (PipelineElementTypes.DataFlowSchema_4003 == req.getElementType()) {
			return getGEFWrapper(new DataFlowSchemaCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (PipelineElementTypes.InternalDataFlowSchema_4004 == req.getElementType()) {
			return getGEFWrapper(new InternalDataFlowSchemaCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (PipelineElementTypes.ImportOperationUse_4007 == req.getElementType()) {
			return getGEFWrapper(new ImportOperationUseCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (PipelineElementTypes.ExportOperationUse_4008 == req.getElementType()) {
			return getGEFWrapper(new ExportOperationUseCreateCommand(req, req.getSource(), req.getTarget()));
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
		case DataFlowSchemaEditPart.VISUAL_ID:
			return getGEFWrapper(new DataFlowSchemaReorientCommand(req));
		case InternalDataFlowSchemaEditPart.VISUAL_ID:
			return getGEFWrapper(new InternalDataFlowSchemaReorientCommand(req));
		case ImportOperationUseEditPart.VISUAL_ID:
			return getGEFWrapper(new ImportOperationUseReorientCommand(req));
		case ExportOperationUseEditPart.VISUAL_ID:
			return getGEFWrapper(new ExportOperationUseReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
