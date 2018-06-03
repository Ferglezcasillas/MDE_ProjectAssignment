/**
 */
package structureAndBehaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.Operation#getRightInput <em>Right Input</em>}</li>
 *   <li>{@link structureAndBehaviour.Operation#getLeftInput <em>Left Input</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Expression {
	/**
	 * Returns the value of the '<em><b>Right Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Input</em>' containment reference.
	 * @see #setRightInput(Expression)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getOperation_RightInput()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRightInput();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Operation#getRightInput <em>Right Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Input</em>' containment reference.
	 * @see #getRightInput()
	 * @generated
	 */
	void setRightInput(Expression value);

	/**
	 * Returns the value of the '<em><b>Left Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Input</em>' containment reference.
	 * @see #setLeftInput(Expression)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getOperation_LeftInput()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeftInput();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Operation#getLeftInput <em>Left Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Input</em>' containment reference.
	 * @see #getLeftInput()
	 * @generated
	 */
	void setLeftInput(Expression value);

} // Operation
