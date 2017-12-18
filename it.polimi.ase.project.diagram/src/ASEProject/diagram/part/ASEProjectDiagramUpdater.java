/*
* 
*/
package ASEProject.diagram.part;

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

/**
 * @generated
 */
public class ASEProjectDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ASEProject.diagram.part.ASEProjectNodeDescriptor> getSemanticChildren(View view) {
		switch (ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(view)) {
		case ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			return getPipeline_1000SemanticChildren(view);
		case ASEProject.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
			return getCollectionTaskCollectionTaskImportsCompartment_7005SemanticChildren(view);
		case ASEProject.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
			return getCleaningTaskCleaningTaskOperationsCompartment_7006SemanticChildren(view);
		case ASEProject.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
			return getAnalyzesTaskAnalyzesTaskAnalyzesCompartment_7007SemanticChildren(view);
		case ASEProject.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
			return getExportingTaskExportingTaskExportsCompartment_7008SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ASEProject.diagram.part.ASEProjectNodeDescriptor> getPipeline_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ASEProject.Pipeline modelElement = (ASEProject.Pipeline) view.getElement();
		LinkedList<ASEProject.diagram.part.ASEProjectNodeDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTasks().iterator(); it.hasNext();) {
			ASEProject.Task childElement = (ASEProject.Task) it.next();
			int visualID = ASEProject.diagram.part.ASEProjectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ASEProject.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASEProject.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASEProject.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASEProject.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASEProject.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASEProject.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ASEProject.diagram.part.ASEProjectNodeDescriptor> getCollectionTaskCollectionTaskImportsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ASEProject.CollectionTask modelElement = (ASEProject.CollectionTask) containerView.getElement();
		LinkedList<ASEProject.diagram.part.ASEProjectNodeDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getImports().iterator(); it.hasNext();) {
			ASEProject.Import childElement = (ASEProject.Import) it.next();
			int visualID = ASEProject.diagram.part.ASEProjectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ASEProject.diagram.edit.parts.ImportEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ASEProject.diagram.part.ASEProjectNodeDescriptor> getCleaningTaskCleaningTaskOperationsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ASEProject.CleaningTask modelElement = (ASEProject.CleaningTask) containerView.getElement();
		LinkedList<ASEProject.diagram.part.ASEProjectNodeDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			ASEProject.CleaningOp childElement = (ASEProject.CleaningOp) it.next();
			int visualID = ASEProject.diagram.part.ASEProjectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ASEProject.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASEProject.diagram.edit.parts.PredefinedEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ASEProject.diagram.part.ASEProjectNodeDescriptor> getAnalyzesTaskAnalyzesTaskAnalyzesCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ASEProject.AnalyzesTask modelElement = (ASEProject.AnalyzesTask) containerView.getElement();
		LinkedList<ASEProject.diagram.part.ASEProjectNodeDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnalyzes().iterator(); it.hasNext();) {
			ASEProject.AnalysisOp childElement = (ASEProject.AnalysisOp) it.next();
			int visualID = ASEProject.diagram.part.ASEProjectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ASEProject.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASEProject.diagram.edit.parts.ClassificationEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASEProject.diagram.edit.parts.PredictiveEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASEProject.diagram.edit.parts.ClusteringEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ASEProject.diagram.part.ASEProjectNodeDescriptor> getExportingTaskExportingTaskExportsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ASEProject.ExportingTask modelElement = (ASEProject.ExportingTask) containerView.getElement();
		LinkedList<ASEProject.diagram.part.ASEProjectNodeDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExports().iterator(); it.hasNext();) {
			ASEProject.Export childElement = (ASEProject.Export) it.next();
			int visualID = ASEProject.diagram.part.ASEProjectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ASEProject.diagram.edit.parts.ExportEditPart.VISUAL_ID) {
				result.add(new ASEProject.diagram.part.ASEProjectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getContainedLinks(View view) {
		switch (ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(view)) {
		case ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			return getPipeline_1000ContainedLinks(view);
		case ASEProject.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2007ContainedLinks(view);
		case ASEProject.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2008ContainedLinks(view);
		case ASEProject.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2009ContainedLinks(view);
		case ASEProject.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			return getAnalyzesTask_2010ContainedLinks(view);
		case ASEProject.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2011ContainedLinks(view);
		case ASEProject.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			return getExportingTask_2012ContainedLinks(view);
		case ASEProject.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			return getImport_3009ContainedLinks(view);
		case ASEProject.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3010ContainedLinks(view);
		case ASEProject.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			return getPredefined_3011ContainedLinks(view);
		case ASEProject.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3012ContainedLinks(view);
		case ASEProject.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			return getClassification_3013ContainedLinks(view);
		case ASEProject.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			return getPredictive_3014ContainedLinks(view);
		case ASEProject.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			return getClustering_3015ContainedLinks(view);
		case ASEProject.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			return getExport_3016ContainedLinks(view);
		case ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
			return getDataflow_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getIncomingLinks(View view) {
		switch (ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(view)) {
		case ASEProject.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2007IncomingLinks(view);
		case ASEProject.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2008IncomingLinks(view);
		case ASEProject.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2009IncomingLinks(view);
		case ASEProject.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			return getAnalyzesTask_2010IncomingLinks(view);
		case ASEProject.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2011IncomingLinks(view);
		case ASEProject.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			return getExportingTask_2012IncomingLinks(view);
		case ASEProject.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			return getImport_3009IncomingLinks(view);
		case ASEProject.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3010IncomingLinks(view);
		case ASEProject.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			return getPredefined_3011IncomingLinks(view);
		case ASEProject.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3012IncomingLinks(view);
		case ASEProject.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			return getClassification_3013IncomingLinks(view);
		case ASEProject.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			return getPredictive_3014IncomingLinks(view);
		case ASEProject.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			return getClustering_3015IncomingLinks(view);
		case ASEProject.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			return getExport_3016IncomingLinks(view);
		case ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
			return getDataflow_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getOutgoingLinks(View view) {
		switch (ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(view)) {
		case ASEProject.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2007OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2008OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2009OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			return getAnalyzesTask_2010OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2011OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			return getExportingTask_2012OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			return getImport_3009OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3010OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			return getPredefined_3011OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3012OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			return getClassification_3013OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			return getPredictive_3014OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			return getClustering_3015OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			return getExport_3016OutgoingLinks(view);
		case ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
			return getDataflow_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getPipeline_1000ContainedLinks(View view) {
		ASEProject.Pipeline modelElement = (ASEProject.Pipeline) view.getElement();
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Dataflow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getCollectionTask_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getIntegrationTask_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getCleaningTask_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getAnalyzesTask_2010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getVisualizationTask_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getExportingTask_2012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getImport_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getUserDefined_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getPredefined_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getDescriptive_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getClassification_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getPredictive_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getClustering_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getExport_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getDataflow_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getCollectionTask_2007IncomingLinks(
			View view) {
		ASEProject.CollectionTask modelElement = (ASEProject.CollectionTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getIntegrationTask_2008IncomingLinks(
			View view) {
		ASEProject.IntegrationTask modelElement = (ASEProject.IntegrationTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getCleaningTask_2009IncomingLinks(View view) {
		ASEProject.CleaningTask modelElement = (ASEProject.CleaningTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getAnalyzesTask_2010IncomingLinks(View view) {
		ASEProject.AnalyzesTask modelElement = (ASEProject.AnalyzesTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getVisualizationTask_2011IncomingLinks(
			View view) {
		ASEProject.VisualizationTask modelElement = (ASEProject.VisualizationTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getExportingTask_2012IncomingLinks(View view) {
		ASEProject.ExportingTask modelElement = (ASEProject.ExportingTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getImport_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getUserDefined_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getPredefined_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getDescriptive_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getClassification_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getPredictive_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getClustering_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getExport_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getDataflow_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getCollectionTask_2007OutgoingLinks(
			View view) {
		ASEProject.CollectionTask modelElement = (ASEProject.CollectionTask) view.getElement();
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getIntegrationTask_2008OutgoingLinks(
			View view) {
		ASEProject.IntegrationTask modelElement = (ASEProject.IntegrationTask) view.getElement();
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getCleaningTask_2009OutgoingLinks(View view) {
		ASEProject.CleaningTask modelElement = (ASEProject.CleaningTask) view.getElement();
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getAnalyzesTask_2010OutgoingLinks(View view) {
		ASEProject.AnalyzesTask modelElement = (ASEProject.AnalyzesTask) view.getElement();
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getVisualizationTask_2011OutgoingLinks(
			View view) {
		ASEProject.VisualizationTask modelElement = (ASEProject.VisualizationTask) view.getElement();
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getExportingTask_2012OutgoingLinks(View view) {
		ASEProject.ExportingTask modelElement = (ASEProject.ExportingTask) view.getElement();
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getImport_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getUserDefined_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getPredefined_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getDescriptive_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getClassification_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getPredictive_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getClustering_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getExport_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getDataflow_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ASEProject.diagram.part.ASEProjectLinkDescriptor> getContainedTypeModelFacetLinks_Dataflow_4002(
			ASEProject.Pipeline container) {
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		for (Iterator<?> links = container.getDataflows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ASEProject.Dataflow) {
				continue;
			}
			ASEProject.Dataflow link = (ASEProject.Dataflow) linkObject;
			if (ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID != ASEProject.diagram.part.ASEProjectVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ASEProject.Task dst = link.getIncoming();
			List sources = link.getPrevious();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ASEProject.Task) {
				continue;
			}
			ASEProject.Task src = (ASEProject.Task) theSource;
			result.add(new ASEProject.diagram.part.ASEProjectLinkDescriptor(src, dst, link,
					ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002,
					ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ASEProject.diagram.part.ASEProjectLinkDescriptor> getIncomingTypeModelFacetLinks_Dataflow_4002(
			ASEProject.Task target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ASEProject.ASEProjectPackage.eINSTANCE.getDataflow_Incoming()
					|| false == setting.getEObject() instanceof ASEProject.Dataflow) {
				continue;
			}
			ASEProject.Dataflow link = (ASEProject.Dataflow) setting.getEObject();
			if (ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID != ASEProject.diagram.part.ASEProjectVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getPrevious();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ASEProject.Task) {
				continue;
			}
			ASEProject.Task src = (ASEProject.Task) theSource;
			result.add(new ASEProject.diagram.part.ASEProjectLinkDescriptor(src, target, link,
					ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002,
					ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ASEProject.diagram.part.ASEProjectLinkDescriptor> getOutgoingTypeModelFacetLinks_Dataflow_4002(
			ASEProject.Task source) {
		ASEProject.Pipeline container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ASEProject.Pipeline) {
				container = (ASEProject.Pipeline) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor> result = new LinkedList<ASEProject.diagram.part.ASEProjectLinkDescriptor>();
		for (Iterator<?> links = container.getDataflows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ASEProject.Dataflow) {
				continue;
			}
			ASEProject.Dataflow link = (ASEProject.Dataflow) linkObject;
			if (ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID != ASEProject.diagram.part.ASEProjectVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ASEProject.Task dst = link.getIncoming();
			List sources = link.getPrevious();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof ASEProject.Task) {
				continue;
			}
			ASEProject.Task src = (ASEProject.Task) theSource;
			if (src != source) {
				continue;
			}
			result.add(new ASEProject.diagram.part.ASEProjectLinkDescriptor(src, dst, link,
					ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002,
					ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
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

		public List<ASEProject.diagram.part.ASEProjectNodeDescriptor> getSemanticChildren(View view) {
			return ASEProjectDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getContainedLinks(View view) {
			return ASEProjectDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getIncomingLinks(View view) {
			return ASEProjectDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ASEProject.diagram.part.ASEProjectLinkDescriptor> getOutgoingLinks(View view) {
			return ASEProjectDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
