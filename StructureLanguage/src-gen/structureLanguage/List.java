/**
 */
package structureLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureLanguage.List#getComplex <em>Complex</em>}</li>
 *   <li>{@link structureLanguage.List#getPrimative <em>Primative</em>}</li>
 * </ul>
 *
 * @see structureLanguage.StructureLanguagePackage#getList()
 * @model
 * @generated
 */
public interface List extends Variable {
	/**
	 * Returns the value of the '<em><b>Complex</b></em>' containment reference list.
	 * The list contents are of type {@link structureLanguage.Complex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex</em>' containment reference list.
	 * @see structureLanguage.StructureLanguagePackage#getList_Complex()
	 * @model containment="true"
	 * @generated
	 */
	EList<Complex> getComplex();

	/**
	 * Returns the value of the '<em><b>Primative</b></em>' containment reference list.
	 * The list contents are of type {@link structureLanguage.Primative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primative</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primative</em>' containment reference list.
	 * @see structureLanguage.StructureLanguagePackage#getList_Primative()
	 * @model containment="true"
	 * @generated
	 */
	EList<Primative> getPrimative();

} // List
