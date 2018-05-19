/**
 */
package structureLanguage.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structureLanguage.Complex;
import structureLanguage.List;
import structureLanguage.Primative;
import structureLanguage.StructureLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureLanguage.impl.ListImpl#getComplex <em>Complex</em>}</li>
 *   <li>{@link structureLanguage.impl.ListImpl#getPrimative <em>Primative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends VariableImpl implements List {
	/**
	 * The cached value of the '{@link #getComplex() <em>Complex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplex()
	 * @generated
	 * @ordered
	 */
	protected EList<Complex> complex;
	/**
	 * The cached value of the '{@link #getPrimative() <em>Primative</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimative()
	 * @generated
	 * @ordered
	 */
	protected EList<Primative> primative;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureLanguagePackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Complex> getComplex() {
		if (complex == null) {
			complex = new EObjectContainmentEList<Complex>(Complex.class, this, StructureLanguagePackage.LIST__COMPLEX);
		}
		return complex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Primative> getPrimative() {
		if (primative == null) {
			primative = new EObjectContainmentEList<Primative>(Primative.class, this,
					StructureLanguagePackage.LIST__PRIMATIVE);
		}
		return primative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructureLanguagePackage.LIST__COMPLEX:
			return ((InternalEList<?>) getComplex()).basicRemove(otherEnd, msgs);
		case StructureLanguagePackage.LIST__PRIMATIVE:
			return ((InternalEList<?>) getPrimative()).basicRemove(otherEnd, msgs);
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
		case StructureLanguagePackage.LIST__COMPLEX:
			return getComplex();
		case StructureLanguagePackage.LIST__PRIMATIVE:
			return getPrimative();
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
		case StructureLanguagePackage.LIST__COMPLEX:
			getComplex().clear();
			getComplex().addAll((Collection<? extends Complex>) newValue);
			return;
		case StructureLanguagePackage.LIST__PRIMATIVE:
			getPrimative().clear();
			getPrimative().addAll((Collection<? extends Primative>) newValue);
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
		case StructureLanguagePackage.LIST__COMPLEX:
			getComplex().clear();
			return;
		case StructureLanguagePackage.LIST__PRIMATIVE:
			getPrimative().clear();
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
		case StructureLanguagePackage.LIST__COMPLEX:
			return complex != null && !complex.isEmpty();
		case StructureLanguagePackage.LIST__PRIMATIVE:
			return primative != null && !primative.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListImpl
