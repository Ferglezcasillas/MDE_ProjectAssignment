/**
 */
package behaviourLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.Statement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends generalItem {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(BlockOfCode)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getStatement_Body()
	 * @model
	 * @generated
	 */
	BlockOfCode getBody();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Statement#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BlockOfCode value);

} // Statement
