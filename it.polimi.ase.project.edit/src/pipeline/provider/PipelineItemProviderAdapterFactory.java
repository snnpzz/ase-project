/**
 */
package pipeline.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import pipeline.util.PipelineAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PipelineItemProviderAdapterFactory extends PipelineAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipelineItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.Pipeline} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineItemProvider pipelineItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.Pipeline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPipelineAdapter() {
		if (pipelineItemProvider == null) {
			pipelineItemProvider = new PipelineItemProvider(this);
		}

		return pipelineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.DataFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowItemProvider dataFlowItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataFlowAdapter() {
		if (dataFlowItemProvider == null) {
			dataFlowItemProvider = new DataFlowItemProvider(this);
		}

		return dataFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.InternalDataFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalDataFlowItemProvider internalDataFlowItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.InternalDataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInternalDataFlowAdapter() {
		if (internalDataFlowItemProvider == null) {
			internalDataFlowItemProvider = new InternalDataFlowItemProvider(this);
		}

		return internalDataFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.Schema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaItemProvider schemaItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchemaAdapter() {
		if (schemaItemProvider == null) {
			schemaItemProvider = new SchemaItemProvider(this);
		}

		return schemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.CollectionTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionTaskItemProvider collectionTaskItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.CollectionTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCollectionTaskAdapter() {
		if (collectionTaskItemProvider == null) {
			collectionTaskItemProvider = new CollectionTaskItemProvider(this);
		}

		return collectionTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.IntegrationTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationTaskItemProvider integrationTaskItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.IntegrationTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegrationTaskAdapter() {
		if (integrationTaskItemProvider == null) {
			integrationTaskItemProvider = new IntegrationTaskItemProvider(this);
		}

		return integrationTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.CleaningTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CleaningTaskItemProvider cleaningTaskItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.CleaningTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCleaningTaskAdapter() {
		if (cleaningTaskItemProvider == null) {
			cleaningTaskItemProvider = new CleaningTaskItemProvider(this);
		}

		return cleaningTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.AnalysisTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisTaskItemProvider analysisTaskItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.AnalysisTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnalysisTaskAdapter() {
		if (analysisTaskItemProvider == null) {
			analysisTaskItemProvider = new AnalysisTaskItemProvider(this);
		}

		return analysisTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.VisualizationTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationTaskItemProvider visualizationTaskItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.VisualizationTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisualizationTaskAdapter() {
		if (visualizationTaskItemProvider == null) {
			visualizationTaskItemProvider = new VisualizationTaskItemProvider(this);
		}

		return visualizationTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.ExportTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportTaskItemProvider exportTaskItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.ExportTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExportTaskAdapter() {
		if (exportTaskItemProvider == null) {
			exportTaskItemProvider = new ExportTaskItemProvider(this);
		}

		return exportTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.ImportOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportOperationItemProvider importOperationItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.ImportOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImportOperationAdapter() {
		if (importOperationItemProvider == null) {
			importOperationItemProvider = new ImportOperationItemProvider(this);
		}

		return importOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.ExportOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportOperationItemProvider exportOperationItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.ExportOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExportOperationAdapter() {
		if (exportOperationItemProvider == null) {
			exportOperationItemProvider = new ExportOperationItemProvider(this);
		}

		return exportOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.UserDefinedCleaningOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDefinedCleaningOperationItemProvider userDefinedCleaningOperationItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.UserDefinedCleaningOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserDefinedCleaningOperationAdapter() {
		if (userDefinedCleaningOperationItemProvider == null) {
			userDefinedCleaningOperationItemProvider = new UserDefinedCleaningOperationItemProvider(this);
		}

		return userDefinedCleaningOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.Source} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceItemProvider sourceItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceAdapter() {
		if (sourceItemProvider == null) {
			sourceItemProvider = new SourceItemProvider(this);
		}

		return sourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.File} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileItemProvider fileItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.File}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileAdapter() {
		if (fileItemProvider == null) {
			fileItemProvider = new FileItemProvider(this);
		}

		return fileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.Chart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartItemProvider chartItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.Chart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChartAdapter() {
		if (chartItemProvider == null) {
			chartItemProvider = new ChartItemProvider(this);
		}

		return chartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.DescriptiveAnalysisOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptiveAnalysisOperationItemProvider descriptiveAnalysisOperationItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.DescriptiveAnalysisOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescriptiveAnalysisOperationAdapter() {
		if (descriptiveAnalysisOperationItemProvider == null) {
			descriptiveAnalysisOperationItemProvider = new DescriptiveAnalysisOperationItemProvider(this);
		}

		return descriptiveAnalysisOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.ClassificationAnalysisOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationAnalysisOperationItemProvider classificationAnalysisOperationItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.ClassificationAnalysisOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassificationAnalysisOperationAdapter() {
		if (classificationAnalysisOperationItemProvider == null) {
			classificationAnalysisOperationItemProvider = new ClassificationAnalysisOperationItemProvider(this);
		}

		return classificationAnalysisOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.PredictiveAnalysisOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredictiveAnalysisOperationItemProvider predictiveAnalysisOperationItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.PredictiveAnalysisOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredictiveAnalysisOperationAdapter() {
		if (predictiveAnalysisOperationItemProvider == null) {
			predictiveAnalysisOperationItemProvider = new PredictiveAnalysisOperationItemProvider(this);
		}

		return predictiveAnalysisOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.ClusteringAnalysisOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusteringAnalysisOperationItemProvider clusteringAnalysisOperationItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.ClusteringAnalysisOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClusteringAnalysisOperationAdapter() {
		if (clusteringAnalysisOperationItemProvider == null) {
			clusteringAnalysisOperationItemProvider = new ClusteringAnalysisOperationItemProvider(this);
		}

		return clusteringAnalysisOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.PredefinedCleaningOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredefinedCleaningOperationItemProvider predefinedCleaningOperationItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.PredefinedCleaningOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredefinedCleaningOperationAdapter() {
		if (predefinedCleaningOperationItemProvider == null) {
			predefinedCleaningOperationItemProvider = new PredefinedCleaningOperationItemProvider(this);
		}

		return predefinedCleaningOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.SimpleAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleAttributeItemProvider simpleAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.SimpleAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleAttributeAdapter() {
		if (simpleAttributeItemProvider == null) {
			simpleAttributeItemProvider = new SimpleAttributeItemProvider(this);
		}

		return simpleAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.ComplexAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexAttributeItemProvider complexAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.ComplexAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComplexAttributeAdapter() {
		if (complexAttributeItemProvider == null) {
			complexAttributeItemProvider = new ComplexAttributeItemProvider(this);
		}

		return complexAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link pipeline.VisualizationOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationOperationItemProvider visualizationOperationItemProvider;

	/**
	 * This creates an adapter for a {@link pipeline.VisualizationOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisualizationOperationAdapter() {
		if (visualizationOperationItemProvider == null) {
			visualizationOperationItemProvider = new VisualizationOperationItemProvider(this);
		}

		return visualizationOperationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (pipelineItemProvider != null) pipelineItemProvider.dispose();
		if (dataFlowItemProvider != null) dataFlowItemProvider.dispose();
		if (internalDataFlowItemProvider != null) internalDataFlowItemProvider.dispose();
		if (schemaItemProvider != null) schemaItemProvider.dispose();
		if (collectionTaskItemProvider != null) collectionTaskItemProvider.dispose();
		if (integrationTaskItemProvider != null) integrationTaskItemProvider.dispose();
		if (cleaningTaskItemProvider != null) cleaningTaskItemProvider.dispose();
		if (analysisTaskItemProvider != null) analysisTaskItemProvider.dispose();
		if (visualizationTaskItemProvider != null) visualizationTaskItemProvider.dispose();
		if (exportTaskItemProvider != null) exportTaskItemProvider.dispose();
		if (importOperationItemProvider != null) importOperationItemProvider.dispose();
		if (exportOperationItemProvider != null) exportOperationItemProvider.dispose();
		if (userDefinedCleaningOperationItemProvider != null) userDefinedCleaningOperationItemProvider.dispose();
		if (sourceItemProvider != null) sourceItemProvider.dispose();
		if (fileItemProvider != null) fileItemProvider.dispose();
		if (chartItemProvider != null) chartItemProvider.dispose();
		if (descriptiveAnalysisOperationItemProvider != null) descriptiveAnalysisOperationItemProvider.dispose();
		if (classificationAnalysisOperationItemProvider != null) classificationAnalysisOperationItemProvider.dispose();
		if (predictiveAnalysisOperationItemProvider != null) predictiveAnalysisOperationItemProvider.dispose();
		if (clusteringAnalysisOperationItemProvider != null) clusteringAnalysisOperationItemProvider.dispose();
		if (predefinedCleaningOperationItemProvider != null) predefinedCleaningOperationItemProvider.dispose();
		if (simpleAttributeItemProvider != null) simpleAttributeItemProvider.dispose();
		if (complexAttributeItemProvider != null) complexAttributeItemProvider.dispose();
		if (visualizationOperationItemProvider != null) visualizationOperationItemProvider.dispose();
	}

}