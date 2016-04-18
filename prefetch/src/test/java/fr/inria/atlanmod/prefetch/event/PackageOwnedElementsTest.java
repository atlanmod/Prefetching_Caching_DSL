package fr.inria.atlanmod.prefetch.event;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.Package;
import org.junit.Test;

import fr.inria.atlanmod.prefetch.cache.EMFCacheKey;

public class PackageOwnedElementsTest extends AbstractEventAPITest {
	
	@Override
	protected void loadScript() {
		pCore.loadPrefetchScript(URI.createURI(resourceFolderPath + "packageOwnedElements.prefetch.bin"));
	}
	
	@Test
	public void testSendAccessEvent() {
		Model model = (Model)r.getContents().get(0);
		Package fr = model.getOwnedElements().get(0);
		Package inria = fr.getOwnedPackages().get(0);
		Package atlanmod = inria.getOwnedPackages().get(0);
		Package kyanos = atlanmod.getOwnedPackages().get(0);
		Package tests = kyanos.getOwnedPackages().get(0);
		assert tests.getName().equals("tests") : "Package 'tests' expected but found '" + tests.getName() + "'";
		eventAPI.accessEvent(tests);
		
		synchronized (this) {
			try {
				wait(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		List<EObject> cachedResult = (List<EObject>) cache.get(new EMFCacheKey(
				r.getURIFragment(tests), jPackage
						.getPackage_OwnedElements()));
		
		int ownedElementsCount = tests.getOwnedElements().size();
		assert !cachedResult.isEmpty();
		assert cachedResult.size() == ownedElementsCount : "Expected " + ownedElementsCount + " values in cache but found " + cachedResult.size();;
		for(int i = 0; i < ownedElementsCount; i++) {
			AbstractTypeDeclaration oe = (AbstractTypeDeclaration)tests.getOwnedElements().get(i);
			assert cachedResult.get(i).equals(oe) : "Expected " + oe.getName() + " AbstractTypeDeclaration but found " + ((AbstractTypeDeclaration)cachedResult.get(i)).getName();
		}
	}

}
