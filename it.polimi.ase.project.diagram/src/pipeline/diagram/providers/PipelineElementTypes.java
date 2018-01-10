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
import pipeline.diagram.edit.parts.ExportOperationWriteEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.edit.parts.ImportOperationEditPart;
import pipeline.diagram.edit.parts.ImportOperationReadEditPart;
import pipeline.diagram.edit.parts.ImportOperationUseEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowEditPart;
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
