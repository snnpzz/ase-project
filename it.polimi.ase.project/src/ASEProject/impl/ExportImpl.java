/**
 */
package ASEProject.impl;

import ASEProject.ASEProjectPackage;
import ASEProject.Export;
import ASEProject.File;
import ASEProject.Schema;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ASEProject.impl.ExportImpl#getGenerates <em>Generates</em>}</li>
 *   <li>{@link ASEProject.impl.ExportImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link ASEProject.impl.ExportImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportImpl extends EObjectImpl implements Export {
	/**
	 * The cached value of the '{@link #getGenerates() <em>Generates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerates()
	 * @generated
	 * @ordered
	 */
	protected File generates;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected Schema uses;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASEProjectPackage.Literals.EXPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getGenerates() {
		if (generates != null && generates.eIsProxy()) {
			InternalEObject oldGenerates = (InternalEObject)generates;
			generates = (File)eResolveProxy(oldGenerates);
			if (generates != oldGenerates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASEProjectPackage.EXPORT__GENERATES, oldGenerates, generates));
			}
		}
		return generates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetGenerates() {
		return generates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerates(File newGenerates, NotificationChain msgs) {
		File oldGenerates = generates;
		generates = newGenerates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASEProjectPackage.EXPORT__GENERATES, oldGenerates, newGenerates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerates(File newGenerates) {
		if (newGenerates != generates) {
			NotificationChain msgs = null;
			if (generates != null)
				msgs = ((InternalEObject)generates).eInverseRemove(this, ASEProjectPackage.FILE__COMES_FROM, File.class, msgs);
			if (newGenerates != null)
				msgs = ((InternalEObject)newGenerates).eInverseAdd(this, ASEProjectPackage.FILE__COMES_FROM, File.class, msgs);
			msgs = basicSetGenerates(newGenerates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASEProjectPackage.EXPORT__GENERATES, newGenerates, newGenerates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getUses() {
		if (uses != null && uses.eIsProxy()) {
			InternalEObject oldUses = (InternalEObject)uses;
			uses = (Schema)eResolveProxy(oldUses);
			if (uses != oldUses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASEProjectPackage.EXPORT__USES, oldUses, uses));
			}
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUses(Schema newUses) {
		Schema oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASEProjectPackage.EXPORT__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASEProjectPackage.EXPORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASEProjectPackage.EXPORT__GENERATES:
				if (generates != null)
					msgs = ((InternalEObject)generates).eInverseRemove(this, ASEProjectPackage.FILE__COMES_FROM, File.class, msgs);
				return basicSetGenerates((File)otherEnd, msgs);
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
			case ASEProjectPackage.EXPORT__GENERATES:
				return basicSetGenerates(null, msgs);
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
			case ASEProjectPackage.EXPORT__GENERATES:
				if (resolve) return getGenerates();
				return basicGetGenerates();
			case ASEProjectPackage.EXPORT__USES:
				if (resolve) return getUses();
				return basicGetUses();
			case ASEProjectPackage.EXPORT__NAME:
				return getName();
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
			case ASEProjectPackage.EXPORT__GENERATES:
				setGenerates((File)newValue);
				return;
			case ASEProjectPackage.EXPORT__USES:
				setUses((Schema)newValue);
				return;
			case ASEProjectPackage.EXPORT__NAME:
				setName((String)newValue);
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
			case ASEProjectPackage.EXPORT__GENERATES:
				setGenerates((File)null);
				return;
			case ASEProjectPackage.EXPORT__USES:
				setUses((Schema)null);
				return;
			case ASEProjectPackage.EXPORT__NAME:
				setName(NAME_EDEFAULT);
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
			case ASEProjectPackage.EXPORT__GENERATES:
				return generates != null;
			case ASEProjectPackage.EXPORT__USES:
				return uses != null;
			case ASEProjectPackage.EXPORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ExportImpl
