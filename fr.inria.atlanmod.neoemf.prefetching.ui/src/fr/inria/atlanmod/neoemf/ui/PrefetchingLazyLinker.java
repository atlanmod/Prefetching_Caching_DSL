package fr.inria.atlanmod.neoemf.ui;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule;

public class PrefetchingLazyLinker extends LazyLinker {
	@Override
	protected void afterModelLinked(EObject model,
			IDiagnosticConsumer diagnosticsConsumer) {
		super.afterModelLinked(model, diagnosticsConsumer);
		Iterator<EObject> it = model.eAllContents();
		while(it.hasNext()) {
			EObject e = it.next();
			if(e instanceof PrefetchingRule) {
				PrefetchingRule pr = (PrefetchingRule)e;
				if(pr.getProbability() == 0) {
					pr.setProbability(100);
				}
			}
		}
	}
}
