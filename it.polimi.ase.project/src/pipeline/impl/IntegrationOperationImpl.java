/**
 */
package pipeline.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pipeline.Attribute;
import pipeline.IntegrationOperation;
import pipeline.PipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pipeline.impl.IntegrationOperationImpl#getID <em>ID</em>}</li>
 *   <li>{@link pipeline.impl.IntegrationOperationImpl#getInputAttributes <em>Input Attributes</em>}</li>
 *   <li>{@link pipeline.impl.IntegrationOperationImpl#getOutputAttribute <em>Output Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrationOperationImpl extends EObjectImpl implements IntegrationOperation {
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
	 * The cached value of the '{@link #getInputAttributes() <em>Input Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> inputAttributes;

	/**
	 * The cached value of the '{@link #getOutputAttribute() <em>Output Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute outputAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.INTEGRATION_OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.INTEGRATION_OPERATION__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getInputAttributes() {
		if (inputAttributes == null) {
			inputAttributes = new EObjectResolvingEList<Attribute>(Attribute.class, this, PipelinePackage.INTEGRATION_OPERATION__INPUT_ATTRIBUTES);
		}
		return inputAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getOutputAttribute() {
		if (outputAttribute != null && outputAttribute.eIsProxy()) {
			InternalEObject oldOutputAttribute = (InternalEObject)outputAttribute;
			outputAttribute = (Attribute)eResolveProxy(oldOutputAttribute);
			if (outputAttribute != oldOutputAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipelinePackage.INTEGRATION_OPERATION__OUTPUT_ATTRIBUTE, oldOutputAttribute, outputAttribute));
			}
		}
		return outputAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetOutputAttribute() {
		return outputAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputAttribute(Attribute newOutputAttribute) {
		Attribute oldOutputAttribute = outputAttribute;
		outputAttribute = newOutputAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinePackage.INTEGRATION_OPERATION__OUTPUT_ATTRIBUTE, oldOutputAttribute, outputAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.INTEGRATION_OPERATION__ID:
				return getID();
			case PipelinePackage.INTEGRATION_OPERATION__INPUT_ATTRIBUTES:
				return getInputAttributes();
			case PipelinePackage.INTEGRATION_OPERATION__OUTPUT_ATTRIBUTE:
				if (resolve) return getOutputAttribute();
				return basicGetOutputAttribute();
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
			case PipelinePackage.INTEGRATION_OPERATION__ID:
				setID((String)newValue);
				return;
			case PipelinePackage.INTEGRATION_OPERATION__INPUT_ATTRIBUTES:
				getInputAttributes().clear();
				getInputAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case PipelinePackage.INTEGRATION_OPERATION__OUTPUT_ATTRIBUTE:
				setOutputAttribute((Attribute)newValue);
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
			case PipelinePackage.INTEGRATION_OPERATION__ID:
				setID(ID_EDEFAULT);
				return;
			case PipelinePackage.INTEGRATION_OPERATION__INPUT_ATTRIBUTES:
				getInputAttributes().clear();
				return;
			case PipelinePackage.INTEGRATION_OPERATION__OUTPUT_ATTRIBUTE:
				setOutputAttribute((Attribute)null);
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
			case PipelinePackage.INTEGRATION_OPERATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PipelinePackage.INTEGRATION_OPERATION__INPUT_ATTRIBUTES:
				return inputAttributes != null && !inputAttributes.isEmpty();
			case PipelinePackage.INTEGRATION_OPERATION__OUTPUT_ATTRIBUTE:
				return outputAttribute != null;
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

} //IntegrationOperationImpl
