package fr.inria.atlanmod.neoemf.ui;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingFactory;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern;

public class PrefetchingLazyLinker extends LazyLinker {
	
	@Override
	protected void afterModelLinked(EObject model,
			IDiagnosticConsumer diagnosticsConsumer) {
		super.afterModelLinked(model, diagnosticsConsumer);
		EPackage ePackage = null;
		Iterator<EObject> it = model.eAllContents();
		while(it.hasNext()) {
			EObject e = it.next();
			if(e instanceof MetamodelImport) {
				MetamodelImport mi = (MetamodelImport)e;
				String packageURI = mi.getNsURI();
				ePackage = EPackage.Registry.INSTANCE.getEPackage(packageURI);
			}
			if(e instanceof SourcePattern) {
				SourcePattern sp = (SourcePattern)e;
				if(ePackage != null) {
					String classifierString = sp.getPattern();
					sp.setEClass((EClass)ePackage.getEClassifier(classifierString));
				}
			}
			if(e instanceof TargetPattern) {
				TargetPattern tp = (TargetPattern)e;
				if(ePackage != null) {
					String[] splittedPattern = tp.getPattern().split("\\.");
					if(splittedPattern.length > 0) {
						EClass eClass = null;
						if(splittedPattern[0].equals("self")) {
							EObject container = tp.eContainer();
							if(container instanceof AccessRule) {
								System.out.println("Self access rule");
								EClass sourceClass = ((AccessRule)tp.eContainer()).getSourcePattern().getEClass();
								if(sourceClass == null) {
									System.out.println("null source class");
									eClass = ((EClass)ePackage.getEClassifier(((AccessRule)tp.eContainer()).getSourcePattern().getPattern()));
									System.out.println("computed " + eClass.getName());
								}
								else {
									System.out.println("not null source class : " + sourceClass.getName());
									eClass = (sourceClass);
								}
							}
							else {
								System.out.println("not in access rule ");
								eClass = (EClass)ePackage.getEClassifier(splittedPattern[0]);
								System.out.println("computed " + eClass.getName());
							}
							
						}
						else {
							System.out.println("not self : ");
							eClass = (EClass)ePackage.getEClassifier(splittedPattern[0]);
						}
						if(eClass == null) continue;
						tp.setEClass(eClass);
						if(splittedPattern.length > 1) {
							for(int i = 1; i < splittedPattern.length; i++) {
								String currentPattern = splittedPattern[i];
								FeaturePattern featurePattern =  PrefetchingFactory.eINSTANCE.createFeaturePattern();
								if(currentPattern.contains("*")) {
									currentPattern = currentPattern.substring(0,currentPattern.length()-1);
									featurePattern.setClosure(true);
								}
								EStructuralFeature feature = eClass.getEStructuralFeature(currentPattern);
								if(feature == null) break;
								featurePattern.setFeature(feature);
								tp.getFeatures().add(featurePattern);
								eClass = (EClass)feature.getEType();
							}
						}
					}
				}
			}
		}
	}
}
