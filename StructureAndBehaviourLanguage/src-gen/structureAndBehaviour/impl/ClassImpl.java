/**
 */
package structureAndBehaviour.impl;

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
import structureAndBehaviour.Function;
import structureAndBehaviour.Interface;
import structureAndBehaviour.StructureAndBehaviourPackage;
import structureAndBehaviour.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.ClassImpl#getType <em>Type</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.ClassImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.ClassImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.ClassImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.ClassImpl#getInherated <em>Inherated</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements structureAndBehaviour.Class {
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
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected String accessType = ACCESS_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> method;

	/**
	 * The cached value of the '{@link #getInherated() <em>Inherated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherated()
	 * @generated
	 * @ordered
	 */
	protected structureAndBehaviour.Class inherated;

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
		return StructureAndBehaviourPackage.Literals.CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.CLASS__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.CLASS__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessType() {
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessType(String newAccessType) {
		String oldAccessType = accessType;
		accessType = newAccessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.CLASS__ACCESS_TYPE,
					oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this,
					StructureAndBehaviourPackage.CLASS__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getMethod() {
		if (method == null) {
			method = new EObjectContainmentEList<Function>(Function.class, this,
					StructureAndBehaviourPackage.CLASS__METHOD);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structureAndBehaviour.Class getInherated() {
		if (inherated != null && inherated.eIsProxy()) {
			InternalEObject oldInherated = (InternalEObject) inherated;
			inherated = (structureAndBehaviour.Class) eResolveProxy(oldInherated);
			if (inherated != oldInherated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructureAndBehaviourPackage.CLASS__INHERATED, oldInherated, inherated));
			}
		}
		return inherated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structureAndBehaviour.Class basicGetInherated() {
		return inherated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInherated(structureAndBehaviour.Class newInherated) {
		structureAndBehaviour.Class oldInherated = inherated;
		inherated = newInherated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.CLASS__INHERATED,
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
							StructureAndBehaviourPackage.CLASS__IMPLEMENTS, oldImplements, implements_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.CLASS__IMPLEMENTS,
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
		case StructureAndBehaviourPackage.CLASS__VARIABLE:
			return ((InternalEList<?>) getVariable()).basicRemove(otherEnd, msgs);
		case StructureAndBehaviourPackage.CLASS__METHOD:
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
		case StructureAndBehaviourPackage.CLASS__NAME:
			return getName();
		case StructureAndBehaviourPackage.CLASS__TYPE:
			return getType();
		case StructureAndBehaviourPackage.CLASS__ACCESS_TYPE:
			return getAccessType();
		case StructureAndBehaviourPackage.CLASS__VARIABLE:
			return getVariable();
		case StructureAndBehaviourPackage.CLASS__METHOD:
			return getMethod();
		case StructureAndBehaviourPackage.CLASS__INHERATED:
			if (resolve)
				return getInherated();
			return basicGetInherated();
		case StructureAndBehaviourPackage.CLASS__IMPLEMENTS:
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
		case StructureAndBehaviourPackage.CLASS__NAME:
			setName((String) newValue);
			return;
		case StructureAndBehaviourPackage.CLASS__TYPE:
			setType((String) newValue);
			return;
		case StructureAndBehaviourPackage.CLASS__ACCESS_TYPE:
			setAccessType((String) newValue);
			return;
		case StructureAndBehaviourPackage.CLASS__VARIABLE:
			getVariable().clear();
			getVariable().addAll((Collection<? extends Variable>) newValue);
			return;
		case StructureAndBehaviourPackage.CLASS__METHOD:
			getMethod().clear();
			getMethod().addAll((Collection<? extends Function>) newValue);
			return;
		case StructureAndBehaviourPackage.CLASS__INHERATED:
			setInherated((structureAndBehaviour.Class) newValue);
			return;
		case StructureAndBehaviourPackage.CLASS__IMPLEMENTS:
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
		case StructureAndBehaviourPackage.CLASS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructureAndBehaviourPackage.CLASS__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case StructureAndBehaviourPackage.CLASS__ACCESS_TYPE:
			setAccessType(ACCESS_TYPE_EDEFAULT);
			return;
		case StructureAndBehaviourPackage.CLASS__VARIABLE:
			getVariable().clear();
			return;
		case StructureAndBehaviourPackage.CLASS__METHOD:
			getMethod().clear();
			return;
		case StructureAndBehaviourPackage.CLASS__INHERATED:
			setInherated((structureAndBehaviour.Class) null);
			return;
		case StructureAndBehaviourPackage.CLASS__IMPLEMENTS:
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
		case StructureAndBehaviourPackage.CLASS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StructureAndBehaviourPackage.CLASS__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case StructureAndBehaviourPackage.CLASS__ACCESS_TYPE:
			return ACCESS_TYPE_EDEFAULT == null ? accessType != null : !ACCESS_TYPE_EDEFAULT.equals(accessType);
		case StructureAndBehaviourPackage.CLASS__VARIABLE:
			return variable != null && !variable.isEmpty();
		case StructureAndBehaviourPackage.CLASS__METHOD:
			return method != null && !method.isEmpty();
		case StructureAndBehaviourPackage.CLASS__INHERATED:
			return inherated != null;
		case StructureAndBehaviourPackage.CLASS__IMPLEMENTS:
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
