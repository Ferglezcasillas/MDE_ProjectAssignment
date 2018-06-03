/**
 */
package structureAndBehaviour.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Primative variable;

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
	 * The cached value of the '{@link #getComparation() <em>Comparation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparation()
	 * @generated
	 * @ordered
	 */
	protected Comparation comparation;

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
	public Primative getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject) variable;
			variable = (Primative) eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StructureAndBehaviourPackage.FOR___VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primative basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Primative newVariable) {
		Primative oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.FOR___VARIABLE,
					oldVariable, variable));
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
	public Comparation getComparation() {
		return comparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparation(Comparation newComparation, NotificationChain msgs) {
		Comparation oldComparation = comparation;
		comparation = newComparation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StructureAndBehaviourPackage.FOR___COMPARATION, oldComparation, newComparation);
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
	public void setComparation(Comparation newComparation) {
		if (newComparation != comparation) {
			NotificationChain msgs = null;
			if (comparation != null)
				msgs = ((InternalEObject) comparation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StructureAndBehaviourPackage.FOR___COMPARATION, null, msgs);
			if (newComparation != null)
				msgs = ((InternalEObject) newComparation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StructureAndBehaviourPackage.FOR___COMPARATION, null, msgs);
			msgs = basicSetComparation(newComparation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.FOR___COMPARATION,
					newComparation, newComparation));
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
			return basicSetComparation(null, msgs);
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
			if (resolve)
				return getVariable();
			return basicGetVariable();
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
			setVariable((Primative) newValue);
			return;
		case StructureAndBehaviourPackage.FOR___INC:
			setInc((Boolean) newValue);
			return;
		case StructureAndBehaviourPackage.FOR___UPDATE_VALUE:
			setUpdateValue((Integer) newValue);
			return;
		case StructureAndBehaviourPackage.FOR___COMPARATION:
			setComparation((Comparation) newValue);
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
			setVariable((Primative) null);
			return;
		case StructureAndBehaviourPackage.FOR___INC:
			setInc(INC_EDEFAULT);
			return;
		case StructureAndBehaviourPackage.FOR___UPDATE_VALUE:
			setUpdateValue(UPDATE_VALUE_EDEFAULT);
			return;
		case StructureAndBehaviourPackage.FOR___COMPARATION:
			setComparation((Comparation) null);
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
			return variable != null;
		case StructureAndBehaviourPackage.FOR___INC:
			return inc != INC_EDEFAULT;
		case StructureAndBehaviourPackage.FOR___UPDATE_VALUE:
			return updateValue != UPDATE_VALUE_EDEFAULT;
		case StructureAndBehaviourPackage.FOR___COMPARATION:
			return comparation != null;
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
