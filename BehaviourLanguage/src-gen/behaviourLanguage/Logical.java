/**
 */
package behaviourLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.Logical#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getLogical()
 * @model
 * @generated
 */
public interface Logical extends Operation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link behaviourLanguage.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see behaviourLanguage.LogicalOperator
	 * @see #setType(LogicalOperator)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getLogical_Type()
	 * @model
	 * @generated
	 */
	LogicalOperator getType();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Logical#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see behaviourLanguage.LogicalOperator
	 * @see #getType()
	 * @generated
	 */
	void setType(LogicalOperator value);

} // Logical
