/*
 * 
 */
package ASE_Project.diagram.preferences;

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
		ASE_Project.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		ASE_Project.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		ASE_Project.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		ASE_Project.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		ASE_Project.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return ASE_Project.diagram.part.ASE_ProjectDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
