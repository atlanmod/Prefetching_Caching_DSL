package fr.inria.atlanmod.neoemf.ui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern;

public class PrefetchingEObjectDocumentationProvider implements
		IEObjectDocumentationProvider {

	public String getDocumentation(EObject o) {
		if(o instanceof SourcePattern) {
			SourcePattern sp = (SourcePattern)o;
			EClass spEClass = sp.getEClass();
			String packageURI = spEClass.getEPackage().getNsURI();
			return "Source EClass: " + spEClass.getName() + " (" + packageURI + ")";
		}
		if(o instanceof TargetPattern) {
			TargetPattern tp = (TargetPattern)o;
			EClass tpEClass = tp.getEClass();
			EClass currentEClass = tpEClass;
			String packageURI = tpEClass.getEPackage().getNsURI();
			String[] splittedPattern = tp.getPattern().split("\\.");
			StringBuilder sb = new StringBuilder();
			sb.append("Target base EClass: ")
				.append(tpEClass.getName())
				.append(" (")
				.append(packageURI)
				.append(")<br/>");
			if(splittedPattern.length > 1) {
				for(int i = 1; i < splittedPattern.length; i++) {
					for(EReference ref : currentEClass.getEAllReferences()) {
						if(ref.getName().equals(splittedPattern[i])) {
							currentEClass = (EClass)ref.getEType();
							sb.append("Reference navigation '")
								.append(ref.getName())
								.append("' EClass: ")
								.append(currentEClass.getName())
								.append(" (")
								.append(currentEClass.getEPackage().getNsURI())
								.append(")<br/>");
							break;
						}
					}
				}
			}
			return sb.toString();
		}
		return "this is a pouet pouet tooltip";
	}

}
