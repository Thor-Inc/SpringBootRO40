package pl.sdacademy.SpringBootRO40.appProps;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppBean implements CommandLineRunner {

    private String dbURL = "";

    @Value("${ana.are.mere.string1}")
    private String value1;

    @Value("${fat.frumos.value2:defaultValue}")
    private String value2;

    @Value("${java.home}")
    private String javaHome;


    @Override
    public void run(String... args) throws Exception {
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(javaHome);
    }
}
