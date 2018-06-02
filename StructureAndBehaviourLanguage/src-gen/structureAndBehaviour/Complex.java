/**
 */
package structureAndBehaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.Complex#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getComplex()
 * @model
 * @generated
 */
public interface Complex extends Variable {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(structureAndBehaviour.Class)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getComplex_Class()
	 * @model required="true"
	 * @generated
	 */
	structureAndBehaviour.Class getClass_();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Complex#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(structureAndBehaviour.Class value);

} // Complex
