import java.io.*;

public class writer {

	public String Text = "";
	public String File;
	
	writer(String File, String Text) throws IOException {
		this.File = File;
		this.Text = Text;
		writerBuffer(this.File, this.Text);
	}
	
	public void writerBuffer(String File, String Text) throws IOException {
		FileWriter fileWriter = new FileWriter(File);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		String[] words = Text.split(";");
		for (String word: words) {
			bufferedWriter.write(word);
		    bufferedWriter.newLine();
		}
		bufferedWriter.write("Numar de cuvinte:" + words.length);
		
	
		bufferedWriter.close();
	}
	
	
	
}
