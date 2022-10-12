package pl.sdacademy.SpringBootRO40.ex4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class UtilConfiguration {
 @Bean
 public DummyLogger dummyLogger(){
     return new DummyLogger();
 }
 @Bean
 public ListUtil listUtility(){
     return new ListUtil();
 }
 @Bean(name = "stringUtility")
 public StringUtil stringUtil(){
     return new StringUtil();
 }
}
