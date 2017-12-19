/*
 * 
 */
package ASE_Project.diagram.part;

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
public class ASE_ProjectCreationWizard extends Wizard implements INewWizard {

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
	protected ASE_Project.diagram.part.ASE_ProjectCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected ASE_Project.diagram.part.ASE_ProjectCreationWizardPage domainModelFilePage;

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
		setWindowTitle(ASE_Project.diagram.part.Messages.ASE_ProjectCreationWizardTitle);
		setDefaultPageImageDescriptor(ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewASE_ProjectWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new ASE_Project.diagram.part.ASE_ProjectCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "ase_project_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(ASE_Project.diagram.part.Messages.ASE_ProjectCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				ASE_Project.diagram.part.Messages.ASE_ProjectCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new ASE_Project.diagram.part.ASE_ProjectCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "ase_project") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".ase_project_diagram".length()); //$NON-NLS-1$
					setFileName(ASE_Project.diagram.part.ASE_ProjectDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "ase_project")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(ASE_Project.diagram.part.Messages.ASE_ProjectCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				ASE_Project.diagram.part.Messages.ASE_ProjectCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = ASE_Project.diagram.part.ASE_ProjectDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						ASE_Project.diagram.part.ASE_ProjectDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								ASE_Project.diagram.part.Messages.ASE_ProjectCreationWizardOpenEditorError, null,
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
						ASE_Project.diagram.part.Messages.ASE_ProjectCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
