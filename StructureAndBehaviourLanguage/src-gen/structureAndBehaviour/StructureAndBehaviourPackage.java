/**
 */
package structureAndBehaviour;

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
 * @see structureAndBehaviour.StructureAndBehaviourFactory
 * @model kind="package"
 * @generated
 */
public interface StructureAndBehaviourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structureAndBehaviour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/structureAndBehaviour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "structureAndBehaviour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructureAndBehaviourPackage eINSTANCE = structureAndBehaviour.impl.StructureAndBehaviourPackageImpl.init();

	/**
	 * The meta object id for the '{@link structureAndBehaviour.impl.generalItemImpl <em>general Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.generalItemImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getgeneralItem()
	 * @generated
	 */
	int GENERAL_ITEM = 8;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.ExpressionImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 20;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.VariableImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 13;

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
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INITIALIZATION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ACCESS_TYPE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.impl.PrimativeImpl <em>Primative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.PrimativeImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getPrimative()
	 * @generated
	 */
	int PRIMATIVE = 0;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMATIVE__ASSIGN = VARIABLE__ASSIGN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMATIVE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMATIVE__INITIALIZATION = VARIABLE__INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMATIVE__ACCESS_TYPE = VARIABLE__ACCESS_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMATIVE__TYPE = VARIABLE__TYPE;

	/**
	 * The number of structural features of the '<em>Primative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMATIVE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMATIVE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.InterfaceImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__METHOD = 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.ProgramImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.ClassImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ACCESS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHOD = 4;

	/**
	 * The feature id for the '<em><b>Inherated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INHERATED = 5;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPLEMENTS = 6;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.impl.ComplexImpl <em>Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.ComplexImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getComplex()
	 * @generated
	 */
	int COMPLEX = 4;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__ASSIGN = VARIABLE__ASSIGN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__INITIALIZATION = VARIABLE__INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__ACCESS_TYPE = VARIABLE__ACCESS_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX__CLASS = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.impl.CallFunctionImpl <em>Call Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.CallFunctionImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getCallFunction()
	 * @generated
	 */
	int CALL_FUNCTION = 5;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.StatementImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
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
	 * The meta object id for the '{@link structureAndBehaviour.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.ConditionalStatementImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getConditionalStatement()
	 * @generated
	 */
	int CONDITIONAL_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__BODY = STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.impl.dowhile_Impl <em>dowhile </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.dowhile_Impl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getdowhile_()
	 * @generated
	 */
	int DOWHILE_ = 7;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWHILE___BODY = CONDITIONAL_STATEMENT__BODY;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.for_Impl <em>for </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.for_Impl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getfor_()
	 * @generated
	 */
	int FOR_ = 9;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR___BODY = STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR___VARIABLE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR___INC = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Update Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR___UPDATE_VALUE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comparation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR___COMPARATION = STATEMENT_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.FunctionImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 10;

	/**
	 * The feature id for the '<em><b>Blockofcode</b></em>' containment reference list.
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
	 * The meta object id for the '{@link structureAndBehaviour.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.OperationImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ASSIGN = EXPRESSION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Right Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RIGHT_INPUT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LEFT_INPUT = EXPRESSION_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.System_OutputImpl <em>System Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.System_OutputImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getSystem_Output()
	 * @generated
	 */
	int SYSTEM_OUTPUT = 14;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT__ASSIGN = CALL_FUNCTION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT__PARAMETERS = CALL_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT_FEATURE_COUNT = CALL_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT_OPERATION_COUNT = CALL_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.impl.NotOperationImpl <em>Not Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.NotOperationImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getNotOperation()
	 * @generated
	 */
	int NOT_OPERATION = 15;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.ListImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getList()
	 * @generated
	 */
	int LIST = 16;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ASSIGN = VARIABLE__ASSIGN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__INITIALIZATION = VARIABLE__INITIALIZATION;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ACCESS_TYPE = VARIABLE__ACCESS_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__TYPE = VARIABLE__TYPE;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.impl.LogicalImpl <em>Logical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.LogicalImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getLogical()
	 * @generated
	 */
	int LOGICAL = 17;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL__ASSIGN = OPERATION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Right Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL__RIGHT_INPUT = OPERATION__RIGHT_INPUT;

	/**
	 * The feature id for the '<em><b>Left Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL__LEFT_INPUT = OPERATION__LEFT_INPUT;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.ComparationImpl <em>Comparation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.ComparationImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getComparation()
	 * @generated
	 */
	int COMPARATION = 18;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATION__ASSIGN = OPERATION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Right Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATION__RIGHT_INPUT = OPERATION__RIGHT_INPUT;

	/**
	 * The feature id for the '<em><b>Left Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATION__LEFT_INPUT = OPERATION__LEFT_INPUT;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.MathImpl <em>Math</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.MathImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getMath()
	 * @generated
	 */
	int MATH = 19;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH__ASSIGN = OPERATION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Right Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH__RIGHT_INPUT = OPERATION__RIGHT_INPUT;

	/**
	 * The feature id for the '<em><b>Left Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH__LEFT_INPUT = OPERATION__LEFT_INPUT;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.while_Impl <em>while </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.while_Impl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getwhile_()
	 * @generated
	 */
	int WHILE_ = 21;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE___BODY = CONDITIONAL_STATEMENT__BODY;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.userDefinedFunctionImpl <em>user Defined Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.userDefinedFunctionImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getuserDefinedFunction()
	 * @generated
	 */
	int USER_DEFINED_FUNCTION = 22;

	/**
	 * The feature id for the '<em><b>Assign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEFINED_FUNCTION__ASSIGN = CALL_FUNCTION__ASSIGN;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
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
	 * The meta object id for the '{@link structureAndBehaviour.impl.if_Impl <em>if </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.if_Impl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getif_()
	 * @generated
	 */
	int IF_ = 23;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF___BODY = CONDITIONAL_STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF___CONDITION = CONDITIONAL_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Else Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF___ELSE_BODY = CONDITIONAL_STATEMENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.System_InputImpl <em>System Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.System_InputImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getSystem_Input()
	 * @generated
	 */
	int SYSTEM_INPUT = 24;

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
	 * The meta object id for the '{@link structureAndBehaviour.impl.BlockOfCodeImpl <em>Block Of Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.impl.BlockOfCodeImpl
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getBlockOfCode()
	 * @generated
	 */
	int BLOCK_OF_CODE = 25;

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
	 * The meta object id for the '{@link structureAndBehaviour.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.AccessType
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 26;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.ClassType <em>Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.ClassType
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 27;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.PrimitiveType
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 28;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.MathOperator <em>Math Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.MathOperator
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getMathOperator()
	 * @generated
	 */
	int MATH_OPERATOR = 29;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.ComparationOperator <em>Comparation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.ComparationOperator
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getComparationOperator()
	 * @generated
	 */
	int COMPARATION_OPERATOR = 30;

	/**
	 * The meta object id for the '{@link structureAndBehaviour.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureAndBehaviour.LogicalOperator
	 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 31;

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Primative <em>Primative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primative</em>'.
	 * @see structureAndBehaviour.Primative
	 * @generated
	 */
	EClass getPrimative();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see structureAndBehaviour.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structureAndBehaviour.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link structureAndBehaviour.Interface#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see structureAndBehaviour.Interface#getMethod()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Method();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see structureAndBehaviour.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structureAndBehaviour.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link structureAndBehaviour.Program#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see structureAndBehaviour.Program#getClass_()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link structureAndBehaviour.Program#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see structureAndBehaviour.Program#getInterface()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Interface();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see structureAndBehaviour.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structureAndBehaviour.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Class#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see structureAndBehaviour.Class#getType()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Type();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Class#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see structureAndBehaviour.Class#getAccessType()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_AccessType();

	/**
	 * Returns the meta object for the containment reference list '{@link structureAndBehaviour.Class#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see structureAndBehaviour.Class#getVariable()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link structureAndBehaviour.Class#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see structureAndBehaviour.Class#getMethod()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Method();

	/**
	 * Returns the meta object for the reference '{@link structureAndBehaviour.Class#getInherated <em>Inherated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inherated</em>'.
	 * @see structureAndBehaviour.Class#getInherated()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Inherated();

	/**
	 * Returns the meta object for the reference '{@link structureAndBehaviour.Class#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see structureAndBehaviour.Class#getImplements()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Implements();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Complex <em>Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex</em>'.
	 * @see structureAndBehaviour.Complex
	 * @generated
	 */
	EClass getComplex();

	/**
	 * Returns the meta object for the reference '{@link structureAndBehaviour.Complex#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see structureAndBehaviour.Complex#getClass_()
	 * @see #getComplex()
	 * @generated
	 */
	EReference getComplex_Class();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.CallFunction <em>Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Function</em>'.
	 * @see structureAndBehaviour.CallFunction
	 * @generated
	 */
	EClass getCallFunction();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.ConditionalStatement <em>Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Statement</em>'.
	 * @see structureAndBehaviour.ConditionalStatement
	 * @generated
	 */
	EClass getConditionalStatement();

	/**
	 * Returns the meta object for the containment reference '{@link structureAndBehaviour.ConditionalStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see structureAndBehaviour.ConditionalStatement#getCondition()
	 * @see #getConditionalStatement()
	 * @generated
	 */
	EReference getConditionalStatement_Condition();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.dowhile_ <em>dowhile </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>dowhile </em>'.
	 * @see structureAndBehaviour.dowhile_
	 * @generated
	 */
	EClass getdowhile_();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.generalItem <em>general Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>general Item</em>'.
	 * @see structureAndBehaviour.generalItem
	 * @generated
	 */
	EClass getgeneralItem();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.for_ <em>for </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>for </em>'.
	 * @see structureAndBehaviour.for_
	 * @generated
	 */
	EClass getfor_();

	/**
	 * Returns the meta object for the reference '{@link structureAndBehaviour.for_#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see structureAndBehaviour.for_#getVariable()
	 * @see #getfor_()
	 * @generated
	 */
	EReference getfor__Variable();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.for_#isInc <em>Inc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inc</em>'.
	 * @see structureAndBehaviour.for_#isInc()
	 * @see #getfor_()
	 * @generated
	 */
	EAttribute getfor__Inc();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.for_#getUpdateValue <em>Update Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Value</em>'.
	 * @see structureAndBehaviour.for_#getUpdateValue()
	 * @see #getfor_()
	 * @generated
	 */
	EAttribute getfor__UpdateValue();

	/**
	 * Returns the meta object for the containment reference '{@link structureAndBehaviour.for_#getComparation <em>Comparation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparation</em>'.
	 * @see structureAndBehaviour.for_#getComparation()
	 * @see #getfor_()
	 * @generated
	 */
	EReference getfor__Comparation();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see structureAndBehaviour.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link structureAndBehaviour.Function#getBlockofcode <em>Blockofcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockofcode</em>'.
	 * @see structureAndBehaviour.Function#getBlockofcode()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Blockofcode();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structureAndBehaviour.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Function#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see structureAndBehaviour.Function#getAccessType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_AccessType();

	/**
	 * Returns the meta object for the reference list '{@link structureAndBehaviour.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see structureAndBehaviour.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for the reference '{@link structureAndBehaviour.Function#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return</em>'.
	 * @see structureAndBehaviour.Function#getReturn()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Return();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see structureAndBehaviour.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference '{@link structureAndBehaviour.Operation#getRightInput <em>Right Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Input</em>'.
	 * @see structureAndBehaviour.Operation#getRightInput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_RightInput();

	/**
	 * Returns the meta object for the containment reference '{@link structureAndBehaviour.Operation#getLeftInput <em>Left Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Input</em>'.
	 * @see structureAndBehaviour.Operation#getLeftInput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_LeftInput();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see structureAndBehaviour.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the containment reference '{@link structureAndBehaviour.Statement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see structureAndBehaviour.Statement#getBody()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Body();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see structureAndBehaviour.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structureAndBehaviour.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Variable#getInitialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialization</em>'.
	 * @see structureAndBehaviour.Variable#getInitialization()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Initialization();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Variable#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see structureAndBehaviour.Variable#getAccessType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see structureAndBehaviour.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.System_Output <em>System Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Output</em>'.
	 * @see structureAndBehaviour.System_Output
	 * @generated
	 */
	EClass getSystem_Output();

	/**
	 * Returns the meta object for the reference list '{@link structureAndBehaviour.System_Output#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see structureAndBehaviour.System_Output#getParameters()
	 * @see #getSystem_Output()
	 * @generated
	 */
	EReference getSystem_Output_Parameters();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.NotOperation <em>Not Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Operation</em>'.
	 * @see structureAndBehaviour.NotOperation
	 * @generated
	 */
	EClass getNotOperation();

	/**
	 * Returns the meta object for the reference '{@link structureAndBehaviour.NotOperation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see structureAndBehaviour.NotOperation#getInput()
	 * @see #getNotOperation()
	 * @generated
	 */
	EReference getNotOperation_Input();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see structureAndBehaviour.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Logical <em>Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical</em>'.
	 * @see structureAndBehaviour.Logical
	 * @generated
	 */
	EClass getLogical();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Logical#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see structureAndBehaviour.Logical#getType()
	 * @see #getLogical()
	 * @generated
	 */
	EAttribute getLogical_Type();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Comparation <em>Comparation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparation</em>'.
	 * @see structureAndBehaviour.Comparation
	 * @generated
	 */
	EClass getComparation();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Comparation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see structureAndBehaviour.Comparation#getType()
	 * @see #getComparation()
	 * @generated
	 */
	EAttribute getComparation_Type();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Math <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math</em>'.
	 * @see structureAndBehaviour.Math
	 * @generated
	 */
	EClass getMath();

	/**
	 * Returns the meta object for the attribute '{@link structureAndBehaviour.Math#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see structureAndBehaviour.Math#getType()
	 * @see #getMath()
	 * @generated
	 */
	EAttribute getMath_Type();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see structureAndBehaviour.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference '{@link structureAndBehaviour.Expression#getAssign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assign</em>'.
	 * @see structureAndBehaviour.Expression#getAssign()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Assign();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.while_ <em>while </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>while </em>'.
	 * @see structureAndBehaviour.while_
	 * @generated
	 */
	EClass getwhile_();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.userDefinedFunction <em>user Defined Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>user Defined Function</em>'.
	 * @see structureAndBehaviour.userDefinedFunction
	 * @generated
	 */
	EClass getuserDefinedFunction();

	/**
	 * Returns the meta object for the reference '{@link structureAndBehaviour.userDefinedFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see structureAndBehaviour.userDefinedFunction#getFunction()
	 * @see #getuserDefinedFunction()
	 * @generated
	 */
	EReference getuserDefinedFunction_Function();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.if_ <em>if </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>if </em>'.
	 * @see structureAndBehaviour.if_
	 * @generated
	 */
	EClass getif_();

	/**
	 * Returns the meta object for the containment reference '{@link structureAndBehaviour.if_#getElseBody <em>Else Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Body</em>'.
	 * @see structureAndBehaviour.if_#getElseBody()
	 * @see #getif_()
	 * @generated
	 */
	EReference getif__ElseBody();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.System_Input <em>System Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Input</em>'.
	 * @see structureAndBehaviour.System_Input
	 * @generated
	 */
	EClass getSystem_Input();

	/**
	 * Returns the meta object for class '{@link structureAndBehaviour.BlockOfCode <em>Block Of Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Of Code</em>'.
	 * @see structureAndBehaviour.BlockOfCode
	 * @generated
	 */
	EClass getBlockOfCode();

	/**
	 * Returns the meta object for the containment reference list '{@link structureAndBehaviour.BlockOfCode#getThings <em>Things</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Things</em>'.
	 * @see structureAndBehaviour.BlockOfCode#getThings()
	 * @see #getBlockOfCode()
	 * @generated
	 */
	EReference getBlockOfCode_Things();

	/**
	 * Returns the meta object for enum '{@link structureAndBehaviour.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see structureAndBehaviour.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link structureAndBehaviour.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Type</em>'.
	 * @see structureAndBehaviour.ClassType
	 * @generated
	 */
	EEnum getClassType();

	/**
	 * Returns the meta object for enum '{@link structureAndBehaviour.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see structureAndBehaviour.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the meta object for enum '{@link structureAndBehaviour.MathOperator <em>Math Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Math Operator</em>'.
	 * @see structureAndBehaviour.MathOperator
	 * @generated
	 */
	EEnum getMathOperator();

	/**
	 * Returns the meta object for enum '{@link structureAndBehaviour.ComparationOperator <em>Comparation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparation Operator</em>'.
	 * @see structureAndBehaviour.ComparationOperator
	 * @generated
	 */
	EEnum getComparationOperator();

	/**
	 * Returns the meta object for enum '{@link structureAndBehaviour.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see structureAndBehaviour.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructureAndBehaviourFactory getStructureAndBehaviourFactory();

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
		 * The meta object literal for the '{@link structureAndBehaviour.impl.PrimativeImpl <em>Primative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.PrimativeImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getPrimative()
		 * @generated
		 */
		EClass PRIMATIVE = eINSTANCE.getPrimative();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.InterfaceImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__METHOD = eINSTANCE.getInterface_Method();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.ProgramImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CLASS = eINSTANCE.getProgram_Class();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__INTERFACE = eINSTANCE.getProgram_Interface();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.ClassImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__TYPE = eINSTANCE.getClass_Type();

		/**
		 * The meta object literal for the '<em><b>Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ACCESS_TYPE = eINSTANCE.getClass_AccessType();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__VARIABLE = eINSTANCE.getClass_Variable();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__METHOD = eINSTANCE.getClass_Method();

		/**
		 * The meta object literal for the '<em><b>Inherated</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INHERATED = eINSTANCE.getClass_Inherated();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__IMPLEMENTS = eINSTANCE.getClass_Implements();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.ComplexImpl <em>Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.ComplexImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getComplex()
		 * @generated
		 */
		EClass COMPLEX = eINSTANCE.getComplex();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX__CLASS = eINSTANCE.getComplex_Class();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.CallFunctionImpl <em>Call Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.CallFunctionImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getCallFunction()
		 * @generated
		 */
		EClass CALL_FUNCTION = eINSTANCE.getCallFunction();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.ConditionalStatementImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getConditionalStatement()
		 * @generated
		 */
		EClass CONDITIONAL_STATEMENT = eINSTANCE.getConditionalStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STATEMENT__CONDITION = eINSTANCE.getConditionalStatement_Condition();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.dowhile_Impl <em>dowhile </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.dowhile_Impl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getdowhile_()
		 * @generated
		 */
		EClass DOWHILE_ = eINSTANCE.getdowhile_();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.generalItemImpl <em>general Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.generalItemImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getgeneralItem()
		 * @generated
		 */
		EClass GENERAL_ITEM = eINSTANCE.getgeneralItem();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.for_Impl <em>for </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.for_Impl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getfor_()
		 * @generated
		 */
		EClass FOR_ = eINSTANCE.getfor_();

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
		 * The meta object literal for the '<em><b>Comparation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR___COMPARATION = eINSTANCE.getfor__Comparation();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.FunctionImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Blockofcode</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link structureAndBehaviour.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.OperationImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Right Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RIGHT_INPUT = eINSTANCE.getOperation_RightInput();

		/**
		 * The meta object literal for the '<em><b>Left Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__LEFT_INPUT = eINSTANCE.getOperation_LeftInput();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.StatementImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__BODY = eINSTANCE.getStatement_Body();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.VariableImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getVariable()
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
		 * The meta object literal for the '<em><b>Initialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__INITIALIZATION = eINSTANCE.getVariable_Initialization();

		/**
		 * The meta object literal for the '<em><b>Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ACCESS_TYPE = eINSTANCE.getVariable_AccessType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.System_OutputImpl <em>System Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.System_OutputImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getSystem_Output()
		 * @generated
		 */
		EClass SYSTEM_OUTPUT = eINSTANCE.getSystem_Output();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OUTPUT__PARAMETERS = eINSTANCE.getSystem_Output_Parameters();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.NotOperationImpl <em>Not Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.NotOperationImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getNotOperation()
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
		 * The meta object literal for the '{@link structureAndBehaviour.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.ListImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.LogicalImpl <em>Logical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.LogicalImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getLogical()
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
		 * The meta object literal for the '{@link structureAndBehaviour.impl.ComparationImpl <em>Comparation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.ComparationImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getComparation()
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
		 * The meta object literal for the '{@link structureAndBehaviour.impl.MathImpl <em>Math</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.MathImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getMath()
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
		 * The meta object literal for the '{@link structureAndBehaviour.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.ExpressionImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getExpression()
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
		 * The meta object literal for the '{@link structureAndBehaviour.impl.while_Impl <em>while </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.while_Impl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getwhile_()
		 * @generated
		 */
		EClass WHILE_ = eINSTANCE.getwhile_();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.userDefinedFunctionImpl <em>user Defined Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.userDefinedFunctionImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getuserDefinedFunction()
		 * @generated
		 */
		EClass USER_DEFINED_FUNCTION = eINSTANCE.getuserDefinedFunction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DEFINED_FUNCTION__FUNCTION = eINSTANCE.getuserDefinedFunction_Function();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.if_Impl <em>if </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.if_Impl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getif_()
		 * @generated
		 */
		EClass IF_ = eINSTANCE.getif_();

		/**
		 * The meta object literal for the '<em><b>Else Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF___ELSE_BODY = eINSTANCE.getif__ElseBody();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.System_InputImpl <em>System Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.System_InputImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getSystem_Input()
		 * @generated
		 */
		EClass SYSTEM_INPUT = eINSTANCE.getSystem_Input();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.impl.BlockOfCodeImpl <em>Block Of Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.impl.BlockOfCodeImpl
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getBlockOfCode()
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
		 * The meta object literal for the '{@link structureAndBehaviour.AccessType <em>Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.AccessType
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getAccessType()
		 * @generated
		 */
		EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.ClassType <em>Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.ClassType
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getClassType()
		 * @generated
		 */
		EEnum CLASS_TYPE = eINSTANCE.getClassType();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.PrimitiveType
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.MathOperator <em>Math Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.MathOperator
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getMathOperator()
		 * @generated
		 */
		EEnum MATH_OPERATOR = eINSTANCE.getMathOperator();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.ComparationOperator <em>Comparation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.ComparationOperator
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getComparationOperator()
		 * @generated
		 */
		EEnum COMPARATION_OPERATOR = eINSTANCE.getComparationOperator();

		/**
		 * The meta object literal for the '{@link structureAndBehaviour.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureAndBehaviour.LogicalOperator
		 * @see structureAndBehaviour.impl.StructureAndBehaviourPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

	}

} //StructureAndBehaviourPackage
