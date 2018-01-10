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

import pipeline.Pipeline;
import pipeline.diagram.edit.parts.AnalysisTaskEditPart;
import pipeline.diagram.edit.parts.AnalysisTaskIDEditPart;
import pipeline.diagram.edit.parts.CleaningTaskEditPart;
import pipeline.diagram.edit.parts.CleaningTaskIDEditPart;
import pipeline.diagram.edit.parts.CollectionTaskEditPart;
import pipeline.diagram.edit.parts.CollectionTaskIDEditPart;
import pipeline.diagram.edit.parts.ExportTaskEditPart;
import pipeline.diagram.edit.parts.ExportTaskIDEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskIDEditPart;
import pipeline.diagram.edit.parts.PipelineEditPart;
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
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
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
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
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
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
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
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
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
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
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
			PipelineDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
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
