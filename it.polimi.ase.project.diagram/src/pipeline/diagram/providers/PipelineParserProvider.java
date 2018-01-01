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
import pipeline.diagram.edit.parts.ClassificationNameEditPart;
import pipeline.diagram.edit.parts.CleaningTaskIDEditPart;
import pipeline.diagram.edit.parts.ClusteringNameEditPart;
import pipeline.diagram.edit.parts.CollectionTaskIDEditPart;
import pipeline.diagram.edit.parts.ComplexAttributeName2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeNameEditPart;
import pipeline.diagram.edit.parts.DescriptiveNameEditPart;
import pipeline.diagram.edit.parts.ExportNameEditPart;
import pipeline.diagram.edit.parts.ExportTaskIDEditPart;
import pipeline.diagram.edit.parts.FileNameEditPart;
import pipeline.diagram.edit.parts.ImportNameEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskIDEditPart;
import pipeline.diagram.edit.parts.PredefinedNameEditPart;
import pipeline.diagram.edit.parts.PredictiveNameEditPart;
import pipeline.diagram.edit.parts.SimpleAttributeName2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeNameEditPart;
import pipeline.diagram.edit.parts.SourceNameEditPart;
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
	private IParser userDefinedName_5090Parser;

	/**
	* @generated
	*/
	private IParser getUserDefinedName_5090Parser() {
		if (userDefinedName_5090Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getUserDefined_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userDefinedName_5090Parser = parser;
		}
		return userDefinedName_5090Parser;
	}

	/**
	* @generated
	*/
	private IParser predefinedName_5091Parser;

	/**
	* @generated
	*/
	private IParser getPredefinedName_5091Parser() {
		if (predefinedName_5091Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getPredefined_Name();
			EnumParser parser = new EnumParser(editableFeature);
			predefinedName_5091Parser = parser;
		}
		return predefinedName_5091Parser;
	}

	/**
	* @generated
	*/
	private IParser descriptiveName_5092Parser;

	/**
	* @generated
	*/
	private IParser getDescriptiveName_5092Parser() {
		if (descriptiveName_5092Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getDescriptive_Name();
			EnumParser parser = new EnumParser(editableFeature);
			descriptiveName_5092Parser = parser;
		}
		return descriptiveName_5092Parser;
	}

	/**
	* @generated
	*/
	private IParser classificationName_5093Parser;

	/**
	* @generated
	*/
	private IParser getClassificationName_5093Parser() {
		if (classificationName_5093Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getClassification_Name();
			EnumParser parser = new EnumParser(editableFeature);
			classificationName_5093Parser = parser;
		}
		return classificationName_5093Parser;
	}

	/**
	* @generated
	*/
	private IParser predictiveName_5094Parser;

	/**
	* @generated
	*/
	private IParser getPredictiveName_5094Parser() {
		if (predictiveName_5094Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getPredictive_Name();
			EnumParser parser = new EnumParser(editableFeature);
			predictiveName_5094Parser = parser;
		}
		return predictiveName_5094Parser;
	}

	/**
	* @generated
	*/
	private IParser clusteringName_5095Parser;

	/**
	* @generated
	*/
	private IParser getClusteringName_5095Parser() {
		if (clusteringName_5095Parser == null) {
			EAttribute editableFeature = PipelinePackage.eINSTANCE.getClustering_Name();
			EnumParser parser = new EnumParser(editableFeature);
			clusteringName_5095Parser = parser;
		}
		return clusteringName_5095Parser;
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
		case ImportNameEditPart.VISUAL_ID:
			return getImportName_5057Parser();
		case UserDefinedNameEditPart.VISUAL_ID:
			return getUserDefinedName_5090Parser();

		case PredefinedNameEditPart.VISUAL_ID:
			return getPredefinedName_5091Parser();

		case DescriptiveNameEditPart.VISUAL_ID:
			return getDescriptiveName_5092Parser();

		case ClassificationNameEditPart.VISUAL_ID:
			return getClassificationName_5093Parser();

		case PredictiveNameEditPart.VISUAL_ID:
			return getPredictiveName_5094Parser();

		case ClusteringNameEditPart.VISUAL_ID:
			return getClusteringName_5095Parser();
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
