/*
* 
*/
package pipeline.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import pipeline.DataFlow;
import pipeline.InternalDataFlow;
import pipeline.Pipeline;
import pipeline.Schema;
import pipeline.diagram.edit.parts.AnalysisTaskEditPart;
import pipeline.diagram.edit.parts.AnalysisTaskIDEditPart;
import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.ClassificationNameEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.CleaningTaskIDEditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.ClusteringNameEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.CollectionTaskIDEditPart;
import pipeline.diagram.edit.parts.ComplexAttribute2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeEditPart;
import pipeline.diagram.edit.parts.ComplexAttributeName2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeNameEditPart;
import pipeline.diagram.edit.parts.DataFlowEditPart;
import pipeline.diagram.edit.parts.DataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.DescriptiveNameEditPart;
import pipeline.diagram.edit.parts.ExportEditPart;
import pipeline.diagram.edit.parts.ExportExpUsesEditPart;
import pipeline.diagram.edit.parts.ExportNameEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.ExportTaskIDEditPart;
import pipeline.diagram.edit.parts.ExportWriteEditPart;
import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.edit.parts.FileNameEditPart;
import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.ImportImpUsesEditPart;
import pipeline.diagram.edit.parts.ImportNameEditPart;
import pipeline.diagram.edit.parts.ImportReadEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskIDEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
import pipeline.diagram.edit.parts.PredefinedEditPart;
import pipeline.diagram.edit.parts.PredefinedNameEditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.PredictiveNameEditPart;
import pipeline.diagram.edit.parts.SchemaEditPart;
import pipeline.diagram.edit.parts.SimpleAttribute2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeEditPart;
import pipeline.diagram.edit.parts.SimpleAttributeName2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeNameEditPart;
import pipeline.diagram.edit.parts.SourceEditPart;
import pipeline.diagram.edit.parts.SourceNameEditPart;
import pipeline.diagram.edit.parts.UserDefinedEditPart;
import pipeline.diagram.edit.parts.UserDefinedNameEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskIDEditPart;
import pipeline.diagram.part.PipelineDiagramEditorPlugin;
import pipeline.diagram.part.PipelineVisualIDRegistry;
import pipeline.diagram.providers.PipelineElementTypes;
import pipeline.diagram.providers.PipelineParserProvider;

/**
 * @generated
 */
