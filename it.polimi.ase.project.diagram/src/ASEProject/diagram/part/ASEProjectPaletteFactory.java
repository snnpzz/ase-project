
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
		paletteContainer.add(createAttribute2CreationTool());
		paletteContainer.add(createClassification3CreationTool());
		paletteContainer.add(createCleaningTask4CreationTool());
		paletteContainer.add(createClustering5CreationTool());
		paletteContainer.add(createCollectionTask6CreationTool());
		paletteContainer.add(createDescriptive7CreationTool());
		paletteContainer.add(createExport8CreationTool());
		paletteContainer.add(createExportingTask9CreationTool());
		paletteContainer.add(createFile10CreationTool());
		paletteContainer.add(createImport11CreationTool());
		paletteContainer.add(createIntegrationTask12CreationTool());
		paletteContainer.add(createPredefined13CreationTool());
		paletteContainer.add(createPredictive14CreationTool());
		paletteContainer.add(createSource15CreationTool());
		paletteContainer.add(createUserDefined16CreationTool());
		paletteContainer.add(createVisualizationTask17CreationTool());
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
	private ToolEntry createAttribute2CreationTool() {
		ToolEntry entry = new ToolEntry(ASEProject.diagram.part.Messages.Attribute2CreationTool_title,
				ASEProject.diagram.part.Messages.Attribute2CreationTool_desc, null, null) {
		};
		entry.setId("createAttribute2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClassification3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Classification3CreationTool_title,
				ASEProject.diagram.part.Messages.Classification3CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Classification_3013));
		entry.setId("createClassification3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Classification_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCleaningTask4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.CleaningTask4CreationTool_title,
				ASEProject.diagram.part.Messages.CleaningTask4CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.CleaningTask_2009));
		entry.setId("createCleaningTask4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.CleaningTask_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClustering5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Clustering5CreationTool_title,
				ASEProject.diagram.part.Messages.Clustering5CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Clustering_3015));
		entry.setId("createClustering5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Clustering_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollectionTask6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.CollectionTask6CreationTool_title,
				ASEProject.diagram.part.Messages.CollectionTask6CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.CollectionTask_2007));
		entry.setId("createCollectionTask6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.CollectionTask_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDescriptive7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Descriptive7CreationTool_title,
				ASEProject.diagram.part.Messages.Descriptive7CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Descriptive_3012));
		entry.setId("createDescriptive7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Descriptive_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExport8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Export8CreationTool_title,
				ASEProject.diagram.part.Messages.Export8CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Export_3016));
		entry.setId("createExport8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Export_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExportingTask9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.ExportingTask9CreationTool_title,
				ASEProject.diagram.part.Messages.ExportingTask9CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.ExportingTask_2012));
		entry.setId("createExportingTask9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.ExportingTask_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFile10CreationTool() {
		ToolEntry entry = new ToolEntry(ASEProject.diagram.part.Messages.File10CreationTool_title,
				ASEProject.diagram.part.Messages.File10CreationTool_desc, null, null) {
		};
		entry.setId("createFile10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImport11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Import11CreationTool_title,
				ASEProject.diagram.part.Messages.Import11CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Import_3009));
		entry.setId("createImport11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Import_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIntegrationTask12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.IntegrationTask12CreationTool_title,
				ASEProject.diagram.part.Messages.IntegrationTask12CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.IntegrationTask_2008));
		entry.setId("createIntegrationTask12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.IntegrationTask_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredefined13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Predefined13CreationTool_title,
				ASEProject.diagram.part.Messages.Predefined13CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Predefined_3011));
		entry.setId("createPredefined13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Predefined_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredictive14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.Predictive14CreationTool_title,
				ASEProject.diagram.part.Messages.Predictive14CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.Predictive_3014));
		entry.setId("createPredictive14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.Predictive_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSource15CreationTool() {
		ToolEntry entry = new ToolEntry(ASEProject.diagram.part.Messages.Source15CreationTool_title,
				ASEProject.diagram.part.Messages.Source15CreationTool_desc, null, null) {
		};
		entry.setId("createSource15CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserDefined16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.UserDefined16CreationTool_title,
				ASEProject.diagram.part.Messages.UserDefined16CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.UserDefined_3010));
		entry.setId("createUserDefined16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASEProject.diagram.providers.ASEProjectElementTypes
				.getImageDescriptor(ASEProject.diagram.providers.ASEProjectElementTypes.UserDefined_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVisualizationTask17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASEProject.diagram.part.Messages.VisualizationTask17CreationTool_title,
				ASEProject.diagram.part.Messages.VisualizationTask17CreationTool_desc,
				Collections.singletonList(ASEProject.diagram.providers.ASEProjectElementTypes.VisualizationTask_2011));
		entry.setId("createVisualizationTask17CreationTool"); //$NON-NLS-1$
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
