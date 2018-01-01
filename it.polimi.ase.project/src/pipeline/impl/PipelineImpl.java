/**
 */
package pipeline.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pipeline.DataFlow;
import pipeline.File;
import pipeline.InternalDataFlow;
import pipeline.Operation;
import pipeline.Pipeline;
import pipeline.PipelinePackage;
import pipeline.Schema;
import pipeline.Source;
import pipeline.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.PipelineImpl#getDataFlows <em>Data Flows</em>}</li>
 *   <li>{@link pipeline.impl.PipelineImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link pipeline.impl.PipelineImpl#getID <em>ID</em>}</li>
 *   <li>{@link pipeline.impl.PipelineImpl#getInternalDataFlows <em>Internal Data Flows</em>}</li>
 *   <li>{@link pipeline.impl.PipelineImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link pipeline.impl.PipelineImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link pipeline.impl.PipelineImpl#getSchemas <em>Schemas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends EObjectImpl implements Pipeline {
	/**
	 * The cached value of the '{@link #getDataFlows() <em>Data Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> dataFlows;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInternalDataFlows() <em>Internal Data Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalDataFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalDataFlow> internalDataFlows;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Source> sources;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The cached value of the '{@link #getSchemas() <em>Schemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> schemas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getDataFlows() {
		if (dataFlows == null) {
			dataFlows = new EObjectContainmentEList<DataFlow>(DataFlow.class, this, PipelinePackage.PIPELINE__DATA_FLOWS);
		}
		return dataFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, PipelinePackage.PIPELINE__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.PIPELINE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalDataFlow> getInternalDataFlows() {
		if (internalDataFlows == null) {
			internalDataFlows = new EObjectContainmentEList<InternalDataFlow>(InternalDataFlow.class, this, PipelinePackage.PIPELINE__INTERNAL_DATA_FLOWS);
		}
		return internalDataFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Source> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<Source>(Source.class, this, PipelinePackage.PIPELINE__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, PipelinePackage.PIPELINE__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getSchemas() {
		if (schemas == null) {
			schemas = new EObjectContainmentEList<Schema>(Schema.class, this, PipelinePackage.PIPELINE__SCHEMAS);
		}
		return schemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.PIPELINE__DATA_FLOWS:
				return ((InternalEList<?>)getDataFlows()).basicRemove(otherEnd, msgs);
			case PipelinePackage.PIPELINE__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case PipelinePackage.PIPELINE__INTERNAL_DATA_FLOWS:
				return ((InternalEList<?>)getInternalDataFlows()).basicRemove(otherEnd, msgs);
			case PipelinePackage.PIPELINE__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case PipelinePackage.PIPELINE__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case PipelinePackage.PIPELINE__SCHEMAS:
				return ((InternalEList<?>)getSchemas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.PIPELINE__DATA_FLOWS:
				return getDataFlows();
			case PipelinePackage.PIPELINE__TASKS:
				return getTasks();
			case PipelinePackage.PIPELINE__ID:
				return getID();
			case PipelinePackage.PIPELINE__INTERNAL_DATA_FLOWS:
				return getInternalDataFlows();
			case PipelinePackage.PIPELINE__SOURCES:
				return getSources();
			case PipelinePackage.PIPELINE__FILES:
				return getFiles();
			case PipelinePackage.PIPELINE__SCHEMAS:
				return getSchemas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PipelinePackage.PIPELINE__DATA_FLOWS:
				getDataFlows().clear();
				getDataFlows().addAll((Collection<? extends DataFlow>)newValue);
				return;
			case PipelinePackage.PIPELINE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case PipelinePackage.PIPELINE__ID:
				setID((String)newValue);
				return;
			case PipelinePackage.PIPELINE__INTERNAL_DATA_FLOWS:
				getInternalDataFlows().clear();
				getInternalDataFlows().addAll((Collection<? extends InternalDataFlow>)newValue);
				return;
			case PipelinePackage.PIPELINE__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Source>)newValue);
				return;
			case PipelinePackage.PIPELINE__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case PipelinePackage.PIPELINE__SCHEMAS:
				getSchemas().clear();
				getSchemas().addAll((Collection<? extends Schema>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PipelinePackage.PIPELINE__DATA_FLOWS:
				getDataFlows().clear();
				return;
			case PipelinePackage.PIPELINE__TASKS:
				getTasks().clear();
				return;
			case PipelinePackage.PIPELINE__ID:
				setID(ID_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__INTERNAL_DATA_FLOWS:
				getInternalDataFlows().clear();
				return;
			case PipelinePackage.PIPELINE__SOURCES:
				getSources().clear();
				return;
			case PipelinePackage.PIPELINE__FILES:
				getFiles().clear();
				return;
			case PipelinePackage.PIPELINE__SCHEMAS:
				getSchemas().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PipelinePackage.PIPELINE__DATA_FLOWS:
				return dataFlows != null && !dataFlows.isEmpty();
			case PipelinePackage.PIPELINE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case PipelinePackage.PIPELINE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PipelinePackage.PIPELINE__INTERNAL_DATA_FLOWS:
				return internalDataFlows != null && !internalDataFlows.isEmpty();
			case PipelinePackage.PIPELINE__SOURCES:
				return sources != null && !sources.isEmpty();
			case PipelinePackage.PIPELINE__FILES:
				return files != null && !files.isEmpty();
			case PipelinePackage.PIPELINE__SCHEMAS:
				return schemas != null && !schemas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PipelineImpl
