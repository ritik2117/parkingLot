package exceptions;

public class NoParkingSpotsAvailableException extends Exception {
    public NoParkingSpotsAvailableException() {
        super("No parking spots are left in this parking lot.");
    }
}
