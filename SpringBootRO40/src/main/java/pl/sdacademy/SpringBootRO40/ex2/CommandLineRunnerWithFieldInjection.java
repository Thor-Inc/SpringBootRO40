package pl.sdacademy.SpringBootRO40.ex2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CommandLineRunnerWithFieldInjection implements CommandLineRunner {

    @Autowired
    private Logger dummyLogger;

    @Override
    public void run(final String... args) throws Exception {
        log.info("from field");
        dummyLogger.sayHello();
    }
}
