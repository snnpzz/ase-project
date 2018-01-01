/*
* 
*/
package pipeline.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import pipeline.diagram.part.PipelineVisualIDRegistry;

/**
 * @generated
 */
public class PipelineNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7029;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7028;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof PipelineNavigatorItem) {
			PipelineNavigatorItem item = (PipelineNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return PipelineVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
