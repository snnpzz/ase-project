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

import pipeline.AnalysisOperation;
import pipeline.AnalysisTask;
import pipeline.Classification;
import pipeline.CleaningOperation;
import pipeline.CleaningTask;
import pipeline.Clustering;
import pipeline.CollectionTask;
import pipeline.DataFlow;
import pipeline.Descriptive;
import pipeline.Export;
import pipeline.ExportTask;
import pipeline.File;
import pipeline.Import;
import pipeline.IntegrationTask;
import pipeline.InternalDataFlow;
import pipeline.Operation;
import pipeline.Pipeline;
import pipeline.PipelinePackage;
import pipeline.Predefined;
import pipeline.Predictive;
import pipeline.Source;
import pipeline.Task;
import pipeline.UserDefined;
import pipeline.VisualizationTask;
import pipeline.diagram.edit.parts.AnalysisTaskAnalysisTaskAnalyzesCompartmentEditPart;
import pipeline.diagram.edit.parts.AnalysisTaskEditPart;
import pipeline.diagram.edit.parts.Classification2EditPart;
import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.Clustering2EditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.DataFlowEditPart;
import pipeline.diagram.edit.parts.Descriptive2EditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.ExportEditPart;
import pipeline.diagram.edit.parts.ExportGeneratesEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.ExportTaskExportTaskExportsCompartmentEditPart;
import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.ImportReadsFromEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
import pipeline.diagram.edit.parts.Predefined2EditPart;
import pipeline.diagram.edit.parts.PredefinedEditPart;
import pipeline.diagram.edit.parts.Predictive2EditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.SourceEditPart;
import pipeline.diagram.edit.parts.UserDefined2EditPart;
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
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UserDefinedEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
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
			if (visualID == PredefinedEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
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
		for (Iterator<?> it = modelElement.getSources().iterator(); it.hasNext();) {
			Source childElement = (Source) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SourceEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFiles().iterator(); it.hasNext();) {
			File childElement = (File) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FileEditPart.VISUAL_ID) {
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
			if (visualID == UserDefined2EditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Predefined2EditPart.VISUAL_ID) {
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
			AnalysisOperation childElement = (AnalysisOperation) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Descriptive2EditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Classification2EditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Predictive2EditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Clustering2EditPart.VISUAL_ID) {
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
		case UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_2033ContainedLinks(view);
		case DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_2034ContainedLinks(view);
		case ClassificationEditPart.VISUAL_ID:
			return getClassification_2035ContainedLinks(view);
		case PredictiveEditPart.VISUAL_ID:
			return getPredictive_2036ContainedLinks(view);
		case ClusteringEditPart.VISUAL_ID:
			return getClustering_2037ContainedLinks(view);
		case PredefinedEditPart.VISUAL_ID:
			return getPredefined_2038ContainedLinks(view);
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
		case SourceEditPart.VISUAL_ID:
			return getSource_2039ContainedLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2040ContainedLinks(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_3025ContainedLinks(view);
		case UserDefined2EditPart.VISUAL_ID:
			return getUserDefined_3026ContainedLinks(view);
		case Predefined2EditPart.VISUAL_ID:
			return getPredefined_3027ContainedLinks(view);
		case Descriptive2EditPart.VISUAL_ID:
			return getDescriptive_3033ContainedLinks(view);
		case Classification2EditPart.VISUAL_ID:
			return getClassification_3034ContainedLinks(view);
		case Predictive2EditPart.VISUAL_ID:
			return getPredictive_3035ContainedLinks(view);
		case Clustering2EditPart.VISUAL_ID:
			return getClustering_3036ContainedLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_3037ContainedLinks(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4005ContainedLinks(view);
		case InternalDataFlowEditPart.VISUAL_ID:
			return getInternalDataFlow_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PipelineLinkDescriptor> getIncomingLinks(View view) {
		switch (PipelineVisualIDRegistry.getVisualID(view)) {
		case UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_2033IncomingLinks(view);
		case DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_2034IncomingLinks(view);
		case ClassificationEditPart.VISUAL_ID:
			return getClassification_2035IncomingLinks(view);
		case PredictiveEditPart.VISUAL_ID:
			return getPredictive_2036IncomingLinks(view);
		case ClusteringEditPart.VISUAL_ID:
			return getClustering_2037IncomingLinks(view);
		case PredefinedEditPart.VISUAL_ID:
			return getPredefined_2038IncomingLinks(view);
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
		case SourceEditPart.VISUAL_ID:
			return getSource_2039IncomingLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2040IncomingLinks(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_3025IncomingLinks(view);
		case UserDefined2EditPart.VISUAL_ID:
			return getUserDefined_3026IncomingLinks(view);
		case Predefined2EditPart.VISUAL_ID:
			return getPredefined_3027IncomingLinks(view);
		case Descriptive2EditPart.VISUAL_ID:
			return getDescriptive_3033IncomingLinks(view);
		case Classification2EditPart.VISUAL_ID:
			return getClassification_3034IncomingLinks(view);
		case Predictive2EditPart.VISUAL_ID:
			return getPredictive_3035IncomingLinks(view);
		case Clustering2EditPart.VISUAL_ID:
			return getClustering_3036IncomingLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_3037IncomingLinks(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4005IncomingLinks(view);
		case InternalDataFlowEditPart.VISUAL_ID:
			return getInternalDataFlow_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PipelineLinkDescriptor> getOutgoingLinks(View view) {
		switch (PipelineVisualIDRegistry.getVisualID(view)) {
		case UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_2033OutgoingLinks(view);
		case DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_2034OutgoingLinks(view);
		case ClassificationEditPart.VISUAL_ID:
			return getClassification_2035OutgoingLinks(view);
		case PredictiveEditPart.VISUAL_ID:
			return getPredictive_2036OutgoingLinks(view);
		case ClusteringEditPart.VISUAL_ID:
			return getClustering_2037OutgoingLinks(view);
		case PredefinedEditPart.VISUAL_ID:
			return getPredefined_2038OutgoingLinks(view);
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
		case SourceEditPart.VISUAL_ID:
			return getSource_2039OutgoingLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2040OutgoingLinks(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_3025OutgoingLinks(view);
		case UserDefined2EditPart.VISUAL_ID:
			return getUserDefined_3026OutgoingLinks(view);
		case Predefined2EditPart.VISUAL_ID:
			return getPredefined_3027OutgoingLinks(view);
		case Descriptive2EditPart.VISUAL_ID:
			return getDescriptive_3033OutgoingLinks(view);
		case Classification2EditPart.VISUAL_ID:
			return getClassification_3034OutgoingLinks(view);
		case Predictive2EditPart.VISUAL_ID:
			return getPredictive_3035OutgoingLinks(view);
		case Clustering2EditPart.VISUAL_ID:
			return getClustering_3036OutgoingLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_3037OutgoingLinks(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4005OutgoingLinks(view);
		case InternalDataFlowEditPart.VISUAL_ID:
			return getInternalDataFlow_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPipeline_1000ContainedLinks(View view) {
		Pipeline modelElement = (Pipeline) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_DataFlow_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getUserDefined_2033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptive_2034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassification_2035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictive_2036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClustering_2037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefined_2038ContainedLinks(View view) {
		return Collections.emptyList();
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
	public static List<PipelineLinkDescriptor> getSource_2039ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getFile_2040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getImport_3025ContainedLinks(View view) {
		Import modelElement = (Import) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Import_ReadsFrom_4007(modelElement));
		return result;
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
		Export modelElement = (Export) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Export_Generates_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDataFlow_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getInternalDataFlow_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getUserDefined_2033IncomingLinks(View view) {
		UserDefined modelElement = (UserDefined) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptive_2034IncomingLinks(View view) {
		Descriptive modelElement = (Descriptive) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassification_2035IncomingLinks(View view) {
		Classification modelElement = (Classification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictive_2036IncomingLinks(View view) {
		Predictive modelElement = (Predictive) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClustering_2037IncomingLinks(View view) {
		Clustering modelElement = (Clustering) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefined_2038IncomingLinks(View view) {
		Predefined modelElement = (Predefined) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCollectionTask_2025IncomingLinks(View view) {
		CollectionTask modelElement = (CollectionTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4005(modelElement, crossReferences));
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
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4005(modelElement, crossReferences));
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
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4005(modelElement, crossReferences));
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
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4005(modelElement, crossReferences));
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
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4005(modelElement, crossReferences));
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
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSource_2039IncomingLinks(View view) {
		Source modelElement = (Source) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Import_ReadsFrom_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getFile_2040IncomingLinks(View view) {
		File modelElement = (File) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Export_Generates_4008(modelElement, crossReferences));
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
		UserDefined modelElement = (UserDefined) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefined_3027IncomingLinks(View view) {
		Predefined modelElement = (Predefined) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptive_3033IncomingLinks(View view) {
		Descriptive modelElement = (Descriptive) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassification_3034IncomingLinks(View view) {
		Classification modelElement = (Classification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictive_3035IncomingLinks(View view) {
		Predictive modelElement = (Predictive) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClustering_3036IncomingLinks(View view) {
		Clustering modelElement = (Clustering) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
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
	public static List<PipelineLinkDescriptor> getDataFlow_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getInternalDataFlow_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getUserDefined_2033OutgoingLinks(View view) {
		UserDefined modelElement = (UserDefined) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptive_2034OutgoingLinks(View view) {
		Descriptive modelElement = (Descriptive) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassification_2035OutgoingLinks(View view) {
		Classification modelElement = (Classification) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictive_2036OutgoingLinks(View view) {
		Predictive modelElement = (Predictive) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClustering_2037OutgoingLinks(View view) {
		Clustering modelElement = (Clustering) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefined_2038OutgoingLinks(View view) {
		Predefined modelElement = (Predefined) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCollectionTask_2025OutgoingLinks(View view) {
		CollectionTask modelElement = (CollectionTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getIntegrationTask_2026OutgoingLinks(View view) {
		IntegrationTask modelElement = (IntegrationTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCleaningTask_2027OutgoingLinks(View view) {
		CleaningTask modelElement = (CleaningTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getAnalysisTask_2031OutgoingLinks(View view) {
		AnalysisTask modelElement = (AnalysisTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getVisualizationTask_2029OutgoingLinks(View view) {
		VisualizationTask modelElement = (VisualizationTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportTask_2032OutgoingLinks(View view) {
		ExportTask modelElement = (ExportTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSource_2039OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getFile_2040OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getImport_3025OutgoingLinks(View view) {
		Import modelElement = (Import) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Import_ReadsFrom_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getUserDefined_3026OutgoingLinks(View view) {
		UserDefined modelElement = (UserDefined) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefined_3027OutgoingLinks(View view) {
		Predefined modelElement = (Predefined) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptive_3033OutgoingLinks(View view) {
		Descriptive modelElement = (Descriptive) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassification_3034OutgoingLinks(View view) {
		Classification modelElement = (Classification) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictive_3035OutgoingLinks(View view) {
		Predictive modelElement = (Predictive) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClustering_3036OutgoingLinks(View view) {
		Clustering modelElement = (Clustering) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExport_3037OutgoingLinks(View view) {
		Export modelElement = (Export) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Export_Generates_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDataFlow_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getInternalDataFlow_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getContainedTypeModelFacetLinks_DataFlow_4005(
			Pipeline container) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		for (Iterator<?> links = container.getDataFlows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DataFlow) {
				continue;
			}
			DataFlow link = (DataFlow) linkObject;
			if (DataFlowEditPart.VISUAL_ID != PipelineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSource();
			result.add(new PipelineLinkDescriptor(src, dst, link, PipelineElementTypes.DataFlow_4005,
					DataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getContainedTypeModelFacetLinks_InternalDataFlow_4006(
			Pipeline container) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		for (Iterator<?> links = container.getInternalDataFlows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InternalDataFlow) {
				continue;
			}
			InternalDataFlow link = (InternalDataFlow) linkObject;
			if (InternalDataFlowEditPart.VISUAL_ID != PipelineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operation dst = link.getTarget();
			Operation src = link.getSource();
			result.add(new PipelineLinkDescriptor(src, dst, link, PipelineElementTypes.InternalDataFlow_4006,
					InternalDataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingTypeModelFacetLinks_DataFlow_4005(Task target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PipelinePackage.eINSTANCE.getDataFlow_Target()
					|| false == setting.getEObject() instanceof DataFlow) {
				continue;
			}
			DataFlow link = (DataFlow) setting.getEObject();
			if (DataFlowEditPart.VISUAL_ID != PipelineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task src = link.getSource();
			result.add(new PipelineLinkDescriptor(src, target, link, PipelineElementTypes.DataFlow_4005,
					DataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingTypeModelFacetLinks_InternalDataFlow_4006(
			Operation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PipelinePackage.eINSTANCE.getInternalDataFlow_Target()
					|| false == setting.getEObject() instanceof InternalDataFlow) {
				continue;
			}
			InternalDataFlow link = (InternalDataFlow) setting.getEObject();
			if (InternalDataFlowEditPart.VISUAL_ID != PipelineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operation src = link.getSource();
			result.add(new PipelineLinkDescriptor(src, target, link, PipelineElementTypes.InternalDataFlow_4006,
					InternalDataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_Import_ReadsFrom_4007(
			Source target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getImport_ReadsFrom()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ImportReadsFrom_4007, ImportReadsFromEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_Export_Generates_4008(
			File target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getExport_Generates()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ExportGenerates_4008, ExportGeneratesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingTypeModelFacetLinks_DataFlow_4005(Task source) {
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
		for (Iterator<?> links = container.getDataFlows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DataFlow) {
				continue;
			}
			DataFlow link = (DataFlow) linkObject;
			if (DataFlowEditPart.VISUAL_ID != PipelineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTarget();
			Task src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new PipelineLinkDescriptor(src, dst, link, PipelineElementTypes.DataFlow_4005,
					DataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(
			Operation source) {
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
		for (Iterator<?> links = container.getInternalDataFlows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InternalDataFlow) {
				continue;
			}
			InternalDataFlow link = (InternalDataFlow) linkObject;
			if (InternalDataFlowEditPart.VISUAL_ID != PipelineVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operation dst = link.getTarget();
			Operation src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new PipelineLinkDescriptor(src, dst, link, PipelineElementTypes.InternalDataFlow_4006,
					InternalDataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_Import_ReadsFrom_4007(
			Import source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Source destination = source.getReadsFrom();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ImportReadsFrom_4007,
				ImportReadsFromEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_Export_Generates_4008(
			Export source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		File destination = source.getGenerates();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ExportGenerates_4008,
				ExportGeneratesEditPart.VISUAL_ID));
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
