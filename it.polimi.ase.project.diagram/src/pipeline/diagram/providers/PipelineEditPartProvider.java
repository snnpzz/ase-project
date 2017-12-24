/*
 * 
 */
package pipeline.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import pipeline.diagram.edit.parts.PLEditPart;
import pipeline.diagram.edit.parts.PipelineEditPartFactory;
import pipeline.diagram.part.PipelineVisualIDRegistry;

/**
 * @generated
 */
public class PipelineEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public PipelineEditPartProvider() {
		super(new PipelineEditPartFactory(), PipelineVisualIDRegistry.TYPED_INSTANCE, PLEditPart.MODEL_ID);
	}

}
