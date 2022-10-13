package pl.sdacademy.SpringBootRO40.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sdacademy.SpringBootRO40.validation.Person;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class HelloController {

    private static final String MODEL_HELLO_MESSAGE_ATTRIBUTE_NAME = "helloMsg";

    @GetMapping("/hello")
    public String showHello(final ModelMap modelMap) {
        modelMap.addAttribute(MODEL_HELLO_MESSAGE_ATTRIBUTE_NAME, "hello in thymeleaf from model map");
        modelMap.addAttribute("helloTitle", "hello in thymeleaf from model map");

        return "welcome";
    }
}