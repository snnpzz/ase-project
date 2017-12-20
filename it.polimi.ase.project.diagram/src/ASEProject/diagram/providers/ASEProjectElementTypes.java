/*
 * 
 */
package ASEProject.diagram.providers;

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

/**
 * @generated
 */
public class ASEProjectElementTypes {

	/**
	* @generated
	*/
	private ASEProjectElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

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
	public static final IElementType CollectionTask_2007 = getElementType(
			"it.polimi.ase.project.diagram.CollectionTask_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IntegrationTask_2008 = getElementType(
			"it.polimi.ase.project.diagram.IntegrationTask_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CleaningTask_2009 = getElementType(
			"it.polimi.ase.project.diagram.CleaningTask_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AnalyzesTask_2010 = getElementType(
			"it.polimi.ase.project.diagram.AnalyzesTask_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType VisualizationTask_2011 = getElementType(
			"it.polimi.ase.project.diagram.VisualizationTask_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportingTask_2012 = getElementType(
			"it.polimi.ase.project.diagram.ExportingTask_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Import_3009 = getElementType("it.polimi.ase.project.diagram.Import_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserDefined_3010 = getElementType(
			"it.polimi.ase.project.diagram.UserDefined_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Predefined_3011 = getElementType("it.polimi.ase.project.diagram.Predefined_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Descriptive_3012 = getElementType(
			"it.polimi.ase.project.diagram.Descriptive_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Classification_3013 = getElementType(
			"it.polimi.ase.project.diagram.Classification_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Predictive_3014 = getElementType("it.polimi.ase.project.diagram.Predictive_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Clustering_3015 = getElementType("it.polimi.ase.project.diagram.Clustering_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Export_3016 = getElementType("it.polimi.ase.project.diagram.Export_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Dataflow_4002 = getElementType("it.polimi.ase.project.diagram.Dataflow_4002"); //$NON-NLS-1$

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

			elements.put(Pipeline_1000, ASEProject.ASEProjectPackage.eINSTANCE.getPipeline());

			elements.put(CollectionTask_2007, ASEProject.ASEProjectPackage.eINSTANCE.getCollectionTask());

			elements.put(IntegrationTask_2008, ASEProject.ASEProjectPackage.eINSTANCE.getIntegrationTask());

			elements.put(CleaningTask_2009, ASEProject.ASEProjectPackage.eINSTANCE.getCleaningTask());

			elements.put(AnalyzesTask_2010, ASEProject.ASEProjectPackage.eINSTANCE.getAnalyzesTask());

			elements.put(VisualizationTask_2011, ASEProject.ASEProjectPackage.eINSTANCE.getVisualizationTask());

			elements.put(ExportingTask_2012, ASEProject.ASEProjectPackage.eINSTANCE.getExportingTask());

			elements.put(Import_3009, ASEProject.ASEProjectPackage.eINSTANCE.getImport());

			elements.put(UserDefined_3010, ASEProject.ASEProjectPackage.eINSTANCE.getUserDefined());

			elements.put(Predefined_3011, ASEProject.ASEProjectPackage.eINSTANCE.getPredefined());

			elements.put(Descriptive_3012, ASEProject.ASEProjectPackage.eINSTANCE.getDescriptive());

			elements.put(Classification_3013, ASEProject.ASEProjectPackage.eINSTANCE.getClassification());

			elements.put(Predictive_3014, ASEProject.ASEProjectPackage.eINSTANCE.getPredictive());

			elements.put(Clustering_3015, ASEProject.ASEProjectPackage.eINSTANCE.getClustering());

			elements.put(Export_3016, ASEProject.ASEProjectPackage.eINSTANCE.getExport());

			elements.put(Dataflow_4002, ASEProject.ASEProjectPackage.eINSTANCE.getDataflow());
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
			KNOWN_ELEMENT_TYPES.add(CollectionTask_2007);
			KNOWN_ELEMENT_TYPES.add(IntegrationTask_2008);
			KNOWN_ELEMENT_TYPES.add(CleaningTask_2009);
			KNOWN_ELEMENT_TYPES.add(AnalyzesTask_2010);
			KNOWN_ELEMENT_TYPES.add(VisualizationTask_2011);
			KNOWN_ELEMENT_TYPES.add(ExportingTask_2012);
			KNOWN_ELEMENT_TYPES.add(Import_3009);
			KNOWN_ELEMENT_TYPES.add(UserDefined_3010);
			KNOWN_ELEMENT_TYPES.add(Predefined_3011);
			KNOWN_ELEMENT_TYPES.add(Descriptive_3012);
			KNOWN_ELEMENT_TYPES.add(Classification_3013);
			KNOWN_ELEMENT_TYPES.add(Predictive_3014);
			KNOWN_ELEMENT_TYPES.add(Clustering_3015);
			KNOWN_ELEMENT_TYPES.add(Export_3016);
			KNOWN_ELEMENT_TYPES.add(Dataflow_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			return Pipeline_1000;
		case ASEProject.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			return CollectionTask_2007;
		case ASEProject.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			return IntegrationTask_2008;
		case ASEProject.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			return CleaningTask_2009;
		case ASEProject.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			return AnalyzesTask_2010;
		case ASEProject.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			return VisualizationTask_2011;
		case ASEProject.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			return ExportingTask_2012;
		case ASEProject.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			return Import_3009;
		case ASEProject.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			return UserDefined_3010;
		case ASEProject.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			return Predefined_3011;
		case ASEProject.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			return Descriptive_3012;
		case ASEProject.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			return Classification_3013;
		case ASEProject.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			return Predictive_3014;
		case ASEProject.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			return Clustering_3015;
		case ASEProject.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			return Export_3016;
		case ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
			return Dataflow_4002;
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
			return ASEProject.diagram.providers.ASEProjectElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return ASEProject.diagram.providers.ASEProjectElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return ASEProject.diagram.providers.ASEProjectElementTypes.getElement(elementTypeAdapter);
		}
	};

}
