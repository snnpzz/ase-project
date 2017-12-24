/*
 * 
 */
package pipeline.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import pipeline.PipelinePackage;
import pipeline.diagram.edit.parts.AnalyzesTaskEditPart;
import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.DataflowEditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.ExportEditPart;
import pipeline.diagram.edit.parts.ExportingTaskEditPart;
import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
import pipeline.diagram.edit.parts.PredefinedEditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.UserDefinedEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskEditPart;
import pipeline.diagram.part.PipelineDiagramEditorPlugin;

/**
 * @generated
 */
public class PipelineElementTypes {

	/**
	* @generated
	*/
	private PipelineElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			PipelineDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Pipeline_1000 = getElementType("it.polimi.ase.project.diagram.Pipeline_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CollectionTask_2025 = getElementType(
			"it.polimi.ase.project.diagram.CollectionTask_2025"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType IntegrationTask_2026 = getElementType(
			"it.polimi.ase.project.diagram.IntegrationTask_2026"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType CleaningTask_2027 = getElementType(
			"it.polimi.ase.project.diagram.CleaningTask_2027"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType AnalyzesTask_2028 = getElementType(
			"it.polimi.ase.project.diagram.AnalyzesTask_2028"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType VisualizationTask_2029 = getElementType(
			"it.polimi.ase.project.diagram.VisualizationTask_2029"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ExportingTask_2030 = getElementType(
			"it.polimi.ase.project.diagram.ExportingTask_2030"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Import_3025 = getElementType("it.polimi.ase.project.diagram.Import_3025"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType UserDefined_3026 = getElementType(
			"it.polimi.ase.project.diagram.UserDefined_3026"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Predefined_3027 = getElementType("it.polimi.ase.project.diagram.Predefined_3027"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Descriptive_3028 = getElementType(
			"it.polimi.ase.project.diagram.Descriptive_3028"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Classification_3029 = getElementType(
			"it.polimi.ase.project.diagram.Classification_3029"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Predictive_3030 = getElementType("it.polimi.ase.project.diagram.Predictive_3030"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Clustering_3031 = getElementType("it.polimi.ase.project.diagram.Clustering_3031"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Export_3032 = getElementType("it.polimi.ase.project.diagram.Export_3032"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Dataflow_4004 = getElementType("it.polimi.ase.project.diagram.Dataflow_4004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Pipeline_1000, PipelinePackage.eINSTANCE.getPipeline());

			elements.put(CollectionTask_2025, PipelinePackage.eINSTANCE.getCollectionTask());

			elements.put(IntegrationTask_2026, PipelinePackage.eINSTANCE.getIntegrationTask());

			elements.put(CleaningTask_2027, PipelinePackage.eINSTANCE.getCleaningTask());

			elements.put(AnalyzesTask_2028, PipelinePackage.eINSTANCE.getAnalyzesTask());

			elements.put(VisualizationTask_2029, PipelinePackage.eINSTANCE.getVisualizationTask());

			elements.put(ExportingTask_2030, PipelinePackage.eINSTANCE.getExportingTask());

			elements.put(Import_3025, PipelinePackage.eINSTANCE.getImport());

			elements.put(UserDefined_3026, PipelinePackage.eINSTANCE.getUserDefined());

			elements.put(Predefined_3027, PipelinePackage.eINSTANCE.getPredefined());

			elements.put(Descriptive_3028, PipelinePackage.eINSTANCE.getDescriptive());

			elements.put(Classification_3029, PipelinePackage.eINSTANCE.getClassification());

			elements.put(Predictive_3030, PipelinePackage.eINSTANCE.getPredictive());

			elements.put(Clustering_3031, PipelinePackage.eINSTANCE.getClustering());

			elements.put(Export_3032, PipelinePackage.eINSTANCE.getExport());

			elements.put(Dataflow_4004, PipelinePackage.eINSTANCE.getDataflow());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Pipeline_1000);
			KNOWN_ELEMENT_TYPES.add(CollectionTask_2025);
			KNOWN_ELEMENT_TYPES.add(IntegrationTask_2026);
			KNOWN_ELEMENT_TYPES.add(CleaningTask_2027);
			KNOWN_ELEMENT_TYPES.add(AnalyzesTask_2028);
			KNOWN_ELEMENT_TYPES.add(VisualizationTask_2029);
			KNOWN_ELEMENT_TYPES.add(ExportingTask_2030);
			KNOWN_ELEMENT_TYPES.add(Import_3025);
			KNOWN_ELEMENT_TYPES.add(UserDefined_3026);
			KNOWN_ELEMENT_TYPES.add(Predefined_3027);
			KNOWN_ELEMENT_TYPES.add(Descriptive_3028);
			KNOWN_ELEMENT_TYPES.add(Classification_3029);
			KNOWN_ELEMENT_TYPES.add(Predictive_3030);
			KNOWN_ELEMENT_TYPES.add(Clustering_3031);
			KNOWN_ELEMENT_TYPES.add(Export_3032);
			KNOWN_ELEMENT_TYPES.add(Dataflow_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PipelineEditPart.VISUAL_ID:
			return Pipeline_1000;
		case CollectionTaskEditPart.VISUAL_ID:
			return CollectionTask_2025;
		case IntegrationTaskEditPart.VISUAL_ID:
			return IntegrationTask_2026;
		case CleaningTaskEditPart.VISUAL_ID:
			return CleaningTask_2027;
		case AnalyzesTaskEditPart.VISUAL_ID:
			return AnalyzesTask_2028;
		case VisualizationTaskEditPart.VISUAL_ID:
			return VisualizationTask_2029;
		case ExportingTaskEditPart.VISUAL_ID:
			return ExportingTask_2030;
		case ImportEditPart.VISUAL_ID:
			return Import_3025;
		case UserDefinedEditPart.VISUAL_ID:
			return UserDefined_3026;
		case PredefinedEditPart.VISUAL_ID:
			return Predefined_3027;
		case DescriptiveEditPart.VISUAL_ID:
			return Descriptive_3028;
		case ClassificationEditPart.VISUAL_ID:
			return Classification_3029;
		case PredictiveEditPart.VISUAL_ID:
			return Predictive_3030;
		case ClusteringEditPart.VISUAL_ID:
			return Clustering_3031;
		case ExportEditPart.VISUAL_ID:
			return Export_3032;
		case DataflowEditPart.VISUAL_ID:
			return Dataflow_4004;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return pipeline.diagram.providers.PipelineElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return pipeline.diagram.providers.PipelineElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return pipeline.diagram.providers.PipelineElementTypes.getElement(elementTypeAdapter);
		}
	};

}
