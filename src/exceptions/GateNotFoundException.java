package exceptions;

public class GateNotFoundException extends RuntimeException {

    public GateNotFoundException() {
        super("The gate is not found.");
    }
    public GateNotFoundException(String message) {
        super(message);
    }
}
