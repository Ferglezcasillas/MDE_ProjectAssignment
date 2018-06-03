/**
 */
package structureAndBehaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.Statement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends generalItem {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BlockOfCode)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getStatement_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BlockOfCode getBody();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Statement#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BlockOfCode value);

} // Statement
