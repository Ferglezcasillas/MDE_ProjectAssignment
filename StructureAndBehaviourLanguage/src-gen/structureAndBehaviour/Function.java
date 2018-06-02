/**
 */
package structureAndBehaviour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.Function#getBlockofcode <em>Blockofcode</em>}</li>
 *   <li>{@link structureAndBehaviour.Function#getName <em>Name</em>}</li>
 *   <li>{@link structureAndBehaviour.Function#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link structureAndBehaviour.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link structureAndBehaviour.Function#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Blockofcode</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehaviour.BlockOfCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockofcode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockofcode</em>' containment reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getFunction_Blockofcode()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockOfCode> getBlockofcode();

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
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getFunction_AccessType()
	 * @model
	 * @generated
	 */
	String getAccessType();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Function#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(String value);

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
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getFunction_Parameters()
	 * @model
	 * @generated
	 */
	EList<Variable> getParameters();

	/**
	 * Returns the value of the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' reference.
	 * @see #setReturn(Variable)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getFunction_Return()
	 * @model
	 * @generated
	 */
	Variable getReturn();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Function#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(Variable value);

} // Function
