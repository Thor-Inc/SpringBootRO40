package pl.sdacademy.SpringBootRO40.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    @Qualifier("EN")
    Hello helloService;

    public String sayHello(String name) {
        return helloService.sayHello(name);

    }
}
