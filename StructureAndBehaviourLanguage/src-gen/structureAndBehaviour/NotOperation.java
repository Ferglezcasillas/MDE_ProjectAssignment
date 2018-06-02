/**
 */
package structureAndBehaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.NotOperation#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getNotOperation()
 * @model
 * @generated
 */
public interface NotOperation extends Expression {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Primative)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getNotOperation_Input()
	 * @model required="true"
	 * @generated
	 */
	Primative getInput();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.NotOperation#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Primative value);

} // NotOperation
