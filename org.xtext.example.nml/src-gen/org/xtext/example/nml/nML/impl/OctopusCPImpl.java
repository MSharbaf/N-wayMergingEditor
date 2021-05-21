/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.nml.nML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.nml.nML.NMLPackage;
import org.xtext.example.nml.nML.OctopusCP;
import org.xtext.example.nml.nML.StatementCS;
import org.xtext.example.nml.nML.modelTypeCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Octopus CP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.nml.nML.impl.OctopusCPImpl#getOwnedModels <em>Owned Models</em>}</li>
 *   <li>{@link org.xtext.example.nml.nML.impl.OctopusCPImpl#getOwnedConditions <em>Owned Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OctopusCPImpl extends MinimalEObjectImpl.Container implements OctopusCP
{
  /**
   * The cached value of the '{@link #getOwnedModels() <em>Owned Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedModels()
   * @generated
   * @ordered
   */
  protected EList<modelTypeCS> ownedModels;

  /**
   * The cached value of the '{@link #getOwnedConditions() <em>Owned Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedConditions()
   * @generated
   * @ordered
   */
  protected EList<StatementCS> ownedConditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OctopusCPImpl()
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
    return NMLPackage.Literals.OCTOPUS_CP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<modelTypeCS> getOwnedModels()
  {
    if (ownedModels == null)
    {
      ownedModels = new EObjectContainmentEList<modelTypeCS>(modelTypeCS.class, this, NMLPackage.OCTOPUS_CP__OWNED_MODELS);
    }
    return ownedModels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StatementCS> getOwnedConditions()
  {
    if (ownedConditions == null)
    {
      ownedConditions = new EObjectContainmentEList<StatementCS>(StatementCS.class, this, NMLPackage.OCTOPUS_CP__OWNED_CONDITIONS);
    }
    return ownedConditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case NMLPackage.OCTOPUS_CP__OWNED_MODELS:
        return ((InternalEList<?>)getOwnedModels()).basicRemove(otherEnd, msgs);
      case NMLPackage.OCTOPUS_CP__OWNED_CONDITIONS:
        return ((InternalEList<?>)getOwnedConditions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case NMLPackage.OCTOPUS_CP__OWNED_MODELS:
        return getOwnedModels();
      case NMLPackage.OCTOPUS_CP__OWNED_CONDITIONS:
        return getOwnedConditions();
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
      case NMLPackage.OCTOPUS_CP__OWNED_MODELS:
        getOwnedModels().clear();
        getOwnedModels().addAll((Collection<? extends modelTypeCS>)newValue);
        return;
      case NMLPackage.OCTOPUS_CP__OWNED_CONDITIONS:
        getOwnedConditions().clear();
        getOwnedConditions().addAll((Collection<? extends StatementCS>)newValue);
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
      case NMLPackage.OCTOPUS_CP__OWNED_MODELS:
        getOwnedModels().clear();
        return;
      case NMLPackage.OCTOPUS_CP__OWNED_CONDITIONS:
        getOwnedConditions().clear();
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
      case NMLPackage.OCTOPUS_CP__OWNED_MODELS:
        return ownedModels != null && !ownedModels.isEmpty();
      case NMLPackage.OCTOPUS_CP__OWNED_CONDITIONS:
        return ownedConditions != null && !ownedConditions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OctopusCPImpl