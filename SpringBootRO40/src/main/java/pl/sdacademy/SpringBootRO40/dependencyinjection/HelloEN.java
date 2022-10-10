package pl.sdacademy.SpringBootRO40.dependencyinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EN")
public class HelloEN implements Hello {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
