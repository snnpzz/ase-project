/*
* 
*/
package ASEProject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CleaningTaskCleaningTaskOperationsCompartmentItemSemanticEditPolicy
		extends ASEProject.diagram.edit.policies.ASEProjectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CleaningTaskCleaningTaskOperationsCompartmentItemSemanticEditPolicy() {
		super(ASEProject.diagram.providers.ASEProjectElementTypes.CleaningTask_2009);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASEProject.diagram.providers.ASEProjectElementTypes.UserDefined_3010 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.UserDefinedCreateCommand(req));
		}
		if (ASEProject.diagram.providers.ASEProjectElementTypes.Predefined_3011 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.PredefinedCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
