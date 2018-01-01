/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.ComplexAttributeCreateCommand;
import pipeline.diagram.edit.commands.SimpleAttributeCreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class SchemaSchemaAttributesCompartmentItemSemanticEditPolicy extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SchemaSchemaAttributesCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.Schema_2043);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.SimpleAttribute_3046 == req.getElementType()) {
			return getGEFWrapper(new SimpleAttributeCreateCommand(req));
		}
		if (PipelineElementTypes.ComplexAttribute_3047 == req.getElementType()) {
			return getGEFWrapper(new ComplexAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
