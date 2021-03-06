/**
 */
package structureLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureLanguage.Primative#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see structureLanguage.StructureLanguagePackage#getPrimative()
 * @model
 * @generated
 */
public interface Primative extends VariableC {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link structureLanguage.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see structureLanguage.PrimitiveType
	 * @see #setType(PrimitiveType)
	 * @see structureLanguage.StructureLanguagePackage#getPrimative_Type()
	 * @model
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link structureLanguage.Primative#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see structureLanguage.PrimitiveType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

} // Primative
