/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.ClassificationAnalysisOperationCreateCommand;
import pipeline.diagram.edit.commands.ClusteringAnalysisOperationCreateCommand;
import pipeline.diagram.edit.commands.DescriptiveAnalysisOperationCreateCommand;
import pipeline.diagram.edit.commands.PredictiveAnalysisOperationCreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentItemSemanticEditPolicy
		extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.AnalysisTask_2031);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.DescriptiveAnalysisOperation_3052 == req.getElementType()) {
			return getGEFWrapper(new DescriptiveAnalysisOperationCreateCommand(req));
		}
		if (PipelineElementTypes.ClassificationAnalysisOperation_3053 == req.getElementType()) {
			return getGEFWrapper(new ClassificationAnalysisOperationCreateCommand(req));
		}
		if (PipelineElementTypes.PredictiveAnalysisOperation_3054 == req.getElementType()) {
			return getGEFWrapper(new PredictiveAnalysisOperationCreateCommand(req));
		}
		if (PipelineElementTypes.ClusteringAnalysisOperation_3055 == req.getElementType()) {
			return getGEFWrapper(new ClusteringAnalysisOperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
