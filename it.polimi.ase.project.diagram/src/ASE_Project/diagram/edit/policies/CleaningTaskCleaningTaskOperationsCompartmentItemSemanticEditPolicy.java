/*
* 
*/
package ASE_Project.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CleaningTaskCleaningTaskOperationsCompartmentItemSemanticEditPolicy
		extends ASE_Project.diagram.edit.policies.ASE_ProjectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CleaningTaskCleaningTaskOperationsCompartmentItemSemanticEditPolicy() {
		super(ASE_Project.diagram.providers.ASE_ProjectElementTypes.CleaningTask_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.UserDefined_3002 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.UserDefinedCreateCommand(req));
		}
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.Predefined_3003 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.PredefinedCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
