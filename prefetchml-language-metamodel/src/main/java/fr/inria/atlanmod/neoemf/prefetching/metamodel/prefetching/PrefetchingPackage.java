/**
 */
package fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingFactory
 * @model kind="package"
 * @generated
 */
public interface PrefetchingPackage extends EPackage {
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
	PrefetchingPackage eINSTANCE = fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.ModelImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__METAMODEL = 0;

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
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.MetamodelImportImpl <em>Metamodel Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.MetamodelImportImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getMetamodelImport()
	 * @generated
	 */
	int METAMODEL_IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_IMPORT__NS_URI = 0;

	/**
	 * The number of structural features of the '<em>Metamodel Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metamodel Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.CacheImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 2;

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
	 * The number of operations of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.CachePropertiesImpl <em>Cache Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.CachePropertiesImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getCacheProperties()
	 * @generated
	 */
	int CACHE_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_PROPERTIES__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Chunk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_PROPERTIES__CHUNK = 1;

	/**
	 * The number of structural features of the '<em>Cache Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_PROPERTIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cache Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PlanImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__NAME = 0;

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
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__CACHE = 3;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.AfterClauseImpl <em>After Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.AfterClauseImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getAfterClause()
	 * @generated
	 */
	int AFTER_CLAUSE = 5;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_CLAUSE__PLAN = 0;

	/**
	 * The number of structural features of the '<em>After Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>After Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingRuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingRuleImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getPrefetchingRule()
	 * @generated
	 */
	int PREFETCHING_RULE = 6;

	/**
	 * The feature id for the '<em><b>Target Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFETCHING_RULE__TARGET_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFETCHING_RULE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFETCHING_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFETCHING_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.StartingRuleImpl <em>Starting Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.StartingRuleImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getStartingRule()
	 * @generated
	 */
	int STARTING_RULE = 7;

	/**
	 * The feature id for the '<em><b>Target Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_RULE__TARGET_PATTERN = PREFETCHING_RULE__TARGET_PATTERN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_RULE__NAME = PREFETCHING_RULE__NAME;

	/**
	 * The number of structural features of the '<em>Starting Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_RULE_FEATURE_COUNT = PREFETCHING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Starting Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_RULE_OPERATION_COUNT = PREFETCHING_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.AccessRuleImpl <em>Access Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.AccessRuleImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getAccessRule()
	 * @generated
	 */
	int ACCESS_RULE = 8;

	/**
	 * The feature id for the '<em><b>Target Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RULE__TARGET_PATTERN = PREFETCHING_RULE__TARGET_PATTERN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RULE__NAME = PREFETCHING_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Source Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RULE__SOURCE_PATTERN = PREFETCHING_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remove Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RULE__REMOVE_TYPE = PREFETCHING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Access Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RULE_FEATURE_COUNT = PREFETCHING_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Access Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_RULE_OPERATION_COUNT = PREFETCHING_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.SourcePatternImpl <em>Source Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.SourcePatternImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getSourcePattern()
	 * @generated
	 */
	int SOURCE_PATTERN = 9;

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
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PATTERN__ECLASS = 2;

	/**
	 * The number of structural features of the '<em>Source Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PATTERN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Source Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.FilterPatternImpl <em>Filter Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.FilterPatternImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getFilterPattern()
	 * @generated
	 */
	int FILTER_PATTERN = 10;

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
	 * The number of operations of the '<em>Filter Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.TargetPatternImpl <em>Target Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.TargetPatternImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getTargetPattern()
	 * @generated
	 */
	int TARGET_PATTERN = 11;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PATTERN__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PATTERN__ECLASS = 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PATTERN__FEATURES = 2;

	/**
	 * The number of structural features of the '<em>Target Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PATTERN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Target Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.FeaturePatternImpl <em>Feature Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.FeaturePatternImpl
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getFeaturePattern()
	 * @generated
	 */
	int FEATURE_PATTERN = 12;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATTERN__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATTERN__CLOSURE = 1;

	/**
	 * The number of structural features of the '<em>Feature Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feature Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheType <em>Cache Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheType
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getCacheType()
	 * @generated
	 */
	int CACHE_TYPE = 13;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.RefType <em>Ref Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.RefType
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getRefType()
	 * @generated
	 */
	int REF_TYPE = 14;

