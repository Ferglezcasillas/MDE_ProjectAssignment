/**
 */
package structureAndBehaviour.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structureAndBehaviour.Complex;
import structureAndBehaviour.StructureAndBehaviourPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.impl.ComplexImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexImpl extends VariableImpl implements Complex {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected structureAndBehaviour.Class class_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureAndBehaviourPackage.Literals.COMPLEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structureAndBehaviour.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject) class_;
			class_ = (structureAndBehaviour.Class) eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructureAndBehaviourPackage.COMPLEX__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structureAndBehaviour.Class basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(structureAndBehaviour.Class newClass) {
		structureAndBehaviour.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.COMPLEX__CLASS, oldClass,
					class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructureAndBehaviourPackage.COMPLEX__CLASS:
			if (resolve)
				return getClass_();
			return basicGetClass();
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
		case StructureAndBehaviourPackage.COMPLEX__CLASS:
			setClass((structureAndBehaviour.Class) newValue);
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
		case StructureAndBehaviourPackage.COMPLEX__CLASS:
			setClass((structureAndBehaviour.Class) null);
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
		case StructureAndBehaviourPackage.COMPLEX__CLASS:
			return class_ != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplexImpl
