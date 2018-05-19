/**
 */
package behaviourLanguage.impl;

import behaviourLanguage.BehaviourLanguagePackage;
import behaviourLanguage.ConditionalStatement;
import behaviourLanguage.Logical;
import behaviourLanguage.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.impl.ConditionalStatementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link behaviourLanguage.impl.ConditionalStatementImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionalStatementImpl extends MinimalEObjectImpl.Container implements ConditionalStatement {
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statement;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Logical condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourLanguagePackage.Literals.CONDITIONAL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatement() {
		if (statement == null) {
			statement = new EObjectContainmentEList<Statement>(Statement.class, this,
					BehaviourLanguagePackage.CONDITIONAL_STATEMENT__STATEMENT);
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Logical newCondition, NotificationChain msgs) {
		Logical oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BehaviourLanguagePackage.CONDITIONAL_STATEMENT__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Logical newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BehaviourLanguagePackage.CONDITIONAL_STATEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BehaviourLanguagePackage.CONDITIONAL_STATEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviourLanguagePackage.CONDITIONAL_STATEMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviourLanguagePackage.CONDITIONAL_STATEMENT__STATEMENT:
			return ((InternalEList<?>) getStatement()).basicRemove(otherEnd, msgs);
		case BehaviourLanguagePackage.CONDITIONAL_STATEMENT__CONDITION:
			return basicSetCondition(null, msgs);
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
		case BehaviourLanguagePackage.CONDITIONAL_STATEMENT__STATEMENT:
			return getStatement();
		case BehaviourLanguagePackage.CONDITIONAL_STATEMENT__CONDITION:
			return getCondition();
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
		case BehaviourLanguagePackage.CONDITIONAL_STATEMENT__STATEMENT:
			getStatement().clear();
			getStatement().addAll((Collection<? extends Statement>) newValue);
			return;
		case BehaviourLanguagePackage.CONDITIONAL_STATEMENT__CONDITION:
			setCondition((Logical) newValue);
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
		case BehaviourLanguagePackage.CONDITIONAL_STATEMENT__STATEMENT:
			getStatement().clear();
			return;
		case BehaviourLanguagePackage.CONDITIONAL_STATEMENT__CONDITION:
			setCondition((Logical) null);
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
		case BehaviourLanguagePackage.CONDITIONAL_STATEMENT__STATEMENT:
			return statement != null && !statement.isEmpty();
		case BehaviourLanguagePackage.CONDITIONAL_STATEMENT__CONDITION:
			return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalStatementImpl
