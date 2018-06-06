package operations;
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


public class XMLParserSax {

	public String fileName;
	public String xmlParsed;
	public String text;
	
	
	/**
	 * Constructor of our xmlParser class, calls toString method
	 * @param fileName file from where the xml code will be read
	 * 
	 */
	public XMLParserSax(String fileName) {
		
		this.fileName = fileName;
		this.xmlParsed = toString(this.fileName);
		
	}
	
	/**
	 * Reads xmlCode and transforms it to string
	 * @param fileName file from where the xml code will be read
	 * @return String that has been read from the xml file
	 */
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
	
	/**
	 * Method that get's the xml string from our class and returns the parsed xml string
	 * @return The string that has been read from XML (without it's attributes)
	 */
	public String getString() throws SAXException, IOException, ParserConfigurationException {
		//Parse XML String 
		DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document parse = newDocumentBuilder.parse(new ByteArrayInputStream(this.xmlParsed.getBytes()));
		this.text = parse.getFirstChild().getTextContent();
		
		return this.text;
	}
	
}
