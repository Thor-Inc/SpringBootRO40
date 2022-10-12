package pl.sdacademy.SpringBootRO40.ex3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Logger {
    public void sayHello() {
        log.info("hello from Logger !!");
    }
}