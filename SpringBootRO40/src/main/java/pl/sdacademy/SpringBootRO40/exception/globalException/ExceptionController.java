package pl.sdacademy.SpringBootRO40.exception.globalException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @GetMapping("/boom")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void boom() {
        throw new AruncarePachete("The package has dropped!!");
    }
}
