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
import pipeline.diagram.edit.parts.AnalysisTaskEditPart;
import pipeline.diagram.edit.parts.Attribute2EditPart;
import pipeline.diagram.edit.parts.AttributeEditPart;
import pipeline.diagram.edit.parts.Classification2EditPart;
import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.Clustering2EditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.DataFlowDFschemaEditPart;
import pipeline.diagram.edit.parts.DataFlowEditPart;
import pipeline.diagram.edit.parts.Descriptive2EditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.ExportEditPart;
import pipeline.diagram.edit.parts.ExportExpUsesEditPart;
import pipeline.diagram.edit.parts.ExportGeneratesEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.ImportImpUsesEditPart;
import pipeline.diagram.edit.parts.ImportReadsFromEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowIntDFschemaEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
import pipeline.diagram.edit.parts.Predefined2EditPart;
import pipeline.diagram.edit.parts.PredefinedEditPart;
import pipeline.diagram.edit.parts.Predictive2EditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.SchemaEditPart;
import pipeline.diagram.edit.parts.SourceEditPart;
import pipeline.diagram.edit.parts.UserDefined2EditPart;
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
	public static final IElementType UserDefined_2033 = getElementType(
			"it.polimi.ase.project.diagram.UserDefined_2033"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Descriptive_2034 = getElementType(
			"it.polimi.ase.project.diagram.Descriptive_2034"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Classification_2035 = getElementType(
			"it.polimi.ase.project.diagram.Classification_2035"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Predictive_2036 = getElementType("it.polimi.ase.project.diagram.Predictive_2036"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Clustering_2037 = getElementType("it.polimi.ase.project.diagram.Clustering_2037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Predefined_2038 = getElementType("it.polimi.ase.project.diagram.Predefined_2038"); //$NON-NLS-1$
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
	public static final IElementType AnalysisTask_2031 = getElementType(
			"it.polimi.ase.project.diagram.AnalysisTask_2031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType VisualizationTask_2029 = getElementType(
			"it.polimi.ase.project.diagram.VisualizationTask_2029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportTask_2032 = getElementType("it.polimi.ase.project.diagram.ExportTask_2032"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Source_2041 = getElementType("it.polimi.ase.project.diagram.Source_2041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType File_2042 = getElementType("it.polimi.ase.project.diagram.File_2042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Schema_2043 = getElementType("it.polimi.ase.project.diagram.Schema_2043"); //$NON-NLS-1$
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
	public static final IElementType Descriptive_3033 = getElementType(
			"it.polimi.ase.project.diagram.Descriptive_3033"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Classification_3034 = getElementType(
			"it.polimi.ase.project.diagram.Classification_3034"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Predictive_3035 = getElementType("it.polimi.ase.project.diagram.Predictive_3035"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Clustering_3036 = getElementType("it.polimi.ase.project.diagram.Clustering_3036"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Export_3037 = getElementType("it.polimi.ase.project.diagram.Export_3037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attribute_3038 = getElementType("it.polimi.ase.project.diagram.Attribute_3038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attribute_3039 = getElementType("it.polimi.ase.project.diagram.Attribute_3039"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataFlow_4005 = getElementType("it.polimi.ase.project.diagram.DataFlow_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InternalDataFlow_4006 = getElementType(
			"it.polimi.ase.project.diagram.InternalDataFlow_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataFlowDFschema_4017 = getElementType(
			"it.polimi.ase.project.diagram.DataFlowDFschema_4017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InternalDataFlowIntDFschema_4018 = getElementType(
			"it.polimi.ase.project.diagram.InternalDataFlowIntDFschema_4018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ImportReadsFrom_4007 = getElementType(
			"it.polimi.ase.project.diagram.ImportReadsFrom_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ImportImpUses_4013 = getElementType(
			"it.polimi.ase.project.diagram.ImportImpUses_4013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportGenerates_4008 = getElementType(
			"it.polimi.ase.project.diagram.ExportGenerates_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportExpUses_4014 = getElementType(
			"it.polimi.ase.project.diagram.ExportExpUses_4014"); //$NON-NLS-1$

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

			elements.put(UserDefined_2033, PipelinePackage.eINSTANCE.getUserDefined());

			elements.put(Descriptive_2034, PipelinePackage.eINSTANCE.getDescriptive());

			elements.put(Classification_2035, PipelinePackage.eINSTANCE.getClassification());

			elements.put(Predictive_2036, PipelinePackage.eINSTANCE.getPredictive());

			elements.put(Clustering_2037, PipelinePackage.eINSTANCE.getClustering());

			elements.put(Predefined_2038, PipelinePackage.eINSTANCE.getPredefined());

			elements.put(CollectionTask_2025, PipelinePackage.eINSTANCE.getCollectionTask());

			elements.put(IntegrationTask_2026, PipelinePackage.eINSTANCE.getIntegrationTask());

			elements.put(CleaningTask_2027, PipelinePackage.eINSTANCE.getCleaningTask());

			elements.put(AnalysisTask_2031, PipelinePackage.eINSTANCE.getAnalysisTask());

			elements.put(VisualizationTask_2029, PipelinePackage.eINSTANCE.getVisualizationTask());

			elements.put(ExportTask_2032, PipelinePackage.eINSTANCE.getExportTask());

			elements.put(Source_2041, PipelinePackage.eINSTANCE.getSource());

			elements.put(File_2042, PipelinePackage.eINSTANCE.getFile());

			elements.put(Schema_2043, PipelinePackage.eINSTANCE.getSchema());

			elements.put(Import_3025, PipelinePackage.eINSTANCE.getImport());

			elements.put(UserDefined_3026, PipelinePackage.eINSTANCE.getUserDefined());

			elements.put(Predefined_3027, PipelinePackage.eINSTANCE.getPredefined());

			elements.put(Descriptive_3033, PipelinePackage.eINSTANCE.getDescriptive());

			elements.put(Classification_3034, PipelinePackage.eINSTANCE.getClassification());

			elements.put(Predictive_3035, PipelinePackage.eINSTANCE.getPredictive());

			elements.put(Clustering_3036, PipelinePackage.eINSTANCE.getClustering());

			elements.put(Export_3037, PipelinePackage.eINSTANCE.getExport());

			elements.put(Attribute_3038, PipelinePackage.eINSTANCE.getAttribute());

			elements.put(Attribute_3039, PipelinePackage.eINSTANCE.getAttribute());

			elements.put(DataFlow_4005, PipelinePackage.eINSTANCE.getDataFlow());

			elements.put(InternalDataFlow_4006, PipelinePackage.eINSTANCE.getInternalDataFlow());

			elements.put(DataFlowDFschema_4017, PipelinePackage.eINSTANCE.getDataFlow_DFschema());

			elements.put(InternalDataFlowIntDFschema_4018, PipelinePackage.eINSTANCE.getInternalDataFlow_IntDFschema());

			elements.put(ImportReadsFrom_4007, PipelinePackage.eINSTANCE.getImport_ReadsFrom());

			elements.put(ImportImpUses_4013, PipelinePackage.eINSTANCE.getImport_ImpUses());

			elements.put(ExportGenerates_4008, PipelinePackage.eINSTANCE.getExport_Generates());

			elements.put(ExportExpUses_4014, PipelinePackage.eINSTANCE.getExport_ExpUses());
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
			KNOWN_ELEMENT_TYPES.add(UserDefined_2033);
			KNOWN_ELEMENT_TYPES.add(Descriptive_2034);
			KNOWN_ELEMENT_TYPES.add(Classification_2035);
			KNOWN_ELEMENT_TYPES.add(Predictive_2036);
			KNOWN_ELEMENT_TYPES.add(Clustering_2037);
			KNOWN_ELEMENT_TYPES.add(Predefined_2038);
			KNOWN_ELEMENT_TYPES.add(CollectionTask_2025);
			KNOWN_ELEMENT_TYPES.add(IntegrationTask_2026);
			KNOWN_ELEMENT_TYPES.add(CleaningTask_2027);
			KNOWN_ELEMENT_TYPES.add(AnalysisTask_2031);
			KNOWN_ELEMENT_TYPES.add(VisualizationTask_2029);
			KNOWN_ELEMENT_TYPES.add(ExportTask_2032);
			KNOWN_ELEMENT_TYPES.add(Source_2041);
			KNOWN_ELEMENT_TYPES.add(File_2042);
			KNOWN_ELEMENT_TYPES.add(Schema_2043);
			KNOWN_ELEMENT_TYPES.add(Import_3025);
			KNOWN_ELEMENT_TYPES.add(UserDefined_3026);
			KNOWN_ELEMENT_TYPES.add(Predefined_3027);
			KNOWN_ELEMENT_TYPES.add(Descriptive_3033);
			KNOWN_ELEMENT_TYPES.add(Classification_3034);
			KNOWN_ELEMENT_TYPES.add(Predictive_3035);
			KNOWN_ELEMENT_TYPES.add(Clustering_3036);
			KNOWN_ELEMENT_TYPES.add(Export_3037);
			KNOWN_ELEMENT_TYPES.add(Attribute_3038);
			KNOWN_ELEMENT_TYPES.add(Attribute_3039);
			KNOWN_ELEMENT_TYPES.add(DataFlow_4005);
			KNOWN_ELEMENT_TYPES.add(InternalDataFlow_4006);
			KNOWN_ELEMENT_TYPES.add(DataFlowDFschema_4017);
			KNOWN_ELEMENT_TYPES.add(InternalDataFlowIntDFschema_4018);
			KNOWN_ELEMENT_TYPES.add(ImportReadsFrom_4007);
			KNOWN_ELEMENT_TYPES.add(ImportImpUses_4013);
			KNOWN_ELEMENT_TYPES.add(ExportGenerates_4008);
			KNOWN_ELEMENT_TYPES.add(ExportExpUses_4014);
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
		case UserDefinedEditPart.VISUAL_ID:
			return UserDefined_2033;
		case DescriptiveEditPart.VISUAL_ID:
			return Descriptive_2034;
		case ClassificationEditPart.VISUAL_ID:
			return Classification_2035;
		case PredictiveEditPart.VISUAL_ID:
			return Predictive_2036;
		case ClusteringEditPart.VISUAL_ID:
			return Clustering_2037;
		case PredefinedEditPart.VISUAL_ID:
			return Predefined_2038;
		case CollectionTaskEditPart.VISUAL_ID:
			return CollectionTask_2025;
		case IntegrationTaskEditPart.VISUAL_ID:
			return IntegrationTask_2026;
		case CleaningTaskEditPart.VISUAL_ID:
			return CleaningTask_2027;
		case AnalysisTaskEditPart.VISUAL_ID:
			return AnalysisTask_2031;
		case VisualizationTaskEditPart.VISUAL_ID:
			return VisualizationTask_2029;
		case ExportTaskEditPart.VISUAL_ID:
			return ExportTask_2032;
		case SourceEditPart.VISUAL_ID:
			return Source_2041;
		case FileEditPart.VISUAL_ID:
			return File_2042;
		case SchemaEditPart.VISUAL_ID:
			return Schema_2043;
		case ImportEditPart.VISUAL_ID:
			return Import_3025;
		case UserDefined2EditPart.VISUAL_ID:
			return UserDefined_3026;
		case Predefined2EditPart.VISUAL_ID:
			return Predefined_3027;
		case Descriptive2EditPart.VISUAL_ID:
			return Descriptive_3033;
		case Classification2EditPart.VISUAL_ID:
			return Classification_3034;
		case Predictive2EditPart.VISUAL_ID:
			return Predictive_3035;
		case Clustering2EditPart.VISUAL_ID:
			return Clustering_3036;
		case ExportEditPart.VISUAL_ID:
			return Export_3037;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_3038;
		case Attribute2EditPart.VISUAL_ID:
			return Attribute_3039;
		case DataFlowEditPart.VISUAL_ID:
			return DataFlow_4005;
		case InternalDataFlowEditPart.VISUAL_ID:
			return InternalDataFlow_4006;
		case DataFlowDFschemaEditPart.VISUAL_ID:
			return DataFlowDFschema_4017;
		case InternalDataFlowIntDFschemaEditPart.VISUAL_ID:
			return InternalDataFlowIntDFschema_4018;
		case ImportReadsFromEditPart.VISUAL_ID:
			return ImportReadsFrom_4007;
		case ImportImpUsesEditPart.VISUAL_ID:
			return ImportImpUses_4013;
		case ExportGeneratesEditPart.VISUAL_ID:
			return ExportGenerates_4008;
		case ExportExpUsesEditPart.VISUAL_ID:
			return ExportExpUses_4014;
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
