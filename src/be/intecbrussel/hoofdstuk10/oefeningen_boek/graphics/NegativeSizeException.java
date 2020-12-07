package be.intecbrussel.hoofdstuk10.oefeningen_boek.graphics;

public class NegativeSizeException extends Exception {
    public NegativeSizeException() {
    }

    public NegativeSizeException(String message) {
        super(message);
    }

    public NegativeSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeSizeException(Throwable cause) {
        super(cause);
    }
}
