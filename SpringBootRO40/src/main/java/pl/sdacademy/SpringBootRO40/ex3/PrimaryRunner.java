package pl.sdacademy.SpringBootRO40.ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PrimaryRunner implements CommandLineRunner {

    @Autowired
    private MainLogger mainLogger;

    @Override
    public void run(String... args) throws Exception {
        mainLogger.sayHello();
    }
}