	/**
	 * The meta object id for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Moment <em>Moment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Moment
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getMoment()
	 * @generated
	 */
	int MOMENT = 15;


	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metamodel</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model#getMetamodel()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Metamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plans</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model#getPlans()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Plans();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport <em>Metamodel Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Import</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport
	 * @generated
	 */
	EClass getMetamodelImport();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport#getNsURI <em>Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns URI</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport#getNsURI()
	 * @see #getMetamodelImport()
	 * @generated
	 */
	EAttribute getMetamodelImport_NsURI();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Cache#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Cache#getType()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Cache#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Cache#getProperties()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_Properties();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties <em>Cache Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Properties</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties
	 * @generated
	 */
	EClass getCacheProperties();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties#getSize()
	 * @see #getCacheProperties()
	 * @generated
	 */
	EAttribute getCacheProperties_Size();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties#getChunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chunk</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties#getChunk()
	 * @see #getCacheProperties()
	 * @generated
	 */
	EAttribute getCacheProperties_Chunk();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan#getName()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan#getAfter()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_After();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan#getRules()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_Rules();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan#getCache()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_Cache();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AfterClause <em>After Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Clause</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AfterClause
	 * @generated
	 */
	EClass getAfterClause();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AfterClause#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plan</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AfterClause#getPlan()
	 * @see #getAfterClause()
	 * @generated
	 */
	EReference getAfterClause_Plan();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule
	 * @generated
	 */
	EClass getPrefetchingRule();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule#getTargetPattern <em>Target Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Pattern</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule#getTargetPattern()
	 * @see #getPrefetchingRule()
	 * @generated
	 */
	EReference getPrefetchingRule_TargetPattern();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule#getName()
	 * @see #getPrefetchingRule()
	 * @generated
	 */
	EAttribute getPrefetchingRule_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.StartingRule <em>Starting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Starting Rule</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.StartingRule
	 * @generated
	 */
	EClass getStartingRule();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule <em>Access Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Rule</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule
	 * @generated
	 */
	EClass getAccessRule();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule#getSourcePattern <em>Source Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Pattern</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule#getSourcePattern()
	 * @see #getAccessRule()
	 * @generated
	 */
	EReference getAccessRule_SourcePattern();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule#getRemoveType <em>Remove Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Type</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule#getRemoveType()
	 * @see #getAccessRule()
	 * @generated
	 */
	EAttribute getAccessRule_RemoveType();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern <em>Source Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Pattern</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern
	 * @generated
	 */
	EClass getSourcePattern();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern#getPattern()
	 * @see #getSourcePattern()
	 * @generated
	 */
	EAttribute getSourcePattern_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern#getFilter()
	 * @see #getSourcePattern()
	 * @generated
	 */
	EReference getSourcePattern_Filter();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern#getEClass()
	 * @see #getSourcePattern()
	 * @generated
	 */
	EReference getSourcePattern_EClass();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FilterPattern <em>Filter Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Pattern</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FilterPattern
	 * @generated
	 */
	EClass getFilterPattern();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FilterPattern#getStringPattern <em>String Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Pattern</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FilterPattern#getStringPattern()
	 * @see #getFilterPattern()
	 * @generated
	 */
	EAttribute getFilterPattern_StringPattern();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern <em>Target Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Pattern</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern
	 * @generated
	 */
	EClass getTargetPattern();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern#getPattern()
	 * @see #getTargetPattern()
	 * @generated
	 */
	EAttribute getTargetPattern_Pattern();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern#getEClass()
	 * @see #getTargetPattern()
	 * @generated
	 */
	EReference getTargetPattern_EClass();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern#getFeatures()
	 * @see #getTargetPattern()
	 * @generated
	 */
	EReference getTargetPattern_Features();

	/**
	 * Returns the meta object for class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern <em>Feature Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Pattern</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern
	 * @generated
	 */
	EClass getFeaturePattern();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern#getFeature()
	 * @see #getFeaturePattern()
	 * @generated
	 */
	EReference getFeaturePattern_Feature();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern#isClosure <em>Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closure</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern#isClosure()
	 * @see #getFeaturePattern()
	 * @generated
	 */
	EAttribute getFeaturePattern_Closure();

	/**
	 * Returns the meta object for enum '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Type</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheType
	 * @generated
	 */
	EEnum getCacheType();

