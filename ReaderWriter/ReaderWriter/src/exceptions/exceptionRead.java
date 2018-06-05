package exceptions;


public class exceptionRead extends Exception {

	/*
	 * Constructor of our exception for reader class
	 * @param message used to tell the exception message
	 */
    public exceptionRead(String message) {
        super(message);
    }
    
    /*
	 * Constructor of our exception for reader class
	 * @param message used to tell the exception message
	 * @param throwable throwable object
	 */
    public exceptionRead(String message, Throwable throwable) {
        super(message, throwable);
    }
    
    /*
	 * Method that returns the string that was writed in super
	 * @return String of our exception class
	 */
    public String getMessage()
    {
        return super.getMessage();
    }

}