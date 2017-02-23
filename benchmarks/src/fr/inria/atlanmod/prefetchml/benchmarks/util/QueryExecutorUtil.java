package fr.inria.atlanmod.prefetchml.benchmarks.util;

import java.util.Collection;

public class QueryExecutorUtil {

    private static long startTimestamp;
    private static long stopTimestamp;
    
    /**
     * Compute the size of a {@link Collection} which can contain other
     * {@link Collection}s
     * <p>
     * This method is used to compute the size of MDT OCL query results when the
     * query is evaluated on an input {@link Collection}.
     * 
     * @param collection
     *            the {@link Collection} to compute the size of
     * @return the number of raw elements in the {@link Collection}
     * TODO put it in a TestUtil class
     */
    public static int getFlattenedSize(Collection<?> collection) {
        int size = 0;
        for (Object o : collection) {
            if (o instanceof Collection) {
                size += getFlattenedSize((Collection<?>) o);
            } else {
                size++;
            }
        }
        return size;
    }
    
    /**
     * Starts the timer to monitor query execution.
     */
    public static void startTimer() {
        startTimestamp = System.currentTimeMillis();
    }
    
    /**
     * Stop the timer to monitor query execution.
     */
    public static void stopTimer() {
        stopTimestamp = System.currentTimeMillis();
    }
    
    /**
     * Returns the elapsed time between {@link #startTimer()} and {@link #stopTimer()}.
     * @return the elapsed time between {@link #startTimer()} and {@link #stopTimer()}.
     */
    public static long getElapsedTime() {
        return stopTimestamp - startTimestamp;
    }
}
