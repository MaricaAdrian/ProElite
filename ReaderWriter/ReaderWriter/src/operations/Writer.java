package operations;
import java.io.*;

import exceptions.ExceptionWrite;

public class Writer {

	public String Text = "";
	public String File;
	ExceptionWrite newExc=new ExceptionWrite("No words have been writed to file.");
	
	/**
	 * Constructor of our writer class, takes the name of the file and calls the writer buffer
	 * @param File name of the file
	 * @param Text Text that will be writed to the file
	 */
	public Writer(String File, String Text) throws IOException, ExceptionWrite{
		this.File = File;
		this.Text = Text;
		writerBuffer(this.File, this.Text);
	}
	
	
	/**
	 * Writer Buffer, writes the text given to our file
	 * @param File file where the text will be write
	 * @param Text Text that will be writed to file
	 */
	public void writerBuffer(String File, String Text) throws IOException, ExceptionWrite  {
		FileWriter fileWriter = new FileWriter(File);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		String[] words = Text.split(";");
		for (String word: words) {
			bufferedWriter.write(word);
		    bufferedWriter.newLine();
		}
	
		
		
		if(words.length == 1)
			throw newExc;
		else 
			bufferedWriter.write("Numar de cuvinte:" + words.length);
	
		bufferedWriter.close();
		
	}
	
	
	
}
