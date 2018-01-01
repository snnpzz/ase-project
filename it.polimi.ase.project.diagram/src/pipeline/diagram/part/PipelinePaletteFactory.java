
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
		paletteContainer.add(createClassificationAnalysisOperation2CreationTool());
		paletteContainer.add(createCleaningTask3CreationTool());
		paletteContainer.add(createClusteringAnalysisOperation4CreationTool());
		paletteContainer.add(createCollectionTask5CreationTool());
		paletteContainer.add(createComplexAttribute6CreationTool());
		paletteContainer.add(createDescriptiveAnalysisOperation7CreationTool());
		paletteContainer.add(createExport8CreationTool());
		paletteContainer.add(createExportTask9CreationTool());
		paletteContainer.add(createFile10CreationTool());
		paletteContainer.add(createImport11CreationTool());
		paletteContainer.add(createIntegrationTask12CreationTool());
		paletteContainer.add(createPredefinedCleaningOperation13CreationTool());
		paletteContainer.add(createPredictiveAnalysisOperation14CreationTool());
		paletteContainer.add(createSchema15CreationTool());
		paletteContainer.add(createSimpleAttribute16CreationTool());
		paletteContainer.add(createSource17CreationTool());
		paletteContainer.add(createUserDefinedCleaningOperation18CreationTool());
		paletteContainer.add(createVisualizationTask19CreationTool());
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
		paletteContainer.add(createImpUses3CreationTool());
		paletteContainer.add(createInternalDataFlow4CreationTool());
		paletteContainer.add(createInternalSchema5CreationTool());
		paletteContainer.add(createRead6CreationTool());
		paletteContainer.add(createSchema7CreationTool());
		paletteContainer.add(createWrite8CreationTool());
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
	private ToolEntry createClassificationAnalysisOperation2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ClassificationAnalysisOperation2CreationTool_title,
				Messages.ClassificationAnalysisOperation2CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ClassificationAnalysisOperation_3053));
		entry.setId("createClassificationAnalysisOperation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ClassificationAnalysisOperation_3053));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCleaningTask3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CleaningTask3CreationTool_title,
				Messages.CleaningTask3CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.CleaningTask_2027));
		entry.setId("createCleaningTask3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.CleaningTask_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClusteringAnalysisOperation4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ClusteringAnalysisOperation4CreationTool_title,
				Messages.ClusteringAnalysisOperation4CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ClusteringAnalysisOperation_3055));
		entry.setId("createClusteringAnalysisOperation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ClusteringAnalysisOperation_3055));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollectionTask5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CollectionTask5CreationTool_title,
				Messages.CollectionTask5CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.CollectionTask_2025));
		entry.setId("createCollectionTask5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.CollectionTask_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComplexAttribute6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.ComplexAttribute_3047);
		types.add(PipelineElementTypes.ComplexAttribute_3049);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComplexAttribute6CreationTool_title,
				Messages.ComplexAttribute6CreationTool_desc, types);
		entry.setId("createComplexAttribute6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ComplexAttribute_3047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDescriptiveAnalysisOperation7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DescriptiveAnalysisOperation7CreationTool_title,
				Messages.DescriptiveAnalysisOperation7CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.DescriptiveAnalysisOperation_3052));
		entry.setId("createDescriptiveAnalysisOperation7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.DescriptiveAnalysisOperation_3052));
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
	private ToolEntry createPredefinedCleaningOperation13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PredefinedCleaningOperation13CreationTool_title,
				Messages.PredefinedCleaningOperation13CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.PredefinedCleaningOperation_3051));
		entry.setId("createPredefinedCleaningOperation13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.PredefinedCleaningOperation_3051));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPredictiveAnalysisOperation14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PredictiveAnalysisOperation14CreationTool_title,
				Messages.PredictiveAnalysisOperation14CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.PredictiveAnalysisOperation_3054));
		entry.setId("createPredictiveAnalysisOperation14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.PredictiveAnalysisOperation_3054));
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
	private ToolEntry createSimpleAttribute16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.SimpleAttribute_3046);
		types.add(PipelineElementTypes.SimpleAttribute_3048);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SimpleAttribute16CreationTool_title,
				Messages.SimpleAttribute16CreationTool_desc, types);
		entry.setId("createSimpleAttribute16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.SimpleAttribute_3046));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSource17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Source17CreationTool_title,
				Messages.Source17CreationTool_desc, Collections.singletonList(PipelineElementTypes.Source_2044));
		entry.setId("createSource17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Source_2044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserDefinedCleaningOperation18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserDefinedCleaningOperation18CreationTool_title,
				Messages.UserDefinedCleaningOperation18CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.UserDefinedCleaningOperation_3050));
		entry.setId("createUserDefinedCleaningOperation18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.UserDefinedCleaningOperation_3050));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVisualizationTask19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.VisualizationTask19CreationTool_title,
				Messages.VisualizationTask19CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.VisualizationTask_2029));
		entry.setId("createVisualizationTask19CreationTool"); //$NON-NLS-1$
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
	private ToolEntry createImpUses3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ImpUses3CreationTool_title,
				Messages.ImpUses3CreationTool_desc, Collections.singletonList(PipelineElementTypes.ImportImpUses_4013));
		entry.setId("createImpUses3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ImportImpUses_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInternalDataFlow4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InternalDataFlow4CreationTool_title,
				Messages.InternalDataFlow4CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.InternalDataFlow_4006));
		entry.setId("createInternalDataFlow4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.InternalDataFlow_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInternalSchema5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InternalSchema5CreationTool_title,
				Messages.InternalSchema5CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.InternalDataFlowInternalSchema_4023));
		entry.setId("createInternalSchema5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				PipelineElementTypes.getImageDescriptor(PipelineElementTypes.InternalDataFlowInternalSchema_4023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRead6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Read6CreationTool_title,
				Messages.Read6CreationTool_desc, Collections.singletonList(PipelineElementTypes.ImportRead_4021));
		entry.setId("createRead6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ImportRead_4021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSchema7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Schema7CreationTool_title,
				Messages.Schema7CreationTool_desc, Collections.singletonList(PipelineElementTypes.DataFlowSchema_4019));
		entry.setId("createSchema7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.DataFlowSchema_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWrite8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Write8CreationTool_title,
				Messages.Write8CreationTool_desc, Collections.singletonList(PipelineElementTypes.ExportWrite_4022));
		entry.setId("createWrite8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportWrite_4022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
