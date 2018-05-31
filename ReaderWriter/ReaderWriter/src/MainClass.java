import java.io.*;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.util.Scanner;

public class MainClass {
	  public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
		  Scanner scanner = new Scanner(System.in);
		  String start_tag = "";
		  String end_tag =  "";
		  String Text;

		  reader bufferR = new reader("D:\\ProElite - Marica Adrian-Gabriel\\ReaderWriter\\ReaderWriter\\textcitire.txt");
		  Text = bufferR.getText();
		 
		  start_tag = scanner.nextLine();
		  end_tag = scanner.nextLine();
		
		         
		       


		  Text = Text.replace(start_tag, "");
		  Text = Text.replace(end_tag, "\n");
		  
		  System.out.println(Text);
		  
		//  xmlParser xmlText = new xmlParser("D:\\ProElite - Marica Adrian-Gabriel\\ReaderWriter\\ReaderWriter\\textcitire.xml");
		//  System.out.println("\n~PRINTING XML FILE~\n");
		// System.out.println(xmlText.getString());
		  
		  
		  //System.out.println(Text);
		  @SuppressWarnings("unused")
		  writer bufferW = new writer("D:\\ProElite - Marica Adrian-Gabriel\\ReaderWriter\\ReaderWriter\\textscriere.txt", bufferR.Text);
		
	  }
}
