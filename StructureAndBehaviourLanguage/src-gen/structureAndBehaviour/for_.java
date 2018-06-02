/**
 */
package structureAndBehaviour;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>for </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structureAndBehaviour.for_#getVariable <em>Variable</em>}</li>
 *   <li>{@link structureAndBehaviour.for_#isInc <em>Inc</em>}</li>
 *   <li>{@link structureAndBehaviour.for_#getUpdateValue <em>Update Value</em>}</li>
 *   <li>{@link structureAndBehaviour.for_#getComparation <em>Comparation</em>}</li>
 * </ul>
 *
 * @see structureAndBehaviour.StructureAndBehaviourPackage#getfor_()
 * @model
 * @generated
 */
public interface for_ extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference list.
	 * The list contents are of type {@link structureAndBehaviour.Primative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getfor__Variable()
	 * @model
	 * @generated
	 */
	EList<Primative> getVariable();

	/**
	 * Returns the value of the '<em><b>Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inc</em>' attribute.
	 * @see #setInc(boolean)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getfor__Inc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isInc();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.for_#isInc <em>Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inc</em>' attribute.
	 * @see #isInc()
	 * @generated
	 */
	void setInc(boolean value);

	/**
	 * Returns the value of the '<em><b>Update Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Value</em>' attribute.
	 * @see #setUpdateValue(int)
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getfor__UpdateValue()
	 * @model
	 * @generated
	 */
	int getUpdateValue();

	/**
	 * Sets the value of the '{@link structureAndBehaviour.for_#getUpdateValue <em>Update Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Value</em>' attribute.
	 * @see #getUpdateValue()
	 * @generated
	 */
	void setUpdateValue(int value);

	/**
	 * Returns the value of the '<em><b>Comparation</b></em>' containment reference list.
	 * The list contents are of type {@link structureAndBehaviour.Comparation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparation</em>' containment reference list.
	 * @see structureAndBehaviour.StructureAndBehaviourPackage#getfor__Comparation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Comparation> getComparation();

} // for_
