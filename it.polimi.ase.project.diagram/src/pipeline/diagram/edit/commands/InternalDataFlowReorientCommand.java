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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import pipeline.InternalDataFlow;
import pipeline.Operation;
import pipeline.Pipeline;
import pipeline.diagram.edit.policies.PipelineBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class InternalDataFlowReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

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
	public InternalDataFlowReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof InternalDataFlow) {
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
		if (!(oldEnd instanceof Operation && newEnd instanceof Operation)) {
			return false;
		}
		Operation target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Pipeline)) {
			return false;
		}
		Pipeline container = (Pipeline) getLink().eContainer();
		return PipelineBaseItemSemanticEditPolicy.getLinkConstraints().canExistInternalDataFlow_4002(container,
				getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Operation && newEnd instanceof Operation)) {
			return false;
		}
		Operation source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Pipeline)) {
			return false;
		}
		Pipeline container = (Pipeline) getLink().eContainer();
		return PipelineBaseItemSemanticEditPolicy.getLinkConstraints().canExistInternalDataFlow_4002(container,
				getLink(), source, getNewTarget());
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected InternalDataFlow getLink() {
		return (InternalDataFlow) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Operation getOldSource() {
		return (Operation) oldEnd;
	}

	/**
	* @generated
	*/
	protected Operation getNewSource() {
		return (Operation) newEnd;
	}

	/**
	* @generated
	*/
	protected Operation getOldTarget() {
		return (Operation) oldEnd;
	}

	/**
	* @generated
	*/
	protected Operation getNewTarget() {
		return (Operation) newEnd;
	}
}
