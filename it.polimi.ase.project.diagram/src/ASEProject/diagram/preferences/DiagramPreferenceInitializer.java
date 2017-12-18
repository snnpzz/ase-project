/*
 * 
 */
package ASEProject.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		ASEProject.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		ASEProject.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		ASEProject.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		ASEProject.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		ASEProject.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return ASEProject.diagram.part.ASEProjectDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
