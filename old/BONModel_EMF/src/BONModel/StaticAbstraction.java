/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BONModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Abstraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BONModel.StaticAbstraction#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see BONModel.BONModelPackage#getStaticAbstraction()
 * @model abstract="true"
 * @generated
 */
public interface StaticAbstraction extends Abstraction {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see BONModel.BONModelPackage#getStaticAbstraction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link BONModel.StaticAbstraction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // StaticAbstraction
