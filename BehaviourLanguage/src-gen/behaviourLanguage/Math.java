/**
 */
package behaviourLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.Math#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getMath()
 * @model
 * @generated
 */
public interface Math extends Operation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link behaviourLanguage.MathOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see behaviourLanguage.MathOperator
	 * @see #setType(MathOperator)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getMath_Type()
	 * @model
	 * @generated
	 */
	MathOperator getType();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Math#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see behaviourLanguage.MathOperator
	 * @see #getType()
	 * @generated
	 */
	void setType(MathOperator value);

} // Math
