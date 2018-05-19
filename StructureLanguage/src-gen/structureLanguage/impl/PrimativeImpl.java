/**
 */
package structureLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structureLanguage.AccessType;
import structureLanguage.Primative;
import structureLanguage.PrimitiveType;
import structureLanguage.StructureLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureLanguage.impl.PrimativeImpl#getType <em>Type</em>}</li>
 *   <li>{@link structureLanguage.impl.PrimativeImpl#getAccessType <em>Access Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimativeImpl extends VariableImpl implements Primative {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveType TYPE_EDEFAULT = PrimitiveType.BYTE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType ACCESS_TYPE_EDEFAULT = AccessType.PUBLIC;

	/**
	 * The cached value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected AccessType accessType = ACCESS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureLanguagePackage.Literals.PRIMATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PrimitiveType newType) {
		PrimitiveType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureLanguagePackage.PRIMATIVE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccessType() {
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessType(AccessType newAccessType) {
		AccessType oldAccessType = accessType;
		accessType = newAccessType == null ? ACCESS_TYPE_EDEFAULT : newAccessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureLanguagePackage.PRIMATIVE__ACCESS_TYPE,
					oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructureLanguagePackage.PRIMATIVE__TYPE:
			return getType();
		case StructureLanguagePackage.PRIMATIVE__ACCESS_TYPE:
			return getAccessType();
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
		case StructureLanguagePackage.PRIMATIVE__TYPE:
			setType((PrimitiveType) newValue);
			return;
		case StructureLanguagePackage.PRIMATIVE__ACCESS_TYPE:
			setAccessType((AccessType) newValue);
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
		case StructureLanguagePackage.PRIMATIVE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case StructureLanguagePackage.PRIMATIVE__ACCESS_TYPE:
			setAccessType(ACCESS_TYPE_EDEFAULT);
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
		case StructureLanguagePackage.PRIMATIVE__TYPE:
			return type != TYPE_EDEFAULT;
		case StructureLanguagePackage.PRIMATIVE__ACCESS_TYPE:
			return accessType != ACCESS_TYPE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", accessType: ");
		result.append(accessType);
		result.append(')');
		return result.toString();
	}

} //PrimativeImpl
