package fr.inria.atlanmod.neoemf.ui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern;

public class PrefetchingEObjectHoverProvider extends
		DefaultEObjectHoverProvider {

	@Override
	protected String getFirstLine(EObject o) {
		if(o instanceof SourcePattern) {
			return "Source Pattern";
		}
		if(o instanceof TargetPattern) {
			return "Target Pattern";
		}
		return null;
	}
	
	@Override
	protected boolean hasHover(EObject o) {
		if(o instanceof SourcePattern) {
			SourcePattern sp = (SourcePattern)o;
			return sp.getEClass() != null;
		}
		if(o instanceof TargetPattern) {
			TargetPattern tp = (TargetPattern)o;
			return tp.getEClass() != null;
		}
		return super.hasHover(o);
	}	
	
}
