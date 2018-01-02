/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.ChartCreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class VisualizationTaskVisualizationTaskChartsCompartmentItemSemanticEditPolicy
		extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public VisualizationTaskVisualizationTaskChartsCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.VisualizationTask_2029);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.Chart_3062 == req.getElementType()) {
			return getGEFWrapper(new ChartCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
