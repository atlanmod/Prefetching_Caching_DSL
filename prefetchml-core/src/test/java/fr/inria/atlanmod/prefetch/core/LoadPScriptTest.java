package fr.inria.atlanmod.prefetch.core;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.JavaPackage;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule;
import fr.inria.atlanmod.prefetch.processor.emf.EMFRuleProcessorFactory;

public class LoadPScriptTest {

	private PrefetchCore pCore;
	private String resourceFolderPath = "src/test/resources/";
	private RuleStore store;
	
	private JavaPackage jPackage = JavaPackage.eINSTANCE;
	
	@Before
	public void setUp() {
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource dummyResource = rSet.createResource(URI.createURI("dummy.xmi"));
		Registry.INSTANCE.put(jPackage.getNsURI(), jPackage);
		pCore = new PrefetchCore(dummyResource, new EMFRuleProcessorFactory());
		store = pCore.getRuleStore();
	}
	
	@Test
	public void testLoadPackageComments() {
		pCore.loadPrefetchScript(URI.createURI(resourceFolderPath + "packageComments.prefetch.bin"));
		// Consistency test (EClass not in the script)
		assert store.getARuleList(jPackage.getMethodDeclaration()).isEmpty();
		// Logic test (EClass in the target part of the rule)
		assert store.getARuleList(jPackage.getComment()).isEmpty();
		List<AccessRule> pRuleList = store.getARuleList(jPackage.getPackage());
		assert !pRuleList.isEmpty();
		assert pRuleList.size() == 1;
		AccessRule aRule = pRuleList.get(0);
		assert aRule.getName().equals("r2");
		assert aRule.getSourcePattern().getEClass().equals(jPackage.getPackage());
	}
	
	@Test
	public void testLoadMultipleRules() {
		pCore.loadPrefetchScript(URI.createURI(resourceFolderPath + "multipleRules.prefetch.bin"));
		assert store.getARuleList(jPackage.getMethodDeclaration()).isEmpty();
		
		List<AccessRule> packRuleList = store.getARuleList(jPackage.getPackage());
		assert !packRuleList.isEmpty();
		assert packRuleList.size() == 1;
		AccessRule packARule = packRuleList.get(0);
		assert packARule.getName().equals("r1");
		assert packARule.getSourcePattern().getEClass().equals(jPackage.getPackage());
		
		List<AccessRule> cdRuleList = store.getARuleList(jPackage.getClassDeclaration());
		assert !cdRuleList.isEmpty();
		assert cdRuleList.size() == 1;
		AccessRule cdARule = cdRuleList.get(0);
		assert cdARule.getName().equals("r2");
		assert cdARule.getSourcePattern().getEClass().equals(jPackage.getClassDeclaration());
		
		List<AccessRule> ifRuleList = store.getARuleList(jPackage.getIfStatement());
		assert !ifRuleList.isEmpty();
		assert ifRuleList.size() == 2;
		AccessRule ifARule1 = ifRuleList.get(0);
		AccessRule ifARule2 = ifRuleList.get(1);
		assert ifARule1.getName().equals("r3");
		assert ifARule1.getSourcePattern().getEClass().equals(jPackage.getIfStatement());
		assert ifARule2.getName().equals("r4");
		assert ifARule2.getSourcePattern().getEClass().equals(jPackage.getIfStatement());
	}
	
}
