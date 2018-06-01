/**
 */
package structureLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureLanguage.Complex#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see structureLanguage.StructureLanguagePackage#getComplex()
 * @model
 * @generated
 */
public interface Complex extends VariableC {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(structureLanguage.Class)
	 * @see structureLanguage.StructureLanguagePackage#getComplex_Class()
	 * @model required="true"
	 * @generated
	 */
	structureLanguage.Class getClass_();

	/**
	 * Sets the value of the '{@link structureLanguage.Complex#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(structureLanguage.Class value);

} // Complex
