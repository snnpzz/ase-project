/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.ComplexAttribute2CreateCommand;
import pipeline.diagram.edit.commands.SimpleAttribute2CreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class ComplexAttributeComplexAttributeAttributesCompartment2ItemSemanticEditPolicy
		extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ComplexAttributeComplexAttributeAttributesCompartment2ItemSemanticEditPolicy() {
		super(PipelineElementTypes.ComplexAttribute_3006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.SimpleAttribute_3005 == req.getElementType()) {
			return getGEFWrapper(new SimpleAttribute2CreateCommand(req));
		}
		if (PipelineElementTypes.ComplexAttribute_3006 == req.getElementType()) {
			return getGEFWrapper(new ComplexAttribute2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
