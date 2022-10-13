package pl.sdacademy.SpringBootRO40.validation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonController {

    @PostMapping("/createPerson")
    public String createPerson(@Valid @RequestBody Person person) {
        return person.toString();
    }

}
