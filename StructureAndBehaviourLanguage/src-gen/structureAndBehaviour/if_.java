/**
 */
package structureAndBehaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>if </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.if_#getElseBody <em>Else Body</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getif_()
 * @model
 * @generated
 */
public interface if_ extends ConditionalStatement {
	/**
	 * Returns the value of the '<em><b>Else Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Body</em>' containment reference.
	 * @see #setElseBody(BlockOfCode)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getif__ElseBody()
	 * @model containment="true"
	 * @generated
	 */
	BlockOfCode getElseBody();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.if_#getElseBody <em>Else Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Body</em>' containment reference.
	 * @see #getElseBody()
	 * @generated
	 */
	void setElseBody(BlockOfCode value);

} // if_
