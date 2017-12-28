/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.Attribute2CreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class AttributeAttributeAttributesCompartmentItemSemanticEditPolicy extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AttributeAttributeAttributesCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.Attribute_3038);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.Attribute_3039 == req.getElementType()) {
			return getGEFWrapper(new Attribute2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
