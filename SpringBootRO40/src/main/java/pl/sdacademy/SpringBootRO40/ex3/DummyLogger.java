package pl.sdacademy.SpringBootRO40.ex3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLogger implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("Hello from task1");
    }
}
