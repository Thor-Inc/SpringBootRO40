package pl.sdacademy.SpringBootRO40.ex6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sdacademy.SpringBootRO40.thymeleaf.OrderForm;

import javax.validation.Valid;

@Controller
public class PersonController {

    @GetMapping("/createPerson")
    public String createPerson(final ModelMap modelMap) {
        PersonForm personForm = new PersonForm();
        modelMap.addAttribute("personForm", personForm);
        modelMap.addAttribute("customAttributes", personForm.getCustomAttributes() );
        modelMap.addAttribute("values", personForm.getValues() );
        return "person";
    }

    @PostMapping("/createPerson")
    public String createPerson(@Valid @ModelAttribute("personForm") final PersonForm personForm, final Errors errors) {
        if (errors.hasErrors()) {
            return "person";
        }

        return "welcome";
    }
}
