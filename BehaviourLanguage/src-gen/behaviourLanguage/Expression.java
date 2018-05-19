/**
 */
package behaviourLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.Expression#getAssign <em>Assign</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends generalItem {
	/**
	 * Returns the value of the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign</em>' reference.
	 * @see #setAssign(Variable)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getExpression_Assign()
	 * @model
	 * @generated
	 */
	Variable getAssign();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Expression#getAssign <em>Assign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign</em>' reference.
	 * @see #getAssign()
	 * @generated
	 */
	void setAssign(Variable value);

} // Expression
