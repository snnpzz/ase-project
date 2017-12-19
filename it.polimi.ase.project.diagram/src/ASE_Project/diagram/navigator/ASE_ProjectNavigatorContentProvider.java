/*
* 
*/
package ASE_Project.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class ASE_ProjectNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ASE_ProjectNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem> result = new ArrayList<ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, ASE_Project.diagram.edit.parts.PipelineEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup) {
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup group = (ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem) {
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem navigatorItem = (ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(view)) {

		case ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID: {
			LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem> result = new LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup links = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_Pipeline_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID: {
			LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem> result = new LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup incominglinks = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_CollectionTask_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup outgoinglinks = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_CollectionTask_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getType(
							ASE_Project.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
					.getType(ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID: {
			LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem> result = new LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup incominglinks = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_IntegrationTask_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup outgoinglinks = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_IntegrationTask_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID: {
			LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem> result = new LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup incominglinks = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_CleaningTask_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup outgoinglinks = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_CleaningTask_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getType(
							ASE_Project.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
					.getType(ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getType(
							ASE_Project.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
					.getType(ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID: {
			LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem> result = new LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup incominglinks = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_AnalyzesTask_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup outgoinglinks = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_AnalyzesTask_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getType(
							ASE_Project.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
					.getType(ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getType(
							ASE_Project.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
					.getType(ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getType(
							ASE_Project.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
					.getType(ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getType(
							ASE_Project.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
					.getType(ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID: {
			LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem> result = new LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup incominglinks = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_VisualizationTask_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup outgoinglinks = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_VisualizationTask_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID: {
			LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem> result = new LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup incominglinks = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_ExportingTask_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup outgoinglinks = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_ExportingTask_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getType(
							ASE_Project.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
					.getType(ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID: {
			LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem> result = new LinkedList<ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup target = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_Dataflow_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup source = new ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup(
					ASE_Project.diagram.part.Messages.NavigatorGroupName_Dataflow_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
							.getType(ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ASE_Project.diagram.edit.parts.PipelineEditPart.MODEL_ID
				.equals(ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem> result = new ArrayList<ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem) {
			ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem abstractNavigatorItem = (ASE_Project.diagram.navigator.ASE_ProjectAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
