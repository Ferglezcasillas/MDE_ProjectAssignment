/**
 */
package behaviourLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.Operation#getRightInput <em>Right Input</em>}</li>
 *   <li>{@link behaviourLanguage.Operation#getLeftInput <em>Left Input</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Input</em>' containment reference.
	 * @see #setLeftInput(Expression)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getOperation_LeftInput()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeftInput();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Operation#getLeftInput <em>Left Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Input</em>' containment reference.
	 * @see #getLeftInput()
	 * @generated
	 */
	void setLeftInput(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Input</em>' containment reference.
	 * @see #setRightInput(Expression)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getOperation_RightInput()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRightInput();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Operation#getRightInput <em>Right Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Input</em>' containment reference.
	 * @see #getRightInput()
	 * @generated
	 */
	void setRightInput(Expression value);

} // Operation
