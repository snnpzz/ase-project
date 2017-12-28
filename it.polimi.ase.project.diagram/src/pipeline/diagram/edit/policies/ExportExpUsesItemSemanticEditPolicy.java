/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class ExportExpUsesItemSemanticEditPolicy extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ExportExpUsesItemSemanticEditPolicy() {
		super(PipelineElementTypes.ExportExpUses_4014);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
