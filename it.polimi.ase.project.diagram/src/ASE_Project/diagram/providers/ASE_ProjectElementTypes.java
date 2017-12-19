/*
 * 
 */
package ASE_Project.diagram.providers;

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
public class ASE_ProjectElementTypes {

	/**
	* @generated
	*/
	private ASE_ProjectElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

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
	public static final IElementType CollectionTask_2001 = getElementType(
			"it.polimi.ase.project.diagram.CollectionTask_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IntegrationTask_2002 = getElementType(
			"it.polimi.ase.project.diagram.IntegrationTask_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CleaningTask_2003 = getElementType(
			"it.polimi.ase.project.diagram.CleaningTask_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AnalyzesTask_2004 = getElementType(
			"it.polimi.ase.project.diagram.AnalyzesTask_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType VisualizationTask_2005 = getElementType(
			"it.polimi.ase.project.diagram.VisualizationTask_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportingTask_2006 = getElementType(
			"it.polimi.ase.project.diagram.ExportingTask_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Import_3001 = getElementType("it.polimi.ase.project.diagram.Import_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserDefined_3002 = getElementType(
			"it.polimi.ase.project.diagram.UserDefined_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Predefined_3003 = getElementType("it.polimi.ase.project.diagram.Predefined_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Descriptive_3004 = getElementType(
			"it.polimi.ase.project.diagram.Descriptive_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Classification_3005 = getElementType(
			"it.polimi.ase.project.diagram.Classification_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Predictive_3006 = getElementType("it.polimi.ase.project.diagram.Predictive_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Clustering_3007 = getElementType("it.polimi.ase.project.diagram.Clustering_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Export_3008 = getElementType("it.polimi.ase.project.diagram.Export_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Dataflow_4001 = getElementType("it.polimi.ase.project.diagram.Dataflow_4001"); //$NON-NLS-1$

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

			elements.put(Pipeline_1000, ASE_Project.ASE_ProjectPackage.eINSTANCE.getPipeline());

			elements.put(CollectionTask_2001, ASE_Project.ASE_ProjectPackage.eINSTANCE.getCollectionTask());

			elements.put(IntegrationTask_2002, ASE_Project.ASE_ProjectPackage.eINSTANCE.getIntegrationTask());

			elements.put(CleaningTask_2003, ASE_Project.ASE_ProjectPackage.eINSTANCE.getCleaningTask());

			elements.put(AnalyzesTask_2004, ASE_Project.ASE_ProjectPackage.eINSTANCE.getAnalyzesTask());

			elements.put(VisualizationTask_2005, ASE_Project.ASE_ProjectPackage.eINSTANCE.getVisualizationTask());

			elements.put(ExportingTask_2006, ASE_Project.ASE_ProjectPackage.eINSTANCE.getExportingTask());

			elements.put(Import_3001, ASE_Project.ASE_ProjectPackage.eINSTANCE.getImport());

			elements.put(UserDefined_3002, ASE_Project.ASE_ProjectPackage.eINSTANCE.getUserDefined());

			elements.put(Predefined_3003, ASE_Project.ASE_ProjectPackage.eINSTANCE.getPredefined());

			elements.put(Descriptive_3004, ASE_Project.ASE_ProjectPackage.eINSTANCE.getDescriptive());

			elements.put(Classification_3005, ASE_Project.ASE_ProjectPackage.eINSTANCE.getClassification());

			elements.put(Predictive_3006, ASE_Project.ASE_ProjectPackage.eINSTANCE.getPredictive());

			elements.put(Clustering_3007, ASE_Project.ASE_ProjectPackage.eINSTANCE.getClustering());

			elements.put(Export_3008, ASE_Project.ASE_ProjectPackage.eINSTANCE.getExport());

			elements.put(Dataflow_4001, ASE_Project.ASE_ProjectPackage.eINSTANCE.getDataflow());
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
			KNOWN_ELEMENT_TYPES.add(CollectionTask_2001);
			KNOWN_ELEMENT_TYPES.add(IntegrationTask_2002);
			KNOWN_ELEMENT_TYPES.add(CleaningTask_2003);
			KNOWN_ELEMENT_TYPES.add(AnalyzesTask_2004);
			KNOWN_ELEMENT_TYPES.add(VisualizationTask_2005);
			KNOWN_ELEMENT_TYPES.add(ExportingTask_2006);
			KNOWN_ELEMENT_TYPES.add(Import_3001);
			KNOWN_ELEMENT_TYPES.add(UserDefined_3002);
			KNOWN_ELEMENT_TYPES.add(Predefined_3003);
			KNOWN_ELEMENT_TYPES.add(Descriptive_3004);
			KNOWN_ELEMENT_TYPES.add(Classification_3005);
			KNOWN_ELEMENT_TYPES.add(Predictive_3006);
			KNOWN_ELEMENT_TYPES.add(Clustering_3007);
			KNOWN_ELEMENT_TYPES.add(Export_3008);
			KNOWN_ELEMENT_TYPES.add(Dataflow_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			return Pipeline_1000;
		case ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			return CollectionTask_2001;
		case ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			return IntegrationTask_2002;
		case ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			return CleaningTask_2003;
		case ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			return AnalyzesTask_2004;
		case ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			return VisualizationTask_2005;
		case ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			return ExportingTask_2006;
		case ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			return Import_3001;
		case ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			return UserDefined_3002;
		case ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			return Predefined_3003;
		case ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			return Descriptive_3004;
		case ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			return Classification_3005;
		case ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			return Predictive_3006;
		case ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			return Clustering_3007;
		case ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			return Export_3008;
		case ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
			return Dataflow_4001;
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
			return ASE_Project.diagram.providers.ASE_ProjectElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return ASE_Project.diagram.providers.ASE_ProjectElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return ASE_Project.diagram.providers.ASE_ProjectElementTypes.getElement(elementTypeAdapter);
		}
	};

}
