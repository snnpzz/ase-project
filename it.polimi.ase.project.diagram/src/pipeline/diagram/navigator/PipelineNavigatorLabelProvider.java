/*
* 
*/
package pipeline.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
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

import pipeline.Dataflow;
import pipeline.diagram.edit.parts.AnalyzesTaskEditPart;
import pipeline.diagram.edit.parts.AnalyzesTaskNameEditPart;
import pipeline.diagram.edit.parts.ClassificationEditPart;
import pipeline.diagram.edit.parts.ClassificationNameEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.CleaningTaskNameEditPart;
import pipeline.diagram.edit.parts.ClusteringEditPart;
import pipeline.diagram.edit.parts.ClusteringNameEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.CollectionTaskNameEditPart;
import pipeline.diagram.edit.parts.DataflowEditPart;
import pipeline.diagram.edit.parts.DescriptiveEditPart;
import pipeline.diagram.edit.parts.DescriptiveNameEditPart;
import pipeline.diagram.edit.parts.ExportEditPart;
import pipeline.diagram.edit.parts.ExportNameEditPart;
import pipeline.diagram.edit.parts.ExportingTaskEditPart;
import pipeline.diagram.edit.parts.ExportingTaskNameEditPart;
import pipeline.diagram.edit.parts.ImportEditPart;
import pipeline.diagram.edit.parts.ImportNameEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskNameEditPart;
import pipeline.diagram.edit.parts.PLEditPart;
import pipeline.diagram.edit.parts.PredefinedEditPart;
import pipeline.diagram.edit.parts.PredefinedNameEditPart;
import pipeline.diagram.edit.parts.PredictiveEditPart;
import pipeline.diagram.edit.parts.PredictiveNameEditPart;
import pipeline.diagram.edit.parts.UserDefinedEditPart;
import pipeline.diagram.edit.parts.UserDefinedNameEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskNameEditPart;
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
		case PLEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.ase.polimi.it/project/pipeline?PL", //$NON-NLS-1$
					PipelineElementTypes.PL_1000);
		case CollectionTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.polimi.it/project/pipeline?CollectionTask", //$NON-NLS-1$
					PipelineElementTypes.CollectionTask_2013);
		case IntegrationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.polimi.it/project/pipeline?IntegrationTask", //$NON-NLS-1$
					PipelineElementTypes.IntegrationTask_2014);
		case CleaningTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.polimi.it/project/pipeline?CleaningTask", //$NON-NLS-1$
					PipelineElementTypes.CleaningTask_2015);
		case AnalyzesTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.polimi.it/project/pipeline?AnalyzesTask", //$NON-NLS-1$
					PipelineElementTypes.AnalyzesTask_2016);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.polimi.it/project/pipeline?VisualizationTask", //$NON-NLS-1$
					PipelineElementTypes.VisualizationTask_2017);
		case ExportingTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.polimi.it/project/pipeline?ExportingTask", //$NON-NLS-1$
					PipelineElementTypes.ExportingTask_2018);
		case ImportEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project/pipeline?Import", //$NON-NLS-1$
					PipelineElementTypes.Import_3017);
		case UserDefinedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project/pipeline?UserDefined", //$NON-NLS-1$
					PipelineElementTypes.UserDefined_3018);
		case PredefinedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project/pipeline?Predefined", //$NON-NLS-1$
					PipelineElementTypes.Predefined_3019);
		case DescriptiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project/pipeline?Descriptive", //$NON-NLS-1$
					PipelineElementTypes.Descriptive_3020);
		case ClassificationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project/pipeline?Classification", //$NON-NLS-1$
					PipelineElementTypes.Classification_3021);
		case PredictiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project/pipeline?Predictive", //$NON-NLS-1$
					PipelineElementTypes.Predictive_3022);
		case ClusteringEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project/pipeline?Clustering", //$NON-NLS-1$
					PipelineElementTypes.Clustering_3023);
		case ExportEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project/pipeline?Export", //$NON-NLS-1$
					PipelineElementTypes.Export_3024);
		case DataflowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.polimi.it/project/pipeline?Dataflow", //$NON-NLS-1$
					PipelineElementTypes.Dataflow_4003);
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
		case PLEditPart.VISUAL_ID:
			return getPL_1000Text(view);
		case CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2013Text(view);
		case IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2014Text(view);
		case CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2015Text(view);
		case AnalyzesTaskEditPart.VISUAL_ID:
			return getAnalyzesTask_2016Text(view);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2017Text(view);
		case ExportingTaskEditPart.VISUAL_ID:
			return getExportingTask_2018Text(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_3017Text(view);
		case UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3018Text(view);
		case PredefinedEditPart.VISUAL_ID:
			return getPredefined_3019Text(view);
		case DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3020Text(view);
		case ClassificationEditPart.VISUAL_ID:
			return getClassification_3021Text(view);
		case PredictiveEditPart.VISUAL_ID:
			return getPredictive_3022Text(view);
		case ClusteringEditPart.VISUAL_ID:
			return getClustering_3023Text(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_3024Text(view);
		case DataflowEditPart.VISUAL_ID:
			return getDataflow_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getPL_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getCollectionTask_2013Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.CollectionTask_2013,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(CollectionTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIntegrationTask_2014Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.IntegrationTask_2014,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(IntegrationTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCleaningTask_2015Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.CleaningTask_2015,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(CleaningTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnalyzesTask_2016Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.AnalyzesTask_2016,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(AnalyzesTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVisualizationTask_2017Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.VisualizationTask_2017,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(VisualizationTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExportingTask_2018Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ExportingTask_2018,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ExportingTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImport_3017Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Import_3017,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ImportNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserDefined_3018Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.UserDefined_3018,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(UserDefinedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPredefined_3019Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Predefined_3019,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(PredefinedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDescriptive_3020Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Descriptive_3020,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(DescriptiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClassification_3021Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Classification_3021,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ClassificationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPredictive_3022Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Predictive_3022,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(PredictiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClustering_3023Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Clustering_3023,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ClusteringNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExport_3024Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Export_3024,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ExportNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataflow_4003Text(View view) {
		Dataflow domainModelElement = (Dataflow) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getFormat());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4003); //$NON-NLS-1$
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
		return PLEditPart.MODEL_ID.equals(PipelineVisualIDRegistry.getModelID(view));
	}

}
