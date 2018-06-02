/**
 */
package structureAndBehaviour;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Right Input</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehaviour.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Input</em>' containment reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getOperation_RightInput()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getRightInput();

	/**
	 * Returns the value of the '<em><b>Left Input</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehaviour.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Input</em>' containment reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getOperation_LeftInput()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getLeftInput();

} // Operation
