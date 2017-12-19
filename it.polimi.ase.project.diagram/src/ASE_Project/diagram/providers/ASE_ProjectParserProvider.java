/*
 * 
 */
package ASE_Project.diagram.providers;

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

/**
 * @generated
 */
public class ASE_ProjectParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser collectionTaskName_5002Parser;

	/**
	* @generated
	*/
	private IParser getCollectionTaskName_5002Parser() {
		if (collectionTaskName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getTask_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			collectionTaskName_5002Parser = parser;
		}
		return collectionTaskName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser integrationTaskName_5003Parser;

	/**
	* @generated
	*/
	private IParser getIntegrationTaskName_5003Parser() {
		if (integrationTaskName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getTask_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			integrationTaskName_5003Parser = parser;
		}
		return integrationTaskName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser cleaningTaskName_5006Parser;

	/**
	* @generated
	*/
	private IParser getCleaningTaskName_5006Parser() {
		if (cleaningTaskName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getTask_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			cleaningTaskName_5006Parser = parser;
		}
		return cleaningTaskName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser analyzesTaskName_5011Parser;

	/**
	* @generated
	*/
	private IParser getAnalyzesTaskName_5011Parser() {
		if (analyzesTaskName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getTask_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			analyzesTaskName_5011Parser = parser;
		}
		return analyzesTaskName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser visualizationTaskName_5012Parser;

	/**
	* @generated
	*/
	private IParser getVisualizationTaskName_5012Parser() {
		if (visualizationTaskName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getTask_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			visualizationTaskName_5012Parser = parser;
		}
		return visualizationTaskName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser exportingTaskName_5014Parser;

	/**
	* @generated
	*/
	private IParser getExportingTaskName_5014Parser() {
		if (exportingTaskName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getTask_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			exportingTaskName_5014Parser = parser;
		}
		return exportingTaskName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser importName_5015Parser;

	/**
	* @generated
	*/
	private IParser getImportName_5015Parser() {
		if (importName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getImport_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			importName_5015Parser = parser;
		}
		return importName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser userDefinedName_5016Parser;

	/**
	* @generated
	*/
	private IParser getUserDefinedName_5016Parser() {
		if (userDefinedName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getOperation_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			userDefinedName_5016Parser = parser;
		}
		return userDefinedName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser predefinedName_5017Parser;

	/**
	* @generated
	*/
	private IParser getPredefinedName_5017Parser() {
		if (predefinedName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getOperation_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			predefinedName_5017Parser = parser;
		}
		return predefinedName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser descriptiveName_5018Parser;

	/**
	* @generated
	*/
	private IParser getDescriptiveName_5018Parser() {
		if (descriptiveName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getOperation_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			descriptiveName_5018Parser = parser;
		}
		return descriptiveName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser classificationName_5019Parser;

	/**
	* @generated
	*/
	private IParser getClassificationName_5019Parser() {
		if (classificationName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getOperation_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			classificationName_5019Parser = parser;
		}
		return classificationName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser predictiveName_5020Parser;

	/**
	* @generated
	*/
	private IParser getPredictiveName_5020Parser() {
		if (predictiveName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getOperation_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			predictiveName_5020Parser = parser;
		}
		return predictiveName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser clusteringName_5021Parser;

	/**
	* @generated
	*/
	private IParser getClusteringName_5021Parser() {
		if (clusteringName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getOperation_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			clusteringName_5021Parser = parser;
		}
		return clusteringName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser exportName_5022Parser;

	/**
	* @generated
	*/
	private IParser getExportName_5022Parser() {
		if (exportName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { ASE_Project.ASE_ProjectPackage.eINSTANCE.getExport_Name() };
			ASE_Project.diagram.parsers.MessageFormatParser parser = new ASE_Project.diagram.parsers.MessageFormatParser(
					features);
			exportName_5022Parser = parser;
		}
		return exportName_5022Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ASE_Project.diagram.edit.parts.CollectionTaskNameEditPart.VISUAL_ID:
			return getCollectionTaskName_5002Parser();
		case ASE_Project.diagram.edit.parts.IntegrationTaskNameEditPart.VISUAL_ID:
			return getIntegrationTaskName_5003Parser();
		case ASE_Project.diagram.edit.parts.CleaningTaskNameEditPart.VISUAL_ID:
			return getCleaningTaskName_5006Parser();
		case ASE_Project.diagram.edit.parts.AnalyzesTaskNameEditPart.VISUAL_ID:
			return getAnalyzesTaskName_5011Parser();
		case ASE_Project.diagram.edit.parts.VisualizationTaskNameEditPart.VISUAL_ID:
			return getVisualizationTaskName_5012Parser();
		case ASE_Project.diagram.edit.parts.ExportingTaskNameEditPart.VISUAL_ID:
			return getExportingTaskName_5014Parser();
		case ASE_Project.diagram.edit.parts.ImportNameEditPart.VISUAL_ID:
			return getImportName_5015Parser();
		case ASE_Project.diagram.edit.parts.UserDefinedNameEditPart.VISUAL_ID:
			return getUserDefinedName_5016Parser();
		case ASE_Project.diagram.edit.parts.PredefinedNameEditPart.VISUAL_ID:
			return getPredefinedName_5017Parser();
		case ASE_Project.diagram.edit.parts.DescriptiveNameEditPart.VISUAL_ID:
			return getDescriptiveName_5018Parser();
		case ASE_Project.diagram.edit.parts.ClassificationNameEditPart.VISUAL_ID:
			return getClassificationName_5019Parser();
		case ASE_Project.diagram.edit.parts.PredictiveNameEditPart.VISUAL_ID:
			return getPredictiveName_5020Parser();
		case ASE_Project.diagram.edit.parts.ClusteringNameEditPart.VISUAL_ID:
			return getClusteringName_5021Parser();
		case ASE_Project.diagram.edit.parts.ExportNameEditPart.VISUAL_ID:
			return getExportName_5022Parser();
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
			return getParser(ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ASE_Project.diagram.providers.ASE_ProjectElementTypes.getElement(hint) == null) {
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
