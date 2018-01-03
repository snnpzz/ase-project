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
import pipeline.ExportOperation;
import pipeline.ExportTask;
import pipeline.File;
import pipeline.ImportOperation;
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
import pipeline.diagram.edit.parts.CollectionTaskCollectionTaskImportOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.ComplexAttribute2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeComplexAttributeAttributesCompartment2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeComplexAttributeAttributesCompartmentEditPart;
import pipeline.diagram.edit.parts.ComplexAttributeEditPart;
import pipeline.diagram.edit.parts.DataFlowEditPart;
import pipeline.diagram.edit.parts.DataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.DescriptiveAnalysisOperationEditPart;
import pipeline.diagram.edit.parts.ExportOperationEditPart;
import pipeline.diagram.edit.parts.ExportOperationExpUsesEditPart;
import pipeline.diagram.edit.parts.ExportOperationWriteEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.ExportTaskExportTaskExportOperationsCompartmentEditPart;
import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.edit.parts.ImportOperationEditPart;
import pipeline.diagram.edit.parts.ImportOperationImpUsesEditPart;
import pipeline.diagram.edit.parts.ImportOperationReadEditPart;
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
		case CollectionTaskCollectionTaskImportOperationsCompartmentEditPart.VISUAL_ID:
			return getCollectionTaskCollectionTaskImportOperationsCompartment_7001SemanticChildren(view);
		case CleaningTaskCleaningTaskCleaningOperationsCompartmentEditPart.VISUAL_ID:
			return getCleaningTaskCleaningTaskCleaningOperationsCompartment_7002SemanticChildren(view);
		case AnalysisTaskAnalysisTaskAnalysisOperationsCompartmentEditPart.VISUAL_ID:
			return getAnalysisTaskAnalysisTaskAnalysisOperationsCompartment_7003SemanticChildren(view);
		case ExportTaskExportTaskExportOperationsCompartmentEditPart.VISUAL_ID:
			return getExportTaskExportTaskExportOperationsCompartment_7004SemanticChildren(view);
		case SchemaSchemaAttributesCompartmentEditPart.VISUAL_ID:
			return getSchemaSchemaAttributesCompartment_7005SemanticChildren(view);
		case ComplexAttributeComplexAttributeAttributesCompartmentEditPart.VISUAL_ID:
			return getComplexAttributeComplexAttributeAttributesCompartment_7006SemanticChildren(view);
		case ComplexAttributeComplexAttributeAttributesCompartment2EditPart.VISUAL_ID:
			return getComplexAttributeComplexAttributeAttributesCompartment_7007SemanticChildren(view);
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
	public static List<PipelineNodeDescriptor> getCollectionTaskCollectionTaskImportOperationsCompartment_7001SemanticChildren(
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
		for (Iterator<?> it = modelElement.getImportOperations().iterator(); it.hasNext();) {
			ImportOperation childElement = (ImportOperation) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ImportOperationEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineNodeDescriptor> getCleaningTaskCleaningTaskCleaningOperationsCompartment_7002SemanticChildren(
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
	public static List<PipelineNodeDescriptor> getAnalysisTaskAnalysisTaskAnalysisOperationsCompartment_7003SemanticChildren(
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
	public static List<PipelineNodeDescriptor> getExportTaskExportTaskExportOperationsCompartment_7004SemanticChildren(
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
		for (Iterator<?> it = modelElement.getExportOperations().iterator(); it.hasNext();) {
			ExportOperation childElement = (ExportOperation) it.next();
			int visualID = PipelineVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExportOperationEditPart.VISUAL_ID) {
				result.add(new PipelineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PipelineNodeDescriptor> getSchemaSchemaAttributesCompartment_7005SemanticChildren(View view) {
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
	public static List<PipelineNodeDescriptor> getComplexAttributeComplexAttributeAttributesCompartment_7006SemanticChildren(
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
	public static List<PipelineNodeDescriptor> getComplexAttributeComplexAttributeAttributesCompartment_7007SemanticChildren(
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
			return getCollectionTask_2001ContainedLinks(view);
		case IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2002ContainedLinks(view);
		case CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2003ContainedLinks(view);
		case AnalysisTaskEditPart.VISUAL_ID:
			return getAnalysisTask_2004ContainedLinks(view);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2005ContainedLinks(view);
		case ExportTaskEditPart.VISUAL_ID:
			return getExportTask_2006ContainedLinks(view);
		case SourceEditPart.VISUAL_ID:
			return getSource_2007ContainedLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2008ContainedLinks(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2009ContainedLinks(view);
		case ChartEditPart.VISUAL_ID:
			return getChart_2010ContainedLinks(view);
		case ImportOperationEditPart.VISUAL_ID:
			return getImportOperation_3013ContainedLinks(view);
		case UserDefinedCleaningOperationEditPart.VISUAL_ID:
			return getUserDefinedCleaningOperation_3002ContainedLinks(view);
		case PredefinedCleaningOperationEditPart.VISUAL_ID:
			return getPredefinedCleaningOperation_3003ContainedLinks(view);
		case DescriptiveAnalysisOperationEditPart.VISUAL_ID:
			return getDescriptiveAnalysisOperation_3004ContainedLinks(view);
		case ClassificationAnalysisOperationEditPart.VISUAL_ID:
			return getClassificationAnalysisOperation_3005ContainedLinks(view);
		case PredictiveAnalysisOperationEditPart.VISUAL_ID:
			return getPredictiveAnalysisOperation_3006ContainedLinks(view);
		case ClusteringAnalysisOperationEditPart.VISUAL_ID:
			return getClusteringAnalysisOperation_3007ContainedLinks(view);
		case ExportOperationEditPart.VISUAL_ID:
			return getExportOperation_3014ContainedLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_3009ContainedLinks(view);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getComplexAttribute_3010ContainedLinks(view);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getSimpleAttribute_3011ContainedLinks(view);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getComplexAttribute_3012ContainedLinks(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4001ContainedLinks(view);
		case InternalDataFlowEditPart.VISUAL_ID:
			return getInternalDataFlow_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PipelineLinkDescriptor> getIncomingLinks(View view) {
		switch (PipelineVisualIDRegistry.getVisualID(view)) {
		case CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2001IncomingLinks(view);
		case IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2002IncomingLinks(view);
		case CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2003IncomingLinks(view);
		case AnalysisTaskEditPart.VISUAL_ID:
			return getAnalysisTask_2004IncomingLinks(view);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2005IncomingLinks(view);
		case ExportTaskEditPart.VISUAL_ID:
			return getExportTask_2006IncomingLinks(view);
		case SourceEditPart.VISUAL_ID:
			return getSource_2007IncomingLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2008IncomingLinks(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2009IncomingLinks(view);
		case ChartEditPart.VISUAL_ID:
			return getChart_2010IncomingLinks(view);
		case ImportOperationEditPart.VISUAL_ID:
			return getImportOperation_3013IncomingLinks(view);
		case UserDefinedCleaningOperationEditPart.VISUAL_ID:
			return getUserDefinedCleaningOperation_3002IncomingLinks(view);
		case PredefinedCleaningOperationEditPart.VISUAL_ID:
			return getPredefinedCleaningOperation_3003IncomingLinks(view);
		case DescriptiveAnalysisOperationEditPart.VISUAL_ID:
			return getDescriptiveAnalysisOperation_3004IncomingLinks(view);
		case ClassificationAnalysisOperationEditPart.VISUAL_ID:
			return getClassificationAnalysisOperation_3005IncomingLinks(view);
		case PredictiveAnalysisOperationEditPart.VISUAL_ID:
			return getPredictiveAnalysisOperation_3006IncomingLinks(view);
		case ClusteringAnalysisOperationEditPart.VISUAL_ID:
			return getClusteringAnalysisOperation_3007IncomingLinks(view);
		case ExportOperationEditPart.VISUAL_ID:
			return getExportOperation_3014IncomingLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_3009IncomingLinks(view);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getComplexAttribute_3010IncomingLinks(view);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getSimpleAttribute_3011IncomingLinks(view);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getComplexAttribute_3012IncomingLinks(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4001IncomingLinks(view);
		case InternalDataFlowEditPart.VISUAL_ID:
			return getInternalDataFlow_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PipelineLinkDescriptor> getOutgoingLinks(View view) {
		switch (PipelineVisualIDRegistry.getVisualID(view)) {
		case CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2001OutgoingLinks(view);
		case IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2002OutgoingLinks(view);
		case CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2003OutgoingLinks(view);
		case AnalysisTaskEditPart.VISUAL_ID:
			return getAnalysisTask_2004OutgoingLinks(view);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2005OutgoingLinks(view);
		case ExportTaskEditPart.VISUAL_ID:
			return getExportTask_2006OutgoingLinks(view);
		case SourceEditPart.VISUAL_ID:
			return getSource_2007OutgoingLinks(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2008OutgoingLinks(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2009OutgoingLinks(view);
		case ChartEditPart.VISUAL_ID:
			return getChart_2010OutgoingLinks(view);
		case ImportOperationEditPart.VISUAL_ID:
			return getImportOperation_3013OutgoingLinks(view);
		case UserDefinedCleaningOperationEditPart.VISUAL_ID:
			return getUserDefinedCleaningOperation_3002OutgoingLinks(view);
		case PredefinedCleaningOperationEditPart.VISUAL_ID:
			return getPredefinedCleaningOperation_3003OutgoingLinks(view);
		case DescriptiveAnalysisOperationEditPart.VISUAL_ID:
			return getDescriptiveAnalysisOperation_3004OutgoingLinks(view);
		case ClassificationAnalysisOperationEditPart.VISUAL_ID:
			return getClassificationAnalysisOperation_3005OutgoingLinks(view);
		case PredictiveAnalysisOperationEditPart.VISUAL_ID:
			return getPredictiveAnalysisOperation_3006OutgoingLinks(view);
		case ClusteringAnalysisOperationEditPart.VISUAL_ID:
			return getClusteringAnalysisOperation_3007OutgoingLinks(view);
		case ExportOperationEditPart.VISUAL_ID:
			return getExportOperation_3014OutgoingLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_3009OutgoingLinks(view);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getComplexAttribute_3010OutgoingLinks(view);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getSimpleAttribute_3011OutgoingLinks(view);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getComplexAttribute_3012OutgoingLinks(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4001OutgoingLinks(view);
		case InternalDataFlowEditPart.VISUAL_ID:
			return getInternalDataFlow_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPipeline_1000ContainedLinks(View view) {
		Pipeline modelElement = (Pipeline) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InternalDataFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCollectionTask_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getIntegrationTask_2002ContainedLinks(View view) {
		IntegrationTask modelElement = (IntegrationTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_IntegrationTask_Attributes_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCleaningTask_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getAnalysisTask_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getVisualizationTask_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportTask_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSource_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getFile_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSchema_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getChart_2010ContainedLinks(View view) {
		Chart modelElement = (Chart) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Chart_Axes_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getImportOperation_3013ContainedLinks(View view) {
		ImportOperation modelElement = (ImportOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ImportOperation_Read_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ImportOperation_ImpUses_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getUserDefinedCleaningOperation_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefinedCleaningOperation_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptiveAnalysisOperation_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassificationAnalysisOperation_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictiveAnalysisOperation_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClusteringAnalysisOperation_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportOperation_3014ContainedLinks(View view) {
		ExportOperation modelElement = (ExportOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExportOperation_Write_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExportOperation_ExpUses_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDataFlow_4001ContainedLinks(View view) {
		DataFlow modelElement = (DataFlow) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataFlow_Schema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getInternalDataFlow_4002ContainedLinks(View view) {
		InternalDataFlow modelElement = (InternalDataFlow) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InternalDataFlow_Schema_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCollectionTask_2001IncomingLinks(View view) {
		CollectionTask modelElement = (CollectionTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getIntegrationTask_2002IncomingLinks(View view) {
		IntegrationTask modelElement = (IntegrationTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCleaningTask_2003IncomingLinks(View view) {
		CleaningTask modelElement = (CleaningTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getAnalysisTask_2004IncomingLinks(View view) {
		AnalysisTask modelElement = (AnalysisTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getVisualizationTask_2005IncomingLinks(View view) {
		VisualizationTask modelElement = (VisualizationTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportTask_2006IncomingLinks(View view) {
		ExportTask modelElement = (ExportTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DataFlow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSource_2007IncomingLinks(View view) {
		Source modelElement = (Source) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ImportOperation_Read_4011(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getFile_2008IncomingLinks(View view) {
		File modelElement = (File) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ExportOperation_Write_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSchema_2009IncomingLinks(View view) {
		Schema modelElement = (Schema) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DataFlow_Schema_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_InternalDataFlow_Schema_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ImportOperation_ImpUses_4012(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ExportOperation_ExpUses_4014(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getChart_2010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getImportOperation_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getUserDefinedCleaningOperation_3002IncomingLinks(View view) {
		UserDefinedCleaningOperation modelElement = (UserDefinedCleaningOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefinedCleaningOperation_3003IncomingLinks(View view) {
		PredefinedCleaningOperation modelElement = (PredefinedCleaningOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptiveAnalysisOperation_3004IncomingLinks(View view) {
		DescriptiveAnalysisOperation modelElement = (DescriptiveAnalysisOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassificationAnalysisOperation_3005IncomingLinks(View view) {
		ClassificationAnalysisOperation modelElement = (ClassificationAnalysisOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictiveAnalysisOperation_3006IncomingLinks(View view) {
		PredictiveAnalysisOperation modelElement = (PredictiveAnalysisOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClusteringAnalysisOperation_3007IncomingLinks(View view) {
		ClusteringAnalysisOperation modelElement = (ClusteringAnalysisOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InternalDataFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportOperation_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3009IncomingLinks(View view) {
		SimpleAttribute modelElement = (SimpleAttribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_IntegrationTask_Attributes_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Chart_Axes_4010(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3010IncomingLinks(View view) {
		ComplexAttribute modelElement = (ComplexAttribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_IntegrationTask_Attributes_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3011IncomingLinks(View view) {
		SimpleAttribute modelElement = (SimpleAttribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_IntegrationTask_Attributes_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Chart_Axes_4010(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3012IncomingLinks(View view) {
		ComplexAttribute modelElement = (ComplexAttribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_IntegrationTask_Attributes_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDataFlow_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getInternalDataFlow_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCollectionTask_2001OutgoingLinks(View view) {
		CollectionTask modelElement = (CollectionTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getIntegrationTask_2002OutgoingLinks(View view) {
		IntegrationTask modelElement = (IntegrationTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_IntegrationTask_Attributes_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getCleaningTask_2003OutgoingLinks(View view) {
		CleaningTask modelElement = (CleaningTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getAnalysisTask_2004OutgoingLinks(View view) {
		AnalysisTask modelElement = (AnalysisTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getVisualizationTask_2005OutgoingLinks(View view) {
		VisualizationTask modelElement = (VisualizationTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportTask_2006OutgoingLinks(View view) {
		ExportTask modelElement = (ExportTask) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DataFlow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSource_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getFile_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSchema_2009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getChart_2010OutgoingLinks(View view) {
		Chart modelElement = (Chart) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Chart_Axes_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getImportOperation_3013OutgoingLinks(View view) {
		ImportOperation modelElement = (ImportOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ImportOperation_Read_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ImportOperation_ImpUses_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getUserDefinedCleaningOperation_3002OutgoingLinks(View view) {
		UserDefinedCleaningOperation modelElement = (UserDefinedCleaningOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredefinedCleaningOperation_3003OutgoingLinks(View view) {
		PredefinedCleaningOperation modelElement = (PredefinedCleaningOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDescriptiveAnalysisOperation_3004OutgoingLinks(View view) {
		DescriptiveAnalysisOperation modelElement = (DescriptiveAnalysisOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClassificationAnalysisOperation_3005OutgoingLinks(View view) {
		ClassificationAnalysisOperation modelElement = (ClassificationAnalysisOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getPredictiveAnalysisOperation_3006OutgoingLinks(View view) {
		PredictiveAnalysisOperation modelElement = (PredictiveAnalysisOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getClusteringAnalysisOperation_3007OutgoingLinks(View view) {
		ClusteringAnalysisOperation modelElement = (ClusteringAnalysisOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InternalDataFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportOperation_3014OutgoingLinks(View view) {
		ExportOperation modelElement = (ExportOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExportOperation_Write_4013(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExportOperation_ExpUses_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getDataFlow_4001OutgoingLinks(View view) {
		DataFlow modelElement = (DataFlow) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DataFlow_Schema_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getInternalDataFlow_4002OutgoingLinks(View view) {
		InternalDataFlow modelElement = (InternalDataFlow) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InternalDataFlow_Schema_4004(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getContainedTypeModelFacetLinks_DataFlow_4001(
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
			result.add(new PipelineLinkDescriptor(src, dst, link, PipelineElementTypes.DataFlow_4001,
					DataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getContainedTypeModelFacetLinks_InternalDataFlow_4002(
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
			result.add(new PipelineLinkDescriptor(src, dst, link, PipelineElementTypes.InternalDataFlow_4002,
					InternalDataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingTypeModelFacetLinks_DataFlow_4001(Task target,
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
			result.add(new PipelineLinkDescriptor(src, target, link, PipelineElementTypes.DataFlow_4001,
					DataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingTypeModelFacetLinks_InternalDataFlow_4002(
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
			result.add(new PipelineLinkDescriptor(src, target, link, PipelineElementTypes.InternalDataFlow_4002,
					InternalDataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_DataFlow_Schema_4003(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getDataFlow_Schema()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.DataFlowSchema_4003, DataFlowSchemaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_InternalDataFlow_Schema_4004(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getInternalDataFlow_Schema()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.InternalDataFlowSchema_4004, InternalDataFlowSchemaEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_IntegrationTask_Attributes_4005(
			Attribute target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getIntegrationTask_Attributes()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.IntegrationTaskAttributes_4005,
						IntegrationTaskAttributesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_ImportOperation_Read_4011(
			Source target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getImportOperation_Read()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ImportOperationRead_4011, ImportOperationReadEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_ImportOperation_ImpUses_4012(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getImportOperation_ImpUses()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ImportOperationImpUses_4012, ImportOperationImpUsesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_ExportOperation_Write_4013(
			File target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getExportOperation_Write()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ExportOperationWrite_4013, ExportOperationWriteEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_ExportOperation_ExpUses_4014(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getExportOperation_ExpUses()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ExportOperationExpUses_4014, ExportOperationExpUsesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_Chart_Axes_4010(
			SimpleAttribute target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getChart_Axes()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target, PipelineElementTypes.ChartAxes_4010,
						ChartAxesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingTypeModelFacetLinks_DataFlow_4001(Task source) {
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
			result.add(new PipelineLinkDescriptor(src, dst, link, PipelineElementTypes.DataFlow_4001,
					DataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingTypeModelFacetLinks_InternalDataFlow_4002(
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
			result.add(new PipelineLinkDescriptor(src, dst, link, PipelineElementTypes.InternalDataFlow_4002,
					InternalDataFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_DataFlow_Schema_4003(
			DataFlow source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Schema destination = source.getSchema();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.DataFlowSchema_4003,
				DataFlowSchemaEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_InternalDataFlow_Schema_4004(
			InternalDataFlow source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Schema destination = source.getSchema();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.InternalDataFlowSchema_4004,
				InternalDataFlowSchemaEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_IntegrationTask_Attributes_4005(
			IntegrationTask source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		for (Iterator<?> destinations = source.getAttributes().iterator(); destinations.hasNext();) {
			Attribute destination = (Attribute) destinations.next();
			result.add(new PipelineLinkDescriptor(source, destination,
					PipelineElementTypes.IntegrationTaskAttributes_4005, IntegrationTaskAttributesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_ImportOperation_Read_4011(
			ImportOperation source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Source destination = source.getRead();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ImportOperationRead_4011,
				ImportOperationReadEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_ImportOperation_ImpUses_4012(
			ImportOperation source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Schema destination = source.getImpUses();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ImportOperationImpUses_4012,
				ImportOperationImpUsesEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_ExportOperation_Write_4013(
			ExportOperation source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		File destination = source.getWrite();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ExportOperationWrite_4013,
				ExportOperationWriteEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_ExportOperation_ExpUses_4014(
			ExportOperation source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Schema destination = source.getExpUses();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ExportOperationExpUses_4014,
				ExportOperationExpUsesEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_Chart_Axes_4010(Chart source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		for (Iterator<?> destinations = source.getAxes().iterator(); destinations.hasNext();) {
			SimpleAttribute destination = (SimpleAttribute) destinations.next();
			result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ChartAxes_4010,
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
