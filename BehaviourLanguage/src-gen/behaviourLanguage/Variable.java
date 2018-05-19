/**
 */
package behaviourLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.Variable#getName <em>Name</em>}</li>
 *   <li>{@link behaviourLanguage.Variable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Expression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link behaviourLanguage.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see behaviourLanguage.PrimitiveType
	 * @see #setType(PrimitiveType)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getVariable_Type()
	 * @model
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see behaviourLanguage.PrimitiveType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

} // Variable
