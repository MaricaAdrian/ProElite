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
import org.w3c.dom.NamedNodeMap;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;


public class XMLParserDOM {

	public String fileName;
	public String xmlParsed;
	public String text;


	/**
	 * Constructor of our xmlParser class, calls toString method
	 * @param fileName file from where the xml code will be read
	 * 
	 */
	public XMLParserDOM(String fileName) {

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

		String st= ""; 

		try {
			String firstTag;
			File inputFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getChildNodes();

			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;

					NamedNodeMap attribute = eElement.getAttributes();
					System.out.println("Main attributes: ");
					for(int count = 0; count < attribute.getLength(); count++) {
						System.out.println(attribute.item(count));
					}


					NodeList nodeList = eElement.getChildNodes();
					for(int i = 0; i < nodeList.getLength(); i++) {
						Node cNode = nodeList.item(i);
						if(cNode.getNodeType() == Node.ELEMENT_NODE){
							Element element = (Element) cNode;


							NamedNodeMap cAttribute = cNode.getAttributes();

							for(int j = 0; j < cAttribute.getLength(); j++) {

								if(cNode.getTextContent() != "") {
									st += "Attribute: " + cAttribute.item(j) + "";
									st += cNode.getTextContent();
									st += "\n";
								}

							}

						}
					}
					//st += eElement.getElementsByTagName(subElement).item(0).getTextContent() + "\n"; 

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}


		return st;

	} 

	/**
	 * Method that get's the xml string from our class and returns the parsed xml string
	 * @return The string that has been read from XML (without it's attributes)
	 */
	public String getString() throws SAXException, IOException, ParserConfigurationException {
		
		this.text = this.xmlParsed;

		return this.text;
	}

}
