/**
 */
package behaviourLanguage.impl;

import behaviourLanguage.BehaviourLanguagePackage;
import behaviourLanguage.Expression;
import behaviourLanguage.Operation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.impl.OperationImpl#getLeftInput <em>Left Input</em>}</li>
 *   <li>{@link behaviourLanguage.impl.OperationImpl#getRightInput <em>Right Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationImpl extends ExpressionImpl implements Operation {
	/**
	 * The cached value of the '{@link #getLeftInput() <em>Left Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftInput()
	 * @generated
	 * @ordered
	 */
	protected Expression leftInput;

	/**
	 * The cached value of the '{@link #getRightInput() <em>Right Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightInput()
	 * @generated
	 * @ordered
	 */
	protected Expression rightInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourLanguagePackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftInput() {
		if (leftInput != null && leftInput.eIsProxy()) {
			InternalEObject oldLeftInput = (InternalEObject) leftInput;
			leftInput = (Expression) eResolveProxy(oldLeftInput);
			if (leftInput != oldLeftInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviourLanguagePackage.OPERATION__LEFT_INPUT, oldLeftInput, leftInput));
			}
		}
		return leftInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetLeftInput() {
		return leftInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftInput(Expression newLeftInput) {
		Expression oldLeftInput = leftInput;
		leftInput = newLeftInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.OPERATION__LEFT_INPUT,
					oldLeftInput, leftInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightInput() {
		if (rightInput != null && rightInput.eIsProxy()) {
			InternalEObject oldRightInput = (InternalEObject) rightInput;
			rightInput = (Expression) eResolveProxy(oldRightInput);
			if (rightInput != oldRightInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviourLanguagePackage.OPERATION__RIGHT_INPUT, oldRightInput, rightInput));
			}
		}
		return rightInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetRightInput() {
		return rightInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightInput(Expression newRightInput) {
		Expression oldRightInput = rightInput;
		rightInput = newRightInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.OPERATION__RIGHT_INPUT,
					oldRightInput, rightInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BehaviourLanguagePackage.OPERATION__LEFT_INPUT:
			if (resolve)
				return getLeftInput();
			return basicGetLeftInput();
		case BehaviourLanguagePackage.OPERATION__RIGHT_INPUT:
			if (resolve)
				return getRightInput();
			return basicGetRightInput();
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
		case BehaviourLanguagePackage.OPERATION__LEFT_INPUT:
			setLeftInput((Expression) newValue);
			return;
		case BehaviourLanguagePackage.OPERATION__RIGHT_INPUT:
			setRightInput((Expression) newValue);
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
		case BehaviourLanguagePackage.OPERATION__LEFT_INPUT:
			setLeftInput((Expression) null);
			return;
		case BehaviourLanguagePackage.OPERATION__RIGHT_INPUT:
			setRightInput((Expression) null);
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
		case BehaviourLanguagePackage.OPERATION__LEFT_INPUT:
			return leftInput != null;
		case BehaviourLanguagePackage.OPERATION__RIGHT_INPUT:
			return rightInput != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
