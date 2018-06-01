/**
 */
package behaviourLanguage.impl;

import behaviourLanguage.AccessType;
import behaviourLanguage.BehaviourLanguageFactory;
import behaviourLanguage.BehaviourLanguagePackage;
import behaviourLanguage.BlockOfCode;
import behaviourLanguage.Comparation;
import behaviourLanguage.ComparationOperator;
import behaviourLanguage.Function;
import behaviourLanguage.Logical;
import behaviourLanguage.LogicalOperator;
import behaviourLanguage.MathOperator;
import behaviourLanguage.NotOperation;
import behaviourLanguage.PrimitiveType;
import behaviourLanguage.System_Input;
import behaviourLanguage.System_Output;
import behaviourLanguage.Variable;
import behaviourLanguage.dowhile_;
import behaviourLanguage.for_;
import behaviourLanguage.if_;
import behaviourLanguage.userDefinedFunction;
import behaviourLanguage.while_;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourLanguageFactoryImpl extends EFactoryImpl implements BehaviourLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviourLanguageFactory init() {
		try {
			BehaviourLanguageFactory theBehaviourLanguageFactory = (BehaviourLanguageFactory) EPackage.Registry.INSTANCE
					.getEFactory(BehaviourLanguagePackage.eNS_URI);
			if (theBehaviourLanguageFactory != null) {
				return theBehaviourLanguageFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviourLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourLanguageFactoryImpl() {
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
		case BehaviourLanguagePackage.BLOCK_OF_CODE:
			return createBlockOfCode();
		case BehaviourLanguagePackage.FOR_:
			return createfor_();
		case BehaviourLanguagePackage.WHILE_:
			return createwhile_();
		case BehaviourLanguagePackage.IF_:
			return createif_();
		case BehaviourLanguagePackage.DOWHILE_:
			return createdowhile_();
		case BehaviourLanguagePackage.MATH:
			return createMath();
		case BehaviourLanguagePackage.LOGICAL:
			return createLogical();
		case BehaviourLanguagePackage.VARIABLE:
			return createVariable();
		case BehaviourLanguagePackage.FUNCTION:
			return createFunction();
		case BehaviourLanguagePackage.COMPARATION:
			return createComparation();
		case BehaviourLanguagePackage.NOT_OPERATION:
			return createNotOperation();
		case BehaviourLanguagePackage.SYSTEM_INPUT:
			return createSystem_Input();
		case BehaviourLanguagePackage.SYSTEM_OUTPUT:
			return createSystem_Output();
		case BehaviourLanguagePackage.USER_DEFINED_FUNCTION:
			return createuserDefinedFunction();
		case BehaviourLanguagePackage.CONTAINER:
			return createContainer();
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
		case BehaviourLanguagePackage.MATH_OPERATOR:
			return createMathOperatorFromString(eDataType, initialValue);
		case BehaviourLanguagePackage.LOGICAL_OPERATOR:
			return createLogicalOperatorFromString(eDataType, initialValue);
		case BehaviourLanguagePackage.COMPARATION_OPERATOR:
			return createComparationOperatorFromString(eDataType, initialValue);
		case BehaviourLanguagePackage.PRIMITIVE_TYPE:
			return createPrimitiveTypeFromString(eDataType, initialValue);
		case BehaviourLanguagePackage.ACCESS_TYPE:
			return createAccessTypeFromString(eDataType, initialValue);
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
		case BehaviourLanguagePackage.MATH_OPERATOR:
			return convertMathOperatorToString(eDataType, instanceValue);
		case BehaviourLanguagePackage.LOGICAL_OPERATOR:
			return convertLogicalOperatorToString(eDataType, instanceValue);
		case BehaviourLanguagePackage.COMPARATION_OPERATOR:
			return convertComparationOperatorToString(eDataType, instanceValue);
		case BehaviourLanguagePackage.PRIMITIVE_TYPE:
			return convertPrimitiveTypeToString(eDataType, instanceValue);
		case BehaviourLanguagePackage.ACCESS_TYPE:
			return convertAccessTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public for_ createfor_() {
		for_Impl for_ = new for_Impl();
		return for_;
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
	public if_ createif_() {
		if_Impl if_ = new if_Impl();
		return if_;
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
	public behaviourLanguage.Math createMath() {
		MathImpl math = new MathImpl();
		return math;
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
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
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
	public Comparation createComparation() {
		ComparationImpl comparation = new ComparationImpl();
		return comparation;
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
	public System_Input createSystem_Input() {
		System_InputImpl system_Input = new System_InputImpl();
		return system_Input;
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
	public userDefinedFunction createuserDefinedFunction() {
		userDefinedFunctionImpl userDefinedFunction = new userDefinedFunctionImpl();
		return userDefinedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public behaviourLanguage.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
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
	public BehaviourLanguagePackage getBehaviourLanguagePackage() {
		return (BehaviourLanguagePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviourLanguagePackage getPackage() {
		return BehaviourLanguagePackage.eINSTANCE;
	}

} //BehaviourLanguageFactoryImpl
