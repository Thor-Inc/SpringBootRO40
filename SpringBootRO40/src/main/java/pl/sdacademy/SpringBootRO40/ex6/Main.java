package pl.sdacademy.SpringBootRO40.ex6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }


    @Bean
    @ConfigurationProperties
    public BasicAuthAuthorizationInterceptor interceptor() {
        return new BasicAuthAuthorizationInterceptor();
    }

    public static class BasicAuthAuthorizationInterceptor {

        private Map<String, String> customAttributes = new HashMap<String, String>();

        public Map<String, String> getCustomAttributes() {
            return this.customAttributes;
        }
    }
}
