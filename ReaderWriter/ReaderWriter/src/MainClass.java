import java.io.*;


public class MainClass {
	  public static void main(String[] args) throws IOException {
		  String Text;
		  
		  reader bufferR = new reader("D:\\ProElite - Marica Adrian-Gabriel\\ReaderWriter\\textcitire.txt");
		  Text = bufferR.getText();
		  System.out.println(Text);
		  @SuppressWarnings("unused")
		  writer bufferW = new writer("D:\\ProElite - Marica Adrian-Gabriel\\ReaderWriter\\textscriere.txt", bufferR.Text);
		
	  }
}
