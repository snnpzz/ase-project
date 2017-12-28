/**
 */
package pipeline.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pipeline.Export;
import pipeline.File;
import pipeline.PipelinePackage;
import pipeline.Schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.ExportImpl#getGenerates <em>Generates</em>}</li>
 *   <li>{@link pipeline.impl.ExportImpl#getExpUses <em>Exp Uses</em>}</li>
 *   <li>{@link pipeline.impl.ExportImpl#getName <em>Name</em>}</li>
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
	 * The cached value of the '{@link #getExpUses() <em>Exp Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpUses()
	 * @generated
	 * @ordered
	 */
	protected Schema expUses;

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
		return PipelinePackage.Literals.EXPORT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelinePackage.EXPORT__GENERATES, oldGenerates, generates));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipelinePackage.EXPORT__GENERATES, oldGenerates, newGenerates);
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
				msgs = ((InternalEObject)generates).eInverseRemove(this, PipelinePackage.FILE__COMES_FROM, File.class, msgs);
			if (newGenerates != null)
				msgs = ((InternalEObject)newGenerates).eInverseAdd(this, PipelinePackage.FILE__COMES_FROM, File.class, msgs);
			msgs = basicSetGenerates(newGenerates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.EXPORT__GENERATES, newGenerates, newGenerates));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelinePackage.EXPORT__EXP_USES, oldExpUses, expUses));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.EXPORT__EXP_USES, oldExpUses, expUses));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.EXPORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.EXPORT__GENERATES:
				if (generates != null)
					msgs = ((InternalEObject)generates).eInverseRemove(this, PipelinePackage.FILE__COMES_FROM, File.class, msgs);
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
			case PipelinePackage.EXPORT__GENERATES:
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
			case PipelinePackage.EXPORT__GENERATES:
				if (resolve) return getGenerates();
				return basicGetGenerates();
			case PipelinePackage.EXPORT__EXP_USES:
				if (resolve) return getExpUses();
				return basicGetExpUses();
			case PipelinePackage.EXPORT__NAME:
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
			case PipelinePackage.EXPORT__GENERATES:
				setGenerates((File)newValue);
				return;
			case PipelinePackage.EXPORT__EXP_USES:
				setExpUses((Schema)newValue);
				return;
			case PipelinePackage.EXPORT__NAME:
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
			case PipelinePackage.EXPORT__GENERATES:
				setGenerates((File)null);
				return;
			case PipelinePackage.EXPORT__EXP_USES:
				setExpUses((Schema)null);
				return;
			case PipelinePackage.EXPORT__NAME:
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
			case PipelinePackage.EXPORT__GENERATES:
				return generates != null;
			case PipelinePackage.EXPORT__EXP_USES:
				return expUses != null;
			case PipelinePackage.EXPORT__NAME:
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
