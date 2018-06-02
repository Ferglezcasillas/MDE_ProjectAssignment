/**
 */
package structureAndBehaviour.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * The cached value of the '{@link #getRightInput() <em>Right Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> rightInput;

	/**
	 * The cached value of the '{@link #getLeftInput() <em>Left Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> leftInput;

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
	public EList<Expression> getRightInput() {
		if (rightInput == null) {
			rightInput = new EObjectContainmentEList<Expression>(Expression.class, this,
					StructureAndBehaviourPackage.OPERATION__RIGHT_INPUT);
		}
		return rightInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getLeftInput() {
		if (leftInput == null) {
			leftInput = new EObjectContainmentEList<Expression>(Expression.class, this,
					StructureAndBehaviourPackage.OPERATION__LEFT_INPUT);
		}
		return leftInput;
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
			return ((InternalEList<?>) getRightInput()).basicRemove(otherEnd, msgs);
		case StructureAndBehaviourPackage.OPERATION__LEFT_INPUT:
			return ((InternalEList<?>) getLeftInput()).basicRemove(otherEnd, msgs);
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
			getRightInput().clear();
			getRightInput().addAll((Collection<? extends Expression>) newValue);
			return;
		case StructureAndBehaviourPackage.OPERATION__LEFT_INPUT:
			getLeftInput().clear();
			getLeftInput().addAll((Collection<? extends Expression>) newValue);
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
			getRightInput().clear();
			return;
		case StructureAndBehaviourPackage.OPERATION__LEFT_INPUT:
			getLeftInput().clear();
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
			return rightInput != null && !rightInput.isEmpty();
		case StructureAndBehaviourPackage.OPERATION__LEFT_INPUT:
			return leftInput != null && !leftInput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
