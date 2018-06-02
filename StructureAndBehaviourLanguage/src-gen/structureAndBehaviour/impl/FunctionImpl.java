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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import structureAndBehaviour.BlockOfCode;
import structureAndBehaviour.Function;
import structureAndBehaviour.StructureAndBehaviourPackage;
import structureAndBehaviour.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.impl.FunctionImpl#getBlockofcode <em>Blockofcode</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.FunctionImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.FunctionImpl#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
	/**
	 * The cached value of the '{@link #getBlockofcode() <em>Blockofcode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockofcode()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockOfCode> blockofcode;

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
		return StructureAndBehaviourPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockOfCode> getBlockofcode() {
		if (blockofcode == null) {
			blockofcode = new EObjectContainmentEList<BlockOfCode>(BlockOfCode.class, this,
					StructureAndBehaviourPackage.FUNCTION__BLOCKOFCODE);
		}
		return blockofcode;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.FUNCTION__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.FUNCTION__ACCESS_TYPE,
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
					StructureAndBehaviourPackage.FUNCTION__PARAMETERS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructureAndBehaviourPackage.FUNCTION__RETURN, oldReturn, return_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.FUNCTION__RETURN,
					oldReturn, return_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructureAndBehaviourPackage.FUNCTION__BLOCKOFCODE:
			return ((InternalEList<?>) getBlockofcode()).basicRemove(otherEnd, msgs);
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
		case StructureAndBehaviourPackage.FUNCTION__BLOCKOFCODE:
			return getBlockofcode();
		case StructureAndBehaviourPackage.FUNCTION__NAME:
			return getName();
		case StructureAndBehaviourPackage.FUNCTION__ACCESS_TYPE:
			return getAccessType();
		case StructureAndBehaviourPackage.FUNCTION__PARAMETERS:
			return getParameters();
		case StructureAndBehaviourPackage.FUNCTION__RETURN:
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
		case StructureAndBehaviourPackage.FUNCTION__BLOCKOFCODE:
			getBlockofcode().clear();
			getBlockofcode().addAll((Collection<? extends BlockOfCode>) newValue);
			return;
		case StructureAndBehaviourPackage.FUNCTION__NAME:
			setName((String) newValue);
			return;
		case StructureAndBehaviourPackage.FUNCTION__ACCESS_TYPE:
			setAccessType((String) newValue);
			return;
		case StructureAndBehaviourPackage.FUNCTION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Variable>) newValue);
			return;
		case StructureAndBehaviourPackage.FUNCTION__RETURN:
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
		case StructureAndBehaviourPackage.FUNCTION__BLOCKOFCODE:
			getBlockofcode().clear();
			return;
		case StructureAndBehaviourPackage.FUNCTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructureAndBehaviourPackage.FUNCTION__ACCESS_TYPE:
			setAccessType(ACCESS_TYPE_EDEFAULT);
			return;
		case StructureAndBehaviourPackage.FUNCTION__PARAMETERS:
			getParameters().clear();
			return;
		case StructureAndBehaviourPackage.FUNCTION__RETURN:
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
		case StructureAndBehaviourPackage.FUNCTION__BLOCKOFCODE:
			return blockofcode != null && !blockofcode.isEmpty();
		case StructureAndBehaviourPackage.FUNCTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StructureAndBehaviourPackage.FUNCTION__ACCESS_TYPE:
			return ACCESS_TYPE_EDEFAULT == null ? accessType != null : !ACCESS_TYPE_EDEFAULT.equals(accessType);
		case StructureAndBehaviourPackage.FUNCTION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case StructureAndBehaviourPackage.FUNCTION__RETURN:
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
