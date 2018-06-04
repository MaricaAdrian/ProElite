import java.io.*;



public class reader  {

	public String File;
	public String Text = "";
	public String Line;
	exceptionRead newExc = new exceptionRead("No lines were read from file.");
	reader(String File) throws IOException, exceptionRead {
		this.File = File;
		readerBuffer(this.File);
		
	}
	
	public void readerBuffer(String File) throws IOException, exceptionRead {
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
