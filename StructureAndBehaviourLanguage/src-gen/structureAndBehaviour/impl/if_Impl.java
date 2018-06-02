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
import structureAndBehaviour.BlockOfCode;
import structureAndBehaviour.StructureAndBehaviourPackage;
import structureAndBehaviour.if_;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>if </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.impl.if_Impl#getElseBody <em>Else Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class if_Impl extends ConditionalStatementImpl implements if_ {
	/**
	 * The cached value of the '{@link #getElseBody() <em>Else Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBody()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockOfCode> elseBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected if_Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureAndBehaviourPackage.Literals.IF_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockOfCode> getElseBody() {
		if (elseBody == null) {
			elseBody = new EObjectContainmentEList<BlockOfCode>(BlockOfCode.class, this,
					StructureAndBehaviourPackage.IF___ELSE_BODY);
		}
		return elseBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructureAndBehaviourPackage.IF___ELSE_BODY:
			return ((InternalEList<?>) getElseBody()).basicRemove(otherEnd, msgs);
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
		case StructureAndBehaviourPackage.IF___ELSE_BODY:
			return getElseBody();
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
		case StructureAndBehaviourPackage.IF___ELSE_BODY:
			getElseBody().clear();
			getElseBody().addAll((Collection<? extends BlockOfCode>) newValue);
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
		case StructureAndBehaviourPackage.IF___ELSE_BODY:
			getElseBody().clear();
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
		case StructureAndBehaviourPackage.IF___ELSE_BODY:
			return elseBody != null && !elseBody.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //if_Impl
