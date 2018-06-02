/**
 */
package structureAndBehaviour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.Program#getName <em>Name</em>}</li>
 *   <li>{@link structureAndBehaviour.Program#getClass_ <em>Class</em>}</li>
 *   <li>{@link structureAndBehaviour.Program#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
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
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehaviour.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getProgram_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<structureAndBehaviour.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehaviour.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getProgram_Interface()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterface();

} // Program
