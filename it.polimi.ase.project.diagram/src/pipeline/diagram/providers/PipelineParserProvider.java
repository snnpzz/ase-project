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
import pipeline.diagram.edit.parts.ChartTitleEditPart;
import pipeline.diagram.edit.parts.CleaningTaskIDEditPart;
import pipeline.diagram.edit.parts.CollectionTaskIDEditPart;
import pipeline.diagram.edit.parts.ComplexAttributeName2EditPart;
import pipeline.diagram.edit.parts.ComplexAttributeNameEditPart;
import pipeline.diagram.edit.parts.ExportOperationIDEditPart;
import pipeline.diagram.edit.parts.ExportTaskIDEditPart;
import pipeline.diagram.edit.parts.FileNameEditPart;
import pipeline.diagram.edit.parts.ImportOperationIDEditPart;
import pipeline.diagram.edit.parts.IntegrationTaskIDEditPart;
import pipeline.diagram.edit.parts.SimpleAttributeName2EditPart;
import pipeline.diagram.edit.parts.SimpleAttributeNameEditPart;
import pipeline.diagram.edit.parts.SourceNameEditPart;
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
	private IParser collectionTaskID_5001Parser;

	/**
	* @generated
	*/
	private IParser getCollectionTaskID_5001Parser() {
		if (collectionTaskID_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			collectionTaskID_5001Parser = parser;
		}
		return collectionTaskID_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser integrationTaskID_5002Parser;

	/**
	* @generated
	*/
	private IParser getIntegrationTaskID_5002Parser() {
		if (integrationTaskID_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			integrationTaskID_5002Parser = parser;
		}
		return integrationTaskID_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser cleaningTaskID_5003Parser;

	/**
	* @generated
	*/
	private IParser getCleaningTaskID_5003Parser() {
		if (cleaningTaskID_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cleaningTaskID_5003Parser = parser;
		}
		return cleaningTaskID_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser analysisTaskID_5004Parser;

	/**
	* @generated
	*/
	private IParser getAnalysisTaskID_5004Parser() {
		if (analysisTaskID_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			analysisTaskID_5004Parser = parser;
		}
		return analysisTaskID_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser visualizationTaskID_5005Parser;

	/**
	* @generated
	*/
	private IParser getVisualizationTaskID_5005Parser() {
		if (visualizationTaskID_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			visualizationTaskID_5005Parser = parser;
		}
		return visualizationTaskID_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser exportTaskID_5006Parser;

	/**
	* @generated
	*/
	private IParser getExportTaskID_5006Parser() {
		if (exportTaskID_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { PipelinePackage.eINSTANCE.getTask_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			exportTaskID_5006Parser = parser;
		}
		return exportTaskID_5006Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CollectionTaskIDEditPart.VISUAL_ID:
			return getCollectionTaskID_5001Parser();
		case IntegrationTaskIDEditPart.VISUAL_ID:
			return getIntegrationTaskID_5002Parser();
		case CleaningTaskIDEditPart.VISUAL_ID:
			return getCleaningTaskID_5003Parser();
		case AnalysisTaskIDEditPart.VISUAL_ID:
			return getAnalysisTaskID_5004Parser();
		case VisualizationTaskIDEditPart.VISUAL_ID:
			return getVisualizationTaskID_5005Parser();
		case ExportTaskIDEditPart.VISUAL_ID:
			return getExportTaskID_5006Parser();
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
