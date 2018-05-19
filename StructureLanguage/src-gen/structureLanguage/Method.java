/**
 */
package structureLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureLanguage.Method#getName <em>Name</em>}</li>
 *   <li>{@link structureLanguage.Method#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link structureLanguage.Method#getReturn <em>Return</em>}</li>
 *   <li>{@link structureLanguage.Method#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see structureLanguage.StructureLanguagePackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
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
	 * @see structureLanguage.StructureLanguagePackage#getMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structureLanguage.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link structureLanguage.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see structureLanguage.AccessType
	 * @see #setAccessType(AccessType)
	 * @see structureLanguage.StructureLanguagePackage#getMethod_AccessType()
	 * @model
	 * @generated
	 */
	AccessType getAccessType();

	/**
	 * Sets the value of the '{@link structureLanguage.Method#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see structureLanguage.AccessType
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(AccessType value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference list.
	 * The list contents are of type {@link structureLanguage.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference list.
	 * @see structureLanguage.StructureLanguagePackage#getMethod_Variable()
	 * @model
	 * @generated
	 */
	EList<structureLanguage.Class> getVariable();

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
	 * @see structureLanguage.StructureLanguagePackage#getMethod_Return()
	 * @model
	 * @generated
	 */
	Variable getReturn();

	/**
	 * Sets the value of the '{@link structureLanguage.Method#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(Variable value);

} // Method
