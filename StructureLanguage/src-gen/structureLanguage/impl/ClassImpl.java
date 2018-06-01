/**
 */
package structureLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structureLanguage.AccessType;
import structureLanguage.ClassType;
import structureLanguage.Interface;
import structureLanguage.Method;
import structureLanguage.StructureLanguagePackage;
import structureLanguage.VariableC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureLanguage.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link structureLanguage.impl.ClassImpl#getType <em>Type</em>}</li>
 *   <li>{@link structureLanguage.impl.ClassImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link structureLanguage.impl.ClassImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link structureLanguage.impl.ClassImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link structureLanguage.impl.ClassImpl#getInherated <em>Inherated</em>}</li>
 *   <li>{@link structureLanguage.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements structureLanguage.Class {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ClassType TYPE_EDEFAULT = ClassType.ABSTRACT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ClassType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableC> variable;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> method;

	/**
	 * The cached value of the '{@link #getInherated() <em>Inherated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherated()
	 * @generated
	 * @ordered
	 */
	protected structureLanguage.Class inherated;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected Interface implements_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureLanguagePackage.Literals.CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureLanguagePackage.CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ClassType newType) {
		ClassType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureLanguagePackage.CLASS__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureLanguagePackage.CLASS__ACCESS_TYPE,
					oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableC> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<VariableC>(VariableC.class, this,
					StructureLanguagePackage.CLASS__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getMethod() {
		if (method == null) {
			method = new EObjectContainmentEList<Method>(Method.class, this, StructureLanguagePackage.CLASS__METHOD);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structureLanguage.Class getInherated() {
		if (inherated != null && inherated.eIsProxy()) {
			InternalEObject oldInherated = (InternalEObject) inherated;
			inherated = (structureLanguage.Class) eResolveProxy(oldInherated);
			if (inherated != oldInherated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructureLanguagePackage.CLASS__INHERATED,
							oldInherated, inherated));
			}
		}
		return inherated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structureLanguage.Class basicGetInherated() {
		return inherated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInherated(structureLanguage.Class newInherated) {
		structureLanguage.Class oldInherated = inherated;
		inherated = newInherated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureLanguagePackage.CLASS__INHERATED,
					oldInherated, inherated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getImplements() {
		if (implements_ != null && implements_.eIsProxy()) {
			InternalEObject oldImplements = (InternalEObject) implements_;
			implements_ = (Interface) eResolveProxy(oldImplements);
			if (implements_ != oldImplements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructureLanguagePackage.CLASS__IMPLEMENTS, oldImplements, implements_));
			}
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(Interface newImplements) {
		Interface oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureLanguagePackage.CLASS__IMPLEMENTS,
					oldImplements, implements_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructureLanguagePackage.CLASS__VARIABLE:
			return ((InternalEList<?>) getVariable()).basicRemove(otherEnd, msgs);
		case StructureLanguagePackage.CLASS__METHOD:
			return ((InternalEList<?>) getMethod()).basicRemove(otherEnd, msgs);
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
		case StructureLanguagePackage.CLASS__NAME:
			return getName();
		case StructureLanguagePackage.CLASS__TYPE:
			return getType();
		case StructureLanguagePackage.CLASS__ACCESS_TYPE:
			return getAccessType();
		case StructureLanguagePackage.CLASS__VARIABLE:
			return getVariable();
		case StructureLanguagePackage.CLASS__METHOD:
			return getMethod();
		case StructureLanguagePackage.CLASS__INHERATED:
			if (resolve)
				return getInherated();
			return basicGetInherated();
		case StructureLanguagePackage.CLASS__IMPLEMENTS:
			if (resolve)
				return getImplements();
			return basicGetImplements();
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
		case StructureLanguagePackage.CLASS__NAME:
			setName((String) newValue);
			return;
		case StructureLanguagePackage.CLASS__TYPE:
			setType((ClassType) newValue);
			return;
		case StructureLanguagePackage.CLASS__ACCESS_TYPE:
			setAccessType((AccessType) newValue);
			return;
		case StructureLanguagePackage.CLASS__VARIABLE:
			getVariable().clear();
			getVariable().addAll((Collection<? extends VariableC>) newValue);
			return;
		case StructureLanguagePackage.CLASS__METHOD:
			getMethod().clear();
			getMethod().addAll((Collection<? extends Method>) newValue);
			return;
		case StructureLanguagePackage.CLASS__INHERATED:
			setInherated((structureLanguage.Class) newValue);
			return;
		case StructureLanguagePackage.CLASS__IMPLEMENTS:
			setImplements((Interface) newValue);
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
		case StructureLanguagePackage.CLASS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructureLanguagePackage.CLASS__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case StructureLanguagePackage.CLASS__ACCESS_TYPE:
			setAccessType(ACCESS_TYPE_EDEFAULT);
			return;
		case StructureLanguagePackage.CLASS__VARIABLE:
			getVariable().clear();
			return;
		case StructureLanguagePackage.CLASS__METHOD:
			getMethod().clear();
			return;
		case StructureLanguagePackage.CLASS__INHERATED:
			setInherated((structureLanguage.Class) null);
			return;
		case StructureLanguagePackage.CLASS__IMPLEMENTS:
			setImplements((Interface) null);
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
		case StructureLanguagePackage.CLASS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StructureLanguagePackage.CLASS__TYPE:
			return type != TYPE_EDEFAULT;
		case StructureLanguagePackage.CLASS__ACCESS_TYPE:
			return accessType != ACCESS_TYPE_EDEFAULT;
		case StructureLanguagePackage.CLASS__VARIABLE:
			return variable != null && !variable.isEmpty();
		case StructureLanguagePackage.CLASS__METHOD:
			return method != null && !method.isEmpty();
		case StructureLanguagePackage.CLASS__INHERATED:
			return inherated != null;
		case StructureLanguagePackage.CLASS__IMPLEMENTS:
			return implements_ != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(", accessType: ");
		result.append(accessType);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
