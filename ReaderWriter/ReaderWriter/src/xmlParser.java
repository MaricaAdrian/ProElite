import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;


public class xmlParser {

	public String fileName;
	public String xmlParsed;
	public String text;
	
	xmlParser(String fileName) {
		
		this.fileName = fileName;
		this.xmlParsed = toString(this.fileName);
		
	}
	
	
	public static String toString(String fileName) 

	{ 

		String st=null; 

		try{ 
	
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance(); 
		
			InputSource is = new InputSource(fileName); 
		
			Document document = docBuilderFactory.newDocumentBuilder().parse(is); 
		
			StringWriter sw = new StringWriter(); 
		
			Transformer serializer = TransformerFactory.newInstance().newTransformer(); 
		
			serializer.transform(new DOMSource(document), new StreamResult(sw)); 
			
		
			st=sw.toString(); 
	
		} 
	
		catch (Exception e) { 
	
			
	
		} 

		return st;

	} 
	
	public String getString() throws SAXException, IOException, ParserConfigurationException {
		//Parse XML String 
		DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document parse = newDocumentBuilder.parse(new ByteArrayInputStream(this.xmlParsed.getBytes()));
		this.text = parse.getFirstChild().getTextContent();
		
		return this.text;
	}
	
}
