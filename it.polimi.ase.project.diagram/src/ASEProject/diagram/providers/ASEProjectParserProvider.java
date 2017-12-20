/*
 * 
 */
package ASEProject.diagram.providers;

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
public class ASEProjectParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser collectionTaskName_5024Parser;

	/**
	* @generated
	*/
	private IParser getCollectionTaskName_5024Parser() {
		if (collectionTaskName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getTask_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			collectionTaskName_5024Parser = parser;
		}
		return collectionTaskName_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser integrationTaskName_5025Parser;

	/**
	* @generated
	*/
	private IParser getIntegrationTaskName_5025Parser() {
		if (integrationTaskName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getTask_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			integrationTaskName_5025Parser = parser;
		}
		return integrationTaskName_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser cleaningTaskName_5028Parser;

	/**
	* @generated
	*/
	private IParser getCleaningTaskName_5028Parser() {
		if (cleaningTaskName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getTask_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			cleaningTaskName_5028Parser = parser;
		}
		return cleaningTaskName_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser analyzesTaskName_5033Parser;

	/**
	* @generated
	*/
	private IParser getAnalyzesTaskName_5033Parser() {
		if (analyzesTaskName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getTask_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			analyzesTaskName_5033Parser = parser;
		}
		return analyzesTaskName_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser visualizationTaskName_5034Parser;

	/**
	* @generated
	*/
	private IParser getVisualizationTaskName_5034Parser() {
		if (visualizationTaskName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getTask_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			visualizationTaskName_5034Parser = parser;
		}
		return visualizationTaskName_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser exportingTaskName_5036Parser;

	/**
	* @generated
	*/
	private IParser getExportingTaskName_5036Parser() {
		if (exportingTaskName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getTask_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			exportingTaskName_5036Parser = parser;
		}
		return exportingTaskName_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser importName_5023Parser;

	/**
	* @generated
	*/
	private IParser getImportName_5023Parser() {
		if (importName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getImport_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			importName_5023Parser = parser;
		}
		return importName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser userDefinedName_5026Parser;

	/**
	* @generated
	*/
	private IParser getUserDefinedName_5026Parser() {
		if (userDefinedName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getOperation_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			userDefinedName_5026Parser = parser;
		}
		return userDefinedName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser predefinedName_5027Parser;

	/**
	* @generated
	*/
	private IParser getPredefinedName_5027Parser() {
		if (predefinedName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getOperation_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			predefinedName_5027Parser = parser;
		}
		return predefinedName_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser descriptiveName_5029Parser;

	/**
	* @generated
	*/
	private IParser getDescriptiveName_5029Parser() {
		if (descriptiveName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getOperation_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			descriptiveName_5029Parser = parser;
		}
		return descriptiveName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser classificationName_5030Parser;

	/**
	* @generated
	*/
	private IParser getClassificationName_5030Parser() {
		if (classificationName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getOperation_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			classificationName_5030Parser = parser;
		}
		return classificationName_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser predictiveName_5031Parser;

	/**
	* @generated
	*/
	private IParser getPredictiveName_5031Parser() {
		if (predictiveName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getOperation_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			predictiveName_5031Parser = parser;
		}
		return predictiveName_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser clusteringName_5032Parser;

	/**
	* @generated
	*/
	private IParser getClusteringName_5032Parser() {
		if (clusteringName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getOperation_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			clusteringName_5032Parser = parser;
		}
		return clusteringName_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser exportName_5035Parser;

	/**
	* @generated
	*/
	private IParser getExportName_5035Parser() {
		if (exportName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { ASEProject.ASEProjectPackage.eINSTANCE.getExport_Name() };
			ASEProject.diagram.parsers.MessageFormatParser parser = new ASEProject.diagram.parsers.MessageFormatParser(
					features);
			exportName_5035Parser = parser;
		}
		return exportName_5035Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ASEProject.diagram.edit.parts.CollectionTaskNameEditPart.VISUAL_ID:
			return getCollectionTaskName_5024Parser();
		case ASEProject.diagram.edit.parts.IntegrationTaskNameEditPart.VISUAL_ID:
			return getIntegrationTaskName_5025Parser();
		case ASEProject.diagram.edit.parts.CleaningTaskNameEditPart.VISUAL_ID:
			return getCleaningTaskName_5028Parser();
		case ASEProject.diagram.edit.parts.AnalyzesTaskNameEditPart.VISUAL_ID:
			return getAnalyzesTaskName_5033Parser();
		case ASEProject.diagram.edit.parts.VisualizationTaskNameEditPart.VISUAL_ID:
			return getVisualizationTaskName_5034Parser();
		case ASEProject.diagram.edit.parts.ExportingTaskNameEditPart.VISUAL_ID:
			return getExportingTaskName_5036Parser();
		case ASEProject.diagram.edit.parts.ImportNameEditPart.VISUAL_ID:
			return getImportName_5023Parser();
		case ASEProject.diagram.edit.parts.UserDefinedNameEditPart.VISUAL_ID:
			return getUserDefinedName_5026Parser();
		case ASEProject.diagram.edit.parts.PredefinedNameEditPart.VISUAL_ID:
			return getPredefinedName_5027Parser();
		case ASEProject.diagram.edit.parts.DescriptiveNameEditPart.VISUAL_ID:
			return getDescriptiveName_5029Parser();
		case ASEProject.diagram.edit.parts.ClassificationNameEditPart.VISUAL_ID:
			return getClassificationName_5030Parser();
		case ASEProject.diagram.edit.parts.PredictiveNameEditPart.VISUAL_ID:
			return getPredictiveName_5031Parser();
		case ASEProject.diagram.edit.parts.ClusteringNameEditPart.VISUAL_ID:
			return getClusteringName_5032Parser();
		case ASEProject.diagram.edit.parts.ExportNameEditPart.VISUAL_ID:
			return getExportName_5035Parser();
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
			return getParser(ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ASEProject.diagram.providers.ASEProjectElementTypes.getElement(hint) == null) {
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
