/**
 */
package behaviourLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Of Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.BlockOfCode#getThings <em>Things</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getBlockOfCode()
 * @model
 * @generated
 */
public interface BlockOfCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Things</b></em>' containment reference list.
	 * The list contents are of type {@link behaviourLanguage.generalItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Things</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Things</em>' containment reference list.
	 * @see behaviourLanguage.BehaviourLanguagePackage#getBlockOfCode_Things()
	 * @model containment="true"
	 * @generated
	 */
	EList<generalItem> getThings();

} // BlockOfCode
