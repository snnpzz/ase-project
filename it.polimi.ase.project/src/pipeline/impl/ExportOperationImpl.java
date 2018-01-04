/**
 */
package pipeline.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pipeline.ExportOperation;
import pipeline.File;
import pipeline.PipelinePackage;
import pipeline.Schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.ExportOperationImpl#getID <em>ID</em>}</li>
 *   <li>{@link pipeline.impl.ExportOperationImpl#getUse <em>Use</em>}</li>
 *   <li>{@link pipeline.impl.ExportOperationImpl#getWrite <em>Write</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportOperationImpl extends EObjectImpl implements ExportOperation {
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
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Schema use;

	/**
	 * The cached value of the '{@link #getWrite() <em>Write</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected File write;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.EXPORT_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getWrite() {
		if (write != null && write.eIsProxy()) {
			InternalEObject oldWrite = (InternalEObject)write;
			write = (File)eResolveProxy(oldWrite);
			if (write != oldWrite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelinePackage.EXPORT_OPERATION__WRITE, oldWrite, write));
			}
		}
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetWrite() {
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWrite(File newWrite, NotificationChain msgs) {
		File oldWrite = write;
		write = newWrite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelinePackage.EXPORT_OPERATION__WRITE, oldWrite, newWrite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrite(File newWrite) {
		if (newWrite != write) {
			NotificationChain msgs = null;
			if (write != null)
				msgs = ((InternalEObject)write).eInverseRemove(this, PipelinePackage.FILE__COMES_FROM, File.class, msgs);
			if (newWrite != null)
				msgs = ((InternalEObject)newWrite).eInverseAdd(this, PipelinePackage.FILE__COMES_FROM, File.class, msgs);
			msgs = basicSetWrite(newWrite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.EXPORT_OPERATION__WRITE, newWrite, newWrite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.EXPORT_OPERATION__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getUse() {
		if (use != null && use.eIsProxy()) {
			InternalEObject oldUse = (InternalEObject)use;
			use = (Schema)eResolveProxy(oldUse);
			if (use != oldUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelinePackage.EXPORT_OPERATION__USE, oldUse, use));
			}
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Schema newUse) {
		Schema oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.EXPORT_OPERATION__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.EXPORT_OPERATION__WRITE:
				if (write != null)
					msgs = ((InternalEObject)write).eInverseRemove(this, PipelinePackage.FILE__COMES_FROM, File.class, msgs);
				return basicSetWrite((File)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.EXPORT_OPERATION__WRITE:
				return basicSetWrite(null, msgs);
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
			case PipelinePackage.EXPORT_OPERATION__ID:
				return getID();
			case PipelinePackage.EXPORT_OPERATION__USE:
				if (resolve) return getUse();
				return basicGetUse();
			case PipelinePackage.EXPORT_OPERATION__WRITE:
				if (resolve) return getWrite();
				return basicGetWrite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PipelinePackage.EXPORT_OPERATION__ID:
				setID((String)newValue);
				return;
			case PipelinePackage.EXPORT_OPERATION__USE:
				setUse((Schema)newValue);
				return;
			case PipelinePackage.EXPORT_OPERATION__WRITE:
				setWrite((File)newValue);
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
			case PipelinePackage.EXPORT_OPERATION__ID:
				setID(ID_EDEFAULT);
				return;
			case PipelinePackage.EXPORT_OPERATION__USE:
				setUse((Schema)null);
				return;
			case PipelinePackage.EXPORT_OPERATION__WRITE:
				setWrite((File)null);
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
			case PipelinePackage.EXPORT_OPERATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PipelinePackage.EXPORT_OPERATION__USE:
				return use != null;
			case PipelinePackage.EXPORT_OPERATION__WRITE:
				return write != null;
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

} //ExportOperationImpl
