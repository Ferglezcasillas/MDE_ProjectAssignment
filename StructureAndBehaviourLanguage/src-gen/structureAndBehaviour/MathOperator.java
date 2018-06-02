/**
 */
package structureAndBehaviour;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Math Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getMathOperator()
 * @model
 * @generated
 */
public enum MathOperator implements Enumerator {
	/**
	 * The '<em><b>Addition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITION_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITION(0, "Addition", "+"),

	/**
	 * The '<em><b>Moltiplication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOLTIPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MOLTIPLICATION(1, "Moltiplication", "*"),

	/**
	 * The '<em><b>Division</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVISION_VALUE
	 * @generated
	 * @ordered
	 */
	DIVISION(2, "Division", "/"),

	/**
	 * The '<em><b>Substraction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTRACTION(3, "Substraction", "-");

	/**
	 * The '<em><b>Addition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Addition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDITION
	 * @model name="Addition" literal="+"
	 * @generated
	 * @ordered
	 */
	public static final int ADDITION_VALUE = 0;

	/**
	 * The '<em><b>Moltiplication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Moltiplication</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOLTIPLICATION
	 * @model name="Moltiplication" literal="*"
	 * @generated
	 * @ordered
	 */
	public static final int MOLTIPLICATION_VALUE = 1;

	/**
	 * The '<em><b>Division</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Division</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVISION
	 * @model name="Division" literal="/"
	 * @generated
	 * @ordered
	 */
	public static final int DIVISION_VALUE = 2;

	/**
	 * The '<em><b>Substraction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substraction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTRACTION
	 * @model name="Substraction" literal="-"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTRACTION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Math Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MathOperator[] VALUES_ARRAY = new MathOperator[] { ADDITION, MOLTIPLICATION, DIVISION,
			SUBSTRACTION, };

	/**
	 * A public read-only list of all the '<em><b>Math Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MathOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Math Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MathOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MathOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Math Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MathOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MathOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Math Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MathOperator get(int value) {
		switch (value) {
		case ADDITION_VALUE:
			return ADDITION;
		case MOLTIPLICATION_VALUE:
			return MOLTIPLICATION;
		case DIVISION_VALUE:
			return DIVISION;
		case SUBSTRACTION_VALUE:
			return SUBSTRACTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MathOperator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //MathOperator
