/**
 */
package structureAndBehaviour;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Else Body</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehaviour.BlockOfCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Body</em>' containment reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getif__ElseBody()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockOfCode> getElseBody();

} // if_
