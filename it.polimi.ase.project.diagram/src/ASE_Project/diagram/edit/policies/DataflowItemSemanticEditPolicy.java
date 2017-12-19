/*
* 
*/
package ASE_Project.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class DataflowItemSemanticEditPolicy
		extends ASE_Project.diagram.edit.policies.ASE_ProjectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataflowItemSemanticEditPolicy() {
		super(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
