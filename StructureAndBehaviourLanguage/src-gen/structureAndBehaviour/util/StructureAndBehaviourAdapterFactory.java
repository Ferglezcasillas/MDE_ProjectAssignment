/**
 */
package structureAndBehaviour.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import structureAndBehaviour.BlockOfCode;
import structureAndBehaviour.CallFunction;
import structureAndBehaviour.Comparation;
import structureAndBehaviour.Complex;
import structureAndBehaviour.ConditionalStatement;
import structureAndBehaviour.Expression;
import structureAndBehaviour.Function;
import structureAndBehaviour.Interface;
import structureAndBehaviour.List;
import structureAndBehaviour.Logical;
import structureAndBehaviour.NotOperation;
import structureAndBehaviour.Operation;
import structureAndBehaviour.Primative;
import structureAndBehaviour.Program;
import structureAndBehaviour.Statement;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see structureAndBehaviour.StructureAndBehaviourPackage
 * @generated
 */
public class StructureAndBehaviourAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructureAndBehaviourPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureAndBehaviourAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StructureAndBehaviourPackage.eINSTANCE;
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
	protected StructureAndBehaviourSwitch<Adapter> modelSwitch = new StructureAndBehaviourSwitch<Adapter>() {
		@Override
		public Adapter casePrimative(Primative object) {
			return createPrimativeAdapter();
		}

		@Override
		public Adapter caseInterface(Interface object) {
			return createInterfaceAdapter();
		}

		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseClass(structureAndBehaviour.Class object) {
			return createClassAdapter();
		}

		@Override
		public Adapter caseComplex(Complex object) {
			return createComplexAdapter();
		}

		@Override
		public Adapter caseCallFunction(CallFunction object) {
			return createCallFunctionAdapter();
		}

		@Override
		public Adapter caseConditionalStatement(ConditionalStatement object) {
			return createConditionalStatementAdapter();
		}

		@Override
		public Adapter casedowhile_(dowhile_ object) {
			return createdowhile_Adapter();
		}

		@Override
		public Adapter casegeneralItem(generalItem object) {
			return creategeneralItemAdapter();
		}

		@Override
		public Adapter casefor_(for_ object) {
			return createfor_Adapter();
		}

		@Override
		public Adapter caseFunction(Function object) {
			return createFunctionAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseSystem_Output(System_Output object) {
			return createSystem_OutputAdapter();
		}

		@Override
		public Adapter caseNotOperation(NotOperation object) {
			return createNotOperationAdapter();
		}

		@Override
		public Adapter caseList(List object) {
			return createListAdapter();
		}

		@Override
		public Adapter caseLogical(Logical object) {
			return createLogicalAdapter();
		}

		@Override
		public Adapter caseComparation(Comparation object) {
			return createComparationAdapter();
		}

		@Override
		public Adapter caseMath(structureAndBehaviour.Math object) {
			return createMathAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter casewhile_(while_ object) {
			return createwhile_Adapter();
		}

		@Override
		public Adapter caseuserDefinedFunction(userDefinedFunction object) {
			return createuserDefinedFunctionAdapter();
		}

		@Override
		public Adapter caseif_(if_ object) {
			return createif_Adapter();
		}

		@Override
		public Adapter caseSystem_Input(System_Input object) {
			return createSystem_InputAdapter();
		}

		@Override
		public Adapter caseBlockOfCode(BlockOfCode object) {
			return createBlockOfCodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Primative <em>Primative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Primative
	 * @generated
	 */
	public Adapter createPrimativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Complex <em>Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Complex
	 * @generated
	 */
	public Adapter createComplexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.CallFunction <em>Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.CallFunction
	 * @generated
	 */
	public Adapter createCallFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.ConditionalStatement <em>Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.ConditionalStatement
	 * @generated
	 */
	public Adapter createConditionalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.dowhile_ <em>dowhile </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.dowhile_
	 * @generated
	 */
	public Adapter createdowhile_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.generalItem <em>general Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.generalItem
	 * @generated
	 */
	public Adapter creategeneralItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.for_ <em>for </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.for_
	 * @generated
	 */
	public Adapter createfor_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.System_Output <em>System Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.System_Output
	 * @generated
	 */
	public Adapter createSystem_OutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.NotOperation <em>Not Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.NotOperation
	 * @generated
	 */
	public Adapter createNotOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Logical <em>Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Logical
	 * @generated
	 */
	public Adapter createLogicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Comparation <em>Comparation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Comparation
	 * @generated
	 */
	public Adapter createComparationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Math <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Math
	 * @generated
	 */
	public Adapter createMathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.while_ <em>while </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.while_
	 * @generated
	 */
	public Adapter createwhile_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.userDefinedFunction <em>user Defined Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.userDefinedFunction
	 * @generated
	 */
	public Adapter createuserDefinedFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.if_ <em>if </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.if_
	 * @generated
	 */
	public Adapter createif_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.System_Input <em>System Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.System_Input
	 * @generated
	 */
	public Adapter createSystem_InputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structureAndBehaviour.BlockOfCode <em>Block Of Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structureAndBehaviour.BlockOfCode
	 * @generated
	 */
	public Adapter createBlockOfCodeAdapter() {
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

} //StructureAndBehaviourAdapterFactory
