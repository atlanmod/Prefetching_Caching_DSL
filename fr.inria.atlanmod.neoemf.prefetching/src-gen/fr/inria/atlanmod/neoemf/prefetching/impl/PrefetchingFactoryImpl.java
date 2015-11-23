/**
 */
package fr.inria.atlanmod.neoemf.prefetching.impl;

import fr.inria.atlanmod.neoemf.prefetching.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrefetchingFactoryImpl extends EFactoryImpl implements PrefetchingFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PrefetchingFactory init()
  {
    try
    {
      PrefetchingFactory thePrefetchingFactory = (PrefetchingFactory)EPackage.Registry.INSTANCE.getEFactory(PrefetchingPackage.eNS_URI);
      if (thePrefetchingFactory != null)
      {
        return thePrefetchingFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PrefetchingFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefetchingFactoryImpl()
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
      case PrefetchingPackage.MODEL: return createModel();
      case PrefetchingPackage.CACHE: return createCache();
      case PrefetchingPackage.CACHE_PROPERTIES: return createCacheProperties();
      case PrefetchingPackage.PLAN: return createPlan();
      case PrefetchingPackage.AFTER_RULE: return createAfterRule();
      case PrefetchingPackage.PREFETCHING_RULE: return createPrefetchingRule();
      case PrefetchingPackage.SOURCE_PATTERN: return createSourcePattern();
      case PrefetchingPackage.FILTER_PATTERN: return createFilterPattern();
      case PrefetchingPackage.TARGET_PATTERN: return createTargetPattern();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PrefetchingPackage.CACHE_TYPE:
        return createCacheTypeFromString(eDataType, initialValue);
      case PrefetchingPackage.REF_TYPE:
        return createRefTypeFromString(eDataType, initialValue);
      case PrefetchingPackage.MOMENT:
        return createMomentFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PrefetchingPackage.CACHE_TYPE:
        return convertCacheTypeToString(eDataType, instanceValue);
      case PrefetchingPackage.REF_TYPE:
        return convertRefTypeToString(eDataType, instanceValue);
      case PrefetchingPackage.MOMENT:
        return convertMomentToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cache createCache()
  {
    CacheImpl cache = new CacheImpl();
    return cache;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CacheProperties createCacheProperties()
  {
    CachePropertiesImpl cacheProperties = new CachePropertiesImpl();
    return cacheProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plan createPlan()
  {
    PlanImpl plan = new PlanImpl();
    return plan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterRule createAfterRule()
  {
    AfterRuleImpl afterRule = new AfterRuleImpl();
    return afterRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefetchingRule createPrefetchingRule()
  {
    PrefetchingRuleImpl prefetchingRule = new PrefetchingRuleImpl();
    return prefetchingRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourcePattern createSourcePattern()
  {
    SourcePatternImpl sourcePattern = new SourcePatternImpl();
    return sourcePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterPattern createFilterPattern()
  {
    FilterPatternImpl filterPattern = new FilterPatternImpl();
    return filterPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetPattern createTargetPattern()
  {
    TargetPatternImpl targetPattern = new TargetPatternImpl();
    return targetPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CacheType createCacheTypeFromString(EDataType eDataType, String initialValue)
  {
    CacheType result = CacheType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCacheTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType createRefTypeFromString(EDataType eDataType, String initialValue)
  {
    RefType result = RefType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRefTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Moment createMomentFromString(EDataType eDataType, String initialValue)
  {
    Moment result = Moment.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMomentToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefetchingPackage getPrefetchingPackage()
  {
    return (PrefetchingPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PrefetchingPackage getPackage()
  {
    return PrefetchingPackage.eINSTANCE;
  }

} //PrefetchingFactoryImpl
