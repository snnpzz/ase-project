/*
* 
*/
package ASEProject.diagram.navigator;

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

/**
 * @generated
 */
public class ASEProjectNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ASEProject.diagram.navigator.ASEProjectNavigatorItem
				&& !isOwnView(((ASEProject.diagram.navigator.ASEProjectNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ASEProject.diagram.navigator.ASEProjectNavigatorGroup) {
			ASEProject.diagram.navigator.ASEProjectNavigatorGroup group = (ASEProject.diagram.navigator.ASEProjectNavigatorGroup) element;
			return ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ASEProject.diagram.navigator.ASEProjectNavigatorItem) {
			ASEProject.diagram.navigator.ASEProjectNavigatorItem navigatorItem = (ASEProject.diagram.navigator.ASEProjectNavigatorItem) element;
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
		switch (ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(view)) {
		case ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.ase.polimi.it/project?Pipeline", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.Pipeline_1000);
		case ASEProject.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.polimi.it/project?CollectionTask", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.CollectionTask_2007);
		case ASEProject.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.polimi.it/project?IntegrationTask", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.IntegrationTask_2008);
		case ASEProject.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.polimi.it/project?CleaningTask", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.CleaningTask_2009);
		case ASEProject.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.polimi.it/project?AnalyzesTask", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.AnalyzesTask_2010);
		case ASEProject.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.polimi.it/project?VisualizationTask", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.VisualizationTask_2011);
		case ASEProject.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.polimi.it/project?ExportingTask", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.ExportingTask_2012);
		case ASEProject.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project?Import", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.Import_3009);
		case ASEProject.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project?UserDefined", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.UserDefined_3010);
		case ASEProject.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project?Predefined", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.Predefined_3011);
		case ASEProject.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project?Descriptive", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.Descriptive_3012);
		case ASEProject.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project?Classification", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.Classification_3013);
		case ASEProject.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project?Predictive", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.Predictive_3014);
		case ASEProject.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project?Clustering", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.Clustering_3015);
		case ASEProject.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.polimi.it/project?Export", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.Export_3016);
		case ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.polimi.it/project?Dataflow", //$NON-NLS-1$
					ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ASEProject.diagram.providers.ASEProjectElementTypes.isKnownElementType(elementType)) {
			image = ASEProject.diagram.providers.ASEProjectElementTypes.getImage(elementType);
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
		if (element instanceof ASEProject.diagram.navigator.ASEProjectNavigatorGroup) {
			ASEProject.diagram.navigator.ASEProjectNavigatorGroup group = (ASEProject.diagram.navigator.ASEProjectNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ASEProject.diagram.navigator.ASEProjectNavigatorItem) {
			ASEProject.diagram.navigator.ASEProjectNavigatorItem navigatorItem = (ASEProject.diagram.navigator.ASEProjectNavigatorItem) element;
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
		switch (ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(view)) {
		case ASEProject.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			return getPipeline_1000Text(view);
		case ASEProject.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2007Text(view);
		case ASEProject.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2008Text(view);
		case ASEProject.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2009Text(view);
		case ASEProject.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			return getAnalyzesTask_2010Text(view);
		case ASEProject.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2011Text(view);
		case ASEProject.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			return getExportingTask_2012Text(view);
		case ASEProject.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			return getImport_3009Text(view);
		case ASEProject.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3010Text(view);
		case ASEProject.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			return getPredefined_3011Text(view);
		case ASEProject.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3012Text(view);
		case ASEProject.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			return getClassification_3013Text(view);
		case ASEProject.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			return getPredictive_3014Text(view);
		case ASEProject.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			return getClustering_3015Text(view);
		case ASEProject.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			return getExport_3016Text(view);
		case ASEProject.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
			return getDataflow_4002Text(view);
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
	private String getCollectionTask_2007Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.CollectionTask_2007,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.CollectionTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIntegrationTask_2008Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.IntegrationTask_2008,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.IntegrationTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCleaningTask_2009Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.CleaningTask_2009,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.CleaningTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnalyzesTask_2010Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.AnalyzesTask_2010,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.AnalyzesTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVisualizationTask_2011Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.VisualizationTask_2011,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.VisualizationTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExportingTask_2012Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.ExportingTask_2012,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.ExportingTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImport_3009Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.Import_3009,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.ImportNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserDefined_3010Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.UserDefined_3010,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.UserDefinedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPredefined_3011Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.Predefined_3011,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.PredefinedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDescriptive_3012Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.Descriptive_3012,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.DescriptiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClassification_3013Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.Classification_3013,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.ClassificationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPredictive_3014Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.Predictive_3014,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.PredictiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClustering_3015Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.Clustering_3015,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.ClusteringNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExport_3016Text(View view) {
		IParser parser = ASEProject.diagram.providers.ASEProjectParserProvider.getParser(
				ASEProject.diagram.providers.ASEProjectElementTypes.Export_3016,
				view.getElement() != null ? view.getElement() : view, ASEProject.diagram.part.ASEProjectVisualIDRegistry
						.getType(ASEProject.diagram.edit.parts.ExportNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataflow_4002Text(View view) {
		ASEProject.Dataflow domainModelElement = (ASEProject.Dataflow) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getFormat());
		} else {
			ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
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
		return ASEProject.diagram.edit.parts.PipelineEditPart.MODEL_ID
				.equals(ASEProject.diagram.part.ASEProjectVisualIDRegistry.getModelID(view));
	}

}
