/**
 */
package behaviourLanguage.impl;

import behaviourLanguage.AccessType;
import behaviourLanguage.BehaviourLanguageFactory;
import behaviourLanguage.BehaviourLanguagePackage;
import behaviourLanguage.BlockOfCode;
import behaviourLanguage.CallFunction;
import behaviourLanguage.Comparation;
import behaviourLanguage.ComparationOperator;
import behaviourLanguage.ConditionalStatement;
import behaviourLanguage.Expression;
import behaviourLanguage.Function;
import behaviourLanguage.Logical;
import behaviourLanguage.LogicalOperator;
import behaviourLanguage.MathOperator;
import behaviourLanguage.NotOperation;
import behaviourLanguage.Operation;
import behaviourLanguage.PrimitiveType;
import behaviourLanguage.Statement;
import behaviourLanguage.System_Input;
import behaviourLanguage.System_Output;
import behaviourLanguage.Variable;
import behaviourLanguage.dowhile_;
import behaviourLanguage.for_;
import behaviourLanguage.generalItem;
import behaviourLanguage.if_;
import behaviourLanguage.userDefinedFunction;
import behaviourLanguage.while_;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourLanguagePackageImpl extends EPackageImpl implements BehaviourLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockOfCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass for_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass while_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass if_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dowhile_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass system_InputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass system_OutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mathOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparationOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see behaviourLanguage.BehaviourLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviourLanguagePackageImpl() {
		super(eNS_URI, BehaviourLanguageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BehaviourLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviourLanguagePackage init() {
		if (isInited)
			return (BehaviourLanguagePackage) EPackage.Registry.INSTANCE.getEPackage(BehaviourLanguagePackage.eNS_URI);

		// Obtain or create and register package
		BehaviourLanguagePackageImpl theBehaviourLanguagePackage = (BehaviourLanguagePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof BehaviourLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new BehaviourLanguagePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBehaviourLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theBehaviourLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviourLanguagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviourLanguagePackage.eNS_URI, theBehaviourLanguagePackage);
		return theBehaviourLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockOfCode() {
		return blockOfCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockOfCode_Things() {
		return (EReference) blockOfCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Assign() {
		return (EReference) expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Body() {
		return (EReference) statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_LeftInput() {
		return (EReference) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_RightInput() {
		return (EReference) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallFunction() {
		return callFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfor_() {
		return for_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfor__Variable() {
		return (EReference) for_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getfor__Inc() {
		return (EAttribute) for_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getfor__UpdateValue() {
		return (EAttribute) for_EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfor__Comparation() {
		return (EReference) for_EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhile_() {
		return while_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getif_() {
		return if_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getif__ElseBody() {
		return (EReference) if_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdowhile_() {
		return dowhile_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMath() {
		return mathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMath_Type() {
		return (EAttribute) mathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogical() {
		return logicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogical_Type() {
		return (EAttribute) logicalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Initialization() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_TypeNotPrimitive() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Blockofcode() {
		return (EReference) functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Name() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_AccessType() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Parameters() {
		return (EReference) functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Return() {
		return (EReference) functionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalStatement() {
		return conditionalStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalStatement_Condition() {
		return (EReference) conditionalStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparation() {
		return comparationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparation_Type() {
		return (EAttribute) comparationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotOperation() {
		return notOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotOperation_Input() {
		return (EReference) notOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem_Input() {
		return system_InputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem_Output() {
		return system_OutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Output_Parameters() {
		return (EReference) system_OutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getuserDefinedFunction() {
		return userDefinedFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getuserDefinedFunction_Function() {
		return (EReference) userDefinedFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getgeneralItem() {
		return generalItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Function() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMathOperator() {
		return mathOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOperator() {
		return logicalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparationOperator() {
		return comparationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveType() {
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessType() {
		return accessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourLanguageFactory getBehaviourLanguageFactory() {
		return (BehaviourLanguageFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		blockOfCodeEClass = createEClass(BLOCK_OF_CODE);
		createEReference(blockOfCodeEClass, BLOCK_OF_CODE__THINGS);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__ASSIGN);

		statementEClass = createEClass(STATEMENT);
		createEReference(statementEClass, STATEMENT__BODY);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__RIGHT_INPUT);
		createEReference(operationEClass, OPERATION__LEFT_INPUT);

		callFunctionEClass = createEClass(CALL_FUNCTION);

		for_EClass = createEClass(FOR_);
		createEReference(for_EClass, FOR___VARIABLE);
		createEAttribute(for_EClass, FOR___INC);
		createEAttribute(for_EClass, FOR___UPDATE_VALUE);
		createEReference(for_EClass, FOR___COMPARATION);

		while_EClass = createEClass(WHILE_);

		if_EClass = createEClass(IF_);
		createEReference(if_EClass, IF___ELSE_BODY);

		dowhile_EClass = createEClass(DOWHILE_);

		mathEClass = createEClass(MATH);
		createEAttribute(mathEClass, MATH__TYPE);

		logicalEClass = createEClass(LOGICAL);
		createEAttribute(logicalEClass, LOGICAL__TYPE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__INITIALIZATION);
		createEAttribute(variableEClass, VARIABLE__TYPE_NOT_PRIMITIVE);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__BLOCKOFCODE);
		createEAttribute(functionEClass, FUNCTION__NAME);
		createEAttribute(functionEClass, FUNCTION__ACCESS_TYPE);
		createEReference(functionEClass, FUNCTION__PARAMETERS);
		createEReference(functionEClass, FUNCTION__RETURN);

		conditionalStatementEClass = createEClass(CONDITIONAL_STATEMENT);
		createEReference(conditionalStatementEClass, CONDITIONAL_STATEMENT__CONDITION);

		comparationEClass = createEClass(COMPARATION);
		createEAttribute(comparationEClass, COMPARATION__TYPE);

		notOperationEClass = createEClass(NOT_OPERATION);
		createEReference(notOperationEClass, NOT_OPERATION__INPUT);

		system_InputEClass = createEClass(SYSTEM_INPUT);

		system_OutputEClass = createEClass(SYSTEM_OUTPUT);
		createEReference(system_OutputEClass, SYSTEM_OUTPUT__PARAMETERS);

		userDefinedFunctionEClass = createEClass(USER_DEFINED_FUNCTION);
		createEReference(userDefinedFunctionEClass, USER_DEFINED_FUNCTION__FUNCTION);

		generalItemEClass = createEClass(GENERAL_ITEM);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__FUNCTION);

		// Create enums
		mathOperatorEEnum = createEEnum(MATH_OPERATOR);
		logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
		comparationOperatorEEnum = createEEnum(COMPARATION_OPERATOR);
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
		accessTypeEEnum = createEEnum(ACCESS_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		expressionEClass.getESuperTypes().add(this.getgeneralItem());
		statementEClass.getESuperTypes().add(this.getgeneralItem());
		operationEClass.getESuperTypes().add(this.getExpression());
		callFunctionEClass.getESuperTypes().add(this.getExpression());
		for_EClass.getESuperTypes().add(this.getStatement());
		while_EClass.getESuperTypes().add(this.getConditionalStatement());
		if_EClass.getESuperTypes().add(this.getConditionalStatement());
		dowhile_EClass.getESuperTypes().add(this.getConditionalStatement());
		mathEClass.getESuperTypes().add(this.getOperation());
		logicalEClass.getESuperTypes().add(this.getOperation());
		variableEClass.getESuperTypes().add(this.getExpression());
		conditionalStatementEClass.getESuperTypes().add(this.getStatement());
		comparationEClass.getESuperTypes().add(this.getOperation());
		notOperationEClass.getESuperTypes().add(this.getExpression());
		system_InputEClass.getESuperTypes().add(this.getCallFunction());
		system_OutputEClass.getESuperTypes().add(this.getCallFunction());
		userDefinedFunctionEClass.getESuperTypes().add(this.getCallFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(blockOfCodeEClass, BlockOfCode.class, "BlockOfCode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockOfCode_Things(), this.getgeneralItem(), null, "things", null, 0, -1, BlockOfCode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Assign(), this.getVariable(), null, "assign", null, 0, 1, Expression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Body(), this.getBlockOfCode(), null, "body", null, 1, 1, Statement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_RightInput(), this.getExpression(), null, "rightInput", null, 0, -1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_LeftInput(), this.getExpression(), null, "leftInput", null, 0, -1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callFunctionEClass, CallFunction.class, "CallFunction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(for_EClass, for_.class, "for_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getfor__Variable(), this.getVariable(), null, "variable", null, 0, 1, for_.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getfor__Inc(), theXMLTypePackage.getBoolean(), "inc", null, 0, 1, for_.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getfor__UpdateValue(), ecorePackage.getEInt(), "updateValue", null, 0, 1, for_.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getfor__Comparation(), this.getComparation(), null, "comparation", null, 1, 1, for_.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(while_EClass, while_.class, "while_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(if_EClass, if_.class, "if_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getif__ElseBody(), this.getBlockOfCode(), null, "elseBody", null, 0, 1, if_.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(dowhile_EClass, dowhile_.class, "dowhile_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mathEClass, behaviourLanguage.Math.class, "Math", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMath_Type(), this.getMathOperator(), "type", null, 0, 1, behaviourLanguage.Math.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalEClass, Logical.class, "Logical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogical_Type(), this.getLogicalOperator(), "type", null, 0, 1, Logical.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), this.getPrimitiveType(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Initialization(), ecorePackage.getEString(), "initialization", null, 0, 1,
				Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_TypeNotPrimitive(), theXMLTypePackage.getString(), "typeNotPrimitive", null, 0, 1,
				Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Blockofcode(), this.getBlockOfCode(), null, "blockofcode", null, 0, 1,
				Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_AccessType(), this.getAccessType(), "accessType", null, 0, 1, Function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Parameters(), this.getVariable(), null, "parameters", null, 0, -1, Function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Return(), this.getVariable(), null, "return", null, 0, 1, Function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalStatementEClass, ConditionalStatement.class, "ConditionalStatement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalStatement_Condition(), this.getLogical(), null, "condition", null, 1, 1,
				ConditionalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparationEClass, Comparation.class, "Comparation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparation_Type(), this.getComparationOperator(), "type", null, 0, 1, Comparation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notOperationEClass, NotOperation.class, "NotOperation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotOperation_Input(), this.getVariable(), null, "input", null, 1, 1, NotOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(system_InputEClass, System_Input.class, "System_Input", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(system_OutputEClass, System_Output.class, "System_Output", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Output_Parameters(), this.getVariable(), null, "parameters", null, 0, -1,
				System_Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDefinedFunctionEClass, userDefinedFunction.class, "userDefinedFunction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getuserDefinedFunction_Function(), this.getFunction(), null, "function", null, 1, 1,
				userDefinedFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalItemEClass, generalItem.class, "generalItem", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, behaviourLanguage.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Function(), this.getFunction(), null, "function", null, 0, -1,
				behaviourLanguage.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mathOperatorEEnum, MathOperator.class, "MathOperator");
		addEEnumLiteral(mathOperatorEEnum, MathOperator.ADDITION);
		addEEnumLiteral(mathOperatorEEnum, MathOperator.MOLTIPLICATION);
		addEEnumLiteral(mathOperatorEEnum, MathOperator.DIVISION);
		addEEnumLiteral(mathOperatorEEnum, MathOperator.SUBSTRACTION);

		initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);

		initEEnum(comparationOperatorEEnum, ComparationOperator.class, "ComparationOperator");
		addEEnumLiteral(comparationOperatorEEnum, ComparationOperator.MINOR);
		addEEnumLiteral(comparationOperatorEEnum, ComparationOperator.MAJOR);
		addEEnumLiteral(comparationOperatorEEnum, ComparationOperator.EQUAL);
		addEEnumLiteral(comparationOperatorEEnum, ComparationOperator.MAJOR_EQUAL);
		addEEnumLiteral(comparationOperatorEEnum, ComparationOperator.MINOR_EQUAL);

		initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BYTE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.SHORT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.INT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.LONG);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.FLOAT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DOUBLE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BOOLEAN);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.CHAR);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.STRING);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.NOTPRIMITIVE);

		initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
		addEEnumLiteral(accessTypeEEnum, AccessType.PUBLIC);
		addEEnumLiteral(accessTypeEEnum, AccessType.PROTECTED);
		addEEnumLiteral(accessTypeEEnum, AccessType.PRIVATE);

		// Create resource
		createResource(eNS_URI);
	}

} //BehaviourLanguagePackageImpl
