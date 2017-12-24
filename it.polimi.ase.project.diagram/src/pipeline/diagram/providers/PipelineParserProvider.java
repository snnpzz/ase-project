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
import pipeline.diagram.edit.parts.AnalyzesTaskNameEditPart;
import pipeline.diagram.edit.parts.ClassificationNameEditPart;
import pipeline.diagram.edit.parts.CleaningTaskNameEditPart;
import pipeline.diagram.edit.parts.ClusteringNameEditPart;
import pipeline.diagram.edit.parts.CollectionTaskNameEditPart;
import pipeline.diagram.edit.parts.DescriptiveNameEditPart;
import pipeline.diagram.edit.parts.ExportNameEditPart;
import pipeline.diagram.edit.parts.ExportingTaskNameEditPart;
import pipeline.diagram.edit.parts.ImportNameEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskNameEditPart;
import pipeline.diagram.edit.parts.PredefinedNameEditPart;
import pipeline.diagram.edit.parts.PredictiveNameEditPart;
import pipeline.diagram.edit.parts.UserDefinedNameEditPart;
import pipeline.diagram.edit.parts.VisualizationTaskNameEditPart;
import pipeline.diagram.parsers.MessageFormatParser;
import pipeline.diagram.part.PipelineVisualIDRegistry;

/**
 * @generated
 */
public class PipelineParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser collectionTaskName_5038Parser;

	/**
	* @generated
	*/
	private IParser getCollectionTaskName_5038Parser() {
		if (collectionTaskName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionTaskName_5038Parser = parser;
		}
		return collectionTaskName_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser integrationTaskName_5039Parser;

	/**
	* @generated
	*/
	private IParser getIntegrationTaskName_5039Parser() {
		if (integrationTaskName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			integrationTaskName_5039Parser = parser;
		}
		return integrationTaskName_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser cleaningTaskName_5042Parser;

	/**
	* @generated
	*/
	private IParser getCleaningTaskName_5042Parser() {
		if (cleaningTaskName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cleaningTaskName_5042Parser = parser;
		}
		return cleaningTaskName_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser analyzesTaskName_5047Parser;

	/**
	* @generated
	*/
	private IParser getAnalyzesTaskName_5047Parser() {
		if (analyzesTaskName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			analyzesTaskName_5047Parser = parser;
		}
		return analyzesTaskName_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser visualizationTaskName_5048Parser;

	/**
	* @generated
	*/
	private IParser getVisualizationTaskName_5048Parser() {
		if (visualizationTaskName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			visualizationTaskName_5048Parser = parser;
		}
		return visualizationTaskName_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser exportingTaskName_5050Parser;

	/**
	* @generated
	*/
	private IParser getExportingTaskName_5050Parser() {
		if (exportingTaskName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exportingTaskName_5050Parser = parser;
		}
		return exportingTaskName_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser importName_5037Parser;

	/**
	* @generated
	*/
	private IParser getImportName_5037Parser() {
		if (importName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getImport_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			importName_5037Parser = parser;
		}
		return importName_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser userDefinedName_5040Parser;

	/**
	* @generated
	*/
	private IParser getUserDefinedName_5040Parser() {
		if (userDefinedName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userDefinedName_5040Parser = parser;
		}
		return userDefinedName_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser predefinedName_5041Parser;

	/**
	* @generated
	*/
	private IParser getPredefinedName_5041Parser() {
		if (predefinedName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			predefinedName_5041Parser = parser;
		}
		return predefinedName_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser descriptiveName_5043Parser;

	/**
	* @generated
	*/
	private IParser getDescriptiveName_5043Parser() {
		if (descriptiveName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			descriptiveName_5043Parser = parser;
		}
		return descriptiveName_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser classificationName_5044Parser;

	/**
	* @generated
	*/
	private IParser getClassificationName_5044Parser() {
		if (classificationName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classificationName_5044Parser = parser;
		}
		return classificationName_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser predictiveName_5045Parser;

	/**
	* @generated
	*/
	private IParser getPredictiveName_5045Parser() {
		if (predictiveName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			predictiveName_5045Parser = parser;
		}
		return predictiveName_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser clusteringName_5046Parser;

	/**
	* @generated
	*/
	private IParser getClusteringName_5046Parser() {
		if (clusteringName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			clusteringName_5046Parser = parser;
		}
		return clusteringName_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser exportName_5049Parser;

	/**
	* @generated
	*/
	private IParser getExportName_5049Parser() {
		if (exportName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getExport_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exportName_5049Parser = parser;
		}
		return exportName_5049Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CollectionTaskNameEditPart.VISUAL_ID:
			return getCollectionTaskName_5038Parser();
		case IntegrationTaskNameEditPart.VISUAL_ID:
			return getIntegrationTaskName_5039Parser();
		case CleaningTaskNameEditPart.VISUAL_ID:
			return getCleaningTaskName_5042Parser();
		case AnalyzesTaskNameEditPart.VISUAL_ID:
			return getAnalyzesTaskName_5047Parser();
		case VisualizationTaskNameEditPart.VISUAL_ID:
			return getVisualizationTaskName_5048Parser();
		case ExportingTaskNameEditPart.VISUAL_ID:
			return getExportingTaskName_5050Parser();
		case ImportNameEditPart.VISUAL_ID:
			return getImportName_5037Parser();
		case UserDefinedNameEditPart.VISUAL_ID:
			return getUserDefinedName_5040Parser();
		case PredefinedNameEditPart.VISUAL_ID:
			return getPredefinedName_5041Parser();
		case DescriptiveNameEditPart.VISUAL_ID:
			return getDescriptiveName_5043Parser();
		case ClassificationNameEditPart.VISUAL_ID:
			return getClassificationName_5044Parser();
		case PredictiveNameEditPart.VISUAL_ID:
			return getPredictiveName_5045Parser();
		case ClusteringNameEditPart.VISUAL_ID:
			return getClusteringName_5046Parser();
		case ExportNameEditPart.VISUAL_ID:
			return getExportName_5049Parser();
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
