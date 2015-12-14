/**
 */
package fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AfterClause;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Cache;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheType;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FilterPattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Moment;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingFactory;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.RefType;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrefetchingPackageImpl extends EPackageImpl implements PrefetchingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachePropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefetchingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourcePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum refTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum momentEEnum = null;

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
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrefetchingPackageImpl() {
		super(eNS_URI, PrefetchingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PrefetchingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrefetchingPackage init() {
		if (isInited) return (PrefetchingPackage)EPackage.Registry.INSTANCE.getEPackage(PrefetchingPackage.eNS_URI);

		// Obtain or create and register package
		PrefetchingPackageImpl thePrefetchingPackage = (PrefetchingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PrefetchingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PrefetchingPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePrefetchingPackage.createPackageContents();

		// Initialize created meta-data
		thePrefetchingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrefetchingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrefetchingPackage.eNS_URI, thePrefetchingPackage);
		return thePrefetchingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Metamodel() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Cache() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Plans() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelImport() {
		return metamodelImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelImport_NsURI() {
		return (EAttribute)metamodelImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCache() {
		return cacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Type() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCache_Properties() {
		return (EReference)cacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCacheProperties() {
		return cachePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheProperties_Size() {
		return (EAttribute)cachePropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlan() {
		return planEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlan_Name() {
		return (EAttribute)planEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlan_After() {
		return (EReference)planEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlan_Rules() {
		return (EReference)planEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAfterClause() {
		return afterClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAfterClause_Plan() {
		return (EReference)afterClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrefetchingRule() {
		return prefetchingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefetchingRule_TargetPattern() {
		return (EReference)prefetchingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrefetchingRule_Probability() {
		return (EAttribute)prefetchingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefetchingRule_SubRules() {
		return (EReference)prefetchingRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefetchingRule_SourcePattern() {
		return (EReference)prefetchingRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourcePattern() {
		return sourcePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourcePattern_Pattern() {
		return (EAttribute)sourcePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourcePattern_Filter() {
		return (EReference)sourcePatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterPattern() {
		return filterPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterPattern_StringPattern() {
		return (EAttribute)filterPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetPattern() {
		return targetPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPattern_Pattern() {
		return (EAttribute)targetPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetPattern_Filter() {
		return (EReference)targetPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCacheType() {
		return cacheTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRefType() {
		return refTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMoment() {
		return momentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefetchingFactory getPrefetchingFactory() {
		return (PrefetchingFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__METAMODEL);
		createEReference(modelEClass, MODEL__CACHE);
		createEReference(modelEClass, MODEL__PLANS);

		metamodelImportEClass = createEClass(METAMODEL_IMPORT);
		createEAttribute(metamodelImportEClass, METAMODEL_IMPORT__NS_URI);

		cacheEClass = createEClass(CACHE);
		createEAttribute(cacheEClass, CACHE__TYPE);
		createEReference(cacheEClass, CACHE__PROPERTIES);

		cachePropertiesEClass = createEClass(CACHE_PROPERTIES);
		createEAttribute(cachePropertiesEClass, CACHE_PROPERTIES__SIZE);

		planEClass = createEClass(PLAN);
		createEAttribute(planEClass, PLAN__NAME);
		createEReference(planEClass, PLAN__AFTER);
		createEReference(planEClass, PLAN__RULES);

		afterClauseEClass = createEClass(AFTER_CLAUSE);
		createEReference(afterClauseEClass, AFTER_CLAUSE__PLAN);

		prefetchingRuleEClass = createEClass(PREFETCHING_RULE);
		createEReference(prefetchingRuleEClass, PREFETCHING_RULE__TARGET_PATTERN);
		createEAttribute(prefetchingRuleEClass, PREFETCHING_RULE__PROBABILITY);
		createEReference(prefetchingRuleEClass, PREFETCHING_RULE__SUB_RULES);
		createEReference(prefetchingRuleEClass, PREFETCHING_RULE__SOURCE_PATTERN);

		sourcePatternEClass = createEClass(SOURCE_PATTERN);
		createEAttribute(sourcePatternEClass, SOURCE_PATTERN__PATTERN);
		createEReference(sourcePatternEClass, SOURCE_PATTERN__FILTER);

		filterPatternEClass = createEClass(FILTER_PATTERN);
		createEAttribute(filterPatternEClass, FILTER_PATTERN__STRING_PATTERN);

		targetPatternEClass = createEClass(TARGET_PATTERN);
		createEAttribute(targetPatternEClass, TARGET_PATTERN__PATTERN);
		createEReference(targetPatternEClass, TARGET_PATTERN__FILTER);

		// Create enums
		cacheTypeEEnum = createEEnum(CACHE_TYPE);
		refTypeEEnum = createEEnum(REF_TYPE);
		momentEEnum = createEEnum(MOMENT);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Metamodel(), this.getMetamodelImport(), null, "metamodel", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Cache(), this.getCache(), null, "cache", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Plans(), this.getPlan(), null, "plans", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelImportEClass, MetamodelImport.class, "MetamodelImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodelImport_NsURI(), ecorePackage.getEString(), "nsURI", null, 0, 1, MetamodelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheEClass, Cache.class, "Cache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCache_Type(), this.getCacheType(), "type", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCache_Properties(), this.getCacheProperties(), null, "properties", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachePropertiesEClass, CacheProperties.class, "CacheProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCacheProperties_Size(), ecorePackage.getEInt(), "size", null, 0, 1, CacheProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planEClass, Plan.class, "Plan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlan_Name(), ecorePackage.getEString(), "name", null, 0, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlan_After(), this.getAfterClause(), null, "after", null, 0, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlan_Rules(), this.getPrefetchingRule(), null, "rules", null, 0, -1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(afterClauseEClass, AfterClause.class, "AfterClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAfterClause_Plan(), this.getPlan(), null, "plan", null, 0, 1, AfterClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prefetchingRuleEClass, PrefetchingRule.class, "PrefetchingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrefetchingRule_TargetPattern(), this.getTargetPattern(), null, "targetPattern", null, 0, 1, PrefetchingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrefetchingRule_Probability(), ecorePackage.getEInt(), "probability", null, 0, 1, PrefetchingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrefetchingRule_SubRules(), this.getPrefetchingRule(), null, "subRules", null, 0, -1, PrefetchingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrefetchingRule_SourcePattern(), this.getSourcePattern(), null, "sourcePattern", null, 0, 1, PrefetchingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourcePatternEClass, SourcePattern.class, "SourcePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourcePattern_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, SourcePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourcePattern_Filter(), this.getFilterPattern(), null, "filter", null, 0, 1, SourcePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterPatternEClass, FilterPattern.class, "FilterPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterPattern_StringPattern(), ecorePackage.getEString(), "stringPattern", null, 0, 1, FilterPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetPatternEClass, TargetPattern.class, "TargetPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetPattern_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, TargetPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPattern_Filter(), this.getFilterPattern(), null, "filter", null, 0, 1, TargetPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cacheTypeEEnum, CacheType.class, "CacheType");
		addEEnumLiteral(cacheTypeEEnum, CacheType.LRU);
		addEEnumLiteral(cacheTypeEEnum, CacheType.PREDICTIVE);

		initEEnum(refTypeEEnum, RefType.class, "RefType");
		addEEnumLiteral(refTypeEEnum, RefType.STRONG);
		addEEnumLiteral(refTypeEEnum, RefType.SOFT);
		addEEnumLiteral(refTypeEEnum, RefType.WEAK);

		initEEnum(momentEEnum, Moment.class, "Moment");
		addEEnumLiteral(momentEEnum, Moment.ON_STARTING);
		addEEnumLiteral(momentEEnum, Moment.ON_LOADING);

		// Create resource
		createResource(eNS_URI);
	}

} //PrefetchingPackageImpl
