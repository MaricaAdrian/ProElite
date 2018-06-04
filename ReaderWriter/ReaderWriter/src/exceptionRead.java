

public class exceptionRead extends Exception {

    public exceptionRead(String message) {
        super(message);
    }

    public exceptionRead(String message, Throwable throwable) {
        super(message, throwable);
    }
    
    public String getMessage()
    {
        return super.getMessage();
    }

}