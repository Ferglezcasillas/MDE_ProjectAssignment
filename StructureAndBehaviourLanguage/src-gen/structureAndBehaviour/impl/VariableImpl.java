/**
 */
package structureAndBehaviour.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import structureAndBehaviour.StructureAndBehaviourPackage;
import structureAndBehaviour.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.VariableImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link structureAndBehaviour.impl.VariableImpl#getAccessType <em>Access Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends ExpressionImpl implements Variable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialization() <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialization()
	 * @generated
	 * @ordered
	 */
	protected String initialization = INITIALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected String accessType = ACCESS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructureAndBehaviourPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.VARIABLE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialization() {
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialization(String newInitialization) {
		String oldInitialization = initialization;
		initialization = newInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.VARIABLE__INITIALIZATION,
					oldInitialization, initialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessType() {
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessType(String newAccessType) {
		String oldAccessType = accessType;
		accessType = newAccessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructureAndBehaviourPackage.VARIABLE__ACCESS_TYPE,
					oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StructureAndBehaviourPackage.VARIABLE__NAME:
			return getName();
		case StructureAndBehaviourPackage.VARIABLE__INITIALIZATION:
			return getInitialization();
		case StructureAndBehaviourPackage.VARIABLE__ACCESS_TYPE:
			return getAccessType();
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
		case StructureAndBehaviourPackage.VARIABLE__NAME:
			setName((String) newValue);
			return;
		case StructureAndBehaviourPackage.VARIABLE__INITIALIZATION:
			setInitialization((String) newValue);
			return;
		case StructureAndBehaviourPackage.VARIABLE__ACCESS_TYPE:
			setAccessType((String) newValue);
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
		case StructureAndBehaviourPackage.VARIABLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StructureAndBehaviourPackage.VARIABLE__INITIALIZATION:
			setInitialization(INITIALIZATION_EDEFAULT);
			return;
		case StructureAndBehaviourPackage.VARIABLE__ACCESS_TYPE:
			setAccessType(ACCESS_TYPE_EDEFAULT);
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
		case StructureAndBehaviourPackage.VARIABLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StructureAndBehaviourPackage.VARIABLE__INITIALIZATION:
			return INITIALIZATION_EDEFAULT == null ? initialization != null
					: !INITIALIZATION_EDEFAULT.equals(initialization);
		case StructureAndBehaviourPackage.VARIABLE__ACCESS_TYPE:
			return ACCESS_TYPE_EDEFAULT == null ? accessType != null : !ACCESS_TYPE_EDEFAULT.equals(accessType);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", initialization: ");
		result.append(initialization);
		result.append(", accessType: ");
		result.append(accessType);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
