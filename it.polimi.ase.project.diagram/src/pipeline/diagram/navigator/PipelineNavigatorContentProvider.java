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

import pipeline.diagram.edit.parts.AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.AnalysisTaskEditPart;
import pipeline.diagram.edit.parts.Attribute2EditPart;
import pipeline.diagram.edit.parts.AttributeAttributeAttributesCompartment2EditPart;
import pipeline.diagram.edit.parts.AttributeAttributeAttributesCompartmentEditPart;
import pipeline.diagram.edit.parts.AttributeEditPart;
import pipeline.diagram.edit.parts.Classification2EditPart;
import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.Clustering2EditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.DataFlowEditPart;
import pipeline.diagram.edit.parts.DataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.Descriptive2EditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.ExportEditPart;
import pipeline.diagram.edit.parts.ExportExpUsesEditPart;
import pipeline.diagram.edit.parts.ExportGeneratesEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.ExportTaskExportTaskExportsCompartmentEditPart;
import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.ImportImpUsesEditPart;
import pipeline.diagram.edit.parts.ImportReadsFromEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowIntDFschemaEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
import pipeline.diagram.edit.parts.Predefined2EditPart;
import pipeline.diagram.edit.parts.PredefinedEditPart;
import pipeline.diagram.edit.parts.Predictive2EditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.SchemaEditPart;
import pipeline.diagram.edit.parts.SchemaSchemaAttributesCompartmentEditPart;
import pipeline.diagram.edit.parts.SourceEditPart;
import pipeline.diagram.edit.parts.UserDefined2EditPart;
import pipeline.diagram.edit.parts.UserDefinedEditPart;
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
					PipelineVisualIDRegistry.getType(UserDefinedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DescriptiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ClassificationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(PredictiveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ClusteringEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(PredefinedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
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
					PipelineVisualIDRegistry.getType(InternalDataFlowIntDFschemaEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportReadsFromEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportImpUsesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportGeneratesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportExpUsesEditPart.VISUAL_ID));
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
					Messages.NavigatorGroupName_CollectionTask_2025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_CollectionTask_2025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(ImportEditPart.VISUAL_ID));
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
					Messages.NavigatorGroupName_IntegrationTask_2026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_IntegrationTask_2026_outgoinglinks,
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

		case CleaningTaskEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_CleaningTask_2027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_CleaningTask_2027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineVisualIDRegistry
					.getType(CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(UserDefined2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineVisualIDRegistry
					.getType(CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(Predefined2EditPart.VISUAL_ID));
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

		case VisualizationTaskEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_VisualizationTask_2029_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_VisualizationTask_2029_outgoinglinks,
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
					Messages.NavigatorGroupName_AnalysisTask_2031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_AnalysisTask_2031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineVisualIDRegistry
					.getType(AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(Descriptive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineVisualIDRegistry
					.getType(AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(Classification2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineVisualIDRegistry
					.getType(AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(Predictive2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), PipelineVisualIDRegistry
					.getType(AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(Clustering2EditPart.VISUAL_ID));
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

		case ExportTaskEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportTask_2032_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportTask_2032_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportTaskExportTaskExportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
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

		case UserDefinedEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_UserDefined_2033_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_UserDefined_2033_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DescriptiveEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Descriptive_2034_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Descriptive_2034_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ClassificationEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Classification_2035_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Classification_2035_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PredictiveEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Predictive_2036_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Predictive_2036_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ClusteringEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Clustering_2037_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Clustering_2037_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PredefinedEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Predefined_2038_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Predefined_2038_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SchemaEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Schema_2043_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DataFlowSchemaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowIntDFschemaEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportImpUsesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportExpUsesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SourceEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Source_2044_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportReadsFromEditPart.VISUAL_ID));
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
					Messages.NavigatorGroupName_File_2045_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportGeneratesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ImportEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Import_3025_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportReadsFromEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportImpUsesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExportEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Export_3037_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportGeneratesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportExpUsesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AttributeEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(AttributeAttributeAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(Attribute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Attribute2EditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(AttributeAttributeAttributesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PipelineVisualIDRegistry.getType(Attribute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case UserDefined2EditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_UserDefined_3040_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_UserDefined_3040_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Predefined2EditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Predefined_3041_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Predefined_3041_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Descriptive2EditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Descriptive_3042_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Descriptive_3042_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Classification2EditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Classification_3043_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Classification_3043_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Predictive2EditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Predictive_3044_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Predictive_3044_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Clustering2EditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Node sv = (Node) view;
			PipelineNavigatorGroup incominglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Clustering_3045_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_Clustering_3045_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(InternalDataFlowEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DataFlowEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(Messages.NavigatorGroupName_DataFlow_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(Messages.NavigatorGroupName_DataFlow_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_DataFlow_4005_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
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
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_InternalDataFlow_4006_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_InternalDataFlow_4006_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup outgoinglinks = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_InternalDataFlow_4006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(UserDefinedEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DescriptiveEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ClassificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(PredictiveEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ClusteringEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(PredefinedEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(UserDefined2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(Predefined2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(Descriptive2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(Classification2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(Predictive2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(Clustering2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(UserDefinedEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(DescriptiveEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ClassificationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(PredictiveEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ClusteringEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(PredefinedEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(UserDefined2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(Predefined2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(Descriptive2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(Classification2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(Predictive2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(Clustering2EditPart.VISUAL_ID));
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

		case ImportReadsFromEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ImportReadsFrom_4007_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ImportReadsFrom_4007_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExportGeneratesEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportGenerates_4008_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportGenerates_4008_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(FileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ImportImpUsesEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ImportImpUses_4013_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ImportImpUses_4013_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ImportEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExportExpUsesEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportExpUses_4014_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_ExportExpUses_4014_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(SchemaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PipelineVisualIDRegistry.getType(ExportEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InternalDataFlowIntDFschemaEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_InternalDataFlowIntDFschema_4018_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_InternalDataFlowIntDFschema_4018_source,
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

		case DataFlowSchemaEditPart.VISUAL_ID: {
			LinkedList<PipelineAbstractNavigatorItem> result = new LinkedList<PipelineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PipelineNavigatorGroup target = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_DataFlowSchema_4019_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PipelineNavigatorGroup source = new PipelineNavigatorGroup(
					Messages.NavigatorGroupName_DataFlowSchema_4019_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
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
