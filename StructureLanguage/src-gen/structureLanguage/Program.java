/**
 */
package structureLanguage;

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
 *   <li>{@link structureLanguage.Program#getName <em>Name</em>}</li>
 *   <li>{@link structureLanguage.Program#getClass_ <em>Class</em>}</li>
 *   <li>{@link structureLanguage.Program#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see structureLanguage.StructureLanguagePackage#getProgram()
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
	 * @see structureLanguage.StructureLanguagePackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structureLanguage.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link structureLanguage.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see structureLanguage.StructureLanguagePackage#getProgram_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<structureLanguage.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link structureLanguage.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see structureLanguage.StructureLanguagePackage#getProgram_Interface()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterface();

} // Program
