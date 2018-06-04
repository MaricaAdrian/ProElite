import java.io.*;

public class writer {

	public String Text = "";
	public String File;
	exceptionWrite newExc=new exceptionWrite("No words have been writed to file.");
	
	
	writer(String File, String Text) throws IOException, exceptionWrite{
		this.File = File;
		this.Text = Text;
		writerBuffer(this.File, this.Text);
	}
	
	public void writerBuffer(String File, String Text) throws IOException, exceptionWrite  {
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
