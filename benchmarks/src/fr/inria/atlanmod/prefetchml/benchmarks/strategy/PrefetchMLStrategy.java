package fr.inria.atlanmod.prefetchml.benchmarks.strategy;

import java.util.List;

import javax.annotation.Nullable;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.Query;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractPrefetchMLTest;
import fr.inria.atlanmod.prefetchml.benchmarks.util.QueryExecutorUtil;

/**
 * Provides the methods needed to implement a prefetching/caching strategy to
 * use in the benchmarks.
 * <p>
 * This interface is used in {@link AbstractPrefetchMLTest} to tune the query
 * computation by enabling a specific prefetching/caching strategy.
 * 
 * @see AbstractPrefetchMLTest
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public interface PrefetchMLStrategy {

    /**
     * Returns the name of the strategy.
     * <p>
     * This name is used in {@link AbstractPrefetchMLTest} to instantiate a new
     * database per strategy, in order to avoid result corruption by caches and
     * memory-mapped buffers that remains in memory after database shutdown.
     * 
     * @return the name of the strategy
     */
    public String getName();
    
    /**
     * Initialize the strategy.
     * <p>
     * <b>Note:</b> this method is called after the execution of
     * {@link AbstractPrefetchMLTest#setUp()}. Provided {@code resource} is
     * loaded and can be manipulated by the strategy.
     * 
     * @param resource
     *            the benchmarked resource
     * @param scriptURI
     *            the URI of the PrefetchML script to use
     * 
     * @throws Exception
     *             if the strategy cannot be initialized
     */
    public void init(Resource resource, @Nullable URI scriptURI) throws Exception;

    /**
     * A hook that enables subclasses to add query monitoring computation before
     * executing the OCL {@link Query}.
     * <p>
     * <b>Note:</b> this method is executed at the beginning of the query
     * computation (before {@link QueryExecutorUtil#startTimer()}).
     */
    public void beforeExecutingQueries();

    /**
     * A hook that enables subclasses to add query monitoring computation after
     * executing the OCL {@link Query}.
     * <p>
     * <b>Note:</b> this method is executed at the end of the query (after
     * {@link QueryExecutorUtil#stopTimer()}).
     */
    public void afterExecutingQueries();

    /**
     * A hook that enables subclasses to adapt the input element {@link List} to
     * evaluate in the OCL {@link Query}.
     * <p>
     * <b>Note:</b> this method is executed after
     * {@link #beforeExecutingQuery()}
     * 
     * @param input
     *            the input element {@link List} to adapt
     * @return a {@link List} containing the adapted elements
     */
    public List<List<?>> adaptInput(List<List<?>> input);

    /**
     * A hook that enables subclasses to adapt the result of the OCL
     * {@link Query}.
     * <p>
     * <b>Note:</b> this method is executed after {@link #afterExecutingQuery()}.
     * 
     * @param result
     *            the result of the OCL {@link Query} to adapt
     * @return a {@link List} containing the adapted elements
     */
    public List<List<Object>> adaptResult(List<List<Object>> result);
}
