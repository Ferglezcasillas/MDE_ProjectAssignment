/**
 */
package behaviourLanguage.util;

import behaviourLanguage.BehaviourLanguagePackage;
import behaviourLanguage.BlockOfCode;
import behaviourLanguage.CallFunction;
import behaviourLanguage.Comparation;
import behaviourLanguage.ConditionalStatement;
import behaviourLanguage.Expression;
import behaviourLanguage.Function;
import behaviourLanguage.Logical;
import behaviourLanguage.NotOperation;
import behaviourLanguage.Operation;
import behaviourLanguage.Statement;
import behaviourLanguage.System_Input;
import behaviourLanguage.System_Output;
import behaviourLanguage.Variable;
import behaviourLanguage.dowhile_;
import behaviourLanguage.else_;
import behaviourLanguage.for_;
import behaviourLanguage.generalItem;
import behaviourLanguage.if_;
import behaviourLanguage.userDefinedFunction;
import behaviourLanguage.while_;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see behaviourLanguage.BehaviourLanguagePackage
 * @generated
 */
public class BehaviourLanguageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviourLanguagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourLanguageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BehaviourLanguagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourLanguageSwitch<Adapter> modelSwitch = new BehaviourLanguageSwitch<Adapter>() {
		@Override
		public Adapter caseBlockOfCode(BlockOfCode object) {
			return createBlockOfCodeAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseCallFunction(CallFunction object) {
			return createCallFunctionAdapter();
		}

		@Override
		public Adapter casefor_(for_ object) {
			return createfor_Adapter();
		}

		@Override
		public Adapter casewhile_(while_ object) {
			return createwhile_Adapter();
		}

		@Override
		public Adapter caseif_(if_ object) {
			return createif_Adapter();
		}

		@Override
		public Adapter casedowhile_(dowhile_ object) {
			return createdowhile_Adapter();
		}

		@Override
		public Adapter caseMath(behaviourLanguage.Math object) {
			return createMathAdapter();
		}

		@Override
		public Adapter caseLogical(Logical object) {
			return createLogicalAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseelse_(else_ object) {
			return createelse_Adapter();
		}

		@Override
		public Adapter caseFunction(Function object) {
			return createFunctionAdapter();
		}

		@Override
		public Adapter caseConditionalStatement(ConditionalStatement object) {
			return createConditionalStatementAdapter();
		}

		@Override
		public Adapter caseComparation(Comparation object) {
			return createComparationAdapter();
		}

		@Override
		public Adapter caseNotOperation(NotOperation object) {
			return createNotOperationAdapter();
		}

		@Override
		public Adapter caseSystem_Input(System_Input object) {
			return createSystem_InputAdapter();
		}

		@Override
		public Adapter caseSystem_Output(System_Output object) {
			return createSystem_OutputAdapter();
		}

		@Override
		public Adapter caseuserDefinedFunction(userDefinedFunction object) {
			return createuserDefinedFunctionAdapter();
		}

		@Override
		public Adapter casegeneralItem(generalItem object) {
			return creategeneralItemAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.BlockOfCode <em>Block Of Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.BlockOfCode
	 * @generated
	 */
	public Adapter createBlockOfCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.CallFunction <em>Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.CallFunction
	 * @generated
	 */
	public Adapter createCallFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.for_ <em>for </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.for_
	 * @generated
	 */
	public Adapter createfor_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.while_ <em>while </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.while_
	 * @generated
	 */
	public Adapter createwhile_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.if_ <em>if </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.if_
	 * @generated
	 */
	public Adapter createif_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.dowhile_ <em>dowhile </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.dowhile_
	 * @generated
	 */
	public Adapter createdowhile_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.Math <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.Math
	 * @generated
	 */
	public Adapter createMathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.Logical <em>Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.Logical
	 * @generated
	 */
	public Adapter createLogicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.else_ <em>else </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.else_
	 * @generated
	 */
	public Adapter createelse_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.ConditionalStatement <em>Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.ConditionalStatement
	 * @generated
	 */
	public Adapter createConditionalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.Comparation <em>Comparation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.Comparation
	 * @generated
	 */
	public Adapter createComparationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.NotOperation <em>Not Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.NotOperation
	 * @generated
	 */
	public Adapter createNotOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.System_Input <em>System Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.System_Input
	 * @generated
	 */
	public Adapter createSystem_InputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.System_Output <em>System Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.System_Output
	 * @generated
	 */
	public Adapter createSystem_OutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.userDefinedFunction <em>user Defined Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.userDefinedFunction
	 * @generated
	 */
	public Adapter createuserDefinedFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link behaviourLanguage.generalItem <em>general Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see behaviourLanguage.generalItem
	 * @generated
	 */
	public Adapter creategeneralItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BehaviourLanguageAdapterFactory
