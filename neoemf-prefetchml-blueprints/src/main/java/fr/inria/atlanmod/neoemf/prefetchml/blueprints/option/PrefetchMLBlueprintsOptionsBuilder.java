package fr.inria.atlanmod.neoemf.prefetchml.blueprints.option;

import javax.annotation.Nonnull;

import fr.inria.atlanmod.neoemf.data.blueprints.option.AbstractBlueprintsOptionsBuilder;

public class PrefetchMLBlueprintsOptionsBuilder extends AbstractBlueprintsOptionsBuilder<PrefetchMLBlueprintsOptionsBuilder, PrefetchMLBlueprintsOptions> {

    /**
    * Constructs a new {@code PrefetchingBlueprintsOptionsBuilder} and sets the store option to
    * {@link PrefetchMLBlueprintsStoreOptions#PREFETCHML}.
    *
    * @note This constructor is protected for API consistency purpose, to create a new builder use {@link
    * #newBuilder()}
    */
    protected PrefetchMLBlueprintsOptionsBuilder() {
        super();
        storeOption(PrefetchMLBlueprintsStoreOptions.PREFETCHML);
    }
    
    /**
     * Constructs a new {@code PrefetchingBlueprintsOptionsBuilder} instance.
     *
     * @return a new builder
     */
    @Nonnull
    public static PrefetchMLBlueprintsOptionsBuilder newBuilder() {
        return new PrefetchMLBlueprintsOptionsBuilder();
    }
    
}
