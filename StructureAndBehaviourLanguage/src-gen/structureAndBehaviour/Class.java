/**
 */
package structureAndBehaviour;

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
 *   <li>{@link structureAndBehaviour.Class#getName <em>Name</em>}</li>
 *   <li>{@link structureAndBehaviour.Class#getType <em>Type</em>}</li>
 *   <li>{@link structureAndBehaviour.Class#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link structureAndBehaviour.Class#getVariable <em>Variable</em>}</li>
 *   <li>{@link structureAndBehaviour.Class#getMethod <em>Method</em>}</li>
 *   <li>{@link structureAndBehaviour.Class#getInherated <em>Inherated</em>}</li>
 *   <li>{@link structureAndBehaviour.Class#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getClass_()
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
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getClass_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Class#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getClass_AccessType()
	 * @model
	 * @generated
	 */
	String getAccessType();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Class#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehaviour.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getClass_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehaviour.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getClass_Method()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getMethod();

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
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getClass_Inherated()
	 * @model
	 * @generated
	 */
	Class getInherated();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Class#getInherated <em>Inherated</em>}' reference.
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
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getClass_Implements()
	 * @model
	 * @generated
	 */
	Interface getImplements();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.Class#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(Interface value);

} // Class
