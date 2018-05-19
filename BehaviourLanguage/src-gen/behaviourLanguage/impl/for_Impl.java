/**
 */
package behaviourLanguage.impl;

import behaviourLanguage.BehaviourLanguagePackage;
import behaviourLanguage.Comparation;
import behaviourLanguage.Variable;
import behaviourLanguage.for_;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>for </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.impl.for_Impl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link behaviourLanguage.impl.for_Impl#getVariable <em>Variable</em>}</li>
 *   <li>{@link behaviourLanguage.impl.for_Impl#isInc <em>Inc</em>}</li>
 *   <li>{@link behaviourLanguage.impl.for_Impl#getUpdateValue <em>Update Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class for_Impl extends StatementImpl implements for_ {
	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected Comparation comparator;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

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
		return BehaviourLanguagePackage.Literals.FOR_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparation getComparator() {
		if (comparator != null && comparator.eIsProxy()) {
			InternalEObject oldComparator = (InternalEObject) comparator;
			comparator = (Comparation) eResolveProxy(oldComparator);
			if (comparator != oldComparator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourLanguagePackage.FOR___COMPARATOR,
							oldComparator, comparator));
			}
		}
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparation basicGetComparator() {
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparator(Comparation newComparator) {
		Comparation oldComparator = comparator;
		comparator = newComparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.FOR___COMPARATOR,
					oldComparator, comparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject) variable;
			variable = (Variable) eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourLanguagePackage.FOR___VARIABLE,
							oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.FOR___VARIABLE, oldVariable,
					variable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.FOR___INC, oldInc, inc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.FOR___UPDATE_VALUE,
					oldUpdateValue, updateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BehaviourLanguagePackage.FOR___COMPARATOR:
			if (resolve)
				return getComparator();
			return basicGetComparator();
		case BehaviourLanguagePackage.FOR___VARIABLE:
			if (resolve)
				return getVariable();
			return basicGetVariable();
		case BehaviourLanguagePackage.FOR___INC:
			return isInc();
		case BehaviourLanguagePackage.FOR___UPDATE_VALUE:
			return getUpdateValue();
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
		case BehaviourLanguagePackage.FOR___COMPARATOR:
			setComparator((Comparation) newValue);
			return;
		case BehaviourLanguagePackage.FOR___VARIABLE:
			setVariable((Variable) newValue);
			return;
		case BehaviourLanguagePackage.FOR___INC:
			setInc((Boolean) newValue);
			return;
		case BehaviourLanguagePackage.FOR___UPDATE_VALUE:
			setUpdateValue((Integer) newValue);
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
		case BehaviourLanguagePackage.FOR___COMPARATOR:
			setComparator((Comparation) null);
			return;
		case BehaviourLanguagePackage.FOR___VARIABLE:
			setVariable((Variable) null);
			return;
		case BehaviourLanguagePackage.FOR___INC:
			setInc(INC_EDEFAULT);
			return;
		case BehaviourLanguagePackage.FOR___UPDATE_VALUE:
			setUpdateValue(UPDATE_VALUE_EDEFAULT);
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
		case BehaviourLanguagePackage.FOR___COMPARATOR:
			return comparator != null;
		case BehaviourLanguagePackage.FOR___VARIABLE:
			return variable != null;
		case BehaviourLanguagePackage.FOR___INC:
			return inc != INC_EDEFAULT;
		case BehaviourLanguagePackage.FOR___UPDATE_VALUE:
			return updateValue != UPDATE_VALUE_EDEFAULT;
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
