/*
 * 
 */
package pipeline.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import pipeline.Attribute;
import pipeline.IntegrationTask;
import pipeline.diagram.edit.policies.PipelineBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class IntegrationTaskAttributesReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public IntegrationTaskAttributesReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof IntegrationTask) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Attribute && newEnd instanceof IntegrationTask)) {
			return false;
		}
		return PipelineBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistIntegrationTaskAttributes_4005(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Attribute && newEnd instanceof Attribute)) {
			return false;
		}
		return PipelineBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistIntegrationTaskAttributes_4005(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getAttributes().remove(getOldTarget());
		getNewSource().getAttributes().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getAttributes().remove(getOldTarget());
		getOldSource().getAttributes().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected IntegrationTask getOldSource() {
		return (IntegrationTask) referenceOwner;
	}

	/**
	* @generated
	*/
	protected IntegrationTask getNewSource() {
		return (IntegrationTask) newEnd;
	}

	/**
	* @generated
	*/
	protected Attribute getOldTarget() {
		return (Attribute) oldEnd;
	}

	/**
	* @generated
	*/
	protected Attribute getNewTarget() {
		return (Attribute) newEnd;
	}
}
