/*
* 
*/
package ASEProject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AnalyzesTaskAnalyzesTaskAnalyzesCompartmentItemSemanticEditPolicy
		extends ASEProject.diagram.edit.policies.ASEProjectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AnalyzesTaskAnalyzesTaskAnalyzesCompartmentItemSemanticEditPolicy() {
		super(ASEProject.diagram.providers.ASEProjectElementTypes.AnalyzesTask_2010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASEProject.diagram.providers.ASEProjectElementTypes.Descriptive_3012 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.DescriptiveCreateCommand(req));
		}
		if (ASEProject.diagram.providers.ASEProjectElementTypes.Classification_3013 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.ClassificationCreateCommand(req));
		}
		if (ASEProject.diagram.providers.ASEProjectElementTypes.Predictive_3014 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.PredictiveCreateCommand(req));
		}
		if (ASEProject.diagram.providers.ASEProjectElementTypes.Clustering_3015 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.ClusteringCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
