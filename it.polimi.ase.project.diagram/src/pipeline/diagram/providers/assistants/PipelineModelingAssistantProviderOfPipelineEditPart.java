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
		List<IElementType> types = new ArrayList<IElementType>(14);
		types.add(PipelineElementTypes.UserDefined_2033);
		types.add(PipelineElementTypes.Descriptive_2034);
		types.add(PipelineElementTypes.Classification_2035);
		types.add(PipelineElementTypes.Predictive_2036);
		types.add(PipelineElementTypes.Clustering_2037);
		types.add(PipelineElementTypes.Predefined_2038);
		types.add(PipelineElementTypes.CollectionTask_2025);
		types.add(PipelineElementTypes.IntegrationTask_2026);
		types.add(PipelineElementTypes.CleaningTask_2027);
		types.add(PipelineElementTypes.AnalysisTask_2031);
		types.add(PipelineElementTypes.VisualizationTask_2029);
		types.add(PipelineElementTypes.ExportTask_2032);
		types.add(PipelineElementTypes.Source_2039);
		types.add(PipelineElementTypes.File_2040);
		return types;
	}

}
