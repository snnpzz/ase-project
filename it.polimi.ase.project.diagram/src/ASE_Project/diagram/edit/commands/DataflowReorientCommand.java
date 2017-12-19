/*
 * 
 */
package ASE_Project.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class DataflowReorientCommand extends EditElementCommand {

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
	public DataflowReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ASE_Project.Dataflow) {
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
		if (!(oldEnd instanceof ASE_Project.Task && newEnd instanceof ASE_Project.Task)) {
			return false;
		}
		ASE_Project.Task target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ASE_Project.Pipeline)) {
			return false;
		}
		ASE_Project.Pipeline container = (ASE_Project.Pipeline) getLink().eContainer();
		return ASE_Project.diagram.edit.policies.ASE_ProjectBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistDataflow_4001(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ASE_Project.Task && newEnd instanceof ASE_Project.Task)) {
			return false;
		}
		ASE_Project.Task source = getLink().getSource();
		if (!(getLink().eContainer() instanceof ASE_Project.Pipeline)) {
			return false;
		}
		ASE_Project.Pipeline container = (ASE_Project.Pipeline) getLink().eContainer();
		return ASE_Project.diagram.edit.policies.ASE_ProjectBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistDataflow_4001(container, getLink(), source, getNewTarget());
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
	protected ASE_Project.Dataflow getLink() {
		return (ASE_Project.Dataflow) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected ASE_Project.Task getOldSource() {
		return (ASE_Project.Task) oldEnd;
	}

	/**
	* @generated
	*/
	protected ASE_Project.Task getNewSource() {
		return (ASE_Project.Task) newEnd;
	}

	/**
	* @generated
	*/
	protected ASE_Project.Task getOldTarget() {
		return (ASE_Project.Task) oldEnd;
	}

	/**
	* @generated
	*/
	protected ASE_Project.Task getNewTarget() {
		return (ASE_Project.Task) newEnd;
	}
}
