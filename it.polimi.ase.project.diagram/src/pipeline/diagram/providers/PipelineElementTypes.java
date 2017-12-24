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
import pipeline.diagram.edit.parts.PLEditPart;
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
	public static final IElementType PL_1000 = getElementType("it.polimi.ase.project.diagram.PL_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CollectionTask_2013 = getElementType(
			"it.polimi.ase.project.diagram.CollectionTask_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IntegrationTask_2014 = getElementType(
			"it.polimi.ase.project.diagram.IntegrationTask_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CleaningTask_2015 = getElementType(
			"it.polimi.ase.project.diagram.CleaningTask_2015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AnalyzesTask_2016 = getElementType(
			"it.polimi.ase.project.diagram.AnalyzesTask_2016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType VisualizationTask_2017 = getElementType(
			"it.polimi.ase.project.diagram.VisualizationTask_2017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportingTask_2018 = getElementType(
			"it.polimi.ase.project.diagram.ExportingTask_2018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Import_3017 = getElementType("it.polimi.ase.project.diagram.Import_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserDefined_3018 = getElementType(
			"it.polimi.ase.project.diagram.UserDefined_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Predefined_3019 = getElementType("it.polimi.ase.project.diagram.Predefined_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Descriptive_3020 = getElementType(
			"it.polimi.ase.project.diagram.Descriptive_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Classification_3021 = getElementType(
			"it.polimi.ase.project.diagram.Classification_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Predictive_3022 = getElementType("it.polimi.ase.project.diagram.Predictive_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Clustering_3023 = getElementType("it.polimi.ase.project.diagram.Clustering_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Export_3024 = getElementType("it.polimi.ase.project.diagram.Export_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Dataflow_4003 = getElementType("it.polimi.ase.project.diagram.Dataflow_4003"); //$NON-NLS-1$

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

			elements.put(PL_1000, PipelinePackage.eINSTANCE.getPL());

			elements.put(CollectionTask_2013, PipelinePackage.eINSTANCE.getCollectionTask());

			elements.put(IntegrationTask_2014, PipelinePackage.eINSTANCE.getIntegrationTask());

			elements.put(CleaningTask_2015, PipelinePackage.eINSTANCE.getCleaningTask());

			elements.put(AnalyzesTask_2016, PipelinePackage.eINSTANCE.getAnalyzesTask());

			elements.put(VisualizationTask_2017, PipelinePackage.eINSTANCE.getVisualizationTask());

			elements.put(ExportingTask_2018, PipelinePackage.eINSTANCE.getExportingTask());

			elements.put(Import_3017, PipelinePackage.eINSTANCE.getImport());

			elements.put(UserDefined_3018, PipelinePackage.eINSTANCE.getUserDefined());

			elements.put(Predefined_3019, PipelinePackage.eINSTANCE.getPredefined());

			elements.put(Descriptive_3020, PipelinePackage.eINSTANCE.getDescriptive());

			elements.put(Classification_3021, PipelinePackage.eINSTANCE.getClassification());

			elements.put(Predictive_3022, PipelinePackage.eINSTANCE.getPredictive());

			elements.put(Clustering_3023, PipelinePackage.eINSTANCE.getClustering());

			elements.put(Export_3024, PipelinePackage.eINSTANCE.getExport());

			elements.put(Dataflow_4003, PipelinePackage.eINSTANCE.getDataflow());
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
			KNOWN_ELEMENT_TYPES.add(PL_1000);
			KNOWN_ELEMENT_TYPES.add(CollectionTask_2013);
			KNOWN_ELEMENT_TYPES.add(IntegrationTask_2014);
			KNOWN_ELEMENT_TYPES.add(CleaningTask_2015);
			KNOWN_ELEMENT_TYPES.add(AnalyzesTask_2016);
			KNOWN_ELEMENT_TYPES.add(VisualizationTask_2017);
			KNOWN_ELEMENT_TYPES.add(ExportingTask_2018);
			KNOWN_ELEMENT_TYPES.add(Import_3017);
			KNOWN_ELEMENT_TYPES.add(UserDefined_3018);
			KNOWN_ELEMENT_TYPES.add(Predefined_3019);
			KNOWN_ELEMENT_TYPES.add(Descriptive_3020);
			KNOWN_ELEMENT_TYPES.add(Classification_3021);
			KNOWN_ELEMENT_TYPES.add(Predictive_3022);
			KNOWN_ELEMENT_TYPES.add(Clustering_3023);
			KNOWN_ELEMENT_TYPES.add(Export_3024);
			KNOWN_ELEMENT_TYPES.add(Dataflow_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PLEditPart.VISUAL_ID:
			return PL_1000;
		case CollectionTaskEditPart.VISUAL_ID:
			return CollectionTask_2013;
		case IntegrationTaskEditPart.VISUAL_ID:
			return IntegrationTask_2014;
		case CleaningTaskEditPart.VISUAL_ID:
			return CleaningTask_2015;
		case AnalyzesTaskEditPart.VISUAL_ID:
			return AnalyzesTask_2016;
		case VisualizationTaskEditPart.VISUAL_ID:
			return VisualizationTask_2017;
		case ExportingTaskEditPart.VISUAL_ID:
			return ExportingTask_2018;
		case ImportEditPart.VISUAL_ID:
			return Import_3017;
		case UserDefinedEditPart.VISUAL_ID:
			return UserDefined_3018;
		case PredefinedEditPart.VISUAL_ID:
			return Predefined_3019;
		case DescriptiveEditPart.VISUAL_ID:
			return Descriptive_3020;
		case ClassificationEditPart.VISUAL_ID:
			return Classification_3021;
		case PredictiveEditPart.VISUAL_ID:
			return Predictive_3022;
		case ClusteringEditPart.VISUAL_ID:
			return Clustering_3023;
		case ExportEditPart.VISUAL_ID:
			return Export_3024;
		case DataflowEditPart.VISUAL_ID:
			return Dataflow_4003;
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
