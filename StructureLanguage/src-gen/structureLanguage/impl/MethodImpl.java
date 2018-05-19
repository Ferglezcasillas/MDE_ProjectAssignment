/**
 */
package structureLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import structureLanguage.AccessType;
import structureLanguage.Method;
import structureLanguage.StructureLanguagePackage;
import structureLanguage.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureLanguage.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link structureLanguage.impl.MethodImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link structureLanguage.impl.MethodImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link structureLanguage.impl.MethodImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
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
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected Variable return_;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<structureLanguage.Class> variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureLanguagePackage.Literals.METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureLanguagePackage.METHOD__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureLanguagePackage.METHOD__ACCESS_TYPE,
					oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<structureLanguage.Class> getVariable() {
		if (variable == null) {
			variable = new EObjectResolvingEList<structureLanguage.Class>(structureLanguage.Class.class, this,
					StructureLanguagePackage.METHOD__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReturn() {
		if (return_ != null && return_.eIsProxy()) {
			InternalEObject oldReturn = (InternalEObject) return_;
			return_ = (Variable) eResolveProxy(oldReturn);
			if (return_ != oldReturn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructureLanguagePackage.METHOD__RETURN,
							oldReturn, return_));
			}
		}
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn(Variable newReturn) {
		Variable oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureLanguagePackage.METHOD__RETURN, oldReturn,
					return_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructureLanguagePackage.METHOD__NAME:
			return getName();
		case StructureLanguagePackage.METHOD__ACCESS_TYPE:
			return getAccessType();
		case StructureLanguagePackage.METHOD__RETURN:
			if (resolve)
				return getReturn();
			return basicGetReturn();
		case StructureLanguagePackage.METHOD__VARIABLE:
			return getVariable();
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
		case StructureLanguagePackage.METHOD__NAME:
			setName((String) newValue);
			return;
		case StructureLanguagePackage.METHOD__ACCESS_TYPE:
			setAccessType((AccessType) newValue);
			return;
		case StructureLanguagePackage.METHOD__RETURN:
			setReturn((Variable) newValue);
			return;
		case StructureLanguagePackage.METHOD__VARIABLE:
			getVariable().clear();
			getVariable().addAll((Collection<? extends structureLanguage.Class>) newValue);
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
		case StructureLanguagePackage.METHOD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructureLanguagePackage.METHOD__ACCESS_TYPE:
			setAccessType(ACCESS_TYPE_EDEFAULT);
			return;
		case StructureLanguagePackage.METHOD__RETURN:
			setReturn((Variable) null);
			return;
		case StructureLanguagePackage.METHOD__VARIABLE:
			getVariable().clear();
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
		case StructureLanguagePackage.METHOD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StructureLanguagePackage.METHOD__ACCESS_TYPE:
			return accessType != ACCESS_TYPE_EDEFAULT;
		case StructureLanguagePackage.METHOD__RETURN:
			return return_ != null;
		case StructureLanguagePackage.METHOD__VARIABLE:
			return variable != null && !variable.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", accessType: ");
		result.append(accessType);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
