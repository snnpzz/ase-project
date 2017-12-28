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

import pipeline.PipelinePackage;
import pipeline.diagram.edit.parts.AnalysisTaskIDEditPart;
import pipeline.diagram.edit.parts.AttributeName2EditPart;
import pipeline.diagram.edit.parts.AttributeNameEditPart;
import pipeline.diagram.edit.parts.ClassificationName2EditPart;
import pipeline.diagram.edit.parts.ClassificationNameEditPart;
import pipeline.diagram.edit.parts.CleaningTaskIDEditPart;
import pipeline.diagram.edit.parts.ClusteringName2EditPart;
import pipeline.diagram.edit.parts.ClusteringNameEditPart;
import pipeline.diagram.edit.parts.CollectionTaskIDEditPart;
import pipeline.diagram.edit.parts.DescriptiveName2EditPart;
import pipeline.diagram.edit.parts.DescriptiveNameEditPart;
import pipeline.diagram.edit.parts.ExportNameEditPart;
import pipeline.diagram.edit.parts.ExportTaskIDEditPart;
import pipeline.diagram.edit.parts.FileNameEditPart;
import pipeline.diagram.edit.parts.ImportNameEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskIDEditPart;
import pipeline.diagram.edit.parts.PredefinedName2EditPart;
import pipeline.diagram.edit.parts.PredefinedNameEditPart;
import pipeline.diagram.edit.parts.PredictiveName2EditPart;
import pipeline.diagram.edit.parts.PredictiveNameEditPart;
import pipeline.diagram.edit.parts.SourceNameEditPart;
import pipeline.diagram.edit.parts.UserDefinedName2EditPart;
import pipeline.diagram.edit.parts.UserDefinedNameEditPart;
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
	private IParser userDefinedName_5078Parser;

	/**
	* @generated
	*/
	private IParser getUserDefinedName_5078Parser() {
		if (userDefinedName_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userDefinedName_5078Parser = parser;
		}
		return userDefinedName_5078Parser;
	}

	/**
	* @generated
	*/
	private IParser descriptiveName_5079Parser;

	/**
	* @generated
	*/
	private IParser getDescriptiveName_5079Parser() {
		if (descriptiveName_5079Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			descriptiveName_5079Parser = parser;
		}
		return descriptiveName_5079Parser;
	}

	/**
	* @generated
	*/
	private IParser classificationName_5080Parser;

	/**
	* @generated
	*/
	private IParser getClassificationName_5080Parser() {
		if (classificationName_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classificationName_5080Parser = parser;
		}
		return classificationName_5080Parser;
	}

	/**
	* @generated
	*/
	private IParser predictiveName_5081Parser;

	/**
	* @generated
	*/
	private IParser getPredictiveName_5081Parser() {
		if (predictiveName_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			predictiveName_5081Parser = parser;
		}
		return predictiveName_5081Parser;
	}

	/**
	* @generated
	*/
	private IParser clusteringName_5082Parser;

	/**
	* @generated
	*/
	private IParser getClusteringName_5082Parser() {
		if (clusteringName_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			clusteringName_5082Parser = parser;
		}
		return clusteringName_5082Parser;
	}

	/**
	* @generated
	*/
	private IParser predefinedName_5083Parser;

	/**
	* @generated
	*/
	private IParser getPredefinedName_5083Parser() {
		if (predefinedName_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			predefinedName_5083Parser = parser;
		}
		return predefinedName_5083Parser;
	}

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
	private IParser sourceName_5086Parser;

	/**
	* @generated
	*/
	private IParser getSourceName_5086Parser() {
		if (sourceName_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getSource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sourceName_5086Parser = parser;
		}
		return sourceName_5086Parser;
	}

	/**
	* @generated
	*/
	private IParser fileName_5087Parser;

	/**
	* @generated
	*/
	private IParser getFileName_5087Parser() {
		if (fileName_5087Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getFile_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fileName_5087Parser = parser;
		}
		return fileName_5087Parser;
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
	private IParser userDefinedName_5060Parser;

	/**
	* @generated
	*/
	private IParser getUserDefinedName_5060Parser() {
		if (userDefinedName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userDefinedName_5060Parser = parser;
		}
		return userDefinedName_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser predefinedName_5061Parser;

	/**
	* @generated
	*/
	private IParser getPredefinedName_5061Parser() {
		if (predefinedName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			predefinedName_5061Parser = parser;
		}
		return predefinedName_5061Parser;
	}

	/**
	* @generated
	*/
	private IParser descriptiveName_5071Parser;

	/**
	* @generated
	*/
	private IParser getDescriptiveName_5071Parser() {
		if (descriptiveName_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			descriptiveName_5071Parser = parser;
		}
		return descriptiveName_5071Parser;
	}

	/**
	* @generated
	*/
	private IParser classificationName_5072Parser;

	/**
	* @generated
	*/
	private IParser getClassificationName_5072Parser() {
		if (classificationName_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classificationName_5072Parser = parser;
		}
		return classificationName_5072Parser;
	}

	/**
	* @generated
	*/
	private IParser predictiveName_5073Parser;

	/**
	* @generated
	*/
	private IParser getPredictiveName_5073Parser() {
		if (predictiveName_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			predictiveName_5073Parser = parser;
		}
		return predictiveName_5073Parser;
	}

	/**
	* @generated
	*/
	private IParser clusteringName_5074Parser;

	/**
	* @generated
	*/
	private IParser getClusteringName_5074Parser() {
		if (clusteringName_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			clusteringName_5074Parser = parser;
		}
		return clusteringName_5074Parser;
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
	private IParser attributeName_5089Parser;

	/**
	* @generated
	*/
	private IParser getAttributeName_5089Parser() {
		if (attributeName_5089Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_5089Parser = parser;
		}
		return attributeName_5089Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeName_5088Parser;

	/**
	* @generated
	*/
	private IParser getAttributeName_5088Parser() {
		if (attributeName_5088Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_5088Parser = parser;
		}
		return attributeName_5088Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UserDefinedNameEditPart.VISUAL_ID:
			return getUserDefinedName_5078Parser();
		case DescriptiveNameEditPart.VISUAL_ID:
			return getDescriptiveName_5079Parser();
		case ClassificationNameEditPart.VISUAL_ID:
			return getClassificationName_5080Parser();
		case PredictiveNameEditPart.VISUAL_ID:
			return getPredictiveName_5081Parser();
		case ClusteringNameEditPart.VISUAL_ID:
			return getClusteringName_5082Parser();
		case PredefinedNameEditPart.VISUAL_ID:
			return getPredefinedName_5083Parser();
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
			return getSourceName_5086Parser();
		case FileNameEditPart.VISUAL_ID:
			return getFileName_5087Parser();
		case ImportNameEditPart.VISUAL_ID:
			return getImportName_5057Parser();
		case UserDefinedName2EditPart.VISUAL_ID:
			return getUserDefinedName_5060Parser();
		case PredefinedName2EditPart.VISUAL_ID:
			return getPredefinedName_5061Parser();
		case DescriptiveName2EditPart.VISUAL_ID:
			return getDescriptiveName_5071Parser();
		case ClassificationName2EditPart.VISUAL_ID:
			return getClassificationName_5072Parser();
		case PredictiveName2EditPart.VISUAL_ID:
			return getPredictiveName_5073Parser();
		case ClusteringName2EditPart.VISUAL_ID:
			return getClusteringName_5074Parser();
		case ExportNameEditPart.VISUAL_ID:
			return getExportName_5076Parser();
		case AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5089Parser();
		case AttributeName2EditPart.VISUAL_ID:
			return getAttributeName_5088Parser();
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
