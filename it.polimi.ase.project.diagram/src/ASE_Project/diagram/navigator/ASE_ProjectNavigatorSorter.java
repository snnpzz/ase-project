/*
* 
*/
package ASE_Project.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ASE_ProjectNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7006;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7005;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem) {
			ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem item = (ASE_Project.diagram.navigator.ASE_ProjectNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ASE_Project.diagram.part.ASE_ProjectVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
