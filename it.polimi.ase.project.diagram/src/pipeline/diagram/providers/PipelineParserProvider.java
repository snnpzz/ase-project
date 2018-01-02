/*
 * 
 */
package pipeline.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import pipeline.PipelinePackage;
import pipeline.diagram.edit.parts.AnalysisTaskIDEditPart;
import pipeline.diagram.edit.parts.ChartNameEditPart;
import pipeline.diagram.edit.parts.ClassificationAnalysisOperationNameEditPart;
import pipeline.diagram.edit.parts.CleaningTaskIDEditPart;
import pipeline.diagram.edit.parts.ClusteringAnalysisOperationNameEditPart;
import pipeline.diagram.edit.parts.CollectionTaskIDEditPart;
import pipeline.diagram.edit.parts.ComplexAttributeName2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeNameEditPart;
import pipeline.diagram.edit.parts.DescriptiveAnalysisOperationNameEditPart;
import pipeline.diagram.edit.parts.ExportNameEditPart;
import pipeline.diagram.edit.parts.ExportTaskIDEditPart;
import pipeline.diagram.edit.parts.FileNameEditPart;
import pipeline.diagram.edit.parts.ImportNameEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskIDEditPart;
import pipeline.diagram.edit.parts.PredefinedCleaningOperationNameEditPart;
import pipeline.diagram.edit.parts.PredictiveAnalysisOperationNameEditPart;
import pipeline.diagram.edit.parts.SimpleAttributeName2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeNameEditPart;
import pipeline.diagram.edit.parts.SourceNameEditPart;
import pipeline.diagram.edit.parts.UserDefinedCleaningOperationNameEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskIDEditPart;
import pipeline.diagram.parsers.MessageFormatParser;
import pipeline.diagram.part.PipelineVisualIDRegistry;

/**
 * @generated
 */
