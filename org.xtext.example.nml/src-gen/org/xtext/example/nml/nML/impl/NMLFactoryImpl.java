/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.nml.nML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.nml.nML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NMLFactoryImpl extends EFactoryImpl implements NMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NMLFactory init()
  {
    try
    {
      NMLFactory theNMLFactory = (NMLFactory)EPackage.Registry.INSTANCE.getEFactory(NMLPackage.eNS_URI);
      if (theNMLFactory != null)
      {
        return theNMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NMLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case NMLPackage.TOP_LEVEL_CP: return createTopLevelCP();
      case NMLPackage.DOMAIN_CP: return createDomainCP();
      case NMLPackage.OCTOPUS_CP: return createOctopusCP();
      case NMLPackage.OURS_CP: return createOursCP();
      case NMLPackage.TRANSFER_CP: return createTransferCP();
      case NMLPackage.MODEL_TYPE_CS: return createmodelTypeCS();
      case NMLPackage.MODEL_ORDER_CS: return createmodelOrderCS();
      case NMLPackage.MODEL_LIST_CS: return createmodelListCS();
      case NMLPackage.STATEMENT_CS: return createStatementCS();
      case NMLPackage.CONDITION_CS: return createConditionCS();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelCP createTopLevelCP()
  {
    TopLevelCPImpl topLevelCP = new TopLevelCPImpl();
    return topLevelCP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainCP createDomainCP()
  {
    DomainCPImpl domainCP = new DomainCPImpl();
    return domainCP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OctopusCP createOctopusCP()
  {
    OctopusCPImpl octopusCP = new OctopusCPImpl();
    return octopusCP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OursCP createOursCP()
  {
    OursCPImpl oursCP = new OursCPImpl();
    return oursCP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransferCP createTransferCP()
  {
    TransferCPImpl transferCP = new TransferCPImpl();
    return transferCP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public modelTypeCS createmodelTypeCS()
  {
    modelTypeCSImpl modelTypeCS = new modelTypeCSImpl();
    return modelTypeCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public modelOrderCS createmodelOrderCS()
  {
    modelOrderCSImpl modelOrderCS = new modelOrderCSImpl();
    return modelOrderCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public modelListCS createmodelListCS()
  {
    modelListCSImpl modelListCS = new modelListCSImpl();
    return modelListCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementCS createStatementCS()
  {
    StatementCSImpl statementCS = new StatementCSImpl();
    return statementCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionCS createConditionCS()
  {
    ConditionCSImpl conditionCS = new ConditionCSImpl();
    return conditionCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NMLPackage getNMLPackage()
  {
    return (NMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NMLPackage getPackage()
  {
    return NMLPackage.eINSTANCE;
  }

} //NMLFactoryImpl
