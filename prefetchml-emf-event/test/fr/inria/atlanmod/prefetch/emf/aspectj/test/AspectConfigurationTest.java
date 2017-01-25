package fr.inria.atlanmod.prefetch.emf.aspectj.test;

import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.JavaPackage;
import org.junit.Test;

import fr.inria.atlanmod.prefetch.emf.aspectj.runtime.EMFPrefetcherRuntime;
import fr.inria.atlanmod.prefetchml.core.PrefetchCore;

public class AspectConfigurationTest {

//	protected PrefetchCore pCore;
//	protected String resourceFolderPath = "";
//	
//	protected JavaPackage jPackage = JavaPackage.eINSTANCE;
//	
//	protected Resource r;
//	
//	@Test
//	public void test() throws Exception {
//		Registry.INSTANCE.put(jPackage.getNsURI(), jPackage);
//		// Load the test model
//		ResourceSet rSet = new ResourceSetImpl();
//		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
//		r = rSet.createResource(URI.createURI(resourceFolderPath+"sample.xmi"));
//		r.load(Collections.EMPTY_MAP);
//		EMFPrefetcherRuntime runtime = new EMFPrefetcherRuntime(r);
//		runtime.loadPrefetchScript(URI.createURI("packageOwnedElements.prefetch.bin"),r);
//		EObject m = r.getContents().get(0);
//		System.out.println("EGet");
//		Object result = m.eGet(jPackage.getModel_OwnedElements());
//		System.out.println("PEget");
//		((EList<EObject>)result).get(0).eGet(jPackage.getPackage_OwnedElements());
//		synchronized (this) {
//			wait(1000000);
//		}
////		System.out.println(pCore.getActiveCache().toString());
////		System.out.println("test : " + result);
//		
//		// Load the pScript
////		runtime.loadPrefetchScript(prefetchScriptURI);
//	}
	

}
