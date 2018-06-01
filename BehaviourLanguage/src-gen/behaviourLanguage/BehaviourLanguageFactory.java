/**
 */
package behaviourLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behaviourLanguage.BehaviourLanguagePackage
 * @generated
 */
public interface BehaviourLanguageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourLanguageFactory eINSTANCE = behaviourLanguage.impl.BehaviourLanguageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Block Of Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Of Code</em>'.
	 * @generated
	 */
	BlockOfCode createBlockOfCode();

	/**
	 * Returns a new object of class '<em>for </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>for </em>'.
	 * @generated
	 */
	for_ createfor_();

	/**
	 * Returns a new object of class '<em>while </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>while </em>'.
	 * @generated
	 */
	while_ createwhile_();

	/**
	 * Returns a new object of class '<em>if </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>if </em>'.
	 * @generated
	 */
	if_ createif_();

	/**
	 * Returns a new object of class '<em>dowhile </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>dowhile </em>'.
	 * @generated
	 */
	dowhile_ createdowhile_();

	/**
	 * Returns a new object of class '<em>Math</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math</em>'.
	 * @generated
	 */
	Math createMath();

	/**
	 * Returns a new object of class '<em>Logical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical</em>'.
	 * @generated
	 */
	Logical createLogical();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Comparation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparation</em>'.
	 * @generated
	 */
	Comparation createComparation();

	/**
	 * Returns a new object of class '<em>Not Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Operation</em>'.
	 * @generated
	 */
	NotOperation createNotOperation();

	/**
	 * Returns a new object of class '<em>System Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Input</em>'.
	 * @generated
	 */
	System_Input createSystem_Input();

	/**
	 * Returns a new object of class '<em>System Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Output</em>'.
	 * @generated
	 */
	System_Output createSystem_Output();

	/**
	 * Returns a new object of class '<em>user Defined Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>user Defined Function</em>'.
	 * @generated
	 */
	userDefinedFunction createuserDefinedFunction();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviourLanguagePackage getBehaviourLanguagePackage();

} //BehaviourLanguageFactory
