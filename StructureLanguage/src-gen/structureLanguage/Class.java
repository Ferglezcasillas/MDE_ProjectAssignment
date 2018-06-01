/**
 */
package structureLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureLanguage.Class#getName <em>Name</em>}</li>
 *   <li>{@link structureLanguage.Class#getType <em>Type</em>}</li>
 *   <li>{@link structureLanguage.Class#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link structureLanguage.Class#getVariable <em>Variable</em>}</li>
 *   <li>{@link structureLanguage.Class#getMethod <em>Method</em>}</li>
 *   <li>{@link structureLanguage.Class#getInherated <em>Inherated</em>}</li>
 *   <li>{@link structureLanguage.Class#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see structureLanguage.StructureLanguagePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
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
	 * @see structureLanguage.StructureLanguagePackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structureLanguage.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link structureLanguage.ClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see structureLanguage.ClassType
	 * @see #setType(ClassType)
	 * @see structureLanguage.StructureLanguagePackage#getClass_Type()
	 * @model
	 * @generated
	 */
	ClassType getType();

	/**
	 * Sets the value of the '{@link structureLanguage.Class#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see structureLanguage.ClassType
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassType value);

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
	 * @see structureLanguage.StructureLanguagePackage#getClass_AccessType()
	 * @model
	 * @generated
	 */
	AccessType getAccessType();

	/**
	 * Sets the value of the '{@link structureLanguage.Class#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see structureLanguage.AccessType
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(AccessType value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link structureLanguage.VariableC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see structureLanguage.StructureLanguagePackage#getClass_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableC> getVariable();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link structureLanguage.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see structureLanguage.StructureLanguagePackage#getClass_Method()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethod();

	/**
	 * Returns the value of the '<em><b>Inherated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherated</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherated</em>' reference.
	 * @see #setInherated(Class)
	 * @see structureLanguage.StructureLanguagePackage#getClass_Inherated()
	 * @model
	 * @generated
	 */
	Class getInherated();

	/**
	 * Sets the value of the '{@link structureLanguage.Class#getInherated <em>Inherated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherated</em>' reference.
	 * @see #getInherated()
	 * @generated
	 */
	void setInherated(Class value);

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(Interface)
	 * @see structureLanguage.StructureLanguagePackage#getClass_Implements()
	 * @model
	 * @generated
	 */
	Interface getImplements();

	/**
	 * Sets the value of the '{@link structureLanguage.Class#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(Interface value);

} // Class
