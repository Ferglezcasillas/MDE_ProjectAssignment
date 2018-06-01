/**
 */
package behaviourLanguage.util;

import behaviourLanguage.BehaviourLanguagePackage;
import behaviourLanguage.BlockOfCode;
import behaviourLanguage.CallFunction;
import behaviourLanguage.Comparation;
import behaviourLanguage.ConditionalStatement;
import behaviourLanguage.Container;
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
import behaviourLanguage.for_;
import behaviourLanguage.generalItem;
import behaviourLanguage.if_;
import behaviourLanguage.userDefinedFunction;
import behaviourLanguage.while_;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see behaviourLanguage.BehaviourLanguagePackage
 * @generated
 */
public class BehaviourLanguageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviourLanguagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourLanguageSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviourLanguagePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BehaviourLanguagePackage.BLOCK_OF_CODE: {
			BlockOfCode blockOfCode = (BlockOfCode) theEObject;
			T result = caseBlockOfCode(blockOfCode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = casegeneralItem(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.STATEMENT: {
			Statement statement = (Statement) theEObject;
			T result = caseStatement(statement);
			if (result == null)
				result = casegeneralItem(statement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = caseExpression(operation);
			if (result == null)
				result = casegeneralItem(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.CALL_FUNCTION: {
			CallFunction callFunction = (CallFunction) theEObject;
			T result = caseCallFunction(callFunction);
			if (result == null)
				result = caseExpression(callFunction);
			if (result == null)
				result = casegeneralItem(callFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.FOR_: {
			for_ for_ = (for_) theEObject;
			T result = casefor_(for_);
			if (result == null)
				result = caseStatement(for_);
			if (result == null)
				result = casegeneralItem(for_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.WHILE_: {
			while_ while_ = (while_) theEObject;
			T result = casewhile_(while_);
			if (result == null)
				result = caseConditionalStatement(while_);
			if (result == null)
				result = caseStatement(while_);
			if (result == null)
				result = casegeneralItem(while_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.IF_: {
			if_ if_ = (if_) theEObject;
			T result = caseif_(if_);
			if (result == null)
				result = caseConditionalStatement(if_);
			if (result == null)
				result = caseStatement(if_);
			if (result == null)
				result = casegeneralItem(if_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.DOWHILE_: {
			dowhile_ dowhile_ = (dowhile_) theEObject;
			T result = casedowhile_(dowhile_);
			if (result == null)
				result = caseConditionalStatement(dowhile_);
			if (result == null)
				result = caseStatement(dowhile_);
			if (result == null)
				result = casegeneralItem(dowhile_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.MATH: {
			behaviourLanguage.Math math = (behaviourLanguage.Math) theEObject;
			T result = caseMath(math);
			if (result == null)
				result = caseOperation(math);
			if (result == null)
				result = caseExpression(math);
			if (result == null)
				result = casegeneralItem(math);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.LOGICAL: {
			Logical logical = (Logical) theEObject;
			T result = caseLogical(logical);
			if (result == null)
				result = caseOperation(logical);
			if (result == null)
				result = caseExpression(logical);
			if (result == null)
				result = casegeneralItem(logical);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseExpression(variable);
			if (result == null)
				result = casegeneralItem(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.FUNCTION: {
			Function function = (Function) theEObject;
			T result = caseFunction(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.CONDITIONAL_STATEMENT: {
			ConditionalStatement conditionalStatement = (ConditionalStatement) theEObject;
			T result = caseConditionalStatement(conditionalStatement);
			if (result == null)
				result = caseStatement(conditionalStatement);
			if (result == null)
				result = casegeneralItem(conditionalStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.COMPARATION: {
			Comparation comparation = (Comparation) theEObject;
			T result = caseComparation(comparation);
			if (result == null)
				result = caseOperation(comparation);
			if (result == null)
				result = caseExpression(comparation);
			if (result == null)
				result = casegeneralItem(comparation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.NOT_OPERATION: {
			NotOperation notOperation = (NotOperation) theEObject;
			T result = caseNotOperation(notOperation);
			if (result == null)
				result = caseExpression(notOperation);
			if (result == null)
				result = casegeneralItem(notOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.SYSTEM_INPUT: {
			System_Input system_Input = (System_Input) theEObject;
			T result = caseSystem_Input(system_Input);
			if (result == null)
				result = caseCallFunction(system_Input);
			if (result == null)
				result = caseExpression(system_Input);
			if (result == null)
				result = casegeneralItem(system_Input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.SYSTEM_OUTPUT: {
			System_Output system_Output = (System_Output) theEObject;
			T result = caseSystem_Output(system_Output);
			if (result == null)
				result = caseCallFunction(system_Output);
			if (result == null)
				result = caseExpression(system_Output);
			if (result == null)
				result = casegeneralItem(system_Output);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.USER_DEFINED_FUNCTION: {
			userDefinedFunction userDefinedFunction = (userDefinedFunction) theEObject;
			T result = caseuserDefinedFunction(userDefinedFunction);
			if (result == null)
				result = caseCallFunction(userDefinedFunction);
			if (result == null)
				result = caseExpression(userDefinedFunction);
			if (result == null)
				result = casegeneralItem(userDefinedFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.GENERAL_ITEM: {
			generalItem generalItem = (generalItem) theEObject;
			T result = casegeneralItem(generalItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourLanguagePackage.CONTAINER: {
			Container container = (Container) theEObject;
			T result = caseContainer(container);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Of Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Of Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockOfCode(BlockOfCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallFunction(CallFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>for </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>for </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefor_(for_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>while </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>while </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhile_(while_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>if </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>if </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseif_(if_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>dowhile </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>dowhile </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedowhile_(dowhile_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMath(behaviourLanguage.Math object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogical(Logical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalStatement(ConditionalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparation(Comparation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotOperation(NotOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem_Input(System_Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem_Output(System_Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>user Defined Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>user Defined Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseuserDefinedFunction(userDefinedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>general Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>general Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casegeneralItem(generalItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BehaviourLanguageSwitch
