package pl.sdacademy.SpringBootRO40.ex2;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {


    private Logger dummyLogger;

    @Override
    public void run(final String... args) throws Exception {
        log.info("from constructor");
        dummyLogger.sayHello();
    }

    @Autowired
    public CommandLineRunnerWithConstructorInjection(Logger logger) {
        this.dummyLogger = logger;
    }
}