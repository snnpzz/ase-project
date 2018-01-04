
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
		paletteContainer.add(createClassificationAnalysisOperation3CreationTool());
		paletteContainer.add(createCleaningTask4CreationTool());
		paletteContainer.add(createClusteringAnalysisOperation5CreationTool());
		paletteContainer.add(createCollectionTask6CreationTool());
		paletteContainer.add(createComplexAttribute7CreationTool());
		paletteContainer.add(createDescriptiveAnalysisOperation8CreationTool());
		paletteContainer.add(createExportOperation9CreationTool());
		paletteContainer.add(createExportTask10CreationTool());
		paletteContainer.add(createFile11CreationTool());
		paletteContainer.add(createImportOperation12CreationTool());
		paletteContainer.add(createIntegrationTask13CreationTool());
		paletteContainer.add(createPredefinedCleaningOperation14CreationTool());
		paletteContainer.add(createPredictiveAnalysisOperation15CreationTool());
		paletteContainer.add(createSchema16CreationTool());
		paletteContainer.add(createSimpleAttribute17CreationTool());
		paletteContainer.add(createSource18CreationTool());
		paletteContainer.add(createUserDefinedCleaningOperation19CreationTool());
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
				Collections.singletonList(PipelineElementTypes.AnalysisTask_2004));
		entry.setId("createAnalysisTask1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.AnalysisTask_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createChart2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Chart2CreationTool_title,
				Messages.Chart2CreationTool_desc, Collections.singletonList(PipelineElementTypes.Chart_2010));
		entry.setId("createChart2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Chart_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClassificationAnalysisOperation3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ClassificationAnalysisOperation3CreationTool_title,
				Messages.ClassificationAnalysisOperation3CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ClassificationAnalysisOperation_3005));
		entry.setId("createClassificationAnalysisOperation3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ClassificationAnalysisOperation_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCleaningTask4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CleaningTask4CreationTool_title,
				Messages.CleaningTask4CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.CleaningTask_2003));
		entry.setId("createCleaningTask4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.CleaningTask_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClusteringAnalysisOperation5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ClusteringAnalysisOperation5CreationTool_title,
				Messages.ClusteringAnalysisOperation5CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ClusteringAnalysisOperation_3007));
		entry.setId("createClusteringAnalysisOperation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ClusteringAnalysisOperation_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollectionTask6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CollectionTask6CreationTool_title,
				Messages.CollectionTask6CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.CollectionTask_2001));
		entry.setId("createCollectionTask6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.CollectionTask_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComplexAttribute7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.ComplexAttribute_3010);
		types.add(PipelineElementTypes.ComplexAttribute_3012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComplexAttribute7CreationTool_title,
				Messages.ComplexAttribute7CreationTool_desc, types);
		entry.setId("createComplexAttribute7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ComplexAttribute_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDescriptiveAnalysisOperation8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DescriptiveAnalysisOperation8CreationTool_title,
				Messages.DescriptiveAnalysisOperation8CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.DescriptiveAnalysisOperation_3004));
		entry.setId("createDescriptiveAnalysisOperation8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.DescriptiveAnalysisOperation_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExportOperation9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExportOperation9CreationTool_title,
				Messages.ExportOperation9CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ExportOperation_3008));
		entry.setId("createExportOperation9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportOperation_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExportTask10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExportTask10CreationTool_title,
				Messages.ExportTask10CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ExportTask_2006));
		entry.setId("createExportTask10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportTask_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFile11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.File11CreationTool_title,
				Messages.File11CreationTool_desc, Collections.singletonList(PipelineElementTypes.File_2008));
		entry.setId("createFile11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.File_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImportOperation12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ImportOperation12CreationTool_title,
				Messages.ImportOperation12CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ImportOperation_3001));
		entry.setId("createImportOperation12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ImportOperation_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIntegrationTask13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IntegrationTask13CreationTool_title,
				Messages.IntegrationTask13CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.IntegrationTask_2002));
		entry.setId("createIntegrationTask13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.IntegrationTask_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredefinedCleaningOperation14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PredefinedCleaningOperation14CreationTool_title,
				Messages.PredefinedCleaningOperation14CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.PredefinedCleaningOperation_3003));
		entry.setId("createPredefinedCleaningOperation14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.PredefinedCleaningOperation_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredictiveAnalysisOperation15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PredictiveAnalysisOperation15CreationTool_title,
				Messages.PredictiveAnalysisOperation15CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.PredictiveAnalysisOperation_3006));
		entry.setId("createPredictiveAnalysisOperation15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.PredictiveAnalysisOperation_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSchema16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Schema16CreationTool_title,
				Messages.Schema16CreationTool_desc, Collections.singletonList(PipelineElementTypes.Schema_2009));
		entry.setId("createSchema16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Schema_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSimpleAttribute17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.SimpleAttribute_3009);
		types.add(PipelineElementTypes.SimpleAttribute_3011);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SimpleAttribute17CreationTool_title,
				Messages.SimpleAttribute17CreationTool_desc, types);
		entry.setId("createSimpleAttribute17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.SimpleAttribute_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSource18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Source18CreationTool_title,
				Messages.Source18CreationTool_desc, Collections.singletonList(PipelineElementTypes.Source_2007));
		entry.setId("createSource18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Source_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserDefinedCleaningOperation19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserDefinedCleaningOperation19CreationTool_title,
				Messages.UserDefinedCleaningOperation19CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.UserDefinedCleaningOperation_3002));
		entry.setId("createUserDefinedCleaningOperation19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.UserDefinedCleaningOperation_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVisualizationTask20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.VisualizationTask20CreationTool_title,
				Messages.VisualizationTask20CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.VisualizationTask_2005));
		entry.setId("createVisualizationTask20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.VisualizationTask_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAxes1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Axes1CreationTool_title,
				Messages.Axes1CreationTool_desc, Collections.singletonList(PipelineElementTypes.ChartAxes_4010));
		entry.setId("createAxes1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ChartAxes_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDFSchema2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DFSchema2CreationTool_title,
				Messages.DFSchema2CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.DataFlowSchema_4003));
		entry.setId("createDFSchema2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.DataFlowSchema_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataFlow3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DataFlow3CreationTool_title,
				Messages.DataFlow3CreationTool_desc, Collections.singletonList(PipelineElementTypes.DataFlow_4001));
		entry.setId("createDataFlow3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.DataFlow_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExpUses4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ExpUses4CreationTool_title,
				Messages.ExpUses4CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ExportOperationExpUses_4009));
		entry.setId("createExpUses4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportOperationExpUses_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImpUses5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ImpUses5CreationTool_title,
				Messages.ImpUses5CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ImportOperationImpUses_4007));
		entry.setId("createImpUses5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ImportOperationImpUses_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIntegrationAttributes6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.IntegrationAttributes6CreationTool_title,
				Messages.IntegrationAttributes6CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.IntegrationTaskAttributes_4005));
		entry.setId("createIntegrationAttributes6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.IntegrationTaskAttributes_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInternalDFSchema7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InternalDFSchema7CreationTool_title,
				Messages.InternalDFSchema7CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.InternalDataFlowSchema_4004));
		entry.setId("createInternalDFSchema7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.InternalDataFlowSchema_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInternalDataFlow8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InternalDataFlow8CreationTool_title,
				Messages.InternalDataFlow8CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.InternalDataFlow_4002));
		entry.setId("createInternalDataFlow8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.InternalDataFlow_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRead9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Read9CreationTool_title,
				Messages.Read9CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ImportOperationRead_4006));
		entry.setId("createRead9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ImportOperationRead_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWrite10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Write10CreationTool_title,
				Messages.Write10CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ExportOperationWrite_4008));
		entry.setId("createWrite10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportOperationWrite_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
