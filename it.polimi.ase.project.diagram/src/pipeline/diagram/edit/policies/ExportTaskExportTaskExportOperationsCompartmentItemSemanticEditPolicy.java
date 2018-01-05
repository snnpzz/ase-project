/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.ExportOperationCreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class ExportTaskExportTaskExportOperationsCompartmentItemSemanticEditPolicy
		extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ExportTaskExportTaskExportOperationsCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.ExportTask_2006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.ExportOperation_3002 == req.getElementType()) {
			return getGEFWrapper(new ExportOperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
