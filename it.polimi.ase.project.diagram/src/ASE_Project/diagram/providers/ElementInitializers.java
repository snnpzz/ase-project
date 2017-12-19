/*
 * 
 */
package ASE_Project.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
