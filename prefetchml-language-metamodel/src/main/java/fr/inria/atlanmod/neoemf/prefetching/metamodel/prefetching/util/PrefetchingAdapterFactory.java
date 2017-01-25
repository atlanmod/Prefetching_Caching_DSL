/**
 */
package fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.util;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage
 * @generated
 */
public class PrefetchingAdapterFactory extends AdapterFactoryImpl {
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
	public PrefetchingAdapterFactory() {
		if (modelPackage == null) {
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
		new PrefetchingSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseMetamodelImport(MetamodelImport object) {
				return createMetamodelImportAdapter();
			}
			@Override
			public Adapter caseCache(Cache object) {
				return createCacheAdapter();
			}
			@Override
			public Adapter caseCacheProperties(CacheProperties object) {
				return createCachePropertiesAdapter();
			}
			@Override
			public Adapter casePlan(Plan object) {
				return createPlanAdapter();
			}
			@Override
			public Adapter caseAfterClause(AfterClause object) {
				return createAfterClauseAdapter();
			}
			@Override
			public Adapter casePrefetchingRule(PrefetchingRule object) {
				return createPrefetchingRuleAdapter();
			}
			@Override
			public Adapter caseStartingRule(StartingRule object) {
				return createStartingRuleAdapter();
			}
			@Override
			public Adapter caseAccessRule(AccessRule object) {
				return createAccessRuleAdapter();
			}
			@Override
			public Adapter caseSourcePattern(SourcePattern object) {
				return createSourcePatternAdapter();
			}
			@Override
			public Adapter caseFilterPattern(FilterPattern object) {
				return createFilterPatternAdapter();
			}
			@Override
			public Adapter caseTargetPattern(TargetPattern object) {
				return createTargetPatternAdapter();
			}
			@Override
			public Adapter caseFeaturePattern(FeaturePattern object) {
				return createFeaturePatternAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport <em>Metamodel Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport
	 * @generated
	 */
	public Adapter createMetamodelImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Cache
	 * @generated
	 */
	public Adapter createCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties <em>Cache Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties
	 * @generated
	 */
	public Adapter createCachePropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan
	 * @generated
	 */
	public Adapter createPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AfterClause <em>After Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AfterClause
	 * @generated
	 */
	public Adapter createAfterClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule
	 * @generated
	 */
	public Adapter createPrefetchingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.StartingRule <em>Starting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.StartingRule
	 * @generated
	 */
	public Adapter createStartingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule <em>Access Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule
	 * @generated
	 */
	public Adapter createAccessRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern <em>Source Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern
	 * @generated
	 */
	public Adapter createSourcePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FilterPattern <em>Filter Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FilterPattern
	 * @generated
	 */
	public Adapter createFilterPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern <em>Target Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern
	 * @generated
	 */
	public Adapter createTargetPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern <em>Feature Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern
	 * @generated
	 */
	public Adapter createFeaturePatternAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PrefetchingAdapterFactory
