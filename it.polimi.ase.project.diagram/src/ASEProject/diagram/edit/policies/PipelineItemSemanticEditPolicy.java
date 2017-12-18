/*
* 
*/
package ASEProject.diagram.edit.policies;

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
		extends ASEProject.diagram.edit.policies.ASEProjectBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PipelineItemSemanticEditPolicy() {
		super(ASEProject.diagram.providers.ASEProjectElementTypes.Pipeline_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASEProject.diagram.providers.ASEProjectElementTypes.CollectionTask_2007 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.CollectionTaskCreateCommand(req));
		}
		if (ASEProject.diagram.providers.ASEProjectElementTypes.IntegrationTask_2008 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.IntegrationTaskCreateCommand(req));
		}
		if (ASEProject.diagram.providers.ASEProjectElementTypes.CleaningTask_2009 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.CleaningTaskCreateCommand(req));
		}
		if (ASEProject.diagram.providers.ASEProjectElementTypes.AnalyzesTask_2010 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.AnalyzesTaskCreateCommand(req));
		}
		if (ASEProject.diagram.providers.ASEProjectElementTypes.VisualizationTask_2011 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.VisualizationTaskCreateCommand(req));
		}
		if (ASEProject.diagram.providers.ASEProjectElementTypes.ExportingTask_2012 == req.getElementType()) {
			return getGEFWrapper(new ASEProject.diagram.edit.commands.ExportingTaskCreateCommand(req));
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
