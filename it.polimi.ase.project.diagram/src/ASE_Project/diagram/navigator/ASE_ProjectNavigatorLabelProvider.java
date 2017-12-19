/*
* 
*/
package ASE_Project.diagram.navigator;

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
public class ASE_ProjectNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem
				&& !isOwnView(((ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup) {
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup group = (ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup) element;
			return ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem) {
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem navigatorItem = (ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem) element;
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
		switch (ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(view)) {
		case ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.ase.it/?Pipeline", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.Pipeline_1000);
		case ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/?CollectionTask", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.CollectionTask_2001);
		case ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/?IntegrationTask", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.IntegrationTask_2002);
		case ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/?CleaningTask", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.CleaningTask_2003);
		case ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/?AnalyzesTask", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.AnalyzesTask_2004);
		case ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/?VisualizationTask", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.VisualizationTask_2005);
		case ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.ase.it/?ExportingTask", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.ExportingTask_2006);
		case ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/?Import", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.Import_3001);
		case ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/?UserDefined", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.UserDefined_3002);
		case ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/?Predefined", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.Predefined_3003);
		case ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/?Descriptive", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.Descriptive_3004);
		case ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/?Classification", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.Classification_3005);
		case ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/?Predictive", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.Predictive_3006);
		case ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/?Clustering", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.Clustering_3007);
		case ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.ase.it/?Export", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.Export_3008);
		case ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.ase.it/?Dataflow", //$NON-NLS-1$
					ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ASE_Project.diagram.providers.ASE_ProjectElementTypes.isKnownElementType(elementType)) {
			image = ASE_Project.diagram.providers.ASE_ProjectElementTypes.getImage(elementType);
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
		if (element instanceof ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup) {
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup group = (ASE_Project.diagram.navigator.ASE_ProjectNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem) {
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem navigatorItem = (ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem) element;
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
		switch (ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(view)) {
		case ASE_Project.diagram.edit.parts.PipelineEditPart.VISUAL_ID:
			return getPipeline_1000Text(view);
		case ASE_Project.diagram.edit.parts.CollectionTaskEditPart.VISUAL_ID:
			return getCollectionTask_2001Text(view);
		case ASE_Project.diagram.edit.parts.IntegrationTaskEditPart.VISUAL_ID:
			return getIntegrationTask_2002Text(view);
		case ASE_Project.diagram.edit.parts.CleaningTaskEditPart.VISUAL_ID:
			return getCleaningTask_2003Text(view);
		case ASE_Project.diagram.edit.parts.AnalyzesTaskEditPart.VISUAL_ID:
			return getAnalyzesTask_2004Text(view);
		case ASE_Project.diagram.edit.parts.VisualizationTaskEditPart.VISUAL_ID:
			return getVisualizationTask_2005Text(view);
		case ASE_Project.diagram.edit.parts.ExportingTaskEditPart.VISUAL_ID:
			return getExportingTask_2006Text(view);
		case ASE_Project.diagram.edit.parts.ImportEditPart.VISUAL_ID:
			return getImport_3001Text(view);
		case ASE_Project.diagram.edit.parts.UserDefinedEditPart.VISUAL_ID:
			return getUserDefined_3002Text(view);
		case ASE_Project.diagram.edit.parts.PredefinedEditPart.VISUAL_ID:
			return getPredefined_3003Text(view);
		case ASE_Project.diagram.edit.parts.DescriptiveEditPart.VISUAL_ID:
			return getDescriptive_3004Text(view);
		case ASE_Project.diagram.edit.parts.ClassificationEditPart.VISUAL_ID:
			return getClassification_3005Text(view);
		case ASE_Project.diagram.edit.parts.PredictiveEditPart.VISUAL_ID:
			return getPredictive_3006Text(view);
		case ASE_Project.diagram.edit.parts.ClusteringEditPart.VISUAL_ID:
			return getClustering_3007Text(view);
		case ASE_Project.diagram.edit.parts.ExportEditPart.VISUAL_ID:
			return getExport_3008Text(view);
		case ASE_Project.diagram.edit.parts.DataflowEditPart.VISUAL_ID:
			return getDataflow_4001Text(view);
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
	private String getCollectionTask_2001Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.CollectionTask_2001,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.CollectionTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIntegrationTask_2002Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.IntegrationTask_2002,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.IntegrationTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCleaningTask_2003Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.CleaningTask_2003,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.CleaningTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnalyzesTask_2004Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.AnalyzesTask_2004,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.AnalyzesTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVisualizationTask_2005Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.VisualizationTask_2005,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.VisualizationTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExportingTask_2006Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.ExportingTask_2006,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.ExportingTaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImport_3001Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.Import_3001,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.ImportNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserDefined_3002Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.UserDefined_3002,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.UserDefinedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPredefined_3003Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.Predefined_3003,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.PredefinedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDescriptive_3004Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.Descriptive_3004,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.DescriptiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClassification_3005Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.Classification_3005,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.ClassificationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPredictive_3006Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.Predictive_3006,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.PredictiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClustering_3007Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.Clustering_3007,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.ClusteringNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExport_3008Text(View view) {
		IParser parser = ASE_Project.diagram.providers.ASE_ProjectParserProvider.getParser(
				ASE_Project.diagram.providers.ASE_ProjectElementTypes.Export_3008,
				view.getElement() != null ? view.getElement() : view,
				ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry
						.getType(ASE_Project.diagram.edit.parts.ExportNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataflow_4001Text(View view) {
		ASE_Project.Dataflow domainModelElement = (ASE_Project.Dataflow) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getFormat());
		} else {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
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
		return ASE_Project.diagram.edit.parts.PipelineEditPart.MODEL_ID
				.equals(ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getModelID(view));
	}

}
