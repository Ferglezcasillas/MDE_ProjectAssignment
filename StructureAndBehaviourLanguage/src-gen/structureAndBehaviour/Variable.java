/**
 */
package structureAndBehaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.Variable#getName <em>Name</em>}</li>
 *   <li>{@link structureAndBehaviour.Variable#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link structureAndBehaviour.Variable#getAccessType <em>Access Type</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Expression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialization</em>' attribute.
	 * @see #setInitialization(String)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getVariable_Initialization()
	 * @model
	 * @generated
	 */
	String getInitialization();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Variable#getInitialization <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' attribute.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(String value);

	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see #setAccessType(String)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getVariable_AccessType()
	 * @model
	 * @generated
	 */
	String getAccessType();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Variable#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(String value);

} // Variable
