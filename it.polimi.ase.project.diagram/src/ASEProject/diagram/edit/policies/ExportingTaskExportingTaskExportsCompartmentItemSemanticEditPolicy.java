/*
* 
*/
package ASEProject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ExportingTaskExportingTaskExportsCompartmentItemSemanticEditPolicy
		extends ASEProject.diagram.edit.policies.ASEProjectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ExportingTaskExportingTaskExportsCompartmentItemSemanticEditPolicy() {
		super(ASEProject.diagram.providers.ASEProjectElementTypes.ExportingTask_2012);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASEProject.diagram.providers.ASEProjectElementTypes.Export_3016 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.ExportCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
