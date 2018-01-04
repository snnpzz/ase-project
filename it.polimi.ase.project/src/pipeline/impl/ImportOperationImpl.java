/**
 */
package pipeline.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pipeline.ImportOperation;
import pipeline.PipelinePackage;
import pipeline.Schema;
import pipeline.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.ImportOperationImpl#getID <em>ID</em>}</li>
 *   <li>{@link pipeline.impl.ImportOperationImpl#getRead <em>Read</em>}</li>
 *   <li>{@link pipeline.impl.ImportOperationImpl#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportOperationImpl extends EObjectImpl implements ImportOperation {
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
	 * The cached value of the '{@link #getRead() <em>Read</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRead()
	 * @generated
	 * @ordered
	 */
	protected Source read;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.IMPORT_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getRead() {
		if (read != null && read.eIsProxy()) {
			InternalEObject oldRead = (InternalEObject)read;
			read = (Source)eResolveProxy(oldRead);
			if (read != oldRead) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelinePackage.IMPORT_OPERATION__READ, oldRead, read));
			}
		}
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source basicGetRead() {
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRead(Source newRead, NotificationChain msgs) {
		Source oldRead = read;
		read = newRead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelinePackage.IMPORT_OPERATION__READ, oldRead, newRead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRead(Source newRead) {
		if (newRead != read) {
			NotificationChain msgs = null;
			if (read != null)
				msgs = ((InternalEObject)read).eInverseRemove(this, PipelinePackage.SOURCE__LINKED_TO, Source.class, msgs);
			if (newRead != null)
				msgs = ((InternalEObject)newRead).eInverseAdd(this, PipelinePackage.SOURCE__LINKED_TO, Source.class, msgs);
			msgs = basicSetRead(newRead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.IMPORT_OPERATION__READ, newRead, newRead));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelinePackage.IMPORT_OPERATION__USE, oldUse, use));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.IMPORT_OPERATION__USE, oldUse, use));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.IMPORT_OPERATION__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.IMPORT_OPERATION__READ:
				if (read != null)
					msgs = ((InternalEObject)read).eInverseRemove(this, PipelinePackage.SOURCE__LINKED_TO, Source.class, msgs);
				return basicSetRead((Source)otherEnd, msgs);
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
			case PipelinePackage.IMPORT_OPERATION__READ:
				return basicSetRead(null, msgs);
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
			case PipelinePackage.IMPORT_OPERATION__ID:
				return getID();
			case PipelinePackage.IMPORT_OPERATION__READ:
				if (resolve) return getRead();
				return basicGetRead();
			case PipelinePackage.IMPORT_OPERATION__USE:
				if (resolve) return getUse();
				return basicGetUse();
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
			case PipelinePackage.IMPORT_OPERATION__ID:
				setID((String)newValue);
				return;
			case PipelinePackage.IMPORT_OPERATION__READ:
				setRead((Source)newValue);
				return;
			case PipelinePackage.IMPORT_OPERATION__USE:
				setUse((Schema)newValue);
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
			case PipelinePackage.IMPORT_OPERATION__ID:
				setID(ID_EDEFAULT);
				return;
			case PipelinePackage.IMPORT_OPERATION__READ:
				setRead((Source)null);
				return;
			case PipelinePackage.IMPORT_OPERATION__USE:
				setUse((Schema)null);
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
			case PipelinePackage.IMPORT_OPERATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PipelinePackage.IMPORT_OPERATION__READ:
				return read != null;
			case PipelinePackage.IMPORT_OPERATION__USE:
				return use != null;
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

} //ImportOperationImpl
