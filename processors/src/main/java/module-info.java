module org.nasdanika.models.drawio.processors {
		
	requires transitive org.nasdanika.drawio.model;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.drawio.processors;
	opens org.nasdanika.models.drawio.processors; // For loading resources
	
}
