import java.io.*;



public class reader  {

	public String File;
	public String Text = "";
	public String Line;
	
	reader(String File) throws IOException {
		this.File = File;
		readerBuffer(this.File);
		
	}
	
	public void readerBuffer(String File) throws IOException {
		FileReader fileReader = new FileReader(File);
		
	    BufferedReader bufferedReader = new BufferedReader(fileReader);
	    
	    while((Line = bufferedReader.readLine()) != null) {
	        this.Text += Line;
	    }   
	   
	    bufferedReader.close();     
	}
	
	public String getText() {
		return this.Text;
	}
}
