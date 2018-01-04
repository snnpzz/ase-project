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
import pipeline.diagram.edit.parts.ChartAxesEditPart;
import pipeline.diagram.edit.parts.ChartEditPart;
import pipeline.diagram.edit.parts.ChartTitleEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.CleaningTaskIDEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.CollectionTaskIDEditPart;
import pipeline.diagram.edit.parts.ComplexAttribute2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeEditPart;
import pipeline.diagram.edit.parts.ComplexAttributeName2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeNameEditPart;
import pipeline.diagram.edit.parts.DataFlowEditPart;
import pipeline.diagram.edit.parts.DataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.ExportOperationEditPart;
import pipeline.diagram.edit.parts.ExportOperationIDEditPart;
import pipeline.diagram.edit.parts.ExportOperationUseEditPart;
import pipeline.diagram.edit.parts.ExportOperationWriteEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.ExportTaskIDEditPart;
import pipeline.diagram.edit.parts.FileEditPart;
import pipeline.diagram.edit.parts.FileNameEditPart;
import pipeline.diagram.edit.parts.ImportOperationEditPart;
import pipeline.diagram.edit.parts.ImportOperationIDEditPart;
import pipeline.diagram.edit.parts.ImportOperationReadEditPart;
import pipeline.diagram.edit.parts.ImportOperationUseEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskAttributesEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskIDEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowEditPart;
import pipeline.diagram.edit.parts.InternalDataFlowSchemaEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
import pipeline.diagram.edit.parts.SchemaEditPart;
import pipeline.diagram.edit.parts.SimpleAttribute2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeEditPart;
import pipeline.diagram.edit.parts.SimpleAttributeName2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeNameEditPart;
import pipeline.diagram.edit.parts.SourceEditPart;
import pipeline.diagram.edit.parts.SourceNameEditPart;
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
					PipelineElementTypes.CollectionTask_2001);
		case IntegrationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?IntegrationTask", //$NON-NLS-1$
					PipelineElementTypes.IntegrationTask_2002);
		case CleaningTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?CleaningTask", //$NON-NLS-1$
					PipelineElementTypes.CleaningTask_2003);
		case AnalysisTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?AnalysisTask", //$NON-NLS-1$
					PipelineElementTypes.AnalysisTask_2004);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?VisualizationTask", //$NON-NLS-1$
					PipelineElementTypes.VisualizationTask_2005);
		case ExportTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?ExportTask", //$NON-NLS-1$
					PipelineElementTypes.ExportTask_2006);
		case SourceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?Source", //$NON-NLS-1$
					PipelineElementTypes.Source_2007);
		case FileEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?File", //$NON-NLS-1$
					PipelineElementTypes.File_2008);
		case SchemaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?Schema", //$NON-NLS-1$
					PipelineElementTypes.Schema_2009);
		case ChartEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?Chart", //$NON-NLS-1$
					PipelineElementTypes.Chart_2010);
		case ImportOperationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?ImportOperation", //$NON-NLS-1$
					PipelineElementTypes.ImportOperation_3001);
		case ExportOperationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?ExportOperation", //$NON-NLS-1$
					PipelineElementTypes.ExportOperation_3002);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?SimpleAttribute", //$NON-NLS-1$
					PipelineElementTypes.SimpleAttribute_3003);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?ComplexAttribute", //$NON-NLS-1$
					PipelineElementTypes.ComplexAttribute_3004);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?SimpleAttribute", //$NON-NLS-1$
					PipelineElementTypes.SimpleAttribute_3005);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?ComplexAttribute", //$NON-NLS-1$
					PipelineElementTypes.ComplexAttribute_3006);
		case DataFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?DataFlow", //$NON-NLS-1$
					PipelineElementTypes.DataFlow_4001);
		case InternalDataFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?InternalDataFlow", //$NON-NLS-1$
					PipelineElementTypes.InternalDataFlow_4002);
		case DataFlowSchemaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?DataFlow?schema", //$NON-NLS-1$
					PipelineElementTypes.DataFlowSchema_4003);
		case InternalDataFlowSchemaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?InternalDataFlow?schema", //$NON-NLS-1$
					PipelineElementTypes.InternalDataFlowSchema_4004);
		case IntegrationTaskAttributesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?IntegrationTask?attributes", //$NON-NLS-1$
					PipelineElementTypes.IntegrationTaskAttributes_4005);
		case ImportOperationReadEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?ImportOperation?read", //$NON-NLS-1$
					PipelineElementTypes.ImportOperationRead_4006);
		case ImportOperationUseEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?ImportOperation?use", //$NON-NLS-1$
					PipelineElementTypes.ImportOperationUse_4007);
		case ExportOperationUseEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?ExportOperation?use", //$NON-NLS-1$
					PipelineElementTypes.ExportOperationUse_4008);
		case ExportOperationWriteEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?ExportOperation?write", //$NON-NLS-1$
					PipelineElementTypes.ExportOperationWrite_4009);
		case ChartAxesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?Chart?axes", //$NON-NLS-1$
					PipelineElementTypes.ChartAxes_4010);
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
			return getCollectionTask_2001Text(view);
		case IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2002Text(view);
		case CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2003Text(view);
		case AnalysisTaskEditPart.VISUAL_ID:
			return getAnalysisTask_2004Text(view);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2005Text(view);
		case ExportTaskEditPart.VISUAL_ID:
			return getExportTask_2006Text(view);
		case SourceEditPart.VISUAL_ID:
			return getSource_2007Text(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2008Text(view);
		case SchemaEditPart.VISUAL_ID:
			return getSchema_2009Text(view);
		case ChartEditPart.VISUAL_ID:
			return getChart_2010Text(view);
		case ImportOperationEditPart.VISUAL_ID:
			return getImportOperation_3001Text(view);
		case ExportOperationEditPart.VISUAL_ID:
			return getExportOperation_3002Text(view);
		case SimpleAttributeEditPart.VISUAL_ID:
			return getSimpleAttribute_3003Text(view);
		case ComplexAttributeEditPart.VISUAL_ID:
			return getComplexAttribute_3004Text(view);
		case SimpleAttribute2EditPart.VISUAL_ID:
			return getSimpleAttribute_3005Text(view);
		case ComplexAttribute2EditPart.VISUAL_ID:
			return getComplexAttribute_3006Text(view);
		case DataFlowEditPart.VISUAL_ID:
			return getDataFlow_4001Text(view);
		case InternalDataFlowEditPart.VISUAL_ID:
			return getInternalDataFlow_4002Text(view);
		case DataFlowSchemaEditPart.VISUAL_ID:
			return getDataFlowSchema_4003Text(view);
		case InternalDataFlowSchemaEditPart.VISUAL_ID:
			return getInternalDataFlowSchema_4004Text(view);
		case IntegrationTaskAttributesEditPart.VISUAL_ID:
			return getIntegrationTaskAttributes_4005Text(view);
		case ImportOperationReadEditPart.VISUAL_ID:
			return getImportOperationRead_4006Text(view);
		case ImportOperationUseEditPart.VISUAL_ID:
			return getImportOperationUse_4007Text(view);
		case ExportOperationUseEditPart.VISUAL_ID:
			return getExportOperationUse_4008Text(view);
		case ExportOperationWriteEditPart.VISUAL_ID:
			return getExportOperationWrite_4009Text(view);
		case ChartAxesEditPart.VISUAL_ID:
			return getChartAxes_4010Text(view);
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
	private String getCollectionTask_2001Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.CollectionTask_2001,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(CollectionTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIntegrationTask_2002Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.IntegrationTask_2002,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(IntegrationTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCleaningTask_2003Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.CleaningTask_2003,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(CleaningTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnalysisTask_2004Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.AnalysisTask_2004,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(AnalysisTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVisualizationTask_2005Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.VisualizationTask_2005,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(VisualizationTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExportTask_2006Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ExportTask_2006,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ExportTaskIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSource_2007Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Source_2007,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(SourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFile_2008Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.File_2008,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(FileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSchema_2009Text(View view) {
		Schema domainModelElement = (Schema) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getChart_2010Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Chart_2010,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ChartTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImportOperation_3001Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ImportOperation_3001,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ImportOperationIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExportOperation_3002Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ExportOperation_3002,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ExportOperationIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSimpleAttribute_3003Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.SimpleAttribute_3003,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(SimpleAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComplexAttribute_3004Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ComplexAttribute_3004,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ComplexAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSimpleAttribute_3005Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.SimpleAttribute_3005,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(SimpleAttributeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComplexAttribute_3006Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ComplexAttribute_3006,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ComplexAttributeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataFlow_4001Text(View view) {
		DataFlow domainModelElement = (DataFlow) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getFormat());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInternalDataFlow_4002Text(View view) {
		InternalDataFlow domainModelElement = (InternalDataFlow) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getFormat());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataFlowSchema_4003Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.DataFlowSchema_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInternalDataFlowSchema_4004Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.InternalDataFlowSchema_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIntegrationTaskAttributes_4005Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.IntegrationTaskAttributes_4005,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImportOperationRead_4006Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ImportOperationRead_4006,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImportOperationUse_4007Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ImportOperationUse_4007,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExportOperationUse_4008Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ExportOperationUse_4008,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExportOperationWrite_4009Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ExportOperationWrite_4009,
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
	private String getChartAxes_4010Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ChartAxes_4010,
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
