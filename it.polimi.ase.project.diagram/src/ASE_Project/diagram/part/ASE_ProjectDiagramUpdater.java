/*
* 
*/
package ASE_Project.diagram.part;

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
public class ASE_ProjectDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor> getSemanticChildren(View view) {
		switch (ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(view)) {
		case ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			return getPipeline_1000SemanticChildren(view);
		case ASE_Project.diagram.edit.parts.CollectionTaskCollectionTaskImportsCompartmentEditPart.VISUAL_ID:
			return getCollectionTaskCollectionTaskImportsCompartment_7001SemanticChildren(view);
		case ASE_Project.diagram.edit.parts.CleaningTaskCleaningTaskOperationsCompartmentEditPart.VISUAL_ID:
			return getCleaningTaskCleaningTaskOperationsCompartment_7002SemanticChildren(view);
		case ASE_Project.diagram.edit.parts.AnalyzesTaskAnalyzesTaskAnalyzesCompartmentEditPart.VISUAL_ID:
			return getAnalyzesTaskAnalyzesTaskAnalyzesCompartment_7003SemanticChildren(view);
		case ASE_Project.diagram.edit.parts.ExportingTaskExportingTaskExportsCompartmentEditPart.VISUAL_ID:
			return getExportingTaskExportingTaskExportsCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor> getPipeline_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ASE_Project.Pipeline modelElement = (ASE_Project.Pipeline) view.getElement();
		LinkedList<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTasks().iterator(); it.hasNext();) {
			ASE_Project.Task childElement = (ASE_Project.Task) it.next();
			int visualID = ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor> getCollectionTaskCollectionTaskImportsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ASE_Project.CollectionTask modelElement = (ASE_Project.CollectionTask) containerView.getElement();
		LinkedList<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getImports().iterator(); it.hasNext();) {
			ASE_Project.Import childElement = (ASE_Project.Import) it.next();
			int visualID = ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor> getCleaningTaskCleaningTaskOperationsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ASE_Project.CleaningTask modelElement = (ASE_Project.CleaningTask) containerView.getElement();
		LinkedList<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			ASE_Project.CleaningOp childElement = (ASE_Project.CleaningOp) it.next();
			int visualID = ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor> getAnalyzesTaskAnalyzesTaskAnalyzesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ASE_Project.AnalyzesTask modelElement = (ASE_Project.AnalyzesTask) containerView.getElement();
		LinkedList<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnalyzes().iterator(); it.hasNext();) {
			ASE_Project.AnalysisOp childElement = (ASE_Project.AnalysisOp) it.next();
			int visualID = ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor> getExportingTaskExportingTaskExportsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ASE_Project.ExportingTask modelElement = (ASE_Project.ExportingTask) containerView.getElement();
		LinkedList<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExports().iterator(); it.hasNext();) {
			ASE_Project.Export childElement = (ASE_Project.Export) it.next();
			int visualID = ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID) {
				result.add(new ASE_Project.diagram.part.ASE_ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getContainedLinks(View view) {
		switch (ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(view)) {
		case ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			return getPipeline_1000ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2001ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2002ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2003ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			return getAnalyzesTask_2004ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2005ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			return getExportingTask_2006ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			return getImport_3001ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3002ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			return getPredefined_3003ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3004ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			return getClassification_3005ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			return getPredictive_3006ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			return getClustering_3007ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			return getExport_3008ContainedLinks(view);
		case ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
			return getDataflow_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getIncomingLinks(View view) {
		switch (ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(view)) {
		case ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2001IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2002IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2003IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			return getAnalyzesTask_2004IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2005IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			return getExportingTask_2006IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			return getImport_3001IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3002IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			return getPredefined_3003IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3004IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			return getClassification_3005IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			return getPredictive_3006IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			return getClustering_3007IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			return getExport_3008IncomingLinks(view);
		case ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
			return getDataflow_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getOutgoingLinks(View view) {
		switch (ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(view)) {
		case ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2001OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2002OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2003OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			return getAnalyzesTask_2004OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2005OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			return getExportingTask_2006OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			return getImport_3001OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3002OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			return getPredefined_3003OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3004OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			return getClassification_3005OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			return getPredictive_3006OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			return getClustering_3007OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			return getExport_3008OutgoingLinks(view);
		case ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
			return getDataflow_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getPipeline_1000ContainedLinks(View view) {
		ASE_Project.Pipeline modelElement = (ASE_Project.Pipeline) view.getElement();
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Dataflow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getCollectionTask_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getIntegrationTask_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getCleaningTask_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getAnalyzesTask_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getVisualizationTask_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getExportingTask_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getImport_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getUserDefined_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getPredefined_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getDescriptive_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getClassification_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getPredictive_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getClustering_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getExport_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getDataflow_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getCollectionTask_2001IncomingLinks(
			View view) {
		ASE_Project.CollectionTask modelElement = (ASE_Project.CollectionTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getIntegrationTask_2002IncomingLinks(
			View view) {
		ASE_Project.IntegrationTask modelElement = (ASE_Project.IntegrationTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getCleaningTask_2003IncomingLinks(
			View view) {
		ASE_Project.CleaningTask modelElement = (ASE_Project.CleaningTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getAnalyzesTask_2004IncomingLinks(
			View view) {
		ASE_Project.AnalyzesTask modelElement = (ASE_Project.AnalyzesTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getVisualizationTask_2005IncomingLinks(
			View view) {
		ASE_Project.VisualizationTask modelElement = (ASE_Project.VisualizationTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getExportingTask_2006IncomingLinks(
			View view) {
		ASE_Project.ExportingTask modelElement = (ASE_Project.ExportingTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dataflow_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getImport_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getUserDefined_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getPredefined_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getDescriptive_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getClassification_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getPredictive_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getClustering_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getExport_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getDataflow_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getCollectionTask_2001OutgoingLinks(
			View view) {
		ASE_Project.CollectionTask modelElement = (ASE_Project.CollectionTask) view.getElement();
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getIntegrationTask_2002OutgoingLinks(
			View view) {
		ASE_Project.IntegrationTask modelElement = (ASE_Project.IntegrationTask) view.getElement();
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getCleaningTask_2003OutgoingLinks(
			View view) {
		ASE_Project.CleaningTask modelElement = (ASE_Project.CleaningTask) view.getElement();
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getAnalyzesTask_2004OutgoingLinks(
			View view) {
		ASE_Project.AnalyzesTask modelElement = (ASE_Project.AnalyzesTask) view.getElement();
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getVisualizationTask_2005OutgoingLinks(
			View view) {
		ASE_Project.VisualizationTask modelElement = (ASE_Project.VisualizationTask) view.getElement();
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getExportingTask_2006OutgoingLinks(
			View view) {
		ASE_Project.ExportingTask modelElement = (ASE_Project.ExportingTask) view.getElement();
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dataflow_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getImport_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getUserDefined_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getPredefined_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getDescriptive_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getClassification_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getPredictive_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getClustering_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getExport_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getDataflow_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getContainedTypeModelFacetLinks_Dataflow_4001(
			ASE_Project.Pipeline container) {
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		for (Iterator<?> links = container.getDataflows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ASE_Project.Dataflow) {
				continue;
			}
			ASE_Project.Dataflow link = (ASE_Project.Dataflow) linkObject;
			if (ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID != ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ASE_Project.Task dst = link.getTarget();
			ASE_Project.Task src = link.getSource();
			result.add(new ASE_Project.diagram.part.ASE_ProjectLinkDescriptor(src, dst, link,
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001,
					ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getIncomingTypeModelFacetLinks_Dataflow_4001(
			ASE_Project.Task target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ASE_Project.ASE_ProjectPackage.eINSTANCE.getDataflow_Target()
					|| false == setting.getEObject() instanceof ASE_Project.Dataflow) {
				continue;
			}
			ASE_Project.Dataflow link = (ASE_Project.Dataflow) setting.getEObject();
			if (ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID != ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ASE_Project.Task src = link.getSource();
			result.add(new ASE_Project.diagram.part.ASE_ProjectLinkDescriptor(src, target, link,
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001,
					ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getOutgoingTypeModelFacetLinks_Dataflow_4001(
			ASE_Project.Task source) {
		ASE_Project.Pipeline container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ASE_Project.Pipeline) {
				container = (ASE_Project.Pipeline) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> result = new LinkedList<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor>();
		for (Iterator<?> links = container.getDataflows().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ASE_Project.Dataflow) {
				continue;
			}
			ASE_Project.Dataflow link = (ASE_Project.Dataflow) linkObject;
			if (ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID != ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ASE_Project.Task dst = link.getTarget();
			ASE_Project.Task src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ASE_Project.diagram.part.ASE_ProjectLinkDescriptor(src, dst, link,
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001,
					ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID));
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

		public List<ASE_Project.diagram.part.ASE_ProjectNodeDescriptor> getSemanticChildren(View view) {
			return ASE_ProjectDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getContainedLinks(View view) {
			return ASE_ProjectDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getIncomingLinks(View view) {
			return ASE_ProjectDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ASE_Project.diagram.part.ASE_ProjectLinkDescriptor> getOutgoingLinks(View view) {
			return ASE_ProjectDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
