import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.drawio.capability.DrawioArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.drawio.capability.DrawioEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.drawio.capability.DrawioResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.drawio.capability.DrawioResourceFactoryCapabilityFactory;

module org.nasdanika.models.drawio {
	
	exports org.nasdanika.models.drawio;
	exports org.nasdanika.models.drawio.impl;
	exports org.nasdanika.models.drawio.util;
	exports org.nasdanika.models.drawio.loader;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.presentation;
	requires transitive org.nasdanika.drawio;
		
	provides CapabilityFactory with 
		DrawioEPackageResourceSetCapabilityFactory,
		DrawioResourceFactoryCapabilityFactory,
		DrawioResourceContentsHandlerCapabilityFactory,
		DrawioArrayResourceContentsHandlerCapabilityFactory;
	
}