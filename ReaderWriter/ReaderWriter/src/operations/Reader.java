package operations;
import java.io.*;

import exceptions.ExceptionRead;


public class Reader  {

	public String File;
	public String Text = "";
	public String Line;
	ExceptionRead newExc = new ExceptionRead("No lines were read from file.");
	
	
	
	/**
	 * Constructor of our reader class
	 * @param File Location of the file from where the text will be read
	 */
	public Reader(String File) throws IOException, ExceptionRead {
		this.File = File;
		readerBuffer(this.File);

	}

	/**
	 * Method that reads from file and put's the text into our class member Text
	 * @param File Location of the file from where the text will be read
	 */
	public void readerBuffer(String File) throws IOException, ExceptionRead {
		int counter = 0;

		FileReader fileReader = new FileReader(File);

		BufferedReader bufferedReader = new BufferedReader(fileReader);

		while((Line = bufferedReader.readLine()) != null) {
			this.Text += Line;
			counter++;
		}   

		if(counter == 0)
			throw newExc;

		bufferedReader.close();     
	}

	public String getText() {
		return this.Text;
	}
}
