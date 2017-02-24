package fr.inria.atlanmod.prefetchml.benchmarks.strategy;

import java.text.MessageFormat;

public class PrefetchMLStrategyFactory {

    public static PrefetchMLStrategy createStrategy(String strategyName) {
        switch(strategyName) {
        case DefaultPrefetchMLStrategy.NAME:
            return new DefaultPrefetchMLStrategy();
        case NeoEMFPrefetchMLStrategy.NAME:
            return new NeoEMFPrefetchMLStrategy();
        case CDOPrefetchMLStrategy.NAME:
            return new CDOPrefetchMLStrategy();
        default:
            throw new IllegalArgumentException(MessageFormat.format("Unknown strategy name {0}",
                    strategyName));
        }
    }
    
}
