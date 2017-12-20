/*
* 
*/
package ASEProject.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ASEProjectNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7010;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7009;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ASEProject.diagram.navigator.ASEProjectNavigatorItem) {
			ASEProject.diagram.navigator.ASEProjectNavigatorItem item = (ASEProject.diagram.navigator.ASEProjectNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ASEProject.diagram.part.ASEProjectVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