	/**
	 * Returns the meta object for enum '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.RefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ref Type</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.RefType
	 * @generated
	 */
	EEnum getRefType();

	/**
	 * Returns the meta object for enum '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Moment <em>Moment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Moment</em>'.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Moment
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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.ModelImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__METAMODEL = eINSTANCE.getModel_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PLANS = eINSTANCE.getModel_Plans();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.MetamodelImportImpl <em>Metamodel Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.MetamodelImportImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getMetamodelImport()
		 * @generated
		 */
		EClass METAMODEL_IMPORT = eINSTANCE.getMetamodelImport();

		/**
		 * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_IMPORT__NS_URI = eINSTANCE.getMetamodelImport_NsURI();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.CacheImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getCache()
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
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.CachePropertiesImpl <em>Cache Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.CachePropertiesImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getCacheProperties()
		 * @generated
		 */
		EClass CACHE_PROPERTIES = eINSTANCE.getCacheProperties();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_PROPERTIES__SIZE = eINSTANCE.getCacheProperties_Size();

		/**
		 * The meta object literal for the '<em><b>Chunk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_PROPERTIES__CHUNK = eINSTANCE.getCacheProperties_Chunk();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PlanImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__NAME = eINSTANCE.getPlan_Name();

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
		 * The meta object literal for the '<em><b>Cache</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN__CACHE = eINSTANCE.getPlan_Cache();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.AfterClauseImpl <em>After Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.AfterClauseImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getAfterClause()
		 * @generated
		 */
		EClass AFTER_CLAUSE = eINSTANCE.getAfterClause();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_CLAUSE__PLAN = eINSTANCE.getAfterClause_Plan();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingRuleImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getPrefetchingRule()
		 * @generated
		 */
		EClass PREFETCHING_RULE = eINSTANCE.getPrefetchingRule();

		/**
		 * The meta object literal for the '<em><b>Target Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFETCHING_RULE__TARGET_PATTERN = eINSTANCE.getPrefetchingRule_TargetPattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFETCHING_RULE__NAME = eINSTANCE.getPrefetchingRule_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.StartingRuleImpl <em>Starting Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.StartingRuleImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getStartingRule()
		 * @generated
		 */
		EClass STARTING_RULE = eINSTANCE.getStartingRule();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.AccessRuleImpl <em>Access Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.AccessRuleImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getAccessRule()
		 * @generated
		 */
		EClass ACCESS_RULE = eINSTANCE.getAccessRule();

		/**
		 * The meta object literal for the '<em><b>Source Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_RULE__SOURCE_PATTERN = eINSTANCE.getAccessRule_SourcePattern();

		/**
		 * The meta object literal for the '<em><b>Remove Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_RULE__REMOVE_TYPE = eINSTANCE.getAccessRule_RemoveType();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.SourcePatternImpl <em>Source Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.SourcePatternImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getSourcePattern()
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
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_PATTERN__ECLASS = eINSTANCE.getSourcePattern_EClass();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.FilterPatternImpl <em>Filter Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.FilterPatternImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getFilterPattern()
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
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.TargetPatternImpl <em>Target Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.TargetPatternImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getTargetPattern()
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
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PATTERN__ECLASS = eINSTANCE.getTargetPattern_EClass();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PATTERN__FEATURES = eINSTANCE.getTargetPattern_Features();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.FeaturePatternImpl <em>Feature Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.FeaturePatternImpl
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getFeaturePattern()
		 * @generated
		 */
		EClass FEATURE_PATTERN = eINSTANCE.getFeaturePattern();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_PATTERN__FEATURE = eINSTANCE.getFeaturePattern_Feature();

		/**
		 * The meta object literal for the '<em><b>Closure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_PATTERN__CLOSURE = eINSTANCE.getFeaturePattern_Closure();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheType <em>Cache Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheType
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getCacheType()
		 * @generated
		 */
		EEnum CACHE_TYPE = eINSTANCE.getCacheType();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.RefType <em>Ref Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.RefType
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getRefType()
		 * @generated
		 */
		EEnum REF_TYPE = eINSTANCE.getRefType();

		/**
		 * The meta object literal for the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Moment <em>Moment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Moment
		 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingPackageImpl#getMoment()
		 * @generated
		 */
		EEnum MOMENT = eINSTANCE.getMoment();

	}

} //PrefetchingPackage
