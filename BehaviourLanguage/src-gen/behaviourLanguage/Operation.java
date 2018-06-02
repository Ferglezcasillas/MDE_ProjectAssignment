/**
 */
package behaviourLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.Operation#getRightInput <em>Right Input</em>}</li>
 *   <li>{@link behaviourLanguage.Operation#getLeftInput <em>Left Input</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Input</b></em>' containment reference list.
	 * The list contents are of type {@link behaviourLanguage.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Input</em>' containment reference list.
	 * @see behaviourLanguage.BehaviourLanguagePackage#getOperation_LeftInput()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getLeftInput();

	/**
	 * Returns the value of the '<em><b>Right Input</b></em>' containment reference list.
	 * The list contents are of type {@link behaviourLanguage.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Input</em>' containment reference list.
	 * @see behaviourLanguage.BehaviourLanguagePackage#getOperation_RightInput()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getRightInput();

} // Operation
