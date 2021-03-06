/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.nml.nML.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.nml.nML.ConditionCS;
import org.xtext.example.nml.nML.NMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.nml.nML.impl.ConditionCSImpl#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionCSImpl extends MinimalEObjectImpl.Container implements ConditionCS
{
  /**
   * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedElement()
   * @generated
   * @ordered
   */
  protected EList<String> ownedElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionCSImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NMLPackage.Literals.CONDITION_CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOwnedElement()
  {
    if (ownedElement == null)
    {
      ownedElement = new EDataTypeEList<String>(String.class, this, NMLPackage.CONDITION_CS__OWNED_ELEMENT);
    }
    return ownedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NMLPackage.CONDITION_CS__OWNED_ELEMENT:
        return getOwnedElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NMLPackage.CONDITION_CS__OWNED_ELEMENT:
        getOwnedElement().clear();
        getOwnedElement().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NMLPackage.CONDITION_CS__OWNED_ELEMENT:
        getOwnedElement().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NMLPackage.CONDITION_CS__OWNED_ELEMENT:
        return ownedElement != null && !ownedElement.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (ownedElement: ");
    result.append(ownedElement);
    result.append(')');
    return result.toString();
  }

} //ConditionCSImpl
