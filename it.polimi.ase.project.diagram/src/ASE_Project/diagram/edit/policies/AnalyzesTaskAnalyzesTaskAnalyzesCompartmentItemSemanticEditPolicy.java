/*
* 
*/
package ASE_Project.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AnalyzesTaskAnalyzesTaskAnalyzesCompartmentItemSemanticEditPolicy
		extends ASE_Project.diagram.edit.policies.ASE_ProjectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AnalyzesTaskAnalyzesTaskAnalyzesCompartmentItemSemanticEditPolicy() {
		super(ASE_Project.diagram.providers.ASE_ProjectElementTypes.AnalyzesTask_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.Descriptive_3004 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.DescriptiveCreateCommand(req));
		}
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.Classification_3005 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.ClassificationCreateCommand(req));
		}
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.Predictive_3006 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.PredictiveCreateCommand(req));
		}
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.Clustering_3007 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.ClusteringCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
