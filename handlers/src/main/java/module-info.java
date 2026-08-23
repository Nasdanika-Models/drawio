import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.drawio.handlers.DrawioToEcoreArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.drawio.handlers.DrawioToEcoreResourceContentsHandlerCapabilityFactory;

module org.nasdanika.models.drawio.handlers {
	
	exports org.nasdanika.models.drawio.handlers;
	opens org.nasdanika.models.drawio.handlers to org.nasdanika.common; // For transformer
		
	requires transitive org.nasdanika.models.drawio;
	requires org.apache.commons.lang3;
	requires org.eclipse.emf.ecore;
	
	provides CapabilityFactory with 
		DrawioToEcoreArrayResourceContentsHandlerCapabilityFactory,
		DrawioToEcoreResourceContentsHandlerCapabilityFactory;
	
}