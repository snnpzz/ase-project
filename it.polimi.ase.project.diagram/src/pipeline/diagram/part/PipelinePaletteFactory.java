
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
		paletteContainer.add(createChart2CreationTool());
		paletteContainer.add(createClassification3CreationTool());
		paletteContainer.add(createCleaningTask4CreationTool());
		paletteContainer.add(createClustering5CreationTool());
		paletteContainer.add(createCollectionTask6CreationTool());
		paletteContainer.add(createComplexAttribute7CreationTool());
		paletteContainer.add(createDescriptive8CreationTool());
		paletteContainer.add(createExport9CreationTool());
		paletteContainer.add(createExportTask10CreationTool());
		paletteContainer.add(createFile11CreationTool());
		paletteContainer.add(createImport12CreationTool());
		paletteContainer.add(createIntegrationTask13CreationTool());
		paletteContainer.add(createPredefined14CreationTool());
		paletteContainer.add(createPredictive15CreationTool());
		paletteContainer.add(createSchema16CreationTool());
		paletteContainer.add(createSimpleAttribute17CreationTool());
		paletteContainer.add(createSource18CreationTool());
		paletteContainer.add(createUserDefined19CreationTool());
		paletteContainer.add(createVisualizationTask20CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAxes1CreationTool());
		paletteContainer.add(createDFSchema2CreationTool());
		paletteContainer.add(createDataFlow3CreationTool());
		paletteContainer.add(createExpUses4CreationTool());
		paletteContainer.add(createImpUses5CreationTool());
		paletteContainer.add(createIntegrationAttributes6CreationTool());
		paletteContainer.add(createInternalDFSchema7CreationTool());
		paletteContainer.add(createInternalDataFlow8CreationTool());
		paletteContainer.add(createRead9CreationTool());
		paletteContainer.add(createWrite10CreationTool());
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
	private ToolEntry createChart2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Chart2CreationTool_title,
				Messages.Chart2CreationTool_desc, Collections.singletonList(PipelineElementTypes.Chart_3062));
		entry.setId("createChart2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Chart_3062));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClassification3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Classification3CreationTool_title,
				Messages.Classification3CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.Classification_3059));
		entry.setId("createClassification3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Classification_3059));
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Clustering5CreationTool_title,
				Messages.Clustering5CreationTool_desc, Collections.singletonList(PipelineElementTypes.Clustering_3061));
		entry.setId("createClustering5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Clustering_3061));
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
	private ToolEntry createComplexAttribute7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.ComplexAttribute_3047);
		types.add(PipelineElementTypes.ComplexAttribute_3049);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComplexAttribute7CreationTool_title,
				Messages.ComplexAttribute7CreationTool_desc, types);
		entry.setId("createComplexAttribute7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ComplexAttribute_3047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDescriptive8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Descriptive8CreationTool_title,
				Messages.Descriptive8CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.Descriptive_3058));
		entry.setId("createDescriptive8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Descriptive_3058));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExport9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Export9CreationTool_title,
				Messages.Export9CreationTool_desc, Collections.singletonList(PipelineElementTypes.Export_3037));
		entry.setId("createExport9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Export_3037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExportTask10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExportTask10CreationTool_title,
				Messages.ExportTask10CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ExportTask_2032));
		entry.setId("createExportTask10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportTask_2032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFile11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.File11CreationTool_title,
				Messages.File11CreationTool_desc, Collections.singletonList(PipelineElementTypes.File_2045));
		entry.setId("createFile11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.File_2045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImport12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Import12CreationTool_title,
				Messages.Import12CreationTool_desc, Collections.singletonList(PipelineElementTypes.Import_3025));
		entry.setId("createImport12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Import_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIntegrationTask13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IntegrationTask13CreationTool_title,
				Messages.IntegrationTask13CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.IntegrationTask_2026));
		entry.setId("createIntegrationTask13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.IntegrationTask_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredefined14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Predefined14CreationTool_title,
				Messages.Predefined14CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.Predefined_3057));
		entry.setId("createPredefined14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Predefined_3057));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredictive15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Predictive15CreationTool_title,
				Messages.Predictive15CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.Predictive_3060));
		entry.setId("createPredictive15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Predictive_3060));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSchema16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Schema16CreationTool_title,
				Messages.Schema16CreationTool_desc, Collections.singletonList(PipelineElementTypes.Schema_2043));
		entry.setId("createSchema16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Schema_2043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSimpleAttribute17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.SimpleAttribute_3046);
		types.add(PipelineElementTypes.SimpleAttribute_3048);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SimpleAttribute17CreationTool_title,
				Messages.SimpleAttribute17CreationTool_desc, types);
		entry.setId("createSimpleAttribute17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.SimpleAttribute_3046));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSource18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Source18CreationTool_title,
				Messages.Source18CreationTool_desc, Collections.singletonList(PipelineElementTypes.Source_2044));
		entry.setId("createSource18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Source_2044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserDefined19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserDefined19CreationTool_title,
				Messages.UserDefined19CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.UserDefined_3056));
		entry.setId("createUserDefined19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.UserDefined_3056));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVisualizationTask20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.VisualizationTask20CreationTool_title,
				Messages.VisualizationTask20CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.VisualizationTask_2029));
		entry.setId("createVisualizationTask20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.VisualizationTask_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAxes1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Axes1CreationTool_title,
				Messages.Axes1CreationTool_desc, Collections.singletonList(PipelineElementTypes.ChartAxes_4026));
		entry.setId("createAxes1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ChartAxes_4026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDFSchema2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DFSchema2CreationTool_title,
				Messages.DFSchema2CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.DataFlowSchema_4019));
		entry.setId("createDFSchema2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.DataFlowSchema_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataFlow3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DataFlow3CreationTool_title,
				Messages.DataFlow3CreationTool_desc, Collections.singletonList(PipelineElementTypes.DataFlow_4005));
		entry.setId("createDataFlow3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.DataFlow_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExpUses4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ExpUses4CreationTool_title,
				Messages.ExpUses4CreationTool_desc, Collections.singletonList(PipelineElementTypes.ExportExpUses_4014));
		entry.setId("createExpUses4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportExpUses_4014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImpUses5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ImpUses5CreationTool_title,
				Messages.ImpUses5CreationTool_desc, Collections.singletonList(PipelineElementTypes.ImportImpUses_4013));
		entry.setId("createImpUses5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ImportImpUses_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIntegrationAttributes6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.IntegrationAttributes6CreationTool_title,
				Messages.IntegrationAttributes6CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.IntegrationTaskAttributes_4025));
		entry.setId("createIntegrationAttributes6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.IntegrationTaskAttributes_4025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInternalDFSchema7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InternalDFSchema7CreationTool_title,
				Messages.InternalDFSchema7CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.InternalDataFlowSchema_4024));
		entry.setId("createInternalDFSchema7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.InternalDataFlowSchema_4024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInternalDataFlow8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InternalDataFlow8CreationTool_title,
				Messages.InternalDataFlow8CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.InternalDataFlow_4006));
		entry.setId("createInternalDataFlow8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.InternalDataFlow_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRead9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Read9CreationTool_title,
				Messages.Read9CreationTool_desc, Collections.singletonList(PipelineElementTypes.ImportRead_4021));
		entry.setId("createRead9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ImportRead_4021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWrite10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Write10CreationTool_title,
				Messages.Write10CreationTool_desc, Collections.singletonList(PipelineElementTypes.ExportWrite_4022));
		entry.setId("createWrite10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportWrite_4022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
