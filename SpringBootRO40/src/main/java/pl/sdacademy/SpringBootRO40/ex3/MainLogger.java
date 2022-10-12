package pl.sdacademy.SpringBootRO40.ex3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Primary
public class MainLogger implements DummyLoggerInterface {
    @Override
    public void sayHello() {
      log.info("MainLogger");
    }
}
