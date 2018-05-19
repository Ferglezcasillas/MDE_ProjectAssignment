/**
 */
package behaviourLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see behaviourLanguage.BehaviourLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviourLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/behaviourLanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviourLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourLanguagePackage eINSTANCE = behaviourLanguage.impl.BehaviourLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.BlockOfCodeImpl <em>Block Of Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.BlockOfCodeImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getBlockOfCode()
	 * @generated
	 */
	int BLOCK_OF_CODE = 0;

	/**
	 * The feature id for the '<em><b>Things</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_CODE__THINGS = 0;

	/**
	 * The number of structural features of the '<em>Block Of Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_CODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Block Of Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OF_CODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.generalItemImpl <em>general Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.generalItemImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getgeneralItem()
	 * @generated
	 */
	int GENERAL_ITEM = 20;

	/**
	 * The number of structural features of the '<em>general Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>general Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.ExpressionImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ASSIGN = GENERAL_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = GENERAL_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = GENERAL_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.StatementImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__BODY = GENERAL_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = GENERAL_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = GENERAL_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.OperationImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ASSIGN = EXPRESSION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Left Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LEFT_INPUT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RIGHT_INPUT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.CallFunctionImpl <em>Call Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.CallFunctionImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getCallFunction()
	 * @generated
	 */
	int CALL_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION__ASSIGN = EXPRESSION__ASSIGN;

	/**
	 * The number of structural features of the '<em>Call Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Call Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FUNCTION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.for_Impl <em>for </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.for_Impl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getfor_()
	 * @generated
	 */
	int FOR_ = 5;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR___BODY = STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR___COMPARATOR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR___VARIABLE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR___INC = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Update Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR___UPDATE_VALUE = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>for </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>for </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.ConditionalStatementImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getConditionalStatement()
	 * @generated
	 */
	int CONDITIONAL_STATEMENT = 14;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.while_Impl <em>while </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.while_Impl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getwhile_()
	 * @generated
	 */
	int WHILE_ = 6;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE___STATEMENT = CONDITIONAL_STATEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE___CONDITION = CONDITIONAL_STATEMENT__CONDITION;

	/**
	 * The number of structural features of the '<em>while </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__FEATURE_COUNT = CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>while </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__OPERATION_COUNT = CONDITIONAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.if_Impl <em>if </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.if_Impl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getif_()
	 * @generated
	 */
	int IF_ = 7;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF___STATEMENT = CONDITIONAL_STATEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF___CONDITION = CONDITIONAL_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF___ELSE = CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>if </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__FEATURE_COUNT = CONDITIONAL_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>if </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__OPERATION_COUNT = CONDITIONAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.dowhile_Impl <em>dowhile </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.dowhile_Impl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getdowhile_()
	 * @generated
	 */
	int DOWHILE_ = 8;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWHILE___STATEMENT = CONDITIONAL_STATEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWHILE___CONDITION = CONDITIONAL_STATEMENT__CONDITION;

	/**
	 * The number of structural features of the '<em>dowhile </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWHILE__FEATURE_COUNT = CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>dowhile </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWHILE__OPERATION_COUNT = CONDITIONAL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.MathImpl <em>Math</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.MathImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getMath()
	 * @generated
	 */
	int MATH = 9;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH__ASSIGN = OPERATION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Left Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH__LEFT_INPUT = OPERATION__LEFT_INPUT;

	/**
	 * The feature id for the '<em><b>Right Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH__RIGHT_INPUT = OPERATION__RIGHT_INPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH__TYPE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Math</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Math</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.LogicalImpl <em>Logical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.LogicalImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getLogical()
	 * @generated
	 */
	int LOGICAL = 10;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL__ASSIGN = OPERATION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Left Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL__LEFT_INPUT = OPERATION__LEFT_INPUT;

	/**
	 * The feature id for the '<em><b>Right Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL__RIGHT_INPUT = OPERATION__RIGHT_INPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL__TYPE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.VariableImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ASSIGN = EXPRESSION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.else_Impl <em>else </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.else_Impl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getelse_()
	 * @generated
	 */
	int ELSE_ = 12;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE___BODY = STATEMENT__BODY;

	/**
	 * The number of structural features of the '<em>else </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>else </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.FunctionImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Blockofcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BLOCKOFCODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ACCESS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN = 4;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.ComparationImpl <em>Comparation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.ComparationImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getComparation()
	 * @generated
	 */
	int COMPARATION = 15;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATION__ASSIGN = OPERATION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Left Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATION__LEFT_INPUT = OPERATION__LEFT_INPUT;

	/**
	 * The feature id for the '<em><b>Right Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATION__RIGHT_INPUT = OPERATION__RIGHT_INPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATION__TYPE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.NotOperationImpl <em>Not Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.NotOperationImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getNotOperation()
	 * @generated
	 */
	int NOT_OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION__ASSIGN = EXPRESSION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION__INPUT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.System_InputImpl <em>System Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.System_InputImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getSystem_Input()
	 * @generated
	 */
	int SYSTEM_INPUT = 17;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT__ASSIGN = CALL_FUNCTION__ASSIGN;

	/**
	 * The number of structural features of the '<em>System Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_FEATURE_COUNT = CALL_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_OPERATION_COUNT = CALL_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.System_OutputImpl <em>System Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.System_OutputImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getSystem_Output()
	 * @generated
	 */
	int SYSTEM_OUTPUT = 18;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT__ASSIGN = CALL_FUNCTION__ASSIGN;

	/**
	 * The number of structural features of the '<em>System Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT_FEATURE_COUNT = CALL_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT_OPERATION_COUNT = CALL_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.impl.userDefinedFunctionImpl <em>user Defined Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.impl.userDefinedFunctionImpl
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getuserDefinedFunction()
	 * @generated
	 */
	int USER_DEFINED_FUNCTION = 19;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_FUNCTION__ASSIGN = CALL_FUNCTION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_FUNCTION__FUNCTION = CALL_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>user Defined Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_FUNCTION_FEATURE_COUNT = CALL_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>user Defined Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_FUNCTION_OPERATION_COUNT = CALL_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviourLanguage.MathOperator <em>Math Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.MathOperator
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getMathOperator()
	 * @generated
	 */
	int MATH_OPERATOR = 21;

	/**
	 * The meta object id for the '{@link behaviourLanguage.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.LogicalOperator
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 22;

	/**
	 * The meta object id for the '{@link behaviourLanguage.ComparationOperator <em>Comparation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.ComparationOperator
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getComparationOperator()
	 * @generated
	 */
	int COMPARATION_OPERATOR = 23;

	/**
	 * The meta object id for the '{@link behaviourLanguage.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.PrimitiveType
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 24;

	/**
	 * The meta object id for the '{@link behaviourLanguage.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourLanguage.AccessType
	 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 25;

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.BlockOfCode <em>Block Of Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Of Code</em>'.
	 * @see behaviourLanguage.BlockOfCode
	 * @generated
	 */
	EClass getBlockOfCode();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviourLanguage.BlockOfCode#getThings <em>Things</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Things</em>'.
	 * @see behaviourLanguage.BlockOfCode#getThings()
	 * @see #getBlockOfCode()
	 * @generated
	 */
	EReference getBlockOfCode_Things();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see behaviourLanguage.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference '{@link behaviourLanguage.Expression#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assign</em>'.
	 * @see behaviourLanguage.Expression#getAssign()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Assign();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see behaviourLanguage.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the reference '{@link behaviourLanguage.Statement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see behaviourLanguage.Statement#getBody()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Body();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see behaviourLanguage.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference '{@link behaviourLanguage.Operation#getLeftInput <em>Left Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Input</em>'.
	 * @see behaviourLanguage.Operation#getLeftInput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_LeftInput();

	/**
	 * Returns the meta object for the reference '{@link behaviourLanguage.Operation#getRightInput <em>Right Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Input</em>'.
	 * @see behaviourLanguage.Operation#getRightInput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_RightInput();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.CallFunction <em>Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Function</em>'.
	 * @see behaviourLanguage.CallFunction
	 * @generated
	 */
	EClass getCallFunction();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.for_ <em>for </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>for </em>'.
	 * @see behaviourLanguage.for_
	 * @generated
	 */
	EClass getfor_();

	/**
	 * Returns the meta object for the reference '{@link behaviourLanguage.for_#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comparator</em>'.
	 * @see behaviourLanguage.for_#getComparator()
	 * @see #getfor_()
	 * @generated
	 */
	EReference getfor__Comparator();

	/**
	 * Returns the meta object for the reference '{@link behaviourLanguage.for_#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see behaviourLanguage.for_#getVariable()
	 * @see #getfor_()
	 * @generated
	 */
	EReference getfor__Variable();

	/**
	 * Returns the meta object for the attribute '{@link behaviourLanguage.for_#isInc <em>Inc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inc</em>'.
	 * @see behaviourLanguage.for_#isInc()
	 * @see #getfor_()
	 * @generated
	 */
	EAttribute getfor__Inc();

	/**
	 * Returns the meta object for the attribute '{@link behaviourLanguage.for_#getUpdateValue <em>Update Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Value</em>'.
	 * @see behaviourLanguage.for_#getUpdateValue()
	 * @see #getfor_()
	 * @generated
	 */
	EAttribute getfor__UpdateValue();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.while_ <em>while </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>while </em>'.
	 * @see behaviourLanguage.while_
	 * @generated
	 */
	EClass getwhile_();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.if_ <em>if </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>if </em>'.
	 * @see behaviourLanguage.if_
	 * @generated
	 */
	EClass getif_();

	/**
	 * Returns the meta object for the reference '{@link behaviourLanguage.if_#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else</em>'.
	 * @see behaviourLanguage.if_#getElse()
	 * @see #getif_()
	 * @generated
	 */
	EReference getif__Else();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.dowhile_ <em>dowhile </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>dowhile </em>'.
	 * @see behaviourLanguage.dowhile_
	 * @generated
	 */
	EClass getdowhile_();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.Math <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math</em>'.
	 * @see behaviourLanguage.Math
	 * @generated
	 */
	EClass getMath();

	/**
	 * Returns the meta object for the attribute '{@link behaviourLanguage.Math#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see behaviourLanguage.Math#getType()
	 * @see #getMath()
	 * @generated
	 */
	EAttribute getMath_Type();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.Logical <em>Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical</em>'.
	 * @see behaviourLanguage.Logical
	 * @generated
	 */
	EClass getLogical();

	/**
	 * Returns the meta object for the attribute '{@link behaviourLanguage.Logical#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see behaviourLanguage.Logical#getType()
	 * @see #getLogical()
	 * @generated
	 */
	EAttribute getLogical_Type();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see behaviourLanguage.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link behaviourLanguage.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behaviourLanguage.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link behaviourLanguage.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see behaviourLanguage.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.else_ <em>else </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>else </em>'.
	 * @see behaviourLanguage.else_
	 * @generated
	 */
	EClass getelse_();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see behaviourLanguage.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference '{@link behaviourLanguage.Function#getBlockofcode <em>Blockofcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Blockofcode</em>'.
	 * @see behaviourLanguage.Function#getBlockofcode()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Blockofcode();

	/**
	 * Returns the meta object for the attribute '{@link behaviourLanguage.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behaviourLanguage.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link behaviourLanguage.Function#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see behaviourLanguage.Function#getAccessType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_AccessType();

	/**
	 * Returns the meta object for the reference list '{@link behaviourLanguage.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see behaviourLanguage.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for the reference '{@link behaviourLanguage.Function#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return</em>'.
	 * @see behaviourLanguage.Function#getReturn()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Return();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.ConditionalStatement <em>Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Statement</em>'.
	 * @see behaviourLanguage.ConditionalStatement
	 * @generated
	 */
	EClass getConditionalStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviourLanguage.ConditionalStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see behaviourLanguage.ConditionalStatement#getStatement()
	 * @see #getConditionalStatement()
	 * @generated
	 */
	EReference getConditionalStatement_Statement();

	/**
	 * Returns the meta object for the containment reference '{@link behaviourLanguage.ConditionalStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see behaviourLanguage.ConditionalStatement#getCondition()
	 * @see #getConditionalStatement()
	 * @generated
	 */
	EReference getConditionalStatement_Condition();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.Comparation <em>Comparation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparation</em>'.
	 * @see behaviourLanguage.Comparation
	 * @generated
	 */
	EClass getComparation();

	/**
	 * Returns the meta object for the attribute '{@link behaviourLanguage.Comparation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see behaviourLanguage.Comparation#getType()
	 * @see #getComparation()
	 * @generated
	 */
	EAttribute getComparation_Type();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.NotOperation <em>Not Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Operation</em>'.
	 * @see behaviourLanguage.NotOperation
	 * @generated
	 */
	EClass getNotOperation();

	/**
	 * Returns the meta object for the reference '{@link behaviourLanguage.NotOperation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see behaviourLanguage.NotOperation#getInput()
	 * @see #getNotOperation()
	 * @generated
	 */
	EReference getNotOperation_Input();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.System_Input <em>System Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Input</em>'.
	 * @see behaviourLanguage.System_Input
	 * @generated
	 */
	EClass getSystem_Input();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.System_Output <em>System Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Output</em>'.
	 * @see behaviourLanguage.System_Output
	 * @generated
	 */
	EClass getSystem_Output();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.userDefinedFunction <em>user Defined Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>user Defined Function</em>'.
	 * @see behaviourLanguage.userDefinedFunction
	 * @generated
	 */
	EClass getuserDefinedFunction();

	/**
	 * Returns the meta object for the containment reference '{@link behaviourLanguage.userDefinedFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see behaviourLanguage.userDefinedFunction#getFunction()
	 * @see #getuserDefinedFunction()
	 * @generated
	 */
	EReference getuserDefinedFunction_Function();

	/**
	 * Returns the meta object for class '{@link behaviourLanguage.generalItem <em>general Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>general Item</em>'.
	 * @see behaviourLanguage.generalItem
	 * @generated
	 */
	EClass getgeneralItem();

	/**
	 * Returns the meta object for enum '{@link behaviourLanguage.MathOperator <em>Math Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Math Operator</em>'.
	 * @see behaviourLanguage.MathOperator
	 * @generated
	 */
	EEnum getMathOperator();

	/**
	 * Returns the meta object for enum '{@link behaviourLanguage.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see behaviourLanguage.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the meta object for enum '{@link behaviourLanguage.ComparationOperator <em>Comparation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparation Operator</em>'.
	 * @see behaviourLanguage.ComparationOperator
	 * @generated
	 */
	EEnum getComparationOperator();

	/**
	 * Returns the meta object for enum '{@link behaviourLanguage.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see behaviourLanguage.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the meta object for enum '{@link behaviourLanguage.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see behaviourLanguage.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviourLanguageFactory getBehaviourLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.BlockOfCodeImpl <em>Block Of Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.BlockOfCodeImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getBlockOfCode()
		 * @generated
		 */
		EClass BLOCK_OF_CODE = eINSTANCE.getBlockOfCode();

		/**
		 * The meta object literal for the '<em><b>Things</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_OF_CODE__THINGS = eINSTANCE.getBlockOfCode_Things();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.ExpressionImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Assign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__ASSIGN = eINSTANCE.getExpression_Assign();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.StatementImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__BODY = eINSTANCE.getStatement_Body();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.OperationImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Left Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__LEFT_INPUT = eINSTANCE.getOperation_LeftInput();

		/**
		 * The meta object literal for the '<em><b>Right Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RIGHT_INPUT = eINSTANCE.getOperation_RightInput();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.CallFunctionImpl <em>Call Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.CallFunctionImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getCallFunction()
		 * @generated
		 */
		EClass CALL_FUNCTION = eINSTANCE.getCallFunction();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.for_Impl <em>for </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.for_Impl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getfor_()
		 * @generated
		 */
		EClass FOR_ = eINSTANCE.getfor_();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR___COMPARATOR = eINSTANCE.getfor__Comparator();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR___VARIABLE = eINSTANCE.getfor__Variable();

		/**
		 * The meta object literal for the '<em><b>Inc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR___INC = eINSTANCE.getfor__Inc();

		/**
		 * The meta object literal for the '<em><b>Update Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR___UPDATE_VALUE = eINSTANCE.getfor__UpdateValue();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.while_Impl <em>while </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.while_Impl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getwhile_()
		 * @generated
		 */
		EClass WHILE_ = eINSTANCE.getwhile_();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.if_Impl <em>if </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.if_Impl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getif_()
		 * @generated
		 */
		EClass IF_ = eINSTANCE.getif_();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF___ELSE = eINSTANCE.getif__Else();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.dowhile_Impl <em>dowhile </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.dowhile_Impl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getdowhile_()
		 * @generated
		 */
		EClass DOWHILE_ = eINSTANCE.getdowhile_();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.MathImpl <em>Math</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.MathImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getMath()
		 * @generated
		 */
		EClass MATH = eINSTANCE.getMath();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATH__TYPE = eINSTANCE.getMath_Type();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.LogicalImpl <em>Logical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.LogicalImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getLogical()
		 * @generated
		 */
		EClass LOGICAL = eINSTANCE.getLogical();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL__TYPE = eINSTANCE.getLogical_Type();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.VariableImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.else_Impl <em>else </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.else_Impl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getelse_()
		 * @generated
		 */
		EClass ELSE_ = eINSTANCE.getelse_();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.FunctionImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Blockofcode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__BLOCKOFCODE = eINSTANCE.getFunction_Blockofcode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__ACCESS_TYPE = eINSTANCE.getFunction_AccessType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURN = eINSTANCE.getFunction_Return();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.ConditionalStatementImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getConditionalStatement()
		 * @generated
		 */
		EClass CONDITIONAL_STATEMENT = eINSTANCE.getConditionalStatement();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STATEMENT__STATEMENT = eINSTANCE.getConditionalStatement_Statement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STATEMENT__CONDITION = eINSTANCE.getConditionalStatement_Condition();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.ComparationImpl <em>Comparation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.ComparationImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getComparation()
		 * @generated
		 */
		EClass COMPARATION = eINSTANCE.getComparation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARATION__TYPE = eINSTANCE.getComparation_Type();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.NotOperationImpl <em>Not Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.NotOperationImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getNotOperation()
		 * @generated
		 */
		EClass NOT_OPERATION = eINSTANCE.getNotOperation();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_OPERATION__INPUT = eINSTANCE.getNotOperation_Input();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.System_InputImpl <em>System Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.System_InputImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getSystem_Input()
		 * @generated
		 */
		EClass SYSTEM_INPUT = eINSTANCE.getSystem_Input();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.System_OutputImpl <em>System Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.System_OutputImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getSystem_Output()
		 * @generated
		 */
		EClass SYSTEM_OUTPUT = eINSTANCE.getSystem_Output();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.userDefinedFunctionImpl <em>user Defined Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.userDefinedFunctionImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getuserDefinedFunction()
		 * @generated
		 */
		EClass USER_DEFINED_FUNCTION = eINSTANCE.getuserDefinedFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DEFINED_FUNCTION__FUNCTION = eINSTANCE.getuserDefinedFunction_Function();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.impl.generalItemImpl <em>general Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.impl.generalItemImpl
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getgeneralItem()
		 * @generated
		 */
		EClass GENERAL_ITEM = eINSTANCE.getgeneralItem();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.MathOperator <em>Math Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.MathOperator
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getMathOperator()
		 * @generated
		 */
		EEnum MATH_OPERATOR = eINSTANCE.getMathOperator();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.LogicalOperator
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.ComparationOperator <em>Comparation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.ComparationOperator
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getComparationOperator()
		 * @generated
		 */
		EEnum COMPARATION_OPERATOR = eINSTANCE.getComparationOperator();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.PrimitiveType
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link behaviourLanguage.AccessType <em>Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourLanguage.AccessType
		 * @see behaviourLanguage.impl.BehaviourLanguagePackageImpl#getAccessType()
		 * @generated
		 */
		EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

	}

} //BehaviourLanguagePackage
