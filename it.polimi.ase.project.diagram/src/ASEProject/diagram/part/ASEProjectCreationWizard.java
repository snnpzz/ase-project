/*
 * 
 */
package ASEProject.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class ASEProjectCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected ASEProject.diagram.part.ASEProjectCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected ASEProject.diagram.part.ASEProjectCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(ASEProject.diagram.part.Messages.ASEProjectCreationWizardTitle);
		setDefaultPageImageDescriptor(ASEProject.diagram.part.ASEProjectDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewASEProjectWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new ASEProject.diagram.part.ASEProjectCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "aseproject_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(ASEProject.diagram.part.Messages.ASEProjectCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				ASEProject.diagram.part.Messages.ASEProjectCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new ASEProject.diagram.part.ASEProjectCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "aseproject") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".aseproject_diagram".length()); //$NON-NLS-1$
					setFileName(ASEProject.diagram.part.ASEProjectDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "aseproject")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(ASEProject.diagram.part.Messages.ASEProjectCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				ASEProject.diagram.part.Messages.ASEProjectCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = ASEProject.diagram.part.ASEProjectDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						ASEProject.diagram.part.ASEProjectDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								ASEProject.diagram.part.Messages.ASEProjectCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						ASEProject.diagram.part.Messages.ASEProjectCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
