/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.nml.nML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation CP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.nml.nML.TransformationCP#getOwnedModels <em>Owned Models</em>}</li>
 *   <li>{@link org.xtext.example.nml.nML.TransformationCP#getOwnedConditions <em>Owned Conditions</em>}</li>
 *   <li>{@link org.xtext.example.nml.nML.TransformationCP#getOwnedStatement <em>Owned Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.nml.nML.NMLPackage#getTransformationCP()
 * @model
 * @generated
 */
public interface TransformationCP extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Models</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.nml.nML.modelTypeCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Models</em>' containment reference list.
   * @see org.xtext.example.nml.nML.NMLPackage#getTransformationCP_OwnedModels()
   * @model containment="true"
   * @generated
   */
  EList<modelTypeCS> getOwnedModels();

  /**
   * Returns the value of the '<em><b>Owned Conditions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.nml.nML.ConditionCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Conditions</em>' containment reference list.
   * @see org.xtext.example.nml.nML.NMLPackage#getTransformationCP_OwnedConditions()
   * @model containment="true"
   * @generated
   */
  EList<ConditionCS> getOwnedConditions();

  /**
   * Returns the value of the '<em><b>Owned Statement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.nml.nML.StatementCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Statement</em>' containment reference list.
   * @see org.xtext.example.nml.nML.NMLPackage#getTransformationCP_OwnedStatement()
   * @model containment="true"
   * @generated
   */
  EList<StatementCS> getOwnedStatement();

} // TransformationCP
