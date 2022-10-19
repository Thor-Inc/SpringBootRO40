package pl.sdacademy.SpringBootRO40.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/hi")
    public String sayHello() {
        return "hello";
    }
}