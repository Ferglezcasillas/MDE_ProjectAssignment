/**
 */
package behaviourLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>for </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.for_#getComparator <em>Comparator</em>}</li>
 *   <li>{@link behaviourLanguage.for_#getVariable <em>Variable</em>}</li>
 *   <li>{@link behaviourLanguage.for_#isInc <em>Inc</em>}</li>
 *   <li>{@link behaviourLanguage.for_#getUpdateValue <em>Update Value</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getfor_()
 * @model
 * @generated
 */
public interface for_ extends Statement {
	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' reference.
	 * @see #setComparator(Comparation)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getfor__Comparator()
	 * @model
	 * @generated
	 */
	Comparation getComparator();

	/**
	 * Sets the value of the '{@link behaviourLanguage.for_#getComparator <em>Comparator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' reference.
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(Comparation value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getfor__Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link behaviourLanguage.for_#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inc</em>' attribute.
	 * @see #setInc(boolean)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getfor__Inc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isInc();

	/**
	 * Sets the value of the '{@link behaviourLanguage.for_#isInc <em>Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inc</em>' attribute.
	 * @see #isInc()
	 * @generated
	 */
	void setInc(boolean value);

	/**
	 * Returns the value of the '<em><b>Update Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Value</em>' attribute.
	 * @see #setUpdateValue(int)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getfor__UpdateValue()
	 * @model
	 * @generated
	 */
	int getUpdateValue();

	/**
	 * Sets the value of the '{@link behaviourLanguage.for_#getUpdateValue <em>Update Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Value</em>' attribute.
	 * @see #getUpdateValue()
	 * @generated
	 */
	void setUpdateValue(int value);

} // for_
