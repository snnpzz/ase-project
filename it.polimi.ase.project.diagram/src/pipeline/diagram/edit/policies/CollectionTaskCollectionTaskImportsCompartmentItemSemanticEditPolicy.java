/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.ImportCreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class CollectionTaskCollectionTaskImportsCompartmentItemSemanticEditPolicy
		extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CollectionTaskCollectionTaskImportsCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.CollectionTask_2025);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.Import_3025 == req.getElementType()) {
			return getGEFWrapper(new ImportCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
