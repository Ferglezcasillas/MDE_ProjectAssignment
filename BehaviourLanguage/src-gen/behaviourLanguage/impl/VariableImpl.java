/**
 */
package behaviourLanguage.impl;

import behaviourLanguage.BehaviourLanguagePackage;
import behaviourLanguage.PrimitiveType;
import behaviourLanguage.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link behaviourLanguage.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link behaviourLanguage.impl.VariableImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link behaviourLanguage.impl.VariableImpl#getTypeNotPrimitive <em>Type Not Primitive</em>}</li>
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveType TYPE_EDEFAULT = PrimitiveType.BYTE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getTypeNotPrimitive() <em>Type Not Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeNotPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NOT_PRIMITIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeNotPrimitive() <em>Type Not Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeNotPrimitive()
	 * @generated
	 * @ordered
	 */
	protected String typeNotPrimitive = TYPE_NOT_PRIMITIVE_EDEFAULT;

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
		return BehaviourLanguagePackage.Literals.VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.VARIABLE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PrimitiveType newType) {
		PrimitiveType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.VARIABLE__TYPE, oldType,
					type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.VARIABLE__INITIALIZATION,
					oldInitialization, initialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeNotPrimitive() {
		return typeNotPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeNotPrimitive(String newTypeNotPrimitive) {
		String oldTypeNotPrimitive = typeNotPrimitive;
		typeNotPrimitive = newTypeNotPrimitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.VARIABLE__TYPE_NOT_PRIMITIVE,
					oldTypeNotPrimitive, typeNotPrimitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BehaviourLanguagePackage.VARIABLE__NAME:
			return getName();
		case BehaviourLanguagePackage.VARIABLE__TYPE:
			return getType();
		case BehaviourLanguagePackage.VARIABLE__INITIALIZATION:
			return getInitialization();
		case BehaviourLanguagePackage.VARIABLE__TYPE_NOT_PRIMITIVE:
			return getTypeNotPrimitive();
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
		case BehaviourLanguagePackage.VARIABLE__NAME:
			setName((String) newValue);
			return;
		case BehaviourLanguagePackage.VARIABLE__TYPE:
			setType((PrimitiveType) newValue);
			return;
		case BehaviourLanguagePackage.VARIABLE__INITIALIZATION:
			setInitialization((String) newValue);
			return;
		case BehaviourLanguagePackage.VARIABLE__TYPE_NOT_PRIMITIVE:
			setTypeNotPrimitive((String) newValue);
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
		case BehaviourLanguagePackage.VARIABLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BehaviourLanguagePackage.VARIABLE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case BehaviourLanguagePackage.VARIABLE__INITIALIZATION:
			setInitialization(INITIALIZATION_EDEFAULT);
			return;
		case BehaviourLanguagePackage.VARIABLE__TYPE_NOT_PRIMITIVE:
			setTypeNotPrimitive(TYPE_NOT_PRIMITIVE_EDEFAULT);
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
		case BehaviourLanguagePackage.VARIABLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BehaviourLanguagePackage.VARIABLE__TYPE:
			return type != TYPE_EDEFAULT;
		case BehaviourLanguagePackage.VARIABLE__INITIALIZATION:
			return INITIALIZATION_EDEFAULT == null ? initialization != null
					: !INITIALIZATION_EDEFAULT.equals(initialization);
		case BehaviourLanguagePackage.VARIABLE__TYPE_NOT_PRIMITIVE:
			return TYPE_NOT_PRIMITIVE_EDEFAULT == null ? typeNotPrimitive != null
					: !TYPE_NOT_PRIMITIVE_EDEFAULT.equals(typeNotPrimitive);
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
		result.append(", type: ");
		result.append(type);
		result.append(", initialization: ");
		result.append(initialization);
		result.append(", typeNotPrimitive: ");
		result.append(typeNotPrimitive);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
