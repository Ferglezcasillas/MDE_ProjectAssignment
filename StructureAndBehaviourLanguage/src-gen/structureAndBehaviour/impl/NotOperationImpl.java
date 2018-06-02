/**
 */
package structureAndBehaviour.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structureAndBehaviour.NotOperation;
import structureAndBehaviour.Primative;
import structureAndBehaviour.StructureAndBehaviourPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.impl.NotOperationImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotOperationImpl extends ExpressionImpl implements NotOperation {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected Primative input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureAndBehaviourPackage.Literals.NOT_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primative getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject) input;
			input = (Primative) eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructureAndBehaviourPackage.NOT_OPERATION__INPUT, oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primative basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(Primative newInput) {
		Primative oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.NOT_OPERATION__INPUT,
					oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructureAndBehaviourPackage.NOT_OPERATION__INPUT:
			if (resolve)
				return getInput();
			return basicGetInput();
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
		case StructureAndBehaviourPackage.NOT_OPERATION__INPUT:
			setInput((Primative) newValue);
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
		case StructureAndBehaviourPackage.NOT_OPERATION__INPUT:
			setInput((Primative) null);
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
		case StructureAndBehaviourPackage.NOT_OPERATION__INPUT:
			return input != null;
		}
		return super.eIsSet(featureID);
	}

} //NotOperationImpl
