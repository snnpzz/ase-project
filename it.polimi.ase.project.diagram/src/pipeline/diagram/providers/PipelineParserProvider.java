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
	private IParser collectionTaskName_5058Parser;

	/**
	* @generated
	*/
	private IParser getCollectionTaskName_5058Parser() {
		if (collectionTaskName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionTaskName_5058Parser = parser;
		}
		return collectionTaskName_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser integrationTaskName_5059Parser;

	/**
	* @generated
	*/
	private IParser getIntegrationTaskName_5059Parser() {
		if (integrationTaskName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			integrationTaskName_5059Parser = parser;
		}
		return integrationTaskName_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser cleaningTaskName_5062Parser;

	/**
	* @generated
	*/
	private IParser getCleaningTaskName_5062Parser() {
		if (cleaningTaskName_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cleaningTaskName_5062Parser = parser;
		}
		return cleaningTaskName_5062Parser;
	}

	/**
	* @generated
	*/
	private IParser analyzesTaskName_5067Parser;

	/**
	* @generated
	*/
	private IParser getAnalyzesTaskName_5067Parser() {
		if (analyzesTaskName_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			analyzesTaskName_5067Parser = parser;
		}
		return analyzesTaskName_5067Parser;
	}

	/**
	* @generated
	*/
	private IParser visualizationTaskName_5068Parser;

	/**
	* @generated
	*/
	private IParser getVisualizationTaskName_5068Parser() {
		if (visualizationTaskName_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			visualizationTaskName_5068Parser = parser;
		}
		return visualizationTaskName_5068Parser;
	}

	/**
	* @generated
	*/
	private IParser exportingTaskName_5070Parser;

	/**
	* @generated
	*/
	private IParser getExportingTaskName_5070Parser() {
		if (exportingTaskName_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exportingTaskName_5070Parser = parser;
		}
		return exportingTaskName_5070Parser;
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
	private IParser descriptiveName_5063Parser;

	/**
	* @generated
	*/
	private IParser getDescriptiveName_5063Parser() {
		if (descriptiveName_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			descriptiveName_5063Parser = parser;
		}
		return descriptiveName_5063Parser;
	}

	/**
	* @generated
	*/
	private IParser classificationName_5064Parser;

	/**
	* @generated
	*/
	private IParser getClassificationName_5064Parser() {
		if (classificationName_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			classificationName_5064Parser = parser;
		}
		return classificationName_5064Parser;
	}

	/**
	* @generated
	*/
	private IParser predictiveName_5065Parser;

	/**
	* @generated
	*/
	private IParser getPredictiveName_5065Parser() {
		if (predictiveName_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			predictiveName_5065Parser = parser;
		}
		return predictiveName_5065Parser;
	}

	/**
	* @generated
	*/
	private IParser clusteringName_5066Parser;

	/**
	* @generated
	*/
	private IParser getClusteringName_5066Parser() {
		if (clusteringName_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			clusteringName_5066Parser = parser;
		}
		return clusteringName_5066Parser;
	}

	/**
	* @generated
	*/
	private IParser exportName_5069Parser;

	/**
	* @generated
	*/
	private IParser getExportName_5069Parser() {
		if (exportName_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getExport_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exportName_5069Parser = parser;
		}
		return exportName_5069Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CollectionTaskNameEditPart.VISUAL_ID:
			return getCollectionTaskName_5058Parser();
		case IntegrationTaskNameEditPart.VISUAL_ID:
			return getIntegrationTaskName_5059Parser();
		case CleaningTaskNameEditPart.VISUAL_ID:
			return getCleaningTaskName_5062Parser();
		case AnalyzesTaskNameEditPart.VISUAL_ID:
			return getAnalyzesTaskName_5067Parser();
		case VisualizationTaskNameEditPart.VISUAL_ID:
			return getVisualizationTaskName_5068Parser();
		case ExportingTaskNameEditPart.VISUAL_ID:
			return getExportingTaskName_5070Parser();
		case ImportNameEditPart.VISUAL_ID:
			return getImportName_5057Parser();
		case UserDefinedNameEditPart.VISUAL_ID:
			return getUserDefinedName_5060Parser();
		case PredefinedNameEditPart.VISUAL_ID:
			return getPredefinedName_5061Parser();
		case DescriptiveNameEditPart.VISUAL_ID:
			return getDescriptiveName_5063Parser();
		case ClassificationNameEditPart.VISUAL_ID:
			return getClassificationName_5064Parser();
		case PredictiveNameEditPart.VISUAL_ID:
			return getPredictiveName_5065Parser();
		case ClusteringNameEditPart.VISUAL_ID:
			return getClusteringName_5066Parser();
		case ExportNameEditPart.VISUAL_ID:
			return getExportName_5069Parser();
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
