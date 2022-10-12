package pl.sdacademy.SpringBootRO40.exception.localException;

public class SdaException extends RuntimeException {
    public SdaException(final String message) {
        super(message);
    }
}