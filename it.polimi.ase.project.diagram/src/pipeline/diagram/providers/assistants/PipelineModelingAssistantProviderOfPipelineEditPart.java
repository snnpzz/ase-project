/*
 * 
 */
package pipeline.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pipeline.diagram.providers.PipelineElementTypes;
import pipeline.diagram.providers.PipelineModelingAssistantProvider;

/**
 * @generated
 */
public class PipelineModelingAssistantProviderOfPipelineEditPart extends PipelineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(PipelineElementTypes.CollectionTask_2001);
		types.add(PipelineElementTypes.IntegrationTask_2002);
		types.add(PipelineElementTypes.CleaningTask_2003);
		types.add(PipelineElementTypes.AnalysisTask_2004);
		types.add(PipelineElementTypes.VisualizationTask_2005);
		types.add(PipelineElementTypes.ExportTask_2006);
		return types;
	}

}
