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

import pipeline.AnalysisTask;
import pipeline.Attribute;
import pipeline.Chart;
import pipeline.CleaningTask;
import pipeline.CollectionTask;
import pipeline.ComplexAttribute;
import pipeline.DataFlow;
import pipeline.ExportOperation;
import pipeline.ExportTask;
import pipeline.File;
import pipeline.ImportOperation;
import pipeline.IntegrationTask;
import pipeline.InternalDataFlow;
import pipeline.Operation;
import pipeline.Pipeline;
import pipeline.PipelinePackage;
import pipeline.Schema;
import pipeline.SimpleAttribute;
import pipeline.Source;
import pipeline.Task;
import pipeline.VisualizationTask;
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
			return getImportOperation_3001ContainedLinks(view);
		case ExportOperationEditPart.VISUAL_ID:
			return getExportOperation_3002ContainedLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_3003ContainedLinks(view);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getComplexAttribute_3004ContainedLinks(view);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getSimpleAttribute_3005ContainedLinks(view);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getComplexAttribute_3006ContainedLinks(view);
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
			return getImportOperation_3001IncomingLinks(view);
		case ExportOperationEditPart.VISUAL_ID:
			return getExportOperation_3002IncomingLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_3003IncomingLinks(view);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getComplexAttribute_3004IncomingLinks(view);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getSimpleAttribute_3005IncomingLinks(view);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getComplexAttribute_3006IncomingLinks(view);
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
			return getImportOperation_3001OutgoingLinks(view);
		case ExportOperationEditPart.VISUAL_ID:
			return getExportOperation_3002OutgoingLinks(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_3003OutgoingLinks(view);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getComplexAttribute_3004OutgoingLinks(view);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getSimpleAttribute_3005OutgoingLinks(view);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getComplexAttribute_3006OutgoingLinks(view);
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
	public static List<PipelineLinkDescriptor> getImportOperation_3001ContainedLinks(View view) {
		ImportOperation modelElement = (ImportOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ImportOperation_Read_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ImportOperation_Use_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportOperation_3002ContainedLinks(View view) {
		ExportOperation modelElement = (ExportOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExportOperation_Use_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExportOperation_Write_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3006ContainedLinks(View view) {
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
		result.addAll(getIncomingFeatureModelFacetLinks_ImportOperation_Read_4006(modelElement, crossReferences));
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
		result.addAll(getIncomingFeatureModelFacetLinks_ExportOperation_Write_4009(modelElement, crossReferences));
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
		result.addAll(getIncomingFeatureModelFacetLinks_ImportOperation_Use_4007(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ExportOperation_Use_4008(modelElement, crossReferences));
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
	public static List<PipelineLinkDescriptor> getImportOperation_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportOperation_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3003IncomingLinks(View view) {
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
	public static List<PipelineLinkDescriptor> getComplexAttribute_3004IncomingLinks(View view) {
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
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3005IncomingLinks(View view) {
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
	public static List<PipelineLinkDescriptor> getComplexAttribute_3006IncomingLinks(View view) {
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
	public static List<PipelineLinkDescriptor> getImportOperation_3001OutgoingLinks(View view) {
		ImportOperation modelElement = (ImportOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ImportOperation_Read_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ImportOperation_Use_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getExportOperation_3002OutgoingLinks(View view) {
		ExportOperation modelElement = (ExportOperation) view.getElement();
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ExportOperation_Use_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExportOperation_Write_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getSimpleAttribute_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PipelineLinkDescriptor> getComplexAttribute_3006OutgoingLinks(View view) {
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
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_ImportOperation_Read_4006(
			Source target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getImportOperation_Read()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ImportOperationRead_4006, ImportOperationReadEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_ImportOperation_Use_4007(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getImportOperation_Use()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ImportOperationUse_4007, ImportOperationUseEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_ExportOperation_Use_4008(
			Schema target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getExportOperation_Use()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ExportOperationUse_4008, ExportOperationUseEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PipelineLinkDescriptor> getIncomingFeatureModelFacetLinks_ExportOperation_Write_4009(
			File target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PipelinePackage.eINSTANCE.getExportOperation_Write()) {
				result.add(new PipelineLinkDescriptor(setting.getEObject(), target,
						PipelineElementTypes.ExportOperationWrite_4009, ExportOperationWriteEditPart.VISUAL_ID));
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
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_ImportOperation_Read_4006(
			ImportOperation source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Source destination = source.getRead();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ImportOperationRead_4006,
				ImportOperationReadEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_ImportOperation_Use_4007(
			ImportOperation source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Schema destination = source.getUse();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ImportOperationUse_4007,
				ImportOperationUseEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_ExportOperation_Use_4008(
			ExportOperation source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		Schema destination = source.getUse();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ExportOperationUse_4008,
				ExportOperationUseEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PipelineLinkDescriptor> getOutgoingFeatureModelFacetLinks_ExportOperation_Write_4009(
			ExportOperation source) {
		LinkedList<PipelineLinkDescriptor> result = new LinkedList<PipelineLinkDescriptor>();
		File destination = source.getWrite();
		if (destination == null) {
			return result;
		}
		result.add(new PipelineLinkDescriptor(source, destination, PipelineElementTypes.ExportOperationWrite_4009,
				ExportOperationWriteEditPart.VISUAL_ID));
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
