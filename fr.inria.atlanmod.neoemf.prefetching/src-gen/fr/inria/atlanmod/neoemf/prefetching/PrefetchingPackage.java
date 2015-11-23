/**
 */
package fr.inria.atlanmod.neoemf.prefetching;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingFactory
 * @model kind="package"
 * @generated
 */
public interface PrefetchingPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "prefetching";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.inria.fr/atlanmod/neoemf/Prefetching";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "prefetching";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PrefetchingPackage eINSTANCE = fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.ModelImpl
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Cache</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CACHE = 0;

  /**
   * The feature id for the '<em><b>Plans</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PLANS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.CacheImpl <em>Cache</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.CacheImpl
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getCache()
   * @generated
   */
  int CACHE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Cache</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.CachePropertiesImpl <em>Cache Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.CachePropertiesImpl
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getCacheProperties()
   * @generated
   */
  int CACHE_PROPERTIES = 2;

  /**
   * The feature id for the '<em><b>Ref Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE_PROPERTIES__REF_TYPE = 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE_PROPERTIES__SIZE = 1;

  /**
   * The number of structural features of the '<em>Cache Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE_PROPERTIES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.PlanImpl <em>Plan</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PlanImpl
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getPlan()
   * @generated
   */
  int PLAN = 3;

  /**
   * The feature id for the '<em><b>Plan Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN__PLAN_ID = 0;

  /**
   * The feature id for the '<em><b>After</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN__AFTER = 1;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN__RULES = 2;

  /**
   * The number of structural features of the '<em>Plan</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.AfterRuleImpl <em>After Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.AfterRuleImpl
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getAfterRule()
   * @generated
   */
  int AFTER_RULE = 4;

  /**
   * The feature id for the '<em><b>Plan Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_RULE__PLAN_ID = 0;

  /**
   * The number of structural features of the '<em>After Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_RULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingRuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingRuleImpl
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getPrefetchingRule()
   * @generated
   */
  int PREFETCHING_RULE = 5;

  /**
   * The feature id for the '<em><b>Moment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFETCHING_RULE__MOMENT = 0;

  /**
   * The feature id for the '<em><b>Source Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFETCHING_RULE__SOURCE_PATTERN = 1;

  /**
   * The feature id for the '<em><b>Target Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFETCHING_RULE__TARGET_PATTERN = 2;

  /**
   * The feature id for the '<em><b>Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFETCHING_RULE__PROBABILITY = 3;

  /**
   * The feature id for the '<em><b>Sub Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFETCHING_RULE__SUB_RULES = 4;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFETCHING_RULE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.SourcePatternImpl <em>Source Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.SourcePatternImpl
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getSourcePattern()
   * @generated
   */
  int SOURCE_PATTERN = 6;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_PATTERN__PATTERN = 0;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_PATTERN__FILTER = 1;

  /**
   * The number of structural features of the '<em>Source Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_PATTERN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.FilterPatternImpl <em>Filter Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.FilterPatternImpl
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getFilterPattern()
   * @generated
   */
  int FILTER_PATTERN = 7;

  /**
   * The feature id for the '<em><b>String Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_PATTERN__STRING_PATTERN = 0;

  /**
   * The number of structural features of the '<em>Filter Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_PATTERN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.TargetPatternImpl <em>Target Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.TargetPatternImpl
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getTargetPattern()
   * @generated
   */
  int TARGET_PATTERN = 8;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_PATTERN__PATTERN = 0;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_PATTERN__FILTER = 1;

  /**
   * The number of structural features of the '<em>Target Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_PATTERN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.CacheType <em>Cache Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.neoemf.prefetching.CacheType
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getCacheType()
   * @generated
   */
  int CACHE_TYPE = 9;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.RefType <em>Ref Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.neoemf.prefetching.RefType
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getRefType()
   * @generated
   */
  int REF_TYPE = 10;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.Moment <em>Moment</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.neoemf.prefetching.Moment
   * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getMoment()
   * @generated
   */
  int MOMENT = 11;


  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.Model#getCache <em>Cache</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cache</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.Model#getCache()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Cache();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.neoemf.prefetching.Model#getPlans <em>Plans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Plans</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.Model#getPlans()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Plans();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.Cache <em>Cache</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cache</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.Cache
   * @generated
   */
  EClass getCache();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.Cache#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.Cache#getType()
   * @see #getCache()
   * @generated
   */
  EAttribute getCache_Type();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.Cache#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.Cache#getProperties()
   * @see #getCache()
   * @generated
   */
  EReference getCache_Properties();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.CacheProperties <em>Cache Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cache Properties</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.CacheProperties
   * @generated
   */
  EClass getCacheProperties();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.CacheProperties#getRefType <em>Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref Type</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.CacheProperties#getRefType()
   * @see #getCacheProperties()
   * @generated
   */
  EAttribute getCacheProperties_RefType();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.CacheProperties#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.CacheProperties#getSize()
   * @see #getCacheProperties()
   * @generated
   */
  EAttribute getCacheProperties_Size();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.Plan <em>Plan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plan</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.Plan
   * @generated
   */
  EClass getPlan();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.Plan#getPlanId <em>Plan Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Plan Id</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.Plan#getPlanId()
   * @see #getPlan()
   * @generated
   */
  EAttribute getPlan_PlanId();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.Plan#getAfter <em>After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>After</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.Plan#getAfter()
   * @see #getPlan()
   * @generated
   */
  EReference getPlan_After();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.neoemf.prefetching.Plan#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.Plan#getRules()
   * @see #getPlan()
   * @generated
   */
  EReference getPlan_Rules();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.AfterRule <em>After Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Rule</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.AfterRule
   * @generated
   */
  EClass getAfterRule();

  /**
   * Returns the meta object for the reference '{@link fr.inria.atlanmod.neoemf.prefetching.AfterRule#getPlanId <em>Plan Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Plan Id</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.AfterRule#getPlanId()
   * @see #getAfterRule()
   * @generated
   */
  EReference getAfterRule_PlanId();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule
   * @generated
   */
  EClass getPrefetchingRule();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getMoment <em>Moment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Moment</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getMoment()
   * @see #getPrefetchingRule()
   * @generated
   */
  EAttribute getPrefetchingRule_Moment();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getSourcePattern <em>Source Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Pattern</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getSourcePattern()
   * @see #getPrefetchingRule()
   * @generated
   */
  EReference getPrefetchingRule_SourcePattern();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getTargetPattern <em>Target Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Pattern</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getTargetPattern()
   * @see #getPrefetchingRule()
   * @generated
   */
  EReference getPrefetchingRule_TargetPattern();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getProbability <em>Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Probability</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getProbability()
   * @see #getPrefetchingRule()
   * @generated
   */
  EAttribute getPrefetchingRule_Probability();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getSubRules <em>Sub Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Rules</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getSubRules()
   * @see #getPrefetchingRule()
   * @generated
   */
  EReference getPrefetchingRule_SubRules();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.SourcePattern <em>Source Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source Pattern</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.SourcePattern
   * @generated
   */
  EClass getSourcePattern();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.SourcePattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.SourcePattern#getPattern()
   * @see #getSourcePattern()
   * @generated
   */
  EAttribute getSourcePattern_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.SourcePattern#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.SourcePattern#getFilter()
   * @see #getSourcePattern()
   * @generated
   */
  EReference getSourcePattern_Filter();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.FilterPattern <em>Filter Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Pattern</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.FilterPattern
   * @generated
   */
  EClass getFilterPattern();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.FilterPattern#getStringPattern <em>String Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Pattern</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.FilterPattern#getStringPattern()
   * @see #getFilterPattern()
   * @generated
   */
  EAttribute getFilterPattern_StringPattern();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.TargetPattern <em>Target Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Pattern</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.TargetPattern
   * @generated
   */
  EClass getTargetPattern();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.TargetPattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.TargetPattern#getPattern()
   * @see #getTargetPattern()
   * @generated
   */
  EAttribute getTargetPattern_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.TargetPattern#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.TargetPattern#getFilter()
   * @see #getTargetPattern()
   * @generated
   */
  EReference getTargetPattern_Filter();

  /**
   * Returns the meta object for enum '{@link fr.inria.atlanmod.neoemf.prefetching.CacheType <em>Cache Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cache Type</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.CacheType
   * @generated
   */
  EEnum getCacheType();

  /**
   * Returns the meta object for enum '{@link fr.inria.atlanmod.neoemf.prefetching.RefType <em>Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Ref Type</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.RefType
   * @generated
   */
  EEnum getRefType();

  /**
   * Returns the meta object for enum '{@link fr.inria.atlanmod.neoemf.prefetching.Moment <em>Moment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Moment</em>'.
   * @see fr.inria.atlanmod.neoemf.prefetching.Moment
   * @generated
   */
  EEnum getMoment();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PrefetchingFactory getPrefetchingFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.ModelImpl
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Cache</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CACHE = eINSTANCE.getModel_Cache();

    /**
     * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PLANS = eINSTANCE.getModel_Plans();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.CacheImpl <em>Cache</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.CacheImpl
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getCache()
     * @generated
     */
    EClass CACHE = eINSTANCE.getCache();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CACHE__TYPE = eINSTANCE.getCache_Type();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CACHE__PROPERTIES = eINSTANCE.getCache_Properties();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.CachePropertiesImpl <em>Cache Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.CachePropertiesImpl
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getCacheProperties()
     * @generated
     */
    EClass CACHE_PROPERTIES = eINSTANCE.getCacheProperties();

    /**
     * The meta object literal for the '<em><b>Ref Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CACHE_PROPERTIES__REF_TYPE = eINSTANCE.getCacheProperties_RefType();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CACHE_PROPERTIES__SIZE = eINSTANCE.getCacheProperties_Size();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.PlanImpl <em>Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PlanImpl
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getPlan()
     * @generated
     */
    EClass PLAN = eINSTANCE.getPlan();

    /**
     * The meta object literal for the '<em><b>Plan Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAN__PLAN_ID = eINSTANCE.getPlan_PlanId();

    /**
     * The meta object literal for the '<em><b>After</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAN__AFTER = eINSTANCE.getPlan_After();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAN__RULES = eINSTANCE.getPlan_Rules();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.AfterRuleImpl <em>After Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.AfterRuleImpl
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getAfterRule()
     * @generated
     */
    EClass AFTER_RULE = eINSTANCE.getAfterRule();

    /**
     * The meta object literal for the '<em><b>Plan Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFTER_RULE__PLAN_ID = eINSTANCE.getAfterRule_PlanId();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingRuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingRuleImpl
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getPrefetchingRule()
     * @generated
     */
    EClass PREFETCHING_RULE = eINSTANCE.getPrefetchingRule();

    /**
     * The meta object literal for the '<em><b>Moment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFETCHING_RULE__MOMENT = eINSTANCE.getPrefetchingRule_Moment();

    /**
     * The meta object literal for the '<em><b>Source Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFETCHING_RULE__SOURCE_PATTERN = eINSTANCE.getPrefetchingRule_SourcePattern();

    /**
     * The meta object literal for the '<em><b>Target Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFETCHING_RULE__TARGET_PATTERN = eINSTANCE.getPrefetchingRule_TargetPattern();

    /**
     * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFETCHING_RULE__PROBABILITY = eINSTANCE.getPrefetchingRule_Probability();

    /**
     * The meta object literal for the '<em><b>Sub Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFETCHING_RULE__SUB_RULES = eINSTANCE.getPrefetchingRule_SubRules();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.SourcePatternImpl <em>Source Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.SourcePatternImpl
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getSourcePattern()
     * @generated
     */
    EClass SOURCE_PATTERN = eINSTANCE.getSourcePattern();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE_PATTERN__PATTERN = eINSTANCE.getSourcePattern_Pattern();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_PATTERN__FILTER = eINSTANCE.getSourcePattern_Filter();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.FilterPatternImpl <em>Filter Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.FilterPatternImpl
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getFilterPattern()
     * @generated
     */
    EClass FILTER_PATTERN = eINSTANCE.getFilterPattern();

    /**
     * The meta object literal for the '<em><b>String Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILTER_PATTERN__STRING_PATTERN = eINSTANCE.getFilterPattern_StringPattern();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.impl.TargetPatternImpl <em>Target Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.TargetPatternImpl
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getTargetPattern()
     * @generated
     */
    EClass TARGET_PATTERN = eINSTANCE.getTargetPattern();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_PATTERN__PATTERN = eINSTANCE.getTargetPattern_Pattern();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET_PATTERN__FILTER = eINSTANCE.getTargetPattern_Filter();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.CacheType <em>Cache Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.neoemf.prefetching.CacheType
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getCacheType()
     * @generated
     */
    EEnum CACHE_TYPE = eINSTANCE.getCacheType();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.RefType <em>Ref Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.neoemf.prefetching.RefType
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getRefType()
     * @generated
     */
    EEnum REF_TYPE = eINSTANCE.getRefType();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.Moment <em>Moment</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.neoemf.prefetching.Moment
     * @see fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingPackageImpl#getMoment()
     * @generated
     */
    EEnum MOMENT = eINSTANCE.getMoment();

  }

} //PrefetchingPackage
