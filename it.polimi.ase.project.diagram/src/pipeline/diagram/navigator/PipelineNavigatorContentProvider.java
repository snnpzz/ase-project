/*
* 
*/
package pipeline.diagram.navigator;

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

import pipeline.diagram.edit.parts.AnalysisTaskEditPart;
import pipeline.diagram.edit.parts.ChartAxesEditPart;
import pipeline.diagram.edit.parts.ChartEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.CollectionTaskCollectionTaskImportOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.ComplexAttribute2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeComplexAttributeAttributesCompartment2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeComplexAttributeAttributesCompartmentEditPart;
import pipeline.diagram.edit.parts.ComplexAttributeEditPart;
import pipeline.diagram.edit.parts.DataFlowEditPart;
import pipeline.diagram.edit.parts.DataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.ExportOperationEditPart;
import pipeline.diagram.edit.parts.ExportOperationUseEditPart;
import pipeline.diagram.edit.parts.ExportOperationWriteEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.ExportTaskExportTaskExportOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.edit.parts.ImportOperationEditPart;
import pipeline.diagram.edit.parts.ImportOperationReadEditPart;
import pipeline.diagram.edit.parts.ImportOperationUseEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskAttributesEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
import pipeline.diagram.edit.parts.SchemaEditPart;
import pipeline.diagram.edit.parts.SchemaSchemaAttributesCompartmentEditPart;
import pipeline.diagram.edit.parts.SimpleAttribute2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeEditPart;
import pipeline.diagram.edit.parts.SourceEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskEditPart;
import pipeline.diagram.part.Messages;
import pipeline.diagram.part.PipelineVisualIDRegistry;

/**
 * @generated
 */
public class PipelineNavigatorContentProvider implements ICommonContentProvider {

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
	public PipelineNavigatorContentProvider() {
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
			ArrayList<PipelineNavigatorItem> result = new ArrayList<PipelineNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, PipelineEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof PipelineNavigatorGroup) {
			PipelineNavigatorGroup group = (PipelineNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof PipelineNavigatorItem) {
			PipelineNavigatorItem navigatorItem = (PipelineNavigatorItem) parentElement;
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
		switch (PipelineVisualIDRegistry.getVisualID(view)) {

		case PipelineEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			PipelineNavigatorGroup links = new PipelineNavigatorGroup(Messages.NavigatorGroupName_Pipeline_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(CollectionTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(IntegrationTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(CleaningTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(AnalysisTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(VisualizationTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(FileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ChartEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowSchemaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowSchemaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(IntegrationTaskAttributesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportOperationReadEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportOperationUseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportOperationUseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportOperationWriteEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ChartAxesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case CollectionTaskEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_CollectionTask_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_CollectionTask_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineVisualIDRegistry
					.getType(CollectionTaskCollectionTaskImportOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(ImportOperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IntegrationTaskEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_IntegrationTask_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_IntegrationTask_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(IntegrationTaskAttributesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CleaningTaskEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_CleaningTask_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_CleaningTask_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AnalysisTaskEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_AnalysisTask_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_AnalysisTask_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case VisualizationTaskEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_VisualizationTask_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_VisualizationTask_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExportTaskEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportTask_2006_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportTask_2006_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineVisualIDRegistry
					.getType(ExportTaskExportTaskExportOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(ExportOperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SourceEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Source_2007_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportOperationReadEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case FileEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_File_2008_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportOperationWriteEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SchemaEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Schema_2009_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(SimpleAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(ComplexAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowSchemaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowSchemaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportOperationUseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportOperationUseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ChartEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Chart_2010_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ChartAxesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ImportOperationEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ImportOperation_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportOperationReadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportOperationUseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExportOperationEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportOperation_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportOperationUseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportOperationWriteEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SimpleAttributeEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_SimpleAttribute_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(IntegrationTaskAttributesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ChartAxesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ComplexAttributeEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ComplexAttribute_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineVisualIDRegistry
					.getType(ComplexAttributeComplexAttributeAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(SimpleAttribute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineVisualIDRegistry
					.getType(ComplexAttributeComplexAttributeAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(ComplexAttribute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(IntegrationTaskAttributesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SimpleAttribute2EditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_SimpleAttribute_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(IntegrationTaskAttributesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ChartAxesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ComplexAttribute2EditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ComplexAttribute_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineVisualIDRegistry
					.getType(ComplexAttributeComplexAttributeAttributesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(SimpleAttribute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineVisualIDRegistry
					.getType(ComplexAttributeComplexAttributeAttributesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(ComplexAttribute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(IntegrationTaskAttributesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DataFlowEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(Messages.NavigatorGroupName_DataFlow_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(Messages.NavigatorGroupName_DataFlow_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_DataFlow_4001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(CollectionTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(IntegrationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(CleaningTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(AnalysisTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(VisualizationTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(CollectionTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(IntegrationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(CleaningTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(AnalysisTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(VisualizationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InternalDataFlowEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_InternalDataFlow_4002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataFlowSchemaEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_DataFlowSchema_4003_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_DataFlowSchema_4003_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InternalDataFlowSchemaEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_InternalDataFlowSchema_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_InternalDataFlowSchema_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case IntegrationTaskAttributesEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_IntegrationTaskAttributes_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_IntegrationTaskAttributes_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SimpleAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ComplexAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SimpleAttribute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ComplexAttribute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(IntegrationTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ImportOperationReadEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ImportOperationRead_4006_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ImportOperationRead_4006_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportOperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ImportOperationUseEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ImportOperationUse_4007_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ImportOperationUse_4007_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportOperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExportOperationUseEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportOperationUse_4008_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportOperationUse_4008_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportOperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExportOperationWriteEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportOperationWrite_4009_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportOperationWrite_4009_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(FileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportOperationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ChartAxesEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ChartAxes_4010_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ChartAxes_4010_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SimpleAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SimpleAttribute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ChartEditPart.VISUAL_ID));
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
		return PipelineEditPart.MODEL_ID.equals(PipelineVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<PipelineNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<PipelineNavigatorItem> result = new ArrayList<PipelineNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new PipelineNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<PipelineNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
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
		if (element instanceof PipelineAbstractNavigatorItem) {
			PipelineAbstractNavigatorItem abstractNavigatorItem = (PipelineAbstractNavigatorItem) element;
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