public class PipelineNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		PipelineDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		PipelineDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PipelineNavigatorItem && !isOwnView(((PipelineNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof PipelineNavigatorGroup) {
			PipelineNavigatorGroup group = (PipelineNavigatorGroup) element;
			return PipelineDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof PipelineNavigatorItem) {
			PipelineNavigatorItem navigatorItem = (PipelineNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (PipelineVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.project.ase.polimi.it/pipeline?Pipeline", //$NON-NLS-1$
					PipelineElementTypes.Pipeline_1000);
		case CollectionTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?CollectionTask", //$NON-NLS-1$
					PipelineElementTypes.CollectionTask_2025);
		case IntegrationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?IntegrationTask", //$NON-NLS-1$
					PipelineElementTypes.IntegrationTask_2026);
		case CleaningTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?CleaningTask", //$NON-NLS-1$
					PipelineElementTypes.CleaningTask_2027);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?VisualizationTask", //$NON-NLS-1$
					PipelineElementTypes.VisualizationTask_2029);
		case AnalysisTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?AnalysisTask", //$NON-NLS-1$
					PipelineElementTypes.AnalysisTask_2031);
		case ExportTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?ExportTask", //$NON-NLS-1$
					PipelineElementTypes.ExportTask_2032);
		case SchemaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?Schema", //$NON-NLS-1$
					PipelineElementTypes.Schema_2043);
		case SourceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?Source", //$NON-NLS-1$
					PipelineElementTypes.Source_2044);
		case FileEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?File", //$NON-NLS-1$
					PipelineElementTypes.File_2045);
		case ImportEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Import", //$NON-NLS-1$
					PipelineElementTypes.Import_3025);
		case ExportEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Export", //$NON-NLS-1$
					PipelineElementTypes.Export_3037);
		case UserDefinedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?UserDefined", //$NON-NLS-1$
					PipelineElementTypes.UserDefined_3040);
		case PredefinedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Predefined", //$NON-NLS-1$
					PipelineElementTypes.Predefined_3041);
		case DescriptiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Descriptive", //$NON-NLS-1$
					PipelineElementTypes.Descriptive_3042);
		case ClassificationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Classification", //$NON-NLS-1$
					PipelineElementTypes.Classification_3043);
		case PredictiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Predictive", //$NON-NLS-1$
					PipelineElementTypes.Predictive_3044);
		case ClusteringEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Clustering", //$NON-NLS-1$
					PipelineElementTypes.Clustering_3045);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?SimpleAttribute", //$NON-NLS-1$
					PipelineElementTypes.SimpleAttribute_3046);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?ComplexAttribute", //$NON-NLS-1$
					PipelineElementTypes.ComplexAttribute_3047);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?SimpleAttribute", //$NON-NLS-1$
					PipelineElementTypes.SimpleAttribute_3048);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?ComplexAttribute", //$NON-NLS-1$
					PipelineElementTypes.ComplexAttribute_3049);
		case DataFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?DataFlow", //$NON-NLS-1$
					PipelineElementTypes.DataFlow_4005);
		case InternalDataFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?InternalDataFlow", //$NON-NLS-1$
					PipelineElementTypes.InternalDataFlow_4006);
		case ImportImpUsesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?Import?impUses", //$NON-NLS-1$
					PipelineElementTypes.ImportImpUses_4013);
		case ExportExpUsesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?Export?expUses", //$NON-NLS-1$
					PipelineElementTypes.ExportExpUses_4014);
		case DataFlowSchemaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?DataFlow?schema", //$NON-NLS-1$
					PipelineElementTypes.DataFlowSchema_4019);
		case InternalDataFlowSchemaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?InternalDataFlow?schema", //$NON-NLS-1$
					PipelineElementTypes.InternalDataFlowSchema_4020);
		case ImportReadEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?Import?read", //$NON-NLS-1$
					PipelineElementTypes.ImportRead_4021);
		case ExportWriteEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?Export?write", //$NON-NLS-1$
					PipelineElementTypes.ExportWrite_4022);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PipelineDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && PipelineElementTypes.isKnownElementType(elementType)) {
			image = PipelineElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof PipelineNavigatorGroup) {
			PipelineNavigatorGroup group = (PipelineNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PipelineNavigatorItem) {
			PipelineNavigatorItem navigatorItem = (PipelineNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (PipelineVisualIDRegistry.getVisualID(view)) {
		case PipelineEditPart.VISUAL_ID:
			return getPipeline_1000Text(view);
		case CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2025Text(view);
		case IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2026Text(view);
		case CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2027Text(view);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2029Text(view);
		case AnalysisTaskEditPart.VISUAL_ID:
			return getAnalysisTask_2031Text(view);
		case ExportTaskEditPart.VISUAL_ID:
			return getExportTask_2032Text(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2043Text(view);
		case SourceEditPart.VISUAL_ID:
			return getSource_2044Text(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2045Text(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_3025Text(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_3037Text(view);
		case UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3040Text(view);
		case PredefinedEditPart.VISUAL_ID:
			return getPredefined_3041Text(view);
		case DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3042Text(view);
		case ClassificationEditPart.VISUAL_ID:
			return getClassification_3043Text(view);
		case PredictiveEditPart.VISUAL_ID:
			return getPredictive_3044Text(view);
		case ClusteringEditPart.VISUAL_ID:
			return getClustering_3045Text(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_3046Text(view);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getComplexAttribute_3047Text(view);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getSimpleAttribute_3048Text(view);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getComplexAttribute_3049Text(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4005Text(view);
		case InternalDataFlowEditPart.VISUAL_ID:
			return getInternalDataFlow_4006Text(view);
		case ImportImpUsesEditPart.VISUAL_ID:
			return getImportImpUses_4013Text(view);
		case ExportExpUsesEditPart.VISUAL_ID:
			return getExportExpUses_4014Text(view);
		case DataFlowSchemaEditPart.VISUAL_ID:
			return getDataFlowSchema_4019Text(view);
		case InternalDataFlowSchemaEditPart.VISUAL_ID:
			return getInternalDataFlowSchema_4020Text(view);
		case ImportReadEditPart.VISUAL_ID:
			return getImportRead_4021Text(view);
		case ExportWriteEditPart.VISUAL_ID:
			return getExportWrite_4022Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getPipeline_1000Text(View view) {
		Pipeline domainModelElement = (Pipeline) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getID();
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCollectionTask_2025Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.CollectionTask_2025,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(CollectionTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIntegrationTask_2026Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.IntegrationTask_2026,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(IntegrationTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCleaningTask_2027Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.CleaningTask_2027,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(CleaningTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVisualizationTask_2029Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.VisualizationTask_2029,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(VisualizationTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnalysisTask_2031Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.AnalysisTask_2031,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(AnalysisTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExportTask_2032Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ExportTask_2032,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ExportTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSchema_2043Text(View view) {
		Schema domainModelElement = (Schema) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSource_2044Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Source_2044,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(SourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5096); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFile_2045Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.File_2045,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(FileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5097); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImport_3025Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Import_3025,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ImportNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExport_3037Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Export_3037,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ExportNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserDefined_3040Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.UserDefined_3040,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(UserDefinedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5090); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPredefined_3041Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Predefined_3041,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(PredefinedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5091); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDescriptive_3042Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Descriptive_3042,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(DescriptiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5092); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClassification_3043Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Classification_3043,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ClassificationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5093); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPredictive_3044Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Predictive_3044,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(PredictiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5094); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClustering_3045Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Clustering_3045,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ClusteringNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5095); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSimpleAttribute_3046Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.SimpleAttribute_3046,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(SimpleAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5098); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComplexAttribute_3047Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ComplexAttribute_3047,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ComplexAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5101); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSimpleAttribute_3048Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.SimpleAttribute_3048,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(SimpleAttributeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5099); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComplexAttribute_3049Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ComplexAttribute_3049,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ComplexAttributeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5100); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataFlow_4005Text(View view) {
		DataFlow domainModelElement = (DataFlow) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getFormat());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInternalDataFlow_4006Text(View view) {
		InternalDataFlow domainModelElement = (InternalDataFlow) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getFormat());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImportImpUses_4013Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ImportImpUses_4013,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExportExpUses_4014Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ExportExpUses_4014,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataFlowSchema_4019Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.DataFlowSchema_4019,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInternalDataFlowSchema_4020Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.InternalDataFlowSchema_4020,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImportRead_4021Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ImportRead_4021,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExportWrite_4022Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ExportWrite_4022,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return PipelineEditPart.MODEL_ID.equals(PipelineVisualIDRegistry.getModelID(view));
	}

}
