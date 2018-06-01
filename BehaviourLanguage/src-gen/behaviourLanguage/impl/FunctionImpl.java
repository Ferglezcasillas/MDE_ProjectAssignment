/**
 */
package behaviourLanguage.impl;

import behaviourLanguage.AccessType;
import behaviourLanguage.BehaviourLanguagePackage;
import behaviourLanguage.BlockOfCode;
import behaviourLanguage.Function;
import behaviourLanguage.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.impl.FunctionImpl#getBlockofcode <em>Blockofcode</em>}</li>
 *   <li>{@link behaviourLanguage.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link behaviourLanguage.impl.FunctionImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link behaviourLanguage.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link behaviourLanguage.impl.FunctionImpl#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
	/**
	 * The cached value of the '{@link #getBlockofcode() <em>Blockofcode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockofcode()
	 * @generated
	 * @ordered
	 */
	protected BlockOfCode blockofcode;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> parameters;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourLanguagePackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockOfCode getBlockofcode() {
		return blockofcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockofcode(BlockOfCode newBlockofcode, NotificationChain msgs) {
		BlockOfCode oldBlockofcode = blockofcode;
		blockofcode = newBlockofcode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BehaviourLanguagePackage.FUNCTION__BLOCKOFCODE, oldBlockofcode, newBlockofcode);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockofcode(BlockOfCode newBlockofcode) {
		if (newBlockofcode != blockofcode) {
			NotificationChain msgs = null;
			if (blockofcode != null)
				msgs = ((InternalEObject) blockofcode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BehaviourLanguagePackage.FUNCTION__BLOCKOFCODE, null, msgs);
			if (newBlockofcode != null)
				msgs = ((InternalEObject) newBlockofcode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BehaviourLanguagePackage.FUNCTION__BLOCKOFCODE, null, msgs);
			msgs = basicSetBlockofcode(newBlockofcode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.FUNCTION__BLOCKOFCODE,
					newBlockofcode, newBlockofcode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.FUNCTION__NAME, oldName,
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.FUNCTION__ACCESS_TYPE,
					oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Variable>(Variable.class, this,
					BehaviourLanguagePackage.FUNCTION__PARAMETERS);
		}
		return parameters;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourLanguagePackage.FUNCTION__RETURN,
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.FUNCTION__RETURN, oldReturn,
					return_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviourLanguagePackage.FUNCTION__BLOCKOFCODE:
			return basicSetBlockofcode(null, msgs);
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
		case BehaviourLanguagePackage.FUNCTION__BLOCKOFCODE:
			return getBlockofcode();
		case BehaviourLanguagePackage.FUNCTION__NAME:
			return getName();
		case BehaviourLanguagePackage.FUNCTION__ACCESS_TYPE:
			return getAccessType();
		case BehaviourLanguagePackage.FUNCTION__PARAMETERS:
			return getParameters();
		case BehaviourLanguagePackage.FUNCTION__RETURN:
			if (resolve)
				return getReturn();
			return basicGetReturn();
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
		case BehaviourLanguagePackage.FUNCTION__BLOCKOFCODE:
			setBlockofcode((BlockOfCode) newValue);
			return;
		case BehaviourLanguagePackage.FUNCTION__NAME:
			setName((String) newValue);
			return;
		case BehaviourLanguagePackage.FUNCTION__ACCESS_TYPE:
			setAccessType((AccessType) newValue);
			return;
		case BehaviourLanguagePackage.FUNCTION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Variable>) newValue);
			return;
		case BehaviourLanguagePackage.FUNCTION__RETURN:
			setReturn((Variable) newValue);
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
		case BehaviourLanguagePackage.FUNCTION__BLOCKOFCODE:
			setBlockofcode((BlockOfCode) null);
			return;
		case BehaviourLanguagePackage.FUNCTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BehaviourLanguagePackage.FUNCTION__ACCESS_TYPE:
			setAccessType(ACCESS_TYPE_EDEFAULT);
			return;
		case BehaviourLanguagePackage.FUNCTION__PARAMETERS:
			getParameters().clear();
			return;
		case BehaviourLanguagePackage.FUNCTION__RETURN:
			setReturn((Variable) null);
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
		case BehaviourLanguagePackage.FUNCTION__BLOCKOFCODE:
			return blockofcode != null;
		case BehaviourLanguagePackage.FUNCTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BehaviourLanguagePackage.FUNCTION__ACCESS_TYPE:
			return accessType != ACCESS_TYPE_EDEFAULT;
		case BehaviourLanguagePackage.FUNCTION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case BehaviourLanguagePackage.FUNCTION__RETURN:
			return return_ != null;
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

} //FunctionImpl
