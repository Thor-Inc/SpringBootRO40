package pl.sdacademy.SpringBootRO40.exception.globalException;

public class SdaException extends RuntimeException {
  public SdaException(final String message) {
    super(message);
  }
}