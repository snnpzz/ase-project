/*
* 
*/
package ASE_Project.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CollectionTaskCollectionTaskImportsCompartmentItemSemanticEditPolicy
		extends ASE_Project.diagram.edit.policies.ASE_ProjectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CollectionTaskCollectionTaskImportsCompartmentItemSemanticEditPolicy() {
		super(ASE_Project.diagram.providers.ASE_ProjectElementTypes.CollectionTask_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.Import_3001 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.ImportCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
