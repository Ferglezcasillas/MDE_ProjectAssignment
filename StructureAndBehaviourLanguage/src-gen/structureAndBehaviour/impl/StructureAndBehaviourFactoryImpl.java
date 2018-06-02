/**
 */
package structureAndBehaviour.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import structureAndBehaviour.AccessType;
import structureAndBehaviour.BlockOfCode;
import structureAndBehaviour.CallFunction;
import structureAndBehaviour.ClassType;
import structureAndBehaviour.Comparation;
import structureAndBehaviour.ComparationOperator;
import structureAndBehaviour.Complex;
import structureAndBehaviour.ConditionalStatement;
import structureAndBehaviour.Expression;
import structureAndBehaviour.Function;
import structureAndBehaviour.Interface;
import structureAndBehaviour.List;
import structureAndBehaviour.Logical;
import structureAndBehaviour.LogicalOperator;
import structureAndBehaviour.MathOperator;
import structureAndBehaviour.NotOperation;
import structureAndBehaviour.Operation;
import structureAndBehaviour.Primative;
import structureAndBehaviour.PrimitiveType;
import structureAndBehaviour.Program;
import structureAndBehaviour.Statement;
import structureAndBehaviour.StructureAndBehaviourFactory;
import structureAndBehaviour.StructureAndBehaviourPackage;
import structureAndBehaviour.System_Input;
import structureAndBehaviour.System_Output;
import structureAndBehaviour.Variable;
import structureAndBehaviour.dowhile_;
import structureAndBehaviour.for_;
import structureAndBehaviour.generalItem;
import structureAndBehaviour.if_;
import structureAndBehaviour.userDefinedFunction;
import structureAndBehaviour.while_;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureAndBehaviourFactoryImpl extends EFactoryImpl implements StructureAndBehaviourFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructureAndBehaviourFactory init() {
		try {
			StructureAndBehaviourFactory theStructureAndBehaviourFactory = (StructureAndBehaviourFactory) EPackage.Registry.INSTANCE
					.getEFactory(StructureAndBehaviourPackage.eNS_URI);
			if (theStructureAndBehaviourFactory != null) {
				return theStructureAndBehaviourFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructureAndBehaviourFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureAndBehaviourFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StructureAndBehaviourPackage.PRIMATIVE:
			return createPrimative();
		case StructureAndBehaviourPackage.INTERFACE:
			return createInterface();
		case StructureAndBehaviourPackage.PROGRAM:
			return createProgram();
		case StructureAndBehaviourPackage.CLASS:
			return createClass();
		case StructureAndBehaviourPackage.COMPLEX:
			return createComplex();
		case StructureAndBehaviourPackage.CALL_FUNCTION:
			return createCallFunction();
		case StructureAndBehaviourPackage.CONDITIONAL_STATEMENT:
			return createConditionalStatement();
		case StructureAndBehaviourPackage.DOWHILE_:
			return createdowhile_();
		case StructureAndBehaviourPackage.GENERAL_ITEM:
			return creategeneralItem();
		case StructureAndBehaviourPackage.FOR_:
			return createfor_();
		case StructureAndBehaviourPackage.FUNCTION:
			return createFunction();
		case StructureAndBehaviourPackage.OPERATION:
			return createOperation();
		case StructureAndBehaviourPackage.STATEMENT:
			return createStatement();
		case StructureAndBehaviourPackage.VARIABLE:
			return createVariable();
		case StructureAndBehaviourPackage.SYSTEM_OUTPUT:
			return createSystem_Output();
		case StructureAndBehaviourPackage.NOT_OPERATION:
			return createNotOperation();
		case StructureAndBehaviourPackage.LIST:
			return createList();
		case StructureAndBehaviourPackage.LOGICAL:
			return createLogical();
		case StructureAndBehaviourPackage.COMPARATION:
			return createComparation();
		case StructureAndBehaviourPackage.MATH:
			return createMath();
		case StructureAndBehaviourPackage.EXPRESSION:
			return createExpression();
		case StructureAndBehaviourPackage.WHILE_:
			return createwhile_();
		case StructureAndBehaviourPackage.USER_DEFINED_FUNCTION:
			return createuserDefinedFunction();
		case StructureAndBehaviourPackage.IF_:
			return createif_();
		case StructureAndBehaviourPackage.SYSTEM_INPUT:
			return createSystem_Input();
		case StructureAndBehaviourPackage.BLOCK_OF_CODE:
			return createBlockOfCode();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case StructureAndBehaviourPackage.ACCESS_TYPE:
			return createAccessTypeFromString(eDataType, initialValue);
		case StructureAndBehaviourPackage.CLASS_TYPE:
			return createClassTypeFromString(eDataType, initialValue);
		case StructureAndBehaviourPackage.PRIMITIVE_TYPE:
			return createPrimitiveTypeFromString(eDataType, initialValue);
		case StructureAndBehaviourPackage.MATH_OPERATOR:
			return createMathOperatorFromString(eDataType, initialValue);
		case StructureAndBehaviourPackage.COMPARATION_OPERATOR:
			return createComparationOperatorFromString(eDataType, initialValue);
		case StructureAndBehaviourPackage.LOGICAL_OPERATOR:
			return createLogicalOperatorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case StructureAndBehaviourPackage.ACCESS_TYPE:
			return convertAccessTypeToString(eDataType, instanceValue);
		case StructureAndBehaviourPackage.CLASS_TYPE:
			return convertClassTypeToString(eDataType, instanceValue);
		case StructureAndBehaviourPackage.PRIMITIVE_TYPE:
			return convertPrimitiveTypeToString(eDataType, instanceValue);
		case StructureAndBehaviourPackage.MATH_OPERATOR:
			return convertMathOperatorToString(eDataType, instanceValue);
		case StructureAndBehaviourPackage.COMPARATION_OPERATOR:
			return convertComparationOperatorToString(eDataType, instanceValue);
		case StructureAndBehaviourPackage.LOGICAL_OPERATOR:
			return convertLogicalOperatorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primative createPrimative() {
		PrimativeImpl primative = new PrimativeImpl();
		return primative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structureAndBehaviour.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complex createComplex() {
		ComplexImpl complex = new ComplexImpl();
		return complex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallFunction createCallFunction() {
		CallFunctionImpl callFunction = new CallFunctionImpl();
		return callFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalStatement createConditionalStatement() {
		ConditionalStatementImpl conditionalStatement = new ConditionalStatementImpl();
		return conditionalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dowhile_ createdowhile_() {
		dowhile_Impl dowhile_ = new dowhile_Impl();
		return dowhile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public generalItem creategeneralItem() {
		generalItemImpl generalItem = new generalItemImpl();
		return generalItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public for_ createfor_() {
		for_Impl for_ = new for_Impl();
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public System_Output createSystem_Output() {
		System_OutputImpl system_Output = new System_OutputImpl();
		return system_Output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotOperation createNotOperation() {
		NotOperationImpl notOperation = new NotOperationImpl();
		return notOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical createLogical() {
		LogicalImpl logical = new LogicalImpl();
		return logical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparation createComparation() {
		ComparationImpl comparation = new ComparationImpl();
		return comparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structureAndBehaviour.Math createMath() {
		MathImpl math = new MathImpl();
		return math;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public while_ createwhile_() {
		while_Impl while_ = new while_Impl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public userDefinedFunction createuserDefinedFunction() {
		userDefinedFunctionImpl userDefinedFunction = new userDefinedFunctionImpl();
		return userDefinedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public if_ createif_() {
		if_Impl if_ = new if_Impl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public System_Input createSystem_Input() {
		System_InputImpl system_Input = new System_InputImpl();
		return system_Input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockOfCode createBlockOfCode() {
		BlockOfCodeImpl blockOfCode = new BlockOfCodeImpl();
		return blockOfCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
		AccessType result = AccessType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType createClassTypeFromString(EDataType eDataType, String initialValue) {
		ClassType result = ClassType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
		PrimitiveType result = PrimitiveType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathOperator createMathOperatorFromString(EDataType eDataType, String initialValue) {
		MathOperator result = MathOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparationOperator createComparationOperatorFromString(EDataType eDataType, String initialValue) {
		ComparationOperator result = ComparationOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue) {
		LogicalOperator result = LogicalOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureAndBehaviourPackage getStructureAndBehaviourPackage() {
		return (StructureAndBehaviourPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructureAndBehaviourPackage getPackage() {
		return StructureAndBehaviourPackage.eINSTANCE;
	}

} //StructureAndBehaviourFactoryImpl
