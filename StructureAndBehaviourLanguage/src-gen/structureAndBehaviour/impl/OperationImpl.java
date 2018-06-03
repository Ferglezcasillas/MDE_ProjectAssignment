/**
 */
package structureAndBehaviour.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import structureAndBehaviour.Expression;
import structureAndBehaviour.Operation;
import structureAndBehaviour.StructureAndBehaviourPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.impl.OperationImpl#getRightInput <em>Right Input</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.OperationImpl#getLeftInput <em>Left Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends ExpressionImpl implements Operation {
	/**
	 * The cached value of the '{@link #getRightInput() <em>Right Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightInput()
	 * @generated
	 * @ordered
	 */
	protected Expression rightInput;

	/**
	 * The cached value of the '{@link #getLeftInput() <em>Left Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftInput()
	 * @generated
	 * @ordered
	 */
	protected Expression leftInput;

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
		return StructureAndBehaviourPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightInput() {
		return rightInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightInput(Expression newRightInput, NotificationChain msgs) {
		Expression oldRightInput = rightInput;
		rightInput = newRightInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StructureAndBehaviourPackage.OPERATION__RIGHT_INPUT, oldRightInput, newRightInput);
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
	public void setRightInput(Expression newRightInput) {
		if (newRightInput != rightInput) {
			NotificationChain msgs = null;
			if (rightInput != null)
				msgs = ((InternalEObject) rightInput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StructureAndBehaviourPackage.OPERATION__RIGHT_INPUT, null, msgs);
			if (newRightInput != null)
				msgs = ((InternalEObject) newRightInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StructureAndBehaviourPackage.OPERATION__RIGHT_INPUT, null, msgs);
			msgs = basicSetRightInput(newRightInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.OPERATION__RIGHT_INPUT,
					newRightInput, newRightInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftInput() {
		return leftInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftInput(Expression newLeftInput, NotificationChain msgs) {
		Expression oldLeftInput = leftInput;
		leftInput = newLeftInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StructureAndBehaviourPackage.OPERATION__LEFT_INPUT, oldLeftInput, newLeftInput);
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
	public void setLeftInput(Expression newLeftInput) {
		if (newLeftInput != leftInput) {
			NotificationChain msgs = null;
			if (leftInput != null)
				msgs = ((InternalEObject) leftInput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StructureAndBehaviourPackage.OPERATION__LEFT_INPUT, null, msgs);
			if (newLeftInput != null)
				msgs = ((InternalEObject) newLeftInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StructureAndBehaviourPackage.OPERATION__LEFT_INPUT, null, msgs);
			msgs = basicSetLeftInput(newLeftInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.OPERATION__LEFT_INPUT,
					newLeftInput, newLeftInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructureAndBehaviourPackage.OPERATION__RIGHT_INPUT:
			return basicSetRightInput(null, msgs);
		case StructureAndBehaviourPackage.OPERATION__LEFT_INPUT:
			return basicSetLeftInput(null, msgs);
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
		case StructureAndBehaviourPackage.OPERATION__RIGHT_INPUT:
			return getRightInput();
		case StructureAndBehaviourPackage.OPERATION__LEFT_INPUT:
			return getLeftInput();
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
		case StructureAndBehaviourPackage.OPERATION__RIGHT_INPUT:
			setRightInput((Expression) newValue);
			return;
		case StructureAndBehaviourPackage.OPERATION__LEFT_INPUT:
			setLeftInput((Expression) newValue);
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
		case StructureAndBehaviourPackage.OPERATION__RIGHT_INPUT:
			setRightInput((Expression) null);
			return;
		case StructureAndBehaviourPackage.OPERATION__LEFT_INPUT:
			setLeftInput((Expression) null);
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
		case StructureAndBehaviourPackage.OPERATION__RIGHT_INPUT:
			return rightInput != null;
		case StructureAndBehaviourPackage.OPERATION__LEFT_INPUT:
			return leftInput != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
