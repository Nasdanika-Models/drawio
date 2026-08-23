package org.nasdanika.models.drawio.capability;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.List;
import java.util.Map;

import org.nasdanika.capability.emf.ResourceEObjectContentsHandler;
import org.nasdanika.models.drawio.Document;

public class DrawioResourceContentsHandler implements ResourceEObjectContentsHandler<Document> {

	@Override
	public Order getOrder() {
		return Order.of(0);
	}

	@Override
	public Document load(InputStream inputStream, Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException("Loading Drawio documents is not supported yet.");
//		try (Reader reader = new InputStreamReader(inputStream)) {
//	        MutableDataSet parserOptions = new MutableDataSet();
//	        parserOptions.set(Parser.EXTENSIONS, List.of(AttributesExtension.create(), TablesExtension.create()));
//
//	        Parser parser = Parser.builder(parserOptions).build();
//
//	        com.vladsch.flexmark.util.ast.Document document = parser.parseReader(reader);
//	        Document ecoreDoc = MarkdownFactory.eINSTANCE.createDocument();
//	        new MarkdownVisitor(ecoreDoc).visit(document);
//			return ecoreDoc;			
//		}
	}	
	
	@Override
	public void save(Document document, OutputStream outputStream, Map<?, ?> options) throws IOException {
//		try (Writer writer = new OutputStreamWriter(outputStream)) {
//			writer.write(document.getContent()); // Simple writing back.
//		}
	}

}
