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
public class PipelineModelingAssistantProviderOfPLEditPart extends PipelineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(PipelineElementTypes.CollectionTask_2013);
		types.add(PipelineElementTypes.IntegrationTask_2014);
		types.add(PipelineElementTypes.CleaningTask_2015);
		types.add(PipelineElementTypes.AnalyzesTask_2016);
		types.add(PipelineElementTypes.VisualizationTask_2017);
		types.add(PipelineElementTypes.ExportingTask_2018);
		return types;
	}

}
