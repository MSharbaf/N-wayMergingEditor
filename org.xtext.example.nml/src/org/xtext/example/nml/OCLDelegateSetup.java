package org.xtext.example.nml ; 

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.scoping.PivotScoping;
import org.eclipse.ocl.xtext.base.scoping.BaseScoping;
import org.eclipse.ocl.xtext.completeocl.scoping.CompleteOCLScoping;
import org.eclipse.ocl.xtext.essentialocl.scoping.EssentialOCLScoping;

public class OCLDelegateSetup {
private Logger log = Logger.getLogger(getClass());	
	
	public void setResourceSet(ResourceSet resourceSet) {
		log.info("Setup OCL Delegates");
		OCLDelegateDomain.initialize(resourceSet);
			
		PivotScoping.init();
		BaseScoping.init();
		EssentialOCLScoping.init();
		CompleteOCLScoping.init();

		log.info("Setup OCL Delegates End");
	}

}