public class PipelineParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser collectionTaskID_5058Parser;

	/**
	* @generated
	*/
	private IParser getCollectionTaskID_5058Parser() {
		if (collectionTaskID_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionTaskID_5058Parser = parser;
		}
		return collectionTaskID_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser integrationTaskID_5059Parser;

	/**
	* @generated
	*/
	private IParser getIntegrationTaskID_5059Parser() {
		if (integrationTaskID_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			integrationTaskID_5059Parser = parser;
		}
		return integrationTaskID_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser cleaningTaskID_5062Parser;

	/**
	* @generated
	*/
	private IParser getCleaningTaskID_5062Parser() {
		if (cleaningTaskID_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cleaningTaskID_5062Parser = parser;
		}
		return cleaningTaskID_5062Parser;
	}

	/**
	* @generated
	*/
	private IParser analysisTaskID_5075Parser;

	/**
	* @generated
	*/
	private IParser getAnalysisTaskID_5075Parser() {
		if (analysisTaskID_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			analysisTaskID_5075Parser = parser;
		}
		return analysisTaskID_5075Parser;
	}

	/**
	* @generated
	*/
	private IParser visualizationTaskID_5068Parser;

	/**
	* @generated
	*/
	private IParser getVisualizationTaskID_5068Parser() {
		if (visualizationTaskID_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			visualizationTaskID_5068Parser = parser;
		}
		return visualizationTaskID_5068Parser;
	}

	/**
	* @generated
	*/
	private IParser exportTaskID_5077Parser;

	/**
	* @generated
	*/
	private IParser getExportTaskID_5077Parser() {
		if (exportTaskID_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exportTaskID_5077Parser = parser;
		}
		return exportTaskID_5077Parser;
	}

	/**
	* @generated
	*/
	private IParser sourceName_5096Parser;

	/**
	* @generated
	*/
	private IParser getSourceName_5096Parser() {
		if (sourceName_5096Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getSource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sourceName_5096Parser = parser;
		}
		return sourceName_5096Parser;
	}

	/**
	* @generated
	*/
	private IParser fileName_5097Parser;

	/**
	* @generated
	*/
	private IParser getFileName_5097Parser() {
		if (fileName_5097Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getFile_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fileName_5097Parser = parser;
		}
		return fileName_5097Parser;
	}

	/**
	* @generated
	*/
	private IParser chartName_5121Parser;

	/**
	* @generated
	*/
	private IParser getChartName_5121Parser() {
		if (chartName_5121Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getChart_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			chartName_5121Parser = parser;
		}
		return chartName_5121Parser;
	}

	/**
	* @generated
	*/
	private IParser importName_5057Parser;

	/**
	* @generated
	*/
	private IParser getImportName_5057Parser() {
		if (importName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getImport_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			importName_5057Parser = parser;
		}
		return importName_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser userDefinedCleaningOperationName_5115Parser;

	/**
	* @generated
	*/
	private IParser getUserDefinedCleaningOperationName_5115Parser() {
		if (userDefinedCleaningOperationName_5115Parser == null) {
			EAttribute[] features = new EAttribute[] {
					PipelinePackage.eINSTANCE.getUserDefinedCleaningOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userDefinedCleaningOperationName_5115Parser = parser;
		}
		return userDefinedCleaningOperationName_5115Parser;
	}

	/**
	* @generated
	*/
	private IParser predefinedCleaningOperationName_5116Parser;

	/**
	* @generated
	*/
	private IParser getPredefinedCleaningOperationName_5116Parser() {
		if (predefinedCleaningOperationName_5116Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getPredefinedCleaningOperation_Name();
			EnumParser parser = new EnumParser(editableFeature);
			predefinedCleaningOperationName_5116Parser = parser;
		}
		return predefinedCleaningOperationName_5116Parser;
	}

	/**
	* @generated
	*/
	private IParser descriptiveAnalysisOperationName_5117Parser;

	/**
	* @generated
	*/
	private IParser getDescriptiveAnalysisOperationName_5117Parser() {
		if (descriptiveAnalysisOperationName_5117Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getDescriptiveAnalysisOperation_Name();
			EnumParser parser = new EnumParser(editableFeature);
			descriptiveAnalysisOperationName_5117Parser = parser;
		}
		return descriptiveAnalysisOperationName_5117Parser;
	}

	/**
	* @generated
	*/
	private IParser classificationAnalysisOperationName_5118Parser;

	/**
	* @generated
	*/
	private IParser getClassificationAnalysisOperationName_5118Parser() {
		if (classificationAnalysisOperationName_5118Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getClassificationAnalysisOperation_Name();
			EnumParser parser = new EnumParser(editableFeature);
			classificationAnalysisOperationName_5118Parser = parser;
		}
		return classificationAnalysisOperationName_5118Parser;
	}

	/**
	* @generated
	*/
	private IParser predictiveAnalysisOperationName_5119Parser;

	/**
	* @generated
	*/
	private IParser getPredictiveAnalysisOperationName_5119Parser() {
		if (predictiveAnalysisOperationName_5119Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getPredictiveAnalysisOperation_Name();
			EnumParser parser = new EnumParser(editableFeature);
			predictiveAnalysisOperationName_5119Parser = parser;
		}
		return predictiveAnalysisOperationName_5119Parser;
	}

	/**
	* @generated
	*/
	private IParser clusteringAnalysisOperationName_5120Parser;

	/**
	* @generated
	*/
	private IParser getClusteringAnalysisOperationName_5120Parser() {
		if (clusteringAnalysisOperationName_5120Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getClusteringAnalysisOperation_Name();
			EnumParser parser = new EnumParser(editableFeature);
			clusteringAnalysisOperationName_5120Parser = parser;
		}
		return clusteringAnalysisOperationName_5120Parser;
	}

	/**
	* @generated
	*/
	private IParser exportName_5076Parser;

	/**
	* @generated
	*/
	private IParser getExportName_5076Parser() {
		if (exportName_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getExport_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exportName_5076Parser = parser;
		}
		return exportName_5076Parser;
	}

	/**
	* @generated
	*/
	private IParser simpleAttributeName_5098Parser;

	/**
	* @generated
	*/
	private IParser getSimpleAttributeName_5098Parser() {
		if (simpleAttributeName_5098Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			simpleAttributeName_5098Parser = parser;
		}
		return simpleAttributeName_5098Parser;
	}

	/**
	* @generated
	*/
	private IParser complexAttributeName_5101Parser;

	/**
	* @generated
	*/
	private IParser getComplexAttributeName_5101Parser() {
		if (complexAttributeName_5101Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			complexAttributeName_5101Parser = parser;
		}
		return complexAttributeName_5101Parser;
	}

	/**
	* @generated
	*/
	private IParser simpleAttributeName_5099Parser;

	/**
	* @generated
	*/
	private IParser getSimpleAttributeName_5099Parser() {
		if (simpleAttributeName_5099Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			simpleAttributeName_5099Parser = parser;
		}
		return simpleAttributeName_5099Parser;
	}

	/**
	* @generated
	*/
	private IParser complexAttributeName_5100Parser;

	/**
	* @generated
	*/
	private IParser getComplexAttributeName_5100Parser() {
		if (complexAttributeName_5100Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			complexAttributeName_5100Parser = parser;
		}
		return complexAttributeName_5100Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CollectionTaskIDEditPart.VISUAL_ID:
			return getCollectionTaskID_5058Parser();
		case IntegrationTaskIDEditPart.VISUAL_ID:
			return getIntegrationTaskID_5059Parser();
		case CleaningTaskIDEditPart.VISUAL_ID:
			return getCleaningTaskID_5062Parser();
		case AnalysisTaskIDEditPart.VISUAL_ID:
			return getAnalysisTaskID_5075Parser();
		case VisualizationTaskIDEditPart.VISUAL_ID:
			return getVisualizationTaskID_5068Parser();
		case ExportTaskIDEditPart.VISUAL_ID:
			return getExportTaskID_5077Parser();
		case SourceNameEditPart.VISUAL_ID:
			return getSourceName_5096Parser();
		case FileNameEditPart.VISUAL_ID:
			return getFileName_5097Parser();
		case ChartNameEditPart.VISUAL_ID:
			return getChartName_5121Parser();
		case ImportNameEditPart.VISUAL_ID:
			return getImportName_5057Parser();
		case UserDefinedCleaningOperationNameEditPart.VISUAL_ID:
			return getUserDefinedCleaningOperationName_5115Parser();

		case PredefinedCleaningOperationNameEditPart.VISUAL_ID:
			return getPredefinedCleaningOperationName_5116Parser();

		case DescriptiveAnalysisOperationNameEditPart.VISUAL_ID:
			return getDescriptiveAnalysisOperationName_5117Parser();

		case ClassificationAnalysisOperationNameEditPart.VISUAL_ID:
			return getClassificationAnalysisOperationName_5118Parser();

		case PredictiveAnalysisOperationNameEditPart.VISUAL_ID:
			return getPredictiveAnalysisOperationName_5119Parser();

		case ClusteringAnalysisOperationNameEditPart.VISUAL_ID:
			return getClusteringAnalysisOperationName_5120Parser();
		case ExportNameEditPart.VISUAL_ID:
			return getExportName_5076Parser();
		case SimpleAttributeNameEditPart.VISUAL_ID:
			return getSimpleAttributeName_5098Parser();
		case ComplexAttributeNameEditPart.VISUAL_ID:
			return getComplexAttributeName_5101Parser();
		case SimpleAttributeName2EditPart.VISUAL_ID:
			return getSimpleAttributeName_5099Parser();
		case ComplexAttributeName2EditPart.VISUAL_ID:
			return getComplexAttributeName_5100Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(PipelineVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(PipelineVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (PipelineElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
