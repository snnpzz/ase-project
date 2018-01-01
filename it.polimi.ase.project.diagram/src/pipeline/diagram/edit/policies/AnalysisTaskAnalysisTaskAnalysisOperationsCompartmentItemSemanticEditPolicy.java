/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.Classification2CreateCommand;
import pipeline.diagram.edit.commands.ClassificationCreateCommand;
import pipeline.diagram.edit.commands.Clustering2CreateCommand;
import pipeline.diagram.edit.commands.ClusteringCreateCommand;
import pipeline.diagram.edit.commands.Descriptive2CreateCommand;
import pipeline.diagram.edit.commands.DescriptiveCreateCommand;
import pipeline.diagram.edit.commands.Predictive2CreateCommand;
import pipeline.diagram.edit.commands.PredictiveCreateCommand;
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
		if (PipelineElementTypes.Descriptive_3042 == req.getElementType()) {
			return getGEFWrapper(new DescriptiveCreateCommand(req));
		}
		if (PipelineElementTypes.Classification_3043 == req.getElementType()) {
			return getGEFWrapper(new ClassificationCreateCommand(req));
		}
		if (PipelineElementTypes.Predictive_3044 == req.getElementType()) {
			return getGEFWrapper(new PredictiveCreateCommand(req));
		}
		if (PipelineElementTypes.Clustering_3045 == req.getElementType()) {
			return getGEFWrapper(new ClusteringCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
