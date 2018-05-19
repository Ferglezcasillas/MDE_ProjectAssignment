/**
 */
package behaviourLanguage;

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
 *   <li>{@link behaviourLanguage.Function#getBlockofcode <em>Blockofcode</em>}</li>
 *   <li>{@link behaviourLanguage.Function#getName <em>Name</em>}</li>
 *   <li>{@link behaviourLanguage.Function#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link behaviourLanguage.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link behaviourLanguage.Function#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Blockofcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockofcode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockofcode</em>' containment reference.
	 * @see #setBlockofcode(BlockOfCode)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getFunction_Blockofcode()
	 * @model containment="true"
	 * @generated
	 */
	BlockOfCode getBlockofcode();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Function#getBlockofcode <em>Blockofcode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blockofcode</em>' containment reference.
	 * @see #getBlockofcode()
	 * @generated
	 */
	void setBlockofcode(BlockOfCode value);

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
	 * @see behaviourLanguage.BehaviourLanguagePackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link behaviourLanguage.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see behaviourLanguage.AccessType
	 * @see #setAccessType(AccessType)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getFunction_AccessType()
	 * @model
	 * @generated
	 */
	AccessType getAccessType();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Function#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see behaviourLanguage.AccessType
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(AccessType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link behaviourLanguage.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see behaviourLanguage.BehaviourLanguagePackage#getFunction_Parameters()
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
	 * @see behaviourLanguage.BehaviourLanguagePackage#getFunction_Return()
	 * @model
	 * @generated
	 */
	Variable getReturn();

	/**
	 * Sets the value of the '{@link behaviourLanguage.Function#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(Variable value);

} // Function
