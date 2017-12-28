/**
 */
package pipeline.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pipeline.Pipeline;
import pipeline.PipelineFactory;
import pipeline.PipelinePackage;

/**
 * This is the item provider adapter for a {@link pipeline.Pipeline} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PipelineItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pipeline_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pipeline_ID_feature", "_UI_Pipeline_type"),
				 PipelinePackage.Literals.PIPELINE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PipelinePackage.Literals.PIPELINE__DATA_FLOWS);
			childrenFeatures.add(PipelinePackage.Literals.PIPELINE__TASKS);
			childrenFeatures.add(PipelinePackage.Literals.PIPELINE__INTERNAL_DATA_FLOWS);
			childrenFeatures.add(PipelinePackage.Literals.PIPELINE__INPUT_SOURCES);
			childrenFeatures.add(PipelinePackage.Literals.PIPELINE__OUTPUT_FILES);
			childrenFeatures.add(PipelinePackage.Literals.PIPELINE__OPERATIONS);
			childrenFeatures.add(PipelinePackage.Literals.PIPELINE__SCHEMAS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Pipeline.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Pipeline"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Pipeline)object).getID();
		return label == null || label.length() == 0 ?
			getString("_UI_Pipeline_type") :
			getString("_UI_Pipeline_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Pipeline.class)) {
			case PipelinePackage.PIPELINE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PipelinePackage.PIPELINE__DATA_FLOWS:
			case PipelinePackage.PIPELINE__TASKS:
			case PipelinePackage.PIPELINE__INTERNAL_DATA_FLOWS:
			case PipelinePackage.PIPELINE__INPUT_SOURCES:
			case PipelinePackage.PIPELINE__OUTPUT_FILES:
			case PipelinePackage.PIPELINE__OPERATIONS:
			case PipelinePackage.PIPELINE__SCHEMAS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__DATA_FLOWS,
				 PipelineFactory.eINSTANCE.createDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__TASKS,
				 PipelineFactory.eINSTANCE.createCollectionTask()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__TASKS,
				 PipelineFactory.eINSTANCE.createIntegrationTask()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__TASKS,
				 PipelineFactory.eINSTANCE.createCleaningTask()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__TASKS,
				 PipelineFactory.eINSTANCE.createAnalysisTask()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__TASKS,
				 PipelineFactory.eINSTANCE.createVisualizationTask()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__TASKS,
				 PipelineFactory.eINSTANCE.createExportTask()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__INTERNAL_DATA_FLOWS,
				 PipelineFactory.eINSTANCE.createInternalDataFlow()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__INPUT_SOURCES,
				 PipelineFactory.eINSTANCE.createSource()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__OUTPUT_FILES,
				 PipelineFactory.eINSTANCE.createFile()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__OPERATIONS,
				 PipelineFactory.eINSTANCE.createUserDefined()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__OPERATIONS,
				 PipelineFactory.eINSTANCE.createDescriptive()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__OPERATIONS,
				 PipelineFactory.eINSTANCE.createClassification()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__OPERATIONS,
				 PipelineFactory.eINSTANCE.createPredictive()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__OPERATIONS,
				 PipelineFactory.eINSTANCE.createClustering()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__OPERATIONS,
				 PipelineFactory.eINSTANCE.createPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(PipelinePackage.Literals.PIPELINE__SCHEMAS,
				 PipelineFactory.eINSTANCE.createSchema()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PipelineEditPlugin.INSTANCE;
	}

}
