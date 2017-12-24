/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.ExportCreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class ExportingTaskExportingTaskExportsCompartmentItemSemanticEditPolicy
		extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ExportingTaskExportingTaskExportsCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.ExportingTask_2030);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.Export_3032 == req.getElementType()) {
			return getGEFWrapper(new ExportCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
