/**
 */
package structureAndBehaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.Expression#getAssign <em>Assign</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends generalItem {
	/**
	 * Returns the value of the '<em><b>Assign</b></em>' reference list.
	 * The list contents are of type {@link structureAndBehaviour.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign</em>' reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getExpression_Assign()
	 * @model
	 * @generated
	 */
	EList<Variable> getAssign();

} // Expression
