
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
		paletteContainer.add(createCleaningTask3CreationTool());
		paletteContainer.add(createCollectionTask4CreationTool());
		paletteContainer.add(createComplexAttribute5CreationTool());
		paletteContainer.add(createExportOperation6CreationTool());
		paletteContainer.add(createExportTask7CreationTool());
		paletteContainer.add(createFile8CreationTool());
		paletteContainer.add(createImportOperation9CreationTool());
		paletteContainer.add(createIntegrationTask10CreationTool());
		paletteContainer.add(createSchema11CreationTool());
		paletteContainer.add(createSimpleAttribute12CreationTool());
		paletteContainer.add(createSource13CreationTool());
		paletteContainer.add(createVisualizationTask14CreationTool());
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
		paletteContainer.add(createInternalDFSchema4CreationTool());
		paletteContainer.add(createInternalDataFlow5CreationTool());
		paletteContainer.add(createRead6CreationTool());
		paletteContainer.add(createUse7CreationTool());
		paletteContainer.add(createUse8CreationTool());
		paletteContainer.add(createWrite9CreationTool());
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
	private ToolEntry createCleaningTask3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CleaningTask3CreationTool_title,
				Messages.CleaningTask3CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.CleaningTask_2003));
		entry.setId("createCleaningTask3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.CleaningTask_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCollectionTask4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CollectionTask4CreationTool_title,
				Messages.CollectionTask4CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.CollectionTask_2001));
		entry.setId("createCollectionTask4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.CollectionTask_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComplexAttribute5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.ComplexAttribute_3004);
		types.add(PipelineElementTypes.ComplexAttribute_3006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComplexAttribute5CreationTool_title,
				Messages.ComplexAttribute5CreationTool_desc, types);
		entry.setId("createComplexAttribute5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ComplexAttribute_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExportOperation6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExportOperation6CreationTool_title,
				Messages.ExportOperation6CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ExportOperation_3002));
		entry.setId("createExportOperation6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportOperation_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExportTask7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ExportTask7CreationTool_title,
				Messages.ExportTask7CreationTool_desc, Collections.singletonList(PipelineElementTypes.ExportTask_2006));
		entry.setId("createExportTask7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportTask_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFile8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.File8CreationTool_title,
				Messages.File8CreationTool_desc, Collections.singletonList(PipelineElementTypes.File_2008));
		entry.setId("createFile8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.File_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImportOperation9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ImportOperation9CreationTool_title,
				Messages.ImportOperation9CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ImportOperation_3001));
		entry.setId("createImportOperation9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ImportOperation_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIntegrationTask10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IntegrationTask10CreationTool_title,
				Messages.IntegrationTask10CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.IntegrationTask_2002));
		entry.setId("createIntegrationTask10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.IntegrationTask_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSchema11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Schema11CreationTool_title,
				Messages.Schema11CreationTool_desc, Collections.singletonList(PipelineElementTypes.Schema_2009));
		entry.setId("createSchema11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Schema_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSimpleAttribute12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PipelineElementTypes.SimpleAttribute_3003);
		types.add(PipelineElementTypes.SimpleAttribute_3005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SimpleAttribute12CreationTool_title,
				Messages.SimpleAttribute12CreationTool_desc, types);
		entry.setId("createSimpleAttribute12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.SimpleAttribute_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSource13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Source13CreationTool_title,
				Messages.Source13CreationTool_desc, Collections.singletonList(PipelineElementTypes.Source_2007));
		entry.setId("createSource13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.Source_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVisualizationTask14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.VisualizationTask14CreationTool_title,
				Messages.VisualizationTask14CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.VisualizationTask_2005));
		entry.setId("createVisualizationTask14CreationTool"); //$NON-NLS-1$
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
	private ToolEntry createInternalDFSchema4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InternalDFSchema4CreationTool_title,
				Messages.InternalDFSchema4CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.InternalDataFlowSchema_4004));
		entry.setId("createInternalDFSchema4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.InternalDataFlowSchema_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInternalDataFlow5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InternalDataFlow5CreationTool_title,
				Messages.InternalDataFlow5CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.InternalDataFlow_4002));
		entry.setId("createInternalDataFlow5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.InternalDataFlow_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRead6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Read6CreationTool_title,
				Messages.Read6CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ImportOperationRead_4006));
		entry.setId("createRead6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ImportOperationRead_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUse7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Use7CreationTool_title,
				Messages.Use7CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ImportOperationUse_4007));
		entry.setId("createUse7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ImportOperationUse_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUse8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Use8CreationTool_title,
				Messages.Use8CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ExportOperationUse_4008));
		entry.setId("createUse8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportOperationUse_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWrite9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Write9CreationTool_title,
				Messages.Write9CreationTool_desc,
				Collections.singletonList(PipelineElementTypes.ExportOperationWrite_4009));
		entry.setId("createWrite9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PipelineElementTypes.getImageDescriptor(PipelineElementTypes.ExportOperationWrite_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
