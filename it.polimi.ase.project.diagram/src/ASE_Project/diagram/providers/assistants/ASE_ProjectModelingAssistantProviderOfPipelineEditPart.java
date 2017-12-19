/*
 * 
 */
package ASE_Project.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ASE_ProjectModelingAssistantProviderOfPipelineEditPart
		extends ASE_Project.diagram.providers.ASE_ProjectModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.CollectionTask_2001);
		types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.IntegrationTask_2002);
		types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.CleaningTask_2003);
		types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.AnalyzesTask_2004);
		types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.VisualizationTask_2005);
		types.add(ASE_Project.diagram.providers.ASE_ProjectElementTypes.ExportingTask_2006);
		return types;
	}

}
