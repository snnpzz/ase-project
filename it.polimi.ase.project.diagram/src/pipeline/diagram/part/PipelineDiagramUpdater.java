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
import pipeline.Attribute;
import pipeline.Chart;
import pipeline.ClassificationAnalysisOperation;
import pipeline.CleaningOperation;
import pipeline.CleaningTask;
import pipeline.ClusteringAnalysisOperation;
import pipeline.CollectionTask;
import pipeline.ComplexAttribute;
import pipeline.DataFlow;
import pipeline.DescriptiveAnalysisOperation;
import pipeline.Export;
import pipeline.ExportTask;
import pipeline.File;
import pipeline.Import;
import pipeline.IntegrationTask;
import pipeline.InternalDataFlow;
import pipeline.Operation;
import pipeline.Pipeline;
import pipeline.PipelinePackage;
import pipeline.PredefinedCleaningOperation;
import pipeline.PredictiveAnalysisOperation;
import pipeline.Schema;
import pipeline.SimpleAttribute;
import pipeline.Source;
import pipeline.Task;
import pipeline.UserDefinedCleaningOperation;
import pipeline.VisualizationTask;
import pipeline.diagram.edit.parts.AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.AnalysisTaskEditPart;
import pipeline.diagram.edit.parts.ChartAxesEditPart;
import pipeline.diagram.edit.parts.ChartEditPart;
import pipeline.diagram.edit.parts.ClassificationAnalysisOperationEditPart;
import pipeline.diagram.edit.parts.CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.ClusteringAnalysisOperationEditPart;
import pipeline.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.ComplexAttribute2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeComplexAttributeAttributesCompartment2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeComplexAttributeAttributesCompartmentEditPart;
import pipeline.diagram.edit.parts.ComplexAttributeEditPart;
import pipeline.diagram.edit.parts.DataFlowEditPart;
import pipeline.diagram.edit.parts.DataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.DescriptiveAnalysisOperationEditPart;
import pipeline.diagram.edit.parts.ExportEditPart;
import pipeline.diagram.edit.parts.ExportExpUsesEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.ExportTaskExportTaskExportsCompartmentEditPart;
import pipeline.diagram.edit.parts.ExportWriteEditPart;
import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.ImportImpUsesEditPart;
import pipeline.diagram.edit.parts.ImportReadEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskAttributesEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
import pipeline.diagram.edit.parts.PredefinedCleaningOperationEditPart;
import pipeline.diagram.edit.parts.PredictiveAnalysisOperationEditPart;
import pipeline.diagram.edit.parts.SchemaEditPart;
import pipeline.diagram.edit.parts.SchemaSchemaAttributesCompartmentEditPart;
import pipeline.diagram.edit.parts.SimpleAttribute2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeEditPart;
import pipeline.diagram.edit.parts.SourceEditPart;
import pipeline.diagram.edit.parts.UserDefinedCleaningOperationEditPart;
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
		case CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart.VISUAL_ID:
			return getCleaningTaskCleaningTaskCleaningOperationsCompartment_7018SemanticChildren(view);
		case AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart.VISUAL_ID:
			return getAnalysisTaskAnalysisTaskAnalysisOperationsCompartment_7021SemanticChildren(view);
		case ExportTaskExportTaskExportsCompartmentEditPart.VISUAL_ID:
			return getExportTaskExportTaskExportsCompartment_7022SemanticChildren(view);
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
			return getSchemaSchemaAttributesCompartment_7023SemanticChildren(view);
		case ComplexAttributeComplexAttributeAttributesCompartmentEditPart.VISUAL_ID:
			return getComplexAttributeComplexAttributeAttributesCompartment_7026SemanticChildren(view);
		case ComplexAttributeComplexAttributeAttributesCompartment2EditPart.VISUAL_ID:
			return getComplexAttributeComplexAttributeAttributesCompartment_7027SemanticChildren(view);
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
		for (Iterator<?> it = modelElement.getSchemas().iterator(); it.hasNext();) {
			Schema childElement = (Schema) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SchemaEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCharts().iterator(); it.hasNext();) {
			Chart childElement = (Chart) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ChartEditPart.VISUAL_ID) {
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
	public static List<PipelineNodeDescriptor> getCleaningTaskCleaningTaskCleaningOperationsCompartment_7018SemanticChildren(
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
		for (Iterator<?> it = modelElement.getCleaningOperations().iterator(); it.hasNext();) {
			CleaningOperation childElement = (CleaningOperation) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UserDefinedCleaningOperationEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PredefinedCleaningOperationEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineNodeDescriptor> getAnalysisTaskAnalysisTaskAnalysisOperationsCompartment_7021SemanticChildren(
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
		for (Iterator<?> it = modelElement.getAnalysisOperations().iterator(); it.hasNext();) {
			AnalysisOperation childElement = (AnalysisOperation) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DescriptiveAnalysisOperationEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassificationAnalysisOperationEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PredictiveAnalysisOperationEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClusteringAnalysisOperationEditPart.VISUAL_ID) {
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
	public static List<PipelineNodeDescriptor> getSchemaSchemaAttributesCompartment_7023SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Schema modelElement = (Schema) containerView.getElement();
		LinkedList<PipelineNodeDescriptor> result = new LinkedList<PipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SimpleAttributeEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComplexAttributeEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineNodeDescriptor> getComplexAttributeComplexAttributeAttributesCompartment_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComplexAttribute modelElement = (ComplexAttribute) containerView.getElement();
		LinkedList<PipelineNodeDescriptor> result = new LinkedList<PipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SimpleAttribute2EditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComplexAttribute2EditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineNodeDescriptor> getComplexAttributeComplexAttributeAttributesCompartment_7027SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComplexAttribute modelElement = (ComplexAttribute) containerView.getElement();
		LinkedList<PipelineNodeDescriptor> result = new LinkedList<PipelineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			Attribute childElement = (Attribute) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SimpleAttribute2EditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComplexAttribute2EditPart.VISUAL_ID) {
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
		case SourceEditPart.VISUAL_ID:
			return getSource_2044ContainedLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2045ContainedLinks(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2043ContainedLinks(view);
		case ChartEditPart.VISUAL_ID:
			return getChart_2046ContainedLinks(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_3025ContainedLinks(view);
		case UserDefinedCleaningOperationEditPart.VISUAL_ID:
			return getUserDefinedCleaningOperation_3063ContainedLinks(view);
		case PredefinedCleaningOperationEditPart.VISUAL_ID:
			return getPredefinedCleaningOperation_3064ContainedLinks(view);
		case DescriptiveAnalysisOperationEditPart.VISUAL_ID:
			return getDescriptiveAnalysisOperation_3065ContainedLinks(view);
		case ClassificationAnalysisOperationEditPart.VISUAL_ID:
			return getClassificationAnalysisOperation_3066ContainedLinks(view);
		case PredictiveAnalysisOperationEditPart.VISUAL_ID:
			return getPredictiveAnalysisOperation_3067ContainedLinks(view);
		case ClusteringAnalysisOperationEditPart.VISUAL_ID:
			return getClusteringAnalysisOperation_3068ContainedLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_3037ContainedLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_3046ContainedLinks(view);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getComplexAttribute_3047ContainedLinks(view);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getSimpleAttribute_3048ContainedLinks(view);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getComplexAttribute_3049ContainedLinks(view);
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
			return getSource_2044IncomingLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2045IncomingLinks(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2043IncomingLinks(view);
		case ChartEditPart.VISUAL_ID:
			return getChart_2046IncomingLinks(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_3025IncomingLinks(view);
		case UserDefinedCleaningOperationEditPart.VISUAL_ID:
			return getUserDefinedCleaningOperation_3063IncomingLinks(view);
		case PredefinedCleaningOperationEditPart.VISUAL_ID:
			return getPredefinedCleaningOperation_3064IncomingLinks(view);
		case DescriptiveAnalysisOperationEditPart.VISUAL_ID:
			return getDescriptiveAnalysisOperation_3065IncomingLinks(view);
		case ClassificationAnalysisOperationEditPart.VISUAL_ID:
			return getClassificationAnalysisOperation_3066IncomingLinks(view);
		case PredictiveAnalysisOperationEditPart.VISUAL_ID:
			return getPredictiveAnalysisOperation_3067IncomingLinks(view);
		case ClusteringAnalysisOperationEditPart.VISUAL_ID:
			return getClusteringAnalysisOperation_3068IncomingLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_3037IncomingLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_3046IncomingLinks(view);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getComplexAttribute_3047IncomingLinks(view);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getSimpleAttribute_3048IncomingLinks(view);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getComplexAttribute_3049IncomingLinks(view);
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
			return getSource_2044OutgoingLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2045OutgoingLinks(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2043OutgoingLinks(view);
		case ChartEditPart.VISUAL_ID:
			return getChart_2046OutgoingLinks(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_3025OutgoingLinks(view);
		case UserDefinedCleaningOperationEditPart.VISUAL_ID:
			return getUserDefinedCleaningOperation_3063OutgoingLinks(view);
		case PredefinedCleaningOperationEditPart.VISUAL_ID:
			return getPredefinedCleaningOperation_3064OutgoingLinks(view);
		case DescriptiveAnalysisOperationEditPart.VISUAL_ID:
			return getDescriptiveAnalysisOperation_3065OutgoingLinks(view);
		case ClassificationAnalysisOperationEditPart.VISUAL_ID:
			return getClassificationAnalysisOperation_3066OutgoingLinks(view);
		case PredictiveAnalysisOperationEditPart.VISUAL_ID:
			return getPredictiveAnalysisOperation_3067OutgoingLinks(view);
		case ClusteringAnalysisOperationEditPart.VISUAL_ID:
			return getClusteringAnalysisOperation_3068OutgoingLinks(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_3037OutgoingLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_3046OutgoingLinks(view);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getComplexAttribute_3047OutgoingLinks(view);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getSimpleAttribute_3048OutgoingLinks(view);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getComplexAttribute_3049OutgoingLinks(view);
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
	public static List<PipelineLinkDescriptor> getCollectionTask_2025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getIntegrationTask_2026ContainedLinks(View view) {
		IntegrationTask modelElement = (IntegrationTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_IntegrationTask_Attributes_4025(modelElement));
		return result;
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
	public static List<PipelineLinkDescriptor> getSource_2044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getFile_2045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSchema_2043ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getChart_2046ContainedLinks(View view) {
		Chart modelElement = (Chart) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Chart_Axes_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getImport_3025ContainedLinks(View view) {
		Import modelElement = (Import) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Import_Read_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Import_ImpUses_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getUserDefinedCleaningOperation_3063ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefinedCleaningOperation_3064ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptiveAnalysisOperation_3065ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassificationAnalysisOperation_3066ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictiveAnalysisOperation_3067ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClusteringAnalysisOperation_3068ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExport_3037ContainedLinks(View view) {
		Export modelElement = (Export) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Export_Write_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Export_ExpUses_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDataFlow_4005ContainedLinks(View view) {
		DataFlow modelElement = (DataFlow) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataFlow_Schema_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getInternalDataFlow_4006ContainedLinks(View view) {
		InternalDataFlow modelElement = (InternalDataFlow) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InternalDataFlow_Schema_4024(modelElement));
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
	public static List<PipelineLinkDescriptor> getSource_2044IncomingLinks(View view) {
		Source modelElement = (Source) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Import_Read_4021(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getFile_2045IncomingLinks(View view) {
		File modelElement = (File) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Export_Write_4022(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSchema_2043IncomingLinks(View view) {
		Schema modelElement = (Schema) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DataFlow_Schema_4019(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_InternalDataFlow_Schema_4024(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Import_ImpUses_4013(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Export_ExpUses_4014(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getChart_2046IncomingLinks(View view) {
		return Collections.emptyList();
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
	public static List<PipelineLinkDescriptor> getUserDefinedCleaningOperation_3063IncomingLinks(View view) {
		UserDefinedCleaningOperation modelElement = (UserDefinedCleaningOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefinedCleaningOperation_3064IncomingLinks(View view) {
		PredefinedCleaningOperation modelElement = (PredefinedCleaningOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptiveAnalysisOperation_3065IncomingLinks(View view) {
		DescriptiveAnalysisOperation modelElement = (DescriptiveAnalysisOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassificationAnalysisOperation_3066IncomingLinks(View view) {
		ClassificationAnalysisOperation modelElement = (ClassificationAnalysisOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictiveAnalysisOperation_3067IncomingLinks(View view) {
		PredictiveAnalysisOperation modelElement = (PredictiveAnalysisOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClusteringAnalysisOperation_3068IncomingLinks(View view) {
		ClusteringAnalysisOperation modelElement = (ClusteringAnalysisOperation) view.getElement();
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
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3046IncomingLinks(View view) {
		SimpleAttribute modelElement = (SimpleAttribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_IntegrationTask_Attributes_4025(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Chart_Axes_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3047IncomingLinks(View view) {
		ComplexAttribute modelElement = (ComplexAttribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_IntegrationTask_Attributes_4025(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3048IncomingLinks(View view) {
		SimpleAttribute modelElement = (SimpleAttribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_IntegrationTask_Attributes_4025(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Chart_Axes_4026(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3049IncomingLinks(View view) {
		ComplexAttribute modelElement = (ComplexAttribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_IntegrationTask_Attributes_4025(modelElement, crossReferences));
		return result;
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
		result.addAll(getOutgoingFeatureModelFacetLinks_IntegrationTask_Attributes_4025(modelElement));
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
	public static List<PipelineLinkDescriptor> getSource_2044OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getFile_2045OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSchema_2043OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getChart_2046OutgoingLinks(View view) {
		Chart modelElement = (Chart) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Chart_Axes_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getImport_3025OutgoingLinks(View view) {
		Import modelElement = (Import) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Import_Read_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Import_ImpUses_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getUserDefinedCleaningOperation_3063OutgoingLinks(View view) {
		UserDefinedCleaningOperation modelElement = (UserDefinedCleaningOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefinedCleaningOperation_3064OutgoingLinks(View view) {
		PredefinedCleaningOperation modelElement = (PredefinedCleaningOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptiveAnalysisOperation_3065OutgoingLinks(View view) {
		DescriptiveAnalysisOperation modelElement = (DescriptiveAnalysisOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassificationAnalysisOperation_3066OutgoingLinks(View view) {
		ClassificationAnalysisOperation modelElement = (ClassificationAnalysisOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictiveAnalysisOperation_3067OutgoingLinks(View view) {
		PredictiveAnalysisOperation modelElement = (PredictiveAnalysisOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClusteringAnalysisOperation_3068OutgoingLinks(View view) {
		ClusteringAnalysisOperation modelElement = (ClusteringAnalysisOperation) view.getElement();
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
		result.addAll(getOutgoingFeatureModelFacetLinks_Export_Write_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Export_ExpUses_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3046OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3047OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3048OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3049OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDataFlow_4005OutgoingLinks(View view) {
		DataFlow modelElement = (DataFlow) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataFlow_Schema_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getInternalDataFlow_4006OutgoingLinks(View view) {
		InternalDataFlow modelElement = (InternalDataFlow) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InternalDataFlow_Schema_4024(modelElement));
		return result;
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
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_DataFlow_Schema_4019(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getDataFlow_Schema()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.DataFlowSchema_4019, DataFlowSchemaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_InternalDataFlow_Schema_4024(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getInternalDataFlow_Schema()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.InternalDataFlowSchema_4024, InternalDataFlowSchemaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_IntegrationTask_Attributes_4025(
			Attribute target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getIntegrationTask_Attributes()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.IntegrationTaskAttributes_4025,
						IntegrationTaskAttributesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_Import_Read_4021(Source target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getImport_Read()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ImportRead_4021, ImportReadEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_Import_ImpUses_4013(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getImport_ImpUses()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ImportImpUses_4013, ImportImpUsesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_Export_Write_4022(File target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getExport_Write()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ExportWrite_4022, ExportWriteEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_Export_ExpUses_4014(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getExport_ExpUses()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ExportExpUses_4014, ExportExpUsesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_Chart_Axes_4026(
			SimpleAttribute target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getChart_Axes()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target, PipelineElementTypes.ChartAxes_4026,
						ChartAxesEditPart.VISUAL_ID));
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
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_DataFlow_Schema_4019(
			DataFlow source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Schema destination = source.getSchema();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.DataFlowSchema_4019,
				DataFlowSchemaEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_InternalDataFlow_Schema_4024(
			InternalDataFlow source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Schema destination = source.getSchema();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.InternalDataFlowSchema_4024,
				InternalDataFlowSchemaEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_IntegrationTask_Attributes_4025(
			IntegrationTask source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		for (Iterator<?> destinations = source.getAttributes().iterator(); destinations.hasNext();) {
			Attribute destination = (Attribute) destinations.next();
			result.add(new PipelineLinkDescriptor(source, destination,
					PipelineElementTypes.IntegrationTaskAttributes_4025, IntegrationTaskAttributesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_Import_Read_4021(
			Import source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Source destination = source.getRead();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ImportRead_4021,
				ImportReadEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_Import_ImpUses_4013(
			Import source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Schema destination = source.getImpUses();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ImportImpUses_4013,
				ImportImpUsesEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_Export_Write_4022(
			Export source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		File destination = source.getWrite();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ExportWrite_4022,
				ExportWriteEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_Export_ExpUses_4014(
			Export source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Schema destination = source.getExpUses();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ExportExpUses_4014,
				ExportExpUsesEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_Chart_Axes_4026(Chart source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		for (Iterator<?> destinations = source.getAxes().iterator(); destinations.hasNext();) {
			SimpleAttribute destination = (SimpleAttribute) destinations.next();
			result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ChartAxes_4026,
					ChartAxesEditPart.VISUAL_ID));
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
