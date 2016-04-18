package fr.inria.atlanmod.prefetch.event;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.Package;
import org.junit.Test;

import fr.inria.atlanmod.prefetch.cache.EMFCacheKey;

public class PackageOwnedPackagesTest extends AbstractEventAPITest {
	
	@Override
	protected void loadScript() {
		pCore.loadPrefetchScript(URI.createURI(resourceFolderPath + "packageOwnedPackages.prefetch.bin"));
	}
	
	@Test
	public void testSendAccessEvent() {
		Model model = (Model)r.getContents().get(0);
		EList<Package> modelPackages = model.getOwnedElements();
		org.eclipse.gmt.modisco.java.Package frPackage = modelPackages.get(0);
		eventAPI.accessEvent(frPackage);
		
		synchronized (this) {
			try {
				wait(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		List<EObject> cachedResult = (List<EObject>) cache.get(new EMFCacheKey(
				r.getURIFragment(frPackage), jPackage
						.getPackage_OwnedPackages()));
		assert !cachedResult.isEmpty();
		assert cachedResult.size() == 1;
		Package cachedPack = (Package)cachedResult.get(0);
		assert cachedPack.getName().equals("inria");
	}

}
