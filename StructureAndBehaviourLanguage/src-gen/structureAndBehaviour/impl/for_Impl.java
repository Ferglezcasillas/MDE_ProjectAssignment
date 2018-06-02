/**
 */
package structureAndBehaviour.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import structureAndBehaviour.Comparation;
import structureAndBehaviour.Primative;
import structureAndBehaviour.StructureAndBehaviourPackage;
import structureAndBehaviour.for_;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>for </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.impl.for_Impl#getVariable <em>Variable</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.for_Impl#isInc <em>Inc</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.for_Impl#getUpdateValue <em>Update Value</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.for_Impl#getComparation <em>Comparation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class for_Impl extends StatementImpl implements for_ {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Primative> variable;

	/**
	 * The default value of the '{@link #isInc() <em>Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInc() <em>Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInc()
	 * @generated
	 * @ordered
	 */
	protected boolean inc = INC_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateValue() <em>Update Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateValue()
	 * @generated
	 * @ordered
	 */
	protected static final int UPDATE_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpdateValue() <em>Update Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateValue()
	 * @generated
	 * @ordered
	 */
	protected int updateValue = UPDATE_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComparation() <em>Comparation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparation()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparation> comparation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected for_Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureAndBehaviourPackage.Literals.FOR_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Primative> getVariable() {
		if (variable == null) {
			variable = new EObjectResolvingEList<Primative>(Primative.class, this,
					StructureAndBehaviourPackage.FOR___VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInc() {
		return inc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInc(boolean newInc) {
		boolean oldInc = inc;
		inc = newInc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.FOR___INC, oldInc, inc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpdateValue() {
		return updateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateValue(int newUpdateValue) {
		int oldUpdateValue = updateValue;
		updateValue = newUpdateValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.FOR___UPDATE_VALUE,
					oldUpdateValue, updateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comparation> getComparation() {
		if (comparation == null) {
			comparation = new EObjectContainmentEList<Comparation>(Comparation.class, this,
					StructureAndBehaviourPackage.FOR___COMPARATION);
		}
		return comparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StructureAndBehaviourPackage.FOR___COMPARATION:
			return ((InternalEList<?>) getComparation()).basicRemove(otherEnd, msgs);
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
		case StructureAndBehaviourPackage.FOR___VARIABLE:
			return getVariable();
		case StructureAndBehaviourPackage.FOR___INC:
			return isInc();
		case StructureAndBehaviourPackage.FOR___UPDATE_VALUE:
			return getUpdateValue();
		case StructureAndBehaviourPackage.FOR___COMPARATION:
			return getComparation();
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
		case StructureAndBehaviourPackage.FOR___VARIABLE:
			getVariable().clear();
			getVariable().addAll((Collection<? extends Primative>) newValue);
			return;
		case StructureAndBehaviourPackage.FOR___INC:
			setInc((Boolean) newValue);
			return;
		case StructureAndBehaviourPackage.FOR___UPDATE_VALUE:
			setUpdateValue((Integer) newValue);
			return;
		case StructureAndBehaviourPackage.FOR___COMPARATION:
			getComparation().clear();
			getComparation().addAll((Collection<? extends Comparation>) newValue);
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
		case StructureAndBehaviourPackage.FOR___VARIABLE:
			getVariable().clear();
			return;
		case StructureAndBehaviourPackage.FOR___INC:
			setInc(INC_EDEFAULT);
			return;
		case StructureAndBehaviourPackage.FOR___UPDATE_VALUE:
			setUpdateValue(UPDATE_VALUE_EDEFAULT);
			return;
		case StructureAndBehaviourPackage.FOR___COMPARATION:
			getComparation().clear();
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
		case StructureAndBehaviourPackage.FOR___VARIABLE:
			return variable != null && !variable.isEmpty();
		case StructureAndBehaviourPackage.FOR___INC:
			return inc != INC_EDEFAULT;
		case StructureAndBehaviourPackage.FOR___UPDATE_VALUE:
			return updateValue != UPDATE_VALUE_EDEFAULT;
		case StructureAndBehaviourPackage.FOR___COMPARATION:
			return comparation != null && !comparation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (inc: ");
		result.append(inc);
		result.append(", updateValue: ");
		result.append(updateValue);
		result.append(')');
		return result.toString();
	}

} //for_Impl
