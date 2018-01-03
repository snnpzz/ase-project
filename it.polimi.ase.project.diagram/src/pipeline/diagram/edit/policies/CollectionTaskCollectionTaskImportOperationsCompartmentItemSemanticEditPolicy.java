/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.ImportOperationCreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class CollectionTaskCollectionTaskImportOperationsCompartmentItemSemanticEditPolicy
		extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CollectionTaskCollectionTaskImportOperationsCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.CollectionTask_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.ImportOperation_3013 == req.getElementType()) {
			return getGEFWrapper(new ImportOperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
