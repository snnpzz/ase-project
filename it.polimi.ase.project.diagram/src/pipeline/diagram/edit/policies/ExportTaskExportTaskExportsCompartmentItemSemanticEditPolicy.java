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
public class ExportTaskExportTaskExportsCompartmentItemSemanticEditPolicy extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ExportTaskExportTaskExportsCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.ExportTask_2032);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.Export_3037 == req.getElementType()) {
			return getGEFWrapper(new ExportCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
