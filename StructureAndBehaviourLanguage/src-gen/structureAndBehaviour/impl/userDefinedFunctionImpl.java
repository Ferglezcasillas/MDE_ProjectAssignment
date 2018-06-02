/**
 */
package structureAndBehaviour.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structureAndBehaviour.Function;
import structureAndBehaviour.StructureAndBehaviourPackage;
import structureAndBehaviour.userDefinedFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>user Defined Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.impl.userDefinedFunctionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class userDefinedFunctionImpl extends CallFunctionImpl implements userDefinedFunction {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Function function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected userDefinedFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureAndBehaviourPackage.Literals.USER_DEFINED_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject) function;
			function = (Function) eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructureAndBehaviourPackage.USER_DEFINED_FUNCTION__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		Function oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StructureAndBehaviourPackage.USER_DEFINED_FUNCTION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructureAndBehaviourPackage.USER_DEFINED_FUNCTION__FUNCTION:
			if (resolve)
				return getFunction();
			return basicGetFunction();
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
		case StructureAndBehaviourPackage.USER_DEFINED_FUNCTION__FUNCTION:
			setFunction((Function) newValue);
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
		case StructureAndBehaviourPackage.USER_DEFINED_FUNCTION__FUNCTION:
			setFunction((Function) null);
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
		case StructureAndBehaviourPackage.USER_DEFINED_FUNCTION__FUNCTION:
			return function != null;
		}
		return super.eIsSet(featureID);
	}

} //userDefinedFunctionImpl
