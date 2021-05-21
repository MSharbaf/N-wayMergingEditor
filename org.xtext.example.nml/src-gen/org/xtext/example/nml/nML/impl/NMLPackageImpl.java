/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.nml.nML.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.nml.nML.ConditionCS;
import org.xtext.example.nml.nML.DomainCP;
import org.xtext.example.nml.nML.NMLFactory;
import org.xtext.example.nml.nML.NMLPackage;
import org.xtext.example.nml.nML.OctopusCP;
import org.xtext.example.nml.nML.OursCP;
import org.xtext.example.nml.nML.StatementCS;
import org.xtext.example.nml.nML.TopLevelCP;
import org.xtext.example.nml.nML.TransformationCP;
import org.xtext.example.nml.nML.modelOrderCS;
import org.xtext.example.nml.nML.modelTypeCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NMLPackageImpl extends EPackageImpl implements NMLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelCPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainCPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass octopusCPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oursCPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transformationCPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelTypeCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelOrderCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionCSEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.nml.nML.NMLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private NMLPackageImpl()
  {
    super(eNS_URI, NMLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link NMLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static NMLPackage init()
  {
    if (isInited) return (NMLPackage)EPackage.Registry.INSTANCE.getEPackage(NMLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredNMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    NMLPackageImpl theNMLPackage = registeredNMLPackage instanceof NMLPackageImpl ? (NMLPackageImpl)registeredNMLPackage : new NMLPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theNMLPackage.createPackageContents();

    // Initialize created meta-data
    theNMLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theNMLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(NMLPackage.eNS_URI, theNMLPackage);
    return theNMLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelCP()
  {
    return topLevelCPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopLevelCP_Name()
  {
    return (EAttribute)topLevelCPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelCP_OwnedDomains()
  {
    return (EReference)topLevelCPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelCP_OwnedPre()
  {
    return (EReference)topLevelCPEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelCP_OwnedOctopus()
  {
    return (EReference)topLevelCPEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelCP_OwnedOurs()
  {
    return (EReference)topLevelCPEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelCP_OwnedTransformation()
  {
    return (EReference)topLevelCPEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainCP()
  {
    return domainCPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainCP_Name()
  {
    return (EAttribute)domainCPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainCP_NsURI()
  {
    return (EAttribute)domainCPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOctopusCP()
  {
    return octopusCPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOctopusCP_OwnedModels()
  {
    return (EReference)octopusCPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOctopusCP_OwnedConditions()
  {
    return (EReference)octopusCPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOursCP()
  {
    return oursCPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOursCP_OwnedModels()
  {
    return (EReference)oursCPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOursCP_OwnedOrders()
  {
    return (EReference)oursCPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOursCP_OwnedStatement()
  {
    return (EReference)oursCPEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransformationCP()
  {
    return transformationCPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransformationCP_OwnedModels()
  {
    return (EReference)transformationCPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransformationCP_OwnedConditions()
  {
    return (EReference)transformationCPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransformationCP_OwnedStatement()
  {
    return (EReference)transformationCPEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmodelTypeCS()
  {
    return modelTypeCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodelTypeCS_Name()
  {
    return (EAttribute)modelTypeCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmodelOrderCS()
  {
    return modelOrderCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmodelOrderCS_Name()
  {
    return (EAttribute)modelOrderCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatementCS()
  {
    return statementCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatementCS_OwnedElement()
  {
    return (EAttribute)statementCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionCS()
  {
    return conditionCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionCS_OwnedElement()
  {
    return (EAttribute)conditionCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NMLFactory getNMLFactory()
  {
    return (NMLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    topLevelCPEClass = createEClass(TOP_LEVEL_CP);
    createEAttribute(topLevelCPEClass, TOP_LEVEL_CP__NAME);
    createEReference(topLevelCPEClass, TOP_LEVEL_CP__OWNED_DOMAINS);
    createEReference(topLevelCPEClass, TOP_LEVEL_CP__OWNED_PRE);
    createEReference(topLevelCPEClass, TOP_LEVEL_CP__OWNED_OCTOPUS);
    createEReference(topLevelCPEClass, TOP_LEVEL_CP__OWNED_OURS);
    createEReference(topLevelCPEClass, TOP_LEVEL_CP__OWNED_TRANSFORMATION);

    domainCPEClass = createEClass(DOMAIN_CP);
    createEAttribute(domainCPEClass, DOMAIN_CP__NAME);
    createEAttribute(domainCPEClass, DOMAIN_CP__NS_URI);

    octopusCPEClass = createEClass(OCTOPUS_CP);
    createEReference(octopusCPEClass, OCTOPUS_CP__OWNED_MODELS);
    createEReference(octopusCPEClass, OCTOPUS_CP__OWNED_CONDITIONS);

    oursCPEClass = createEClass(OURS_CP);
    createEReference(oursCPEClass, OURS_CP__OWNED_MODELS);
    createEReference(oursCPEClass, OURS_CP__OWNED_ORDERS);
    createEReference(oursCPEClass, OURS_CP__OWNED_STATEMENT);

    transformationCPEClass = createEClass(TRANSFORMATION_CP);
    createEReference(transformationCPEClass, TRANSFORMATION_CP__OWNED_MODELS);
    createEReference(transformationCPEClass, TRANSFORMATION_CP__OWNED_CONDITIONS);
    createEReference(transformationCPEClass, TRANSFORMATION_CP__OWNED_STATEMENT);

    modelTypeCSEClass = createEClass(MODEL_TYPE_CS);
    createEAttribute(modelTypeCSEClass, MODEL_TYPE_CS__NAME);

    modelOrderCSEClass = createEClass(MODEL_ORDER_CS);
    createEAttribute(modelOrderCSEClass, MODEL_ORDER_CS__NAME);

    statementCSEClass = createEClass(STATEMENT_CS);
    createEAttribute(statementCSEClass, STATEMENT_CS__OWNED_ELEMENT);

    conditionCSEClass = createEClass(CONDITION_CS);
    createEAttribute(conditionCSEClass, CONDITION_CS__OWNED_ELEMENT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(topLevelCPEClass, TopLevelCP.class, "TopLevelCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTopLevelCP_Name(), ecorePackage.getEString(), "name", null, 0, 1, TopLevelCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopLevelCP_OwnedDomains(), this.getDomainCP(), null, "ownedDomains", null, 0, -1, TopLevelCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopLevelCP_OwnedPre(), this.getStatementCS(), null, "ownedPre", null, 0, -1, TopLevelCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopLevelCP_OwnedOctopus(), this.getOctopusCP(), null, "ownedOctopus", null, 0, -1, TopLevelCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopLevelCP_OwnedOurs(), this.getOursCP(), null, "ownedOurs", null, 0, -1, TopLevelCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopLevelCP_OwnedTransformation(), this.getTransformationCP(), null, "ownedTransformation", null, 0, -1, TopLevelCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainCPEClass, DomainCP.class, "DomainCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainCP_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainCP_NsURI(), ecorePackage.getEString(), "nsURI", null, 0, 1, DomainCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(octopusCPEClass, OctopusCP.class, "OctopusCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOctopusCP_OwnedModels(), this.getmodelTypeCS(), null, "ownedModels", null, 0, -1, OctopusCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOctopusCP_OwnedConditions(), this.getStatementCS(), null, "ownedConditions", null, 0, -1, OctopusCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oursCPEClass, OursCP.class, "OursCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOursCP_OwnedModels(), this.getmodelTypeCS(), null, "ownedModels", null, 0, -1, OursCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOursCP_OwnedOrders(), this.getmodelOrderCS(), null, "ownedOrders", null, 0, -1, OursCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOursCP_OwnedStatement(), this.getStatementCS(), null, "ownedStatement", null, 0, -1, OursCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transformationCPEClass, TransformationCP.class, "TransformationCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransformationCP_OwnedModels(), this.getmodelTypeCS(), null, "ownedModels", null, 0, -1, TransformationCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransformationCP_OwnedConditions(), this.getConditionCS(), null, "ownedConditions", null, 0, -1, TransformationCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransformationCP_OwnedStatement(), this.getStatementCS(), null, "ownedStatement", null, 0, -1, TransformationCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelTypeCSEClass, modelTypeCS.class, "modelTypeCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getmodelTypeCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, modelTypeCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelOrderCSEClass, modelOrderCS.class, "modelOrderCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getmodelOrderCS_Name(), ecorePackage.getEString(), "name", null, 0, 1, modelOrderCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementCSEClass, StatementCS.class, "StatementCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatementCS_OwnedElement(), ecorePackage.getEString(), "ownedElement", null, 0, -1, StatementCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionCSEClass, ConditionCS.class, "ConditionCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConditionCS_OwnedElement(), ecorePackage.getEString(), "ownedElement", null, 0, -1, ConditionCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //NMLPackageImpl
