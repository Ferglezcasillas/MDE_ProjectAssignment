/**
 */
package behaviourLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.Comparation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getComparation()
 * @model
 * @generated
 */
public interface Comparation extends Operation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link behaviourLanguage.ComparationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see behaviourLanguage.ComparationOperator
	 * @see #setType(ComparationOperator)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getComparation_Type()
	 * @model
	 * @generated
	 */
	ComparationOperator getType();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Comparation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see behaviourLanguage.ComparationOperator
	 * @see #getType()
	 * @generated
	 */
	void setType(ComparationOperator value);

} // Comparation
