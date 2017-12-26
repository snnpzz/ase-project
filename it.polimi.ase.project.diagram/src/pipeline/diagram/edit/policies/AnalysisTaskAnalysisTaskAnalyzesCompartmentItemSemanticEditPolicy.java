/*
* 
*/
package pipeline.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pipeline.diagram.edit.commands.ClassificationCreateCommand;
import pipeline.diagram.edit.commands.ClusteringCreateCommand;
import pipeline.diagram.edit.commands.DescriptiveCreateCommand;
import pipeline.diagram.edit.commands.PredictiveCreateCommand;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class AnalysisTaskAnalysisTaskAnalyzesCompartmentItemSemanticEditPolicy
		extends PipelineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AnalysisTaskAnalysisTaskAnalyzesCompartmentItemSemanticEditPolicy() {
		super(PipelineElementTypes.AnalysisTask_2031);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PipelineElementTypes.Descriptive_3033 == req.getElementType()) {
			return getGEFWrapper(new DescriptiveCreateCommand(req));
		}
		if (PipelineElementTypes.Classification_3034 == req.getElementType()) {
			return getGEFWrapper(new ClassificationCreateCommand(req));
		}
		if (PipelineElementTypes.Predictive_3035 == req.getElementType()) {
			return getGEFWrapper(new PredictiveCreateCommand(req));
		}
		if (PipelineElementTypes.Clustering_3036 == req.getElementType()) {
			return getGEFWrapper(new ClusteringCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
