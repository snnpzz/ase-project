
/*
 * 
 */
package pipeline.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import pipeline.diagram.providers.PipelineElementTypes;

/**
 * @generated
 */
public class PipelinePaletteFactory {

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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAnalysisTask1CreationTool());
		paletteContainer.add(createAttribute2CreationTool());
		paletteContainer.add(createClassification3CreationTool());
		paletteContainer.add(createCleaningTask4CreationTool());
		paletteContainer.add(createClustering5CreationTool());
		paletteContainer.add(createCollectionTask6CreationTool());
		paletteContainer.add(createDescriptive7CreationTool());
		paletteContainer.add(createExport8CreationTool());
		paletteContainer.add(createExportTask9CreationTool());
		paletteContainer.add(createFile10CreationTool());
		paletteContainer.add(createImport11CreationTool());
		paletteContainer.add(createIntegrationTask12CreationTool());
		paletteContainer.add(createPredefined13CreationTool());
		paletteContainer.add(createPredictive14CreationTool());
		paletteContainer.add(createSchema15CreationTool());
		paletteContainer.add(createSource16CreationTool());
		paletteContainer.add(createUserDefined17CreationTool());
		paletteContainer.add(createVisualizationTask18CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createDataFlow1CreationTool());
		paletteContainer.add(createExpUses2CreationTool());
		paletteContainer.add(createGenerates3CreationTool());
		paletteContainer.add(createImpUses4CreationTool());
		paletteContainer.add(createIntDFschema5CreationTool());
		paletteContainer.add(createInternalDataFlow6CreationTool());
		paletteContainer.add(createReadsFrom7CreationTool());
		paletteContainer.add(createSchema8CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAnalysisTask1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.AnalysisTask1CreationTool_title,
				Messages.AnalysisTask1CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.AnalysisTask_2031));
		entry.setId("createAnalysisTask1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.AnalysisTask_2031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttribute2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.Attribute_3038);
		types.add(PipelineElementTypes.Attribute_3039);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Attribute2CreationTool_title,
				Messages.Attribute2CreationTool_desc, types);
		entry.setId("createAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Attribute_3038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClassification3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.Classification_2035);
		types.add(PipelineElementTypes.Classification_3043);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Classification3CreationTool_title,
				Messages.Classification3CreationTool_desc, types);
		entry.setId("createClassification3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Classification_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCleaningTask4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CleaningTask4CreationTool_title,
				Messages.CleaningTask4CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.CleaningTask_2027));
		entry.setId("createCleaningTask4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.CleaningTask_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClustering5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.Clustering_2037);
		types.add(PipelineElementTypes.Clustering_3045);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Clustering5CreationTool_title,
				Messages.Clustering5CreationTool_desc, types);
		entry.setId("createClustering5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Clustering_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollectionTask6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CollectionTask6CreationTool_title,
				Messages.CollectionTask6CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.CollectionTask_2025));
		entry.setId("createCollectionTask6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.CollectionTask_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDescriptive7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.Descriptive_2034);
		types.add(PipelineElementTypes.Descriptive_3042);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Descriptive7CreationTool_title,
				Messages.Descriptive7CreationTool_desc, types);
		entry.setId("createDescriptive7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Descriptive_2034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExport8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Export8CreationTool_title,
				Messages.Export8CreationTool_desc, Collections.singletonList(PipelineElementTypes.Export_3037));
		entry.setId("createExport8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Export_3037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExportTask9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExportTask9CreationTool_title,
				Messages.ExportTask9CreationTool_desc, Collections.singletonList(PipelineElementTypes.ExportTask_2032));
		entry.setId("createExportTask9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportTask_2032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFile10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.File10CreationTool_title,
				Messages.File10CreationTool_desc, Collections.singletonList(PipelineElementTypes.File_2045));
		entry.setId("createFile10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.File_2045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImport11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Import11CreationTool_title,
				Messages.Import11CreationTool_desc, Collections.singletonList(PipelineElementTypes.Import_3025));
		entry.setId("createImport11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Import_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIntegrationTask12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IntegrationTask12CreationTool_title,
				Messages.IntegrationTask12CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.IntegrationTask_2026));
		entry.setId("createIntegrationTask12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.IntegrationTask_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredefined13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.Predefined_2038);
		types.add(PipelineElementTypes.Predefined_3041);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Predefined13CreationTool_title,
				Messages.Predefined13CreationTool_desc, types);
		entry.setId("createPredefined13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Predefined_2038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredictive14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.Predictive_2036);
		types.add(PipelineElementTypes.Predictive_3044);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Predictive14CreationTool_title,
				Messages.Predictive14CreationTool_desc, types);
		entry.setId("createPredictive14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Predictive_2036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSchema15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Schema15CreationTool_title,
				Messages.Schema15CreationTool_desc, Collections.singletonList(PipelineElementTypes.Schema_2043));
		entry.setId("createSchema15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Schema_2043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSource16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Source16CreationTool_title,
				Messages.Source16CreationTool_desc, Collections.singletonList(PipelineElementTypes.Source_2044));
		entry.setId("createSource16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Source_2044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserDefined17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.UserDefined_2033);
		types.add(PipelineElementTypes.UserDefined_3040);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserDefined17CreationTool_title,
				Messages.UserDefined17CreationTool_desc, types);
		entry.setId("createUserDefined17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.UserDefined_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVisualizationTask18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.VisualizationTask18CreationTool_title,
				Messages.VisualizationTask18CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.VisualizationTask_2029));
		entry.setId("createVisualizationTask18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.VisualizationTask_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataFlow1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DataFlow1CreationTool_title,
				Messages.DataFlow1CreationTool_desc, Collections.singletonList(PipelineElementTypes.DataFlow_4005));
		entry.setId("createDataFlow1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.DataFlow_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExpUses2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ExpUses2CreationTool_title,
				Messages.ExpUses2CreationTool_desc, Collections.singletonList(PipelineElementTypes.ExportExpUses_4014));
		entry.setId("createExpUses2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportExpUses_4014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGenerates3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Generates3CreationTool_title,
				Messages.Generates3CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ExportGenerates_4008));
		entry.setId("createGenerates3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportGenerates_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImpUses4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ImpUses4CreationTool_title,
				Messages.ImpUses4CreationTool_desc, Collections.singletonList(PipelineElementTypes.ImportImpUses_4013));
		entry.setId("createImpUses4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ImportImpUses_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIntDFschema5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.IntDFschema5CreationTool_title,
				Messages.IntDFschema5CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.InternalDataFlowIntDFschema_4018));
		entry.setId("createIntDFschema5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.InternalDataFlowIntDFschema_4018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInternalDataFlow6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InternalDataFlow6CreationTool_title,
				Messages.InternalDataFlow6CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.InternalDataFlow_4006));
		entry.setId("createInternalDataFlow6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.InternalDataFlow_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createReadsFrom7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ReadsFrom7CreationTool_title,
				Messages.ReadsFrom7CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ImportReadsFrom_4007));
		entry.setId("createReadsFrom7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ImportReadsFrom_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSchema8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Schema8CreationTool_title,
				Messages.Schema8CreationTool_desc, Collections.singletonList(PipelineElementTypes.DataFlowSchema_4019));
		entry.setId("createSchema8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.DataFlowSchema_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
