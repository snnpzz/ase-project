
/*
 * 
 */
package ASE_Project.diagram.part;

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
public class ASE_ProjectPaletteFactory {

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
		PaletteDrawer paletteContainer = new PaletteDrawer(ASE_Project.diagram.part.Messages.Objects1Group_title);
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
		PaletteDrawer paletteContainer = new PaletteDrawer(ASE_Project.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createDataflow1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAnalyzesTask1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.AnalyzesTask1CreationTool_title,
				ASE_Project.diagram.part.Messages.AnalyzesTask1CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.AnalyzesTask_2004));
		entry.setId("createAnalyzesTask1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.AnalyzesTask_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttribute2CreationTool() {
		ToolEntry entry = new ToolEntry(ASE_Project.diagram.part.Messages.Attribute2CreationTool_title,
				ASE_Project.diagram.part.Messages.Attribute2CreationTool_desc, null, null) {
		};
		entry.setId("createAttribute2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClassification3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.Classification3CreationTool_title,
				ASE_Project.diagram.part.Messages.Classification3CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Classification_3005));
		entry.setId("createClassification3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Classification_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCleaningTask4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.CleaningTask4CreationTool_title,
				ASE_Project.diagram.part.Messages.CleaningTask4CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.CleaningTask_2003));
		entry.setId("createCleaningTask4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.CleaningTask_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClustering5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.Clustering5CreationTool_title,
				ASE_Project.diagram.part.Messages.Clustering5CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Clustering_3007));
		entry.setId("createClustering5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Clustering_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollectionTask6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.CollectionTask6CreationTool_title,
				ASE_Project.diagram.part.Messages.CollectionTask6CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.CollectionTask_2001));
		entry.setId("createCollectionTask6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.CollectionTask_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDescriptive7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.Descriptive7CreationTool_title,
				ASE_Project.diagram.part.Messages.Descriptive7CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Descriptive_3004));
		entry.setId("createDescriptive7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Descriptive_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExport8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.Export8CreationTool_title,
				ASE_Project.diagram.part.Messages.Export8CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Export_3008));
		entry.setId("createExport8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Export_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExportingTask9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.ExportingTask9CreationTool_title,
				ASE_Project.diagram.part.Messages.ExportingTask9CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.ExportingTask_2006));
		entry.setId("createExportingTask9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.ExportingTask_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFile10CreationTool() {
		ToolEntry entry = new ToolEntry(ASE_Project.diagram.part.Messages.File10CreationTool_title,
				ASE_Project.diagram.part.Messages.File10CreationTool_desc, null, null) {
		};
		entry.setId("createFile10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImport11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.Import11CreationTool_title,
				ASE_Project.diagram.part.Messages.Import11CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Import_3001));
		entry.setId("createImport11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Import_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIntegrationTask12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.IntegrationTask12CreationTool_title,
				ASE_Project.diagram.part.Messages.IntegrationTask12CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.IntegrationTask_2002));
		entry.setId("createIntegrationTask12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.IntegrationTask_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredefined13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.Predefined13CreationTool_title,
				ASE_Project.diagram.part.Messages.Predefined13CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Predefined_3003));
		entry.setId("createPredefined13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Predefined_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredictive14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.Predictive14CreationTool_title,
				ASE_Project.diagram.part.Messages.Predictive14CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Predictive_3006));
		entry.setId("createPredictive14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Predictive_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSource15CreationTool() {
		ToolEntry entry = new ToolEntry(ASE_Project.diagram.part.Messages.Source15CreationTool_title,
				ASE_Project.diagram.part.Messages.Source15CreationTool_desc, null, null) {
		};
		entry.setId("createSource15CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserDefined16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.UserDefined16CreationTool_title,
				ASE_Project.diagram.part.Messages.UserDefined16CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.UserDefined_3002));
		entry.setId("createUserDefined16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.UserDefined_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVisualizationTask17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ASE_Project.diagram.part.Messages.VisualizationTask17CreationTool_title,
				ASE_Project.diagram.part.Messages.VisualizationTask17CreationTool_desc, Collections
						.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.VisualizationTask_2005));
		entry.setId("createVisualizationTask17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.VisualizationTask_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataflow1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				ASE_Project.diagram.part.Messages.Dataflow1CreationTool_title,
				ASE_Project.diagram.part.Messages.Dataflow1CreationTool_desc,
				Collections.singletonList(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001));
		entry.setId("createDataflow1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASE_Project.diagram.providers.ASE_ProjectElementTypes
				.getImageDescriptor(ASE_Project.diagram.providers.ASE_ProjectElementTypes.Dataflow_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
