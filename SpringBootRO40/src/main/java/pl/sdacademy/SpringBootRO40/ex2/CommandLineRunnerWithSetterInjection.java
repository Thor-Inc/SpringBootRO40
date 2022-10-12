package pl.sdacademy.SpringBootRO40.ex2;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CommandLineRunnerWithSetterInjection implements CommandLineRunner {

    private Logger dummyLogger;

    @Override
    public void run(final String... args) throws Exception {
       log.info("from setter");
        dummyLogger.sayHello();
    }

    @Autowired
    public void setLogger(final Logger logger) {
        this.dummyLogger = logger;
    }
}