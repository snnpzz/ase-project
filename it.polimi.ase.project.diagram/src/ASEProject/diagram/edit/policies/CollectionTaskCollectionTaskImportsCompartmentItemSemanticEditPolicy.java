/*
* 
*/
package ASEProject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CollectionTaskCollectionTaskImportsCompartmentItemSemanticEditPolicy
		extends ASEProject.diagram.edit.policies.ASEProjectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CollectionTaskCollectionTaskImportsCompartmentItemSemanticEditPolicy() {
		super(ASEProject.diagram.providers.ASEProjectElementTypes.CollectionTask_2007);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASEProject.diagram.providers.ASEProjectElementTypes.Import_3009 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.ImportCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
