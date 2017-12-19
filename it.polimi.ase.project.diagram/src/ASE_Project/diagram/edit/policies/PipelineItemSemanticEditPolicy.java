/*
* 
*/
package ASE_Project.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class PipelineItemSemanticEditPolicy
		extends ASE_Project.diagram.edit.policies.ASE_ProjectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PipelineItemSemanticEditPolicy() {
		super(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Pipeline_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.CollectionTask_2001 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.CollectionTaskCreateCommand(req));
		}
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.IntegrationTask_2002 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.IntegrationTaskCreateCommand(req));
		}
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.CleaningTask_2003 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.CleaningTaskCreateCommand(req));
		}
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.AnalyzesTask_2004 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.AnalyzesTaskCreateCommand(req));
		}
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.VisualizationTask_2005 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.VisualizationTaskCreateCommand(req));
		}
		if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.ExportingTask_2006 == req.getElementType()) {
			return getGEFWrapper(new ASE_Project.diagram.edit.commands.ExportingTaskCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
