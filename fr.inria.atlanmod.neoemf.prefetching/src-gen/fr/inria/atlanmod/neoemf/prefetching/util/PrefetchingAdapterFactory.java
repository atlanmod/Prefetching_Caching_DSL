/**
 */
package fr.inria.atlanmod.neoemf.prefetching.util;

import fr.inria.atlanmod.neoemf.prefetching.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage
 * @generated
 */
public class PrefetchingAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PrefetchingPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefetchingAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PrefetchingPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrefetchingSwitch<Adapter> modelSwitch =
    new PrefetchingSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseCache(Cache object)
      {
        return createCacheAdapter();
      }
      @Override
      public Adapter caseCacheProperties(CacheProperties object)
      {
        return createCachePropertiesAdapter();
      }
      @Override
      public Adapter casePlan(Plan object)
      {
        return createPlanAdapter();
      }
      @Override
      public Adapter caseAfterRule(AfterRule object)
      {
        return createAfterRuleAdapter();
      }
      @Override
      public Adapter casePrefetchingRule(PrefetchingRule object)
      {
        return createPrefetchingRuleAdapter();
      }
      @Override
      public Adapter caseSourcePattern(SourcePattern object)
      {
        return createSourcePatternAdapter();
      }
      @Override
      public Adapter caseFilterPattern(FilterPattern object)
      {
        return createFilterPatternAdapter();
      }
      @Override
      public Adapter caseTargetPattern(TargetPattern object)
      {
        return createTargetPatternAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.neoemf.prefetching.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.Cache <em>Cache</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.neoemf.prefetching.Cache
   * @generated
   */
  public Adapter createCacheAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.CacheProperties <em>Cache Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.neoemf.prefetching.CacheProperties
   * @generated
   */
  public Adapter createCachePropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.Plan <em>Plan</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.neoemf.prefetching.Plan
   * @generated
   */
  public Adapter createPlanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.AfterRule <em>After Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.neoemf.prefetching.AfterRule
   * @generated
   */
  public Adapter createAfterRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule
   * @generated
   */
  public Adapter createPrefetchingRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.SourcePattern <em>Source Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.neoemf.prefetching.SourcePattern
   * @generated
   */
  public Adapter createSourcePatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.FilterPattern <em>Filter Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.neoemf.prefetching.FilterPattern
   * @generated
   */
  public Adapter createFilterPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.TargetPattern <em>Target Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.neoemf.prefetching.TargetPattern
   * @generated
   */
  public Adapter createTargetPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PrefetchingAdapterFactory
