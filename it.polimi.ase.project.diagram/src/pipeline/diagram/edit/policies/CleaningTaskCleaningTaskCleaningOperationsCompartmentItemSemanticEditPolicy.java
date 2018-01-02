/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.PredefinedCreateCommand;
import pipeline.diagram.edit.commands.UserDefinedCreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class CleaningTaskCleaningTaskCleaningOperationsCompartmentItemSemanticEditPolicy
		extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CleaningTaskCleaningTaskCleaningOperationsCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.CleaningTask_2027);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.UserDefined_3056 == req.getElementType()) {
			return getGEFWrapper(new UserDefinedCreateCommand(req));
		}
		if (PipelineElementTypes.Predefined_3057 == req.getElementType()) {
			return getGEFWrapper(new PredefinedCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
