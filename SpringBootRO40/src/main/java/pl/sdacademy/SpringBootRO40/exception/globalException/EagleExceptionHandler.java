package pl.sdacademy.SpringBootRO40.exception.globalException;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EagleExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(AruncarePachete.class)
    public java.lang.Error prindePachete(AruncarePachete pachete) {
        return new java.lang.Error(pachete.getMessage());
    }

}
