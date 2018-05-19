/**
 */
package behaviourLanguage.impl;

import behaviourLanguage.BehaviourLanguagePackage;
import behaviourLanguage.BlockOfCode;
import behaviourLanguage.generalItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Of Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.impl.BlockOfCodeImpl#getThings <em>Things</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockOfCodeImpl extends MinimalEObjectImpl.Container implements BlockOfCode {
	/**
	 * The cached value of the '{@link #getThings() <em>Things</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThings()
	 * @generated
	 * @ordered
	 */
	protected EList<generalItem> things;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockOfCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourLanguagePackage.Literals.BLOCK_OF_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<generalItem> getThings() {
		if (things == null) {
			things = new EObjectContainmentEList<generalItem>(generalItem.class, this,
					BehaviourLanguagePackage.BLOCK_OF_CODE__THINGS);
		}
		return things;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviourLanguagePackage.BLOCK_OF_CODE__THINGS:
			return ((InternalEList<?>) getThings()).basicRemove(otherEnd, msgs);
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
		case BehaviourLanguagePackage.BLOCK_OF_CODE__THINGS:
			return getThings();
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
		case BehaviourLanguagePackage.BLOCK_OF_CODE__THINGS:
			getThings().clear();
			getThings().addAll((Collection<? extends generalItem>) newValue);
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
		case BehaviourLanguagePackage.BLOCK_OF_CODE__THINGS:
			getThings().clear();
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
		case BehaviourLanguagePackage.BLOCK_OF_CODE__THINGS:
			return things != null && !things.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockOfCodeImpl
