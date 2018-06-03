/**
 */
package structureAndBehaviour.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import structureAndBehaviour.Expression;
import structureAndBehaviour.StructureAndBehaviourPackage;
import structureAndBehaviour.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.impl.ExpressionImpl#getAssign <em>Assign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends generalItemImpl implements Expression {
	/**
	 * The cached value of the '{@link #getAssign() <em>Assign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssign()
	 * @generated
	 * @ordered
	 */
	protected Variable assign;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureAndBehaviourPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getAssign() {
		if (assign != null && assign.eIsProxy()) {
			InternalEObject oldAssign = (InternalEObject) assign;
			assign = (Variable) eResolveProxy(oldAssign);
			if (assign != oldAssign) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructureAndBehaviourPackage.EXPRESSION__ASSIGN, oldAssign, assign));
			}
		}
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetAssign() {
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssign(Variable newAssign) {
		Variable oldAssign = assign;
		assign = newAssign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.EXPRESSION__ASSIGN,
					oldAssign, assign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructureAndBehaviourPackage.EXPRESSION__ASSIGN:
			if (resolve)
				return getAssign();
			return basicGetAssign();
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
		case StructureAndBehaviourPackage.EXPRESSION__ASSIGN:
			setAssign((Variable) newValue);
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
		case StructureAndBehaviourPackage.EXPRESSION__ASSIGN:
			setAssign((Variable) null);
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
		case StructureAndBehaviourPackage.EXPRESSION__ASSIGN:
			return assign != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionImpl
