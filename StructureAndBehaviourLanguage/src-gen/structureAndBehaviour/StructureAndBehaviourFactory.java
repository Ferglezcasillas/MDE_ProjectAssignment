/**
 */
package structureAndBehaviour;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see structureAndBehaviour.StructureAndBehaviourPackage
 * @generated
 */
public interface StructureAndBehaviourFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructureAndBehaviourFactory eINSTANCE = structureAndBehaviour.impl.StructureAndBehaviourFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Primative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primative</em>'.
	 * @generated
	 */
	Primative createPrimative();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Complex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex</em>'.
	 * @generated
	 */
	Complex createComplex();

	/**
	 * Returns a new object of class '<em>Call Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Function</em>'.
	 * @generated
	 */
	CallFunction createCallFunction();

	/**
	 * Returns a new object of class '<em>Conditional Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Statement</em>'.
	 * @generated
	 */
	ConditionalStatement createConditionalStatement();

	/**
	 * Returns a new object of class '<em>dowhile </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>dowhile </em>'.
	 * @generated
	 */
	dowhile_ createdowhile_();

	/**
	 * Returns a new object of class '<em>general Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>general Item</em>'.
	 * @generated
	 */
	generalItem creategeneralItem();

	/**
	 * Returns a new object of class '<em>for </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>for </em>'.
	 * @generated
	 */
	for_ createfor_();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement</em>'.
	 * @generated
	 */
	Statement createStatement();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>System Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Output</em>'.
	 * @generated
	 */
	System_Output createSystem_Output();

	/**
	 * Returns a new object of class '<em>Not Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Operation</em>'.
	 * @generated
	 */
	NotOperation createNotOperation();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	List createList();

	/**
	 * Returns a new object of class '<em>Logical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical</em>'.
	 * @generated
	 */
	Logical createLogical();

	/**
	 * Returns a new object of class '<em>Comparation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparation</em>'.
	 * @generated
	 */
	Comparation createComparation();

	/**
	 * Returns a new object of class '<em>Math</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math</em>'.
	 * @generated
	 */
	Math createMath();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>while </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>while </em>'.
	 * @generated
	 */
	while_ createwhile_();

	/**
	 * Returns a new object of class '<em>user Defined Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>user Defined Function</em>'.
	 * @generated
	 */
	userDefinedFunction createuserDefinedFunction();

	/**
	 * Returns a new object of class '<em>if </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>if </em>'.
	 * @generated
	 */
	if_ createif_();

	/**
	 * Returns a new object of class '<em>System Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Input</em>'.
	 * @generated
	 */
	System_Input createSystem_Input();

	/**
	 * Returns a new object of class '<em>Block Of Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Of Code</em>'.
	 * @generated
	 */
	BlockOfCode createBlockOfCode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StructureAndBehaviourPackage getStructureAndBehaviourPackage();

} //StructureAndBehaviourFactory
