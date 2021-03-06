import java.io.*;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import exceptions.ExceptionRead;
import exceptions.ExceptionWrite;
import operations.Reader;
import operations.Writer;
import operations.XMLParserDOM;
import operations.XMLParserSax;

import java.util.Scanner;

public class MainClass {
	/**
	 * Main method of our program
	 * @param args Array of strings in case of errors or passing text from outer sources
	 */
	  public static void main(String[] args) {
		  //Scanner for reading text from the console
		 // Scanner scanner = new Scanner(System.in);
		//  String start_tag = "";
		 // String end_tag =  "";
		 
		  String Text;  //String that helps us show or debug the text that was writed or read from a file.

		  Reader bufferR; //Creates an object for the class reader, used to read from file
		try {
			
			bufferR = new Reader("D:\\ProElite - Marica Adrian-Gabriel\\ReaderWriter\\ReaderWriter\\textcitire.txt"); //Reads the text from file
			Text = bufferR.getText(); //Saves the text read to our variable Text
			
			try {
				//bufferR.Text = "";
				Writer bufferW = new Writer("D:\\ProElite - Marica Adrian-Gabriel\\ReaderWriter\\ReaderWriter\\textscriere.txt", bufferR.Text); //Writes the text to file
			
			} catch (IOException | ExceptionWrite e) {
				System.out.println(e.getMessage());
			}
			
		} catch (IOException | ExceptionRead e) {
			System.out.println(e.getMessage());
		}
		 
		 
		 /* start_tag = scanner.nextLine();
		    end_tag = scanner.nextLine();
		 */
		         
		       


		  //Text = Text.replace(start_tag, "");
		 // Text = Text.replace(end_tag, "\n");
		  
		 // System.out.println(Text);
		  
		 
		try {
			  
			XMLParserDOM xmlText = new XMLParserDOM("D:\\ProElite - Marica Adrian-Gabriel\\ReaderWriter\\ReaderWriter\\textcitire.xml"); //Reads the xml code from the given file
			System.out.println("\n~PRINTING XML DOM FILE~\n"); //Prints to console a message announcing that we are going to print the xml content from the file
			System.out.println(xmlText.getString());
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		} 
		
		try {

			XMLParserSax xmlText = new XMLParserSax("D:\\ProElite - Marica Adrian-Gabriel\\ReaderWriter\\ReaderWriter\\textcitire.xml"); //Reads the xml code from the given file
			System.out.println("\n~PRINTING XML SAX FILE~\n"); //Prints to console a message announcing that we are going to print the xml content from the file
			System.out.println(xmlText.getString());
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}
  
		

		
		
	  }
}
