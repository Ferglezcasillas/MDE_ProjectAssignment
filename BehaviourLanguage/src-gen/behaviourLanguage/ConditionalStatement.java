/**
 */
package behaviourLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourLanguage.ConditionalStatement#getStatement <em>Statement</em>}</li>
 *   <li>{@link behaviourLanguage.ConditionalStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see behaviourLanguage.BehaviourLanguagePackage#getConditionalStatement()
 * @model abstract="true"
 * @generated
 */
public interface ConditionalStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link behaviourLanguage.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see behaviourLanguage.BehaviourLanguagePackage#getConditionalStatement_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Logical)
	 * @see behaviourLanguage.BehaviourLanguagePackage#getConditionalStatement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Logical getCondition();

	/**
	 * Sets the value of the '{@link behaviourLanguage.ConditionalStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Logical value);

} // ConditionalStatement
