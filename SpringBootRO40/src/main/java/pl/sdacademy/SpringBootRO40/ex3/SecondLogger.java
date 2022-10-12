package pl.sdacademy.SpringBootRO40.ex3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SecondLogger implements DummyLoggerInterface {
    @Override
    public void sayHello() {
      log.info("SecondLoader!! ");
    }
}
