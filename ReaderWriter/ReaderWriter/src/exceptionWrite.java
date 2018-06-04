

public class exceptionWrite extends Exception {

    public exceptionWrite(String message) {
        super(message);
    }

    public exceptionWrite(String message, Throwable throwable) {
        super(message, throwable);
    }
    
    public String getMessage()
    {
        return super.getMessage();
    }

}