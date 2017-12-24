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
import pipeline.diagram.edit.parts.PipelineEditPart;
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
		case AnalyzesTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?AnalyzesTask", //$NON-NLS-1$
					PipelineElementTypes.AnalyzesTask_2028);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?VisualizationTask", //$NON-NLS-1$
					PipelineElementTypes.VisualizationTask_2029);
		case ExportingTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.project.ase.polimi.it/pipeline?ExportingTask", //$NON-NLS-1$
					PipelineElementTypes.ExportingTask_2030);
		case ImportEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Import", //$NON-NLS-1$
					PipelineElementTypes.Import_3025);
		case UserDefinedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?UserDefined", //$NON-NLS-1$
					PipelineElementTypes.UserDefined_3026);
		case PredefinedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Predefined", //$NON-NLS-1$
					PipelineElementTypes.Predefined_3027);
		case DescriptiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Descriptive", //$NON-NLS-1$
					PipelineElementTypes.Descriptive_3028);
		case ClassificationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Classification", //$NON-NLS-1$
					PipelineElementTypes.Classification_3029);
		case PredictiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Predictive", //$NON-NLS-1$
					PipelineElementTypes.Predictive_3030);
		case ClusteringEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Clustering", //$NON-NLS-1$
					PipelineElementTypes.Clustering_3031);
		case ExportEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.project.ase.polimi.it/pipeline?Export", //$NON-NLS-1$
					PipelineElementTypes.Export_3032);
		case DataflowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.project.ase.polimi.it/pipeline?Dataflow", //$NON-NLS-1$
					PipelineElementTypes.Dataflow_4004);
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
		case AnalyzesTaskEditPart.VISUAL_ID:
			return getAnalyzesTask_2028Text(view);
		case VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2029Text(view);
		case ExportingTaskEditPart.VISUAL_ID:
			return getExportingTask_2030Text(view);
		case ImportEditPart.VISUAL_ID:
			return getImport_3025Text(view);
		case UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3026Text(view);
		case PredefinedEditPart.VISUAL_ID:
			return getPredefined_3027Text(view);
		case DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3028Text(view);
		case ClassificationEditPart.VISUAL_ID:
			return getClassification_3029Text(view);
		case PredictiveEditPart.VISUAL_ID:
			return getPredictive_3030Text(view);
		case ClusteringEditPart.VISUAL_ID:
			return getClustering_3031Text(view);
		case ExportEditPart.VISUAL_ID:
			return getExport_3032Text(view);
		case DataflowEditPart.VISUAL_ID:
			return getDataflow_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getPipeline_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getCollectionTask_2025Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.CollectionTask_2025,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(CollectionTaskNameEditPart.VISUAL_ID));
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
				PipelineVisualIDRegistry.getType(IntegrationTaskNameEditPart.VISUAL_ID));
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
				PipelineVisualIDRegistry.getType(CleaningTaskNameEditPart.VISUAL_ID));
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
	private String getAnalyzesTask_2028Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.AnalyzesTask_2028,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(AnalyzesTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVisualizationTask_2029Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.VisualizationTask_2029,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(VisualizationTaskNameEditPart.VISUAL_ID));
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
	private String getExportingTask_2030Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.ExportingTask_2030,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ExportingTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5070); //$NON-NLS-1$
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
	private String getUserDefined_3026Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.UserDefined_3026,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(UserDefinedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPredefined_3027Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Predefined_3027,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(PredefinedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDescriptive_3028Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Descriptive_3028,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(DescriptiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClassification_3029Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Classification_3029,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ClassificationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPredictive_3030Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Predictive_3030,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(PredictiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClustering_3031Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Clustering_3031,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ClusteringNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExport_3032Text(View view) {
		IParser parser = PipelineParserProvider.getParser(PipelineElementTypes.Export_3032,
				view.getElement() != null ? view.getElement() : view,
				PipelineVisualIDRegistry.getType(ExportNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataflow_4004Text(View view) {
		Dataflow domainModelElement = (Dataflow) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getFormat());
		} else {
			PipelineDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4004); //$NON-NLS-1$
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
