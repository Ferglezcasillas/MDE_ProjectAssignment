/**
 */
package behaviourLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>if </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.if_#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getif_()
 * @model
 * @generated
 */
public interface if_ extends ConditionalStatement {
	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference.
	 * @see #setElse(else_)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getif__Else()
	 * @model
	 * @generated
	 */
	else_ getElse();

	/**
	 * Sets the value of the '{@link behaviourLanguage.if_#getElse <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(else_ value);

} // if_
