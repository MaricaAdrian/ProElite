package exceptions;


public class exceptionWrite extends Exception {

	/**
	 * Constructor of our exception for writer class
	 * @param message used to tell the exception message
	 */
    public exceptionWrite(String message) {
        super(message);
    }

    /**
	 * Constructor of our exception for writer class
	 * @param message used to tell the exception message
	 * @param throwable throwable object
	 */
    public exceptionWrite(String message, Throwable throwable) {
        super(message, throwable);
    }
    
    /**
	 * Method that returns the string that was writed in super
	 * @return String of our exception class
	 */
    public String getMessage()
    {
        return super.getMessage();
    }

}