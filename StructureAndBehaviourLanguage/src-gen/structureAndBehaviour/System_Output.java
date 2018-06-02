/**
 */
package structureAndBehaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.System_Output#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getSystem_Output()
 * @model
 * @generated
 */
public interface System_Output extends CallFunction {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link structureAndBehaviour.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getSystem_Output_Parameters()
	 * @model
	 * @generated
	 */
	EList<Variable> getParameters();

} // System_Output
