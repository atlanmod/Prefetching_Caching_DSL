package fr.inria.atlanmod.prefetchml.core.processor.emf;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.ecore.EObject;

import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

public class IDUtil {

    /**
     * Compute the URI Fragment associated to the given {@code eObject}.
     * @param eObject the {@link EObject} to compute the URI fragment from
     * @return the URI fragment
     */
    public static String getURIFragment(EObject eObject) {
        String sourceFragment = null;
        if(eObject instanceof CDOObject) {
            StringBuilder sb = new StringBuilder();
            CDOIDUtil.write(sb, ((CDOObject)eObject).cdoID());
            sourceFragment = sb.toString();
        }
        else {
            // Accessing eResource(), may be costly for some implementations
            sourceFragment = eObject.eResource().getURIFragment(eObject);
        }
        return sourceFragment;
    }
    
}
