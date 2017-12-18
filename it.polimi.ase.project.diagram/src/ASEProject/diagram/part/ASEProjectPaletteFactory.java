
/*
 * 
 */
package ASEProject.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class ASEProjectPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(ASEProject.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAnalyzesTask1CreationTool());
		paletteContainer.add(createClassification2CreationTool());
		paletteContainer.add(createCleaningTask3CreationTool());
		paletteContainer.add(createClustering4CreationTool());
		paletteContainer.add(createCollectionTask5CreationTool());
		paletteContainer.add(createDescriptive6CreationTool());
		paletteContainer.add(createExport7CreationTool());
		paletteContainer.add(createExportingTask8CreationTool());
		paletteContainer.add(createImport9CreationTool());
		paletteContainer.add(createIntegrationTask10CreationTool());
		paletteContainer.add(createPredefined11CreationTool());
		paletteContainer.add(createPredictive12CreationTool());
		paletteContainer.add(createUserDefined13CreationTool());
		paletteContainer.add(createVisualizationTask14CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(ASEProject.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createDataflow1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAnalyzesTask1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.AnalyzesTask1CreationTool_title,
				ASEProject.diagram.part.Messages.AnalyzesTask1CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.AnalyzesTask_2010));
		entry.setId("createAnalyzesTask1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.AnalyzesTask_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClassification2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Classification2CreationTool_title,
				ASEProject.diagram.part.Messages.Classification2CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Classification_3013));
		entry.setId("createClassification2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Classification_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCleaningTask3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.CleaningTask3CreationTool_title,
				ASEProject.diagram.part.Messages.CleaningTask3CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.CleaningTask_2009));
		entry.setId("createCleaningTask3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.CleaningTask_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClustering4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Clustering4CreationTool_title,
				ASEProject.diagram.part.Messages.Clustering4CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Clustering_3015));
		entry.setId("createClustering4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Clustering_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollectionTask5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.CollectionTask5CreationTool_title,
				ASEProject.diagram.part.Messages.CollectionTask5CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.CollectionTask_2007));
		entry.setId("createCollectionTask5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.CollectionTask_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDescriptive6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Descriptive6CreationTool_title,
				ASEProject.diagram.part.Messages.Descriptive6CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Descriptive_3012));
		entry.setId("createDescriptive6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Descriptive_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExport7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Export7CreationTool_title,
				ASEProject.diagram.part.Messages.Export7CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Export_3016));
		entry.setId("createExport7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Export_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExportingTask8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.ExportingTask8CreationTool_title,
				ASEProject.diagram.part.Messages.ExportingTask8CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.ExportingTask_2012));
		entry.setId("createExportingTask8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.ExportingTask_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImport9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Import9CreationTool_title,
				ASEProject.diagram.part.Messages.Import9CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Import_3009));
		entry.setId("createImport9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Import_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIntegrationTask10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.IntegrationTask10CreationTool_title,
				ASEProject.diagram.part.Messages.IntegrationTask10CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.IntegrationTask_2008));
		entry.setId("createIntegrationTask10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.IntegrationTask_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredefined11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Predefined11CreationTool_title,
				ASEProject.diagram.part.Messages.Predefined11CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Predefined_3011));
		entry.setId("createPredefined11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Predefined_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredictive12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Predictive12CreationTool_title,
				ASEProject.diagram.part.Messages.Predictive12CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Predictive_3014));
		entry.setId("createPredictive12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Predictive_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserDefined13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.UserDefined13CreationTool_title,
				ASEProject.diagram.part.Messages.UserDefined13CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.UserDefined_3010));
		entry.setId("createUserDefined13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.UserDefined_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVisualizationTask14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.VisualizationTask14CreationTool_title,
				ASEProject.diagram.part.Messages.VisualizationTask14CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.VisualizationTask_2011));
		entry.setId("createVisualizationTask14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.VisualizationTask_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataflow1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				ASEProject.diagram.part.Messages.Dataflow1CreationTool_title,
				ASEProject.diagram.part.Messages.Dataflow1CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002));
		entry.setId("createDataflow1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Dataflow_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
