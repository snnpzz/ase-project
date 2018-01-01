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
import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.ComplexAttribute2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeEditPart;
import pipeline.diagram.edit.parts.DataFlowEditPart;
import pipeline.diagram.edit.parts.DataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.ExportEditPart;
import pipeline.diagram.edit.parts.ExportExpUsesEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.ExportWriteEditPart;
import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.ImportImpUsesEditPart;
import pipeline.diagram.edit.parts.ImportReadEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
import pipeline.diagram.edit.parts.PredefinedCleaningOperationEditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.SchemaEditPart;
import pipeline.diagram.edit.parts.SimpleAttribute2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeEditPart;
import pipeline.diagram.edit.parts.SourceEditPart;
import pipeline.diagram.edit.parts.UserDefinedCleaningOperationEditPart;
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
	public static final IElementType Source_2044 = getElementType("it.polimi.ase.project.diagram.Source_2044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType File_2045 = getElementType("it.polimi.ase.project.diagram.File_2045"); //$NON-NLS-1$
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
	public static final IElementType UserDefinedCleaningOperation_3050 = getElementType(
			"it.polimi.ase.project.diagram.UserDefinedCleaningOperation_3050"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PredefinedCleaningOperation_3051 = getElementType(
			"it.polimi.ase.project.diagram.PredefinedCleaningOperation_3051"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Descriptive_3042 = getElementType(
			"it.polimi.ase.project.diagram.Descriptive_3042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Classification_3043 = getElementType(
			"it.polimi.ase.project.diagram.Classification_3043"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Predictive_3044 = getElementType("it.polimi.ase.project.diagram.Predictive_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Clustering_3045 = getElementType("it.polimi.ase.project.diagram.Clustering_3045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Export_3037 = getElementType("it.polimi.ase.project.diagram.Export_3037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SimpleAttribute_3046 = getElementType(
			"it.polimi.ase.project.diagram.SimpleAttribute_3046"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComplexAttribute_3047 = getElementType(
			"it.polimi.ase.project.diagram.ComplexAttribute_3047"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SimpleAttribute_3048 = getElementType(
			"it.polimi.ase.project.diagram.SimpleAttribute_3048"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComplexAttribute_3049 = getElementType(
			"it.polimi.ase.project.diagram.ComplexAttribute_3049"); //$NON-NLS-1$
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
	public static final IElementType DataFlowSchema_4019 = getElementType(
			"it.polimi.ase.project.diagram.DataFlowSchema_4019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InternalDataFlowSchema_4020 = getElementType(
			"it.polimi.ase.project.diagram.InternalDataFlowSchema_4020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ImportRead_4021 = getElementType("it.polimi.ase.project.diagram.ImportRead_4021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ImportImpUses_4013 = getElementType(
			"it.polimi.ase.project.diagram.ImportImpUses_4013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportWrite_4022 = getElementType(
			"it.polimi.ase.project.diagram.ExportWrite_4022"); //$NON-NLS-1$
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

			elements.put(CollectionTask_2025, PipelinePackage.eINSTANCE.getCollectionTask());

			elements.put(IntegrationTask_2026, PipelinePackage.eINSTANCE.getIntegrationTask());

			elements.put(CleaningTask_2027, PipelinePackage.eINSTANCE.getCleaningTask());

			elements.put(AnalysisTask_2031, PipelinePackage.eINSTANCE.getAnalysisTask());

			elements.put(VisualizationTask_2029, PipelinePackage.eINSTANCE.getVisualizationTask());

			elements.put(ExportTask_2032, PipelinePackage.eINSTANCE.getExportTask());

			elements.put(Source_2044, PipelinePackage.eINSTANCE.getSource());

			elements.put(File_2045, PipelinePackage.eINSTANCE.getFile());

			elements.put(Schema_2043, PipelinePackage.eINSTANCE.getSchema());

			elements.put(Import_3025, PipelinePackage.eINSTANCE.getImport());

			elements.put(UserDefinedCleaningOperation_3050,
					PipelinePackage.eINSTANCE.getUserDefinedCleaningOperation());

			elements.put(PredefinedCleaningOperation_3051, PipelinePackage.eINSTANCE.getPredefinedCleaningOperation());

			elements.put(Descriptive_3042, PipelinePackage.eINSTANCE.getDescriptive());

			elements.put(Classification_3043, PipelinePackage.eINSTANCE.getClassification());

			elements.put(Predictive_3044, PipelinePackage.eINSTANCE.getPredictive());

			elements.put(Clustering_3045, PipelinePackage.eINSTANCE.getClustering());

			elements.put(Export_3037, PipelinePackage.eINSTANCE.getExport());

			elements.put(SimpleAttribute_3046, PipelinePackage.eINSTANCE.getSimpleAttribute());

			elements.put(ComplexAttribute_3047, PipelinePackage.eINSTANCE.getComplexAttribute());

			elements.put(SimpleAttribute_3048, PipelinePackage.eINSTANCE.getSimpleAttribute());

			elements.put(ComplexAttribute_3049, PipelinePackage.eINSTANCE.getComplexAttribute());

			elements.put(DataFlow_4005, PipelinePackage.eINSTANCE.getDataFlow());

			elements.put(InternalDataFlow_4006, PipelinePackage.eINSTANCE.getInternalDataFlow());

			elements.put(DataFlowSchema_4019, PipelinePackage.eINSTANCE.getDataFlow_Schema());

			elements.put(InternalDataFlowSchema_4020, PipelinePackage.eINSTANCE.getInternalDataFlow_Schema());

			elements.put(ImportRead_4021, PipelinePackage.eINSTANCE.getImport_Read());

			elements.put(ImportImpUses_4013, PipelinePackage.eINSTANCE.getImport_ImpUses());

			elements.put(ExportWrite_4022, PipelinePackage.eINSTANCE.getExport_Write());

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
			KNOWN_ELEMENT_TYPES.add(CollectionTask_2025);
			KNOWN_ELEMENT_TYPES.add(IntegrationTask_2026);
			KNOWN_ELEMENT_TYPES.add(CleaningTask_2027);
			KNOWN_ELEMENT_TYPES.add(AnalysisTask_2031);
			KNOWN_ELEMENT_TYPES.add(VisualizationTask_2029);
			KNOWN_ELEMENT_TYPES.add(ExportTask_2032);
			KNOWN_ELEMENT_TYPES.add(Source_2044);
			KNOWN_ELEMENT_TYPES.add(File_2045);
			KNOWN_ELEMENT_TYPES.add(Schema_2043);
			KNOWN_ELEMENT_TYPES.add(Import_3025);
			KNOWN_ELEMENT_TYPES.add(UserDefinedCleaningOperation_3050);
			KNOWN_ELEMENT_TYPES.add(PredefinedCleaningOperation_3051);
			KNOWN_ELEMENT_TYPES.add(Descriptive_3042);
			KNOWN_ELEMENT_TYPES.add(Classification_3043);
			KNOWN_ELEMENT_TYPES.add(Predictive_3044);
			KNOWN_ELEMENT_TYPES.add(Clustering_3045);
			KNOWN_ELEMENT_TYPES.add(Export_3037);
			KNOWN_ELEMENT_TYPES.add(SimpleAttribute_3046);
			KNOWN_ELEMENT_TYPES.add(ComplexAttribute_3047);
			KNOWN_ELEMENT_TYPES.add(SimpleAttribute_3048);
			KNOWN_ELEMENT_TYPES.add(ComplexAttribute_3049);
			KNOWN_ELEMENT_TYPES.add(DataFlow_4005);
			KNOWN_ELEMENT_TYPES.add(InternalDataFlow_4006);
			KNOWN_ELEMENT_TYPES.add(DataFlowSchema_4019);
			KNOWN_ELEMENT_TYPES.add(InternalDataFlowSchema_4020);
			KNOWN_ELEMENT_TYPES.add(ImportRead_4021);
			KNOWN_ELEMENT_TYPES.add(ImportImpUses_4013);
			KNOWN_ELEMENT_TYPES.add(ExportWrite_4022);
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
			return Source_2044;
		case FileEditPart.VISUAL_ID:
			return File_2045;
		case SchemaEditPart.VISUAL_ID:
			return Schema_2043;
		case ImportEditPart.VISUAL_ID:
			return Import_3025;
		case UserDefinedCleaningOperationEditPart.VISUAL_ID:
			return UserDefinedCleaningOperation_3050;
		case PredefinedCleaningOperationEditPart.VISUAL_ID:
			return PredefinedCleaningOperation_3051;
		case DescriptiveEditPart.VISUAL_ID:
			return Descriptive_3042;
		case ClassificationEditPart.VISUAL_ID:
			return Classification_3043;
		case PredictiveEditPart.VISUAL_ID:
			return Predictive_3044;
		case ClusteringEditPart.VISUAL_ID:
			return Clustering_3045;
		case ExportEditPart.VISUAL_ID:
			return Export_3037;
		case SimpleAttributeEditPart.VISUAL_ID:
			return SimpleAttribute_3046;
		case ComplexAttributeEditPart.VISUAL_ID:
			return ComplexAttribute_3047;
		case SimpleAttribute2EditPart.VISUAL_ID:
			return SimpleAttribute_3048;
		case ComplexAttribute2EditPart.VISUAL_ID:
			return ComplexAttribute_3049;
		case DataFlowEditPart.VISUAL_ID:
			return DataFlow_4005;
		case InternalDataFlowEditPart.VISUAL_ID:
			return InternalDataFlow_4006;
		case DataFlowSchemaEditPart.VISUAL_ID:
			return DataFlowSchema_4019;
		case InternalDataFlowSchemaEditPart.VISUAL_ID:
			return InternalDataFlowSchema_4020;
		case ImportReadEditPart.VISUAL_ID:
			return ImportRead_4021;
		case ImportImpUsesEditPart.VISUAL_ID:
			return ImportImpUses_4013;
		case ExportWriteEditPart.VISUAL_ID:
			return ExportWrite_4022;
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
