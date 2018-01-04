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
import pipeline.diagram.edit.parts.ChartAxesEditPart;
import pipeline.diagram.edit.parts.ChartEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.ComplexAttribute2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeEditPart;
import pipeline.diagram.edit.parts.DataFlowEditPart;
import pipeline.diagram.edit.parts.DataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.ExportOperationEditPart;
import pipeline.diagram.edit.parts.ExportOperationUseEditPart;
import pipeline.diagram.edit.parts.ExportOperationWriteEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
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
import pipeline.diagram.edit.parts.SimpleAttribute2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeEditPart;
import pipeline.diagram.edit.parts.SourceEditPart;
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
	public static final IElementType AnalysisTask_2004 = getElementType(
			"it.polimi.ase.project.diagram.AnalysisTask_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType VisualizationTask_2005 = getElementType(
			"it.polimi.ase.project.diagram.VisualizationTask_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportTask_2006 = getElementType("it.polimi.ase.project.diagram.ExportTask_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Source_2007 = getElementType("it.polimi.ase.project.diagram.Source_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType File_2008 = getElementType("it.polimi.ase.project.diagram.File_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Schema_2009 = getElementType("it.polimi.ase.project.diagram.Schema_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Chart_2010 = getElementType("it.polimi.ase.project.diagram.Chart_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ImportOperation_3001 = getElementType(
			"it.polimi.ase.project.diagram.ImportOperation_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportOperation_3002 = getElementType(
			"it.polimi.ase.project.diagram.ExportOperation_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SimpleAttribute_3003 = getElementType(
			"it.polimi.ase.project.diagram.SimpleAttribute_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComplexAttribute_3004 = getElementType(
			"it.polimi.ase.project.diagram.ComplexAttribute_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SimpleAttribute_3005 = getElementType(
			"it.polimi.ase.project.diagram.SimpleAttribute_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComplexAttribute_3006 = getElementType(
			"it.polimi.ase.project.diagram.ComplexAttribute_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataFlow_4001 = getElementType("it.polimi.ase.project.diagram.DataFlow_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InternalDataFlow_4002 = getElementType(
			"it.polimi.ase.project.diagram.InternalDataFlow_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataFlowSchema_4003 = getElementType(
			"it.polimi.ase.project.diagram.DataFlowSchema_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InternalDataFlowSchema_4004 = getElementType(
			"it.polimi.ase.project.diagram.InternalDataFlowSchema_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IntegrationTaskAttributes_4005 = getElementType(
			"it.polimi.ase.project.diagram.IntegrationTaskAttributes_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ImportOperationRead_4006 = getElementType(
			"it.polimi.ase.project.diagram.ImportOperationRead_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ImportOperationUse_4007 = getElementType(
			"it.polimi.ase.project.diagram.ImportOperationUse_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportOperationUse_4008 = getElementType(
			"it.polimi.ase.project.diagram.ExportOperationUse_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExportOperationWrite_4009 = getElementType(
			"it.polimi.ase.project.diagram.ExportOperationWrite_4009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ChartAxes_4010 = getElementType("it.polimi.ase.project.diagram.ChartAxes_4010"); //$NON-NLS-1$

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

			elements.put(CollectionTask_2001, PipelinePackage.eINSTANCE.getCollectionTask());

			elements.put(IntegrationTask_2002, PipelinePackage.eINSTANCE.getIntegrationTask());

			elements.put(CleaningTask_2003, PipelinePackage.eINSTANCE.getCleaningTask());

			elements.put(AnalysisTask_2004, PipelinePackage.eINSTANCE.getAnalysisTask());

			elements.put(VisualizationTask_2005, PipelinePackage.eINSTANCE.getVisualizationTask());

			elements.put(ExportTask_2006, PipelinePackage.eINSTANCE.getExportTask());

			elements.put(Source_2007, PipelinePackage.eINSTANCE.getSource());

			elements.put(File_2008, PipelinePackage.eINSTANCE.getFile());

			elements.put(Schema_2009, PipelinePackage.eINSTANCE.getSchema());

			elements.put(Chart_2010, PipelinePackage.eINSTANCE.getChart());

			elements.put(ImportOperation_3001, PipelinePackage.eINSTANCE.getImportOperation());

			elements.put(ExportOperation_3002, PipelinePackage.eINSTANCE.getExportOperation());

			elements.put(SimpleAttribute_3003, PipelinePackage.eINSTANCE.getSimpleAttribute());

			elements.put(ComplexAttribute_3004, PipelinePackage.eINSTANCE.getComplexAttribute());

			elements.put(SimpleAttribute_3005, PipelinePackage.eINSTANCE.getSimpleAttribute());

			elements.put(ComplexAttribute_3006, PipelinePackage.eINSTANCE.getComplexAttribute());

			elements.put(DataFlow_4001, PipelinePackage.eINSTANCE.getDataFlow());

			elements.put(InternalDataFlow_4002, PipelinePackage.eINSTANCE.getInternalDataFlow());

			elements.put(DataFlowSchema_4003, PipelinePackage.eINSTANCE.getDataFlow_Schema());

			elements.put(InternalDataFlowSchema_4004, PipelinePackage.eINSTANCE.getInternalDataFlow_Schema());

			elements.put(IntegrationTaskAttributes_4005, PipelinePackage.eINSTANCE.getIntegrationTask_Attributes());

			elements.put(ImportOperationRead_4006, PipelinePackage.eINSTANCE.getImportOperation_Read());

			elements.put(ImportOperationUse_4007, PipelinePackage.eINSTANCE.getImportOperation_Use());

			elements.put(ExportOperationUse_4008, PipelinePackage.eINSTANCE.getExportOperation_Use());

			elements.put(ExportOperationWrite_4009, PipelinePackage.eINSTANCE.getExportOperation_Write());

			elements.put(ChartAxes_4010, PipelinePackage.eINSTANCE.getChart_Axes());
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
			KNOWN_ELEMENT_TYPES.add(AnalysisTask_2004);
			KNOWN_ELEMENT_TYPES.add(VisualizationTask_2005);
			KNOWN_ELEMENT_TYPES.add(ExportTask_2006);
			KNOWN_ELEMENT_TYPES.add(Source_2007);
			KNOWN_ELEMENT_TYPES.add(File_2008);
			KNOWN_ELEMENT_TYPES.add(Schema_2009);
			KNOWN_ELEMENT_TYPES.add(Chart_2010);
			KNOWN_ELEMENT_TYPES.add(ImportOperation_3001);
			KNOWN_ELEMENT_TYPES.add(ExportOperation_3002);
			KNOWN_ELEMENT_TYPES.add(SimpleAttribute_3003);
			KNOWN_ELEMENT_TYPES.add(ComplexAttribute_3004);
			KNOWN_ELEMENT_TYPES.add(SimpleAttribute_3005);
			KNOWN_ELEMENT_TYPES.add(ComplexAttribute_3006);
			KNOWN_ELEMENT_TYPES.add(DataFlow_4001);
			KNOWN_ELEMENT_TYPES.add(InternalDataFlow_4002);
			KNOWN_ELEMENT_TYPES.add(DataFlowSchema_4003);
			KNOWN_ELEMENT_TYPES.add(InternalDataFlowSchema_4004);
			KNOWN_ELEMENT_TYPES.add(IntegrationTaskAttributes_4005);
			KNOWN_ELEMENT_TYPES.add(ImportOperationRead_4006);
			KNOWN_ELEMENT_TYPES.add(ImportOperationUse_4007);
			KNOWN_ELEMENT_TYPES.add(ExportOperationUse_4008);
			KNOWN_ELEMENT_TYPES.add(ExportOperationWrite_4009);
			KNOWN_ELEMENT_TYPES.add(ChartAxes_4010);
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
			return CollectionTask_2001;
		case IntegrationTaskEditPart.VISUAL_ID:
			return IntegrationTask_2002;
		case CleaningTaskEditPart.VISUAL_ID:
			return CleaningTask_2003;
		case AnalysisTaskEditPart.VISUAL_ID:
			return AnalysisTask_2004;
		case VisualizationTaskEditPart.VISUAL_ID:
			return VisualizationTask_2005;
		case ExportTaskEditPart.VISUAL_ID:
			return ExportTask_2006;
		case SourceEditPart.VISUAL_ID:
			return Source_2007;
		case FileEditPart.VISUAL_ID:
			return File_2008;
		case SchemaEditPart.VISUAL_ID:
			return Schema_2009;
		case ChartEditPart.VISUAL_ID:
			return Chart_2010;
		case ImportOperationEditPart.VISUAL_ID:
			return ImportOperation_3001;
		case ExportOperationEditPart.VISUAL_ID:
			return ExportOperation_3002;
		case SimpleAttributeEditPart.VISUAL_ID:
			return SimpleAttribute_3003;
		case ComplexAttributeEditPart.VISUAL_ID:
			return ComplexAttribute_3004;
		case SimpleAttribute2EditPart.VISUAL_ID:
			return SimpleAttribute_3005;
		case ComplexAttribute2EditPart.VISUAL_ID:
			return ComplexAttribute_3006;
		case DataFlowEditPart.VISUAL_ID:
			return DataFlow_4001;
		case InternalDataFlowEditPart.VISUAL_ID:
			return InternalDataFlow_4002;
		case DataFlowSchemaEditPart.VISUAL_ID:
			return DataFlowSchema_4003;
		case InternalDataFlowSchemaEditPart.VISUAL_ID:
			return InternalDataFlowSchema_4004;
		case IntegrationTaskAttributesEditPart.VISUAL_ID:
			return IntegrationTaskAttributes_4005;
		case ImportOperationReadEditPart.VISUAL_ID:
			return ImportOperationRead_4006;
		case ImportOperationUseEditPart.VISUAL_ID:
			return ImportOperationUse_4007;
		case ExportOperationUseEditPart.VISUAL_ID:
			return ExportOperationUse_4008;
		case ExportOperationWriteEditPart.VISUAL_ID:
			return ExportOperationWrite_4009;
		case ChartAxesEditPart.VISUAL_ID:
			return ChartAxes_4010;
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
