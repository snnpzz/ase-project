/*
* 
*/
package ASE_Project.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ExportingTaskExportingTaskExportsCompartmentItemSemanticEditPolicy
		extends ASE_Project.diagram.edit.policies.ASE_ProjectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ExportingTaskExportingTaskExportsCompartmentItemSemanticEditPolicy() {
		super(ASE_Project.diagram.providers.ASE_ProjectElementTypes.ExportingTask_2006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.Export_3008 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.ExportCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
