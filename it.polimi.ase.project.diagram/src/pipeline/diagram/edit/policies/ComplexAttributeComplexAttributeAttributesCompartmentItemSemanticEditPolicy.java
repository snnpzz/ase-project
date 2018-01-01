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
public class ComplexAttributeComplexAttributeAttributesCompartmentItemSemanticEditPolicy
		extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ComplexAttributeComplexAttributeAttributesCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.ComplexAttribute_3047);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.SimpleAttribute_3048 == req.getElementType()) {
			return getGEFWrapper(new SimpleAttribute2CreateCommand(req));
		}
		if (PipelineElementTypes.ComplexAttribute_3049 == req.getElementType()) {
			return getGEFWrapper(new ComplexAttribute2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
