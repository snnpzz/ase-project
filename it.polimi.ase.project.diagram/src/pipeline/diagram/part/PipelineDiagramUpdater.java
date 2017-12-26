/*
* 
*/
package pipeline.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import pipeline.AnalysisOp;
import pipeline.AnalysisTask;
import pipeline.CleaningOperation;
import pipeline.CleaningTask;
import pipeline.CollectionTask;
import pipeline.Dataflow;
import pipeline.Export;
import pipeline.ExportTask;
import pipeline.Import;
import pipeline.IntegrationTask;
import pipeline.Pipeline;
import pipeline.PipelinePackage;
import pipeline.Task;
import pipeline.VisualizationTask;
import pipeline.diagram.edit.parts.AnalysisTaskAnalysisTaskAnalyzesCompartmentEditPart;
import pipeline.diagram.edit.parts.AnalysisTaskEditPart;
import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.DataflowEditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.ExportEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.ExportTaskExportTaskExportsCompartmentEditPart;
import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
import pipeline.diagram.edit.parts.PredefinedEditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.UserDefinedEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskEditPart;
import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class PipelineDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<PipelineNodeDescriptor> getSemanticChildren(View view) {
		switch (PipelineVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID:
			return getPipeline_1000SemanticChildren(view);
		case CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
			return getCollectionTaskCollectionTaskImportsCompartment_7017SemanticChildren(view);
		case CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
			return getCleaningTaskCleaningTaskOperationsCompartment_7018SemanticChildren(view);
		case AnalysisTaskAnalysisTaskAnalyzesCompartmentEditPart.VISUAL_ID:
			return getAnalysisTaskAnalysisTaskAnalyzesCompartment_7021SemanticChildren(view);
		case ExportTaskExportTaskExportsCompartmentEditPart.VISUAL_ID:
			return getExportTaskExportTaskExportsCompartment_7022SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PipelineNodeDescriptor> getPipeline_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Pipeline modelElement = (Pipeline) view.getElement();
		LinkedList<PipelineNodeDescriptor> result = new LinkedList<PipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTasks().iterator(); it.hasNext();) {
			Task childElement = (Task) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CollectionTaskEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IntegrationTaskEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CleaningTaskEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AnalysisTaskEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == VisualizationTaskEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExportTaskEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineNodeDescriptor> getCollectionTaskCollectionTaskImportsCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CollectionTask modelElement = (CollectionTask) containerView.getElement();
		LinkedList<PipelineNodeDescriptor> result = new LinkedList<PipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getImports().iterator(); it.hasNext();) {
			Import childElement = (Import) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ImportEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineNodeDescriptor> getCleaningTaskCleaningTaskOperationsCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CleaningTask modelElement = (CleaningTask) containerView.getElement();
		LinkedList<PipelineNodeDescriptor> result = new LinkedList<PipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			CleaningOperation childElement = (CleaningOperation) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UserDefinedEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PredefinedEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineNodeDescriptor> getAnalysisTaskAnalysisTaskAnalyzesCompartment_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AnalysisTask modelElement = (AnalysisTask) containerView.getElement();
		LinkedList<PipelineNodeDescriptor> result = new LinkedList<PipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnalyzes().iterator(); it.hasNext();) {
			AnalysisOp childElement = (AnalysisOp) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DescriptiveEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassificationEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PredictiveEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClusteringEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineNodeDescriptor> getExportTaskExportTaskExportsCompartment_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ExportTask modelElement = (ExportTask) containerView.getElement();
		LinkedList<PipelineNodeDescriptor> result = new LinkedList<PipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExports().iterator(); it.hasNext();) {
			Export childElement = (Export) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExportEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineLinkDescriptor> getContainedLinks(View view) {
		switch (PipelineVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID:
			return getPipeline_1000ContainedLinks(view);
		case CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2025ContainedLinks(view);
		case IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2026ContainedLinks(view);
		case CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2027ContainedLinks(view);
		case AnalysisTaskEditPart.VISUAL_ID:
			return getAnalysisTask_2031ContainedLinks(view);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2029ContainedLinks(view);
		case ExportTaskEditPart.VISUAL_ID:
			return getExportTask_2032ContainedLinks(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_3025ContainedLinks(view);
		case UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3026ContainedLinks(view);
		case PredefinedEditPart.VISUAL_ID:
			return getPredefined_3027ContainedLinks(view);
		case DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3033ContainedLinks(view);
		case ClassificationEditPart.VISUAL_ID:
			return getClassification_3034ContainedLinks(view);
		case PredictiveEditPart.VISUAL_ID:
			return getPredictive_3035ContainedLinks(view);
		case ClusteringEditPart.VISUAL_ID:
			return getClustering_3036ContainedLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_3037ContainedLinks(view);
		case DataflowEditPart.VISUAL_ID:
			return getDataflow_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PipelineLinkDescriptor> getIncomingLinks(View view) {
		switch (PipelineVisualIDRegistry.getVisualID(view)) {
		case CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2025IncomingLinks(view);
		case IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2026IncomingLinks(view);
		case CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2027IncomingLinks(view);
		case AnalysisTaskEditPart.VISUAL_ID:
			return getAnalysisTask_2031IncomingLinks(view);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2029IncomingLinks(view);
		case ExportTaskEditPart.VISUAL_ID:
			return getExportTask_2032IncomingLinks(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_3025IncomingLinks(view);
		case UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3026IncomingLinks(view);
		case PredefinedEditPart.VISUAL_ID:
			return getPredefined_3027IncomingLinks(view);
		case DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3033IncomingLinks(view);
		case ClassificationEditPart.VISUAL_ID:
			return getClassification_3034IncomingLinks(view);
		case PredictiveEditPart.VISUAL_ID:
			return getPredictive_3035IncomingLinks(view);
		case ClusteringEditPart.VISUAL_ID:
			return getClustering_3036IncomingLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_3037IncomingLinks(view);
		case DataflowEditPart.VISUAL_ID:
			return getDataflow_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PipelineLinkDescriptor> getOutgoingLinks(View view) {
		switch (PipelineVisualIDRegistry.getVisualID(view)) {
		case CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2025OutgoingLinks(view);
		case IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2026OutgoingLinks(view);
		case CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2027OutgoingLinks(view);
		case AnalysisTaskEditPart.VISUAL_ID:
			return getAnalysisTask_2031OutgoingLinks(view);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2029OutgoingLinks(view);
		case ExportTaskEditPart.VISUAL_ID:
			return getExportTask_2032OutgoingLinks(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_3025OutgoingLinks(view);
		case UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3026OutgoingLinks(view);
		case PredefinedEditPart.VISUAL_ID:
			return getPredefined_3027OutgoingLinks(view);
		case DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3033OutgoingLinks(view);
		case ClassificationEditPart.VISUAL_ID:
			return getClassification_3034OutgoingLinks(view);
		case PredictiveEditPart.VISUAL_ID:
			return getPredictive_3035OutgoingLinks(view);
		case ClusteringEditPart.VISUAL_ID:
			return getClustering_3036OutgoingLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_3037OutgoingLinks(view);
		case DataflowEditPart.VISUAL_ID:
			return getDataflow_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPipeline_1000ContainedLinks(View view) {
		Pipeline modelElement = (Pipeline) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Dataflow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCollectionTask_2025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getIntegrationTask_2026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCleaningTask_2027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getAnalysisTask_2031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getVisualizationTask_2029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportTask_2032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getImport_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getUserDefined_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefined_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptive_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassification_3034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictive_3035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClustering_3036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExport_3037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDataflow_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCollectionTask_2025IncomingLinks(View view) {
		CollectionTask modelElement = (CollectionTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getIntegrationTask_2026IncomingLinks(View view) {
		IntegrationTask modelElement = (IntegrationTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCleaningTask_2027IncomingLinks(View view) {
		CleaningTask modelElement = (CleaningTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getAnalysisTask_2031IncomingLinks(View view) {
		AnalysisTask modelElement = (AnalysisTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getVisualizationTask_2029IncomingLinks(View view) {
		VisualizationTask modelElement = (VisualizationTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportTask_2032IncomingLinks(View view) {
		ExportTask modelElement = (ExportTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getImport_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getUserDefined_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefined_3027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptive_3033IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassification_3034IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictive_3035IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClustering_3036IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExport_3037IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDataflow_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCollectionTask_2025OutgoingLinks(View view) {
		CollectionTask modelElement = (CollectionTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getIntegrationTask_2026OutgoingLinks(View view) {
		IntegrationTask modelElement = (IntegrationTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCleaningTask_2027OutgoingLinks(View view) {
		CleaningTask modelElement = (CleaningTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getAnalysisTask_2031OutgoingLinks(View view) {
		AnalysisTask modelElement = (AnalysisTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getVisualizationTask_2029OutgoingLinks(View view) {
		VisualizationTask modelElement = (VisualizationTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportTask_2032OutgoingLinks(View view) {
		ExportTask modelElement = (ExportTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getImport_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getUserDefined_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefined_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptive_3033OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassification_3034OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictive_3035OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClustering_3036OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExport_3037OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDataflow_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getContainedTypeModelFacetLinks_Dataflow_4004(
			Pipeline container) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		for (Iterator<?> links = container.getDataflows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Dataflow) {
				continue;
			}
			Dataflow link = (Dataflow) linkObject;
			if (DataflowEditPart.VISUAL_ID != PipelineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSource();
			result.add(new PipelineLinkDescriptor(src, dst, link, PipelineElementTypes.Dataflow_4004,
					DataflowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingTypeModelFacetLinks_Dataflow_4004(Task target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PipelinePackage.eINSTANCE.getDataflow_Target()
					|| false == setting.getEObject() instanceof Dataflow) {
				continue;
			}
			Dataflow link = (Dataflow) setting.getEObject();
			if (DataflowEditPart.VISUAL_ID != PipelineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task src = link.getSource();
			result.add(new PipelineLinkDescriptor(src, target, link, PipelineElementTypes.Dataflow_4004,
					DataflowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingTypeModelFacetLinks_Dataflow_4004(Task source) {
		Pipeline container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Pipeline) {
				container = (Pipeline) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		for (Iterator<?> links = container.getDataflows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Dataflow) {
				continue;
			}
			Dataflow link = (Dataflow) linkObject;
			if (DataflowEditPart.VISUAL_ID != PipelineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new PipelineLinkDescriptor(src, dst, link, PipelineElementTypes.Dataflow_4004,
					DataflowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<PipelineNodeDescriptor> getSemanticChildren(View view) {
			return PipelineDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PipelineLinkDescriptor> getContainedLinks(View view) {
			return PipelineDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PipelineLinkDescriptor> getIncomingLinks(View view) {
			return PipelineDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PipelineLinkDescriptor> getOutgoingLinks(View view) {
			return PipelineDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
