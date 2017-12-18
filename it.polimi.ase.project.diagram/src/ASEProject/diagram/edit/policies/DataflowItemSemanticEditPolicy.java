/*
* 
*/
package ASEProject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class DataflowItemSemanticEditPolicy
		extends ASEProject.diagram.edit.policies.ASEProjectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataflowItemSemanticEditPolicy() {
		super(ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
