/*
 * 
 */
package ASEProject.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ASEProjectModelingAssistantProviderOfPipelineEditPart
		extends ASEProject.diagram.providers.ASEProjectModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(ASEProject.diagram.providers.ASEProjectElementTypes.CollectionTask_2007);
		types.add(ASEProject.diagram.providers.ASEProjectElementTypes.IntegrationTask_2008);
		types.add(ASEProject.diagram.providers.ASEProjectElementTypes.CleaningTask_2009);
		types.add(ASEProject.diagram.providers.ASEProjectElementTypes.AnalyzesTask_2010);
		types.add(ASEProject.diagram.providers.ASEProjectElementTypes.VisualizationTask_2011);
		types.add(ASEProject.diagram.providers.ASEProjectElementTypes.ExportingTask_2012);
		return types;
	}

}
