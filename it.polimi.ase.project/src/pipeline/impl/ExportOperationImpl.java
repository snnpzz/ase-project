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
 *   <li>{@link pipeline.impl.ExportOperationImpl#getWrite <em>Write</em>}</li>
 *   <li>{@link pipeline.impl.ExportOperationImpl#getExpUses <em>Exp Uses</em>}</li>
 *   <li>{@link pipeline.impl.ExportOperationImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportOperationImpl extends EObjectImpl implements ExportOperation {
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
	 * The cached value of the '{@link #getExpUses() <em>Exp Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpUses()
	 * @generated
	 * @ordered
	 */
	protected Schema expUses;

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
	public Schema getExpUses() {
		if (expUses != null && expUses.eIsProxy()) {
			InternalEObject oldExpUses = (InternalEObject)expUses;
			expUses = (Schema)eResolveProxy(oldExpUses);
			if (expUses != oldExpUses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelinePackage.EXPORT_OPERATION__EXP_USES, oldExpUses, expUses));
			}
		}
		return expUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetExpUses() {
		return expUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpUses(Schema newExpUses) {
		Schema oldExpUses = expUses;
		expUses = newExpUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.EXPORT_OPERATION__EXP_USES, oldExpUses, expUses));
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
			case PipelinePackage.EXPORT_OPERATION__WRITE:
				if (resolve) return getWrite();
				return basicGetWrite();
			case PipelinePackage.EXPORT_OPERATION__EXP_USES:
				if (resolve) return getExpUses();
				return basicGetExpUses();
			case PipelinePackage.EXPORT_OPERATION__ID:
				return getID();
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
			case PipelinePackage.EXPORT_OPERATION__WRITE:
				setWrite((File)newValue);
				return;
			case PipelinePackage.EXPORT_OPERATION__EXP_USES:
				setExpUses((Schema)newValue);
				return;
			case PipelinePackage.EXPORT_OPERATION__ID:
				setID((String)newValue);
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
			case PipelinePackage.EXPORT_OPERATION__WRITE:
				setWrite((File)null);
				return;
			case PipelinePackage.EXPORT_OPERATION__EXP_USES:
				setExpUses((Schema)null);
				return;
			case PipelinePackage.EXPORT_OPERATION__ID:
				setID(ID_EDEFAULT);
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
			case PipelinePackage.EXPORT_OPERATION__WRITE:
				return write != null;
			case PipelinePackage.EXPORT_OPERATION__EXP_USES:
				return expUses != null;
			case PipelinePackage.EXPORT_OPERATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
