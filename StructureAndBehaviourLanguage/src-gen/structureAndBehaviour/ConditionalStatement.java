/**
 */
package structureAndBehaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.ConditionalStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getConditionalStatement()
 * @model
 * @generated
 */
public interface ConditionalStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehaviour.Logical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getConditionalStatement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Logical> getCondition();

} // ConditionalStatement
