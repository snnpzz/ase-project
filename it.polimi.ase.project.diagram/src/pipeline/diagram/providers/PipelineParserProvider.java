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
import pipeline.diagram.edit.parts.ChartTitleEditPart;
import pipeline.diagram.edit.parts.ClassificationAnalysisOperationNameEditPart;
import pipeline.diagram.edit.parts.CleaningTaskIDEditPart;
import pipeline.diagram.edit.parts.ClusteringAnalysisOperationNameEditPart;
import pipeline.diagram.edit.parts.CollectionTaskIDEditPart;
import pipeline.diagram.edit.parts.ComplexAttributeName2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeNameEditPart;
import pipeline.diagram.edit.parts.DescriptiveAnalysisOperationNameEditPart;
import pipeline.diagram.edit.parts.ExportOperationIDEditPart;
import pipeline.diagram.edit.parts.ExportTaskIDEditPart;
import pipeline.diagram.edit.parts.FileNameEditPart;
import pipeline.diagram.edit.parts.ImportOperationIDEditPart;
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
	private IParser collectionTaskID_5002Parser;

	/**
	* @generated
	*/
	private IParser getCollectionTaskID_5002Parser() {
		if (collectionTaskID_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionTaskID_5002Parser = parser;
		}
		return collectionTaskID_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser integrationTaskID_5003Parser;

	/**
	* @generated
	*/
	private IParser getIntegrationTaskID_5003Parser() {
		if (integrationTaskID_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			integrationTaskID_5003Parser = parser;
		}
		return integrationTaskID_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser cleaningTaskID_5006Parser;

	/**
	* @generated
	*/
	private IParser getCleaningTaskID_5006Parser() {
		if (cleaningTaskID_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cleaningTaskID_5006Parser = parser;
		}
		return cleaningTaskID_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser analysisTaskID_5011Parser;

	/**
	* @generated
	*/
	private IParser getAnalysisTaskID_5011Parser() {
		if (analysisTaskID_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			analysisTaskID_5011Parser = parser;
		}
		return analysisTaskID_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser visualizationTaskID_5012Parser;

	/**
	* @generated
	*/
	private IParser getVisualizationTaskID_5012Parser() {
		if (visualizationTaskID_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			visualizationTaskID_5012Parser = parser;
		}
		return visualizationTaskID_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser exportTaskID_5014Parser;

	/**
	* @generated
	*/
	private IParser getExportTaskID_5014Parser() {
		if (exportTaskID_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exportTaskID_5014Parser = parser;
		}
		return exportTaskID_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser sourceName_5015Parser;

	/**
	* @generated
	*/
	private IParser getSourceName_5015Parser() {
		if (sourceName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getSource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sourceName_5015Parser = parser;
		}
		return sourceName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser fileName_5016Parser;

	/**
	* @generated
	*/
	private IParser getFileName_5016Parser() {
		if (fileName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getFile_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fileName_5016Parser = parser;
		}
		return fileName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser chartTitle_5021Parser;

	/**
	* @generated
	*/
	private IParser getChartTitle_5021Parser() {
		if (chartTitle_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getChart_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			chartTitle_5021Parser = parser;
		}
		return chartTitle_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser importOperationID_5001Parser;

	/**
	* @generated
	*/
	private IParser getImportOperationID_5001Parser() {
		if (importOperationID_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getImportOperation_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			importOperationID_5001Parser = parser;
		}
		return importOperationID_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser userDefinedCleaningOperationName_5004Parser;

	/**
	* @generated
	*/
	private IParser getUserDefinedCleaningOperationName_5004Parser() {
		if (userDefinedCleaningOperationName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					PipelinePackage.eINSTANCE.getUserDefinedCleaningOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userDefinedCleaningOperationName_5004Parser = parser;
		}
		return userDefinedCleaningOperationName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser predefinedCleaningOperationName_5005Parser;

	/**
	* @generated
	*/
	private IParser getPredefinedCleaningOperationName_5005Parser() {
		if (predefinedCleaningOperationName_5005Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getPredefinedCleaningOperation_Name();
			EnumParser parser = new EnumParser(editableFeature);
			predefinedCleaningOperationName_5005Parser = parser;
		}
		return predefinedCleaningOperationName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser descriptiveAnalysisOperationName_5007Parser;

	/**
	* @generated
	*/
	private IParser getDescriptiveAnalysisOperationName_5007Parser() {
		if (descriptiveAnalysisOperationName_5007Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getDescriptiveAnalysisOperation_Name();
			EnumParser parser = new EnumParser(editableFeature);
			descriptiveAnalysisOperationName_5007Parser = parser;
		}
		return descriptiveAnalysisOperationName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser classificationAnalysisOperationName_5008Parser;

	/**
	* @generated
	*/
	private IParser getClassificationAnalysisOperationName_5008Parser() {
		if (classificationAnalysisOperationName_5008Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getClassificationAnalysisOperation_Name();
			EnumParser parser = new EnumParser(editableFeature);
			classificationAnalysisOperationName_5008Parser = parser;
		}
		return classificationAnalysisOperationName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser predictiveAnalysisOperationName_5009Parser;

	/**
	* @generated
	*/
	private IParser getPredictiveAnalysisOperationName_5009Parser() {
		if (predictiveAnalysisOperationName_5009Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getPredictiveAnalysisOperation_Name();
			EnumParser parser = new EnumParser(editableFeature);
			predictiveAnalysisOperationName_5009Parser = parser;
		}
		return predictiveAnalysisOperationName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser clusteringAnalysisOperationName_5010Parser;

	/**
	* @generated
	*/
	private IParser getClusteringAnalysisOperationName_5010Parser() {
		if (clusteringAnalysisOperationName_5010Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getClusteringAnalysisOperation_Name();
			EnumParser parser = new EnumParser(editableFeature);
			clusteringAnalysisOperationName_5010Parser = parser;
		}
		return clusteringAnalysisOperationName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser exportOperationID_5013Parser;

	/**
	* @generated
	*/
	private IParser getExportOperationID_5013Parser() {
		if (exportOperationID_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getExportOperation_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exportOperationID_5013Parser = parser;
		}
		return exportOperationID_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser simpleAttributeName_5017Parser;

	/**
	* @generated
	*/
	private IParser getSimpleAttributeName_5017Parser() {
		if (simpleAttributeName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			simpleAttributeName_5017Parser = parser;
		}
		return simpleAttributeName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser complexAttributeName_5020Parser;

	/**
	* @generated
	*/
	private IParser getComplexAttributeName_5020Parser() {
		if (complexAttributeName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			complexAttributeName_5020Parser = parser;
		}
		return complexAttributeName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser simpleAttributeName_5018Parser;

	/**
	* @generated
	*/
	private IParser getSimpleAttributeName_5018Parser() {
		if (simpleAttributeName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			simpleAttributeName_5018Parser = parser;
		}
		return simpleAttributeName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser complexAttributeName_5019Parser;

	/**
	* @generated
	*/
	private IParser getComplexAttributeName_5019Parser() {
		if (complexAttributeName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			complexAttributeName_5019Parser = parser;
		}
		return complexAttributeName_5019Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CollectionTaskIDEditPart.VISUAL_ID:
			return getCollectionTaskID_5002Parser();
		case IntegrationTaskIDEditPart.VISUAL_ID:
			return getIntegrationTaskID_5003Parser();
		case CleaningTaskIDEditPart.VISUAL_ID:
			return getCleaningTaskID_5006Parser();
		case AnalysisTaskIDEditPart.VISUAL_ID:
			return getAnalysisTaskID_5011Parser();
		case VisualizationTaskIDEditPart.VISUAL_ID:
			return getVisualizationTaskID_5012Parser();
		case ExportTaskIDEditPart.VISUAL_ID:
			return getExportTaskID_5014Parser();
		case SourceNameEditPart.VISUAL_ID:
			return getSourceName_5015Parser();
		case FileNameEditPart.VISUAL_ID:
			return getFileName_5016Parser();
		case ChartTitleEditPart.VISUAL_ID:
			return getChartTitle_5021Parser();
		case ImportOperationIDEditPart.VISUAL_ID:
			return getImportOperationID_5001Parser();
		case UserDefinedCleaningOperationNameEditPart.VISUAL_ID:
			return getUserDefinedCleaningOperationName_5004Parser();

		case PredefinedCleaningOperationNameEditPart.VISUAL_ID:
			return getPredefinedCleaningOperationName_5005Parser();

		case DescriptiveAnalysisOperationNameEditPart.VISUAL_ID:
			return getDescriptiveAnalysisOperationName_5007Parser();

		case ClassificationAnalysisOperationNameEditPart.VISUAL_ID:
			return getClassificationAnalysisOperationName_5008Parser();

		case PredictiveAnalysisOperationNameEditPart.VISUAL_ID:
			return getPredictiveAnalysisOperationName_5009Parser();

		case ClusteringAnalysisOperationNameEditPart.VISUAL_ID:
			return getClusteringAnalysisOperationName_5010Parser();
		case ExportOperationIDEditPart.VISUAL_ID:
			return getExportOperationID_5013Parser();
		case SimpleAttributeNameEditPart.VISUAL_ID:
			return getSimpleAttributeName_5017Parser();
		case ComplexAttributeNameEditPart.VISUAL_ID:
			return getComplexAttributeName_5020Parser();
		case SimpleAttributeName2EditPart.VISUAL_ID:
			return getSimpleAttributeName_5018Parser();
		case ComplexAttributeName2EditPart.VISUAL_ID:
			return getComplexAttributeName_5019Parser();
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
