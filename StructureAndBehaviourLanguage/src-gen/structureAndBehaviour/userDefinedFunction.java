/**
 */
package structureAndBehaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>user Defined Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.userDefinedFunction#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getuserDefinedFunction()
 * @model
 * @generated
 */
public interface userDefinedFunction extends CallFunction {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(Function)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getuserDefinedFunction_Function()
	 * @model required="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.userDefinedFunction#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

} // userDefinedFunction
